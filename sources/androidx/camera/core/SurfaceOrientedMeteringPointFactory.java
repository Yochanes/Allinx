package androidx.camera.core;

import android.graphics.PointF;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class SurfaceOrientedMeteringPointFactory extends MeteringPointFactory {
    @Override // androidx.camera.core.MeteringPointFactory
    /* JADX INFO: renamed from: a */
    public final PointF mo1229a(float f, float f2) {
        return new PointF(f / 0.0f, f2 / 0.0f);
    }
}
