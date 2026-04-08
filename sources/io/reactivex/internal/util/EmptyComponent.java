package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, Subscription, Disposable {

    /* JADX INFO: renamed from: a */
    public static final EmptyComponent f49273a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EmptyComponent[] f49274b;

    static {
        EmptyComponent emptyComponent = new EmptyComponent("INSTANCE", 0);
        f49273a = emptyComponent;
        f49274b = new EmptyComponent[]{emptyComponent};
    }

    public static EmptyComponent valueOf(String str) {
        return (EmptyComponent) Enum.valueOf(EmptyComponent.class, str);
    }

    public static EmptyComponent[] values() {
        return (EmptyComponent[]) f49274b.clone();
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.m17911b(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
