package com.tinder.scarlet.utils;

import com.tinder.scarlet.Stream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/utils/EmptyStreamObserver;", "T", "Lcom/tinder/scarlet/Stream$Observer;", "scarlet-core-internal"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class EmptyStreamObserver<T> implements Stream.Observer<T> {
    @Override // com.tinder.scarlet.Stream.Observer
    public final void onError(Throwable throwable) {
        Intrinsics.m18599g(throwable, "throwable");
    }

    @Override // com.tinder.scarlet.Stream.Observer
    public final void onComplete() {
    }

    @Override // com.tinder.scarlet.Stream.Observer
    public final void onNext(Object obj) {
    }
}
