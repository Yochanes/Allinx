package kotlin.p044io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalEncodingApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class DecodeInputStream extends InputStream {
    @Override // java.io.InputStream
    public final int read() throws IOException {
        read(null, 0, 1);
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] destination, int i, int i2) throws IOException {
        Intrinsics.m18599g(destination, "destination");
        if (i >= 0 && i2 >= 0 && i + i2 <= destination.length) {
            throw new IOException("The input stream is closed.");
        }
        StringBuilder sbM24u = AbstractC0000a.m24u("offset: ", ", length: ", ", buffer size: ", i, i2);
        sbM24u.append(destination.length);
        throw new IndexOutOfBoundsException(sbM24u.toString());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
