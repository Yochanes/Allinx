package kotlin.reflect.jvm.internal.impl.protobuf;

import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte> {

    /* JADX INFO: renamed from: a */
    public static final ByteString f54075a = new LiteralByteString(new byte[0]);

    /* JADX INFO: compiled from: Proguard */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m19622a(Iterator it, int i) {
        if (i == 1) {
            return (ByteString) it.next();
        }
        int i2 = i >>> 1;
        return m19622a(it, i2).m19625c(m19622a(it, i - i2));
    }

    /* JADX INFO: renamed from: d */
    public static ByteString m19623d(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* JADX INFO: renamed from: l */
    public static Output m19624l() {
        return new Output();
    }

    /* JADX INFO: renamed from: c */
    public final ByteString m19625c(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = RopeByteString.f54132j;
        RopeByteString ropeByteString = this instanceof RopeByteString ? (RopeByteString) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = byteString.size();
            byte[] bArr = new byte[size4 + size5];
            m19626e(bArr, 0, 0, size4);
            byteString.m19626e(bArr, 0, size4, size5);
            return new LiteralByteString(bArr);
        }
        if (ropeByteString != null) {
            ByteString byteString2 = ropeByteString.f54135d;
            if (byteString.size() + byteString2.size() < 128) {
                int size6 = byteString2.size();
                int size7 = byteString.size();
                byte[] bArr2 = new byte[size6 + size7];
                byteString2.m19626e(bArr2, 0, 0, size6);
                byteString.m19626e(bArr2, 0, size6, size7);
                return new RopeByteString(ropeByteString.f54134c, new LiteralByteString(bArr2));
            }
        }
        if (ropeByteString != null) {
            ByteString byteString3 = ropeByteString.f54134c;
            int iMo19627g = byteString3.mo19627g();
            ByteString byteString4 = ropeByteString.f54135d;
            if (iMo19627g > byteString4.mo19627g()) {
                if (ropeByteString.f54137g > byteString.mo19627g()) {
                    return new RopeByteString(byteString3, new RopeByteString(byteString4, byteString));
                }
            }
        }
        if (size3 >= RopeByteString.f54132j[Math.max(mo19627g(), byteString.mo19627g()) + 1]) {
            return new RopeByteString(this, byteString);
        }
        RopeByteString.Balancer balancer = new RopeByteString.Balancer();
        balancer.m19714a(this);
        balancer.m19714a(byteString);
        Stack stack = balancer.f54139a;
        ByteString ropeByteString2 = (ByteString) stack.pop();
        while (!stack.isEmpty()) {
            ropeByteString2 = new RopeByteString((ByteString) stack.pop(), ropeByteString2);
        }
        return ropeByteString2;
    }

    /* JADX INFO: renamed from: e */
    public final void m19626e(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(30, i, "Source offset < 0: "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(30, i2, "Target offset < 0: "));
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(23, i3, "Length < 0: "));
        }
        int i4 = i + i3;
        if (i4 > size()) {
            throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(34, i4, "Source end offset < 0: "));
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(34, i5, "Target end offset < 0: "));
        }
        if (i3 > 0) {
            mo19618f(bArr, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo19618f(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: g */
    public abstract int mo19627g();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo19628i();

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return mo19619k();
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo19629j();

    /* JADX INFO: renamed from: k */
    public abstract ByteIterator mo19619k();

    /* JADX INFO: renamed from: m */
    public abstract int mo19630m(int i, int i2, int i3);

    /* JADX INFO: renamed from: n */
    public abstract int mo19631n(int i, int i2, int i3);

    /* JADX INFO: renamed from: o */
    public abstract int mo19632o();

    /* JADX INFO: renamed from: p */
    public abstract String mo19633p();

    /* JADX INFO: renamed from: q */
    public final String m19634q() {
        try {
            return mo19633p();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo19635r(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: g */
        public static final byte[] f54076g = new byte[0];

        /* JADX INFO: renamed from: c */
        public int f54079c;

        /* JADX INFO: renamed from: f */
        public int f54081f;

        /* JADX INFO: renamed from: a */
        public final int f54077a = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;

        /* JADX INFO: renamed from: b */
        public final ArrayList f54078b = new ArrayList();

        /* JADX INFO: renamed from: d */
        public byte[] f54080d = new byte[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];

        /* JADX INFO: renamed from: a */
        public final void m19636a(int i) {
            this.f54078b.add(new LiteralByteString(this.f54080d));
            int length = this.f54079c + this.f54080d.length;
            this.f54079c = length;
            this.f54080d = new byte[Math.max(this.f54077a, Math.max(i, length >>> 1))];
            this.f54081f = 0;
        }

        /* JADX INFO: renamed from: b */
        public final void m19637b() {
            int i = this.f54081f;
            byte[] bArr = this.f54080d;
            int length = bArr.length;
            ArrayList arrayList = this.f54078b;
            if (i >= length) {
                arrayList.add(new LiteralByteString(this.f54080d));
                this.f54080d = f54076g;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                arrayList.add(new LiteralByteString(bArr2));
            }
            this.f54079c += this.f54081f;
            this.f54081f = 0;
        }

        /* JADX INFO: renamed from: d */
        public final synchronized ByteString m19638d() {
            ArrayList arrayList;
            m19637b();
            arrayList = this.f54078b;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((ByteString) it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? ByteString.f54075a : ByteString.m19622a(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.f54079c + this.f54081f;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            try {
                if (this.f54081f == this.f54080d.length) {
                    m19636a(1);
                }
                byte[] bArr = this.f54080d;
                int i2 = this.f54081f;
                this.f54081f = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f54080d;
                int length = bArr2.length;
                int i3 = this.f54081f;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f54081f += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    m19636a(i4);
                    System.arraycopy(bArr, i + length2, this.f54080d, 0, i4);
                    this.f54081f = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
