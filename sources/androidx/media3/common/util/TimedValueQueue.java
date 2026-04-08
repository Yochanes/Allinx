package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TimedValueQueue<V> {

    /* JADX INFO: renamed from: a */
    public long[] f25657a = new long[10];

    /* JADX INFO: renamed from: b */
    public Object[] f25658b = new Object[10];

    /* JADX INFO: renamed from: c */
    public int f25659c;

    /* JADX INFO: renamed from: d */
    public int f25660d;

    /* JADX INFO: renamed from: a */
    public final synchronized void m9578a(long j, Object obj) {
        if (this.f25660d > 0) {
            if (j <= this.f25657a[((this.f25659c + r0) - 1) % this.f25658b.length]) {
                m9579b();
            }
        }
        m9580c();
        int i = this.f25659c;
        int i2 = this.f25660d;
        Object[] objArr = this.f25658b;
        int length = (i + i2) % objArr.length;
        this.f25657a[length] = j;
        objArr[length] = obj;
        this.f25660d = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m9579b() {
        this.f25659c = 0;
        this.f25660d = 0;
        Arrays.fill(this.f25658b, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public final void m9580c() {
        int length = this.f25658b.length;
        if (this.f25660d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f25659c;
        int i3 = length - i2;
        System.arraycopy(this.f25657a, i2, jArr, 0, i3);
        System.arraycopy(this.f25658b, this.f25659c, objArr, 0, i3);
        int i4 = this.f25659c;
        if (i4 > 0) {
            System.arraycopy(this.f25657a, 0, jArr, i3, i4);
            System.arraycopy(this.f25658b, 0, objArr, i3, this.f25659c);
        }
        this.f25657a = jArr;
        this.f25658b = objArr;
        this.f25659c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m9581d(long j, boolean z2) {
        Object objM9584g = null;
        long j2 = Long.MAX_VALUE;
        while (this.f25660d > 0) {
            long j3 = j - this.f25657a[this.f25659c];
            if (j3 < 0 && (z2 || (-j3) >= j2)) {
                break;
            }
            objM9584g = m9584g();
            j2 = j3;
        }
        return objM9584g;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Object m9582e() {
        return this.f25660d == 0 ? null : m9584g();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Object m9583f(long j) {
        return m9581d(j, true);
    }

    /* JADX INFO: renamed from: g */
    public final Object m9584g() {
        Assertions.m9464e(this.f25660d > 0);
        Object[] objArr = this.f25658b;
        int i = this.f25659c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f25659c = (i + 1) % objArr.length;
        this.f25660d--;
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized int m9585h() {
        return this.f25660d;
    }
}
