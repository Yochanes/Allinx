package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class WidgetFrame {

    /* JADX INFO: renamed from: a */
    public ConstraintWidget f21733a;

    /* JADX INFO: renamed from: b */
    public int f21734b;

    /* JADX INFO: renamed from: c */
    public int f21735c;

    /* JADX INFO: renamed from: d */
    public int f21736d;

    /* JADX INFO: renamed from: e */
    public int f21737e;

    /* JADX INFO: renamed from: f */
    public float f21738f;

    /* JADX INFO: renamed from: g */
    public float f21739g;

    /* JADX INFO: renamed from: h */
    public float f21740h;

    /* JADX INFO: renamed from: i */
    public float f21741i;

    /* JADX INFO: renamed from: j */
    public float f21742j;

    /* JADX INFO: renamed from: k */
    public float f21743k;

    /* JADX INFO: renamed from: l */
    public float f21744l;

    /* JADX INFO: renamed from: m */
    public float f21745m;

    /* JADX INFO: renamed from: n */
    public float f21746n;

    /* JADX INFO: renamed from: o */
    public float f21747o;

    /* JADX INFO: renamed from: p */
    public float f21748p;

    /* JADX INFO: renamed from: q */
    public float f21749q;

    /* JADX INFO: renamed from: r */
    public int f21750r;

    /* JADX INFO: renamed from: s */
    public final HashMap f21751s;

    /* JADX INFO: renamed from: t */
    public TypedBundle f21752t;

    public WidgetFrame() {
        this.f21733a = null;
        this.f21734b = 0;
        this.f21735c = 0;
        this.f21736d = 0;
        this.f21737e = 0;
        this.f21738f = Float.NaN;
        this.f21739g = Float.NaN;
        this.f21740h = Float.NaN;
        this.f21741i = Float.NaN;
        this.f21742j = Float.NaN;
        this.f21743k = Float.NaN;
        this.f21744l = Float.NaN;
        this.f21745m = Float.NaN;
        this.f21746n = Float.NaN;
        this.f21747o = Float.NaN;
        this.f21748p = Float.NaN;
        this.f21749q = Float.NaN;
        this.f21750r = 0;
        this.f21751s = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m7016a(float f, String str, StringBuilder sb) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: b */
    public static void m7017b(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: c */
    public static float m7018c(float f, float f2, float f3, float f4) {
        boolean zIsNaN = Float.isNaN(f);
        boolean zIsNaN2 = Float.isNaN(f2);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f = f3;
        }
        if (zIsNaN2) {
            f2 = f3;
        }
        return AbstractC0000a.m4a(f2, f, f4, f);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7019d() {
        return Float.isNaN(this.f21740h) && Float.isNaN(this.f21741i) && Float.isNaN(this.f21742j) && Float.isNaN(this.f21743k) && Float.isNaN(this.f21744l) && Float.isNaN(this.f21745m) && Float.isNaN(this.f21746n) && Float.isNaN(this.f21747o) && Float.isNaN(this.f21748p);
    }

    /* JADX INFO: renamed from: e */
    public final void m7020e(StringBuilder sb, boolean z2) {
        sb.append("{\n");
        m7017b(this.f21734b, BlockAlignment.LEFT, sb);
        m7017b(this.f21735c, VerticalAlignment.TOP, sb);
        m7017b(this.f21736d, BlockAlignment.RIGHT, sb);
        m7017b(this.f21737e, VerticalAlignment.BOTTOM, sb);
        m7016a(this.f21738f, "pivotX", sb);
        m7016a(this.f21739g, "pivotY", sb);
        m7016a(this.f21740h, "rotationX", sb);
        m7016a(this.f21741i, "rotationY", sb);
        m7016a(this.f21742j, "rotationZ", sb);
        m7016a(this.f21743k, "translationX", sb);
        m7016a(this.f21744l, "translationY", sb);
        m7016a(this.f21745m, "translationZ", sb);
        m7016a(this.f21746n, "scaleX", sb);
        m7016a(this.f21747o, "scaleY", sb);
        m7016a(this.f21748p, "alpha", sb);
        m7017b(this.f21750r, "visibility", sb);
        m7016a(this.f21749q, "interpolatedPos", sb);
        if (this.f21733a != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                ConstraintAnchor constraintAnchorMo7093n = this.f21733a.mo7093n(type);
                if (constraintAnchorMo7093n != null && constraintAnchorMo7093n.f21862f != null) {
                    sb.append("Anchor");
                    sb.append(type.name());
                    sb.append(": ['");
                    String str = constraintAnchorMo7093n.f21862f.f21860d.f21921k;
                    if (str == null) {
                        str = "#PARENT";
                    }
                    sb.append(str);
                    sb.append("', '");
                    sb.append(constraintAnchorMo7093n.f21862f.f21861e.name());
                    sb.append("', '");
                    sb.append(constraintAnchorMo7093n.f21863g);
                    sb.append("'],\n");
                }
            }
        }
        if (z2) {
            m7016a(Float.NaN, "phone_orientation", sb);
        }
        if (z2) {
            m7016a(Float.NaN, "phone_orientation", sb);
        }
        HashMap map = this.f21751s;
        if (map.size() != 0) {
            sb.append("custom : {\n");
            for (String str2 : map.keySet()) {
                CustomVariable customVariable = (CustomVariable) map.get(str2);
                sb.append(str2);
                sb.append(": ");
                switch (customVariable.f21266b) {
                    case 900:
                        sb.append(customVariable.f21267c);
                        sb.append(",\n");
                        break;
                    case 901:
                        sb.append(customVariable.f21268d);
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(CustomVariable.m6852b(customVariable.f21267c));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(customVariable.f21269e);
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: f */
    public final void m7021f(int i, int i2, String str) {
        HashMap map = this.f21751s;
        if (map.containsKey(str)) {
            ((CustomVariable) map.get(str)).f21267c = i2;
        } else {
            map.put(str, new CustomVariable(str, i, i2));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7022g(String str, int i, float f) {
        HashMap map = this.f21751s;
        if (map.containsKey(str)) {
            ((CustomVariable) map.get(str)).f21268d = f;
        } else {
            map.put(str, new CustomVariable(str, i, f));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7023h() {
        ConstraintWidget constraintWidget = this.f21733a;
        if (constraintWidget != null) {
            this.f21734b = constraintWidget.m7100w();
            this.f21735c = this.f21733a.m7101x();
            ConstraintWidget constraintWidget2 = this.f21733a;
            this.f21736d = constraintWidget2.m7100w() + constraintWidget2.f21898X;
            ConstraintWidget constraintWidget3 = this.f21733a;
            this.f21737e = constraintWidget3.m7101x() + constraintWidget3.f21899Y;
            m7024i(this.f21733a.f21919j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7024i(WidgetFrame widgetFrame) {
        if (widgetFrame == null) {
            return;
        }
        this.f21738f = widgetFrame.f21738f;
        this.f21739g = widgetFrame.f21739g;
        this.f21740h = widgetFrame.f21740h;
        this.f21741i = widgetFrame.f21741i;
        this.f21742j = widgetFrame.f21742j;
        this.f21743k = widgetFrame.f21743k;
        this.f21744l = widgetFrame.f21744l;
        this.f21745m = widgetFrame.f21745m;
        this.f21746n = widgetFrame.f21746n;
        this.f21747o = widgetFrame.f21747o;
        this.f21748p = widgetFrame.f21748p;
        this.f21750r = widgetFrame.f21750r;
        this.f21752t = widgetFrame.f21752t;
        HashMap map = this.f21751s;
        map.clear();
        for (CustomVariable customVariable : widgetFrame.f21751s.values()) {
            map.put(customVariable.f21265a, new CustomVariable(customVariable));
        }
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.f21733a = null;
        this.f21734b = 0;
        this.f21735c = 0;
        this.f21736d = 0;
        this.f21737e = 0;
        this.f21738f = Float.NaN;
        this.f21739g = Float.NaN;
        this.f21740h = Float.NaN;
        this.f21741i = Float.NaN;
        this.f21742j = Float.NaN;
        this.f21743k = Float.NaN;
        this.f21744l = Float.NaN;
        this.f21745m = Float.NaN;
        this.f21746n = Float.NaN;
        this.f21747o = Float.NaN;
        this.f21748p = Float.NaN;
        this.f21749q = Float.NaN;
        this.f21750r = 0;
        this.f21751s = new HashMap();
        this.f21733a = constraintWidget;
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.f21733a = null;
        this.f21734b = 0;
        this.f21735c = 0;
        this.f21736d = 0;
        this.f21737e = 0;
        this.f21738f = Float.NaN;
        this.f21739g = Float.NaN;
        this.f21740h = Float.NaN;
        this.f21741i = Float.NaN;
        this.f21742j = Float.NaN;
        this.f21743k = Float.NaN;
        this.f21744l = Float.NaN;
        this.f21745m = Float.NaN;
        this.f21746n = Float.NaN;
        this.f21747o = Float.NaN;
        this.f21748p = Float.NaN;
        this.f21749q = Float.NaN;
        this.f21750r = 0;
        this.f21751s = new HashMap();
        this.f21733a = widgetFrame.f21733a;
        this.f21734b = widgetFrame.f21734b;
        this.f21735c = widgetFrame.f21735c;
        this.f21736d = widgetFrame.f21736d;
        this.f21737e = widgetFrame.f21737e;
        m7024i(widgetFrame);
    }
}
