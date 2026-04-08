package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: b */
    public int f21858b;

    /* JADX INFO: renamed from: c */
    public boolean f21859c;

    /* JADX INFO: renamed from: d */
    public final ConstraintWidget f21860d;

    /* JADX INFO: renamed from: e */
    public final Type f21861e;

    /* JADX INFO: renamed from: f */
    public ConstraintAnchor f21862f;

    /* JADX INFO: renamed from: i */
    public SolverVariable f21865i;

    /* JADX INFO: renamed from: a */
    public HashSet f21857a = null;

    /* JADX INFO: renamed from: g */
    public int f21863g = 0;

    /* JADX INFO: renamed from: h */
    public int f21864h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final Type f21866a;

        /* JADX INFO: renamed from: b */
        public static final Type f21867b;

        /* JADX INFO: renamed from: c */
        public static final Type f21868c;

        /* JADX INFO: renamed from: d */
        public static final Type f21869d;

        /* JADX INFO: renamed from: f */
        public static final Type f21870f;

        /* JADX INFO: renamed from: g */
        public static final Type f21871g;

        /* JADX INFO: renamed from: i */
        public static final Type f21872i;

        /* JADX INFO: renamed from: j */
        public static final Type f21873j;

        /* JADX INFO: renamed from: n */
        public static final /* synthetic */ Type[] f21874n;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("NONE", 0);
            Type type2 = new Type("LEFT", 1);
            f21866a = type2;
            Type type3 = new Type("TOP", 2);
            f21867b = type3;
            Type type4 = new Type("RIGHT", 3);
            f21868c = type4;
            Type type5 = new Type("BOTTOM", 4);
            f21869d = type5;
            Type type6 = new Type("BASELINE", 5);
            f21870f = type6;
            Type type7 = new Type("CENTER", 6);
            f21871g = type7;
            Type type8 = new Type("CENTER_X", 7);
            f21872i = type8;
            Type type9 = new Type("CENTER_Y", 8);
            f21873j = type9;
            f21874n = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f21874n.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f21860d = constraintWidget;
        this.f21861e = type;
    }

    /* JADX INFO: renamed from: a */
    public final void m7049a(ConstraintAnchor constraintAnchor, int i) {
        m7050b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7050b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z2) {
        if (constraintAnchor == null) {
            m7058j();
            return true;
        }
        if (!z2 && !m7057i(constraintAnchor)) {
            return false;
        }
        this.f21862f = constraintAnchor;
        if (constraintAnchor.f21857a == null) {
            constraintAnchor.f21857a = new HashSet();
        }
        HashSet hashSet = this.f21862f.f21857a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f21863g = i;
        this.f21864h = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m7051c(int i, WidgetGroup widgetGroup, ArrayList arrayList) {
        HashSet hashSet = this.f21857a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.m7158a(((ConstraintAnchor) it.next()).f21860d, i, arrayList, widgetGroup);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m7052d() {
        if (this.f21859c) {
            return this.f21858b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m7053e() {
        ConstraintAnchor constraintAnchor;
        if (this.f21860d.f21920j0 == 8) {
            return 0;
        }
        int i = this.f21864h;
        return (i == Integer.MIN_VALUE || (constraintAnchor = this.f21862f) == null || constraintAnchor.f21860d.f21920j0 != 8) ? this.f21863g : i;
    }

    /* JADX INFO: renamed from: f */
    public final ConstraintAnchor m7054f() {
        Type type = this.f21861e;
        int iOrdinal = type.ordinal();
        ConstraintWidget constraintWidget = this.f21860d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.f21887M;
            case 2:
                return constraintWidget.f21888N;
            case 3:
                return constraintWidget.f21885K;
            case 4:
                return constraintWidget.f21886L;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7055g() {
        HashSet hashSet = this.f21857a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).m7054f().m7056h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7056h() {
        return this.f21862f != null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7057i(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = Type.f21870f;
        Type type2 = this.f21861e;
        ConstraintWidget constraintWidget = constraintAnchor.f21860d;
        Type type3 = constraintAnchor.f21861e;
        if (type3 == type2) {
            return type2 != type || (constraintWidget.f21880F && this.f21860d.f21880F);
        }
        int iOrdinal = type2.ordinal();
        Type type4 = Type.f21868c;
        Type type5 = Type.f21866a;
        Type type6 = Type.f21873j;
        Type type7 = Type.f21872i;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = type3 == type5 || type3 == type4;
                return constraintWidget instanceof Guideline ? z2 || type3 == type7 : z2;
            case 2:
            case 4:
                boolean z3 = type3 == Type.f21867b || type3 == Type.f21869d;
                return constraintWidget instanceof Guideline ? z3 || type3 == type6 : z3;
            case 5:
                return (type3 == type5 || type3 == type4) ? false : true;
            case 6:
                return (type3 == type || type3 == type7 || type3 == type6) ? false : true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7058j() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.f21862f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f21857a) != null) {
            hashSet.remove(this);
            if (this.f21862f.f21857a.size() == 0) {
                this.f21862f.f21857a = null;
            }
        }
        this.f21857a = null;
        this.f21862f = null;
        this.f21863g = 0;
        this.f21864h = Integer.MIN_VALUE;
        this.f21859c = false;
        this.f21858b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m7059k() {
        SolverVariable solverVariable = this.f21865i;
        if (solverVariable == null) {
            this.f21865i = new SolverVariable(SolverVariable.Type.f21189a);
        } else {
            solverVariable.m6843c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7060l(int i) {
        this.f21858b = i;
        this.f21859c = true;
    }

    public final String toString() {
        return this.f21860d.f21924l0 + ":" + this.f21861e.toString();
    }
}
