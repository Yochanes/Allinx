package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class LiteralByteString extends ByteString {

    /* JADX INFO: renamed from: b */
    public final byte[] f54127b;

    /* JADX INFO: renamed from: c */
    public int f54128c = 0;

    /* JADX INFO: compiled from: Proguard */
    public class LiteralByteIterator implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public int f54129a = 0;

        /* JADX INFO: renamed from: b */
        public final int f54130b;

        public LiteralByteIterator() {
            this.f54130b = LiteralByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f54129a < this.f54130b;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            try {
                byte[] bArr = LiteralByteString.this.f54127b;
                int i = this.f54129a;
                this.f54129a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public LiteralByteString(byte[] bArr) {
        this.f54127b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof LiteralByteString) {
            return m19713t((LiteralByteString) obj, 0, size());
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AbstractC0000a.m19p(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: f */
    public void mo19618f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f54127b, i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: g */
    public final int mo19627g() {
        return 0;
    }

    public final int hashCode() {
        int iMo19630m = this.f54128c;
        if (iMo19630m == 0) {
            int size = size();
            iMo19630m = mo19630m(size, 0, size);
            if (iMo19630m == 0) {
                iMo19630m = 1;
            }
            this.f54128c = iMo19630m;
        }
        return iMo19630m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: i */
    public final boolean mo19628i() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return mo19619k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: j */
    public final boolean mo19629j() {
        int iMo19621v = mo19621v();
        return Utf8.m19728c(this.f54127b, iMo19621v, size() + iMo19621v) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: k */
    public ByteString.ByteIterator mo19619k() {
        return new LiteralByteIterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final int mo19630m(int i, int i2, int i3) {
        int iMo19621v = mo19621v() + i2;
        for (int i4 = iMo19621v; i4 < iMo19621v + i3; i4++) {
            i = (i * 31) + this.f54127b[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r9[r0] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r9[r0] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0097, code lost:
    
        if (r9[r8] > (-65)) goto L59;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19631n(int i, int i2, int i3) {
        byte b2;
        int i4;
        int i5;
        int iMo19621v = mo19621v() + i2;
        int i6 = i3 + iMo19621v;
        byte[] bArr = this.f54127b;
        if (i != 0) {
            if (iMo19621v >= i6) {
                return i;
            }
            byte b3 = (byte) i;
            if (b3 < -32) {
                if (b3 >= -62) {
                    i5 = iMo19621v + 1;
                }
                return -1;
            }
            if (b3 < -16) {
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    int i7 = iMo19621v + 1;
                    byte b5 = bArr[iMo19621v];
                    if (i7 >= i6) {
                        return Utf8.m19726a(b3, b5);
                    }
                    iMo19621v = i7;
                    b4 = b5;
                }
                if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                    i5 = iMo19621v + 1;
                }
            } else {
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    i4 = iMo19621v + 1;
                    b6 = bArr[iMo19621v];
                    if (i4 >= i6) {
                        return Utf8.m19726a(b3, b6);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i >> 16);
                    i4 = iMo19621v;
                }
                if (b2 == 0) {
                    int i8 = i4 + 1;
                    byte b7 = bArr[i4];
                    if (i8 >= i6) {
                        if (b3 > -12 || b6 > -65 || b7 > -65) {
                            return -1;
                        }
                        return (b7 << Ascii.DLE) ^ ((b6 << 8) ^ b3);
                    }
                    b2 = b7;
                    i4 = i8;
                }
                if (b6 <= -65) {
                    if ((((b6 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && b2 <= -65) {
                        iMo19621v = i4 + 1;
                    }
                }
            }
            return -1;
        }
        return Utf8.m19728c(bArr, iMo19621v, i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public final int mo19632o() {
        return this.f54128c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public final String mo19633p() {
        return new String(this.f54127b, mo19621v(), size(), "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public final void mo19635r(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f54127b, mo19621v() + i, i2);
    }

    /* JADX INFO: renamed from: s */
    public byte mo19620s(int i) {
        return this.f54127b[i];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f54127b.length;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m19713t(LiteralByteString literalByteString, int i, int i2) {
        if (i2 > literalByteString.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= literalByteString.size()) {
            int iMo19621v = mo19621v() + i2;
            int iMo19621v2 = mo19621v();
            int iMo19621v3 = literalByteString.mo19621v() + i;
            while (iMo19621v2 < iMo19621v) {
                if (this.f54127b[iMo19621v2] != literalByteString.f54127b[iMo19621v3]) {
                    return false;
                }
                iMo19621v2++;
                iMo19621v3++;
            }
            return true;
        }
        int size2 = literalByteString.size();
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: v */
    public int mo19621v() {
        return 0;
    }
}
