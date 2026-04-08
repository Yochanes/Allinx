package androidx.compose.animation.core;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationVector3D extends AnimationVector {

    /* JADX INFO: renamed from: a */
    public float f4359a;

    /* JADX INFO: renamed from: b */
    public float f4360b;

    /* JADX INFO: renamed from: c */
    public float f4361c;

    public AnimationVector3D(float f, float f2, float f3) {
        this.f4359a = f;
        this.f4360b = f2;
        this.f4361c = f3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: a */
    public final float mo2281a(int i) {
        if (i == 0) {
            return this.f4359a;
        }
        if (i == 1) {
            return this.f4360b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f4361c;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: b */
    public final int mo2282b() {
        return 3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: c */
    public final AnimationVector mo2283c() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: d */
    public final void mo2284d() {
        this.f4359a = 0.0f;
        this.f4360b = 0.0f;
        this.f4361c = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: e */
    public final void mo2285e(float f, int i) {
        if (i == 0) {
            this.f4359a = f;
        } else if (i == 1) {
            this.f4360b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f4361c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) obj;
        return animationVector3D.f4359a == this.f4359a && animationVector3D.f4360b == this.f4360b && animationVector3D.f4361c == this.f4361c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4361c) + AbstractC0455a.m2226a(Float.hashCode(this.f4359a) * 31, this.f4360b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f4359a + ", v2 = " + this.f4360b + ", v3 = " + this.f4361c;
    }
}
