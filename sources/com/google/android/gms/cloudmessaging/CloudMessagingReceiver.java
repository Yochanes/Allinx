package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    @Nullable
    private static SoftReference zza;

    @Nullable
    private static SoftReference zzb;

    /* JADX INFO: compiled from: Proguard */
    public static final class IntentActionKeys {

        @NonNull
        public static final String NOTIFICATION_DISMISS = "com.google.firebase.messaging.NOTIFICATION_DISMISS";

        @NonNull
        public static final String NOTIFICATION_OPEN = "com.google.firebase.messaging.NOTIFICATION_OPEN";

        private IntentActionKeys() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IntentKeys {

        @NonNull
        public static final String PENDING_INTENT = "pending_intent";

        @NonNull
        public static final String WRAPPED_INTENT = "wrapped_intent";

        private IntentKeys() {
        }
    }

    @WorkerThread
    private final int zzb(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(IntentKeys.PENDING_INTENT);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(IntentKeys.PENDING_INTENT);
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), IntentActionKeys.NOTIFICATION_DISMISS)) {
            onNotificationDismissed(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return ServiceStarter.ERROR_UNKNOWN;
    }

    @NonNull
    public Executor getBroadcastExecutor() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = zza;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory("firebase-iid-executor")));
                    zza = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    @WorkerThread
    public abstract int onMessageReceive(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent == null) {
            return;
        }
        getBroadcastExecutor().execute(new zzh(this, intent, context, isOrderedBroadcast(), goAsync()));
    }

    public final /* synthetic */ void zza(Intent intent, Context context, boolean z2, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iZzb;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(IntentKeys.WRAPPED_INTENT);
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iZzb = zzb(context, intent2);
            } else if (intent.getExtras() == null) {
                iZzb = ServiceStarter.ERROR_UNKNOWN;
            } else {
                CloudMessage cloudMessage = new CloudMessage(intent);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (CloudMessagingReceiver.class) {
                    try {
                        SoftReference softReference = zzb;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            com.google.android.gms.internal.cloudmessaging.zze.zza();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            zzb = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } finally {
                    }
                }
                executorUnconfigurableExecutorService.execute(new zzg(context, cloudMessage, countDownLatch));
                int iOnMessageReceive = onMessageReceive(context, cloudMessage);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                }
                iZzb = iOnMessageReceive;
            }
            if (z2 && pendingResult != null) {
                pendingResult.setResultCode(iZzb);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    @WorkerThread
    public void onNotificationDismissed(@NonNull Context context, @NonNull Bundle bundle) {
    }
}
