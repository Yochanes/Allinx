package androidx.vectordrawable.graphics.drawable;

import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class PathInterpolatorCompat implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        throw null;
    }
}
