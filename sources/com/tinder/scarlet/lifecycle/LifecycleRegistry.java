package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "Lcom/tinder/scarlet/Lifecycle;", "Lorg/reactivestreams/Subscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "LifecycleStateSubscriber", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class LifecycleRegistry implements Lifecycle, Subscriber<Lifecycle.State> {

    /* JADX INFO: renamed from: a */
    public final PublishProcessor f43478a;

    /* JADX INFO: renamed from: b */
    public final BehaviorProcessor f43479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowableLifecycle f43480c;

    /* JADX INFO: renamed from: com.tinder.scarlet.lifecycle.LifecycleRegistry$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "p1", "Lcom/tinder/scarlet/Lifecycle$State;", "p2", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final /* synthetic */ class C50601 extends FunctionReferenceImpl implements Function2<Lifecycle.State, Lifecycle.State, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C50601 f43481a = new C50601(2, LifecycleStateUtilsKt.class, "isEquivalentTo", "isEquivalentTo(Lcom/tinder/scarlet/Lifecycle$State;Lcom/tinder/scarlet/Lifecycle$State;)Z", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Lifecycle.State p1 = (Lifecycle.State) obj;
            Lifecycle.State p2 = (Lifecycle.State) obj2;
            Intrinsics.m18599g(p1, "p1");
            Intrinsics.m18599g(p2, "p2");
            return Boolean.valueOf(LifecycleStateUtilsKt.m15434a(p1, p2));
        }
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.lifecycle.LifecycleRegistry$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "Lorg/reactivestreams/Publisher;", "Lcom/tinder/scarlet/Lifecycle$State;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/Flowable;", "apply"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50612<Upstream, Downstream> implements FlowableTransformer<Lifecycle.State, Lifecycle.State> {
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.lifecycle.LifecycleRegistry$3 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "p1", "Lcom/tinder/scarlet/Lifecycle$State;", "p2", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final /* synthetic */ class C50623 extends FunctionReferenceImpl implements Function2<Lifecycle.State, Lifecycle.State, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C50623 f43482a = new C50623(2, LifecycleStateUtilsKt.class, "isEquivalentTo", "isEquivalentTo(Lcom/tinder/scarlet/Lifecycle$State;Lcom/tinder/scarlet/Lifecycle$State;)Z", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Lifecycle.State p1 = (Lifecycle.State) obj;
            Lifecycle.State p2 = (Lifecycle.State) obj2;
            Intrinsics.m18599g(p1, "p1");
            Intrinsics.m18599g(p2, "p2");
            return Boolean.valueOf(LifecycleStateUtilsKt.m15434a(p1, p2));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/LifecycleRegistry$LifecycleStateSubscriber;", "Lio/reactivex/subscribers/DisposableSubscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public final class LifecycleStateSubscriber extends DisposableSubscriber<Lifecycle.State> {
        public LifecycleStateSubscriber() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw new IllegalStateException("Stream is terminated");
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable throwable) {
            Intrinsics.m18599g(throwable, "throwable");
            throw new IllegalStateException("Stream is terminated", throwable);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Lifecycle.State state = (Lifecycle.State) obj;
            Intrinsics.m18599g(state, "state");
            LifecycleRegistry lifecycleRegistry = LifecycleRegistry.this;
            lifecycleRegistry.f43479b.onNext(state);
            if (state.equals(Lifecycle.State.Destroyed.f43449a)) {
                lifecycleRegistry.f43479b.onComplete();
                dispose();
            }
        }
    }

    public LifecycleRegistry() {
        Scheduler scheduler = Schedulers.f51357b;
        Intrinsics.m18598f(scheduler, "Schedulers.computation()");
        PublishProcessor publishProcessor = new PublishProcessor();
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.f43480c = new FlowableLifecycle(new FlowableOnBackpressureLatest(behaviorProcessor), scheduler);
        this.f43478a = publishProcessor;
        this.f43479b = behaviorProcessor;
        Flowable flowableM17581a = Flowable.m17581a(new FlowableDistinctUntilChanged(new FlowableOnBackpressureLatest(publishProcessor), new LifecycleRegistry$sam$io_reactivex_functions_BiPredicate$0(C50601.f43481a)));
        LifecycleRegistry$sam$io_reactivex_functions_BiPredicate$0 lifecycleRegistry$sam$io_reactivex_functions_BiPredicate$0 = new LifecycleRegistry$sam$io_reactivex_functions_BiPredicate$0(C50623.f43482a);
        flowableM17581a.getClass();
        new FlowableDistinctUntilChanged(flowableM17581a, lifecycleRegistry$sam$io_reactivex_functions_BiPredicate$0).m17582b(new LifecycleStateSubscriber());
    }

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        this.f43480c.mo15432g(subscriber);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        this.f43478a.mo12367j(subscription);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f43478a.onNext(Lifecycle.State.Destroyed.f43449a);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f43478a.onNext(Lifecycle.State.Destroyed.f43449a);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        this.f43478a.onNext((Lifecycle.State) obj);
    }
}
