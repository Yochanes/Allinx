package io.ktor.client.features.websocket;

import io.ktor.client.call.HttpClientCall;
import io.ktor.http.cio.websocket.DefaultWebSocketSession;
import io.ktor.http.cio.websocket.Frame;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/features/websocket/DefaultClientWebSocketSession;", "Lio/ktor/client/features/websocket/ClientWebSocketSession;", "Lio/ktor/http/cio/websocket/DefaultWebSocketSession;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DefaultClientWebSocketSession implements ClientWebSocketSession, DefaultWebSocketSession {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DefaultWebSocketSession f45444a;

    public DefaultClientWebSocketSession(HttpClientCall call, DefaultWebSocketSession defaultWebSocketSession) {
        Intrinsics.m18599g(call, "call");
        this.f45444a = defaultWebSocketSession;
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final Object flush(Continuation continuation) {
        return this.f45444a.flush(continuation);
    }

    @Override // io.ktor.http.cio.websocket.DefaultWebSocketSession
    public final Deferred getCloseReason() {
        return this.f45444a.getCloseReason();
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession, kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF56316a() {
        return this.f45444a.getF56316a();
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final List getExtensions() {
        return this.f45444a.getExtensions();
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final ReceiveChannel getIncoming() {
        return this.f45444a.getIncoming();
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final boolean getMasking() {
        return this.f45444a.getMasking();
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return this.f45444a.getMaxFrameSize();
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final SendChannel getOutgoing() {
        return this.f45444a.getOutgoing();
    }

    @Override // io.ktor.http.cio.websocket.DefaultWebSocketSession
    public final long getPingIntervalMillis() {
        return this.f45444a.getPingIntervalMillis();
    }

    @Override // io.ktor.http.cio.websocket.DefaultWebSocketSession
    public final long getTimeoutMillis() {
        return this.f45444a.getTimeoutMillis();
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final Object send(Frame frame, Continuation continuation) {
        return this.f45444a.send(frame, continuation);
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final void setMasking(boolean z2) {
        this.f45444a.setMasking(z2);
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        this.f45444a.setMaxFrameSize(j);
    }

    @Override // io.ktor.http.cio.websocket.DefaultWebSocketSession
    public final void setPingIntervalMillis(long j) {
        this.f45444a.setPingIntervalMillis(j);
    }

    @Override // io.ktor.http.cio.websocket.DefaultWebSocketSession
    public final void setTimeoutMillis(long j) {
        this.f45444a.setTimeoutMillis(j);
    }

    @Override // io.ktor.http.cio.websocket.DefaultWebSocketSession
    public final void start(List negotiatedExtensions) {
        Intrinsics.m18599g(negotiatedExtensions, "negotiatedExtensions");
        this.f45444a.start(negotiatedExtensions);
    }

    @Override // io.ktor.http.cio.websocket.WebSocketSession
    public final void terminate() {
        this.f45444a.terminate();
    }
}
