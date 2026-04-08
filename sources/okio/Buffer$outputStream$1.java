package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okio/Buffer$outputStream$1", "Ljava/io/OutputStream;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Buffer$outputStream$1 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Buffer f57839a;

    public Buffer$outputStream$1(Buffer buffer) {
        this.f57839a = buffer;
    }

    public final String toString() {
        return this.f57839a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f57839a.m21563C0(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) {
        Intrinsics.m18599g(data, "data");
        this.f57839a.m21561B0(data, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
