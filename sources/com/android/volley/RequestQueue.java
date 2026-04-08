package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.JsonObjectRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class RequestQueue {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f34962a;

    /* JADX INFO: renamed from: b */
    public final HashSet f34963b;

    /* JADX INFO: renamed from: c */
    public final PriorityBlockingQueue f34964c;

    /* JADX INFO: renamed from: d */
    public final PriorityBlockingQueue f34965d;

    /* JADX INFO: renamed from: e */
    public final DiskBasedCache f34966e;

    /* JADX INFO: renamed from: f */
    public final BasicNetwork f34967f;

    /* JADX INFO: renamed from: g */
    public final ExecutorDelivery f34968g;

    /* JADX INFO: renamed from: h */
    public final NetworkDispatcher[] f34969h;

    /* JADX INFO: renamed from: i */
    public CacheDispatcher f34970i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f34971j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f34972k;

    /* JADX INFO: renamed from: com.android.volley.RequestQueue$1 */
    /* JADX INFO: compiled from: Proguard */
    class C24461 implements RequestFilter {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestEvent {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RequestEventListener {
        /* JADX INFO: renamed from: a */
        void m12804a();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RequestFilter {
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public interface RequestFinishedListener<T> {
        /* JADX INFO: renamed from: a */
        void m12805a();
    }

    public RequestQueue(DiskBasedCache diskBasedCache, BasicNetwork basicNetwork) {
        ExecutorDelivery executorDelivery = new ExecutorDelivery(new Handler(Looper.getMainLooper()));
        this.f34962a = new AtomicInteger();
        this.f34963b = new HashSet();
        this.f34964c = new PriorityBlockingQueue();
        this.f34965d = new PriorityBlockingQueue();
        this.f34971j = new ArrayList();
        this.f34972k = new ArrayList();
        this.f34966e = diskBasedCache;
        this.f34967f = basicNetwork;
        this.f34969h = new NetworkDispatcher[4];
        this.f34968g = executorDelivery;
    }

    /* JADX INFO: renamed from: a */
    public final void m12803a(Request request, int i) {
        synchronized (this.f34972k) {
            try {
                Iterator it = this.f34972k.iterator();
                while (it.hasNext()) {
                    ((RequestEventListener) it.next()).m12804a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo12788b(JsonObjectRequest jsonObjectRequest) {
        this.f34965d.add(jsonObjectRequest);
    }
}
