package retrofit2;

import java.io.IOException;
import retrofit2.DefaultCallAdapterFactory;

/* JADX INFO: renamed from: retrofit2.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6427a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.C64211 f59476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Callback f59477c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f59478d;

    public /* synthetic */ RunnableC6427a(DefaultCallAdapterFactory.ExecutorCallbackCall.C64211 c64211, Callback callback, Object obj, int i) {
        this.f59475a = i;
        this.f59476b = c64211;
        this.f59477c = callback;
        this.f59478d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59475a) {
            case 0:
                DefaultCallAdapterFactory.ExecutorCallbackCall executorCallbackCall = DefaultCallAdapterFactory.ExecutorCallbackCall.this;
                boolean zIsCanceled = executorCallbackCall.f59304b.isCanceled();
                Callback callback = this.f59477c;
                if (!zIsCanceled) {
                    callback.onResponse(executorCallbackCall, (Response) this.f59478d);
                } else {
                    callback.onFailure(executorCallbackCall, new IOException("Canceled"));
                }
                break;
            default:
                this.f59477c.onFailure(DefaultCallAdapterFactory.ExecutorCallbackCall.this, (Throwable) this.f59478d);
                break;
        }
    }
}
