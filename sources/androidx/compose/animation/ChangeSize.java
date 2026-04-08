package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/ChangeSize;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class ChangeSize {

    /* JADX INFO: renamed from: a */
    public final Alignment f4081a;

    /* JADX INFO: renamed from: b */
    public final Function1 f4082b;

    /* JADX INFO: renamed from: c */
    public final FiniteAnimationSpec f4083c;

    /* JADX INFO: renamed from: androidx.compose.animation.ChangeSize$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    final class C04441 extends Lambda implements Function1<IntSize, IntSize> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long j = ((IntSize) obj).f20568a;
            long j2 = 0;
            return new IntSize((j2 & 4294967295L) | (j2 << 32));
        }
    }

    public ChangeSize(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, Function1 function1) {
        this.f4081a = alignment;
        this.f4082b = function1;
        this.f4083c = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return Intrinsics.m18594b(this.f4081a, changeSize.f4081a) && Intrinsics.m18594b(this.f4082b, changeSize.f4082b) && Intrinsics.m18594b(this.f4083c, changeSize.f4083c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f4083c.hashCode() + ((this.f4082b.hashCode() + (this.f4081a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f4081a + ", size=" + this.f4082b + ", animationSpec=" + this.f4083c + ", clip=true)";
    }
}
