package androidx.constraintlayout.core.state;

import androidx.activity.compose.C0044a;
import androidx.compose.animation.AbstractC0455a;
import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class State {

    /* JADX INFO: renamed from: a */
    public C0044a f21633a;

    /* JADX INFO: renamed from: b */
    public boolean f21634b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f21635c;

    /* JADX INFO: renamed from: d */
    public final HashMap f21636d;

    /* JADX INFO: renamed from: e */
    public final HashMap f21637e;

    /* JADX INFO: renamed from: f */
    public final ConstraintReference f21638f;

    /* JADX INFO: renamed from: g */
    public int f21639g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f21640h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f21641i;

    /* JADX INFO: renamed from: j */
    public boolean f21642j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Chain {

        /* JADX INFO: renamed from: a */
        public static final Chain f21643a;

        /* JADX INFO: renamed from: b */
        public static final Chain f21644b;

        /* JADX INFO: renamed from: c */
        public static final Chain f21645c;

        /* JADX INFO: renamed from: d */
        public static final HashMap f21646d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ Chain[] f21647f;

        static {
            Chain chain = new Chain("SPREAD", 0);
            f21643a = chain;
            Chain chain2 = new Chain("SPREAD_INSIDE", 1);
            f21644b = chain2;
            Chain chain3 = new Chain("PACKED", 2);
            f21645c = chain3;
            f21647f = new Chain[]{chain, chain2, chain3};
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            f21646d = map2;
            map.put("packed", chain3);
            map.put("spread_inside", chain2);
            map.put("spread", chain);
            AbstractC0455a.m2222A(2, map2, "packed", 1, "spread_inside");
            map2.put("spread", 0);
        }

        /* JADX INFO: renamed from: a */
        public static int m7003a(String str) {
            HashMap map = f21646d;
            if (map.containsKey(str)) {
                return ((Integer) map.get(str)).intValue();
            }
            return -1;
        }

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) f21647f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Constraint {

        /* JADX INFO: renamed from: a */
        public static final Constraint f21648a;

        /* JADX INFO: renamed from: b */
        public static final Constraint f21649b;

        /* JADX INFO: renamed from: c */
        public static final Constraint f21650c;

        /* JADX INFO: renamed from: d */
        public static final Constraint f21651d;

        /* JADX INFO: renamed from: f */
        public static final Constraint f21652f;

        /* JADX INFO: renamed from: g */
        public static final Constraint f21653g;

        /* JADX INFO: renamed from: i */
        public static final Constraint f21654i;

        /* JADX INFO: renamed from: j */
        public static final Constraint f21655j;

        /* JADX INFO: renamed from: n */
        public static final Constraint f21656n;

        /* JADX INFO: renamed from: o */
        public static final Constraint f21657o;

        /* JADX INFO: renamed from: p */
        public static final Constraint f21658p;

        /* JADX INFO: renamed from: q */
        public static final Constraint f21659q;

        /* JADX INFO: renamed from: r */
        public static final Constraint f21660r;

        /* JADX INFO: renamed from: s */
        public static final Constraint f21661s;

        /* JADX INFO: renamed from: t */
        public static final Constraint f21662t;

        /* JADX INFO: renamed from: u */
        public static final Constraint f21663u;

        /* JADX INFO: renamed from: v */
        public static final Constraint f21664v;

        /* JADX INFO: renamed from: w */
        public static final Constraint f21665w;

        /* JADX INFO: renamed from: x */
        public static final /* synthetic */ Constraint[] f21666x;

        static {
            Constraint constraint = new Constraint("LEFT_TO_LEFT", 0);
            f21648a = constraint;
            Constraint constraint2 = new Constraint("LEFT_TO_RIGHT", 1);
            f21649b = constraint2;
            Constraint constraint3 = new Constraint("RIGHT_TO_LEFT", 2);
            f21650c = constraint3;
            Constraint constraint4 = new Constraint("RIGHT_TO_RIGHT", 3);
            f21651d = constraint4;
            Constraint constraint5 = new Constraint("START_TO_START", 4);
            f21652f = constraint5;
            Constraint constraint6 = new Constraint("START_TO_END", 5);
            f21653g = constraint6;
            Constraint constraint7 = new Constraint("END_TO_START", 6);
            f21654i = constraint7;
            Constraint constraint8 = new Constraint("END_TO_END", 7);
            f21655j = constraint8;
            Constraint constraint9 = new Constraint("TOP_TO_TOP", 8);
            f21656n = constraint9;
            Constraint constraint10 = new Constraint("TOP_TO_BOTTOM", 9);
            f21657o = constraint10;
            Constraint constraint11 = new Constraint("TOP_TO_BASELINE", 10);
            f21658p = constraint11;
            Constraint constraint12 = new Constraint("BOTTOM_TO_TOP", 11);
            f21659q = constraint12;
            Constraint constraint13 = new Constraint("BOTTOM_TO_BOTTOM", 12);
            f21660r = constraint13;
            Constraint constraint14 = new Constraint("BOTTOM_TO_BASELINE", 13);
            f21661s = constraint14;
            Constraint constraint15 = new Constraint("BASELINE_TO_BASELINE", 14);
            f21662t = constraint15;
            Constraint constraint16 = new Constraint("BASELINE_TO_TOP", 15);
            f21663u = constraint16;
            Constraint constraint17 = new Constraint("BASELINE_TO_BOTTOM", 16);
            f21664v = constraint17;
            Constraint constraint18 = new Constraint("CENTER_HORIZONTALLY", 17);
            Constraint constraint19 = new Constraint("CENTER_VERTICALLY", 18);
            Constraint constraint20 = new Constraint("CIRCULAR_CONSTRAINT", 19);
            f21665w = constraint20;
            f21666x = new Constraint[]{constraint, constraint2, constraint3, constraint4, constraint5, constraint6, constraint7, constraint8, constraint9, constraint10, constraint11, constraint12, constraint13, constraint14, constraint15, constraint16, constraint17, constraint18, constraint19, constraint20};
        }

        public static Constraint valueOf(String str) {
            return (Constraint) Enum.valueOf(Constraint.class, str);
        }

        public static Constraint[] values() {
            return (Constraint[]) f21666x.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Direction {

        /* JADX INFO: renamed from: a */
        public static final Direction f21667a;

        /* JADX INFO: renamed from: b */
        public static final Direction f21668b;

        /* JADX INFO: renamed from: c */
        public static final Direction f21669c;

        /* JADX INFO: renamed from: d */
        public static final Direction f21670d;

        /* JADX INFO: renamed from: f */
        public static final Direction f21671f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ Direction[] f21672g;

        static {
            Direction direction = new Direction("LEFT", 0);
            f21667a = direction;
            Direction direction2 = new Direction("RIGHT", 1);
            f21668b = direction2;
            Direction direction3 = new Direction("START", 2);
            Direction direction4 = new Direction("END", 3);
            f21669c = direction4;
            Direction direction5 = new Direction("TOP", 4);
            f21670d = direction5;
            Direction direction6 = new Direction("BOTTOM", 5);
            f21671f = direction6;
            f21672g = new Direction[]{direction, direction2, direction3, direction4, direction5, direction6};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f21672g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Helper {

        /* JADX INFO: renamed from: a */
        public static final Helper f21673a;

        /* JADX INFO: renamed from: b */
        public static final Helper f21674b;

        /* JADX INFO: renamed from: c */
        public static final Helper f21675c;

        /* JADX INFO: renamed from: d */
        public static final Helper f21676d;

        /* JADX INFO: renamed from: f */
        public static final Helper f21677f;

        /* JADX INFO: renamed from: g */
        public static final Helper f21678g;

        /* JADX INFO: renamed from: i */
        public static final Helper f21679i;

        /* JADX INFO: renamed from: j */
        public static final Helper f21680j;

        /* JADX INFO: renamed from: n */
        public static final Helper f21681n;

        /* JADX INFO: renamed from: o */
        public static final /* synthetic */ Helper[] f21682o;

        static {
            Helper helper = new Helper("HORIZONTAL_CHAIN", 0);
            f21673a = helper;
            Helper helper2 = new Helper("VERTICAL_CHAIN", 1);
            f21674b = helper2;
            Helper helper3 = new Helper("ALIGN_HORIZONTALLY", 2);
            Helper helper4 = new Helper("ALIGN_VERTICALLY", 3);
            f21675c = helper4;
            Helper helper5 = new Helper("BARRIER", 4);
            f21676d = helper5;
            Helper helper6 = new Helper("LAYER", 5);
            Helper helper7 = new Helper("HORIZONTAL_FLOW", 6);
            f21677f = helper7;
            Helper helper8 = new Helper("VERTICAL_FLOW", 7);
            f21678g = helper8;
            Helper helper9 = new Helper("GRID", 8);
            f21679i = helper9;
            Helper helper10 = new Helper("ROW", 9);
            f21680j = helper10;
            Helper helper11 = new Helper("COLUMN", 10);
            f21681n = helper11;
            f21682o = new Helper[]{helper, helper2, helper3, helper4, helper5, helper6, helper7, helper8, helper9, helper10, helper11, new Helper("FLOW", 11)};
        }

        public static Helper valueOf(String str) {
            return (Helper) Enum.valueOf(Helper.class, str);
        }

        public static Helper[] values() {
            return (Helper[]) f21682o.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Wrap {

        /* JADX INFO: renamed from: a */
        public static final HashMap f21683a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Wrap[] f21684b;

        /* JADX INFO: Fake field, exist only in values array */
        Wrap EF0;

        static {
            Wrap wrap = new Wrap("NONE", 0);
            Wrap wrap2 = new Wrap("CHAIN", 1);
            Wrap wrap3 = new Wrap("ALIGNED", 2);
            f21684b = new Wrap[]{wrap, wrap2, wrap3};
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            f21683a = map2;
            map.put("none", wrap);
            map.put("chain", wrap2);
            map.put("aligned", wrap3);
            AbstractC0455a.m2222A(0, map2, "none", 3, "chain");
            map2.put("aligned", 2);
        }

        public static Wrap valueOf(String str) {
            return (Wrap) Enum.valueOf(Wrap.class, str);
        }

        public static Wrap[] values() {
            return (Wrap[]) f21684b.clone();
        }
    }

    public State() {
        HashMap map = new HashMap();
        this.f21635c = map;
        this.f21636d = new HashMap();
        this.f21637e = new HashMap();
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.f21638f = constraintReference;
        this.f21639g = 0;
        this.f21640h = new ArrayList();
        this.f21641i = new ArrayList();
        this.f21642j = true;
        constraintReference.f21566a = 0;
        map.put(0, constraintReference);
    }

    /* JADX INFO: renamed from: a */
    public final void m6997a(ConstraintWidgetContainer constraintWidgetContainer) {
        HashMap map;
        HelperReference helperReference;
        HelperWidget helperWidgetMo6996s;
        HelperWidget helperWidgetMo6996s2;
        constraintWidgetContainer.f22040v0.clear();
        ConstraintReference constraintReference = this.f21638f;
        constraintReference.f21575e0.m6993a(constraintWidgetContainer, 0);
        constraintReference.f21577f0.m6993a(constraintWidgetContainer, 1);
        HashMap map2 = this.f21636d;
        Iterator it = map2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f21635c;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            HelperWidget helperWidgetMo6996s3 = ((HelperReference) map2.get(next)).mo6996s();
            if (helperWidgetMo6996s3 != null) {
                Reference referenceM6999c = (Reference) map.get(next);
                if (referenceM6999c == null) {
                    referenceM6999c = m6999c(next);
                }
                referenceM6999c.mo6964a(helperWidgetMo6996s3);
            }
        }
        for (Object obj : map.keySet()) {
            Reference reference = (Reference) map.get(obj);
            if (reference != constraintReference && (reference.mo6966c() instanceof HelperReference) && (helperWidgetMo6996s2 = ((HelperReference) reference.mo6966c()).mo6996s()) != null) {
                Reference referenceM6999c2 = (Reference) map.get(obj);
                if (referenceM6999c2 == null) {
                    referenceM6999c2 = m6999c(obj);
                }
                referenceM6999c2.mo6964a(helperWidgetMo6996s2);
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            Reference reference2 = (Reference) map.get(it2.next());
            if (reference2 != constraintReference) {
                ConstraintWidget constraintWidgetMo6965b = reference2.mo6965b();
                constraintWidgetMo6965b.f21924l0 = reference2.getKey().toString();
                constraintWidgetMo6965b.f21897W = null;
                if (reference2.mo6966c() instanceof GuidelineReference) {
                    reference2.apply();
                }
                constraintWidgetContainer.m7127b(constraintWidgetMo6965b);
            } else {
                reference2.mo6964a(constraintWidgetContainer);
            }
        }
        Iterator it3 = map2.keySet().iterator();
        while (it3.hasNext()) {
            HelperReference helperReference2 = (HelperReference) map2.get(it3.next());
            if (helperReference2.mo6996s() != null) {
                Iterator it4 = helperReference2.f21632n0.iterator();
                while (it4.hasNext()) {
                    helperReference2.mo6996s().mo7121b(((Reference) map.get(it4.next())).mo6965b());
                }
                helperReference2.apply();
            } else {
                helperReference2.apply();
            }
        }
        Iterator it5 = map.keySet().iterator();
        while (it5.hasNext()) {
            Reference reference3 = (Reference) map.get(it5.next());
            if (reference3 != constraintReference && (reference3.mo6966c() instanceof HelperReference) && (helperWidgetMo6996s = (helperReference = (HelperReference) reference3.mo6966c()).mo6996s()) != null) {
                for (Object obj2 : helperReference.f21632n0) {
                    Reference reference4 = (Reference) map.get(obj2);
                    if (reference4 != null) {
                        helperWidgetMo6996s.mo7121b(reference4.mo6965b());
                    } else if (obj2 instanceof Reference) {
                        helperWidgetMo6996s.mo7121b(((Reference) obj2).mo6965b());
                    } else {
                        System.out.println("couldn't find reference for " + obj2);
                    }
                }
                reference3.apply();
            }
        }
        for (Object obj3 : map.keySet()) {
            Reference reference5 = (Reference) map.get(obj3);
            reference5.apply();
            ConstraintWidget constraintWidgetMo6965b2 = reference5.mo6965b();
            if (constraintWidgetMo6965b2 != null && obj3 != null) {
                constraintWidgetMo6965b2.f21921k = obj3.toString();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6998b(Object obj) {
        this.f21640h.add(obj);
        this.f21642j = true;
    }

    /* JADX INFO: renamed from: c */
    public final ConstraintReference m6999c(Object obj) {
        HashMap map = this.f21635c;
        Reference reference = (Reference) map.get(obj);
        Object obj2 = reference;
        if (reference == null) {
            ConstraintReference constraintReference = new ConstraintReference(this);
            map.put(obj, constraintReference);
            constraintReference.f21566a = obj;
            obj2 = constraintReference;
        }
        if (obj2 instanceof ConstraintReference) {
            return (ConstraintReference) obj2;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public int mo6785d(Float f) {
        return Math.round(f.floatValue());
    }

    /* JADX INFO: renamed from: e */
    public final GuidelineReference m7000e(int i, String str) {
        ConstraintReference constraintReferenceM6999c = m6999c(str);
        Object obj = constraintReferenceM6999c.f21570c;
        if (obj == null || !(obj instanceof GuidelineReference)) {
            GuidelineReference guidelineReference = new GuidelineReference(this);
            guidelineReference.f21807b = i;
            guidelineReference.f21812g = str;
            constraintReferenceM6999c.f21570c = guidelineReference;
            constraintReferenceM6999c.mo6964a(guidelineReference.mo6965b());
        }
        return (GuidelineReference) constraintReferenceM6999c.f21570c;
    }

    /* JADX INFO: renamed from: f */
    public final HelperReference m7001f(Helper helper) {
        HelperReference horizontalChainReference;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i = this.f21639g;
        this.f21639g = i + 1;
        String strM11h = AbstractC0000a.m11h(i, "__", sb);
        HashMap map = this.f21636d;
        HelperReference helperReference = (HelperReference) map.get(strM11h);
        HelperReference helperReference2 = helperReference;
        if (helperReference == null) {
            int iOrdinal = helper.ordinal();
            Helper helper2 = Helper.f21675c;
            switch (iOrdinal) {
                case 0:
                    horizontalChainReference = new HorizontalChainReference(this, Helper.f21673a);
                    break;
                case 1:
                    horizontalChainReference = new VerticalChainReference(this, Helper.f21674b);
                    break;
                case 2:
                    AlignHorizontallyReference alignHorizontallyReference = new AlignHorizontallyReference(this, helper2);
                    alignHorizontallyReference.f21753o0 = 0.5f;
                    horizontalChainReference = alignHorizontallyReference;
                    break;
                case 3:
                    AlignVerticallyReference alignVerticallyReference = new AlignVerticallyReference(this, helper2);
                    alignVerticallyReference.f21754o0 = 0.5f;
                    horizontalChainReference = alignVerticallyReference;
                    break;
                case 4:
                    horizontalChainReference = new BarrierReference(this);
                    break;
                case 5:
                default:
                    horizontalChainReference = new HelperReference(this, helper);
                    break;
                case 6:
                case 7:
                    horizontalChainReference = new FlowReference(this, helper);
                    break;
                case 8:
                case 9:
                case 10:
                    horizontalChainReference = new GridReference(this, helper);
                    break;
            }
            horizontalChainReference.f21566a = strM11h;
            map.put(strM11h, horizontalChainReference);
            helperReference2 = horizontalChainReference;
        }
        return helperReference2;
    }

    /* JADX INFO: renamed from: g */
    public final void m7002g() {
        HashMap map = this.f21635c;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((Reference) map.get(it.next())).mo6965b().mo7070H();
        }
        map.clear();
        map.put(0, this.f21638f);
        this.f21636d.clear();
        this.f21637e.clear();
        this.f21640h.clear();
        this.f21642j = true;
    }
}
