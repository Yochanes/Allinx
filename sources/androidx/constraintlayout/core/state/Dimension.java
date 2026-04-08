package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Dimension {

    /* JADX INFO: renamed from: h */
    public static final String f21616h = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: i */
    public static final String f21617i = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: j */
    public static final String f21618j = new String("SPREAD_DIMENSION");

    /* JADX INFO: renamed from: k */
    public static final String f21619k = new String("PARENT_DIMENSION");

    /* JADX INFO: renamed from: l */
    public static final String f21620l = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: m */
    public static final String f21621m = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: f */
    public String f21627f;

    /* JADX INFO: renamed from: a */
    public int f21622a = 0;

    /* JADX INFO: renamed from: b */
    public int f21623b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public float f21624c = 1.0f;

    /* JADX INFO: renamed from: d */
    public int f21625d = 0;

    /* JADX INFO: renamed from: e */
    public String f21626e = null;

    /* JADX INFO: renamed from: g */
    public boolean f21628g = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Type[] f21629a = {new Type("FIXED", 0), new Type("WRAP", 1), new Type("MATCH_PARENT", 2), new Type("MATCH_CONSTRAINT", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f21629a.clone();
        }
    }

    public Dimension(String str) {
        this.f21627f = str;
    }

    /* JADX INFO: renamed from: b */
    public static Dimension m6990b(int i) {
        Dimension dimension = new Dimension(f21616h);
        dimension.f21627f = null;
        dimension.f21625d = i;
        return dimension;
    }

    /* JADX INFO: renamed from: c */
    public static Dimension m6991c(String str) {
        Dimension dimension = new Dimension();
        dimension.f21622a = 0;
        dimension.f21623b = Integer.MAX_VALUE;
        dimension.f21624c = 1.0f;
        dimension.f21625d = 0;
        dimension.f21626e = null;
        dimension.f21627f = str;
        dimension.f21628g = true;
        return dimension;
    }

    /* JADX INFO: renamed from: d */
    public static Dimension m6992d() {
        return new Dimension(f21617i);
    }

    /* JADX INFO: renamed from: a */
    public final void m6993a(ConstraintWidget constraintWidget, int i) {
        String str = this.f21626e;
        if (str != null) {
            constraintWidget.m7075O(str);
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f21949a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f21952d;
        String str2 = f21619k;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f21950b;
        String str3 = f21620l;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f21951c;
        String str4 = f21617i;
        if (i == 0) {
            if (this.f21628g) {
                constraintWidget.m7079S(dimensionBehaviour4);
                String str5 = this.f21627f;
                constraintWidget.m7080T(this.f21624c, str5 != str4 ? str5 == str3 ? 2 : 0 : 1, this.f21622a, this.f21623b);
                return;
            }
            int i2 = this.f21622a;
            if (i2 > 0) {
                if (i2 < 0) {
                    constraintWidget.f21910e0 = 0;
                } else {
                    constraintWidget.f21910e0 = i2;
                }
            }
            int i3 = this.f21623b;
            if (i3 < Integer.MAX_VALUE) {
                constraintWidget.f21878D[0] = i3;
            }
            String str6 = this.f21627f;
            if (str6 == str4) {
                constraintWidget.m7079S(dimensionBehaviour3);
                return;
            }
            if (str6 == str2) {
                constraintWidget.m7079S(dimensionBehaviour2);
                return;
            } else {
                if (str6 == null) {
                    constraintWidget.m7079S(dimensionBehaviour);
                    constraintWidget.m7083W(this.f21625d);
                    return;
                }
                return;
            }
        }
        if (this.f21628g) {
            constraintWidget.m7081U(dimensionBehaviour4);
            String str7 = this.f21627f;
            constraintWidget.m7082V(this.f21624c, str7 != str4 ? str7 == str3 ? 2 : 0 : 1, this.f21622a, this.f21623b);
            return;
        }
        int i4 = this.f21622a;
        if (i4 > 0) {
            if (i4 < 0) {
                constraintWidget.f21912f0 = 0;
            } else {
                constraintWidget.f21912f0 = i4;
            }
        }
        int i5 = this.f21623b;
        if (i5 < Integer.MAX_VALUE) {
            constraintWidget.f21878D[1] = i5;
        }
        String str8 = this.f21627f;
        if (str8 == str4) {
            constraintWidget.m7081U(dimensionBehaviour3);
            return;
        }
        if (str8 == str2) {
            constraintWidget.m7081U(dimensionBehaviour2);
        } else if (str8 == null) {
            constraintWidget.m7081U(dimensionBehaviour);
            constraintWidget.m7078R(this.f21625d);
        }
    }
}
