package com.exchange.allin.net.p023ws;

import io.reactivex.rxjava3.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class RxWebSocketKt$of$1<T> implements Predicate {
    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        Response it = (Response) obj;
        Intrinsics.m18599g(it, "it");
        return false;
    }
}
