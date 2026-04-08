package com.android.volley;

import com.android.volley.Cache;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Response<T> {

    /* JADX INFO: renamed from: a */
    public final Object f34973a;

    /* JADX INFO: renamed from: b */
    public final Cache.Entry f34974b;

    /* JADX INFO: renamed from: c */
    public final VolleyError f34975c;

    /* JADX INFO: renamed from: d */
    public boolean f34976d;

    /* JADX INFO: compiled from: Proguard */
    public interface ErrorListener {
        /* JADX INFO: renamed from: b */
        void mo12806b(VolleyError volleyError);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener<T> {
        /* JADX INFO: renamed from: a */
        void mo12807a(Object obj);
    }

    public Response(Object obj, Cache.Entry entry) {
        this.f34976d = false;
        this.f34973a = obj;
        this.f34974b = entry;
        this.f34975c = null;
    }

    public Response(VolleyError volleyError) {
        this.f34976d = false;
        this.f34973a = null;
        this.f34974b = null;
        this.f34975c = volleyError;
    }
}
