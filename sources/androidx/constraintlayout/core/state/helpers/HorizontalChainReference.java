package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalChainReference extends ChainReference {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C13881 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21813a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f21813a = iArr;
            try {
                State.Chain chain = State.Chain.f21643a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f21813a;
                State.Chain chain2 = State.Chain.f21643a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f21813a;
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
                state.m6999c(it.next()).m6970g();
            }
        }
        Iterator it2 = arrayList.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            constraint = State.Constraint.f21654i;
            if (!zHasNext2) {
                break;
            }
            Object next = it2.next();
            ConstraintReference constraintReferenceM6999c = state.m6999c(next);
            State.Constraint constraint2 = State.Constraint.f21653g;
            if (constraintReference2 == null) {
                Object obj = this.f21553N;
                if (obj != null) {
                    constraintReferenceM6999c.m6978o(obj);
                    constraintReferenceM6999c.mo6974k(this.f21588l).m6976m(this.f21594r);
                } else {
                    Object obj2 = this.f21554O;
                    if (obj2 != null) {
                        constraintReferenceM6999c.f21573d0 = constraint2;
                        constraintReferenceM6999c.f21554O = obj2;
                        constraintReferenceM6999c.mo6974k(this.f21588l).m6976m(this.f21594r);
                    } else {
                        Object obj3 = this.f21549J;
                        if (obj3 != null) {
                            constraintReferenceM6999c.m6978o(obj3);
                            constraintReferenceM6999c.mo6974k(this.f21584j).m6976m(this.f21592p);
                        } else {
                            Object obj4 = this.f21550K;
                            if (obj4 != null) {
                                constraintReferenceM6999c.f21573d0 = constraint2;
                                constraintReferenceM6999c.f21554O = obj4;
                                constraintReferenceM6999c.mo6974k(this.f21584j).m6976m(this.f21592p);
                            } else {
                                String string = constraintReferenceM6999c.f21566a.toString();
                                constraintReferenceM6999c.m6978o(0);
                                constraintReferenceM6999c.mo6975l(Float.valueOf(m7028w(string))).m6977n(Float.valueOf(m7027v(string)));
                            }
                        }
                    }
                }
                constraintReference2 = constraintReferenceM6999c;
            }
            if (constraintReference != null) {
                String string2 = constraintReference.f21566a.toString();
                String string3 = constraintReferenceM6999c.f21566a.toString();
                Object obj5 = constraintReferenceM6999c.f21566a;
                constraintReference.f21573d0 = constraint;
                constraintReference.f21555P = obj5;
                constraintReference.mo6975l(Float.valueOf(m7026u(string2))).m6977n(Float.valueOf(m7025t(string2)));
                Object obj6 = constraintReference.f21566a;
                constraintReferenceM6999c.f21573d0 = constraint2;
                constraintReferenceM6999c.f21554O = obj6;
                constraintReferenceM6999c.mo6975l(Float.valueOf(m7028w(string3))).m6977n(Float.valueOf(m7027v(string3)));
            }
            String string4 = next.toString();
            HashMap map = this.f21760p0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                constraintReferenceM6999c.f21576f = fFloatValue;
            }
            constraintReference = constraintReferenceM6999c;
        }
        if (constraintReference != null) {
            Object obj7 = this.f21555P;
            if (obj7 != null) {
                constraintReference.f21573d0 = constraint;
                constraintReference.f21555P = obj7;
                constraintReference.mo6974k(this.f21589m).m6976m(this.f21595s);
            } else {
                Object obj8 = this.f21556Q;
                if (obj8 != null) {
                    constraintReference.m6972i(obj8);
                    constraintReference.mo6974k(this.f21589m).m6976m(this.f21595s);
                } else {
                    Object obj9 = this.f21551L;
                    if (obj9 != null) {
                        constraintReference.f21573d0 = constraint;
                        constraintReference.f21555P = obj9;
                        constraintReference.mo6974k(this.f21586k).m6976m(this.f21593q);
                    } else {
                        Object obj10 = this.f21552M;
                        if (obj10 != null) {
                            constraintReference.m6972i(obj10);
                            constraintReference.mo6974k(this.f21586k).m6976m(this.f21593q);
                        } else {
                            String string5 = constraintReference.f21566a.toString();
                            constraintReference.m6972i(0);
                            constraintReference.mo6975l(Float.valueOf(m7026u(string5))).m6977n(Float.valueOf(m7025t(string5)));
                        }
                    }
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f = this.f21759o0;
        if (f != 0.5f) {
            constraintReference2.f21580h = f;
        }
        int iOrdinal = this.f21765u0.ordinal();
        if (iOrdinal == 0) {
            constraintReference2.f21572d = 0;
        } else if (iOrdinal == 1) {
            constraintReference2.f21572d = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            constraintReference2.f21572d = 2;
        }
    }
}
