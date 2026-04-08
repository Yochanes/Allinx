package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements Dependency {

    /* JADX INFO: renamed from: d */
    public final WidgetRun f22067d;

    /* JADX INFO: renamed from: f */
    public int f22069f;

    /* JADX INFO: renamed from: g */
    public int f22070g;

    /* JADX INFO: renamed from: a */
    public WidgetRun f22064a = null;

    /* JADX INFO: renamed from: b */
    public boolean f22065b = false;

    /* JADX INFO: renamed from: c */
    public boolean f22066c = false;

    /* JADX INFO: renamed from: e */
    public Type f22068e = Type.f22076a;

    /* JADX INFO: renamed from: h */
    public int f22071h = 1;

    /* JADX INFO: renamed from: i */
    public DimensionDependency f22072i = null;

    /* JADX INFO: renamed from: j */
    public boolean f22073j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f22074k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f22075l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final Type f22076a;

        /* JADX INFO: renamed from: b */
        public static final Type f22077b;

        /* JADX INFO: renamed from: c */
        public static final Type f22078c;

        /* JADX INFO: renamed from: d */
        public static final Type f22079d;

        /* JADX INFO: renamed from: f */
        public static final Type f22080f;

        /* JADX INFO: renamed from: g */
        public static final Type f22081g;

        /* JADX INFO: renamed from: i */
        public static final Type f22082i;

        /* JADX INFO: renamed from: j */
        public static final Type f22083j;

        /* JADX INFO: renamed from: n */
        public static final /* synthetic */ Type[] f22084n;

        static {
            Type type = new Type("UNKNOWN", 0);
            f22076a = type;
            Type type2 = new Type("HORIZONTAL_DIMENSION", 1);
            f22077b = type2;
            Type type3 = new Type("VERTICAL_DIMENSION", 2);
            f22078c = type3;
            Type type4 = new Type("LEFT", 3);
            f22079d = type4;
            Type type5 = new Type("RIGHT", 4);
            f22080f = type5;
            Type type6 = new Type("TOP", 5);
            f22081g = type6;
            Type type7 = new Type("BOTTOM", 6);
            f22082i = type7;
            Type type8 = new Type("BASELINE", 7);
            f22083j = type8;
            f22084n = new Type[]{type, type2, type3, type4, type5, type6, type7, type8};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f22084n.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f22067d = widgetRun;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* JADX INFO: renamed from: a */
    public final void mo7131a(Dependency dependency) {
        ArrayList<DependencyNode> arrayList = this.f22075l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f22073j) {
                return;
            }
        }
        this.f22066c = true;
        WidgetRun widgetRun = this.f22064a;
        if (widgetRun != null) {
            widgetRun.mo7131a(this);
        }
        if (this.f22065b) {
            this.f22067d.mo7131a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i = 0;
        for (DependencyNode dependencyNode2 : arrayList) {
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.f22073j) {
            DimensionDependency dimensionDependency = this.f22072i;
            if (dimensionDependency != null) {
                if (!dimensionDependency.f22073j) {
                    return;
                } else {
                    this.f22069f = this.f22071h * dimensionDependency.f22070g;
                }
            }
            mo7150d(dependencyNode.f22070g + this.f22069f);
        }
        WidgetRun widgetRun2 = this.f22064a;
        if (widgetRun2 != null) {
            widgetRun2.mo7131a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7148b(WidgetRun widgetRun) {
        this.f22074k.add(widgetRun);
        if (this.f22073j) {
            widgetRun.mo7131a(widgetRun);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7149c() {
        this.f22075l.clear();
        this.f22074k.clear();
        this.f22073j = false;
        this.f22070g = 0;
        this.f22066c = false;
        this.f22065b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo7150d(int i) {
        if (this.f22073j) {
            return;
        }
        this.f22073j = true;
        this.f22070g = i;
        for (Dependency dependency : this.f22074k) {
            dependency.mo7131a(dependency);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22067d.f22101b.f21924l0);
        sb.append(":");
        sb.append(this.f22068e);
        sb.append("(");
        sb.append(this.f22073j ? Integer.valueOf(this.f22070g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f22075l.size());
        sb.append(":d=");
        sb.append(this.f22074k.size());
        sb.append(">");
        return sb.toString();
    }
}
