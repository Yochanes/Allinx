package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/TimePickerStateImpl;", "Landroidx/compose/material3/TimePickerState;", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class TimePickerStateImpl implements TimePickerState {

    /* JADX INFO: renamed from: a */
    public final boolean f15226a;

    /* JADX INFO: renamed from: b */
    public final MutableState f15227b;

    /* JADX INFO: renamed from: c */
    public final MutableState f15228c;

    /* JADX INFO: renamed from: d */
    public final MutableIntState f15229d;

    /* JADX INFO: renamed from: e */
    public final MutableIntState f15230e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/TimePickerStateImpl$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TimePickerStateImpl(int i, int i2, boolean z2) {
        if (i < 0 || i >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i2 < 0 || i2 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f15226a = z2;
        this.f15227b = SnapshotStateKt.m4525g(new TimePickerSelectionMode(0));
        this.f15228c = SnapshotStateKt.m4525g(Boolean.valueOf(i >= 12));
        this.f15229d = SnapshotIntStateKt.m4516a(i % 12);
        this.f15230e = SnapshotIntStateKt.m4516a(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: a */
    public final void mo3852a(boolean z2) {
        ((SnapshotMutableStateImpl) this.f15228c).setValue(Boolean.valueOf(z2));
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: b */
    public final void mo3853b(int i) {
        mo3852a(i >= 12);
        ((SnapshotMutableIntStateImpl) this.f15229d).mo4393q(i % 12);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: c */
    public final void mo3854c(int i) {
        ((SnapshotMutableIntStateImpl) this.f15230e).mo4393q(i);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: d */
    public final int mo3855d() {
        return ((SnapshotMutableIntStateImpl) this.f15230e).mo4383f();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: e */
    public final void mo3856e(int i) {
        ((SnapshotMutableStateImpl) this.f15227b).setValue(new TimePickerSelectionMode(i));
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: f */
    public final int mo3857f() {
        return ((TimePickerSelectionMode) ((SnapshotMutableStateImpl) this.f15227b).getF20325a()).f15225a;
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF15226a() {
        return this.f15226a;
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: h */
    public final int mo3859h() {
        return ((SnapshotMutableIntStateImpl) this.f15229d).mo4383f() + (mo3860i() ? 12 : 0);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: i */
    public final boolean mo3860i() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f15228c).getF20325a()).booleanValue();
    }
}
