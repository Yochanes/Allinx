package com.android.volley;

import com.android.volley.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class WaitingRequestManager implements Request.NetworkRequestCompleteListener {

    /* JADX INFO: renamed from: a */
    public final HashMap f34986a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ExecutorDelivery f34987b;

    /* JADX INFO: renamed from: c */
    public final CacheDispatcher f34988c;

    /* JADX INFO: renamed from: d */
    public final PriorityBlockingQueue f34989d;

    public WaitingRequestManager(CacheDispatcher cacheDispatcher, PriorityBlockingQueue priorityBlockingQueue, ExecutorDelivery executorDelivery) {
        this.f34987b = executorDelivery;
        this.f34988c = cacheDispatcher;
        this.f34989d = priorityBlockingQueue;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m12814a(Request request) {
        try {
            String str = request.f34943b;
            if (!this.f34986a.containsKey(str)) {
                this.f34986a.put(str, null);
                synchronized (request.f34945d) {
                    request.f34954r = this;
                }
                if (VolleyLog.f34978a) {
                    VolleyLog.m12809b("new request, sending to network %s", str);
                }
                return false;
            }
            List arrayList = (List) this.f34986a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            request.m12793a("waiting-for-response");
            arrayList.add(request);
            this.f34986a.put(str, arrayList);
            if (VolleyLog.f34978a) {
                VolleyLog.m12809b("Request for cacheKey=%s is in flight, putting on hold.", str);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12815b(Request request) {
        PriorityBlockingQueue priorityBlockingQueue;
        try {
            String str = request.f34943b;
            List list = (List) this.f34986a.remove(str);
            if (list != null && !list.isEmpty()) {
                if (VolleyLog.f34978a) {
                    VolleyLog.m12811d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
                }
                Request request2 = (Request) list.remove(0);
                this.f34986a.put(str, list);
                synchronized (request2.f34945d) {
                    request2.f34954r = this;
                }
                if (this.f34988c != null && (priorityBlockingQueue = this.f34989d) != null) {
                    try {
                        priorityBlockingQueue.put(request2);
                    } catch (InterruptedException e) {
                        VolleyLog.m12810c("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        CacheDispatcher cacheDispatcher = this.f34988c;
                        cacheDispatcher.f34917f = true;
                        cacheDispatcher.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
