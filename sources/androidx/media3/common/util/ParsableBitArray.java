package androidx.media3.common.util;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
@UnstableApi
public final class ParsableBitArray {

    /* JADX INFO: renamed from: a */
    public byte[] f25637a;

    /* JADX INFO: renamed from: b */
    public int f25638b;

    /* JADX INFO: renamed from: c */
    public int f25639c;

    /* JADX INFO: renamed from: d */
    public int f25640d;

    public ParsableBitArray() {
        this.f25637a = Util.f25667c;
    }

    /* JADX INFO: renamed from: a */
    public final void m9524a() {
        int i;
        int i2 = this.f25638b;
        Assertions.m9464e(i2 >= 0 && (i2 < (i = this.f25640d) || (i2 == i && this.f25639c == 0)));
    }

    /* JADX INFO: renamed from: b */
    public final int m9525b() {
        return ((this.f25640d - this.f25638b) * 8) - this.f25639c;
    }

    /* JADX INFO: renamed from: c */
    public final void m9526c() {
        if (this.f25639c == 0) {
            return;
        }
        this.f25639c = 0;
        this.f25638b++;
        m9524a();
    }

    /* JADX INFO: renamed from: d */
    public final int m9527d() {
        Assertions.m9464e(this.f25639c == 0);
        return this.f25638b;
    }

    /* JADX INFO: renamed from: e */
    public final int m9528e() {
        return (this.f25638b * 8) + this.f25639c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9529f() {
        boolean z2 = (this.f25637a[this.f25638b] & (UserMetadata.MAX_ROLLOUT_ASSIGNMENTS >> this.f25639c)) != 0;
        m9537n();
        return z2;
    }

    /* JADX INFO: renamed from: g */
    public final int m9530g(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f25639c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f25639c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f25639c = i4;
            byte[] bArr = this.f25637a;
            int i5 = this.f25638b;
            this.f25638b = i5 + 1;
            i3 |= (bArr[i5] & UnsignedBytes.MAX_VALUE) << i4;
        }
        byte[] bArr2 = this.f25637a;
        int i6 = this.f25638b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UnsignedBytes.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.f25639c = 0;
            this.f25638b = i6 + 1;
        }
        m9524a();
        return i7;
    }

    /* JADX INFO: renamed from: h */
    public final void m9531h(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f25637a;
            int i4 = this.f25638b;
            int i5 = i4 + 1;
            this.f25638b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.f25639c;
            byte b3 = (byte) (b2 << i6);
            bArr[i3] = b3;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b3);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b4;
        int i8 = this.f25639c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f25637a;
            int i9 = this.f25638b;
            this.f25638b = i9 + 1;
            bArr[i2] = (byte) (b4 | ((bArr3[i9] & UnsignedBytes.MAX_VALUE) << i8));
            this.f25639c = i8 - 8;
        }
        int i10 = this.f25639c + i7;
        this.f25639c = i10;
        byte[] bArr4 = this.f25637a;
        int i11 = this.f25638b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f25639c = 0;
            this.f25638b = i11 + 1;
        }
        m9524a();
    }

    /* JADX INFO: renamed from: i */
    public final long m9532i(int i) {
        if (i <= 32) {
            int iM9530g = m9530g(i);
            int i2 = Util.f25665a;
            return 4294967295L & ((long) iM9530g);
        }
        int iM9530g2 = m9530g(i - 32);
        int iM9530g3 = m9530g(32);
        int i3 = Util.f25665a;
        return (4294967295L & ((long) iM9530g3)) | ((((long) iM9530g2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: j */
    public final void m9533j(int i, byte[] bArr) {
        Assertions.m9464e(this.f25639c == 0);
        System.arraycopy(this.f25637a, this.f25638b, bArr, 0, i);
        this.f25638b += i;
        m9524a();
    }

    /* JADX INFO: renamed from: k */
    public final void m9534k(int i, byte[] bArr) {
        this.f25637a = bArr;
        this.f25638b = 0;
        this.f25639c = 0;
        this.f25640d = i;
    }

    /* JADX INFO: renamed from: l */
    public final void m9535l(ParsableByteArray parsableByteArray) {
        m9534k(parsableByteArray.f25646c, parsableByteArray.f25644a);
        m9536m(parsableByteArray.f25645b * 8);
    }

    /* JADX INFO: renamed from: m */
    public final void m9536m(int i) {
        int i2 = i / 8;
        this.f25638b = i2;
        this.f25639c = i - (i2 * 8);
        m9524a();
    }

    /* JADX INFO: renamed from: n */
    public final void m9537n() {
        int i = this.f25639c + 1;
        this.f25639c = i;
        if (i == 8) {
            this.f25639c = 0;
            this.f25638b++;
        }
        m9524a();
    }

    /* JADX INFO: renamed from: o */
    public final void m9538o(int i) {
        int i2 = i / 8;
        int i3 = this.f25638b + i2;
        this.f25638b = i3;
        int i4 = (i - (i2 * 8)) + this.f25639c;
        this.f25639c = i4;
        if (i4 > 7) {
            this.f25638b = i3 + 1;
            this.f25639c = i4 - 8;
        }
        m9524a();
    }

    /* JADX INFO: renamed from: p */
    public final void m9539p(int i) {
        Assertions.m9464e(this.f25639c == 0);
        this.f25638b += i;
        m9524a();
    }

    public ParsableBitArray(byte[] bArr, int i) {
        this.f25637a = bArr;
        this.f25640d = i;
    }
}
