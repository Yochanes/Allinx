package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Constraint {

    /* JADX INFO: renamed from: q */
    public static final int f21206q;

    /* JADX INFO: renamed from: a */
    public final String f21207a;

    /* JADX INFO: renamed from: b */
    public final HAnchor f21208b = new HAnchor(this, HSide.f21228a);

    /* JADX INFO: renamed from: c */
    public final HAnchor f21209c = new HAnchor(this, HSide.f21229b);

    /* JADX INFO: renamed from: d */
    public final VAnchor f21210d = new VAnchor(this, VSide.f21241a);

    /* JADX INFO: renamed from: e */
    public final VAnchor f21211e = new VAnchor(this, VSide.f21242b);

    /* JADX INFO: renamed from: f */
    public final HAnchor f21212f = new HAnchor(this, HSide.f21230c);

    /* JADX INFO: renamed from: g */
    public final HAnchor f21213g = new HAnchor(this, HSide.f21231d);

    /* JADX INFO: renamed from: h */
    public final VAnchor f21214h = new VAnchor(this, VSide.f21243c);

    /* JADX INFO: renamed from: i */
    public final int f21215i;

    /* JADX INFO: renamed from: j */
    public final int f21216j;

    /* JADX INFO: renamed from: k */
    public final float f21217k;

    /* JADX INFO: renamed from: l */
    public final float f21218l;

    /* JADX INFO: renamed from: m */
    public final float f21219m;

    /* JADX INFO: renamed from: n */
    public final float f21220n;

    /* JADX INFO: renamed from: o */
    public final float f21221o;

    /* JADX INFO: renamed from: p */
    public final float f21222p;

    /* JADX INFO: compiled from: Proguard */
    public class Anchor {
        public final String toString() {
            return AbstractC0000a.m13j("[", "]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Behaviour {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Behaviour[] f21223a = {new Behaviour("SPREAD", 0), new Behaviour("WRAP", 1), new Behaviour("PERCENT", 2), new Behaviour("RATIO", 3), new Behaviour("RESOLVED", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        Behaviour EF5;

        public static Behaviour valueOf(String str) {
            return (Behaviour) Enum.valueOf(Behaviour.class, str);
        }

        public static Behaviour[] values() {
            return (Behaviour[]) f21223a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class ChainMode {

        /* JADX INFO: renamed from: a */
        public static final ChainMode f21224a;

        /* JADX INFO: renamed from: b */
        public static final ChainMode f21225b;

        /* JADX INFO: renamed from: c */
        public static final ChainMode f21226c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ ChainMode[] f21227d;

        static {
            ChainMode chainMode = new ChainMode("SPREAD", 0);
            f21224a = chainMode;
            ChainMode chainMode2 = new ChainMode("SPREAD_INSIDE", 1);
            f21225b = chainMode2;
            ChainMode chainMode3 = new ChainMode("PACKED", 2);
            f21226c = chainMode3;
            f21227d = new ChainMode[]{chainMode, chainMode2, chainMode3};
        }

        public static ChainMode valueOf(String str) {
            return (ChainMode) Enum.valueOf(ChainMode.class, str);
        }

        public static ChainMode[] values() {
            return (ChainMode[]) f21227d.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class HAnchor extends Anchor {
        public HAnchor(Constraint constraint, HSide hSide) {
            Side.valueOf(hSide.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class HSide {

        /* JADX INFO: renamed from: a */
        public static final HSide f21228a;

        /* JADX INFO: renamed from: b */
        public static final HSide f21229b;

        /* JADX INFO: renamed from: c */
        public static final HSide f21230c;

        /* JADX INFO: renamed from: d */
        public static final HSide f21231d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ HSide[] f21232f;

        static {
            HSide hSide = new HSide("LEFT", 0);
            f21228a = hSide;
            HSide hSide2 = new HSide("RIGHT", 1);
            f21229b = hSide2;
            HSide hSide3 = new HSide("START", 2);
            f21230c = hSide3;
            HSide hSide4 = new HSide("END", 3);
            f21231d = hSide4;
            f21232f = new HSide[]{hSide, hSide2, hSide3, hSide4};
        }

        public static HSide valueOf(String str) {
            return (HSide) Enum.valueOf(HSide.class, str);
        }

        public static HSide[] values() {
            return (HSide[]) f21232f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Side {

        /* JADX INFO: renamed from: a */
        public static final Side f21233a;

        /* JADX INFO: renamed from: b */
        public static final Side f21234b;

        /* JADX INFO: renamed from: c */
        public static final Side f21235c;

        /* JADX INFO: renamed from: d */
        public static final Side f21236d;

        /* JADX INFO: renamed from: f */
        public static final Side f21237f;

        /* JADX INFO: renamed from: g */
        public static final Side f21238g;

        /* JADX INFO: renamed from: i */
        public static final Side f21239i;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ Side[] f21240j;

        static {
            Side side = new Side("LEFT", 0);
            f21233a = side;
            Side side2 = new Side("RIGHT", 1);
            f21234b = side2;
            Side side3 = new Side("TOP", 2);
            f21235c = side3;
            Side side4 = new Side("BOTTOM", 3);
            f21236d = side4;
            Side side5 = new Side("START", 4);
            f21237f = side5;
            Side side6 = new Side("END", 5);
            f21238g = side6;
            Side side7 = new Side("BASELINE", 6);
            f21239i = side7;
            f21240j = new Side[]{side, side2, side3, side4, side5, side6, side7};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) f21240j.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class VAnchor extends Anchor {
        public VAnchor(Constraint constraint, VSide vSide) {
            Side.valueOf(vSide.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class VSide {

        /* JADX INFO: renamed from: a */
        public static final VSide f21241a;

        /* JADX INFO: renamed from: b */
        public static final VSide f21242b;

        /* JADX INFO: renamed from: c */
        public static final VSide f21243c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ VSide[] f21244d;

        static {
            VSide vSide = new VSide("TOP", 0);
            f21241a = vSide;
            VSide vSide2 = new VSide("BOTTOM", 1);
            f21242b = vSide2;
            VSide vSide3 = new VSide("BASELINE", 2);
            f21243c = vSide3;
            f21244d = new VSide[]{vSide, vSide2, vSide3};
        }

        public static VSide valueOf(String str) {
            return (VSide) Enum.valueOf(VSide.class, str);
        }

        public static VSide[] values() {
            return (VSide[]) f21244d.clone();
        }
    }

    static {
        new Constraint();
        f21206q = Integer.MIN_VALUE;
        HashMap map = new HashMap();
        map.put(ChainMode.f21224a, "spread");
        map.put(ChainMode.f21225b, "spread_inside");
        map.put(ChainMode.f21226c, "packed");
    }

    public Constraint() {
        int i = f21206q;
        this.f21215i = i;
        this.f21216j = i;
        this.f21217k = Float.NaN;
        this.f21218l = Float.NaN;
        this.f21219m = Float.NaN;
        this.f21220n = Float.NaN;
        this.f21221o = Float.NaN;
        this.f21222p = Float.NaN;
        this.f21207a = "parent";
    }

    /* JADX INFO: renamed from: a */
    public static void m6848a(float f, String str, StringBuilder sb) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f);
        sb.append(",\n");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC0000a.m19p(new StringBuilder(), this.f21207a, ":{\n"));
        this.f21208b.getClass();
        this.f21209c.getClass();
        this.f21210d.getClass();
        this.f21211e.getClass();
        this.f21212f.getClass();
        this.f21213g.getClass();
        this.f21214h.getClass();
        int i = this.f21215i;
        int i2 = f21206q;
        if (i != i2) {
            sb.append("width:");
            sb.append(i);
            sb.append(",\n");
        }
        int i3 = this.f21216j;
        if (i3 != i2) {
            sb.append("height:");
            sb.append(i3);
            sb.append(",\n");
        }
        m6848a(this.f21217k, "horizontalBias", sb);
        m6848a(this.f21218l, "verticalBias", sb);
        m6848a(this.f21219m, "verticalWeight", sb);
        m6848a(this.f21220n, "horizontalWeight", sb);
        float f = this.f21221o;
        if (!Double.isNaN(f)) {
            sb.append("width:'");
            sb.append((int) f);
            sb.append("%',\n");
        }
        float f2 = this.f21222p;
        if (!Double.isNaN(f2)) {
            sb.append("height:'");
            sb.append((int) f2);
            sb.append("%',\n");
        }
        sb.append("},\n");
        return sb.toString();
    }
}
