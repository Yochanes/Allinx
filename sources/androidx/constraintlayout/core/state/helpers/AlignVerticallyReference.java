package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AlignVerticallyReference extends HelperReference {

    /* JADX INFO: renamed from: o0 */
    public float f21754o0;

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        Iterator it = this.f21632n0.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceM6999c = this.f21630l0.m6999c(it.next());
            constraintReferenceM6999c.m6971h();
            Object obj = this.f21557R;
            if (obj != null) {
                constraintReferenceM6999c.m6979p(obj);
            } else {
                Object obj2 = this.f21558S;
                if (obj2 != null) {
                    constraintReferenceM6999c.f21573d0 = State.Constraint.f21657o;
                    constraintReferenceM6999c.f21558S = obj2;
                } else {
                    constraintReferenceM6999c.m6979p(0);
                }
            }
            Object obj3 = this.f21560U;
            if (obj3 != null) {
                constraintReferenceM6999c.f21573d0 = State.Constraint.f21659q;
                constraintReferenceM6999c.f21560U = obj3;
            } else {
                Object obj4 = this.f21561V;
                if (obj4 != null) {
                    constraintReferenceM6999c.m6968e(obj4);
                } else {
                    constraintReferenceM6999c.m6968e(0);
                }
            }
            float f = this.f21754o0;
            if (f != 0.5f) {
                constraintReferenceM6999c.f21582i = f;
            }
        }
    }
}
