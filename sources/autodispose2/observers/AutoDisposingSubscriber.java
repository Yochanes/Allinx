package autodispose2.observers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface AutoDisposingSubscriber<T> extends FlowableSubscriber<T>, Subscription, Disposable {
}
