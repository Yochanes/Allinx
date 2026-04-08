package io.ktor.client.engine;

import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface HttpClientEngineFactory<T extends HttpClientEngineConfig> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    HttpClientEngine mo16871a(Function1 function1);
}
