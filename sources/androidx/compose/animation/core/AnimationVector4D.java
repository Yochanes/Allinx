package androidx.compose.animation.core;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationVector4D extends AnimationVector {

    /* JADX INFO: renamed from: a */
    public float f4362a;

    /* JADX INFO: renamed from: b */
    public float f4363b;

    /* JADX INFO: renamed from: c */
    public float f4364c;

    /* JADX INFO: renamed from: d */
    public float f4365d;

    public AnimationVector4D(float f, float f2, float f3, float f4) {
        this.f4362a = f;
        this.f4363b = f2;
        this.f4364c = f3;
        this.f4365d = f4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: a */
    public final float mo2281a(int i) {
        if (i == 0) {
            return this.f4362a;
        }
        if (i == 1) {
            return this.f4363b;
        }
        if (i == 2) {
            return this.f4364c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f4365d;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: b */
    public final int mo2282b() {
        return 4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: c */
    public final AnimationVector mo2283c() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: d */
    public final void mo2284d() {
        this.f4362a = 0.0f;
        this.f4363b = 0.0f;
        this.f4364c = 0.0f;
        this.f4365d = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: e */
    public final void mo2285e(float f, int i) {
        if (i == 0) {
            this.f4362a = f;
            return;
        }
        if (i == 1) {
            this.f4363b = f;
        } else if (i == 2) {
            this.f4364c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f4365d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        return animationVector4D.f4362a == this.f4362a && animationVector4D.f4363b == this.f4363b && animationVector4D.f4364c == this.f4364c && animationVector4D.f4365d == this.f4365d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4365d) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f4362a) * 31, this.f4363b, 31), this.f4364c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f4362a + ", v2 = " + this.f4363b + ", v3 = " + this.f4364c + ", v4 = " + this.f4365d;
    }
}
