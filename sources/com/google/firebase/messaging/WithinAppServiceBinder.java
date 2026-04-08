package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.arch.core.executor.ExecutorC0154a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    /* JADX INFO: compiled from: Proguard */
    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15255a(WithinAppServiceConnection.BindRequest bindRequest, Task task) {
        lambda$send$0(bindRequest, task);
    }

    private static /* synthetic */ void lambda$send$0(WithinAppServiceConnection.BindRequest bindRequest, Task task) {
        bindRequest.finish();
    }

    public void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "service received new intent via bind strategy");
        }
        this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new ExecutorC0154a(1), new C4749l(bindRequest, 2));
    }
}
