package com.android.volley;

import android.os.Process;
import com.android.volley.Cache;
import com.android.volley.toolbox.DiskBasedCache;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CacheDispatcher extends Thread {

    /* JADX INFO: renamed from: i */
    public static final boolean f34912i = VolleyLog.f34978a;

    /* JADX INFO: renamed from: a */
    public final PriorityBlockingQueue f34913a;

    /* JADX INFO: renamed from: b */
    public final PriorityBlockingQueue f34914b;

    /* JADX INFO: renamed from: c */
    public final DiskBasedCache f34915c;

    /* JADX INFO: renamed from: d */
    public final ExecutorDelivery f34916d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f34917f = false;

    /* JADX INFO: renamed from: g */
    public final WaitingRequestManager f34918g;

    /* JADX INFO: renamed from: com.android.volley.CacheDispatcher$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC24431 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Request f34919a;

        public RunnableC24431(Request request) {
            this.f34919a = request;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                CacheDispatcher.this.f34914b.put(this.f34919a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public CacheDispatcher(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, DiskBasedCache diskBasedCache, ExecutorDelivery executorDelivery) {
        this.f34913a = priorityBlockingQueue;
        this.f34914b = priorityBlockingQueue2;
        this.f34915c = diskBasedCache;
        this.f34916d = executorDelivery;
        this.f34918g = new WaitingRequestManager(this, priorityBlockingQueue2, executorDelivery);
    }

    /* JADX INFO: renamed from: a */
    private void m12789a() {
        Request request = (Request) this.f34913a.take();
        DiskBasedCache diskBasedCache = this.f34915c;
        request.m12793a("cache-queue-take");
        request.m12802k(1);
        try {
            if (request.mo12798f()) {
                request.m12795c("cache-discard-canceled");
                return;
            }
            Cache.Entry entryM12830a = diskBasedCache.m12830a(request.f34943b);
            PriorityBlockingQueue priorityBlockingQueue = this.f34914b;
            WaitingRequestManager waitingRequestManager = this.f34918g;
            if (entryM12830a == null) {
                request.m12793a("cache-miss");
                if (!waitingRequestManager.m12814a(request)) {
                    priorityBlockingQueue.put(request);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (entryM12830a.f34908e < jCurrentTimeMillis) {
                request.m12793a("cache-hit-expired");
                request.f34953q = entryM12830a;
                if (!waitingRequestManager.m12814a(request)) {
                    priorityBlockingQueue.put(request);
                }
                return;
            }
            request.m12793a("cache-hit");
            Response responseMo12801j = request.mo12801j(new NetworkResponse(entryM12830a.f34904a, entryM12830a.f34910g));
            request.m12793a("cache-hit-parsed");
            if (responseMo12801j.f34975c == null) {
                boolean z2 = entryM12830a.f34909f < jCurrentTimeMillis;
                ExecutorDelivery executorDelivery = this.f34916d;
                if (z2) {
                    request.m12793a("cache-hit-refresh-needed");
                    request.f34953q = entryM12830a;
                    responseMo12801j.f34976d = true;
                    if (waitingRequestManager.m12814a(request)) {
                        executorDelivery.m12791b(request, responseMo12801j, null);
                    } else {
                        executorDelivery.m12791b(request, responseMo12801j, new RunnableC24431(request));
                    }
                } else {
                    executorDelivery.m12791b(request, responseMo12801j, null);
                }
                return;
            }
            request.m12793a("cache-parsing-failed");
            String str = request.f34943b;
            synchronized (diskBasedCache) {
                Cache.Entry entryM12830a2 = diskBasedCache.m12830a(str);
                if (entryM12830a2 != null) {
                    entryM12830a2.f34909f = 0L;
                    entryM12830a2.f34908e = 0L;
                    diskBasedCache.m12834f(str, entryM12830a2);
                }
            }
            request.f34953q = null;
            if (!waitingRequestManager.m12814a(request)) {
                priorityBlockingQueue.put(request);
            }
        } finally {
            request.m12802k(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f34912i) {
            VolleyLog.m12811d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f34915c.m12832d();
        while (true) {
            try {
                m12789a();
            } catch (InterruptedException unused) {
                if (this.f34917f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.m12810c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
