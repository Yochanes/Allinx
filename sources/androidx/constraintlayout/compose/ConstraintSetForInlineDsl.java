package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.activity.compose.C0044a;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/runtime/RememberObserver;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayoutScope f20889a;

    /* JADX INFO: renamed from: b */
    public Handler f20890b;

    /* JADX INFO: renamed from: c */
    public final SnapshotStateObserver f20891c = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));

    /* JADX INFO: renamed from: d */
    public boolean f20892d = true;

    /* JADX INFO: renamed from: f */
    public final Function1 f20893f = new ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1(this);

    /* JADX INFO: renamed from: g */
    public final ArrayList f20894g = new ArrayList();

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        this.f20889a = constraintLayoutScope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    /* JADX INFO: renamed from: a */
    public final void mo6758a(State state, List list) {
        this.f20894g.clear();
        this.f20891c.m4838e(Unit.f51459a, this.f20893f, new ConstraintSetForInlineDsl$applyTo$1(list, this, state));
        this.f20892d = false;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    /* JADX INFO: renamed from: b */
    public final boolean mo6759b(List list) {
        if (this.f20892d) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.f20894g;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Object objMo5613s = ((Measurable) list.get(i)).mo5613s();
            if (!Intrinsics.m18594b(objMo5613s instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) objMo5613s : null, arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SnapshotStateObserver snapshotStateObserver = this.f20891c;
        C0044a c0044a = snapshotStateObserver.f17081h;
        if (c0044a != null) {
            c0044a.dispose();
        }
        snapshotStateObserver.m4835b();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f20891c.m4839f();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }
}
