package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/AnalogTimePickerState;", "Landroidx/compose/material3/TimePickerState;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AnalogTimePickerState implements TimePickerState {

    /* JADX INFO: renamed from: a */
    public final TimePickerState f12022a;

    /* JADX INFO: renamed from: b */
    public float f12023b;

    /* JADX INFO: renamed from: c */
    public float f12024c;

    /* JADX INFO: renamed from: d */
    public Animatable f12025d;

    /* JADX INFO: renamed from: e */
    public final MutatorMutex f12026e = new MutatorMutex();

    public AnalogTimePickerState(TimePickerState timePickerState) {
        this.f12022a = timePickerState;
        this.f12023b = ((timePickerState.mo3859h() % 12) * 0.5235988f) - 1.5707964f;
        this.f12024c = (timePickerState.mo3855d() * 0.10471976f) - 1.5707964f;
        this.f12025d = AnimatableKt.m2260a(this.f12023b);
    }

    /* JADX INFO: renamed from: k */
    public static float m3851k(float f) {
        double d = ((double) f) % 6.283185307179586d;
        if (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: a */
    public final void mo3852a(boolean z2) {
        this.f12022a.mo3852a(z2);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: b */
    public final void mo3853b(int i) {
        this.f12023b = ((i % 12) * 0.5235988f) - 1.5707964f;
        TimePickerState timePickerState = this.f12022a;
        timePickerState.mo3853b(i);
        if (timePickerState.mo3857f() == 0) {
            this.f12025d = AnimatableKt.m2260a(this.f12023b);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: c */
    public final void mo3854c(int i) {
        this.f12024c = (i * 0.10471976f) - 1.5707964f;
        TimePickerState timePickerState = this.f12022a;
        timePickerState.mo3854c(i);
        if (timePickerState.mo3857f() == 1) {
            this.f12025d = AnimatableKt.m2260a(this.f12024c);
        }
        Snapshot snapshotM4786a = Snapshot.Companion.m4786a();
        Function1 function1Mo4767e = snapshotM4786a != null ? snapshotM4786a.mo4767e() : null;
        Snapshot snapshotM4787b = Snapshot.Companion.m4787b(snapshotM4786a);
        try {
            timePickerState.mo3854c(timePickerState.mo3855d());
        } finally {
            Snapshot.Companion.m4790e(snapshotM4786a, snapshotM4787b, function1Mo4767e);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: d */
    public final int mo3855d() {
        return this.f12022a.mo3855d();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: e */
    public final void mo3856e(int i) {
        this.f12022a.mo3856e(i);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: f */
    public final int mo3857f() {
        return this.f12022a.mo3857f();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: g */
    public final boolean getF15226a() {
        return this.f12022a.getF15226a();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: h */
    public final int mo3859h() {
        return this.f12022a.mo3859h();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: i */
    public final boolean mo3860i() {
        return this.f12022a.mo3860i();
    }

    /* JADX INFO: renamed from: j */
    public final float m3861j(float f) {
        float fFloatValue = ((Number) this.f12025d.m2256e()).floatValue() - f;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.f12025d.m2256e()).floatValue() - fFloatValue;
    }
}
