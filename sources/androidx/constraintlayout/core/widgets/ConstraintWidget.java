package androidx.constraintlayout.core.widgets;

import androidx.compose.animation.AbstractC0455a;
import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import com.king.logx.logger.Logger;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: A */
    public float f21875A;

    /* JADX INFO: renamed from: B */
    public int f21876B;

    /* JADX INFO: renamed from: C */
    public float f21877C;

    /* JADX INFO: renamed from: D */
    public int[] f21878D;

    /* JADX INFO: renamed from: E */
    public float f21879E;

    /* JADX INFO: renamed from: F */
    public boolean f21880F;

    /* JADX INFO: renamed from: G */
    public boolean f21881G;

    /* JADX INFO: renamed from: H */
    public boolean f21882H;

    /* JADX INFO: renamed from: I */
    public int f21883I;

    /* JADX INFO: renamed from: J */
    public int f21884J;

    /* JADX INFO: renamed from: K */
    public final ConstraintAnchor f21885K;

    /* JADX INFO: renamed from: L */
    public final ConstraintAnchor f21886L;

    /* JADX INFO: renamed from: M */
    public final ConstraintAnchor f21887M;

    /* JADX INFO: renamed from: N */
    public final ConstraintAnchor f21888N;

    /* JADX INFO: renamed from: O */
    public final ConstraintAnchor f21889O;

    /* JADX INFO: renamed from: P */
    public final ConstraintAnchor f21890P;

    /* JADX INFO: renamed from: Q */
    public final ConstraintAnchor f21891Q;

    /* JADX INFO: renamed from: R */
    public final ConstraintAnchor f21892R;

    /* JADX INFO: renamed from: S */
    public final ConstraintAnchor[] f21893S;

    /* JADX INFO: renamed from: T */
    public final ArrayList f21894T;

    /* JADX INFO: renamed from: U */
    public final boolean[] f21895U;

    /* JADX INFO: renamed from: V */
    public DimensionBehaviour[] f21896V;

    /* JADX INFO: renamed from: W */
    public ConstraintWidget f21897W;

    /* JADX INFO: renamed from: X */
    public int f21898X;

    /* JADX INFO: renamed from: Y */
    public int f21899Y;

    /* JADX INFO: renamed from: Z */
    public float f21900Z;

    /* JADX INFO: renamed from: a */
    public boolean f21901a;

    /* JADX INFO: renamed from: a0 */
    public int f21902a0;

    /* JADX INFO: renamed from: b */
    public ChainRun f21903b;

    /* JADX INFO: renamed from: b0 */
    public int f21904b0;

    /* JADX INFO: renamed from: c */
    public ChainRun f21905c;

    /* JADX INFO: renamed from: c0 */
    public int f21906c0;

    /* JADX INFO: renamed from: d */
    public HorizontalWidgetRun f21907d;

    /* JADX INFO: renamed from: d0 */
    public int f21908d0;

    /* JADX INFO: renamed from: e */
    public VerticalWidgetRun f21909e;

    /* JADX INFO: renamed from: e0 */
    public int f21910e0;

    /* JADX INFO: renamed from: f */
    public final boolean[] f21911f;

    /* JADX INFO: renamed from: f0 */
    public int f21912f0;

    /* JADX INFO: renamed from: g */
    public boolean f21913g;

    /* JADX INFO: renamed from: g0 */
    public float f21914g0;

    /* JADX INFO: renamed from: h */
    public int f21915h;

    /* JADX INFO: renamed from: h0 */
    public float f21916h0;

    /* JADX INFO: renamed from: i */
    public int f21917i;

    /* JADX INFO: renamed from: i0 */
    public Object f21918i0;

    /* JADX INFO: renamed from: j */
    public final WidgetFrame f21919j;

    /* JADX INFO: renamed from: j0 */
    public int f21920j0;

    /* JADX INFO: renamed from: k */
    public String f21921k;

    /* JADX INFO: renamed from: k0 */
    public boolean f21922k0;

    /* JADX INFO: renamed from: l */
    public boolean f21923l;

    /* JADX INFO: renamed from: l0 */
    public String f21924l0;

    /* JADX INFO: renamed from: m */
    public boolean f21925m;

    /* JADX INFO: renamed from: m0 */
    public int f21926m0;

    /* JADX INFO: renamed from: n */
    public boolean f21927n;

    /* JADX INFO: renamed from: n0 */
    public int f21928n0;

    /* JADX INFO: renamed from: o */
    public boolean f21929o;

    /* JADX INFO: renamed from: o0 */
    public final float[] f21930o0;

    /* JADX INFO: renamed from: p */
    public int f21931p;

    /* JADX INFO: renamed from: p0 */
    public final ConstraintWidget[] f21932p0;

    /* JADX INFO: renamed from: q */
    public int f21933q;

    /* JADX INFO: renamed from: q0 */
    public final ConstraintWidget[] f21934q0;

    /* JADX INFO: renamed from: r */
    public int f21935r;

    /* JADX INFO: renamed from: r0 */
    public ConstraintWidget f21936r0;

    /* JADX INFO: renamed from: s */
    public int f21937s;

    /* JADX INFO: renamed from: s0 */
    public ConstraintWidget f21938s0;

    /* JADX INFO: renamed from: t */
    public int f21939t;

    /* JADX INFO: renamed from: t0 */
    public int f21940t0;

    /* JADX INFO: renamed from: u */
    public final int[] f21941u;

    /* JADX INFO: renamed from: u0 */
    public int f21942u0;

    /* JADX INFO: renamed from: v */
    public int f21943v;

    /* JADX INFO: renamed from: w */
    public int f21944w;

    /* JADX INFO: renamed from: x */
    public float f21945x;

    /* JADX INFO: renamed from: y */
    public int f21946y;

    /* JADX INFO: renamed from: z */
    public int f21947z;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C13901 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21948a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f21948a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21948a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21948a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21948a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21948a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21948a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21948a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21948a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21948a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class DimensionBehaviour {

        /* JADX INFO: renamed from: a */
        public static final DimensionBehaviour f21949a;

        /* JADX INFO: renamed from: b */
        public static final DimensionBehaviour f21950b;

        /* JADX INFO: renamed from: c */
        public static final DimensionBehaviour f21951c;

        /* JADX INFO: renamed from: d */
        public static final DimensionBehaviour f21952d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ DimensionBehaviour[] f21953f;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            f21949a = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            f21950b = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            f21951c = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            f21952d = dimensionBehaviour4;
            f21953f = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) f21953f.clone();
        }
    }

    public ConstraintWidget() {
        this.f21901a = false;
        this.f21907d = null;
        this.f21909e = null;
        this.f21911f = new boolean[]{true, true};
        this.f21913g = true;
        this.f21915h = -1;
        this.f21917i = -1;
        this.f21919j = new WidgetFrame(this);
        this.f21923l = false;
        this.f21925m = false;
        this.f21927n = false;
        this.f21929o = false;
        this.f21931p = -1;
        this.f21933q = -1;
        this.f21935r = 0;
        this.f21937s = 0;
        this.f21939t = 0;
        this.f21941u = new int[2];
        this.f21943v = 0;
        this.f21944w = 0;
        this.f21945x = 1.0f;
        this.f21946y = 0;
        this.f21947z = 0;
        this.f21875A = 1.0f;
        this.f21876B = -1;
        this.f21877C = 1.0f;
        this.f21878D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f21879E = Float.NaN;
        this.f21880F = false;
        this.f21882H = false;
        this.f21883I = 0;
        this.f21884J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.f21866a);
        this.f21885K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21867b);
        this.f21886L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21868c);
        this.f21887M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21869d);
        this.f21888N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21870f);
        this.f21889O = constraintAnchor5;
        this.f21890P = new ConstraintAnchor(this, ConstraintAnchor.Type.f21872i);
        this.f21891Q = new ConstraintAnchor(this, ConstraintAnchor.Type.f21873j);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21871g);
        this.f21892R = constraintAnchor6;
        this.f21893S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f21894T = new ArrayList();
        this.f21895U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f21949a;
        this.f21896V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f21897W = null;
        this.f21898X = 0;
        this.f21899Y = 0;
        this.f21900Z = 0.0f;
        this.f21902a0 = -1;
        this.f21904b0 = 0;
        this.f21906c0 = 0;
        this.f21908d0 = 0;
        this.f21914g0 = 0.5f;
        this.f21916h0 = 0.5f;
        this.f21920j0 = 0;
        this.f21922k0 = false;
        this.f21924l0 = null;
        this.f21926m0 = 0;
        this.f21928n0 = 0;
        this.f21930o0 = new float[]{-1.0f, -1.0f};
        this.f21932p0 = new ConstraintWidget[]{null, null};
        this.f21934q0 = new ConstraintWidget[]{null, null};
        this.f21936r0 = null;
        this.f21938s0 = null;
        this.f21940t0 = -1;
        this.f21942u0 = -1;
        m7086d();
    }

    /* JADX INFO: renamed from: L */
    public static void m7061L(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: M */
    public static void m7062M(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: t */
    public static void m7063t(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, DimensionBehaviour dimensionBehaviour) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = dimensionBehaviour.toString();
        if (!"FIXED".equals(string)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(string);
            sb.append(",\n");
        }
        m7061L(i, 0, "      size", sb);
        m7061L(i2, 0, "      min", sb);
        m7061L(i3, Integer.MAX_VALUE, "      max", sb);
        m7061L(i4, 0, "      matchMin", sb);
        m7061L(i5, 0, "      matchDef", sb);
        m7062M(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* JADX INFO: renamed from: u */
    public static void m7064u(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f21862f == null) {
            return;
        }
        sb.append(Logger.INDENT);
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f21862f);
        sb.append("'");
        if (constraintAnchor.f21864h != Integer.MIN_VALUE || constraintAnchor.f21863g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.f21863g);
            if (constraintAnchor.f21864h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f21864h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    /* JADX INFO: renamed from: A */
    public final void m7065A(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        mo7093n(type).m7050b(constraintWidget.mo7093n(type2), i, i2, true);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7066B(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f21893S;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f21862f;
        return (constraintAnchor4 == null || constraintAnchor4.f21862f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f21862f) == null || constraintAnchor2.f21862f != constraintAnchor) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7067C() {
        ConstraintAnchor constraintAnchor = this.f21885K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f21862f;
        if (constraintAnchor2 != null && constraintAnchor2.f21862f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f21887M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f21862f;
        return constraintAnchor4 != null && constraintAnchor4.f21862f == constraintAnchor3;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7068D() {
        ConstraintAnchor constraintAnchor = this.f21886L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f21862f;
        if (constraintAnchor2 != null && constraintAnchor2.f21862f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f21888N;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f21862f;
        return constraintAnchor4 != null && constraintAnchor4.f21862f == constraintAnchor3;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m7069E() {
        return this.f21913g && this.f21920j0 != 8;
    }

    /* JADX INFO: renamed from: F */
    public boolean mo7042F() {
        if (this.f21923l) {
            return true;
        }
        return this.f21885K.f21859c && this.f21887M.f21859c;
    }

    /* JADX INFO: renamed from: G */
    public boolean mo7043G() {
        if (this.f21925m) {
            return true;
        }
        return this.f21886L.f21859c && this.f21888N.f21859c;
    }

    /* JADX INFO: renamed from: H */
    public void mo7070H() {
        this.f21885K.m7058j();
        this.f21886L.m7058j();
        this.f21887M.m7058j();
        this.f21888N.m7058j();
        this.f21889O.m7058j();
        this.f21890P.m7058j();
        this.f21891Q.m7058j();
        this.f21892R.m7058j();
        this.f21897W = null;
        this.f21879E = Float.NaN;
        this.f21898X = 0;
        this.f21899Y = 0;
        this.f21900Z = 0.0f;
        this.f21902a0 = -1;
        this.f21904b0 = 0;
        this.f21906c0 = 0;
        this.f21908d0 = 0;
        this.f21910e0 = 0;
        this.f21912f0 = 0;
        this.f21914g0 = 0.5f;
        this.f21916h0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f21896V;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f21949a;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f21918i0 = null;
        this.f21920j0 = 0;
        this.f21926m0 = 0;
        this.f21928n0 = 0;
        float[] fArr = this.f21930o0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f21931p = -1;
        this.f21933q = -1;
        int[] iArr = this.f21878D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f21937s = 0;
        this.f21939t = 0;
        this.f21945x = 1.0f;
        this.f21875A = 1.0f;
        this.f21944w = Integer.MAX_VALUE;
        this.f21947z = Integer.MAX_VALUE;
        this.f21943v = 0;
        this.f21946y = 0;
        this.f21876B = -1;
        this.f21877C = 1.0f;
        boolean[] zArr = this.f21911f;
        zArr[0] = true;
        zArr[1] = true;
        this.f21882H = false;
        boolean[] zArr2 = this.f21895U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f21913g = true;
        int[] iArr2 = this.f21941u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f21915h = -1;
        this.f21917i = -1;
    }

    /* JADX INFO: renamed from: I */
    public final void m7071I() {
        ConstraintWidget constraintWidget = this.f21897W;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            ((ConstraintWidgetContainer) constraintWidget).getClass();
        }
        ArrayList arrayList = this.f21894T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) arrayList.get(i)).m7058j();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m7072J() {
        this.f21923l = false;
        this.f21925m = false;
        this.f21927n = false;
        this.f21929o = false;
        ArrayList arrayList = this.f21894T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) arrayList.get(i);
            constraintAnchor.f21859c = false;
            constraintAnchor.f21858b = 0;
        }
    }

    /* JADX INFO: renamed from: K */
    public void mo7073K(Cache cache) {
        this.f21885K.m7059k();
        this.f21886L.m7059k();
        this.f21887M.m7059k();
        this.f21888N.m7059k();
        this.f21889O.m7059k();
        this.f21892R.m7059k();
        this.f21890P.m7059k();
        this.f21891Q.m7059k();
    }

    /* JADX INFO: renamed from: N */
    public final void m7074N(int i) {
        this.f21908d0 = i;
        this.f21880F = i > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7075O(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f21900Z = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            i2 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            i = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
            String strSubstring2 = str.substring(i);
            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : i;
        } else {
            String strSubstring3 = str.substring(i, iIndexOf2);
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                float f = Float.parseFloat(strSubstring3);
                float f2 = Float.parseFloat(strSubstring4);
                if (f > 0.0f && f2 > 0.0f) {
                    fAbs = i2 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                }
            }
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f21900Z = fAbs;
            this.f21902a0 = i2;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m7076P(int i, int i2) {
        if (this.f21923l) {
            return;
        }
        this.f21885K.m7060l(i);
        this.f21887M.m7060l(i2);
        this.f21904b0 = i;
        this.f21898X = i2 - i;
        this.f21923l = true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m7077Q(int i, int i2) {
        if (this.f21925m) {
            return;
        }
        this.f21886L.m7060l(i);
        this.f21888N.m7060l(i2);
        this.f21906c0 = i;
        this.f21899Y = i2 - i;
        if (this.f21880F) {
            this.f21889O.m7060l(i + this.f21908d0);
        }
        this.f21925m = true;
    }

    /* JADX INFO: renamed from: R */
    public final void m7078R(int i) {
        this.f21899Y = i;
        int i2 = this.f21912f0;
        if (i < i2) {
            this.f21899Y = i2;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m7079S(DimensionBehaviour dimensionBehaviour) {
        this.f21896V[0] = dimensionBehaviour;
    }

    /* JADX INFO: renamed from: T */
    public final void m7080T(float f, int i, int i2, int i3) {
        this.f21937s = i;
        this.f21943v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f21944w = i3;
        this.f21945x = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f21937s = 2;
    }

    /* JADX INFO: renamed from: U */
    public final void m7081U(DimensionBehaviour dimensionBehaviour) {
        this.f21896V[1] = dimensionBehaviour;
    }

    /* JADX INFO: renamed from: V */
    public final void m7082V(float f, int i, int i2, int i3) {
        this.f21939t = i;
        this.f21946y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f21947z = i3;
        this.f21875A = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f21939t = 2;
    }

    /* JADX INFO: renamed from: W */
    public final void m7083W(int i) {
        this.f21898X = i;
        int i2 = this.f21910e0;
        if (i < i2) {
            this.f21898X = i2;
        }
    }

    /* JADX INFO: renamed from: X */
    public void mo7084X(boolean z2, boolean z3) {
        int i;
        int i2;
        HorizontalWidgetRun horizontalWidgetRun = this.f21907d;
        boolean z4 = z2 & horizontalWidgetRun.f22106g;
        VerticalWidgetRun verticalWidgetRun = this.f21909e;
        boolean z5 = z3 & verticalWidgetRun.f22106g;
        int i3 = horizontalWidgetRun.f22107h.f22070g;
        int i4 = verticalWidgetRun.f22107h.f22070g;
        int i5 = horizontalWidgetRun.f22108i.f22070g;
        int i6 = verticalWidgetRun.f22108i.f22070g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z4) {
            this.f21904b0 = i3;
        }
        if (z5) {
            this.f21906c0 = i4;
        }
        if (this.f21920j0 == 8) {
            this.f21898X = 0;
            this.f21899Y = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f21949a;
        if (z4) {
            if (this.f21896V[0] == dimensionBehaviour && i8 < (i2 = this.f21898X)) {
                i8 = i2;
            }
            this.f21898X = i8;
            int i10 = this.f21910e0;
            if (i8 < i10) {
                this.f21898X = i10;
            }
        }
        if (z5) {
            if (this.f21896V[1] == dimensionBehaviour && i9 < (i = this.f21899Y)) {
                i9 = i;
            }
            this.f21899Y = i9;
            int i11 = this.f21912f0;
            if (i9 < i11) {
                this.f21899Y = i11;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void mo7085Y(LinearSystem linearSystem, boolean z2) {
        int i;
        int i2;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        ConstraintAnchor constraintAnchor = this.f21885K;
        linearSystem.getClass();
        int iM6818n = LinearSystem.m6818n(constraintAnchor);
        int iM6818n2 = LinearSystem.m6818n(this.f21886L);
        int iM6818n3 = LinearSystem.m6818n(this.f21887M);
        int iM6818n4 = LinearSystem.m6818n(this.f21888N);
        if (z2 && (horizontalWidgetRun = this.f21907d) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.f22107h;
            if (dependencyNode.f22073j) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.f22108i;
                if (dependencyNode2.f22073j) {
                    iM6818n = dependencyNode.f22070g;
                    iM6818n3 = dependencyNode2.f22070g;
                }
            }
        }
        if (z2 && (verticalWidgetRun = this.f21909e) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.f22107h;
            if (dependencyNode3.f22073j) {
                DependencyNode dependencyNode4 = verticalWidgetRun.f22108i;
                if (dependencyNode4.f22073j) {
                    iM6818n2 = dependencyNode3.f22070g;
                    iM6818n4 = dependencyNode4.f22070g;
                }
            }
        }
        int i3 = iM6818n4 - iM6818n2;
        if (iM6818n3 - iM6818n < 0 || i3 < 0 || iM6818n == Integer.MIN_VALUE || iM6818n == Integer.MAX_VALUE || iM6818n2 == Integer.MIN_VALUE || iM6818n2 == Integer.MAX_VALUE || iM6818n3 == Integer.MIN_VALUE || iM6818n3 == Integer.MAX_VALUE || iM6818n4 == Integer.MIN_VALUE || iM6818n4 == Integer.MAX_VALUE) {
            iM6818n = 0;
            iM6818n2 = 0;
            iM6818n3 = 0;
            iM6818n4 = 0;
        }
        int i4 = iM6818n3 - iM6818n;
        int i5 = iM6818n4 - iM6818n2;
        this.f21904b0 = iM6818n;
        this.f21906c0 = iM6818n2;
        if (this.f21920j0 == 8) {
            this.f21898X = 0;
            this.f21899Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f21896V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.f21949a;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.f21898X)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.f21899Y)) {
            i5 = i;
        }
        this.f21898X = i4;
        this.f21899Y = i5;
        int i6 = this.f21912f0;
        if (i5 < i6) {
            this.f21899Y = i6;
        }
        int i7 = this.f21910e0;
        if (i4 < i7) {
            this.f21898X = i7;
        }
        int i8 = this.f21944w;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.f21951c;
        if (i8 > 0 && dimensionBehaviour == dimensionBehaviour3) {
            this.f21898X = Math.min(this.f21898X, i8);
        }
        int i9 = this.f21947z;
        if (i9 > 0 && this.f21896V[1] == dimensionBehaviour3) {
            this.f21899Y = Math.min(this.f21899Y, i9);
        }
        int i10 = this.f21898X;
        if (i4 != i10) {
            this.f21915h = i10;
        }
        int i11 = this.f21899Y;
        if (i5 != i11) {
            this.f21917i = i11;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7086d() {
        ConstraintAnchor constraintAnchor = this.f21885K;
        ArrayList arrayList = this.f21894T;
        arrayList.add(constraintAnchor);
        arrayList.add(this.f21886L);
        arrayList.add(this.f21887M);
        arrayList.add(this.f21888N);
        arrayList.add(this.f21890P);
        arrayList.add(this.f21891Q);
        arrayList.add(this.f21892R);
        arrayList.add(this.f21889O);
    }

    /* JADX INFO: renamed from: e */
    public final void m7087e(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet hashSet, int i, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.m7124a(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            mo7034f(linearSystem, constraintWidgetContainer.m7109e0(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f21885K.f21857a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).f21860d.m7087e(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f21887M.f21857a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).f21860d.m7087e(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f21886L.f21857a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).f21860d.m7087e(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f21888N.f21857a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).f21860d.m7087e(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f21889O.f21857a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).f21860d.m7087e(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018c  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7034f(LinearSystem linearSystem, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        Metrics metrics;
        ConstraintAnchor constraintAnchor;
        DimensionBehaviour dimensionBehaviour;
        boolean[] zArr;
        boolean zM7068D;
        ?? r12;
        int i7;
        int i8;
        float f;
        SolverVariable solverVariable;
        boolean z4;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z5;
        int i13;
        DimensionBehaviour dimensionBehaviour2;
        boolean z6;
        SolverVariable solverVariable2;
        DimensionBehaviour dimensionBehaviour3;
        SolverVariable solverVariable3;
        DimensionBehaviour dimensionBehaviour4;
        int i14;
        ?? r20;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor2;
        boolean[] zArr2;
        SolverVariable solverVariable5;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable6;
        int i15;
        ConstraintAnchor constraintAnchor4;
        boolean z7;
        ?? r202;
        ?? r19;
        ?? r3;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        int i16;
        int i17;
        int i18;
        int i19;
        SolverVariable solverVariable10;
        SolverVariable solverVariable11;
        VerticalWidgetRun verticalWidgetRun;
        int i20;
        HorizontalWidgetRun horizontalWidgetRun;
        int i21;
        int i22;
        ?? M7067C;
        HorizontalWidgetRun horizontalWidgetRun2;
        boolean z8;
        LinearSystem linearSystem2 = linearSystem;
        ConstraintAnchor constraintAnchor5 = this.f21885K;
        SolverVariable solverVariableM6829k = linearSystem2.m6829k(constraintAnchor5);
        ConstraintAnchor constraintAnchor6 = this.f21887M;
        SolverVariable solverVariableM6829k2 = linearSystem2.m6829k(constraintAnchor6);
        ConstraintAnchor constraintAnchor7 = this.f21886L;
        SolverVariable solverVariableM6829k3 = linearSystem2.m6829k(constraintAnchor7);
        ConstraintAnchor constraintAnchor8 = this.f21888N;
        SolverVariable solverVariableM6829k4 = linearSystem2.m6829k(constraintAnchor8);
        ConstraintAnchor constraintAnchor9 = this.f21889O;
        SolverVariable solverVariableM6829k5 = linearSystem2.m6829k(constraintAnchor9);
        ConstraintWidget constraintWidget3 = this.f21897W;
        DimensionBehaviour dimensionBehaviour5 = DimensionBehaviour.f21950b;
        if (constraintWidget3 != null) {
            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget3.f21896V;
            i2 = 0;
            i4 = dimensionBehaviourArr[0] == dimensionBehaviour5 ? 1 : 0;
            int i23 = dimensionBehaviourArr[1] == dimensionBehaviour5 ? 1 : 0;
            int i24 = this.f21935r;
            if (i24 != 1) {
                i = 1;
                if (i24 == 2) {
                    i4 = 0;
                } else if (i24 != 3) {
                }
                i3 = i23;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.f21920j0;
            ?? r192 = i3;
            boolean[] zArr3 = this.f21895U;
            if (i5 == 8 || this.f21922k0) {
                i6 = i4;
            } else {
                ArrayList arrayList = this.f21894T;
                int size = arrayList.size();
                i6 = i4;
                int i25 = i2;
                while (true) {
                    if (i25 < size) {
                        int i26 = size;
                        HashSet hashSet = ((ConstraintAnchor) arrayList.get(i25)).f21857a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i25++;
                        size = i26;
                    } else if (!zArr3[i2] && !zArr3[i]) {
                        return;
                    }
                }
            }
            z3 = this.f21923l;
            if (!z3 || this.f21925m) {
                if (z3) {
                    linearSystem2.m6822d(solverVariableM6829k, this.f21904b0);
                    linearSystem2.m6822d(solverVariableM6829k2, this.f21904b0 + this.f21898X);
                    if (i6 != 0 && (constraintWidget2 = this.f21897W) != null) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                        WeakReference weakReference = constraintWidgetContainer.f21967N0;
                        if (weakReference == null || weakReference.get() == null || constraintAnchor5.m7052d() > ((ConstraintAnchor) constraintWidgetContainer.f21967N0.get()).m7052d()) {
                            constraintWidgetContainer.f21967N0 = new WeakReference(constraintAnchor5);
                        }
                        WeakReference weakReference2 = constraintWidgetContainer.f21969P0;
                        if (weakReference2 == null || weakReference2.get() == null || constraintAnchor6.m7052d() > ((ConstraintAnchor) constraintWidgetContainer.f21969P0.get()).m7052d()) {
                            constraintWidgetContainer.f21969P0 = new WeakReference(constraintAnchor6);
                        }
                    }
                }
                if (this.f21925m) {
                    linearSystem2.m6822d(solverVariableM6829k3, this.f21906c0);
                    linearSystem2.m6822d(solverVariableM6829k4, this.f21906c0 + this.f21899Y);
                    HashSet hashSet2 = constraintAnchor9.f21857a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        linearSystem2.m6822d(solverVariableM6829k5, this.f21906c0 + this.f21908d0);
                    }
                    if (r192 != 0 && (constraintWidget = this.f21897W) != null) {
                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                        WeakReference weakReference3 = constraintWidgetContainer2.f21966M0;
                        if (weakReference3 == null || weakReference3.get() == null || constraintAnchor7.m7052d() > ((ConstraintAnchor) constraintWidgetContainer2.f21966M0.get()).m7052d()) {
                            constraintWidgetContainer2.f21966M0 = new WeakReference(constraintAnchor7);
                        }
                        WeakReference weakReference4 = constraintWidgetContainer2.f21968O0;
                        if (weakReference4 == null || weakReference4.get() == null || constraintAnchor8.m7052d() > ((ConstraintAnchor) constraintWidgetContainer2.f21968O0.get()).m7052d()) {
                            constraintWidgetContainer2.f21968O0 = new WeakReference(constraintAnchor8);
                        }
                    }
                }
                if (this.f21923l && this.f21925m) {
                    ?? r122 = i2;
                    this.f21923l = r122;
                    this.f21925m = r122;
                    return;
                }
            }
            metrics = LinearSystem.f21144r;
            if (metrics != null) {
                metrics.f21168h++;
            }
            boolean[] zArr4 = this.f21911f;
            if (!z2 && (horizontalWidgetRun2 = this.f21907d) != null) {
                constraintAnchor = constraintAnchor9;
                VerticalWidgetRun verticalWidgetRun2 = this.f21909e;
                if (verticalWidgetRun2 != null) {
                    zArr = zArr4;
                    DependencyNode dependencyNode = horizontalWidgetRun2.f22107h;
                    dimensionBehaviour = dimensionBehaviour5;
                    if (dependencyNode.f22073j && horizontalWidgetRun2.f22108i.f22073j && verticalWidgetRun2.f22107h.f22073j && verticalWidgetRun2.f22108i.f22073j) {
                        if (metrics != null) {
                            metrics.f21164d++;
                        }
                        linearSystem2.m6822d(solverVariableM6829k, dependencyNode.f22070g);
                        linearSystem2.m6822d(solverVariableM6829k2, this.f21907d.f22108i.f22070g);
                        linearSystem2.m6822d(solverVariableM6829k3, this.f21909e.f22107h.f22070g);
                        linearSystem2.m6822d(solverVariableM6829k4, this.f21909e.f22108i.f22070g);
                        linearSystem2.m6822d(solverVariableM6829k5, this.f21909e.f22091k.f22070g);
                        if (this.f21897W == null) {
                            z8 = false;
                        } else {
                            if (i6 != 0 && zArr[0] && !m7067C()) {
                                linearSystem2.m6824f(linearSystem2.m6829k(this.f21897W.f21887M), solverVariableM6829k2, 0, 8);
                            }
                            if (r192 != 0 && zArr[i] && !m7068D()) {
                                z8 = false;
                                linearSystem2.m6824f(linearSystem2.m6829k(this.f21897W.f21888N), solverVariableM6829k4, 0, 8);
                            }
                        }
                        this.f21923l = z8;
                        this.f21925m = z8;
                        return;
                    }
                }
                if (metrics != null) {
                    metrics.f21165e++;
                }
                if (this.f21897W != null) {
                    if (m7066B(0)) {
                        ((ConstraintWidgetContainer) this.f21897W).m7106a0(this, 0);
                        int i27 = i;
                        i22 = i27 == true ? 1 : 0;
                        M7067C = i27;
                    } else {
                        i22 = i;
                        M7067C = m7067C();
                    }
                    if (m7066B(i22)) {
                        ((ConstraintWidgetContainer) this.f21897W).m7106a0(this, i22);
                        zM7068D = true;
                    } else {
                        zM7068D = m7068D();
                    }
                    if (M7067C == 0 && i6 != 0 && this.f21920j0 != 8 && constraintAnchor5.f21862f == null && constraintAnchor6.f21862f == null) {
                        linearSystem2.m6824f(linearSystem2.m6829k(this.f21897W.f21887M), solverVariableM6829k2, 0, 1);
                    }
                    if (!zM7068D && r192 != 0 && this.f21920j0 != 8 && constraintAnchor7.f21862f == null && constraintAnchor8.f21862f == null && constraintAnchor == null) {
                        linearSystem2.m6824f(linearSystem2.m6829k(this.f21897W.f21888N), solverVariableM6829k4, 0, 1);
                    }
                    r12 = M7067C;
                } else {
                    zM7068D = false;
                    r12 = 0;
                }
                i7 = this.f21898X;
                i8 = this.f21910e0;
                if (i7 >= i8) {
                    i8 = i7;
                }
                int i28 = this.f21899Y;
                int i29 = this.f21912f0;
                int i30 = i28 < i29 ? i29 : i28;
                DimensionBehaviour[] dimensionBehaviourArr2 = this.f21896V;
                DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[0];
                DimensionBehaviour dimensionBehaviour7 = DimensionBehaviour.f21951c;
                boolean z9 = dimensionBehaviour6 != dimensionBehaviour7;
                DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[1];
                boolean z10 = dimensionBehaviour8 != dimensionBehaviour7;
                int i31 = this.f21902a0;
                this.f21876B = i31;
                f = this.f21900Z;
                this.f21877C = f;
                int i32 = this.f21937s;
                int i33 = this.f21939t;
                if (f > 0.0f) {
                    solverVariable = solverVariableM6829k4;
                    if (this.f21920j0 != 8) {
                        i11 = (dimensionBehaviour6 == dimensionBehaviour7 && i32 == 0) ? 3 : i32;
                        int i34 = (dimensionBehaviour8 == dimensionBehaviour7 && i33 == 0) ? 3 : i33;
                        if (dimensionBehaviour6 == dimensionBehaviour7 && dimensionBehaviour8 == dimensionBehaviour7) {
                            z4 = zM7068D;
                            if (i11 == 3 && i34 == 3) {
                                if (i31 == -1) {
                                    if (z9 && !z10) {
                                        this.f21876B = 0;
                                    } else if (!z9 && z10) {
                                        this.f21876B = 1;
                                        if (i31 == -1) {
                                            this.f21877C = 1.0f / f;
                                        }
                                    }
                                }
                                if (this.f21876B == 0 && (!constraintAnchor7.m7056h() || !constraintAnchor8.m7056h())) {
                                    this.f21876B = 1;
                                } else if (this.f21876B == 1 && (!constraintAnchor5.m7056h() || !constraintAnchor6.m7056h())) {
                                    this.f21876B = 0;
                                }
                                if (this.f21876B == -1 && (!constraintAnchor7.m7056h() || !constraintAnchor8.m7056h() || !constraintAnchor5.m7056h() || !constraintAnchor6.m7056h())) {
                                    if (constraintAnchor7.m7056h() && constraintAnchor8.m7056h()) {
                                        this.f21876B = 0;
                                    } else if (constraintAnchor5.m7056h() && constraintAnchor6.m7056h()) {
                                        this.f21877C = 1.0f / this.f21877C;
                                        this.f21876B = 1;
                                    }
                                }
                                if (this.f21876B == -1) {
                                    int i35 = this.f21943v;
                                    if (i35 > 0 && this.f21946y == 0) {
                                        this.f21876B = 0;
                                    } else if (i35 == 0 && this.f21946y > 0) {
                                        this.f21877C = 1.0f / this.f21877C;
                                        this.f21876B = 1;
                                    }
                                }
                            }
                            i9 = i6;
                            i10 = i30;
                            z5 = true;
                            i12 = i34;
                            int[] iArr = this.f21941u;
                            iArr[0] = i11;
                            iArr[1] = i12;
                            if (z5) {
                                int i36 = this.f21876B;
                                i13 = -1;
                                boolean z11 = i36 == 0 || i36 == -1;
                                boolean z12 = !z5 && ((i21 = this.f21876B) == 1 || i21 == i13);
                                dimensionBehaviour2 = dimensionBehaviour;
                                z6 = this.f21896V[0] != dimensionBehaviour2 && (this instanceof ConstraintWidgetContainer);
                                if (z6) {
                                    i8 = 0;
                                }
                                ConstraintAnchor constraintAnchor10 = this.f21892R;
                                boolean z13 = !constraintAnchor10.m7056h();
                                boolean z14 = zArr3[0];
                                boolean z15 = zArr3[1];
                                if (this.f21931p == 2 && !this.f21923l) {
                                    if (!z2 || (horizontalWidgetRun = this.f21907d) == null) {
                                        i20 = i9;
                                    } else {
                                        DependencyNode dependencyNode2 = horizontalWidgetRun.f22107h;
                                        i20 = i9;
                                        if (dependencyNode2.f22073j && horizontalWidgetRun.f22108i.f22073j) {
                                            if (z2) {
                                                linearSystem2.m6822d(solverVariableM6829k, dependencyNode2.f22070g);
                                                linearSystem2.m6822d(solverVariableM6829k2, this.f21907d.f22108i.f22070g);
                                                if (this.f21897W != null && i20 != 0 && zArr[0] && !m7067C()) {
                                                    linearSystem2.m6824f(linearSystem2.m6829k(this.f21897W.f21887M), solverVariableM6829k2, 0, 8);
                                                }
                                            }
                                            solverVariable2 = solverVariableM6829k;
                                            dimensionBehaviour3 = dimensionBehaviour7;
                                            solverVariable3 = solverVariableM6829k2;
                                            dimensionBehaviour4 = dimensionBehaviour2;
                                            i14 = i11;
                                            r20 = r12;
                                            solverVariable4 = solverVariableM6829k5;
                                            i15 = i20;
                                            constraintAnchor2 = constraintAnchor;
                                            zArr2 = zArr;
                                            solverVariable5 = solverVariableM6829k3;
                                            constraintAnchor3 = constraintAnchor8;
                                            solverVariable6 = solverVariable;
                                        }
                                    }
                                    ConstraintWidget constraintWidget4 = this.f21897W;
                                    SolverVariable solverVariableM6829k6 = constraintWidget4 != null ? linearSystem2.m6829k(constraintWidget4.f21887M) : null;
                                    ConstraintWidget constraintWidget5 = this.f21897W;
                                    SolverVariable solverVariableM6829k7 = constraintWidget5 != null ? linearSystem2.m6829k(constraintWidget5.f21885K) : null;
                                    boolean z16 = zArr[0];
                                    DimensionBehaviour[] dimensionBehaviourArr3 = this.f21896V;
                                    i14 = i11;
                                    ?? r193 = r12;
                                    zArr2 = zArr;
                                    boolean z17 = z13;
                                    ?? r32 = i20;
                                    dimensionBehaviour3 = dimensionBehaviour7;
                                    constraintAnchor2 = constraintAnchor;
                                    solverVariable5 = solverVariableM6829k3;
                                    constraintAnchor3 = constraintAnchor8;
                                    solverVariable3 = solverVariableM6829k2;
                                    solverVariable4 = solverVariableM6829k5;
                                    solverVariable6 = solverVariable;
                                    solverVariable2 = solverVariableM6829k;
                                    dimensionBehaviour4 = dimensionBehaviour2;
                                    constraintAnchor4 = constraintAnchor10;
                                    linearSystem2 = linearSystem;
                                    m7088h(linearSystem2, true, r32, r192, z16, solverVariableM6829k7, solverVariableM6829k6, dimensionBehaviourArr3[0], z6, this.f21885K, this.f21887M, this.f21904b0, i8, this.f21910e0, this.f21878D[0], this.f21914g0, z11, dimensionBehaviourArr3[1] == dimensionBehaviour7, r193, z4, z14, i14, i12, this.f21943v, this.f21944w, this.f21945x, z17);
                                    r202 = r193 == true ? 1 : 0;
                                    r19 = r192 == true ? 1 : 0;
                                    r3 = r32;
                                    z7 = z17;
                                    if (!z2 || (verticalWidgetRun = this.f21909e) == null) {
                                        solverVariable7 = solverVariable5;
                                        solverVariable8 = solverVariable6;
                                        solverVariable9 = solverVariable4;
                                        i16 = 0;
                                        i17 = 8;
                                        i18 = 1;
                                        i19 = 1;
                                    } else {
                                        DependencyNode dependencyNode3 = verticalWidgetRun.f22107h;
                                        if (dependencyNode3.f22073j && verticalWidgetRun.f22108i.f22073j) {
                                            int i37 = dependencyNode3.f22070g;
                                            solverVariable7 = solverVariable5;
                                            linearSystem2.m6822d(solverVariable7, i37);
                                            solverVariable8 = solverVariable6;
                                            linearSystem2.m6822d(solverVariable8, this.f21909e.f22108i.f22070g);
                                            solverVariable9 = solverVariable4;
                                            linearSystem2.m6822d(solverVariable9, this.f21909e.f22091k.f22070g);
                                            ConstraintWidget constraintWidget6 = this.f21897W;
                                            if (constraintWidget6 == null || z4 || r19 == 0) {
                                                i16 = 0;
                                                i17 = 8;
                                                i18 = 1;
                                            } else {
                                                i18 = 1;
                                                if (zArr2[1]) {
                                                    i16 = 0;
                                                    i17 = 8;
                                                    linearSystem2.m6824f(linearSystem2.m6829k(constraintWidget6.f21888N), solverVariable8, 0, 8);
                                                } else {
                                                    i16 = 0;
                                                    i17 = 8;
                                                }
                                            }
                                            i19 = i16;
                                        }
                                    }
                                    if (this.f21933q == 2) {
                                        i19 = i16;
                                    }
                                    if (i19 == 0 || this.f21925m) {
                                        solverVariable10 = solverVariable7;
                                        solverVariable11 = solverVariable8;
                                    } else {
                                        int i38 = (this.f21896V[i18] == dimensionBehaviour4 && (this instanceof ConstraintWidgetContainer)) ? i18 : i16;
                                        if (i38 != 0) {
                                            i10 = i16;
                                        }
                                        ConstraintWidget constraintWidget7 = this.f21897W;
                                        SolverVariable solverVariableM6829k8 = constraintWidget7 != null ? linearSystem2.m6829k(constraintWidget7.f21888N) : null;
                                        ConstraintWidget constraintWidget8 = this.f21897W;
                                        SolverVariable solverVariableM6829k9 = constraintWidget8 != null ? linearSystem2.m6829k(constraintWidget8.f21886L) : null;
                                        int i39 = this.f21908d0;
                                        if (i39 <= 0) {
                                            ?? r27 = z7;
                                            if (this.f21920j0 == i17) {
                                                ConstraintAnchor constraintAnchor11 = constraintAnchor2;
                                                if (constraintAnchor11.f21862f != null) {
                                                    linearSystem2.m6823e(solverVariable9, solverVariable7, i39, i17);
                                                    linearSystem2.m6823e(solverVariable9, linearSystem2.m6829k(constraintAnchor11.f21862f), constraintAnchor11.m7053e(), i17);
                                                    if (r19 != 0) {
                                                        linearSystem2.m6824f(solverVariableM6829k8, linearSystem2.m6829k(constraintAnchor3), i16, 5);
                                                    }
                                                    r27 = i16;
                                                } else if (this.f21920j0 == i17) {
                                                    linearSystem2.m6823e(solverVariable9, solverVariable7, constraintAnchor11.m7053e(), i17);
                                                    r27 = z7;
                                                } else {
                                                    linearSystem2.m6823e(solverVariable9, solverVariable7, i39, i17);
                                                    r27 = z7;
                                                }
                                            }
                                            boolean z18 = zArr2[i18];
                                            DimensionBehaviour[] dimensionBehaviourArr4 = this.f21896V;
                                            int i40 = i18;
                                            solverVariable10 = solverVariable7;
                                            solverVariable11 = solverVariable8;
                                            m7088h(linearSystem2, false, r19, r3, z18, solverVariableM6829k9, solverVariableM6829k8, dimensionBehaviourArr4[i18], i38, this.f21886L, this.f21888N, this.f21906c0, i10, this.f21912f0, this.f21878D[i40], this.f21916h0, z12, dimensionBehaviourArr4[i16] == dimensionBehaviour3 ? i40 : 0, z4, r202, z15, i12, i14, this.f21946y, this.f21947z, this.f21875A, r27);
                                        }
                                    }
                                    if (z5) {
                                        if (this.f21876B == 1) {
                                            float f2 = this.f21877C;
                                            ArrayRow arrayRowM6830l = linearSystem2.m6830l();
                                            arrayRowM6830l.f21138d.mo6801d(solverVariable11, -1.0f);
                                            arrayRowM6830l.f21138d.mo6801d(solverVariable10, 1.0f);
                                            arrayRowM6830l.f21138d.mo6801d(solverVariable3, f2);
                                            arrayRowM6830l.f21138d.mo6801d(solverVariable2, -f2);
                                            linearSystem2.m6821c(arrayRowM6830l);
                                        } else {
                                            float f3 = this.f21877C;
                                            ArrayRow arrayRowM6830l2 = linearSystem2.m6830l();
                                            arrayRowM6830l2.f21138d.mo6801d(solverVariable3, -1.0f);
                                            arrayRowM6830l2.f21138d.mo6801d(solverVariable2, 1.0f);
                                            arrayRowM6830l2.f21138d.mo6801d(solverVariable11, f3);
                                            arrayRowM6830l2.f21138d.mo6801d(solverVariable10, -f3);
                                            linearSystem2.m6821c(arrayRowM6830l2);
                                        }
                                    }
                                    if (constraintAnchor4.m7056h()) {
                                        ConstraintAnchor constraintAnchor12 = constraintAnchor4;
                                        ConstraintWidget constraintWidget9 = constraintAnchor12.f21862f.f21860d;
                                        float radians = (float) Math.toRadians(this.f21879E + 90.0f);
                                        int iM7053e = constraintAnchor12.m7053e();
                                        ConstraintAnchor.Type type = ConstraintAnchor.Type.f21866a;
                                        SolverVariable solverVariableM6829k10 = linearSystem2.m6829k(mo7093n(type));
                                        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f21867b;
                                        SolverVariable solverVariableM6829k11 = linearSystem2.m6829k(mo7093n(type2));
                                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f21868c;
                                        SolverVariable solverVariableM6829k12 = linearSystem2.m6829k(mo7093n(type3));
                                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f21869d;
                                        SolverVariable solverVariableM6829k13 = linearSystem2.m6829k(mo7093n(type4));
                                        SolverVariable solverVariableM6829k14 = linearSystem2.m6829k(constraintWidget9.mo7093n(type));
                                        SolverVariable solverVariableM6829k15 = linearSystem2.m6829k(constraintWidget9.mo7093n(type2));
                                        SolverVariable solverVariableM6829k16 = linearSystem2.m6829k(constraintWidget9.mo7093n(type3));
                                        SolverVariable solverVariableM6829k17 = linearSystem2.m6829k(constraintWidget9.mo7093n(type4));
                                        ArrayRow arrayRowM6830l3 = linearSystem2.m6830l();
                                        double d = radians;
                                        double dSin = Math.sin(d);
                                        double d2 = iM7053e;
                                        arrayRowM6830l3.f21138d.mo6801d(solverVariableM6829k15, 0.5f);
                                        arrayRowM6830l3.f21138d.mo6801d(solverVariableM6829k17, 0.5f);
                                        arrayRowM6830l3.f21138d.mo6801d(solverVariableM6829k11, -0.5f);
                                        arrayRowM6830l3.f21138d.mo6801d(solverVariableM6829k13, -0.5f);
                                        arrayRowM6830l3.f21136b = -((float) (dSin * d2));
                                        linearSystem2.m6821c(arrayRowM6830l3);
                                        ArrayRow arrayRowM6830l4 = linearSystem2.m6830l();
                                        float fCos = (float) (Math.cos(d) * d2);
                                        arrayRowM6830l4.f21138d.mo6801d(solverVariableM6829k14, 0.5f);
                                        arrayRowM6830l4.f21138d.mo6801d(solverVariableM6829k16, 0.5f);
                                        arrayRowM6830l4.f21138d.mo6801d(solverVariableM6829k10, -0.5f);
                                        arrayRowM6830l4.f21138d.mo6801d(solverVariableM6829k12, -0.5f);
                                        arrayRowM6830l4.f21136b = -fCos;
                                        linearSystem2.m6821c(arrayRowM6830l4);
                                    }
                                    this.f21923l = false;
                                    this.f21925m = false;
                                }
                                solverVariable2 = solverVariableM6829k;
                                dimensionBehaviour3 = dimensionBehaviour7;
                                solverVariable3 = solverVariableM6829k2;
                                dimensionBehaviour4 = dimensionBehaviour2;
                                i14 = i11;
                                r20 = r12;
                                solverVariable4 = solverVariableM6829k5;
                                constraintAnchor2 = constraintAnchor;
                                zArr2 = zArr;
                                solverVariable5 = solverVariableM6829k3;
                                constraintAnchor3 = constraintAnchor8;
                                solverVariable6 = solverVariable;
                                i15 = i9;
                                constraintAnchor4 = constraintAnchor10;
                                z7 = z13;
                                r3 = i15;
                                r19 = r192;
                                r202 = r20;
                                if (z2) {
                                    solverVariable7 = solverVariable5;
                                    solverVariable8 = solverVariable6;
                                    solverVariable9 = solverVariable4;
                                    i16 = 0;
                                    i17 = 8;
                                    i18 = 1;
                                    i19 = 1;
                                }
                                if (this.f21933q == 2) {
                                }
                                if (i19 == 0) {
                                    solverVariable10 = solverVariable7;
                                    solverVariable11 = solverVariable8;
                                }
                                if (z5) {
                                }
                                if (constraintAnchor4.m7056h()) {
                                }
                                this.f21923l = false;
                                this.f21925m = false;
                            }
                            i13 = -1;
                            if (z5) {
                            }
                            dimensionBehaviour2 = dimensionBehaviour;
                            if (this.f21896V[0] != dimensionBehaviour2) {
                            }
                            if (z6) {
                            }
                            ConstraintAnchor constraintAnchor102 = this.f21892R;
                            boolean z132 = !constraintAnchor102.m7056h();
                            boolean z142 = zArr3[0];
                            boolean z152 = zArr3[1];
                            if (this.f21931p == 2) {
                                solverVariable2 = solverVariableM6829k;
                                dimensionBehaviour3 = dimensionBehaviour7;
                                solverVariable3 = solverVariableM6829k2;
                                dimensionBehaviour4 = dimensionBehaviour2;
                                i14 = i11;
                                r20 = r12;
                                solverVariable4 = solverVariableM6829k5;
                                constraintAnchor2 = constraintAnchor;
                                zArr2 = zArr;
                                solverVariable5 = solverVariableM6829k3;
                                constraintAnchor3 = constraintAnchor8;
                                solverVariable6 = solverVariable;
                                i15 = i9;
                                constraintAnchor4 = constraintAnchor102;
                                z7 = z132;
                                r3 = i15;
                                r19 = r192;
                                r202 = r20;
                            }
                            if (z2) {
                            }
                            if (this.f21933q == 2) {
                            }
                            if (i19 == 0) {
                            }
                            if (z5) {
                            }
                            if (constraintAnchor4.m7056h()) {
                            }
                            this.f21923l = false;
                            this.f21925m = false;
                        }
                        z4 = zM7068D;
                        if (dimensionBehaviour6 == dimensionBehaviour7 && i11 == 3) {
                            this.f21876B = 0;
                            i8 = (int) (i28 * f);
                            i9 = i6;
                            i10 = i30;
                            if (dimensionBehaviour8 != dimensionBehaviour7) {
                                i11 = 4;
                                z5 = false;
                            }
                            i12 = i34;
                            int[] iArr2 = this.f21941u;
                            iArr2[0] = i11;
                            iArr2[1] = i12;
                            if (z5) {
                            }
                            if (z5) {
                            }
                            dimensionBehaviour2 = dimensionBehaviour;
                            if (this.f21896V[0] != dimensionBehaviour2) {
                            }
                            if (z6) {
                            }
                            ConstraintAnchor constraintAnchor1022 = this.f21892R;
                            boolean z1322 = !constraintAnchor1022.m7056h();
                            boolean z1422 = zArr3[0];
                            boolean z1522 = zArr3[1];
                            if (this.f21931p == 2) {
                            }
                            if (z2) {
                            }
                            if (this.f21933q == 2) {
                            }
                            if (i19 == 0) {
                            }
                            if (z5) {
                            }
                            if (constraintAnchor4.m7056h()) {
                            }
                            this.f21923l = false;
                            this.f21925m = false;
                        }
                        if (dimensionBehaviour8 == dimensionBehaviour7 && i34 == 3) {
                            this.f21876B = 1;
                            if (i31 == -1) {
                                this.f21877C = 1.0f / f;
                            }
                            i10 = (int) (this.f21877C * i7);
                            if (dimensionBehaviour6 != dimensionBehaviour7) {
                                i9 = i6;
                                i12 = 4;
                            } else {
                                i9 = i6;
                            }
                        } else {
                            i9 = i6;
                            i10 = i30;
                        }
                        z5 = true;
                        i12 = i34;
                        int[] iArr22 = this.f21941u;
                        iArr22[0] = i11;
                        iArr22[1] = i12;
                        if (z5) {
                        }
                        if (z5) {
                        }
                        dimensionBehaviour2 = dimensionBehaviour;
                        if (this.f21896V[0] != dimensionBehaviour2) {
                        }
                        if (z6) {
                        }
                        ConstraintAnchor constraintAnchor10222 = this.f21892R;
                        boolean z13222 = !constraintAnchor10222.m7056h();
                        boolean z14222 = zArr3[0];
                        boolean z15222 = zArr3[1];
                        if (this.f21931p == 2) {
                        }
                        if (z2) {
                        }
                        if (this.f21933q == 2) {
                        }
                        if (i19 == 0) {
                        }
                        if (z5) {
                        }
                        if (constraintAnchor4.m7056h()) {
                        }
                        this.f21923l = false;
                        this.f21925m = false;
                    }
                    z5 = false;
                    int[] iArr222 = this.f21941u;
                    iArr222[0] = i11;
                    iArr222[1] = i12;
                    if (z5) {
                    }
                    if (z5) {
                    }
                    dimensionBehaviour2 = dimensionBehaviour;
                    if (this.f21896V[0] != dimensionBehaviour2) {
                    }
                    if (z6) {
                    }
                    ConstraintAnchor constraintAnchor102222 = this.f21892R;
                    boolean z132222 = !constraintAnchor102222.m7056h();
                    boolean z142222 = zArr3[0];
                    boolean z152222 = zArr3[1];
                    if (this.f21931p == 2) {
                    }
                    if (z2) {
                    }
                    if (this.f21933q == 2) {
                    }
                    if (i19 == 0) {
                    }
                    if (z5) {
                    }
                    if (constraintAnchor4.m7056h()) {
                    }
                    this.f21923l = false;
                    this.f21925m = false;
                }
                solverVariable = solverVariableM6829k4;
                z4 = zM7068D;
                i9 = i6;
                i10 = i30;
                i11 = i32;
                i12 = i33;
                z5 = false;
                int[] iArr2222 = this.f21941u;
                iArr2222[0] = i11;
                iArr2222[1] = i12;
                if (z5) {
                }
                if (z5) {
                }
                dimensionBehaviour2 = dimensionBehaviour;
                if (this.f21896V[0] != dimensionBehaviour2) {
                }
                if (z6) {
                }
                ConstraintAnchor constraintAnchor1022222 = this.f21892R;
                boolean z1322222 = !constraintAnchor1022222.m7056h();
                boolean z1422222 = zArr3[0];
                boolean z1522222 = zArr3[1];
                if (this.f21931p == 2) {
                }
                if (z2) {
                }
                if (this.f21933q == 2) {
                }
                if (i19 == 0) {
                }
                if (z5) {
                }
                if (constraintAnchor4.m7056h()) {
                }
                this.f21923l = false;
                this.f21925m = false;
            }
            constraintAnchor = constraintAnchor9;
            dimensionBehaviour = dimensionBehaviour5;
            zArr = zArr4;
            if (metrics != null) {
            }
            if (this.f21897W != null) {
            }
            i7 = this.f21898X;
            i8 = this.f21910e0;
            if (i7 >= i8) {
            }
            int i282 = this.f21899Y;
            int i292 = this.f21912f0;
            if (i282 < i292) {
            }
            DimensionBehaviour[] dimensionBehaviourArr22 = this.f21896V;
            DimensionBehaviour dimensionBehaviour62 = dimensionBehaviourArr22[0];
            DimensionBehaviour dimensionBehaviour72 = DimensionBehaviour.f21951c;
            if (dimensionBehaviour62 != dimensionBehaviour72) {
            }
            DimensionBehaviour dimensionBehaviour82 = dimensionBehaviourArr22[1];
            if (dimensionBehaviour82 != dimensionBehaviour72) {
            }
            int i312 = this.f21902a0;
            this.f21876B = i312;
            f = this.f21900Z;
            this.f21877C = f;
            int i322 = this.f21937s;
            int i332 = this.f21939t;
            if (f > 0.0f) {
            }
            z4 = zM7068D;
            i9 = i6;
            i10 = i30;
            i11 = i322;
            i12 = i332;
            z5 = false;
            int[] iArr22222 = this.f21941u;
            iArr22222[0] = i11;
            iArr22222[1] = i12;
            if (z5) {
            }
            if (z5) {
            }
            dimensionBehaviour2 = dimensionBehaviour;
            if (this.f21896V[0] != dimensionBehaviour2) {
            }
            if (z6) {
            }
            ConstraintAnchor constraintAnchor10222222 = this.f21892R;
            boolean z13222222 = !constraintAnchor10222222.m7056h();
            boolean z14222222 = zArr3[0];
            boolean z15222222 = zArr3[1];
            if (this.f21931p == 2) {
            }
            if (z2) {
            }
            if (this.f21933q == 2) {
            }
            if (i19 == 0) {
            }
            if (z5) {
            }
            if (constraintAnchor4.m7056h()) {
            }
            this.f21923l = false;
            this.f21925m = false;
        }
        i = 1;
        i2 = 0;
        i3 = i2;
        i4 = i3;
        i5 = this.f21920j0;
        ?? r1922 = i3;
        boolean[] zArr32 = this.f21895U;
        if (i5 == 8) {
            i6 = i4;
        }
        z3 = this.f21923l;
        if (!z3) {
            if (z3) {
            }
            if (this.f21925m) {
            }
            if (this.f21923l) {
                ?? r1222 = i2;
                this.f21923l = r1222;
                this.f21925m = r1222;
                return;
            }
        }
        metrics = LinearSystem.f21144r;
        if (metrics != null) {
        }
        boolean[] zArr42 = this.f21911f;
        if (!z2) {
            constraintAnchor = constraintAnchor9;
            dimensionBehaviour = dimensionBehaviour5;
            zArr = zArr42;
        }
        if (metrics != null) {
        }
        if (this.f21897W != null) {
        }
        i7 = this.f21898X;
        i8 = this.f21910e0;
        if (i7 >= i8) {
        }
        int i2822 = this.f21899Y;
        int i2922 = this.f21912f0;
        if (i2822 < i2922) {
        }
        DimensionBehaviour[] dimensionBehaviourArr222 = this.f21896V;
        DimensionBehaviour dimensionBehaviour622 = dimensionBehaviourArr222[0];
        DimensionBehaviour dimensionBehaviour722 = DimensionBehaviour.f21951c;
        if (dimensionBehaviour622 != dimensionBehaviour722) {
        }
        DimensionBehaviour dimensionBehaviour822 = dimensionBehaviourArr222[1];
        if (dimensionBehaviour822 != dimensionBehaviour722) {
        }
        int i3122 = this.f21902a0;
        this.f21876B = i3122;
        f = this.f21900Z;
        this.f21877C = f;
        int i3222 = this.f21937s;
        int i3322 = this.f21939t;
        if (f > 0.0f) {
        }
        z4 = zM7068D;
        i9 = i6;
        i10 = i30;
        i11 = i3222;
        i12 = i3322;
        z5 = false;
        int[] iArr222222 = this.f21941u;
        iArr222222[0] = i11;
        iArr222222[1] = i12;
        if (z5) {
        }
        if (z5) {
        }
        dimensionBehaviour2 = dimensionBehaviour;
        if (this.f21896V[0] != dimensionBehaviour2) {
        }
        if (z6) {
        }
        ConstraintAnchor constraintAnchor102222222 = this.f21892R;
        boolean z132222222 = !constraintAnchor102222222.m7056h();
        boolean z142222222 = zArr32[0];
        boolean z152222222 = zArr32[1];
        if (this.f21931p == 2) {
        }
        if (z2) {
        }
        if (this.f21933q == 2) {
        }
        if (i19 == 0) {
        }
        if (z5) {
        }
        if (constraintAnchor4.m7056h()) {
        }
        this.f21923l = false;
        this.f21925m = false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo7046g() {
        return this.f21920j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x049b A[PHI: r3
      0x049b: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:282:0x048b, B:284:0x0491, B:285:0x0493, B:287:0x0497] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7088h(LinearSystem linearSystem, boolean z2, boolean z3, boolean z4, boolean z5, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z6, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i5, int i6, int i7, int i8, float f2, boolean z12) {
        int iMin;
        SolverVariable solverVariable3;
        int i9;
        int i10;
        boolean z13;
        SolverVariable solverVariableM6829k;
        SolverVariable solverVariableM6829k2;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable4;
        boolean z14;
        int i11;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        int i12;
        boolean z15;
        boolean z16;
        int i13;
        int i14;
        boolean z17;
        boolean z18;
        ConstraintWidget constraintWidget;
        int i15;
        int i16;
        ConstraintAnchor constraintAnchor4;
        boolean z19;
        int i17;
        boolean z20;
        int iMin2;
        int i18;
        int i19;
        HashSet hashSet;
        int i20;
        int i21;
        int i22;
        boolean z21;
        boolean z22;
        int i23;
        LinearSystem linearSystem2 = linearSystem;
        int i24 = i7;
        int i25 = i8;
        SolverVariable solverVariableM6829k3 = linearSystem2.m6829k(constraintAnchor);
        SolverVariable solverVariableM6829k4 = linearSystem2.m6829k(constraintAnchor2);
        SolverVariable solverVariableM6829k5 = linearSystem2.m6829k(constraintAnchor.f21862f);
        SolverVariable solverVariableM6829k6 = linearSystem2.m6829k(constraintAnchor2.f21862f);
        boolean zM7056h = constraintAnchor.m7056h();
        boolean zM7056h2 = constraintAnchor2.m7056h();
        boolean zM7056h3 = this.f21892R.m7056h();
        int i26 = zM7056h2 ? (zM7056h ? 1 : 0) + 1 : zM7056h ? 1 : 0;
        if (zM7056h3) {
            i26++;
        }
        int i27 = i26;
        int i28 = z7 ? 3 : i5;
        int iOrdinal = dimensionBehaviour.ordinal();
        boolean z23 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i28 == 4) ? false : true;
        int i29 = this.f21915h;
        boolean z24 = z23;
        if (i29 != -1 && z2) {
            this.f21915h = -1;
            i2 = i29;
            z24 = false;
        }
        int i30 = this.f21917i;
        if (i30 == -1 || z2) {
            i30 = i2;
        } else {
            this.f21917i = -1;
            z24 = false;
        }
        int i31 = i30;
        if (this.f21920j0 == 8) {
            iMin = 0;
            z24 = false;
        } else {
            iMin = i31;
        }
        if (z12) {
            if (!zM7056h && !zM7056h2 && !zM7056h3) {
                linearSystem2.m6822d(solverVariableM6829k3, i);
            } else if (zM7056h && !zM7056h2) {
                solverVariable3 = solverVariableM6829k6;
                i9 = 8;
                linearSystem2.m6823e(solverVariableM6829k3, solverVariableM6829k5, constraintAnchor.m7053e(), 8);
            }
            solverVariable3 = solverVariableM6829k6;
            i9 = 8;
        } else {
            solverVariable3 = solverVariableM6829k6;
            i9 = 8;
        }
        if (z24) {
            if (i27 == 2 || z7 || !(i28 == 1 || i28 == 0)) {
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (i25 == -2) {
                    i25 = iMin;
                }
                if (iMin > 0 && i28 != 1) {
                    iMin = 0;
                }
                if (i24 > 0) {
                    linearSystem2.m6824f(solverVariableM6829k4, solverVariableM6829k3, i24, 8);
                    iMin = Math.max(iMin, i24);
                }
                if (i25 > 0) {
                    if (!z3 || i28 != 1) {
                        linearSystem2.m6825g(solverVariableM6829k4, solverVariableM6829k3, i25, 8);
                    }
                    iMin = Math.min(iMin, i25);
                }
                if (i28 == 1) {
                    if (z3) {
                        linearSystem2.m6823e(solverVariableM6829k4, solverVariableM6829k3, iMin, 8);
                    } else if (z9) {
                        linearSystem2.m6823e(solverVariableM6829k4, solverVariableM6829k3, iMin, 5);
                        linearSystem2.m6825g(solverVariableM6829k4, solverVariableM6829k3, iMin, 8);
                    } else {
                        linearSystem2.m6823e(solverVariableM6829k4, solverVariableM6829k3, iMin, 5);
                        linearSystem2.m6825g(solverVariableM6829k4, solverVariableM6829k3, iMin, 8);
                    }
                } else if (i28 == 2) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.f21867b;
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f21869d;
                    ConstraintAnchor.Type type3 = constraintAnchor.f21861e;
                    if (type3 == type || type3 == type2) {
                        solverVariableM6829k = linearSystem2.m6829k(this.f21897W.mo7093n(type));
                        solverVariableM6829k2 = linearSystem2.m6829k(this.f21897W.mo7093n(type2));
                    } else {
                        solverVariableM6829k = linearSystem2.m6829k(this.f21897W.mo7093n(ConstraintAnchor.Type.f21866a));
                        solverVariableM6829k2 = linearSystem2.m6829k(this.f21897W.mo7093n(ConstraintAnchor.Type.f21868c));
                    }
                    ArrayRow arrayRowM6830l = linearSystem2.m6830l();
                    int i32 = i24;
                    arrayRowM6830l.f21138d.mo6801d(solverVariableM6829k4, -1.0f);
                    arrayRowM6830l.f21138d.mo6801d(solverVariableM6829k3, 1.0f);
                    arrayRowM6830l.f21138d.mo6801d(solverVariableM6829k2, f2);
                    arrayRowM6830l.f21138d.mo6801d(solverVariableM6829k, -f2);
                    linearSystem2.m6821c(arrayRowM6830l);
                    if (z3) {
                        z24 = false;
                    }
                    z13 = z5;
                    i10 = i32;
                } else {
                    i10 = i24;
                    z13 = true;
                }
            } else {
                int iMax = Math.max(i24, iMin);
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                linearSystem2.m6823e(solverVariableM6829k4, solverVariableM6829k3, iMax, 8);
                z13 = z5;
                i10 = i24;
                z24 = false;
            }
            if (z12 || z9) {
                boolean z25 = z13;
                if (i27 >= 2 && z3 && z25) {
                    linearSystem2.m6824f(solverVariableM6829k3, solverVariable, 0, 8);
                    ConstraintAnchor constraintAnchor5 = this.f21889O;
                    boolean z26 = z2 || constraintAnchor5.f21862f == null;
                    if (!z2 && (constraintAnchor3 = constraintAnchor5.f21862f) != null) {
                        ConstraintWidget constraintWidget2 = constraintAnchor3.f21860d;
                        if (constraintWidget2.f21900Z != 0.0f) {
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.f21896V;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.f21951c;
                            if (dimensionBehaviour2 == dimensionBehaviour3) {
                                z26 = true;
                                if (dimensionBehaviourArr[1] != dimensionBehaviour3) {
                                    z26 = false;
                                }
                            }
                        }
                    }
                    if (z26) {
                        linearSystem2.m6824f(solverVariable2, solverVariableM6829k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!zM7056h && !zM7056h2 && !zM7056h3) {
                constraintAnchor4 = constraintAnchor2;
                solverVariable7 = solverVariableM6829k4;
                z14 = z13;
                solverVariable4 = solverVariable3;
            } else if (!zM7056h || zM7056h2) {
                if (zM7056h || !zM7056h2) {
                    solverVariable4 = solverVariable3;
                    if (zM7056h && zM7056h2) {
                        ConstraintWidget constraintWidget3 = constraintAnchor.f21862f.f21860d;
                        ConstraintWidget constraintWidget4 = constraintAnchor2.f21862f.f21860d;
                        z14 = z13;
                        ConstraintWidget constraintWidget5 = this.f21897W;
                        int i33 = 6;
                        if (z24) {
                            if (i28 == 0) {
                                if (i25 != 0 || i10 != 0) {
                                    z21 = true;
                                    z22 = false;
                                    z16 = true;
                                    i13 = 5;
                                    i14 = 5;
                                } else if (solverVariableM6829k5.f21182g && solverVariable4.f21182g) {
                                    linearSystem2.m6823e(solverVariableM6829k3, solverVariableM6829k5, constraintAnchor.m7053e(), 8);
                                    linearSystem2.m6823e(solverVariableM6829k4, solverVariable4, -constraintAnchor2.m7053e(), 8);
                                    return;
                                } else {
                                    z21 = false;
                                    z22 = true;
                                    z16 = false;
                                    i13 = 8;
                                    i14 = 8;
                                }
                                if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                    z15 = z21;
                                    solverVariable8 = solverVariableM6829k5;
                                    linearSystem2 = linearSystem;
                                    solverVariable6 = solverVariableM6829k3;
                                    solverVariable7 = solverVariableM6829k4;
                                    i12 = 6;
                                    z17 = z22;
                                    i14 = 4;
                                } else {
                                    z15 = z21;
                                    solverVariable8 = solverVariableM6829k5;
                                    linearSystem2 = linearSystem;
                                    solverVariable6 = solverVariableM6829k3;
                                    solverVariable7 = solverVariableM6829k4;
                                    i12 = 6;
                                    z17 = z22;
                                }
                                i11 = i28;
                            } else {
                                if (i28 == 2) {
                                    if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                        linearSystem2 = linearSystem;
                                        i11 = i28;
                                        solverVariable6 = solverVariableM6829k3;
                                        solverVariable7 = solverVariableM6829k4;
                                        solverVariable8 = solverVariableM6829k5;
                                        i12 = 6;
                                        z15 = true;
                                        z16 = true;
                                        i13 = 5;
                                    } else {
                                        linearSystem2 = linearSystem;
                                        i11 = i28;
                                        solverVariable6 = solverVariableM6829k3;
                                        solverVariable7 = solverVariableM6829k4;
                                        solverVariable8 = solverVariableM6829k5;
                                        i12 = 6;
                                        z15 = true;
                                        z16 = true;
                                        i13 = 5;
                                        i14 = 5;
                                        z17 = false;
                                    }
                                } else if (i28 == 1) {
                                    linearSystem2 = linearSystem;
                                    i11 = i28;
                                    solverVariable6 = solverVariableM6829k3;
                                    solverVariable7 = solverVariableM6829k4;
                                    solverVariable8 = solverVariableM6829k5;
                                    i12 = 6;
                                    z15 = true;
                                    z16 = true;
                                    i13 = 8;
                                } else if (i28 == 3) {
                                    i11 = i28;
                                    if (this.f21876B == -1) {
                                        if (z10) {
                                            linearSystem2 = linearSystem;
                                            solverVariable5 = solverVariable2;
                                            solverVariable6 = solverVariableM6829k3;
                                            solverVariable7 = solverVariableM6829k4;
                                            solverVariable8 = solverVariableM6829k5;
                                            i12 = z3 ? 5 : 4;
                                        } else {
                                            linearSystem2 = linearSystem;
                                            solverVariable5 = solverVariable2;
                                            solverVariable6 = solverVariableM6829k3;
                                            solverVariable7 = solverVariableM6829k4;
                                            solverVariable8 = solverVariableM6829k5;
                                            i12 = 8;
                                        }
                                        z15 = true;
                                        z16 = true;
                                        i13 = 8;
                                    } else if (z7) {
                                        if (i6 == 2 || i6 == 1) {
                                            i21 = 5;
                                            i22 = 4;
                                        } else {
                                            i21 = 8;
                                            i22 = 5;
                                        }
                                        i13 = i21;
                                        i14 = i22;
                                        solverVariable6 = solverVariableM6829k3;
                                        solverVariable7 = solverVariableM6829k4;
                                        solverVariable8 = solverVariableM6829k5;
                                        i12 = 6;
                                        z15 = true;
                                        z16 = true;
                                        z17 = true;
                                        linearSystem2 = linearSystem;
                                    } else if (i25 > 0) {
                                        linearSystem2 = linearSystem;
                                        solverVariable5 = solverVariable2;
                                        solverVariable6 = solverVariableM6829k3;
                                        solverVariable7 = solverVariableM6829k4;
                                        solverVariable8 = solverVariableM6829k5;
                                        i12 = 6;
                                        z15 = true;
                                        z16 = true;
                                        i13 = 5;
                                    } else {
                                        if (i25 != 0 || i10 != 0) {
                                            linearSystem2 = linearSystem;
                                            solverVariable5 = solverVariable2;
                                            solverVariable6 = solverVariableM6829k3;
                                            solverVariable7 = solverVariableM6829k4;
                                            solverVariable8 = solverVariableM6829k5;
                                            i12 = 6;
                                            z15 = true;
                                            z16 = true;
                                            i13 = 5;
                                            i14 = 4;
                                        } else {
                                            if (z10) {
                                                solverVariable5 = solverVariable2;
                                                i13 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                solverVariable6 = solverVariableM6829k3;
                                                solverVariable7 = solverVariableM6829k4;
                                                solverVariable8 = solverVariableM6829k5;
                                                i12 = 6;
                                                z15 = true;
                                                z16 = true;
                                                i14 = 4;
                                                z17 = true;
                                                linearSystem2 = linearSystem;
                                                if (z16 && solverVariable8 == solverVariable4 && constraintWidget3 != constraintWidget5) {
                                                    z16 = false;
                                                    z18 = false;
                                                } else {
                                                    z18 = true;
                                                }
                                                if (z15) {
                                                    constraintWidget = constraintWidget4;
                                                    i15 = i10;
                                                    i16 = i11;
                                                    constraintAnchor4 = constraintAnchor2;
                                                    z19 = z18;
                                                    i17 = i13;
                                                    z20 = z3;
                                                } else {
                                                    if (z24 || z8 || z10 || solverVariable8 != solverVariable || solverVariable4 != solverVariable5) {
                                                        i20 = i12;
                                                        z19 = z18;
                                                        i17 = i13;
                                                        z20 = z3;
                                                    } else {
                                                        i20 = 8;
                                                        z20 = false;
                                                        i17 = 8;
                                                        z19 = false;
                                                    }
                                                    SolverVariable solverVariable9 = solverVariable8;
                                                    i15 = i10;
                                                    i16 = i11;
                                                    constraintWidget = constraintWidget4;
                                                    constraintAnchor4 = constraintAnchor2;
                                                    linearSystem2.m6820b(solverVariable6, solverVariable9, constraintAnchor.m7053e(), f, solverVariable4, solverVariable7, constraintAnchor2.m7053e(), i20);
                                                    solverVariable8 = solverVariable9;
                                                }
                                                if (this.f21920j0 == 8 || ((hashSet = constraintAnchor4.f21857a) != null && hashSet.size() > 0)) {
                                                    if (z16) {
                                                        int i34 = (!z20 || solverVariable8 == solverVariable4 || z24 || !((constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier))) ? i17 : 6;
                                                        linearSystem2.m6824f(solverVariable6, solverVariable8, constraintAnchor.m7053e(), i34);
                                                        linearSystem2.m6825g(solverVariable7, solverVariable4, -constraintAnchor4.m7053e(), i34);
                                                        i17 = i34;
                                                    }
                                                    if (z20 || !z11 || (constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier) || constraintWidget == constraintWidget5) {
                                                        iMin2 = i14;
                                                        i18 = i17;
                                                    } else {
                                                        iMin2 = 6;
                                                        i18 = 6;
                                                        z19 = true;
                                                    }
                                                    if (z19) {
                                                        if (z17 && (!z10 || z4)) {
                                                            if (constraintWidget3 != constraintWidget5 && constraintWidget != constraintWidget5) {
                                                                i33 = iMin2;
                                                            }
                                                            if ((constraintWidget3 instanceof Guideline) || (constraintWidget instanceof Guideline)) {
                                                                i33 = 5;
                                                            }
                                                            if ((constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier)) {
                                                                i33 = 5;
                                                            }
                                                            iMin2 = Math.max(z10 ? 5 : i33, iMin2);
                                                        }
                                                        if (z20) {
                                                            iMin2 = Math.min(i18, iMin2);
                                                            int i35 = (z7 && !z10 && (constraintWidget3 == constraintWidget5 || constraintWidget == constraintWidget5)) ? 4 : iMin2;
                                                            linearSystem2.m6823e(solverVariable6, solverVariable8, constraintAnchor.m7053e(), i35);
                                                            linearSystem2.m6823e(solverVariable7, solverVariable4, -constraintAnchor4.m7053e(), i35);
                                                        }
                                                        if (z20 && z14) {
                                                            int iM7053e = constraintAnchor4.f21862f != null ? constraintAnchor4.m7053e() : 0;
                                                            if (solverVariable4 != solverVariable2) {
                                                                linearSystem2.m6824f(solverVariable2, solverVariable7, iM7053e, i23);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (z20) {
                                                        int iM7053e2 = solverVariable == solverVariable8 ? constraintAnchor.m7053e() : 0;
                                                        if (solverVariable8 != solverVariable) {
                                                            linearSystem2.m6824f(solverVariable6, solverVariable, iM7053e2, 5);
                                                        }
                                                    }
                                                    if (z20 || !z24 || i3 != 0 || i15 != 0) {
                                                        i19 = 5;
                                                        i23 = i19;
                                                    } else if (z24 && i16 == 3) {
                                                        linearSystem2.m6824f(solverVariable7, solverVariable6, 0, 8);
                                                        i19 = 5;
                                                        i23 = i19;
                                                    } else {
                                                        i19 = 5;
                                                        linearSystem2.m6824f(solverVariable7, solverVariable6, 0, 5);
                                                        i23 = i19;
                                                    }
                                                    if (z20) {
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                return;
                                            }
                                            linearSystem2 = linearSystem;
                                            solverVariable5 = solverVariable2;
                                            solverVariable6 = solverVariableM6829k3;
                                            solverVariable7 = solverVariableM6829k4;
                                            solverVariable8 = solverVariableM6829k5;
                                            i12 = 6;
                                            z15 = true;
                                            z16 = true;
                                            i13 = 5;
                                            i14 = 8;
                                        }
                                        z17 = true;
                                        if (z16) {
                                            z18 = true;
                                            if (z15) {
                                            }
                                            if (this.f21920j0 == 8) {
                                            }
                                            if (z16) {
                                            }
                                            if (z20) {
                                                iMin2 = i14;
                                                i18 = i17;
                                                if (z19) {
                                                }
                                                if (z20) {
                                                }
                                                if (z20) {
                                                    i19 = 5;
                                                    i23 = i19;
                                                }
                                            }
                                        }
                                        if (z20) {
                                        }
                                    }
                                    i14 = 5;
                                    z17 = true;
                                    if (z16) {
                                    }
                                    if (z20) {
                                    }
                                } else {
                                    i11 = i28;
                                    linearSystem2 = linearSystem;
                                    solverVariable5 = solverVariable2;
                                    solverVariable6 = solverVariableM6829k3;
                                    solverVariable7 = solverVariableM6829k4;
                                    solverVariable8 = solverVariableM6829k5;
                                    i12 = 6;
                                    z15 = false;
                                    z16 = false;
                                }
                                i14 = 4;
                                z17 = false;
                            }
                            solverVariable5 = solverVariable2;
                            if (z16) {
                            }
                            if (z20) {
                            }
                        } else {
                            i11 = i28;
                            if (solverVariableM6829k5.f21182g && solverVariable4.f21182g) {
                                linearSystem.m6820b(solverVariableM6829k3, solverVariableM6829k5, constraintAnchor.m7053e(), f, solverVariable4, solverVariableM6829k4, constraintAnchor2.m7053e(), 8);
                                if (z3 && z14) {
                                    int iM7053e3 = constraintAnchor2.f21862f != null ? constraintAnchor2.m7053e() : 0;
                                    if (solverVariable4 != solverVariable2) {
                                        linearSystem.m6824f(solverVariable2, solverVariableM6829k4, iM7053e3, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            linearSystem2 = linearSystem;
                            solverVariable5 = solverVariable2;
                            solverVariable6 = solverVariableM6829k3;
                            solverVariable7 = solverVariableM6829k4;
                            solverVariable8 = solverVariableM6829k5;
                            i12 = 6;
                            z15 = true;
                            z16 = true;
                        }
                        i13 = 5;
                        i14 = 4;
                        z17 = false;
                        if (z16) {
                        }
                        if (z20) {
                        }
                    }
                } else {
                    solverVariable4 = solverVariable3;
                    linearSystem2.m6823e(solverVariableM6829k4, solverVariable4, -constraintAnchor2.m7053e(), 8);
                    if (z3) {
                        linearSystem2.m6824f(solverVariableM6829k3, solverVariable, 0, 5);
                        constraintAnchor4 = constraintAnchor2;
                        i19 = 5;
                        solverVariable7 = solverVariableM6829k4;
                        z14 = z13;
                        z20 = z3;
                        i23 = i19;
                        if (z20) {
                        }
                    }
                }
                constraintAnchor4 = constraintAnchor2;
                solverVariable7 = solverVariableM6829k4;
                z14 = z13;
            } else {
                z20 = z3;
                constraintAnchor4 = constraintAnchor2;
                solverVariable7 = solverVariableM6829k4;
                z14 = z13;
                solverVariable4 = solverVariable3;
                i23 = (z3 && (constraintAnchor.f21862f.f21860d instanceof Barrier)) ? 8 : 5;
                if (z20) {
                }
            }
            i19 = 5;
            z20 = z3;
            i23 = i19;
            if (z20) {
            }
        } else if (z6) {
            linearSystem2.m6823e(solverVariableM6829k4, solverVariableM6829k3, 0, 3);
            if (i3 > 0) {
                linearSystem2.m6824f(solverVariableM6829k4, solverVariableM6829k3, i3, i9);
            }
            if (i4 < Integer.MAX_VALUE) {
                linearSystem2.m6825g(solverVariableM6829k4, solverVariableM6829k3, i4, i9);
            }
        } else {
            linearSystem2.m6823e(solverVariableM6829k4, solverVariableM6829k3, iMin, i9);
        }
        z13 = z5;
        i10 = i24;
        if (z12) {
        }
        boolean z252 = z13;
        if (i27 >= 2) {
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7089i(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z2;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f21871g;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f21873j;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f21872i;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f21866a;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f21867b;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.f21868c;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.f21869d;
        if (type == type3) {
            if (type2 != type3) {
                if (type2 == type6 || type2 == type8) {
                    m7089i(type6, constraintWidget, type2, 0);
                    m7089i(type8, constraintWidget, type2, 0);
                    mo7093n(type3).m7049a(constraintWidget.mo7093n(type2), 0);
                    return;
                } else {
                    if (type2 == type7 || type2 == type9) {
                        m7089i(type7, constraintWidget, type2, 0);
                        m7089i(type9, constraintWidget, type2, 0);
                        mo7093n(type3).m7049a(constraintWidget.mo7093n(type2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor constraintAnchorMo7093n = mo7093n(type6);
            ConstraintAnchor constraintAnchorMo7093n2 = mo7093n(type8);
            ConstraintAnchor constraintAnchorMo7093n3 = mo7093n(type7);
            ConstraintAnchor constraintAnchorMo7093n4 = mo7093n(type9);
            boolean z3 = true;
            if ((constraintAnchorMo7093n == null || !constraintAnchorMo7093n.m7056h()) && (constraintAnchorMo7093n2 == null || !constraintAnchorMo7093n2.m7056h())) {
                m7089i(type6, constraintWidget, type6, 0);
                m7089i(type8, constraintWidget, type8, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((constraintAnchorMo7093n3 == null || !constraintAnchorMo7093n3.m7056h()) && (constraintAnchorMo7093n4 == null || !constraintAnchorMo7093n4.m7056h())) {
                m7089i(type7, constraintWidget, type7, 0);
                m7089i(type9, constraintWidget, type9, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                mo7093n(type3).m7049a(constraintWidget.mo7093n(type3), 0);
                return;
            } else if (z2) {
                mo7093n(type5).m7049a(constraintWidget.mo7093n(type5), 0);
                return;
            } else {
                if (z3) {
                    mo7093n(type4).m7049a(constraintWidget.mo7093n(type4), 0);
                    return;
                }
                return;
            }
        }
        if (type == type5 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor constraintAnchorMo7093n5 = mo7093n(type6);
            ConstraintAnchor constraintAnchorMo7093n6 = constraintWidget.mo7093n(type2);
            ConstraintAnchor constraintAnchorMo7093n7 = mo7093n(type8);
            constraintAnchorMo7093n5.m7049a(constraintAnchorMo7093n6, 0);
            constraintAnchorMo7093n7.m7049a(constraintAnchorMo7093n6, 0);
            mo7093n(type5).m7049a(constraintAnchorMo7093n6, 0);
            return;
        }
        if (type == type4 && (type2 == type7 || type2 == type9)) {
            ConstraintAnchor constraintAnchorMo7093n8 = constraintWidget.mo7093n(type2);
            mo7093n(type7).m7049a(constraintAnchorMo7093n8, 0);
            mo7093n(type9).m7049a(constraintAnchorMo7093n8, 0);
            mo7093n(type4).m7049a(constraintAnchorMo7093n8, 0);
            return;
        }
        if (type == type5 && type2 == type5) {
            mo7093n(type6).m7049a(constraintWidget.mo7093n(type6), 0);
            mo7093n(type8).m7049a(constraintWidget.mo7093n(type8), 0);
            mo7093n(type5).m7049a(constraintWidget.mo7093n(type2), 0);
            return;
        }
        if (type == type4 && type2 == type4) {
            mo7093n(type7).m7049a(constraintWidget.mo7093n(type7), 0);
            mo7093n(type9).m7049a(constraintWidget.mo7093n(type9), 0);
            mo7093n(type4).m7049a(constraintWidget.mo7093n(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorMo7093n9 = mo7093n(type);
        ConstraintAnchor constraintAnchorMo7093n10 = constraintWidget.mo7093n(type2);
        if (constraintAnchorMo7093n9.m7057i(constraintAnchorMo7093n10)) {
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.f21870f;
            if (type == type10) {
                ConstraintAnchor constraintAnchorMo7093n11 = mo7093n(type7);
                ConstraintAnchor constraintAnchorMo7093n12 = mo7093n(type9);
                if (constraintAnchorMo7093n11 != null) {
                    constraintAnchorMo7093n11.m7058j();
                }
                if (constraintAnchorMo7093n12 != null) {
                    constraintAnchorMo7093n12.m7058j();
                }
            } else if (type == type7 || type == type9) {
                ConstraintAnchor constraintAnchorMo7093n13 = mo7093n(type10);
                if (constraintAnchorMo7093n13 != null) {
                    constraintAnchorMo7093n13.m7058j();
                }
                ConstraintAnchor constraintAnchorMo7093n14 = mo7093n(type3);
                if (constraintAnchorMo7093n14.f21862f != constraintAnchorMo7093n10) {
                    constraintAnchorMo7093n14.m7058j();
                }
                ConstraintAnchor constraintAnchorM7054f = mo7093n(type).m7054f();
                ConstraintAnchor constraintAnchorMo7093n15 = mo7093n(type4);
                if (constraintAnchorMo7093n15.m7056h()) {
                    constraintAnchorM7054f.m7058j();
                    constraintAnchorMo7093n15.m7058j();
                }
            } else if (type == type6 || type == type8) {
                ConstraintAnchor constraintAnchorMo7093n16 = mo7093n(type3);
                if (constraintAnchorMo7093n16.f21862f != constraintAnchorMo7093n10) {
                    constraintAnchorMo7093n16.m7058j();
                }
                ConstraintAnchor constraintAnchorM7054f2 = mo7093n(type).m7054f();
                ConstraintAnchor constraintAnchorMo7093n17 = mo7093n(type5);
                if (constraintAnchorMo7093n17.m7056h()) {
                    constraintAnchorM7054f2.m7058j();
                    constraintAnchorMo7093n17.m7058j();
                }
            }
            constraintAnchorMo7093n9.m7049a(constraintAnchorMo7093n10, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7090j(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.f21860d == this) {
            m7089i(constraintAnchor.f21861e, constraintAnchor2.f21860d, constraintAnchor2.f21861e, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo7047k(ConstraintWidget constraintWidget, HashMap map) {
        this.f21931p = constraintWidget.f21931p;
        this.f21933q = constraintWidget.f21933q;
        this.f21937s = constraintWidget.f21937s;
        this.f21939t = constraintWidget.f21939t;
        int[] iArr = constraintWidget.f21941u;
        int i = iArr[0];
        int[] iArr2 = this.f21941u;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.f21943v = constraintWidget.f21943v;
        this.f21944w = constraintWidget.f21944w;
        this.f21946y = constraintWidget.f21946y;
        this.f21947z = constraintWidget.f21947z;
        this.f21875A = constraintWidget.f21875A;
        this.f21876B = constraintWidget.f21876B;
        this.f21877C = constraintWidget.f21877C;
        int[] iArr3 = constraintWidget.f21878D;
        this.f21878D = Arrays.copyOf(iArr3, iArr3.length);
        this.f21879E = constraintWidget.f21879E;
        this.f21880F = constraintWidget.f21880F;
        this.f21881G = constraintWidget.f21881G;
        this.f21885K.m7058j();
        this.f21886L.m7058j();
        this.f21887M.m7058j();
        this.f21888N.m7058j();
        this.f21889O.m7058j();
        this.f21890P.m7058j();
        this.f21891Q.m7058j();
        this.f21892R.m7058j();
        this.f21896V = (DimensionBehaviour[]) Arrays.copyOf(this.f21896V, 2);
        this.f21897W = this.f21897W == null ? null : (ConstraintWidget) map.get(constraintWidget.f21897W);
        this.f21898X = constraintWidget.f21898X;
        this.f21899Y = constraintWidget.f21899Y;
        this.f21900Z = constraintWidget.f21900Z;
        this.f21902a0 = constraintWidget.f21902a0;
        this.f21904b0 = constraintWidget.f21904b0;
        this.f21906c0 = constraintWidget.f21906c0;
        this.f21908d0 = constraintWidget.f21908d0;
        this.f21910e0 = constraintWidget.f21910e0;
        this.f21912f0 = constraintWidget.f21912f0;
        this.f21914g0 = constraintWidget.f21914g0;
        this.f21916h0 = constraintWidget.f21916h0;
        this.f21918i0 = constraintWidget.f21918i0;
        this.f21920j0 = constraintWidget.f21920j0;
        this.f21922k0 = constraintWidget.f21922k0;
        this.f21924l0 = constraintWidget.f21924l0;
        this.f21926m0 = constraintWidget.f21926m0;
        this.f21928n0 = constraintWidget.f21928n0;
        float[] fArr = constraintWidget.f21930o0;
        float f = fArr[0];
        float[] fArr2 = this.f21930o0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.f21932p0;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.f21932p0;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.f21934q0;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.f21934q0;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.f21936r0;
        this.f21936r0 = constraintWidget4 == null ? null : (ConstraintWidget) map.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.f21938s0;
        this.f21938s0 = constraintWidget5 != null ? (ConstraintWidget) map.get(constraintWidget5) : null;
    }

    /* JADX INFO: renamed from: l */
    public final void m7091l(LinearSystem linearSystem) {
        linearSystem.m6829k(this.f21885K);
        linearSystem.m6829k(this.f21886L);
        linearSystem.m6829k(this.f21887M);
        linearSystem.m6829k(this.f21888N);
        if (this.f21908d0 > 0) {
            linearSystem.m6829k(this.f21889O);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7092m() {
        if (this.f21907d == null) {
            this.f21907d = new HorizontalWidgetRun(this);
        }
        if (this.f21909e == null) {
            this.f21909e = new VerticalWidgetRun(this);
        }
    }

    /* JADX INFO: renamed from: n */
    public ConstraintAnchor mo7093n(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f21885K;
            case 2:
                return this.f21886L;
            case 3:
                return this.f21887M;
            case 4:
                return this.f21888N;
            case 5:
                return this.f21889O;
            case 6:
                return this.f21892R;
            case 7:
                return this.f21890P;
            case 8:
                return this.f21891Q;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* JADX INFO: renamed from: o */
    public final DimensionBehaviour m7094o(int i) {
        if (i == 0) {
            return this.f21896V[0];
        }
        if (i == 1) {
            return this.f21896V[1];
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final int m7095p() {
        if (this.f21920j0 == 8) {
            return 0;
        }
        return this.f21899Y;
    }

    /* JADX INFO: renamed from: q */
    public final ConstraintWidget m7096q(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f21888N).f21862f) != null && constraintAnchor2.f21862f == constraintAnchor) {
                return constraintAnchor2.f21860d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f21887M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f21862f;
        if (constraintAnchor4 == null || constraintAnchor4.f21862f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f21860d;
    }

    /* JADX INFO: renamed from: r */
    public final ConstraintWidget m7097r(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f21886L).f21862f) != null && constraintAnchor2.f21862f == constraintAnchor) {
                return constraintAnchor2.f21860d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f21885K;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f21862f;
        if (constraintAnchor4 == null || constraintAnchor4.f21862f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f21860d;
    }

    /* JADX INFO: renamed from: s */
    public void mo7098s(StringBuilder sb) {
        sb.append("  " + this.f21921k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f21898X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f21899Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f21904b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f21906c0);
        sb.append("\n");
        m7064u(sb, BlockAlignment.LEFT, this.f21885K);
        m7064u(sb, VerticalAlignment.TOP, this.f21886L);
        m7064u(sb, BlockAlignment.RIGHT, this.f21887M);
        m7064u(sb, VerticalAlignment.BOTTOM, this.f21888N);
        m7064u(sb, "baseline", this.f21889O);
        m7064u(sb, "centerX", this.f21890P);
        m7064u(sb, "centerY", this.f21891Q);
        int i = this.f21898X;
        int i2 = this.f21910e0;
        int i3 = this.f21878D[0];
        int i4 = this.f21943v;
        int i5 = this.f21937s;
        float f = this.f21945x;
        DimensionBehaviour dimensionBehaviour = this.f21896V[0];
        float[] fArr = this.f21930o0;
        float f2 = fArr[0];
        m7063t(sb, "    width", i, i2, i3, i4, i5, f, dimensionBehaviour);
        int i6 = this.f21899Y;
        int i7 = this.f21912f0;
        int i8 = this.f21878D[1];
        int i9 = this.f21946y;
        int i10 = this.f21939t;
        float f3 = this.f21875A;
        DimensionBehaviour dimensionBehaviour2 = this.f21896V[1];
        float f4 = fArr[1];
        m7063t(sb, "    height", i6, i7, i8, i9, i10, f3, dimensionBehaviour2);
        float f5 = this.f21900Z;
        int i11 = this.f21902a0;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        m7062M(sb, "    horizontalBias", this.f21914g0, 0.5f);
        m7062M(sb, "    verticalBias", this.f21916h0, 0.5f);
        m7061L(this.f21926m0, 0, "    horizontalChainStyle", sb);
        m7061L(this.f21928n0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public String toString() {
        StringBuilder sbM2244s = AbstractC0455a.m2244s("");
        sbM2244s.append(this.f21924l0 != null ? AbstractC0000a.m19p(new StringBuilder("id: "), this.f21924l0, " ") : "");
        sbM2244s.append("(");
        sbM2244s.append(this.f21904b0);
        sbM2244s.append(", ");
        sbM2244s.append(this.f21906c0);
        sbM2244s.append(") - (");
        sbM2244s.append(this.f21898X);
        sbM2244s.append(" x ");
        return AbstractC0000a.m11h(this.f21899Y, ")", sbM2244s);
    }

    /* JADX INFO: renamed from: v */
    public final int m7099v() {
        if (this.f21920j0 == 8) {
            return 0;
        }
        return this.f21898X;
    }

    /* JADX INFO: renamed from: w */
    public final int m7100w() {
        ConstraintWidget constraintWidget = this.f21897W;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f21904b0 : ((ConstraintWidgetContainer) constraintWidget).f21957D0 + this.f21904b0;
    }

    /* JADX INFO: renamed from: x */
    public final int m7101x() {
        ConstraintWidget constraintWidget = this.f21897W;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f21906c0 : ((ConstraintWidgetContainer) constraintWidget).f21958E0 + this.f21906c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7102y(int i) {
        if (i == 0) {
            return (this.f21885K.f21862f != null ? 1 : 0) + (this.f21887M.f21862f != null ? 1 : 0) < 2;
        }
        if ((this.f21886L.f21862f != null ? 1 : 0) + (this.f21888N.f21862f != null ? 1 : 0) + (this.f21889O.f21862f != null ? 1 : 0) < 2) {
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7103z(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i == 0) {
            ConstraintAnchor constraintAnchor5 = this.f21885K;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f21862f;
            if (constraintAnchor6 == null || !constraintAnchor6.f21859c || (constraintAnchor4 = (constraintAnchor3 = this.f21887M).f21862f) == null || !constraintAnchor4.f21859c) {
                return false;
            }
            return (constraintAnchor4.m7052d() - constraintAnchor3.m7053e()) - (constraintAnchor5.m7053e() + constraintAnchor5.f21862f.m7052d()) >= i2;
        }
        ConstraintAnchor constraintAnchor7 = this.f21886L;
        ConstraintAnchor constraintAnchor8 = constraintAnchor7.f21862f;
        if (constraintAnchor8 == null || !constraintAnchor8.f21859c || (constraintAnchor2 = (constraintAnchor = this.f21888N).f21862f) == null || !constraintAnchor2.f21859c) {
            return false;
        }
        return (constraintAnchor2.m7052d() - constraintAnchor.m7053e()) - (constraintAnchor7.m7053e() + constraintAnchor7.f21862f.m7052d()) >= i2;
    }

    public ConstraintWidget(int i, int i2) {
        this.f21901a = false;
        this.f21907d = null;
        this.f21909e = null;
        this.f21911f = new boolean[]{true, true};
        this.f21913g = true;
        this.f21915h = -1;
        this.f21917i = -1;
        this.f21919j = new WidgetFrame(this);
        this.f21923l = false;
        this.f21925m = false;
        this.f21927n = false;
        this.f21929o = false;
        this.f21931p = -1;
        this.f21933q = -1;
        this.f21935r = 0;
        this.f21937s = 0;
        this.f21939t = 0;
        this.f21941u = new int[2];
        this.f21943v = 0;
        this.f21944w = 0;
        this.f21945x = 1.0f;
        this.f21946y = 0;
        this.f21947z = 0;
        this.f21875A = 1.0f;
        this.f21876B = -1;
        this.f21877C = 1.0f;
        this.f21878D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f21879E = Float.NaN;
        this.f21880F = false;
        this.f21882H = false;
        this.f21883I = 0;
        this.f21884J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.f21866a);
        this.f21885K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21867b);
        this.f21886L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21868c);
        this.f21887M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21869d);
        this.f21888N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21870f);
        this.f21889O = constraintAnchor5;
        this.f21890P = new ConstraintAnchor(this, ConstraintAnchor.Type.f21872i);
        this.f21891Q = new ConstraintAnchor(this, ConstraintAnchor.Type.f21873j);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.f21871g);
        this.f21892R = constraintAnchor6;
        this.f21893S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f21894T = new ArrayList();
        this.f21895U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f21949a;
        this.f21896V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f21897W = null;
        this.f21900Z = 0.0f;
        this.f21902a0 = -1;
        this.f21908d0 = 0;
        this.f21914g0 = 0.5f;
        this.f21916h0 = 0.5f;
        this.f21920j0 = 0;
        this.f21922k0 = false;
        this.f21924l0 = null;
        this.f21926m0 = 0;
        this.f21928n0 = 0;
        this.f21930o0 = new float[]{-1.0f, -1.0f};
        this.f21932p0 = new ConstraintWidget[]{null, null};
        this.f21934q0 = new ConstraintWidget[]{null, null};
        this.f21936r0 = null;
        this.f21938s0 = null;
        this.f21940t0 = -1;
        this.f21942u0 = -1;
        this.f21904b0 = 0;
        this.f21906c0 = 0;
        this.f21898X = i;
        this.f21899Y = i2;
        m7086d();
    }
}
