package com.airbnb.lottie.compose;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class LottieAnimatableImpl implements LottieAnimatable {

    /* JADX INFO: renamed from: a */
    public final MutableState f34311a;

    /* JADX INFO: renamed from: b */
    public final MutableState f34312b;

    /* JADX INFO: renamed from: c */
    public final MutableState f34313c;

    /* JADX INFO: renamed from: d */
    public final MutableState f34314d;

    /* JADX INFO: renamed from: f */
    public final MutableState f34315f;

    /* JADX INFO: renamed from: g */
    public final MutableState f34316g;

    /* JADX INFO: renamed from: i */
    public final MutableState f34317i;

    /* JADX INFO: renamed from: j */
    public final State f34318j;

    /* JADX INFO: renamed from: n */
    public final MutableState f34319n;

    /* JADX INFO: renamed from: o */
    public final MutableState f34320o;

    /* JADX INFO: renamed from: p */
    public final MutableState f34321p;

    /* JADX INFO: renamed from: q */
    public final MutableState f34322q;

    /* JADX INFO: renamed from: r */
    public final State f34323r;

    /* JADX INFO: renamed from: s */
    public final State f34324s;

    /* JADX INFO: renamed from: t */
    public final MutatorMutex f34325t;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.f34311a = SnapshotStateKt.m4525g(bool);
        this.f34312b = SnapshotStateKt.m4525g(1);
        this.f34313c = SnapshotStateKt.m4525g(1);
        this.f34314d = SnapshotStateKt.m4525g(bool);
        this.f34315f = SnapshotStateKt.m4525g(null);
        this.f34316g = SnapshotStateKt.m4525g(Float.valueOf(1.0f));
        this.f34317i = SnapshotStateKt.m4525g(bool);
        this.f34318j = SnapshotStateKt.m4523e(new LottieAnimatableImpl$frameSpeed$2(this));
        this.f34319n = SnapshotStateKt.m4525g(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f34320o = SnapshotStateKt.m4525g(fValueOf);
        this.f34321p = SnapshotStateKt.m4525g(fValueOf);
        this.f34322q = SnapshotStateKt.m4525g(Long.MIN_VALUE);
        this.f34323r = SnapshotStateKt.m4523e(new LottieAnimatableImpl$endProgress$2(this));
        this.f34324s = SnapshotStateKt.m4523e(new LottieAnimatableImpl$isAtEnd$2(this));
        this.f34325t = new MutatorMutex();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m12630e(LottieAnimatableImpl lottieAnimatableImpl, int i, long j) {
        LottieComposition lottieCompositionMo12637r = lottieAnimatableImpl.mo12637r();
        if (lottieCompositionMo12637r == null) {
            return true;
        }
        MutableState mutableState = lottieAnimatableImpl.f34322q;
        long jLongValue = ((Number) ((SnapshotMutableStateImpl) mutableState).getF20325a()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((SnapshotMutableStateImpl) mutableState).getF20325a()).longValue();
        ((SnapshotMutableStateImpl) mutableState).setValue(Long.valueOf(j));
        LottieClipSpec lottieClipSpecMo12638t = lottieAnimatableImpl.mo12638t();
        float fMo12642b = lottieClipSpecMo12638t != null ? lottieClipSpecMo12638t.mo12642b(lottieCompositionMo12637r) : 0.0f;
        LottieClipSpec lottieClipSpecMo12638t2 = lottieAnimatableImpl.mo12638t();
        float fMo12641a = lottieClipSpecMo12638t2 != null ? lottieClipSpecMo12638t2.mo12641a(lottieCompositionMo12637r) : 1.0f;
        float fM12555b = (jLongValue / ((long) 1000000)) / lottieCompositionMo12637r.m12555b();
        State state = lottieAnimatableImpl.f34318j;
        float fFloatValue = ((Number) state.getF20325a()).floatValue() * fM12555b;
        float fFloatValue2 = ((Number) state.getF20325a()).floatValue();
        MutableState mutableState2 = lottieAnimatableImpl.f34320o;
        float fFloatValue3 = fFloatValue2 < 0.0f ? fMo12642b - (((Number) ((SnapshotMutableStateImpl) mutableState2).getF20325a()).floatValue() + fFloatValue) : (((Number) ((SnapshotMutableStateImpl) mutableState2).getF20325a()).floatValue() + fFloatValue) - fMo12641a;
        if (fFloatValue3 < 0.0f) {
            lottieAnimatableImpl.m12633i(RangesKt.m18655b(((Number) ((SnapshotMutableStateImpl) mutableState2).getF20325a()).floatValue(), fMo12642b, fMo12641a) + fFloatValue);
            return true;
        }
        float f = fMo12641a - fMo12642b;
        int i2 = (int) (fFloatValue3 / f);
        int i3 = i2 + 1;
        if (lottieAnimatableImpl.mo12636p() + i3 > i) {
            lottieAnimatableImpl.m12633i(((Number) lottieAnimatableImpl.f34323r.getF20325a()).floatValue());
            lottieAnimatableImpl.m12632h(i);
            return false;
        }
        lottieAnimatableImpl.m12632h(lottieAnimatableImpl.mo12636p() + i3);
        float f2 = fFloatValue3 - (i2 * f);
        lottieAnimatableImpl.m12633i(((Number) state.getF20325a()).floatValue() < 0.0f ? fMo12641a - f2 : fMo12642b + f2);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final void m12631g(LottieAnimatableImpl lottieAnimatableImpl, boolean z2) {
        ((SnapshotMutableStateImpl) lottieAnimatableImpl.f34311a).setValue(Boolean.valueOf(z2));
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getF20325a() {
        return Float.valueOf(mo12635o());
    }

    /* JADX INFO: renamed from: h */
    public final void m12632h(int i) {
        ((SnapshotMutableStateImpl) this.f34312b).setValue(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public final void m12633i(float f) {
        LottieComposition lottieCompositionMo12637r;
        ((SnapshotMutableStateImpl) this.f34320o).setValue(Float.valueOf(f));
        if (((Boolean) ((SnapshotMutableStateImpl) this.f34317i).getF20325a()).booleanValue() && (lottieCompositionMo12637r = mo12637r()) != null) {
            f -= f % (1 / lottieCompositionMo12637r.f34051m);
        }
        ((SnapshotMutableStateImpl) this.f34321p).setValue(Float.valueOf(f));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    /* JADX INFO: renamed from: k */
    public final Object mo12628k(LottieComposition lottieComposition, float f, boolean z2, Continuation continuation) {
        Object objM2493b = this.f34325t.m2493b(MutatePriority.f5091a, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f, z2, null), continuation);
        return objM2493b == CoroutineSingletons.f51584a ? objM2493b : Unit.f51459a;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    /* JADX INFO: renamed from: l */
    public final float mo12634l() {
        return ((Number) ((SnapshotMutableStateImpl) this.f34316g).getF20325a()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    /* JADX INFO: renamed from: o */
    public final float mo12635o() {
        return ((Number) ((SnapshotMutableStateImpl) this.f34321p).getF20325a()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    /* JADX INFO: renamed from: p */
    public final int mo12636p() {
        return ((Number) ((SnapshotMutableStateImpl) this.f34312b).getF20325a()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    /* JADX INFO: renamed from: r */
    public final LottieComposition mo12637r() {
        return (LottieComposition) ((SnapshotMutableStateImpl) this.f34319n).getF20325a();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    /* JADX INFO: renamed from: s */
    public final Object mo12629s(LottieComposition lottieComposition, int i, int i2, boolean z2, float f, LottieClipSpec lottieClipSpec, float f2, LottieCancellationBehavior lottieCancellationBehavior, Continuation continuation) {
        Object objM2493b = this.f34325t.m2493b(MutatePriority.f5091a, new LottieAnimatableImpl$animate$2(this, i, i2, z2, f, lottieClipSpec, lottieComposition, f2, lottieCancellationBehavior, null), continuation);
        return objM2493b == CoroutineSingletons.f51584a ? objM2493b : Unit.f51459a;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    /* JADX INFO: renamed from: t */
    public final LottieClipSpec mo12638t() {
        return (LottieClipSpec) ((SnapshotMutableStateImpl) this.f34315f).getF20325a();
    }
}
