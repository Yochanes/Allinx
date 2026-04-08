package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.ExifData;
import androidx.core.util.Preconditions;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ExifOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: i */
    public static final byte[] f2882i = "Exif\u0000\u0000".getBytes(ExifAttribute.f2857d);

    /* JADX INFO: renamed from: a */
    public final ExifData f2883a;

    /* JADX INFO: renamed from: b */
    public final byte[] f2884b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f2885c;

    /* JADX INFO: renamed from: d */
    public int f2886d;

    /* JADX INFO: renamed from: f */
    public int f2887f;

    /* JADX INFO: renamed from: g */
    public int f2888g;

    /* JADX INFO: compiled from: Proguard */
    public static final class JpegHeader {
    }

    public ExifOutputStream(ByteArrayOutputStream byteArrayOutputStream, ExifData exifData) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f2884b = new byte[1];
        this.f2885c = ByteBuffer.allocate(4);
        this.f2886d = 0;
        this.f2883a = exifData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0381, code lost:
    
        if (r5 <= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0383, code lost:
    
        ((java.io.FilterOutputStream) r19).out.write(r20, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0388, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ExifData exifData;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 1;
        int i9 = i;
        int i10 = i2;
        while (true) {
            int i11 = this.f2887f;
            if ((i11 <= 0 && this.f2888g <= 0 && this.f2886d == 2) || i10 <= 0) {
                break;
            }
            if (i11 > 0) {
                int iMin = Math.min(i10, i11);
                i10 -= iMin;
                this.f2887f -= iMin;
                i9 += iMin;
            }
            int i12 = this.f2888g;
            if (i12 > 0) {
                int iMin2 = Math.min(i10, i12);
                ((FilterOutputStream) this).out.write(bArr, i9, iMin2);
                i10 -= iMin2;
                this.f2888g -= iMin2;
                i9 += iMin2;
            }
            if (i10 == 0) {
                return;
            }
            int i13 = this.f2886d;
            int i14 = 0;
            int i15 = 4;
            ByteBuffer byteBuffer = this.f2885c;
            if (i13 != 0) {
                if (i13 == i8) {
                    int iMin3 = Math.min(i10, 4 - byteBuffer.position());
                    byteBuffer.put(bArr, i9, iMin3);
                    i9 += iMin3;
                    i10 -= iMin3;
                    if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                        byteBuffer.rewind();
                    }
                    if (byteBuffer.position() < 4) {
                        return;
                    }
                    byteBuffer.rewind();
                    short s = byteBuffer.getShort();
                    if (s == -31) {
                        this.f2887f = (byteBuffer.getShort() & 65535) - 2;
                        this.f2886d = 2;
                    } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.f2888g = (byteBuffer.getShort() & 65535) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.f2886d = 2;
                    }
                    byteBuffer.rewind();
                }
                i3 = i8;
            } else {
                int iMin4 = Math.min(i10, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i9, iMin4);
                int i16 = i9 + iMin4;
                i10 -= iMin4;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                this.f2886d = i8;
                byteBuffer.rewind();
                OutputStream outputStream = ((FilterOutputStream) this).out;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream);
                byteOrderedDataOutputStream.m1584b((short) -31);
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                ExifTag[] exifTagArr = ExifData.f2863c;
                int i17 = 0;
                while (true) {
                    exifData = this.f2883a;
                    if (i17 >= i15) {
                        break;
                    }
                    ExifTag exifTag = exifTagArr[i17];
                    int i18 = 0;
                    while (true) {
                        ExifTag[] exifTagArr2 = ExifData.f2863c;
                        if (i18 < i15) {
                            exifData.m1598b(i18).remove(exifTag.f2890b);
                            i18 += i8;
                            i15 = 4;
                        }
                    }
                    i17 += i8;
                    i15 = 4;
                }
                boolean zIsEmpty = exifData.m1598b(i8).isEmpty();
                ByteOrder byteOrder2 = exifData.f2867b;
                if (!zIsEmpty) {
                    exifData.m1598b(0).put(ExifData.f2863c[i8].f2890b, ExifAttribute.m1595a(0L, byteOrder2));
                }
                if (!exifData.m1598b(2).isEmpty()) {
                    exifData.m1598b(0).put(ExifData.f2863c[2].f2890b, ExifAttribute.m1595a(0L, byteOrder2));
                }
                if (!exifData.m1598b(3).isEmpty()) {
                    exifData.m1598b(i8).put(ExifData.f2863c[3].f2890b, ExifAttribute.m1595a(0L, byteOrder2));
                }
                int i19 = 0;
                while (true) {
                    ExifTag[] exifTagArr3 = ExifData.f2863c;
                    if (i19 >= 4) {
                        break;
                    }
                    Iterator it = exifData.m1598b(i19).entrySet().iterator();
                    int i20 = i14;
                    while (it.hasNext()) {
                        ExifAttribute exifAttribute = (ExifAttribute) ((Map.Entry) it.next()).getValue();
                        int i21 = ExifAttribute.f2859f[exifAttribute.f2860a] * exifAttribute.f2861b;
                        if (i21 > 4) {
                            i20 += i21;
                        }
                    }
                    iArr2[i19] = iArr2[i19] + i20;
                    i19 += i8;
                    i14 = 0;
                }
                int size = 8;
                int i22 = 0;
                while (true) {
                    ExifTag[] exifTagArr4 = ExifData.f2863c;
                    if (i22 >= 4) {
                        break;
                    }
                    if (!exifData.m1598b(i22).isEmpty()) {
                        iArr[i22] = size;
                        size += (exifData.m1598b(i22).size() * 12) + 6 + iArr2[i22];
                    }
                    i22 += i8;
                }
                int i23 = size + 8;
                if (!exifData.m1598b(i8).isEmpty()) {
                    exifData.m1598b(0).put(ExifData.f2863c[i8].f2890b, ExifAttribute.m1595a(iArr[i8], byteOrder2));
                }
                if (!exifData.m1598b(2).isEmpty()) {
                    exifData.m1598b(0).put(ExifData.f2863c[2].f2890b, ExifAttribute.m1595a(iArr[2], byteOrder2));
                }
                if (!exifData.m1598b(3).isEmpty()) {
                    exifData.m1598b(i8).put(ExifData.f2863c[3].f2890b, ExifAttribute.m1595a(iArr[3], byteOrder2));
                }
                byteOrderedDataOutputStream.m1584b((short) i23);
                byteOrderedDataOutputStream.write(f2882i);
                byteOrderedDataOutputStream.m1584b(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                byteOrderedDataOutputStream.f2849b = byteOrder2;
                byteOrderedDataOutputStream.m1584b((short) 42);
                byteOrderedDataOutputStream.m1583a((int) 8);
                int i24 = 0;
                while (true) {
                    ExifTag[] exifTagArr5 = ExifData.f2863c;
                    if (i24 >= 4) {
                        break;
                    }
                    if (exifData.m1598b(i24).isEmpty()) {
                        i4 = i8;
                        i5 = i16;
                    } else {
                        byteOrderedDataOutputStream.m1584b((short) exifData.m1598b(i24).size());
                        int size2 = (exifData.m1598b(i24).size() * 12) + iArr[i24] + 2 + 4;
                        for (Map.Entry entry : exifData.m1598b(i24).entrySet()) {
                            ExifTag exifTag2 = (ExifTag) ((HashMap) ExifData.Builder.f2873f.get(i24)).get(entry.getKey());
                            Preconditions.m7698e(exifTag2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                            ExifAttribute exifAttribute2 = (ExifAttribute) entry.getValue();
                            int i25 = ExifAttribute.f2859f[exifAttribute2.f2860a];
                            int i26 = exifAttribute2.f2861b;
                            int i27 = i25 * i26;
                            byteOrderedDataOutputStream.m1584b((short) exifTag2.f2889a);
                            byteOrderedDataOutputStream.m1584b((short) exifAttribute2.f2860a);
                            byteOrderedDataOutputStream.m1583a(i26);
                            if (i27 > 4) {
                                i6 = i8;
                                i7 = i16;
                                byteOrderedDataOutputStream.m1583a(size2);
                                size2 += i27;
                            } else {
                                i6 = i8;
                                i7 = i16;
                                byteOrderedDataOutputStream.write(exifAttribute2.f2862c);
                                if (i27 < 4) {
                                    for (int i28 = 4; i27 < i28; i28 = 4) {
                                        byteOrderedDataOutputStream.f2848a.write(0);
                                        i27 += i6;
                                    }
                                }
                            }
                            i16 = i7;
                            i8 = i6;
                        }
                        i4 = i8;
                        i5 = i16;
                        byteOrderedDataOutputStream.m1583a((int) 0);
                        Iterator it2 = exifData.m1598b(i24).entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr2 = ((ExifAttribute) ((Map.Entry) it2.next()).getValue()).f2862c;
                            if (bArr2.length > 4) {
                                byteOrderedDataOutputStream.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i24 += i4;
                    i16 = i5;
                    i8 = i4;
                }
                i3 = i8;
                byteOrderedDataOutputStream.f2849b = ByteOrder.BIG_ENDIAN;
                i9 = i16;
            }
            i8 = i3;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2884b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
