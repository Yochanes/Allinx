package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class SlidingPercentile {

    /* JADX INFO: renamed from: h */
    public static final C1919d f27742h = new C1919d(0);

    /* JADX INFO: renamed from: i */
    public static final C1919d f27743i = new C1919d(1);

    /* JADX INFO: renamed from: a */
    public final int f27744a;

    /* JADX INFO: renamed from: e */
    public int f27748e;

    /* JADX INFO: renamed from: f */
    public int f27749f;

    /* JADX INFO: renamed from: g */
    public int f27750g;

    /* JADX INFO: renamed from: c */
    public final Sample[] f27746c = new Sample[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList f27745b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f27747d = -1;

    /* JADX INFO: compiled from: Proguard */
    public static class Sample {

        /* JADX INFO: renamed from: a */
        public int f27751a;

        /* JADX INFO: renamed from: b */
        public int f27752b;

        /* JADX INFO: renamed from: c */
        public float f27753c;
    }

    public SlidingPercentile(int i) {
        this.f27744a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10673a(float f, int i) {
        Sample sample;
        int i2 = this.f27747d;
        ArrayList arrayList = this.f27745b;
        if (i2 != 1) {
            Collections.sort(arrayList, f27742h);
            this.f27747d = 1;
        }
        int i3 = this.f27750g;
        Sample[] sampleArr = this.f27746c;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f27750g = i4;
            sample = sampleArr[i4];
        } else {
            sample = new Sample();
        }
        int i5 = this.f27748e;
        this.f27748e = i5 + 1;
        sample.f27751a = i5;
        sample.f27752b = i;
        sample.f27753c = f;
        arrayList.add(sample);
        this.f27749f += i;
        while (true) {
            int i6 = this.f27749f;
            int i7 = this.f27744a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            Sample sample2 = (Sample) arrayList.get(0);
            int i9 = sample2.f27752b;
            if (i9 <= i8) {
                this.f27749f -= i9;
                arrayList.remove(0);
                int i10 = this.f27750g;
                if (i10 < 5) {
                    this.f27750g = i10 + 1;
                    sampleArr[i10] = sample2;
                }
            } else {
                sample2.f27752b = i9 - i8;
                this.f27749f -= i8;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m10674b() {
        int i = this.f27747d;
        ArrayList arrayList = this.f27745b;
        if (i != 0) {
            Collections.sort(arrayList, f27743i);
            this.f27747d = 0;
        }
        float f = 0.5f * this.f27749f;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Sample sample = (Sample) arrayList.get(i3);
            i2 += sample.f27752b;
            if (i2 >= f) {
                return sample.f27753c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((Sample) AbstractC0000a.m8e(1, arrayList)).f27753c;
    }
}
