package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.MeteringPointFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
class PreviewViewMeteringPointFactory extends MeteringPointFactory {

    /* JADX INFO: renamed from: c */
    public static final PointF f3554c = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: a */
    public final PreviewTransformation f3555a;

    /* JADX INFO: renamed from: b */
    public Matrix f3556b;

    public PreviewViewMeteringPointFactory(PreviewTransformation previewTransformation) {
        this.f3555a = previewTransformation;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    /* JADX INFO: renamed from: a */
    public final PointF mo1229a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            try {
                Matrix matrix = this.f3556b;
                if (matrix == null) {
                    return f3554c;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
