package okio;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okio/Buffer$inputStream$1", "Ljava/io/InputStream;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Buffer$inputStream$1 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Buffer f57838a;

    public Buffer$inputStream$1(Buffer buffer) {
        this.f57838a = buffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f57838a.f57830b, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream
    public final int read() {
        Buffer buffer = this.f57838a;
        if (buffer.f57830b > 0) {
            return buffer.m21562C() & UnsignedBytes.MAX_VALUE;
        }
        return -1;
    }

    public final String toString() {
        return this.f57838a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i, int i2) {
        Intrinsics.m18599g(sink, "sink");
        return this.f57838a.read(sink, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
