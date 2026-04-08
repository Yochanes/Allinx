package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {

    /* JADX INFO: renamed from: a */
    public int f22100a;

    /* JADX INFO: renamed from: b */
    public ConstraintWidget f22101b;

    /* JADX INFO: renamed from: c */
    public RunGroup f22102c;

    /* JADX INFO: renamed from: d */
    public ConstraintWidget.DimensionBehaviour f22103d;

    /* JADX INFO: renamed from: e */
    public final DimensionDependency f22104e = new DimensionDependency(this);

    /* JADX INFO: renamed from: f */
    public int f22105f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f22106g = false;

    /* JADX INFO: renamed from: h */
    public final DependencyNode f22107h = new DependencyNode(this);

    /* JADX INFO: renamed from: i */
    public final DependencyNode f22108i = new DependencyNode(this);

    /* JADX INFO: renamed from: j */
    public RunType f22109j = RunType.f22111a;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C13941 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22110a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f22110a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22110a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22110a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22110a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22110a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class RunType {

        /* JADX INFO: renamed from: a */
        public static final RunType f22111a;

        /* JADX INFO: renamed from: b */
        public static final RunType f22112b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ RunType[] f22113c;

        static {
            RunType runType = new RunType("NONE", 0);
            f22111a = runType;
            RunType runType2 = new RunType("START", 1);
            RunType runType3 = new RunType("END", 2);
            RunType runType4 = new RunType("CENTER", 3);
            f22112b = runType4;
            f22113c = new RunType[]{runType, runType2, runType3, runType4};
        }

        public static RunType valueOf(String str) {
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            return (RunType[]) f22113c.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f22101b = constraintWidget;
    }

    /* JADX INFO: renamed from: b */
    public static void m7170b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f22075l.add(dependencyNode2);
        dependencyNode.f22069f = i;
        dependencyNode2.f22074k.add(dependencyNode);
    }

    /* JADX INFO: renamed from: h */
    public static DependencyNode m7171h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f21862f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f21860d;
        int iOrdinal = constraintAnchor2.f21861e.ordinal();
        if (iOrdinal == 1) {
            return constraintWidget.f21907d.f22107h;
        }
        if (iOrdinal == 2) {
            return constraintWidget.f21909e.f22107h;
        }
        if (iOrdinal == 3) {
            return constraintWidget.f21907d.f22108i;
        }
        if (iOrdinal == 4) {
            return constraintWidget.f21909e.f22108i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return constraintWidget.f21909e.f22091k;
    }

    /* JADX INFO: renamed from: i */
    public static DependencyNode m7172i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f21862f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f21860d;
        WidgetRun widgetRun = i == 0 ? constraintWidget.f21907d : constraintWidget.f21909e;
        int iOrdinal = constraintAnchor2.f21861e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return widgetRun.f22107h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return widgetRun.f22108i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m7173c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        dependencyNode.f22075l.add(dependencyNode2);
        dependencyNode.f22075l.add(this.f22104e);
        dependencyNode.f22071h = i;
        dependencyNode.f22072i = dimensionDependency;
        dependencyNode2.f22074k.add(dependencyNode);
        dimensionDependency.f22074k.add(dependencyNode);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7132d();

    /* JADX INFO: renamed from: e */
    public abstract void mo7133e();

    /* JADX INFO: renamed from: f */
    public abstract void mo7134f();

    /* JADX INFO: renamed from: g */
    public final int m7174g(int i, int i2) {
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f22101b;
            int i3 = constraintWidget.f21944w;
            int iMax = Math.max(constraintWidget.f21943v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f22101b;
            int i4 = constraintWidget2.f21947z;
            int iMax2 = Math.max(constraintWidget2.f21946y, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public long mo7135j() {
        if (this.f22104e.f22073j) {
            return r0.f22070g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo7136k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7175l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        DependencyNode dependencyNodeM7171h = m7171h(constraintAnchor);
        DependencyNode dependencyNodeM7171h2 = m7171h(constraintAnchor2);
        if (dependencyNodeM7171h.f22073j && dependencyNodeM7171h2.f22073j) {
            int iM7053e = constraintAnchor.m7053e() + dependencyNodeM7171h.f22070g;
            int iM7053e2 = dependencyNodeM7171h2.f22070g - constraintAnchor2.m7053e();
            int i2 = iM7053e2 - iM7053e;
            DimensionDependency dimensionDependency = this.f22104e;
            if (!dimensionDependency.f22073j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f22103d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f21951c;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i3 = this.f22100a;
                    if (i3 == 0) {
                        dimensionDependency.mo7150d(m7174g(i2, i));
                    } else if (i3 == 1) {
                        dimensionDependency.mo7150d(Math.min(m7174g(dimensionDependency.f22085m, i), i2));
                    } else if (i3 == 2) {
                        ConstraintWidget constraintWidget = this.f22101b;
                        ConstraintWidget constraintWidget2 = constraintWidget.f21897W;
                        if (constraintWidget2 != null) {
                            if ((i == 0 ? constraintWidget2.f21907d : constraintWidget2.f21909e).f22104e.f22073j) {
                                dimensionDependency.mo7150d(m7174g((int) ((r6.f22070g * (i == 0 ? constraintWidget.f21945x : constraintWidget.f21875A)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        ConstraintWidget constraintWidget3 = this.f22101b;
                        WidgetRun widgetRun = constraintWidget3.f21907d;
                        if (widgetRun.f22103d == dimensionBehaviour2 && widgetRun.f22100a == 3) {
                            VerticalWidgetRun verticalWidgetRun = constraintWidget3.f21909e;
                            if (verticalWidgetRun.f22103d != dimensionBehaviour2 || verticalWidgetRun.f22100a != 3) {
                            }
                        } else {
                            if (i == 0) {
                                widgetRun = constraintWidget3.f21909e;
                            }
                            if (widgetRun.f22104e.f22073j) {
                                float f = constraintWidget3.f21900Z;
                                dimensionDependency.mo7150d(i == 1 ? (int) ((r6.f22070g / f) + 0.5f) : (int) ((f * r6.f22070g) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (dimensionDependency.f22073j) {
                int i4 = dimensionDependency.f22070g;
                DependencyNode dependencyNode = this.f22108i;
                DependencyNode dependencyNode2 = this.f22107h;
                if (i4 == i2) {
                    dependencyNode2.mo7150d(iM7053e);
                    dependencyNode.mo7150d(iM7053e2);
                    return;
                }
                float f2 = i == 0 ? this.f22101b.f21914g0 : this.f22101b.f21916h0;
                if (dependencyNodeM7171h == dependencyNodeM7171h2) {
                    iM7053e = dependencyNodeM7171h.f22070g;
                    iM7053e2 = dependencyNodeM7171h2.f22070g;
                    f2 = 0.5f;
                }
                dependencyNode2.mo7150d((int) ((((iM7053e2 - iM7053e) - i4) * f2) + iM7053e + 0.5f));
                dependencyNode.mo7150d(dependencyNode2.f22070g + dimensionDependency.f22070g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* JADX INFO: renamed from: a */
    public void mo7131a(Dependency dependency) {
    }
}
