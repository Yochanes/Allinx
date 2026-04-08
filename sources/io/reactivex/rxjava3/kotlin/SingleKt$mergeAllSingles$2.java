package io.reactivex.rxjava3.kotlin;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lio/reactivex/rxjava3/core/SingleSource;", "T", "kotlin.jvm.PlatformType", "", "it", "Lio/reactivex/rxjava3/core/Single;", "apply"}, m18303k = 3, m18304mv = {1, 4, 0})
final class SingleKt$mergeAllSingles$2<T, R> implements Function<Single<T>, SingleSource<? extends T>> {
    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        return (Single) obj;
    }
}
