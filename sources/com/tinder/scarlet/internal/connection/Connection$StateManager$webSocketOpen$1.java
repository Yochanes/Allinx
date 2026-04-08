package com.tinder.scarlet.internal.connection;

import com.tinder.scarlet.Event;
import com.tinder.scarlet.WebSocket;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class Connection$StateManager$webSocketOpen$1 extends Lambda implements Function1<Event.OnWebSocket.C6455Event<?>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Event.OnWebSocket.C6455Event receiver = (Event.OnWebSocket.C6455Event) obj;
        Intrinsics.m18599g(receiver, "$receiver");
        return Boolean.valueOf(receiver.f43448a instanceof WebSocket.Event.OnConnectionOpened);
    }
}
