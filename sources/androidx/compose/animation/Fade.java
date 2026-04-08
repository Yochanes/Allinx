package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/Fade;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class Fade {

    /* JADX INFO: renamed from: a */
    public final float f4201a;

    /* JADX INFO: renamed from: b */
    public final FiniteAnimationSpec f4202b;

    public Fade(float f, FiniteAnimationSpec finiteAnimationSpec) {
        this.f4201a = f;
        this.f4202b = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return Float.compare(this.f4201a, fade.f4201a) == 0 && Intrinsics.m18594b(this.f4202b, fade.f4202b);
    }

    public final int hashCode() {
        return this.f4202b.hashCode() + (Float.hashCode(this.f4201a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f4201a + ", animationSpec=" + this.f4202b + ')';
    }
}
