package com.tinder.scarlet.websocket.okhttp;

import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.WebSocket;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocketHolder;", "Lokhttp3/WebSocket;", "scarlet-websocket-okhttp"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class OkHttpWebSocketHolder implements WebSocket {

    /* JADX INFO: renamed from: a */
    public WebSocket f43486a;

    @Override // okhttp3.WebSocket
    public final boolean close(int i, String str) {
        WebSocket webSocket = this.f43486a;
        if (webSocket != null) {
            return webSocket.close(i, str);
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public final Request request() {
        throw new UnsupportedOperationException();
    }

    @Override // okhttp3.WebSocket
    public final boolean send(String str) {
        WebSocket webSocket = this.f43486a;
        if (webSocket != null) {
            return webSocket.send(str);
        }
        return false;
    }
}
