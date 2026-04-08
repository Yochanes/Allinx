package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p013ui.graphics.TransformOrigin;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/Scale;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class Scale {

    /* JADX INFO: renamed from: a */
    public final float f4212a;

    /* JADX INFO: renamed from: b */
    public final long f4213b;

    /* JADX INFO: renamed from: c */
    public final FiniteAnimationSpec f4214c;

    public Scale(float f, long j, FiniteAnimationSpec finiteAnimationSpec) {
        this.f4212a = f;
        this.f4213b = j;
        this.f4214c = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.f4212a, scale.f4212a) == 0 && TransformOrigin.m5248a(this.f4213b, scale.f4213b) && Intrinsics.m18594b(this.f4214c, scale.f4214c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f4212a) * 31;
        int i = TransformOrigin.f17679c;
        return this.f4214c.hashCode() + AbstractC0455a.m2231f(this.f4213b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f4212a + ", transformOrigin=" + ((Object) TransformOrigin.m5251d(this.f4213b)) + ", animationSpec=" + this.f4214c + ')';
    }
}
