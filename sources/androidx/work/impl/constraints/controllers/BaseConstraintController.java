package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "T", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class BaseConstraintController<T> implements ConstraintController {

    /* JADX INFO: renamed from: a */
    public final ConstraintTracker f32929a;

    public BaseConstraintController(ConstraintTracker tracker) {
        Intrinsics.m18599g(tracker, "tracker");
        this.f32929a = tracker;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* JADX INFO: renamed from: a */
    public final Flow mo12186a(Constraints constraints) {
        Intrinsics.m18599g(constraints, "constraints");
        return FlowKt.m20744d(new BaseConstraintController$track$1(this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* JADX INFO: renamed from: c */
    public final boolean mo12188c(WorkSpec workSpec) {
        return mo12187b(workSpec) && mo12193e(this.f32929a.mo12194a());
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo12192d();

    /* JADX INFO: renamed from: e */
    public boolean mo12193e(Object obj) {
        return false;
    }
}
