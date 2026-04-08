package com.android.volley.toolbox;

import com.android.volley.Request;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncHttpStack extends BaseHttpStack {

    /* JADX INFO: renamed from: com.android.volley.toolbox.AsyncHttpStack$1 */
    /* JADX INFO: compiled from: Proguard */
    class C24521 implements OnRequestComplete {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnRequestComplete {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Response {
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    /* JADX INFO: renamed from: a */
    public final HttpResponse mo12817a(Request request, Map map) {
        new CountDownLatch(1);
        new AtomicReference();
        mo12816b(request, new C24521());
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12816b(Request request, OnRequestComplete onRequestComplete);
}
