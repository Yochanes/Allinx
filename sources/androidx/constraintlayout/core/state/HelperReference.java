package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class HelperReference extends ConstraintReference implements Facade {

    /* JADX INFO: renamed from: l0 */
    public final State f21630l0;

    /* JADX INFO: renamed from: m0 */
    public final State.Helper f21631m0;

    /* JADX INFO: renamed from: n0 */
    public final ArrayList f21632n0;

    public HelperReference(State state, State.Helper helper) {
        super(state);
        this.f21632n0 = new ArrayList();
        this.f21630l0 = state;
        this.f21631m0 = helper;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    /* JADX INFO: renamed from: b */
    public final ConstraintWidget mo6965b() {
        return mo6996s();
    }

    /* JADX INFO: renamed from: q */
    public final void m6994q(Object... objArr) {
        Collections.addAll(this.f21632n0, objArr);
    }

    /* JADX INFO: renamed from: r */
    public final void m6995r() {
        super.apply();
    }

    /* JADX INFO: renamed from: s */
    public HelperWidget mo6996s() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
    }
}
