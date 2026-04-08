package androidx.constraintlayout.compose;

import androidx.activity.compose.C0044a;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class State extends androidx.constraintlayout.core.state.State {

    /* JADX INFO: renamed from: k */
    public final Density f21032k;

    /* JADX INFO: renamed from: l */
    public long f21033l = ConstraintsKt.m6628b(0, 0, 15);

    public State(Density density) {
        this.f21032k = density;
        LayoutDirection layoutDirection = LayoutDirection.f20569a;
        this.f21633a = new C0044a(this, 7);
    }

    @Override // androidx.constraintlayout.core.state.State
    /* JADX INFO: renamed from: d */
    public final int mo6785d(Float f) {
        return super.mo6785d(f);
    }
}
