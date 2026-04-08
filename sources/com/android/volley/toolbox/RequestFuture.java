package com.android.volley.toolbox;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class RequestFuture<T> implements Future<T>, Response.Listener<T>, Response.ErrorListener {

    /* JADX INFO: renamed from: a */
    public Object f35026a;

    /* JADX INFO: renamed from: b */
    public VolleyError f35027b;

    @Override // com.android.volley.Response.Listener
    /* JADX INFO: renamed from: a */
    public final synchronized void mo12807a(Object obj) {
        this.f35026a = obj;
        notifyAll();
    }

    @Override // com.android.volley.Response.ErrorListener
    /* JADX INFO: renamed from: b */
    public final synchronized void mo12806b(VolleyError volleyError) {
        this.f35027b = volleyError;
        notifyAll();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Object m12848c(Long l) {
        if (this.f35027b != null) {
            throw new ExecutionException(this.f35027b);
        }
        return this.f35026a;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z2) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return m12848c(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return m12848c(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
