package io.ktor.http.cio;

import io.ktor.http.cio.internals.CharArrayBuilder;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/cio/HttpMessage;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class HttpMessage implements Closeable {

    /* JADX INFO: renamed from: a */
    public final HttpHeadersMap f45807a;

    /* JADX INFO: renamed from: b */
    public final CharArrayBuilder f45808b;

    public HttpMessage(HttpHeadersMap httpHeadersMap, CharArrayBuilder builder) {
        Intrinsics.m18599g(builder, "builder");
        this.f45807a = httpHeadersMap;
        this.f45808b = builder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45808b.m17036e();
        this.f45807a.m17010d();
    }
}
