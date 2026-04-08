package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PressGestureScopeImpl implements PressGestureScope, Density {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Density f5833a;

    /* JADX INFO: renamed from: b */
    public boolean f5834b;

    /* JADX INFO: renamed from: c */
    public boolean f5835c;

    /* JADX INFO: renamed from: d */
    public final MutexImpl f5836d = new MutexImpl(false);

    public PressGestureScopeImpl(Density density) {
        this.f5833a = density;
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: G */
    public final long mo2549G(long j) {
        return this.f5833a.mo2549G(j);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: S0 */
    public final float getF20557b() {
        return this.f5833a.getF20557b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /* JADX INFO: renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2634V(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuationImpl instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuationImpl;
            int i = pressGestureScopeImpl$tryAwaitRelease$1.f5847d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.f5847d = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
            }
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.f5845b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pressGestureScopeImpl$tryAwaitRelease$1.f5847d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            if (this.f5834b || this.f5835c) {
                pressGestureScopeImpl = this;
                return Boolean.valueOf(pressGestureScopeImpl.f5834b);
            }
            MutexImpl mutexImpl = this.f5836d;
            pressGestureScopeImpl$tryAwaitRelease$1.f5844a = this;
            pressGestureScopeImpl$tryAwaitRelease$1.f5847d = 1;
            if (mutexImpl.mo20909a(pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            pressGestureScopeImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = pressGestureScopeImpl$tryAwaitRelease$1.f5844a;
            ResultKt.m18313b(obj);
        }
        pressGestureScopeImpl.f5836d.mo20911c(null);
        return Boolean.valueOf(pressGestureScopeImpl.f5834b);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: X0 */
    public final float mo2551X0(float f) {
        return this.f5833a.mo2551X0(f);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: d1 */
    public final int mo2553d1(long j) {
        return this.f5833a.mo2553d1(j);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getF20556a() {
        return this.f5833a.getF20556a();
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: k1 */
    public final int mo2554k1(float f) {
        return this.f5833a.mo2554k1(f);
    }

    /* JADX INFO: renamed from: m */
    public final void m2636m() {
        this.f5835c = true;
        MutexImpl mutexImpl = this.f5836d;
        if (mutexImpl.mo20910b()) {
            mutexImpl.mo20911c(null);
        }
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: n */
    public final long mo2555n(float f) {
        return this.f5833a.mo2555n(f);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: o */
    public final long mo2556o(long j) {
        return this.f5833a.mo2556o(j);
    }

    /* JADX INFO: renamed from: p */
    public final void m2637p() {
        this.f5834b = true;
        MutexImpl mutexImpl = this.f5836d;
        if (mutexImpl.mo20910b()) {
            mutexImpl.mo20911c(null);
        }
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: q */
    public final float mo2557q(long j) {
        return this.f5833a.mo2557q(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2638s(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuationImpl instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuationImpl;
            int i = pressGestureScopeImpl$reset$1.f5843d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.f5843d = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
            }
        }
        Object obj = pressGestureScopeImpl$reset$1.f5841b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pressGestureScopeImpl$reset$1.f5843d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            MutexImpl mutexImpl = this.f5836d;
            pressGestureScopeImpl$reset$1.f5840a = this;
            pressGestureScopeImpl$reset$1.f5843d = 1;
            if (mutexImpl.mo20909a(pressGestureScopeImpl$reset$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            pressGestureScopeImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = pressGestureScopeImpl$reset$1.f5840a;
            ResultKt.m18313b(obj);
        }
        pressGestureScopeImpl.f5834b = false;
        pressGestureScopeImpl.f5835c = false;
        return Unit.f51459a;
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: t */
    public final long mo2559t(int i) {
        return this.f5833a.mo2559t(i);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: u */
    public final long mo2561u(float f) {
        return this.f5833a.mo2561u(f);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: v */
    public final float mo2562v(int i) {
        return this.f5833a.mo2562v(i);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: w */
    public final float mo2563w(float f) {
        return this.f5833a.mo2563w(f);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: x1 */
    public final float mo2565x1(long j) {
        return this.f5833a.mo2565x1(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /* JADX INFO: renamed from: z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2635z1(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        if (continuationImpl instanceof PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (PressGestureScopeImpl$awaitRelease$1) continuationImpl;
            int i = pressGestureScopeImpl$awaitRelease$1.f5839c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$awaitRelease$1.f5839c = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, continuationImpl);
            }
        }
        Object objMo2634V = pressGestureScopeImpl$awaitRelease$1.f5837a;
        Object obj = CoroutineSingletons.f51584a;
        int i2 = pressGestureScopeImpl$awaitRelease$1.f5839c;
        if (i2 == 0) {
            ResultKt.m18313b(objMo2634V);
            pressGestureScopeImpl$awaitRelease$1.f5839c = 1;
            objMo2634V = mo2634V(pressGestureScopeImpl$awaitRelease$1);
            if (objMo2634V == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objMo2634V);
        }
        if (((Boolean) objMo2634V).booleanValue()) {
            return Unit.f51459a;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }
}
