package com.android.volley;

import com.android.volley.AsyncCache;
import com.android.volley.AsyncNetwork;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Comparator;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AsyncRequestQueue extends RequestQueue {

    /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC24351 implements Runnable {

        /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass1 implements AsyncCache.OnWriteCompleteCallback {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$2 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC24362 implements Runnable {

        /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$3 */
    /* JADX INFO: compiled from: Proguard */
    class C24373 implements Comparator<Runnable> {
        @Override // java.util.Comparator
        public final int compare(Runnable runnable, Runnable runnable2) {
            Runnable runnable3 = runnable;
            Runnable runnable4 = runnable2;
            if (!(runnable3 instanceof RequestTask)) {
                return runnable4 instanceof RequestTask ? -1 : 0;
            }
            if (!(runnable4 instanceof RequestTask)) {
                return 1;
            }
            ((RequestTask) runnable3).getClass();
            ((RequestTask) runnable4).getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$Builder$1 */
        /* JADX INFO: compiled from: Proguard */
        class C24381 extends ExecutorFactory {

            /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$Builder$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: Proguard */
            class AnonymousClass1 implements ThreadFactory {
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                    threadNewThread.setName("Volley-" + ((String) null));
                    return threadNewThread;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class CacheParseTask<T> extends RequestTask<T> {

        /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$CacheParseTask$1 */
        /* JADX INFO: compiled from: Proguard */
        class RunnableC24391 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class CachePutTask<T> extends RequestTask<T> {

        /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$CachePutTask$1 */
        /* JADX INFO: compiled from: Proguard */
        class C24401 implements AsyncCache.OnWriteCompleteCallback {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class CacheTask<T> extends RequestTask<T> {

        /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$CacheTask$1 */
        /* JADX INFO: compiled from: Proguard */
        class C24411 implements AsyncCache.OnGetCompleteCallback {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ExecutorFactory {
    }

    /* JADX INFO: compiled from: Proguard */
    public class NetworkParseTask<T> extends RequestTask<T> {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class NetworkTask<T> extends RequestTask<T> {

        /* JADX INFO: renamed from: com.android.volley.AsyncRequestQueue$NetworkTask$1 */
        /* JADX INFO: compiled from: Proguard */
        class C24421 implements AsyncNetwork.OnRequestComplete {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ParseErrorTask<T> extends RequestTask<T> {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ThrowingCache implements Cache {
    }

    @Override // com.android.volley.RequestQueue
    /* JADX INFO: renamed from: b */
    public final void mo12788b(JsonObjectRequest jsonObjectRequest) {
        throw null;
    }
}
