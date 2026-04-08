package com.tinder.scarlet.internal.connection.subscriber;

import com.tinder.scarlet.Event;
import com.tinder.scarlet.WebSocket;
import io.reactivex.subscribers.DisposableSubscriber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/internal/connection/subscriber/WebSocketEventSubscriber;", "Lio/reactivex/subscribers/DisposableSubscriber;", "Lcom/tinder/scarlet/WebSocket$Event;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class WebSocketEventSubscriber extends DisposableSubscriber<WebSocket.Event> {
    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable) throws Throwable {
        Intrinsics.m18599g(throwable, "throwable");
        throw throwable;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        WebSocket.Event webSocketEvent = (WebSocket.Event) obj;
        Intrinsics.m18599g(webSocketEvent, "webSocketEvent");
        new Event.OnWebSocket.C6455Event(webSocketEvent);
        throw null;
    }
}
