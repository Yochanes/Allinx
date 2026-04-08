package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ByteOrderedDataOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public final OutputStream f2848a;

    /* JADX INFO: renamed from: b */
    public ByteOrder f2849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteOrderedDataOutputStream(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f2848a = outputStream;
        this.f2849b = byteOrder;
    }

    /* JADX INFO: renamed from: a */
    public final void m1583a(int i) throws IOException {
        ByteOrder byteOrder = this.f2849b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f2848a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i >>> 24) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write(i & 255);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1584b(short s) throws IOException {
        ByteOrder byteOrder = this.f2849b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f2848a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s & 255);
            outputStream.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s >>> 8) & 255);
            outputStream.write(s & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f2848a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f2848a.write(bArr, i, i2);
    }
}
