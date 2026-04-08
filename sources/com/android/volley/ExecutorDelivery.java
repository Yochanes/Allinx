package com.android.volley;

import android.os.Handler;
import com.android.volley.CacheDispatcher;
import com.android.volley.Response;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorDelivery implements ResponseDelivery {

    /* JADX INFO: renamed from: a */
    public final Executor f34925a;

    /* JADX INFO: renamed from: com.android.volley.ExecutorDelivery$1 */
    /* JADX INFO: compiled from: Proguard */
    class ExecutorC24441 implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Handler f34926a;

        public ExecutorC24441(Handler handler) {
            this.f34926a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f34926a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ResponseDeliveryRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Request f34927a;

        /* JADX INFO: renamed from: b */
        public final Response f34928b;

        /* JADX INFO: renamed from: c */
        public final Runnable f34929c;

        public ResponseDeliveryRunnable(Request request, Response response, Runnable runnable) {
            this.f34927a = request;
            this.f34928b = response;
            this.f34929c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Response.ErrorListener errorListener;
            if (this.f34927a.mo12798f()) {
                this.f34927a.m12795c("canceled-at-delivery");
                return;
            }
            Response response = this.f34928b;
            VolleyError volleyError = response.f34975c;
            if (volleyError == null) {
                this.f34927a.mo12794b(response.f34973a);
            } else {
                Request request = this.f34927a;
                synchronized (request.f34945d) {
                    errorListener = request.f34946f;
                }
                if (errorListener != null) {
                    errorListener.mo12806b(volleyError);
                }
            }
            if (this.f34928b.f34976d) {
                this.f34927a.m12793a("intermediate-response");
            } else {
                this.f34927a.m12795c("done");
            }
            Runnable runnable = this.f34929c;
            if (runnable != null) {
                ((CacheDispatcher.RunnableC24431) runnable).run();
            }
        }
    }

    public ExecutorDelivery(Handler handler) {
        this.f34925a = new ExecutorC24441(handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m12790a(Request request, VolleyError volleyError) {
        request.m12793a("post-error");
        Response response = new Response(volleyError);
        ((ExecutorC24441) this.f34925a).execute(new ResponseDeliveryRunnable(request, response, null));
    }

    /* JADX INFO: renamed from: b */
    public final void m12791b(Request request, Response response, Runnable runnable) {
        synchronized (request.f34945d) {
            request.f34951o = true;
        }
        request.m12793a("post-response");
        ((ExecutorC24441) this.f34925a).execute(new ResponseDeliveryRunnable(request, response, runnable));
    }
}
