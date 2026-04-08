package com.android.volley.toolbox;

import com.android.volley.AsyncNetwork;
import com.android.volley.RequestTask;
import com.android.volley.toolbox.AsyncHttpStack;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class BasicAsyncNetwork extends AsyncNetwork {

    /* JADX INFO: renamed from: com.android.volley.toolbox.BasicAsyncNetwork$1 */
    /* JADX INFO: compiled from: Proguard */
    class C24531 implements AsyncHttpStack.OnRequestComplete {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    public class InvokeRetryPolicyTask<T> extends RequestTask<T> {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ResponseParsingTask<T> extends RequestTask<T> {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }
}
