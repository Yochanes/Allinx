package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "TransitionAnimationState", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class InfiniteTransition {

    /* JADX INFO: renamed from: a */
    public final MutableVector f4419a = new MutableVector(new TransitionAnimationState[16], 0);

    /* JADX INFO: renamed from: b */
    public final MutableState f4420b = SnapshotStateKt.m4525g(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public long f4421c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public final MutableState f4422d = SnapshotStateKt.m4525g(Boolean.TRUE);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* JADX INFO: renamed from: a */
        public Object f4423a;

        /* JADX INFO: renamed from: b */
        public Object f4424b;

        /* JADX INFO: renamed from: c */
        public final TwoWayConverter f4425c;

        /* JADX INFO: renamed from: d */
        public final MutableState f4426d;

        /* JADX INFO: renamed from: f */
        public AnimationSpec f4427f;

        /* JADX INFO: renamed from: g */
        public TargetBasedAnimation f4428g;

        /* JADX INFO: renamed from: i */
        public boolean f4429i;

        /* JADX INFO: renamed from: j */
        public boolean f4430j;

        /* JADX INFO: renamed from: n */
        public long f4431n;

        public TransitionAnimationState(Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec) {
            this.f4423a = obj;
            this.f4424b = obj2;
            this.f4425c = twoWayConverter;
            this.f4426d = SnapshotStateKt.m4525g(obj);
            this.f4427f = infiniteRepeatableSpec;
            this.f4428g = new TargetBasedAnimation(infiniteRepeatableSpec, twoWayConverter, this.f4423a, this.f4424b, null);
        }

        @Override // androidx.compose.runtime.State
        /* JADX INFO: renamed from: getValue */
        public final Object getF20325a() {
            return ((SnapshotMutableStateImpl) this.f4426d).getF20325a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2300a(Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(-318043801);
        int i2 = (composerImplMo4239q.mo4235m(this) ? 4 : 2) | i;
        if (composerImplMo4239q.mo4212E(i2 & 1, (i2 & 3) != 2)) {
            Object objMo4229g = composerImplMo4239q.mo4229g();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f16228a;
            if (objMo4229g == composer$Companion$Empty$1) {
                objMo4229g = SnapshotStateKt.m4525g(null);
                composerImplMo4239q.mo4214G(objMo4229g);
            }
            MutableState mutableState = (MutableState) objMo4229g;
            if (((Boolean) ((SnapshotMutableStateImpl) this.f4422d).getF20325a()).booleanValue() || ((Boolean) ((SnapshotMutableStateImpl) this.f4420b).getF20325a()).booleanValue()) {
                composerImplMo4239q.mo4221N(1719883733);
                boolean zMo4235m = composerImplMo4239q.mo4235m(this);
                Object objMo4229g2 = composerImplMo4239q.mo4229g();
                if (zMo4235m || objMo4229g2 == composer$Companion$Empty$1) {
                    objMo4229g2 = new InfiniteTransition$run$1$1(mutableState, this, null);
                    composerImplMo4239q.mo4214G(objMo4229g2);
                }
                EffectsKt.m4372e(composerImplMo4239q, this, (Function2) objMo4229g2);
                composerImplMo4239q.m4265W(false);
            } else {
                composerImplMo4239q.mo4221N(1721270456);
                composerImplMo4239q.m4265W(false);
            }
        } else {
            composerImplMo4239q.mo4246x();
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new InfiniteTransition$run$2(this, i);
        }
    }
}
