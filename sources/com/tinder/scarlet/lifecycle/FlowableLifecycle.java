package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/FlowableLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "Lorg/reactivestreams/Publisher;", "Lcom/tinder/scarlet/Lifecycle$State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class FlowableLifecycle implements Lifecycle, Publisher<Lifecycle.State> {

    /* JADX INFO: renamed from: a */
    public final FlowableOnBackpressureLatest f43477a;

    public FlowableLifecycle(FlowableOnBackpressureLatest flowableOnBackpressureLatest, Scheduler scheduler) {
        Intrinsics.m18599g(scheduler, "scheduler");
        this.f43477a = flowableOnBackpressureLatest;
    }

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        this.f43477a.mo15432g(subscriber);
    }
}
