package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"animation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SplineBasedFloatDecayAnimationSpec_androidKt {

    /* JADX INFO: renamed from: a */
    public static final float f4272a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: a */
    public static final DecayAnimationSpec m2220a(Composer composer) {
        Density density = (Density) composer.mo4247y(CompositionLocalsKt.f19357h);
        boolean zMo4230h = composer.mo4230h(density.getF20556a());
        Object objMo4229g = composer.mo4229g();
        if (zMo4230h || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = DecayAnimationSpecKt.m2293c(new SplineBasedFloatDecayAnimationSpec(density));
            composer.mo4214G(objMo4229g);
        }
        return (DecayAnimationSpec) objMo4229g;
    }
}
