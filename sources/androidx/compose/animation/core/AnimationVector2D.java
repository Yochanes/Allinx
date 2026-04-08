package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationVector2D extends AnimationVector {

    /* JADX INFO: renamed from: a */
    public float f4357a;

    /* JADX INFO: renamed from: b */
    public float f4358b;

    public AnimationVector2D(float f, float f2) {
        this.f4357a = f;
        this.f4358b = f2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: a */
    public final float mo2281a(int i) {
        if (i == 0) {
            return this.f4357a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f4358b;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: b */
    public final int mo2282b() {
        return 2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: c */
    public final AnimationVector mo2283c() {
        return new AnimationVector2D(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: d */
    public final void mo2284d() {
        this.f4357a = 0.0f;
        this.f4358b = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: e */
    public final void mo2285e(float f, int i) {
        if (i == 0) {
            this.f4357a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f4358b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return animationVector2D.f4357a == this.f4357a && animationVector2D.f4358b == this.f4358b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4358b) + (Float.hashCode(this.f4357a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f4357a + ", v2 = " + this.f4358b;
    }
}
