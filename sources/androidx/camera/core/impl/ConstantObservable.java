package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ConstantObservable<T> implements Observable<T> {

    /* JADX INFO: renamed from: b */
    public static final ConstantObservable f2688b = new ConstantObservable(null);

    /* JADX INFO: renamed from: a */
    public final ListenableFuture f2689a;

    public ConstantObservable(Object obj) {
        this.f2689a = Futures.m1630g(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    /* JADX INFO: renamed from: b */
    public final void mo1475b(Executor executor, Observable.Observer observer) {
        this.f2689a.addListener(new RunnableC0279e(2, this, observer), executor);
    }

    /* JADX INFO: renamed from: c */
    public final ListenableFuture m1476c() {
        return this.f2689a;
    }

    @Override // androidx.camera.core.impl.Observable
    /* JADX INFO: renamed from: a */
    public final void mo1474a(Observable.Observer observer) {
    }
}
