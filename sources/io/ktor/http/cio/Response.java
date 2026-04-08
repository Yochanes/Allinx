package io.ktor.http.cio;

import io.ktor.http.cio.internals.CharArrayBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/Response;", "Lio/ktor/http/cio/HttpMessage;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class Response extends HttpMessage {

    /* JADX INFO: renamed from: c */
    public final CharSequence f45877c;

    /* JADX INFO: renamed from: d */
    public final int f45878d;

    /* JADX INFO: renamed from: f */
    public final CharSequence f45879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Response(CharSequence version, int i, CharSequence statusText, HttpHeadersMap httpHeadersMap, CharArrayBuilder builder) {
        super(httpHeadersMap, builder);
        Intrinsics.m18599g(version, "version");
        Intrinsics.m18599g(statusText, "statusText");
        Intrinsics.m18599g(builder, "builder");
        this.f45877c = version;
        this.f45878d = i;
        this.f45879f = statusText;
    }
}
