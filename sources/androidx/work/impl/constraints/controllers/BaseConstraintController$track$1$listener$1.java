package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/work/impl/constraints/controllers/BaseConstraintController$track$1$listener$1", "Landroidx/work/impl/constraints/ConstraintListener;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BaseConstraintController$track$1$listener$1 implements ConstraintListener<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseConstraintController f32935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ProducerScope f32936b;

    public BaseConstraintController$track$1$listener$1(BaseConstraintController baseConstraintController, ProducerScope producerScope) {
        this.f32935a = baseConstraintController;
        this.f32936b = producerScope;
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    /* JADX INFO: renamed from: a */
    public final void mo12185a(Object obj) {
        BaseConstraintController baseConstraintController = this.f32935a;
        this.f32936b.mo20664e().mo11414v(baseConstraintController.mo12193e(obj) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.mo12192d()) : ConstraintsState.ConstraintsMet.f32895a);
    }
}
