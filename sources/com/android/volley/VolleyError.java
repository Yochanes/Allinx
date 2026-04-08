package com.android.volley;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class VolleyError extends Exception {

    /* JADX INFO: renamed from: a */
    public final NetworkResponse f34977a;

    public VolleyError() {
        this.f34977a = null;
    }

    public VolleyError(NetworkResponse networkResponse) {
        this.f34977a = networkResponse;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f34977a = null;
    }
}
