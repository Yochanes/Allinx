package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class NalUnitTargetBuffer {

    /* JADX INFO: renamed from: a */
    public final int f29654a;

    /* JADX INFO: renamed from: b */
    public boolean f29655b;

    /* JADX INFO: renamed from: c */
    public boolean f29656c;

    /* JADX INFO: renamed from: d */
    public byte[] f29657d;

    /* JADX INFO: renamed from: e */
    public int f29658e;

    public NalUnitTargetBuffer(int i) {
        this.f29654a = i;
        byte[] bArr = new byte[131];
        this.f29657d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m11064a(byte[] bArr, int i, int i2) {
        if (this.f29655b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f29657d;
            int length = bArr2.length;
            int i4 = this.f29658e;
            if (length < i4 + i3) {
                this.f29657d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f29657d, this.f29658e, i3);
            this.f29658e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11065b(int i) {
        if (!this.f29655b) {
            return false;
        }
        this.f29658e -= i;
        this.f29655b = false;
        this.f29656c = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m11066c() {
        this.f29655b = false;
        this.f29656c = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m11067d(int i) {
        Assertions.m9464e(!this.f29655b);
        boolean z2 = i == this.f29654a;
        this.f29655b = z2;
        if (z2) {
            this.f29658e = 3;
            this.f29656c = false;
        }
    }
}
