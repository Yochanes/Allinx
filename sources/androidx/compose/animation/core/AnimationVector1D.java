package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationVector1D extends AnimationVector {

    /* JADX INFO: renamed from: a */
    public float f4356a;

    public AnimationVector1D(float f) {
        this.f4356a = f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: a */
    public final float mo2281a(int i) {
        if (i == 0) {
            return this.f4356a;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: b */
    public final int mo2282b() {
        return 1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: c */
    public final AnimationVector mo2283c() {
        return new AnimationVector1D(0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: d */
    public final void mo2284d() {
        this.f4356a = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: e */
    public final void mo2285e(float f, int i) {
        if (i == 0) {
            this.f4356a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).f4356a == this.f4356a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4356a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f4356a;
    }
}
