package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/Slide;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class Slide {

    /* JADX INFO: renamed from: a */
    public final Lambda f4269a;

    /* JADX INFO: renamed from: b */
    public final FiniteAnimationSpec f4270b;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        this.f4269a = (Lambda) function1;
        this.f4270b = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return this.f4269a.equals(slide.f4269a) && this.f4270b.equals(slide.f4270b);
    }

    public final int hashCode() {
        return this.f4270b.hashCode() + (this.f4269a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f4269a + ", animationSpec=" + this.f4270b + ')';
    }
}
