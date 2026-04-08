package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.Response;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonRequest<T> extends Request<T> {

    /* JADX INFO: renamed from: s */
    public final Object f35018s;

    /* JADX INFO: renamed from: t */
    public final Response.Listener f35019t;

    public JsonRequest(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(errorListener);
        this.f35018s = new Object();
        this.f35019t = listener;
    }

    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: b */
    public final void mo12794b(Object obj) {
        Response.Listener listener;
        synchronized (this.f35018s) {
            listener = this.f35019t;
        }
        if (listener != null) {
            listener.mo12807a(obj);
        }
    }
}
