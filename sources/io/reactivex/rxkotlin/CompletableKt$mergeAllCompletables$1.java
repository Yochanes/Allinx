package io.reactivex.rxkotlin;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 2}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "apply"}, m18303k = 3, m18304mv = {1, 1, 8})
final class CompletableKt$mergeAllCompletables$1<T, R> implements Function<Completable, CompletableSource> {
    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        Completable it = (Completable) obj;
        Intrinsics.m18600h(it, "it");
        return it;
    }
}
