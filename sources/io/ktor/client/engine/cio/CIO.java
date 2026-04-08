package io.ktor.client.engine.cio;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/engine/cio/CIO;", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "ktor-client-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CIO implements HttpClientEngineFactory<CIOEngineConfig> {

    /* JADX INFO: renamed from: a */
    public static final CIO f44968a = new CIO();

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    /* JADX INFO: renamed from: a */
    public final HttpClientEngine mo16871a(Function1 block) {
        Intrinsics.m18599g(block, "block");
        CIOEngineConfig cIOEngineConfig = new CIOEngineConfig();
        block.invoke(cIOEngineConfig);
        return new CIOEngine(cIOEngineConfig);
    }

    public final String toString() {
        return "CIO";
    }
}
