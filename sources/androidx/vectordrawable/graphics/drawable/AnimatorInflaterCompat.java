package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class AnimatorInflaterCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* JADX INFO: renamed from: a */
        public PathParser.PathDataNode[] f32344a;

        @Override // android.animation.TypeEvaluator
        public final PathParser.PathDataNode[] evaluate(float f, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.m7566a(pathDataNodeArr3, pathDataNodeArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!PathParser.m7566a(this.f32344a, pathDataNodeArr3)) {
                this.f32344a = PathParser.m7570e(pathDataNodeArr3);
            }
            for (int i = 0; i < pathDataNodeArr3.length; i++) {
                PathParser.PathDataNode pathDataNode = this.f32344a[i];
                PathParser.PathDataNode pathDataNode2 = pathDataNodeArr3[i];
                PathParser.PathDataNode pathDataNode3 = pathDataNodeArr4[i];
                pathDataNode.getClass();
                pathDataNode.f23206a = pathDataNode2.f23206a;
                int i2 = 0;
                while (true) {
                    float[] fArr = pathDataNode2.f23207b;
                    if (i2 < fArr.length) {
                        pathDataNode.f23207b[i2] = (pathDataNode3.f23207b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f32344a;
        }
    }
}
