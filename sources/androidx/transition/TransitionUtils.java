package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class TransitionUtils {

    /* JADX INFO: renamed from: a */
    public static final boolean f32277a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Bitmap m12002a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MatrixEvaluator implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a */
        public final float[] f32278a = new float[9];

        /* JADX INFO: renamed from: b */
        public final float[] f32279b = new float[9];

        /* JADX INFO: renamed from: c */
        public final Matrix f32280c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f32278a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f32279b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = AbstractC0000a.m4a(f2, f3, f, f3);
            }
            Matrix matrix3 = this.f32280c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        f32277a = Build.VERSION.SDK_INT >= 28;
    }
}
