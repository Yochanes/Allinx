package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import kotlin.Metadata;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/DefaultLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DefaultLifecycle implements Lifecycle {

    /* JADX INFO: renamed from: a */
    public final LifecycleRegistry f43476a;

    public DefaultLifecycle() {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry();
        this.f43476a = lifecycleRegistry;
        lifecycleRegistry.f43478a.onNext(Lifecycle.State.Started.f43450a);
    }

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        this.f43476a.mo15432g(subscriber);
    }
}
