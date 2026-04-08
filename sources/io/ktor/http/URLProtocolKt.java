package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class URLProtocolKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m16991a(URLProtocol isSecure) {
        Intrinsics.m18599g(isSecure, "$this$isSecure");
        String str = isSecure.f45707a;
        return Intrinsics.m18594b(str, "https") || Intrinsics.m18594b(str, "wss");
    }
}
