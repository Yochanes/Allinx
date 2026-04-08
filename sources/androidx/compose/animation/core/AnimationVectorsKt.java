package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"animation-core_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationVectorsKt {
    /* JADX INFO: renamed from: a */
    public static final AnimationVector m2286a(AnimationVector animationVector) {
        AnimationVector animationVectorMo2283c = animationVector.mo2283c();
        int iMo2282b = animationVectorMo2283c.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            animationVectorMo2283c.mo2285e(animationVector.mo2281a(i), i);
        }
        return animationVectorMo2283c;
    }
}
