package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class VorbisBitArray {

    /* JADX INFO: renamed from: a */
    public final byte[] f28290a;

    /* JADX INFO: renamed from: b */
    public final int f28291b;

    /* JADX INFO: renamed from: c */
    public int f28292c;

    /* JADX INFO: renamed from: d */
    public int f28293d;

    public VorbisBitArray(byte[] bArr) {
        this.f28290a = bArr;
        this.f28291b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10822a() {
        boolean z2 = (((this.f28290a[this.f28292c] & UnsignedBytes.MAX_VALUE) >> this.f28293d) & 1) == 1;
        m10824c(1);
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final int m10823b(int i) {
        int i2 = this.f28292c;
        int iMin = Math.min(i, 8 - this.f28293d);
        int i3 = i2 + 1;
        byte[] bArr = this.f28290a;
        int i4 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) >> this.f28293d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & UnsignedBytes.MAX_VALUE) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m10824c(i);
        return i5;
    }

    /* JADX INFO: renamed from: c */
    public final void m10824c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f28292c + i3;
        this.f28292c = i4;
        int i5 = (i - (i3 * 8)) + this.f28293d;
        this.f28293d = i5;
        boolean z2 = true;
        if (i5 > 7) {
            this.f28292c = i4 + 1;
            this.f28293d = i5 - 8;
        }
        int i6 = this.f28292c;
        if (i6 < 0 || (i6 >= (i2 = this.f28291b) && (i6 != i2 || this.f28293d != 0))) {
            z2 = false;
        }
        Assertions.m9464e(z2);
    }
}
