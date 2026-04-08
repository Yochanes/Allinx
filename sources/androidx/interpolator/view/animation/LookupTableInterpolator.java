package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import p001A.AbstractC0000a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class LookupTableInterpolator implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f24837a;

    /* JADX INFO: renamed from: b */
    public final float f24838b;

    public LookupTableInterpolator(float[] fArr) {
        this.f24837a = fArr;
        this.f24838b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f24837a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f24838b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return AbstractC0000a.m4a(fArr[iMin + 1], f4, f3, f4);
    }
}
