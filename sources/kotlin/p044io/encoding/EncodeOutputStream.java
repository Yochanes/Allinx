package kotlin.p044io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalEncodingApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class EncodeOutputStream extends OutputStream {
    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] source, int i, int i2) throws IOException {
        Intrinsics.m18599g(source, "source");
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
