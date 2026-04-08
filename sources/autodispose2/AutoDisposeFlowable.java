package autodispose2;

import io.reactivex.rxjava3.core.Flowable;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposeFlowable<T> extends Flowable<T> implements FlowableSubscribeProxy<T> {
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new AutoDisposingSubscriberImpl(subscriber);
        throw null;
    }
}
