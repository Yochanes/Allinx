package io.ktor.client.engine.cio;

import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.network.tls.TLSConfigBuilder;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/engine/cio/CIOEngineConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "ktor-client-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CIOEngineConfig extends HttpClientEngineConfig {

    /* JADX INFO: renamed from: a */
    public final EndpointConfig f44996a = new EndpointConfig();

    /* JADX INFO: renamed from: b */
    public final TLSConfigBuilder f44997b = new TLSConfigBuilder();

    /* JADX INFO: renamed from: c */
    public final int f44998c = 1000;

    /* JADX INFO: renamed from: d */
    public final long f44999d = 15000;
}
