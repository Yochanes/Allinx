package io.ktor.client.features;

import io.ktor.client.features.HttpTimeout;
import io.ktor.client.request.HttpRequestData;
import io.ktor.network.sockets.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-client-core"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class HttpTimeoutKt {
    /* JADX INFO: renamed from: a */
    public static final SocketTimeoutException m16900a(HttpRequestData request, Throwable th) {
        Object objM16899d;
        Intrinsics.m18599g(request, "request");
        StringBuilder sb = new StringBuilder("Socket timeout has been expired [url=");
        sb.append(request.f45483b);
        sb.append(", socket_timeout=");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.m16925a();
        if (httpTimeoutCapabilityConfiguration == null || (objM16899d = httpTimeoutCapabilityConfiguration.m16899d()) == null) {
            objM16899d = "unknown";
        }
        return new SocketTimeoutException(AbstractC0000a.m18o(sb, objM16899d, "] ms"), th);
    }
}
