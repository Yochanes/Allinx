package io.ktor.utils.p043io.streams;

import io.ktor.utils.p043io.core.OutputKt;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/utils/io/streams/StreamsKt$outputStream$1", "Ljava/io/OutputStream;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class StreamsKt$outputStream$1 extends OutputStream {
    @Override // java.io.OutputStream
    public final void write(int i) {
        throw null;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b2, int i, int i2) {
        Intrinsics.m18599g(b2, "b");
        OutputKt.m17499a(null, b2, i, i2);
        throw null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
