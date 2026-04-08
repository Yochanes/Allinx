package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends ByteString {

    /* JADX INFO: renamed from: d */
    public final int f24088d;

    /* JADX INFO: renamed from: f */
    public final ByteString f24089f;

    /* JADX INFO: renamed from: g */
    public final ByteString f24090g;

    /* JADX INFO: renamed from: i */
    public final int f24091i;

    /* JADX INFO: renamed from: j */
    public final int f24092j;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.RopeByteString$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15841 extends ByteString.AbstractByteIterator {

        /* JADX INFO: renamed from: a */
        public final PieceIterator f24093a;

        /* JADX INFO: renamed from: b */
        public ByteString.ByteIterator f24094b = m8584a();

        public C15841(RopeByteString ropeByteString) {
            this.f24093a = new PieceIterator(ropeByteString);
        }

        /* JADX INFO: renamed from: a */
        public final ByteString.ByteIterator m8584a() {
            PieceIterator pieceIterator = this.f24093a;
            if (pieceIterator.hasNext()) {
                return new ByteString.C15471();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24094b != null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f24094b;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.f24094b.hasNext()) {
                this.f24094b = m8584a();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Balancer {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque f24095a;

        /* JADX INFO: renamed from: b */
        public ByteString.LeafByteString f24096b;

        public PieceIterator(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f24095a = null;
                this.f24096b = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.f24092j);
            this.f24095a = arrayDeque;
            arrayDeque.push(ropeByteString);
            ByteString byteString2 = ropeByteString.f24089f;
            while (byteString2 instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                this.f24095a.push(ropeByteString2);
                byteString2 = ropeByteString2.f24089f;
            }
            this.f24096b = (ByteString.LeafByteString) byteString2;
        }

        /* JADX INFO: renamed from: a */
        public final ByteString.LeafByteString m8585a() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.f24096b;
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque arrayDeque = this.f24095a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString = ((RopeByteString) arrayDeque.pop()).f24090g;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    arrayDeque.push(ropeByteString);
                    byteString = ropeByteString.f24089f;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            } while (leafByteString.size() == 0);
            this.f24096b = leafByteString;
            return leafByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24096b != null;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ ByteString.LeafByteString next() {
            return m8585a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f24089f = byteString;
        this.f24090g = byteString2;
        int size = byteString.size();
        this.f24091i = size;
        this.f24088d = byteString2.size() + size;
        this.f24092j = Math.max(byteString.mo8351i(), byteString2.mo8351i()) + 1;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo8348a() {
        return ByteBuffer.wrap(m8358p()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: c */
    public final byte mo8349c(int i) {
        ByteString.m8345d(i, this.f24088d);
        return mo8352j(i);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.f24088d;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.f23859a;
                int i3 = byteString.f23859a;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    PieceIterator pieceIterator = new PieceIterator(this);
                    ByteString.LeafByteString leafByteStringM8585a = pieceIterator.m8585a();
                    PieceIterator pieceIterator2 = new PieceIterator(byteString);
                    ByteString.LeafByteString leafByteStringM8585a2 = pieceIterator2.m8585a();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int size2 = leafByteStringM8585a.size() - i4;
                        int size3 = leafByteStringM8585a2.size() - i5;
                        int iMin = Math.min(size2, size3);
                        if (!(i4 == 0 ? leafByteStringM8585a.mo8363t(leafByteStringM8585a2, i5, iMin) : leafByteStringM8585a2.mo8363t(leafByteStringM8585a, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            i4 = 0;
                            leafByteStringM8585a = pieceIterator.m8585a();
                        } else {
                            i4 += iMin;
                            leafByteStringM8585a = leafByteStringM8585a;
                        }
                        if (iMin == size3) {
                            leafByteStringM8585a2 = pieceIterator2.m8585a();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: g */
    public final void mo8350g(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.f24089f;
        int i5 = this.f24091i;
        if (i4 <= i5) {
            byteString.mo8350g(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.f24090g;
        if (i >= i5) {
            byteString2.mo8350g(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.mo8350g(bArr, i, i2, i6);
        byteString2.mo8350g(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: i */
    public final int mo8351i() {
        return this.f24092j;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new C15841(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: j */
    public final byte mo8352j(int i) {
        int i2 = this.f24091i;
        return i < i2 ? this.f24089f.mo8352j(i) : this.f24090g.mo8352j(i - i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: k */
    public final boolean mo8353k() {
        int iMo8356n = this.f24089f.mo8356n(0, 0, this.f24091i);
        ByteString byteString = this.f24090g;
        return byteString.mo8356n(iMo8356n, 0, byteString.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public final ByteString.ByteIterator mo8354l() {
        return new C15841(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final int mo8355m(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f24089f;
        int i5 = this.f24091i;
        if (i4 <= i5) {
            return byteString.mo8355m(i, i2, i3);
        }
        ByteString byteString2 = this.f24090g;
        if (i2 >= i5) {
            return byteString2.mo8355m(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.mo8355m(byteString.mo8355m(i, i2, i6), 0, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: n */
    public final int mo8356n(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f24089f;
        int i5 = this.f24091i;
        if (i4 <= i5) {
            return byteString.mo8356n(i, i2, i3);
        }
        ByteString byteString2 = this.f24090g;
        if (i2 >= i5) {
            return byteString2.mo8356n(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.mo8356n(byteString.mo8356n(i, i2, i6), 0, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public final ByteString mo8357o(int i, int i2) {
        int i3 = this.f24088d;
        int iM8346e = ByteString.m8346e(i, i2, i3);
        if (iM8346e == 0) {
            return ByteString.f23857b;
        }
        if (iM8346e == i3) {
            return this;
        }
        ByteString byteString = this.f24089f;
        int i4 = this.f24091i;
        if (i2 <= i4) {
            return byteString.mo8357o(i, i2);
        }
        ByteString byteString2 = this.f24090g;
        return i >= i4 ? byteString2.mo8357o(i - i4, i2 - i4) : new RopeByteString(byteString.mo8357o(i, byteString.size()), byteString2.mo8357o(0, i2 - i4));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: q */
    public final String mo8359q(Charset charset) {
        return new String(m8358p(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public final void mo8360r(ByteOutput byteOutput) {
        this.f24089f.mo8360r(byteOutput);
        this.f24090g.mo8360r(byteOutput);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: s */
    public final void mo8361s(ByteOutput byteOutput) {
        this.f24090g.mo8361s(byteOutput);
        this.f24089f.mo8361s(byteOutput);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.f24088d;
    }

    /* JADX INFO: compiled from: Proguard */
    public class RopeInputStream extends InputStream {

        /* JADX INFO: renamed from: a */
        public PieceIterator f24097a;

        /* JADX INFO: renamed from: b */
        public ByteString.LeafByteString f24098b;

        /* JADX INFO: renamed from: c */
        public int f24099c;

        /* JADX INFO: renamed from: d */
        public int f24100d;

        /* JADX INFO: renamed from: f */
        public int f24101f;

        /* JADX INFO: renamed from: g */
        public int f24102g;

        /* JADX INFO: renamed from: a */
        public final void m8586a() {
            if (this.f24098b != null) {
                int i = this.f24100d;
                int i2 = this.f24099c;
                if (i == i2) {
                    this.f24101f += i2;
                    this.f24100d = 0;
                    if (!this.f24097a.hasNext()) {
                        this.f24098b = null;
                        this.f24099c = 0;
                    } else {
                        ByteString.LeafByteString leafByteStringM8585a = this.f24097a.m8585a();
                        this.f24098b = leafByteStringM8585a;
                        this.f24099c = leafByteStringM8585a.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public final int m8587b(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m8586a();
                if (this.f24098b != null) {
                    int iMin = Math.min(this.f24099c - this.f24100d, i3);
                    if (bArr != null) {
                        ByteString.LeafByteString leafByteString = this.f24098b;
                        int i4 = this.f24100d;
                        ByteString.m8346e(i4, i4 + iMin, leafByteString.size());
                        int i5 = i + iMin;
                        ByteString.m8346e(i, i5, bArr.length);
                        if (iMin > 0) {
                            leafByteString.mo8350g(bArr, i4, i, iMin);
                        }
                        i = i5;
                    }
                    this.f24100d += iMin;
                    i3 -= iMin;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.f24102g = this.f24101f + this.f24100d;
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
            return m8587b(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
            this.f24097a = pieceIterator;
            ByteString.LeafByteString leafByteStringM8585a = pieceIterator.m8585a();
            this.f24098b = leafByteStringM8585a;
            this.f24099c = leafByteStringM8585a.size();
            this.f24100d = 0;
            this.f24101f = 0;
            m8587b(null, 0, this.f24102g);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return m8587b(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public final int read() {
            m8586a();
            ByteString.LeafByteString leafByteString = this.f24098b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f24100d;
            this.f24100d = i + 1;
            return leafByteString.mo8349c(i) & UnsignedBytes.MAX_VALUE;
        }
    }
}
