package androidx.camera.core.internal;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.utils.CameraOrientationUtil;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class SupportedOutputSizesSorterLegacy {

    /* JADX INFO: renamed from: a */
    public final int f2988a;

    /* JADX INFO: renamed from: b */
    public final int f2989b;

    /* JADX INFO: renamed from: c */
    public final Rational f2990c;

    /* JADX INFO: renamed from: d */
    public final boolean f2991d;

    public SupportedOutputSizesSorterLegacy(CameraInfoInternal cameraInfoInternal, Rational rational) {
        this.f2988a = cameraInfoInternal.mo944b();
        this.f2989b = cameraInfoInternal.mo949h();
        this.f2990c = rational;
        boolean z2 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z2 = false;
        }
        this.f2991d = z2;
    }

    /* JADX INFO: renamed from: a */
    public final Size m1657a(ImageOutputConfig imageOutputConfig) {
        int iM1494C = imageOutputConfig.m1494C();
        Size sizeM1495D = imageOutputConfig.m1495D();
        if (sizeM1495D != null) {
            int iM1585a = CameraOrientationUtil.m1585a(CameraOrientationUtil.m1586b(iM1494C), this.f2988a, 1 == this.f2989b);
            if (iM1585a == 90 || iM1585a == 270) {
                return new Size(sizeM1495D.getHeight(), sizeM1495D.getWidth());
            }
        }
        return sizeM1495D;
    }
}
