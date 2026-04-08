package androidx.camera.core.impl.utils;

import android.opengl.Matrix;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class MatrixExt {
    /* JADX INFO: renamed from: a */
    public static void m1605a(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public static void m1606b(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }
}
