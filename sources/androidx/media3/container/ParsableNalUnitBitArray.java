package androidx.media3.container;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ParsableNalUnitBitArray {

    /* JADX INFO: renamed from: a */
    public byte[] f25775a;

    /* JADX INFO: renamed from: b */
    public int f25776b;

    /* JADX INFO: renamed from: c */
    public int f25777c;

    /* JADX INFO: renamed from: d */
    public int f25778d = 0;

    public ParsableNalUnitBitArray(byte[] bArr, int i, int i2) {
        this.f25775a = bArr;
        this.f25777c = i;
        this.f25776b = i2;
        m9657a();
    }

    /* JADX INFO: renamed from: a */
    public final void m9657a() {
        int i;
        int i2 = this.f25777c;
        Assertions.m9464e(i2 >= 0 && (i2 < (i = this.f25776b) || (i2 == i && this.f25778d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9658b(int i) {
        int i2 = this.f25777c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f25778d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f25776b) {
                break;
            }
            if (m9664h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f25776b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9659c() {
        int i = this.f25777c;
        int i2 = this.f25778d;
        int i3 = 0;
        while (this.f25777c < this.f25776b && !m9660d()) {
            i3++;
        }
        boolean z2 = this.f25777c == this.f25776b;
        this.f25777c = i;
        this.f25778d = i2;
        return !z2 && m9658b((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9660d() {
        boolean z2 = (this.f25775a[this.f25777c] & (UserMetadata.MAX_ROLLOUT_ASSIGNMENTS >> this.f25778d)) != 0;
        m9665i();
        return z2;
    }

    /* JADX INFO: renamed from: e */
    public final int m9661e(int i) {
        int i2;
        this.f25778d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f25778d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f25778d = i4;
            byte[] bArr = this.f25775a;
            int i5 = this.f25777c;
            i3 |= (bArr[i5] & UnsignedBytes.MAX_VALUE) << i4;
            if (!m9664h(i5 + 1)) {
                i = 1;
            }
            this.f25777c = i5 + i;
        }
        byte[] bArr2 = this.f25775a;
        int i6 = this.f25777c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UnsignedBytes.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.f25778d = 0;
            this.f25777c = i6 + (m9664h(i6 + 1) ? 2 : 1);
        }
        m9657a();
        return i7;
    }

    /* JADX INFO: renamed from: f */
    public final int m9662f() {
        int i = 0;
        while (!m9660d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m9661e(i) : 0);
    }

    /* JADX INFO: renamed from: g */
    public final int m9663g() {
        int iM9662f = m9662f();
        return ((iM9662f + 1) / 2) * (iM9662f % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9664h(int i) {
        if (2 > i || i >= this.f25776b) {
            return false;
        }
        byte[] bArr = this.f25775a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m9665i() {
        int i = this.f25778d + 1;
        this.f25778d = i;
        if (i == 8) {
            this.f25778d = 0;
            int i2 = this.f25777c;
            this.f25777c = i2 + (m9664h(i2 + 1) ? 2 : 1);
        }
        m9657a();
    }

    /* JADX INFO: renamed from: j */
    public final void m9666j(int i) {
        int i2 = this.f25777c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f25777c = i4;
        int i5 = (i - (i3 * 8)) + this.f25778d;
        this.f25778d = i5;
        if (i5 > 7) {
            this.f25777c = i4 + 1;
            this.f25778d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f25777c) {
                m9657a();
                return;
            } else if (m9664h(i2)) {
                this.f25777c++;
                i2 += 2;
            }
        }
    }
}
