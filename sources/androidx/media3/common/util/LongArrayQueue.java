package androidx.media3.common.util;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class LongArrayQueue {

    /* JADX INFO: renamed from: a */
    public int f25622a;

    /* JADX INFO: renamed from: b */
    public int f25623b;

    /* JADX INFO: renamed from: c */
    public long[] f25624c;

    /* JADX INFO: renamed from: d */
    public int f25625d;

    /* JADX INFO: renamed from: a */
    public final long m9516a() {
        int i = this.f25623b;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f25624c;
        int i2 = this.f25622a;
        long j = jArr[i2];
        this.f25622a = this.f25625d & (i2 + 1);
        this.f25623b = i - 1;
        return j;
    }
}
