package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import java.io.DataInput;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class ByteOrderedDataInputStream extends InputStream implements DataInput {

    /* JADX INFO: renamed from: a */
    public int f2847a;

    static {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int available() {
        throw null;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f2847a++;
        throw null;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f2847a++;
        throw null;
    }

    @Override // java.io.DataInput
    public final byte readByte() throws EOFException {
        int i = this.f2847a + 1;
        this.f2847a = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f2847a += 2;
        throw null;
    }

    @Override // java.io.DataInput
    public final double readDouble() throws EOFException {
        readLong();
        throw null;
    }

    @Override // java.io.DataInput
    public final float readFloat() throws EOFException {
        readInt();
        throw null;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException {
        int i3 = this.f2847a + i2;
        this.f2847a = i3;
        if (i3 <= 0) {
            throw null;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readInt() throws EOFException {
        int i = this.f2847a + 4;
        this.f2847a = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public final long readLong() throws EOFException {
        int i = this.f2847a + 8;
        this.f2847a = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final short readShort() throws EOFException {
        int i = this.f2847a + 2;
        this.f2847a = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f2847a += 2;
        throw null;
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f2847a++;
        throw null;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws EOFException {
        int i = this.f2847a + 2;
        this.f2847a = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        if (Math.min(i, 0 - this.f2847a) > 0) {
            throw null;
        }
        this.f2847a = this.f2847a;
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws EOFException {
        int length = this.f2847a + bArr.length;
        this.f2847a = length;
        if (length > 0) {
            throw new EOFException();
        }
        throw null;
    }
}
