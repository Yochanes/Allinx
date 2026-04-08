package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {

    /* JADX INFO: renamed from: a */
    public final AnimationVector f4732a;

    /* JADX INFO: renamed from: b */
    public final Easing f4733b;

    public VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing) {
        this.f4732a = animationVector;
        this.f4733b = easing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) obj;
        return Intrinsics.m18594b(this.f4732a, vectorizedKeyframeSpecElementInfo.f4732a) && Intrinsics.m18594b(this.f4733b, vectorizedKeyframeSpecElementInfo.f4733b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f4733b.hashCode() + (this.f4732a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f4732a + ", easing=" + this.f4733b + ", arcMode=ArcMode(value=0))";
    }
}
