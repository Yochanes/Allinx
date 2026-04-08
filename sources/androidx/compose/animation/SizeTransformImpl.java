package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/SizeTransformImpl;", "Landroidx/compose/animation/SizeTransform;", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SizeTransformImpl implements SizeTransform {

    /* JADX INFO: renamed from: a */
    public final Function2 f4264a;

    public SizeTransformImpl(Function2 function2) {
        this.f4264a = function2;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* JADX INFO: renamed from: a */
    public final boolean mo2213a() {
        return true;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* JADX INFO: renamed from: b */
    public final FiniteAnimationSpec mo2214b(long j, long j2) {
        return (FiniteAnimationSpec) this.f4264a.invoke(new IntSize(j), new IntSize(j2));
    }
}
