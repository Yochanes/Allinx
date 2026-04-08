package io.reactivex.rxjava3.android;

import android.os.Looper;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MainThreadDisposable implements Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f49347a = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public abstract void mo12369a();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f49347a.get();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f49347a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo12369a();
            } else {
                AndroidSchedulers.m17919a().mo17936c(new RunnableC0015a(this, 0));
            }
        }
    }
}
