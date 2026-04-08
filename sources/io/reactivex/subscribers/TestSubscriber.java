package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, Subscription, Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        Thread.currentThread();
        subscription.getClass();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // org.reactivestreams.Subscriber
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onComplete() {
        Thread.currentThread();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // org.reactivestreams.Subscriber
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(Throwable th) {
        Thread.currentThread();
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        Thread.currentThread();
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.m17868b(null, null, j);
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class EmptySubscriber implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ EmptySubscriber[] f51403a = {new EmptySubscriber("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        EmptySubscriber EF5;

        public static EmptySubscriber valueOf(String str) {
            return (EmptySubscriber) Enum.valueOf(EmptySubscriber.class, str);
        }

        public static EmptySubscriber[] values() {
            return (EmptySubscriber[]) f51403a.clone();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }
}
