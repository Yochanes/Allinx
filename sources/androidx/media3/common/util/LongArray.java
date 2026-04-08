package androidx.media3.common.util;

import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class LongArray {

    /* JADX INFO: renamed from: a */
    public int f25620a;

    /* JADX INFO: renamed from: b */
    public long[] f25621b;

    public LongArray() {
        this(32);
    }

    /* JADX INFO: renamed from: a */
    public final void m9513a(long j) {
        int i = this.f25620a;
        long[] jArr = this.f25621b;
        if (i == jArr.length) {
            this.f25621b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f25621b;
        int i2 = this.f25620a;
        this.f25620a = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: b */
    public final void m9514b(long[] jArr) {
        int length = this.f25620a + jArr.length;
        long[] jArr2 = this.f25621b;
        if (length > jArr2.length) {
            this.f25621b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f25621b, this.f25620a, jArr.length);
        this.f25620a = length;
    }

    /* JADX INFO: renamed from: c */
    public final long m9515c(int i) {
        if (i >= 0 && i < this.f25620a) {
            return this.f25621b[i];
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Invalid index ", ", size is ");
        sbM20q.append(this.f25620a);
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }

    public LongArray(int i) {
        this.f25621b = new long[i];
    }
}
