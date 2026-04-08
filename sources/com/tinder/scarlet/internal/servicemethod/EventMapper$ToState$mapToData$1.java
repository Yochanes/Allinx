package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.Event;
import com.tinder.scarlet.State;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/scarlet/State;", "kotlin.jvm.PlatformType", "T", "", "it", "Lcom/tinder/scarlet/Event$OnStateChange;", "apply"}, m18303k = 3, m18304mv = {1, 4, 2})
final class EventMapper$ToState$mapToData$1<T, R> implements Function<Event.OnStateChange<?>, State> {

    /* JADX INFO: renamed from: a */
    public static final EventMapper$ToState$mapToData$1 f43473a = new EventMapper$ToState$mapToData$1();

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        Event.OnStateChange it = (Event.OnStateChange) obj;
        Intrinsics.m18599g(it, "it");
        throw null;
    }
}
