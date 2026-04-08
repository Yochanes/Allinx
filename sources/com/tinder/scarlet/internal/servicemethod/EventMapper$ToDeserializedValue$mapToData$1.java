package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.Deserialization;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "T", "", "it", "Lcom/tinder/scarlet/Deserialization;", "test"}, m18303k = 3, m18304mv = {1, 4, 2})
final class EventMapper$ToDeserializedValue$mapToData$1<T> implements Predicate<Deserialization<T>> {
    @Override // io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        Deserialization it = (Deserialization) obj;
        Intrinsics.m18599g(it, "it");
        return it instanceof Deserialization.Success;
    }
}
