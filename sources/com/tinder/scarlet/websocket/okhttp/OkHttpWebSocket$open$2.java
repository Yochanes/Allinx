package com.tinder.scarlet.websocket.okhttp;

import com.tinder.scarlet.ShutdownReason;
import com.tinder.scarlet.WebSocket;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "p1", "Lcom/tinder/scarlet/WebSocket$Event;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final /* synthetic */ class OkHttpWebSocket$open$2 extends FunctionReferenceImpl implements Function1<WebSocket.Event, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WebSocket.Event p1 = (WebSocket.Event) obj;
        Intrinsics.m18599g(p1, "p1");
        OkHttpWebSocket okHttpWebSocket = (OkHttpWebSocket) this.receiver;
        okHttpWebSocket.getClass();
        if (p1 instanceof WebSocket.Event.OnConnectionOpened) {
            okhttp3.WebSocket webSocket = ((WebSocket.Event.OnConnectionOpened) p1).f43460a;
            throw null;
        }
        if (p1 instanceof WebSocket.Event.OnConnectionClosing) {
            ShutdownReason shutdownReason = ShutdownReason.f43453c;
            synchronized (okHttpWebSocket) {
                Intrinsics.m18599g(shutdownReason, "shutdownReason");
                int i = shutdownReason.f43454a;
                throw null;
            }
        }
        if (!(p1 instanceof WebSocket.Event.OnConnectionClosed) && !(p1 instanceof WebSocket.Event.OnConnectionFailed)) {
            return Unit.f51459a;
        }
        synchronized (okHttpWebSocket) {
            throw null;
        }
    }
}
