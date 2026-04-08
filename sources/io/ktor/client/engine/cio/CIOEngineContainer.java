package io.ktor.client.engine.cio;

import io.ktor.client.HttpClientEngineContainer;
import io.ktor.util.InternalAPI;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/engine/cio/CIOEngineContainer;", "Lio/ktor/client/HttpClientEngineContainer;", "<init>", "()V", "ktor-client-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CIOEngineContainer implements HttpClientEngineContainer {
    @Override // io.ktor.client.HttpClientEngineContainer
    public final CIO getFactory() {
        return CIO.f44968a;
    }

    public final String toString() {
        return "CIO";
    }
}
