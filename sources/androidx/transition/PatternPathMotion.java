package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PatternPathMotion extends PathMotion {

    /* JADX INFO: renamed from: a */
    public final Path f32238a;

    /* JADX INFO: renamed from: b */
    public final Matrix f32239b;

    public PatternPathMotion(Path path) {
        Path path2 = new Path();
        this.f32238a = path2;
        Matrix matrix = new Matrix();
        this.f32239b = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        matrix.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float fSqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + (r4 * r4)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f5, f - f3)));
        path.transform(matrix, path2);
    }

    @Override // androidx.transition.PathMotion
    public final Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (r6 * r6));
        double dAtan2 = Math.atan2(f5, f3 - f);
        Matrix matrix = this.f32239b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.f32238a.transform(matrix, path);
        return path;
    }
}
