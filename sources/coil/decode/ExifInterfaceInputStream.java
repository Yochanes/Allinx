package coil.decode;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/decode/ExifInterfaceInputStream;", "Ljava/io/InputStream;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class ExifInterfaceInputStream extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f33479a;

    /* JADX INFO: renamed from: b */
    public int f33480b = Ints.MAX_POWER_OF_TWO;

    public ExifInterfaceInputStream(InputStream inputStream) {
        this.f33479a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f33480b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33479a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f33479a.read();
        if (i == -1) {
            this.f33480b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f33479a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f33479a.read(bArr);
        if (i == -1) {
            this.f33480b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f33479a.read(bArr, i, i2);
        if (i3 == -1) {
            this.f33480b = 0;
        }
        return i3;
    }
}
