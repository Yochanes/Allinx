package io.ktor.client.engine;

import io.ktor.client.features.HttpTimeout;
import io.ktor.util.AttributeKey;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-client-core"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class HttpClientEngineCapabilityKt {

    /* JADX INFO: renamed from: a */
    public static final AttributeKey f44957a = new AttributeKey("EngineCapabilities");

    /* JADX INFO: renamed from: b */
    public static final Set f44958b = SetsKt.m18503g(HttpTimeout.f45289e);
}
