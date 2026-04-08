package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.Event;
import com.tinder.scarlet.WebSocket;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/scarlet/WebSocket$Event;", "kotlin.jvm.PlatformType", "T", "", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "apply"}, m18303k = 3, m18304mv = {1, 4, 2})
final class EventMapper$ToWebSocketEvent$mapToData$1<T, R> implements Function<Event.OnWebSocket.C6455Event<?>, WebSocket.Event> {

    /* JADX INFO: renamed from: a */
    public static final EventMapper$ToWebSocketEvent$mapToData$1 f43475a = new EventMapper$ToWebSocketEvent$mapToData$1();

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        Event.OnWebSocket.C6455Event it = (Event.OnWebSocket.C6455Event) obj;
        Intrinsics.m18599g(it, "it");
        return it.f43448a;
    }
}
