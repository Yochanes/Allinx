package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"animation-core_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationSpecKt {
    /* JADX INFO: renamed from: a */
    public static InfiniteRepeatableSpec m2274a(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.f4477a;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, j);
    }

    /* JADX INFO: renamed from: b */
    public static final KeyframesSpec m2275b(Function1 function1) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new KeyframesSpec(keyframesSpecConfig);
    }

    /* JADX INFO: renamed from: c */
    public static SpringSpec m2276c(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new SpringSpec(f, f2, obj);
    }

    /* JADX INFO: renamed from: d */
    public static TweenSpec m2277d(int i, int i2, Easing easing, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = EasingKt.f4402a;
        }
        return new TweenSpec(i, i2, easing);
    }
}
