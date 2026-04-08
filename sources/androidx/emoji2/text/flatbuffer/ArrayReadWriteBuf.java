package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {

    /* JADX INFO: renamed from: a */
    public byte[] f24354a;

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    /* JADX INFO: renamed from: a */
    public final String mo8819a(int i, int i2) {
        byte[] bArr = this.f24354a;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b2 = bArr[i];
            if (b2 < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b2;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b3 = bArr[i];
            if (b3 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b3;
                while (i5 < i3) {
                    byte b4 = bArr[i5];
                    if (b4 < 0) {
                        break;
                    }
                    i5++;
                    cArr[i6] = (char) b4;
                    i6++;
                }
                i4 = i6;
                i = i5;
            } else {
                if (b3 < -32) {
                    if (i5 >= i3) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i += 2;
                    byte b5 = bArr[i5];
                    int i7 = i4 + 1;
                    if (b3 < -62) {
                        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                    }
                    if (Utf8.DecodeUtil.m8831a(b5)) {
                        throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                    }
                    cArr[i4] = (char) ((b5 & 63) | ((b3 & Ascii.f42546US) << 6));
                    i4 = i7;
                } else {
                    if (b3 >= -16) {
                        if (i5 >= i3 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b6 = bArr[i5];
                        int i8 = i + 3;
                        byte b7 = bArr[i + 2];
                        i += 4;
                        byte b8 = bArr[i8];
                        if (!Utf8.DecodeUtil.m8831a(b6)) {
                            if ((((b6 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && !Utf8.DecodeUtil.m8831a(b7) && !Utf8.DecodeUtil.m8831a(b8)) {
                                int i9 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                cArr[i4] = (char) ((i9 >>> 10) + 55232);
                                cArr[i4 + 1] = (char) ((i9 & 1023) + 56320);
                                i4 += 2;
                            }
                        }
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    if (i5 >= i3 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i10 = i + 2;
                    byte b9 = bArr[i5];
                    i += 3;
                    byte b10 = bArr[i10];
                    int i11 = i4 + 1;
                    if (Utf8.DecodeUtil.m8831a(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || Utf8.DecodeUtil.m8831a(b10)))) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    cArr[i4] = (char) (((b9 & 63) << 6) | ((b3 & Ascii.f42543SI) << 12) | (b10 & 63));
                    i4 = i11;
                }
            }
        }
        return new String(cArr, 0, i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final byte get(int i) {
        return this.f24354a[i];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final int getInt(int i) {
        byte[] bArr = this.f24354a;
        return (bArr[i] & UnsignedBytes.MAX_VALUE) | (bArr[i + 3] << Ascii.CAN) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final long getLong(int i) {
        byte[] bArr = this.f24354a;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return (((long) bArr[i + 7]) << 56) | j | ((255 & ((long) bArr[i + 6])) << 48);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final short getShort(int i) {
        byte[] bArr = this.f24354a;
        return (short) ((bArr[i] & UnsignedBytes.MAX_VALUE) | (bArr[i + 1] << 8));
    }
}
