package kotlin.reflect.jvm.internal.impl.protobuf;

import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f54091a;

    /* JADX INFO: renamed from: b */
    public final int f54092b;

    /* JADX INFO: renamed from: c */
    public int f54093c = 0;

    /* JADX INFO: renamed from: d */
    public final OutputStream f54094d;

    /* JADX INFO: compiled from: Proguard */
    public static class OutOfSpaceException extends IOException {
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f54094d = outputStream;
        this.f54091a = bArr;
        this.f54092b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public static int m19658a(int i, int i2) {
        return m19660c(i2) + m19665h(i);
    }

    /* JADX INFO: renamed from: b */
    public static int m19659b(int i, int i2) {
        return m19660c(i2) + m19665h(i);
    }

    /* JADX INFO: renamed from: c */
    public static int m19660c(int i) {
        if (i >= 0) {
            return m19663f(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: d */
    public static int m19661d(int i, MessageLite messageLite) {
        return m19662e(messageLite) + m19665h(i);
    }

    /* JADX INFO: renamed from: e */
    public static int m19662e(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return m19663f(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: f */
    public static int m19663f(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: g */
    public static int m19664g(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: h */
    public static int m19665h(int i) {
        return m19663f(i << 3);
    }

    /* JADX INFO: renamed from: j */
    public static CodedOutputStream m19666j(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: i */
    public final void m19667i() throws IOException {
        if (this.f54094d != null) {
            m19668k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m19668k() throws IOException {
        OutputStream outputStream = this.f54094d;
        if (outputStream == null) {
            throw new OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write(this.f54091a, 0, this.f54093c);
        this.f54093c = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m19669l(int i, int i2) {
        m19681x(i, 0);
        m19671n(i2);
    }

    /* JADX INFO: renamed from: m */
    public final void m19670m(int i, int i2) {
        m19681x(i, 0);
        m19671n(i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m19671n(int i) {
        if (i >= 0) {
            m19679v(i);
        } else {
            m19680w(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m19672o(int i, MessageLite messageLite) {
        m19681x(i, 2);
        m19673p(messageLite);
    }

    /* JADX INFO: renamed from: p */
    public final void m19673p(MessageLite messageLite) {
        m19679v(messageLite.getSerializedSize());
        messageLite.mo19416a(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m19674q(int i) {
        byte b2 = (byte) i;
        if (this.f54093c == this.f54092b) {
            m19668k();
        }
        int i2 = this.f54093c;
        this.f54093c = i2 + 1;
        this.f54091a[i2] = b2;
    }

    /* JADX INFO: renamed from: r */
    public final void m19675r(ByteString byteString) {
        int size = byteString.size();
        int i = this.f54093c;
        int i2 = this.f54092b;
        int i3 = i2 - i;
        byte[] bArr = this.f54091a;
        if (i3 >= size) {
            byteString.m19626e(bArr, 0, i, size);
            this.f54093c += size;
            return;
        }
        byteString.m19626e(bArr, 0, i, i3);
        int i4 = size - i3;
        this.f54093c = i2;
        m19668k();
        if (i4 <= i2) {
            byteString.m19626e(bArr, i3, 0, i4);
            this.f54093c = i4;
        } else {
            if (i3 < 0) {
                throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(30, i3, "Source offset < 0: "));
            }
            if (i4 < 0) {
                throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(23, i4, "Length < 0: "));
            }
            int i5 = i3 + i4;
            if (i5 > byteString.size()) {
                throw new IndexOutOfBoundsException(AbstractC2929c.m13702g(39, i5, "Source end offset exceeded: "));
            }
            if (i4 > 0) {
                byteString.mo19635r(this.f54094d, i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m19676s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f54093c;
        int i2 = this.f54092b;
        int i3 = i2 - i;
        byte[] bArr2 = this.f54091a;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.f54093c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.f54093c = i2;
        m19668k();
        if (i4 > i2) {
            this.f54094d.write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.f54093c = i4;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m19677t(int i) {
        m19674q(i & 255);
        m19674q((i >> 8) & 255);
        m19674q((i >> 16) & 255);
        m19674q((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: u */
    public final void m19678u(long j) {
        m19674q(((int) j) & 255);
        m19674q(((int) (j >> 8)) & 255);
        m19674q(((int) (j >> 16)) & 255);
        m19674q(((int) (j >> 24)) & 255);
        m19674q(((int) (j >> 32)) & 255);
        m19674q(((int) (j >> 40)) & 255);
        m19674q(((int) (j >> 48)) & 255);
        m19674q(((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: v */
    public final void m19679v(int i) {
        while ((i & (-128)) != 0) {
            m19674q((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            i >>>= 7;
        }
        m19674q(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m19680w(long j) {
        while (((-128) & j) != 0) {
            m19674q((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            j >>>= 7;
        }
        m19674q((int) j);
    }

    /* JADX INFO: renamed from: x */
    public final void m19681x(int i, int i2) {
        m19679v((i << 3) | i2);
    }
}
