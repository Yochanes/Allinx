package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class Request<T> implements Comparable<Request<T>> {

    /* JADX INFO: renamed from: a */
    public final VolleyLog.MarkerLog f34942a;

    /* JADX INFO: renamed from: b */
    public final String f34943b;

    /* JADX INFO: renamed from: c */
    public final int f34944c;

    /* JADX INFO: renamed from: d */
    public final Object f34945d;

    /* JADX INFO: renamed from: f */
    public final Response.ErrorListener f34946f;

    /* JADX INFO: renamed from: g */
    public Integer f34947g;

    /* JADX INFO: renamed from: i */
    public RequestQueue f34948i;

    /* JADX INFO: renamed from: j */
    public final boolean f34949j;

    /* JADX INFO: renamed from: n */
    public final boolean f34950n;

    /* JADX INFO: renamed from: o */
    public boolean f34951o;

    /* JADX INFO: renamed from: p */
    public final DefaultRetryPolicy f34952p;

    /* JADX INFO: renamed from: q */
    public Cache.Entry f34953q;

    /* JADX INFO: renamed from: r */
    public WaitingRequestManager f34954r;

    /* JADX INFO: renamed from: com.android.volley.Request$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC24451 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f34955a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f34956b;

        public RunnableC24451(String str, long j) {
            this.f34955a = str;
            this.f34956b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Request request = Request.this;
            request.f34942a.m12812a(this.f34956b, this.f34955a);
            request.f34942a.m12813b(request.toString());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Method {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface NetworkRequestCompleteListener {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Priority {

        /* JADX INFO: renamed from: a */
        public static final Priority f34958a;

        /* JADX INFO: renamed from: b */
        public static final Priority f34959b;

        /* JADX INFO: renamed from: c */
        public static final Priority f34960c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ Priority[] f34961d;

        static {
            Priority priority = new Priority("LOW", 0);
            f34958a = priority;
            Priority priority2 = new Priority("NORMAL", 1);
            f34959b = priority2;
            Priority priority3 = new Priority("HIGH", 2);
            Priority priority4 = new Priority("IMMEDIATE", 3);
            f34960c = priority4;
            f34961d = new Priority[]{priority, priority2, priority3, priority4};
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) f34961d.clone();
        }
    }

    public Request(Response.ErrorListener errorListener) {
        Uri uri;
        String host;
        this.f34942a = VolleyLog.MarkerLog.f34980c ? new VolleyLog.MarkerLog() : null;
        this.f34945d = new Object();
        this.f34949j = true;
        int iHashCode = 0;
        this.f34950n = false;
        this.f34951o = false;
        this.f34953q = null;
        this.f34943b = "https://cdn.livechatinc.com/app/mobile/urls.json";
        this.f34946f = errorListener;
        this.f34952p = new DefaultRetryPolicy(2500, 1, 1.0f);
        if (!TextUtils.isEmpty("https://cdn.livechatinc.com/app/mobile/urls.json") && (uri = Uri.parse("https://cdn.livechatinc.com/app/mobile/urls.json")) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f34944c = iHashCode;
    }

    /* JADX INFO: renamed from: a */
    public final void m12793a(String str) {
        if (VolleyLog.MarkerLog.f34980c) {
            this.f34942a.m12812a(Thread.currentThread().getId(), str);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12794b(Object obj);

    /* JADX INFO: renamed from: c */
    public final void m12795c(String str) {
        RequestQueue requestQueue = this.f34948i;
        if (requestQueue != null) {
            synchronized (requestQueue.f34963b) {
                requestQueue.f34963b.remove(this);
            }
            synchronized (requestQueue.f34971j) {
                try {
                    Iterator it = requestQueue.f34971j.iterator();
                    while (it.hasNext()) {
                        ((RequestQueue.RequestFinishedListener) it.next()).m12805a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            requestQueue.m12803a(this, 5);
        }
        if (VolleyLog.MarkerLog.f34980c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC24451(str, id));
            } else {
                this.f34942a.m12812a(id, str);
                this.f34942a.m12813b(toString());
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Request request = (Request) obj;
        Priority priorityMo12796d = mo12796d();
        Priority priorityMo12796d2 = request.mo12796d();
        return priorityMo12796d == priorityMo12796d2 ? this.f34947g.intValue() - request.f34947g.intValue() : priorityMo12796d2.ordinal() - priorityMo12796d.ordinal();
    }

    /* JADX INFO: renamed from: d */
    public Priority mo12796d() {
        return Priority.f34959b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12797e() {
        boolean z2;
        synchronized (this.f34945d) {
            z2 = this.f34951o;
        }
        return z2;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo12798f() {
        boolean z2;
        synchronized (this.f34945d) {
            z2 = this.f34950n;
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    public final void m12799h() {
        WaitingRequestManager waitingRequestManager;
        synchronized (this.f34945d) {
            waitingRequestManager = this.f34954r;
        }
        if (waitingRequestManager != null) {
            waitingRequestManager.m12815b(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12800i(Response response) {
        WaitingRequestManager waitingRequestManager;
        List list;
        synchronized (this.f34945d) {
            waitingRequestManager = this.f34954r;
        }
        if (waitingRequestManager != null) {
            Cache.Entry entry = response.f34974b;
            if (entry != null) {
                if (entry.f34908e >= System.currentTimeMillis()) {
                    String str = this.f34943b;
                    synchronized (waitingRequestManager) {
                        list = (List) waitingRequestManager.f34986a.remove(str);
                    }
                    if (list != null) {
                        if (VolleyLog.f34978a) {
                            VolleyLog.m12811d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), str);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            waitingRequestManager.f34987b.m12791b((Request) it.next(), response, null);
                        }
                        return;
                    }
                    return;
                }
            }
            waitingRequestManager.m12815b(this);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract Response mo12801j(NetworkResponse networkResponse);

    /* JADX INFO: renamed from: k */
    public final void m12802k(int i) {
        RequestQueue requestQueue = this.f34948i;
        if (requestQueue != null) {
            requestQueue.m12803a(this, i);
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f34944c);
        StringBuilder sb = new StringBuilder();
        sb.append(mo12798f() ? "[X] " : "[ ] ");
        sb.append(this.f34943b);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(mo12796d());
        sb.append(" ");
        sb.append(this.f34947g);
        return sb.toString();
    }
}
