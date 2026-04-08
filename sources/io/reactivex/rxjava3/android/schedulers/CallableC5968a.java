package io.reactivex.rxjava3.android.schedulers;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.reactivex.rxjava3.android.schedulers.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC5968a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Scheduler scheduler = AndroidSchedulers.f49348a;
        return AndroidSchedulers.MainHolder.f49349a;
    }
}
