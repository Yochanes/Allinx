package autodispose2;

import io.reactivex.rxjava3.core.CompletableConverter;
import io.reactivex.rxjava3.core.FlowableConverter;
import io.reactivex.rxjava3.core.MaybeConverter;
import io.reactivex.rxjava3.core.ObservableConverter;
import io.reactivex.rxjava3.core.SingleConverter;
import io.reactivex.rxjava3.parallel.ParallelFlowableConverter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface AutoDisposeConverter<T> extends FlowableConverter<T, FlowableSubscribeProxy<T>>, ParallelFlowableConverter<T, ParallelFlowableSubscribeProxy<T>>, ObservableConverter<T, ObservableSubscribeProxy<T>>, MaybeConverter<T, MaybeSubscribeProxy<T>>, SingleConverter<T, SingleSubscribeProxy<T>>, CompletableConverter<CompletableSubscribeProxy> {
}
