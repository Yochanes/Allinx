package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ExecutorC0154a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.WithinAppServiceBinder;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;

    @VisibleForTesting
    final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.EnhancedIntentService$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C47351 implements WithinAppServiceBinder.IntentHandler {
        public C47351() {
        }

        @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
        @KeepForSdk
        public Task<Void> handle(Intent intent) {
            return EnhancedIntentService.access$000(EnhancedIntentService.this, intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15223a(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        enhancedIntentService.lambda$processIntent$0(intent, taskCompletionSource);
    }

    public static /* synthetic */ Task access$000(EnhancedIntentService enhancedIntentService, Intent intent) {
        return enhancedIntentService.processIntent(intent);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15224b(EnhancedIntentService enhancedIntentService, Intent intent, Task task) {
        enhancedIntentService.lambda$onStartCommand$1(intent, task);
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private /* synthetic */ void lambda$onStartCommand$1(Intent intent, Task task) {
        finishTask(intent);
    }

    private /* synthetic */ void lambda$processIntent$0(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    @MainThread
    private Task<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new RunnableC4738a(this, intent, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new WithinAppServiceBinder(new C47351());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.addOnCompleteListener(new ExecutorC0154a(1), new C4752o(this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
