package com.tinder.scarlet.websocket.okhttp;

import com.tinder.scarlet.WebSocket;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket;", "Lcom/tinder/scarlet/WebSocket;", "ConnectionEstablisher", "Factory", "scarlet-websocket-okhttp"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class OkHttpWebSocket implements WebSocket {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$ConnectionEstablisher;", "", "scarlet-websocket-okhttp"}, m18303k = 1, m18304mv = {1, 4, 2})
    public interface ConnectionEstablisher {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/websocket/okhttp/OkHttpWebSocket$Factory;", "Lcom/tinder/scarlet/WebSocket$Factory;", "scarlet-websocket-okhttp"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Factory implements WebSocket.Factory {
    }
}
