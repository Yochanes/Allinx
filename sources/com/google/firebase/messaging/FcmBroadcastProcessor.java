package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ExecutorC0154a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.C4639a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";

    @GuardedBy
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = new ExecutorC0154a(1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m15225a(Context context, Intent intent, boolean z2, Task task) {
        return lambda$startMessagingService$2(context, intent, z2, task);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m15226b(Context context, Intent intent) {
        return lambda$startMessagingService$0(context, intent);
    }

    private static Task<Integer> bindToMessagingService(Context context, Intent intent, boolean z2) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Binding to service");
        }
        WithinAppServiceConnection serviceConnection = getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z2) {
            return serviceConnection.sendIntent(intent).continueWith(new ExecutorC0154a(1), new C4639a(4));
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return Tasks.forResult(-1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m15227c(Task task) {
        return lambda$bindToMessagingService$3(task);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m15228d(Task task) {
        return lambda$startMessagingService$1(task);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            try {
                if (fcmServiceConn == null) {
                    fcmServiceConn = new WithinAppServiceConnection(context, str);
                }
                withinAppServiceConnection = fcmServiceConn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return withinAppServiceConnection;
    }

    private static /* synthetic */ Integer lambda$bindToMessagingService$3(Task task) {
        return -1;
    }

    private static /* synthetic */ Integer lambda$startMessagingService$0(Context context, Intent intent) {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context, intent));
    }

    private static /* synthetic */ Integer lambda$startMessagingService$1(Task task) {
        return 403;
    }

    private static /* synthetic */ Task lambda$startMessagingService$2(Context context, Intent intent, boolean z2, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? bindToMessagingService(context, intent, z2).continueWith(new ExecutorC0154a(1), new C4639a(3)) : task;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    @VisibleForTesting
    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> startMessagingService(Context context, Intent intent) {
        boolean z2 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z3 = (intent.getFlags() & 268435456) != 0;
        return (!z2 || z3) ? Tasks.call(this.executor, new CallableC4739b(context, intent)).continueWithTask(this.executor, new C4740c(context, intent, z3)) : bindToMessagingService(context, intent, z3);
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }
}
