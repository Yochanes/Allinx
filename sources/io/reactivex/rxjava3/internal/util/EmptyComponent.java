package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, Subscription, Disposable {

    /* JADX INFO: renamed from: a */
    public static final EmptyComponent f51222a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EmptyComponent[] f51223b;

    static {
        EmptyComponent emptyComponent = new EmptyComponent("INSTANCE", 0);
        f51222a = emptyComponent;
        f51223b = new EmptyComponent[]{emptyComponent};
    }

    public static EmptyComponent valueOf(String str) {
        return (EmptyComponent) Enum.valueOf(EmptyComponent.class, str);
    }

    public static EmptyComponent[] values() {
        return (EmptyComponent[]) f51223b.clone();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.m18275b(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
