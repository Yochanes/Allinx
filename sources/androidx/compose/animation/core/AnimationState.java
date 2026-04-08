package androidx.compose.animation.core;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AnimationState<T, V extends AnimationVector> implements State<T> {

    /* JADX INFO: renamed from: a */
    public final TwoWayConverter f4350a;

    /* JADX INFO: renamed from: b */
    public final MutableState f4351b;

    /* JADX INFO: renamed from: c */
    public AnimationVector f4352c;

    /* JADX INFO: renamed from: d */
    public long f4353d;

    /* JADX INFO: renamed from: f */
    public long f4354f;

    /* JADX INFO: renamed from: g */
    public boolean f4355g;

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, int i) {
        this(twoWayConverter, obj, (i & 4) != 0 ? null : animationVector, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: e */
    public final Object m2278e() {
        return this.f4350a.mo2377b().invoke(this.f4352c);
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getF20325a() {
        return ((SnapshotMutableStateImpl) this.f4351b).getF20325a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(((SnapshotMutableStateImpl) this.f4351b).getF20325a());
        sb.append(", velocity=");
        sb.append(m2278e());
        sb.append(", isRunning=");
        sb.append(this.f4355g);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.f4353d);
        sb.append(", finishedTimeNanos=");
        return AbstractC0455a.m2240o(sb, this.f4354f, ')');
    }

    public AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j, long j2, boolean z2) {
        AnimationVector animationVectorM2286a;
        this.f4350a = twoWayConverter;
        this.f4351b = SnapshotStateKt.m4525g(obj);
        if (animationVector != null) {
            animationVectorM2286a = AnimationVectorsKt.m2286a(animationVector);
        } else {
            animationVectorM2286a = (AnimationVector) twoWayConverter.mo2376a().invoke(obj);
            animationVectorM2286a.mo2284d();
        }
        this.f4352c = animationVectorM2286a;
        this.f4353d = j;
        this.f4354f = j2;
        this.f4355g = z2;
    }
}
