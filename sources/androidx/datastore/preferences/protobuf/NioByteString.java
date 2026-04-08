package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Utf8;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class NioByteString extends ByteString.LeafByteString {

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f24069d;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.NioByteString$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15811 extends InputStream {
        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw null;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw null;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    public NioByteString(ByteBuffer byteBuffer) {
        Charset charset = Internal.f24003a;
        this.f24069d = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo8348a() {
        return this.f24069d.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: c */
    public final byte mo8349c(int i) {
        try {
            return this.f24069d.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.f24069d;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? byteBuffer.equals(((NioByteString) obj).f24069d) : obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.mo8348a());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: g */
    public final void mo8350g(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.f24069d.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: k */
    public final boolean mo8353k() {
        Utf8.Processor processor = Utf8.f24162a;
        ByteBuffer byteBuffer = this.f24069d;
        return Utf8.f24162a.m8716e(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final int mo8355m(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f24069d.get(i4);
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: n */
    public final int mo8356n(int i, int i2, int i3) {
        return Utf8.f24162a.m8716e(i, this.f24069d, i2, i3 + i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public final ByteString mo8357o(int i, int i2) {
        try {
            return new NioByteString(m8581v(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: q */
    public final String mo8359q(Charset charset) {
        byte[] bArrM8358p;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f24069d;
        if (byteBuffer.hasArray()) {
            bArrM8358p = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            bArrM8358p = m8358p();
            length = bArrM8358p.length;
            iPosition = 0;
        }
        return new String(bArrM8358p, iPosition, length, charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public final void mo8360r(ByteOutput byteOutput) {
        byteOutput.mo8339g(this.f24069d.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.f24069d.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
    /* JADX INFO: renamed from: t */
    public final boolean mo8363t(ByteString byteString, int i, int i2) {
        return mo8357o(0, i2).equals(byteString.mo8357o(i, i2 + i));
    }

    /* JADX INFO: renamed from: v */
    public final ByteBuffer m8581v(int i, int i2) {
        ByteBuffer byteBuffer = this.f24069d;
        if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i - byteBuffer.position());
        byteBufferSlice.limit(i2 - byteBuffer.position());
        return byteBufferSlice;
    }
}
