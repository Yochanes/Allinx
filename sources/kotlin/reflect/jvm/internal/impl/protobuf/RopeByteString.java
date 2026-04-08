package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class RopeByteString extends ByteString {

    /* JADX INFO: renamed from: j */
    public static final int[] f54132j;

    /* JADX INFO: renamed from: b */
    public final int f54133b;

    /* JADX INFO: renamed from: c */
    public final ByteString f54134c;

    /* JADX INFO: renamed from: d */
    public final ByteString f54135d;

    /* JADX INFO: renamed from: f */
    public final int f54136f;

    /* JADX INFO: renamed from: g */
    public final int f54137g;

    /* JADX INFO: renamed from: i */
    public int f54138i = 0;

    /* JADX INFO: compiled from: Proguard */
    public static class Balancer {

        /* JADX INFO: renamed from: a */
        public final Stack f54139a = new Stack();

        /* JADX INFO: renamed from: a */
        public final void m19714a(ByteString byteString) {
            if (!byteString.mo19628i()) {
                if (!(byteString instanceof RopeByteString)) {
                    String strValueOf = String.valueOf(byteString.getClass());
                    throw new IllegalArgumentException(AbstractC0000a.m19p(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                m19714a(ropeByteString.f54134c);
                m19714a(ropeByteString.f54135d);
                return;
            }
            int size = byteString.size();
            int[] iArr = RopeByteString.f54132j;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i = iArr[iBinarySearch + 1];
            Stack stack = this.f54139a;
            if (stack.isEmpty() || ((ByteString) stack.peek()).size() >= i) {
                stack.push(byteString);
                return;
            }
            int i2 = iArr[iBinarySearch];
            ByteString ropeByteString2 = (ByteString) stack.pop();
            while (!stack.isEmpty() && ((ByteString) stack.peek()).size() < i2) {
                ropeByteString2 = new RopeByteString((ByteString) stack.pop(), ropeByteString2);
            }
            RopeByteString ropeByteString3 = new RopeByteString(ropeByteString2, byteString);
            while (!stack.isEmpty()) {
                int[] iArr2 = RopeByteString.f54132j;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, ropeByteString3.f54133b);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (((ByteString) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    ropeByteString3 = new RopeByteString((ByteString) stack.pop(), ropeByteString3);
                }
            }
            stack.push(ropeByteString3);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PieceIterator implements Iterator<LiteralByteString> {

        /* JADX INFO: renamed from: a */
        public final Stack f54140a = new Stack();

        /* JADX INFO: renamed from: b */
        public LiteralByteString f54141b;

        public PieceIterator(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f54140a.push(ropeByteString);
                byteString = ropeByteString.f54134c;
            }
            this.f54141b = (LiteralByteString) byteString;
        }

        /* JADX INFO: renamed from: a */
        public final LiteralByteString m19715a() {
            LiteralByteString literalByteString;
            LiteralByteString literalByteString2 = this.f54141b;
            if (literalByteString2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                Stack stack = this.f54140a;
                if (!stack.isEmpty()) {
                    ByteString byteString = ((RopeByteString) stack.pop()).f54135d;
                    while (byteString instanceof RopeByteString) {
                        RopeByteString ropeByteString = (RopeByteString) byteString;
                        stack.push(ropeByteString);
                        byteString = ropeByteString.f54134c;
                    }
                    literalByteString = (LiteralByteString) byteString;
                    if (literalByteString.size() != 0) {
                        break;
                    }
                } else {
                    literalByteString = null;
                    break;
                }
            }
            this.f54141b = literalByteString;
            return literalByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f54141b != null;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ LiteralByteString next() {
            return m19715a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class RopeByteIterator implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public final PieceIterator f54142a;

        /* JADX INFO: renamed from: b */
        public ByteString.ByteIterator f54143b;

        /* JADX INFO: renamed from: c */
        public int f54144c;

        public RopeByteIterator(RopeByteString ropeByteString) {
            PieceIterator pieceIterator = new PieceIterator(ropeByteString);
            this.f54142a = pieceIterator;
            this.f54143b = pieceIterator.m19715a().mo19619k();
            this.f54144c = ropeByteString.f54133b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f54144c > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            if (!this.f54143b.hasNext()) {
                this.f54143b = this.f54142a.m19715a().mo19619k();
            }
            this.f54144c--;
            return this.f54143b.nextByte();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f54132j = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f54132j;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f54134c = byteString;
        this.f54135d = byteString2;
        int size = byteString.size();
        this.f54136f = size;
        this.f54133b = byteString2.size() + size;
        this.f54137g = Math.max(byteString.mo19627g(), byteString2.mo19627g()) + 1;
    }

    public final boolean equals(Object obj) {
        int iMo19632o;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.f54133b;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f54138i == 0 || (iMo19632o = byteString.mo19632o()) == 0 || this.f54138i == iMo19632o) {
                    PieceIterator pieceIterator = new PieceIterator(this);
                    LiteralByteString literalByteStringM19715a = pieceIterator.m19715a();
                    PieceIterator pieceIterator2 = new PieceIterator(byteString);
                    LiteralByteString literalByteStringM19715a2 = pieceIterator2.m19715a();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int size2 = literalByteStringM19715a.size() - i2;
                        int size3 = literalByteStringM19715a2.size() - i3;
                        int iMin = Math.min(size2, size3);
                        if (!(i2 == 0 ? literalByteStringM19715a.m19713t(literalByteStringM19715a2, i3, iMin) : literalByteStringM19715a2.m19713t(literalByteStringM19715a, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            literalByteStringM19715a = pieceIterator.m19715a();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == size3) {
                            literalByteStringM19715a2 = pieceIterator2.m19715a();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: f */
    public final void mo19618f(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.f54134c;
        int i5 = this.f54136f;
        if (i4 <= i5) {
            byteString.mo19618f(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.f54135d;
        if (i >= i5) {
            byteString2.mo19618f(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.mo19618f(bArr, i, i2, i6);
        byteString2.mo19618f(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: g */
    public final int mo19627g() {
        return this.f54137g;
    }

    public final int hashCode() {
        int iMo19630m = this.f54138i;
        if (iMo19630m == 0) {
            int i = this.f54133b;
            iMo19630m = mo19630m(i, 0, i);
            if (iMo19630m == 0) {
                iMo19630m = 1;
            }
            this.f54138i = iMo19630m;
        }
        return iMo19630m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: i */
    public final boolean mo19628i() {
        return this.f54133b >= f54132j[this.f54137g];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new RopeByteIterator(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: j */
    public final boolean mo19629j() {
        int iMo19631n = this.f54134c.mo19631n(0, 0, this.f54136f);
        ByteString byteString = this.f54135d;
        return byteString.mo19631n(iMo19631n, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: k */
    public final ByteString.ByteIterator mo19619k() {
        return new RopeByteIterator(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final int mo19630m(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f54134c;
        int i5 = this.f54136f;
        if (i4 <= i5) {
            return byteString.mo19630m(i, i2, i3);
        }
        ByteString byteString2 = this.f54135d;
        if (i2 >= i5) {
            return byteString2.mo19630m(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.mo19630m(byteString.mo19630m(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: n */
    public final int mo19631n(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f54134c;
        int i5 = this.f54136f;
        if (i4 <= i5) {
            return byteString.mo19631n(i, i2, i3);
        }
        ByteString byteString2 = this.f54135d;
        if (i2 >= i5) {
            return byteString2.mo19631n(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.mo19631n(byteString.mo19631n(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public final int mo19632o() {
        return this.f54138i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public final String mo19633p() {
        byte[] bArr;
        int i = this.f54133b;
        if (i == 0) {
            bArr = Internal.f54120a;
        } else {
            byte[] bArr2 = new byte[i];
            mo19618f(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public final void mo19635r(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ByteString byteString = this.f54134c;
        int i4 = this.f54136f;
        if (i3 <= i4) {
            byteString.mo19635r(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.f54135d;
        if (i >= i4) {
            byteString2.mo19635r(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.mo19635r(outputStream, i, i5);
        byteString2.mo19635r(outputStream, 0, i2 - i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        return this.f54133b;
    }

    /* JADX INFO: compiled from: Proguard */
    public class RopeInputStream extends InputStream {

        /* JADX INFO: renamed from: a */
        public PieceIterator f54145a;

        /* JADX INFO: renamed from: b */
        public LiteralByteString f54146b;

        /* JADX INFO: renamed from: c */
        public int f54147c;

        /* JADX INFO: renamed from: d */
        public int f54148d;

        /* JADX INFO: renamed from: f */
        public int f54149f;

        /* JADX INFO: renamed from: g */
        public int f54150g;

        /* JADX INFO: renamed from: a */
        public final void m19716a() {
            if (this.f54146b != null) {
                int i = this.f54148d;
                int i2 = this.f54147c;
                if (i == i2) {
                    this.f54149f += i2;
                    this.f54148d = 0;
                    if (!this.f54145a.hasNext()) {
                        this.f54146b = null;
                        this.f54147c = 0;
                    } else {
                        LiteralByteString literalByteStringM19715a = this.f54145a.m19715a();
                        this.f54146b = literalByteStringM19715a;
                        this.f54147c = literalByteStringM19715a.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public final int m19717b(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m19716a();
                if (this.f54146b != null) {
                    int iMin = Math.min(this.f54147c - this.f54148d, i3);
                    if (bArr != null) {
                        this.f54146b.m19626e(bArr, this.f54148d, i, iMin);
                        i += iMin;
                    }
                    this.f54148d += iMin;
                    i3 -= iMin;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.f54150g = this.f54149f + this.f54148d;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            return m19717b(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
            this.f54145a = pieceIterator;
            LiteralByteString literalByteStringM19715a = pieceIterator.m19715a();
            this.f54146b = literalByteStringM19715a;
            this.f54147c = literalByteStringM19715a.size();
            this.f54148d = 0;
            this.f54149f = 0;
            m19717b(null, 0, this.f54150g);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return m19717b(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public final int read() {
            m19716a();
            LiteralByteString literalByteString = this.f54146b;
            if (literalByteString == null) {
                return -1;
            }
            int i = this.f54148d;
            this.f54148d = i + 1;
            return literalByteString.mo19620s(i) & UnsignedBytes.MAX_VALUE;
        }
    }
}
