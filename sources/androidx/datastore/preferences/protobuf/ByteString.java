package androidx.datastore.preferences.protobuf;

import androidx.compose.animation.AbstractC0455a;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import com.google.common.primitives.UnsignedBytes;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final ByteString f23857b = new LiteralByteString(Internal.f24004b);

    /* JADX INFO: renamed from: c */
    public static final ByteArrayCopier f23858c;

    /* JADX INFO: renamed from: a */
    public int f23859a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15471 extends AbstractByteIterator {

        /* JADX INFO: renamed from: a */
        public int f23860a = 0;

        /* JADX INFO: renamed from: b */
        public final int f23861b;

        public C15471() {
            this.f23861b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f23860a < this.f23861b;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i = this.f23860a;
            if (i >= this.f23861b) {
                throw new NoSuchElementException();
            }
            this.f23860a = i + 1;
            return ByteString.this.mo8352j(i);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$2 */
    /* JADX INFO: compiled from: Proguard */
    public static class C15482 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ByteIterator byteIteratorMo8354l = byteString3.mo8354l();
            ByteIterator byteIteratorMo8354l2 = byteString4.mo8354l();
            while (byteIteratorMo8354l.hasNext() && byteIteratorMo8354l2.hasNext()) {
                int iCompare = Integer.compare(byteIteratorMo8354l.nextByte() & UnsignedBytes.MAX_VALUE, byteIteratorMo8354l2.nextByte() & UnsignedBytes.MAX_VALUE);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString3.size(), byteString4.size());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BoundedByteString extends LiteralByteString {

        /* JADX INFO: renamed from: f */
        public final int f23863f;

        /* JADX INFO: renamed from: g */
        public final int f23864g;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m8346e(i, i + i2, bArr.length);
            this.f23863f = i;
            this.f23864g = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: c */
        public final byte mo8349c(int i) {
            ByteString.m8345d(i, this.f23864g);
            return this.f23867d[this.f23863f + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: g */
        public final void mo8350g(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f23867d, this.f23863f + i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: j */
        public final byte mo8352j(int i) {
            return this.f23867d[this.f23863f + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.f23864g;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        /* JADX INFO: renamed from: v */
        public final int mo8362v() {
            return this.f23863f;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CodedBuilder {

        /* JADX INFO: renamed from: a */
        public final CodedOutputStream f23865a;

        /* JADX INFO: renamed from: b */
        public final byte[] f23866b;

        public CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.f23866b = bArr;
            Logger logger = CodedOutputStream.f23901b;
            this.f23865a = new CodedOutputStream.ArrayEncoder(bArr, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class LeafByteString extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: i */
        public final int mo8351i() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C15471();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: j */
        public byte mo8352j(int i) {
            return mo8349c(i);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: s */
        public final void mo8361s(ByteOutput byteOutput) {
            mo8360r(byteOutput);
        }

        /* JADX INFO: renamed from: t */
        public abstract boolean mo8363t(ByteString byteString, int i, int i2);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LiteralByteString extends LeafByteString {

        /* JADX INFO: renamed from: d */
        public final byte[] f23867d;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.f23867d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: a */
        public final ByteBuffer mo8348a() {
            return ByteBuffer.wrap(this.f23867d, mo8362v(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: c */
        public byte mo8349c(int i) {
            return this.f23867d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
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
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i = this.f23859a;
            int i2 = literalByteString.f23859a;
            if (i == 0 || i2 == 0 || i == i2) {
                return mo8363t(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: g */
        public void mo8350g(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f23867d, i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: j */
        public byte mo8352j(int i) {
            return this.f23867d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: k */
        public final boolean mo8353k() {
            int iMo8362v = mo8362v();
            return Utf8.f24162a.mo8717f(0, this.f23867d, iMo8362v, size() + iMo8362v) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: m */
        public final int mo8355m(int i, int i2, int i3) {
            int iMo8362v = mo8362v() + i2;
            Charset charset = Internal.f24003a;
            for (int i4 = iMo8362v; i4 < iMo8362v + i3; i4++) {
                i = (i * 31) + this.f23867d[i4];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: n */
        public final int mo8356n(int i, int i2, int i3) {
            int iMo8362v = mo8362v() + i2;
            return Utf8.f24162a.mo8717f(i, this.f23867d, iMo8362v, i3 + iMo8362v);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: o */
        public final ByteString mo8357o(int i, int i2) {
            int iM8346e = ByteString.m8346e(i, i2, size());
            if (iM8346e == 0) {
                return ByteString.f23857b;
            }
            return new BoundedByteString(this.f23867d, mo8362v() + i, iM8346e);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: q */
        public final String mo8359q(Charset charset) {
            return new String(this.f23867d, mo8362v(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: r */
        public final void mo8360r(ByteOutput byteOutput) {
            byteOutput.mo8340h(this.f23867d, mo8362v(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f23867d.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        /* JADX INFO: renamed from: t */
        public final boolean mo8363t(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                StringBuilder sbM24u = AbstractC0000a.m24u("Ran off end of other: ", ", ", ", ", i, i2);
                sbM24u.append(byteString.size());
                throw new IllegalArgumentException(sbM24u.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.mo8357o(i, i3).equals(mo8357o(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            int iMo8362v = mo8362v() + i2;
            int iMo8362v2 = mo8362v();
            int iMo8362v3 = literalByteString.mo8362v() + i;
            while (iMo8362v2 < iMo8362v) {
                if (this.f23867d[iMo8362v2] != literalByteString.f23867d[iMo8362v3]) {
                    return false;
                }
                iMo8362v2++;
                iMo8362v3++;
            }
            return true;
        }

        /* JADX INFO: renamed from: v */
        public int mo8362v() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f23858c = Android.m8304a() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
    }

    /* JADX INFO: renamed from: d */
    public static void m8345d(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0000a.m9f(i, "Index < 0: "));
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m8346e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m10g(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i2, i3, "End index: ", " >= "));
    }

    /* JADX INFO: renamed from: f */
    public static ByteString m8347f(byte[] bArr, int i, int i2) {
        m8346e(i, i + i2, bArr.length);
        return new LiteralByteString(f23858c.copyFrom(bArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public abstract ByteBuffer mo8348a();

    /* JADX INFO: renamed from: c */
    public abstract byte mo8349c(int i);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo8350g(byte[] bArr, int i, int i2, int i3);

    public final int hashCode() {
        int iMo8355m = this.f23859a;
        if (iMo8355m == 0) {
            int size = size();
            iMo8355m = mo8355m(size, 0, size);
            if (iMo8355m == 0) {
                iMo8355m = 1;
            }
            this.f23859a = iMo8355m;
        }
        return iMo8355m;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo8351i();

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return mo8354l();
    }

    /* JADX INFO: renamed from: j */
    public abstract byte mo8352j(int i);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo8353k();

    /* JADX INFO: renamed from: l */
    public ByteIterator mo8354l() {
        return new C15471();
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo8355m(int i, int i2, int i3);

    /* JADX INFO: renamed from: n */
    public abstract int mo8356n(int i, int i2, int i3);

    /* JADX INFO: renamed from: o */
    public abstract ByteString mo8357o(int i, int i2);

    /* JADX INFO: renamed from: p */
    public final byte[] m8358p() {
        int size = size();
        if (size == 0) {
            return Internal.f24004b;
        }
        byte[] bArr = new byte[size];
        mo8350g(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: q */
    public abstract String mo8359q(Charset charset);

    /* JADX INFO: renamed from: r */
    public abstract void mo8360r(ByteOutput byteOutput);

    /* JADX INFO: renamed from: s */
    public abstract void mo8361s(ByteOutput byteOutput);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Output extends OutputStream {
        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, 0);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }
}
