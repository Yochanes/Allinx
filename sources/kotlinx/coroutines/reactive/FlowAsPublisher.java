package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/reactive/FlowAsPublisher;", "", "T", "Lorg/reactivestreams/Publisher;", "kotlinx-coroutines-reactive"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class FlowAsPublisher<T> implements Publisher<T> {
    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        subscriber.getClass();
        subscriber.mo12367j(new FlowSubscription(subscriber));
    }
}
