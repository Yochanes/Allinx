package androidx.transition;

import android.animation.TypeEvaluator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a */
    public float[] f32217a;

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f32217a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i = 0; i < fArr5.length; i++) {
            float f2 = fArr3[i];
            fArr5[i] = AbstractC0000a.m4a(fArr4[i], f2, f, f2);
        }
        return fArr5;
    }
}
