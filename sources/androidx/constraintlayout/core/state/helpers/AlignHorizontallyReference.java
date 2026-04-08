package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AlignHorizontallyReference extends HelperReference {

    /* JADX INFO: renamed from: o0 */
    public float f21753o0;

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        Iterator it = this.f21632n0.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceM6999c = this.f21630l0.m6999c(it.next());
            constraintReferenceM6999c.m6970g();
            Object obj = this.f21553N;
            if (obj != null) {
                constraintReferenceM6999c.m6978o(obj);
            } else {
                Object obj2 = this.f21554O;
                if (obj2 != null) {
                    constraintReferenceM6999c.f21573d0 = State.Constraint.f21653g;
                    constraintReferenceM6999c.f21554O = obj2;
                } else {
                    constraintReferenceM6999c.m6978o(0);
                }
            }
            Object obj3 = this.f21555P;
            if (obj3 != null) {
                constraintReferenceM6999c.f21573d0 = State.Constraint.f21654i;
                constraintReferenceM6999c.f21555P = obj3;
            } else {
                Object obj4 = this.f21556Q;
                if (obj4 != null) {
                    constraintReferenceM6999c.m6972i(obj4);
                } else {
                    constraintReferenceM6999c.m6972i(0);
                }
            }
            float f = this.f21753o0;
            if (f != 0.5f) {
                constraintReferenceM6999c.f21580h = f;
            }
        }
    }
}
