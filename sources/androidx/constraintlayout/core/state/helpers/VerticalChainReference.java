package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class VerticalChainReference extends ChainReference {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C13891 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21814a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f21814a = iArr;
            try {
                State.Chain chain = State.Chain.f21643a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f21814a;
                State.Chain chain2 = State.Chain.f21643a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f21814a;
                State.Chain chain3 = State.Chain.f21643a;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        State state;
        State.Constraint constraint;
        ArrayList arrayList = this.f21632n0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            state = this.f21630l0;
            if (!zHasNext) {
                break;
            } else {
                state.m6999c(it.next()).m6971h();
            }
        }
        Iterator it2 = arrayList.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            constraint = State.Constraint.f21659q;
            if (!zHasNext2) {
                break;
            }
            Object next = it2.next();
            ConstraintReference constraintReferenceM6999c = state.m6999c(next);
            State.Constraint constraint2 = State.Constraint.f21657o;
            if (constraintReference2 == null) {
                Object obj = this.f21557R;
                if (obj != null) {
                    constraintReferenceM6999c.m6979p(obj);
                    constraintReferenceM6999c.mo6974k(this.f21590n).m6976m(this.f21596t);
                } else {
                    Object obj2 = this.f21558S;
                    if (obj2 != null) {
                        constraintReferenceM6999c.f21573d0 = constraint2;
                        constraintReferenceM6999c.f21558S = obj2;
                        constraintReferenceM6999c.mo6974k(this.f21590n).m6976m(this.f21596t);
                    } else {
                        String string = constraintReferenceM6999c.f21566a.toString();
                        constraintReferenceM6999c.m6979p(0);
                        constraintReferenceM6999c.mo6975l(Float.valueOf(m7028w(string))).m6977n(Float.valueOf(m7027v(string)));
                    }
                }
                constraintReference2 = constraintReferenceM6999c;
            }
            if (constraintReference != null) {
                String string2 = constraintReference.f21566a.toString();
                String string3 = constraintReferenceM6999c.f21566a.toString();
                Object obj3 = constraintReferenceM6999c.f21566a;
                constraintReference.f21573d0 = constraint;
                constraintReference.f21560U = obj3;
                constraintReference.mo6975l(Float.valueOf(m7026u(string2))).m6977n(Float.valueOf(m7025t(string2)));
                Object obj4 = constraintReference.f21566a;
                constraintReferenceM6999c.f21573d0 = constraint2;
                constraintReferenceM6999c.f21558S = obj4;
                constraintReferenceM6999c.mo6975l(Float.valueOf(m7028w(string3))).m6977n(Float.valueOf(m7027v(string3)));
            }
            String string4 = next.toString();
            HashMap map = this.f21760p0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                constraintReferenceM6999c.f21578g = fFloatValue;
            }
            constraintReference = constraintReferenceM6999c;
        }
        if (constraintReference != null) {
            Object obj5 = this.f21560U;
            if (obj5 != null) {
                constraintReference.f21573d0 = constraint;
                constraintReference.f21560U = obj5;
                constraintReference.mo6974k(this.f21591o).m6976m(this.f21597u);
            } else {
                Object obj6 = this.f21561V;
                if (obj6 != null) {
                    constraintReference.m6968e(obj6);
                    constraintReference.mo6974k(this.f21591o).m6976m(this.f21597u);
                } else {
                    String string5 = constraintReference.f21566a.toString();
                    constraintReference.m6968e(0);
                    constraintReference.mo6975l(Float.valueOf(m7026u(string5))).m6977n(Float.valueOf(m7025t(string5)));
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f = this.f21759o0;
        if (f != 0.5f) {
            constraintReference2.f21582i = f;
        }
        int iOrdinal = this.f21765u0.ordinal();
        if (iOrdinal == 0) {
            constraintReference2.f21574e = 0;
        } else if (iOrdinal == 1) {
            constraintReference2.f21574e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            constraintReference2.f21574e = 2;
        }
    }
}
