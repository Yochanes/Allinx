package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.core.impl.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0280f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2838c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2839d;

    public /* synthetic */ RunnableC0280f(Object obj, int i, Object obj2, Object obj3) {
        this.f2836a = i;
        this.f2837b = obj;
        this.f2838c = obj2;
        this.f2839d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2836a) {
            case 0:
                MutableLiveData mutableLiveData = ((LiveDataObservable) this.f2837b).f2742a;
                LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter = (LiveDataObservable.LiveDataObserverAdapter) this.f2838c;
                if (liveDataObserverAdapter != null) {
                    mutableLiveData.m9146j(liveDataObserverAdapter);
                }
                mutableLiveData.m9143f((LiveDataObservable.LiveDataObserverAdapter) this.f2839d);
                break;
            default:
                ((Executor) this.f2837b).execute(new RunnableC0279e(4, (ListenableFuture) this.f2838c, (CallbackToFutureAdapter.Completer) this.f2839d));
                break;
        }
    }
}
