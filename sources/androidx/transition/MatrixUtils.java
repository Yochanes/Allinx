package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class MatrixUtils {

    /* JADX INFO: renamed from: a */
    public static final Matrix f32236a = new C22171();

    /* JADX INFO: renamed from: androidx.transition.MatrixUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22171 extends Matrix {
        /* JADX INFO: renamed from: a */
        public static void m11973a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public final boolean postConcat(Matrix matrix) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postRotate(float f, float f2, float f3) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postScale(float f, float f2, float f3, float f4) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postSkew(float f, float f2, float f3, float f4) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postTranslate(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preConcat(Matrix matrix) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preRotate(float f, float f2, float f3) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preScale(float f, float f2, float f3, float f4) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preSkew(float f, float f2, float f3, float f4) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preTranslate(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void reset() {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void set(Matrix matrix) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean setConcat(Matrix matrix, Matrix matrix2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setRotate(float f, float f2, float f3) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setScale(float f, float f2, float f3, float f4) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSinCos(float f, float f2, float f3, float f4) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSkew(float f, float f2, float f3, float f4) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setTranslate(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setValues(float[] fArr) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postRotate(float f) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postScale(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postSkew(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preRotate(float f) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preScale(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preSkew(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setRotate(float f) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setScale(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSinCos(float f, float f2) {
            m11973a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSkew(float f, float f2) {
            m11973a();
            throw null;
        }
    }
}
