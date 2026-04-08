package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class RequestDeduplicator {
    private final Executor executor;

    @GuardedBy
    private final Map<String, Task<String>> getTokenRequests = new ArrayMap(0);

    /* JADX INFO: compiled from: Proguard */
    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m15251a(RequestDeduplicator requestDeduplicator, String str, Task task) {
        return requestDeduplicator.lambda$getOrStartGetTokenRequest$0(str, task);
    }

    private /* synthetic */ Task lambda$getOrStartGetTokenRequest$0(String str, Task task) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }

    public synchronized Task<String> getOrStartGetTokenRequest(String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.getTokenRequests.get(str);
        if (task != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Making new request for: " + str);
        }
        Task taskContinueWithTask = getTokenRequest.start().continueWithTask(this.executor, new C4752o(this, str));
        this.getTokenRequests.put(str, (Task<String>) taskContinueWithTask);
        return taskContinueWithTask;
    }
}
