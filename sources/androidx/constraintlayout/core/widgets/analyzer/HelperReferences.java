package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class HelperReferences extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* JADX INFO: renamed from: a */
    public final void mo7131a(Dependency dependency) {
        Barrier barrier = (Barrier) this.f22101b;
        int i = barrier.f21837x0;
        DependencyNode dependencyNode = this.f22107h;
        Iterator it = dependencyNode.f22075l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((DependencyNode) it.next()).f22070g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            dependencyNode.mo7150d(i3 + barrier.f21839z0);
        } else {
            dependencyNode.mo7150d(i2 + barrier.f21839z0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: d */
    public final void mo7132d() {
        ConstraintWidget constraintWidget = this.f22101b;
        if (constraintWidget instanceof Barrier) {
            DependencyNode dependencyNode = this.f22107h;
            dependencyNode.f22065b = true;
            Barrier barrier = (Barrier) constraintWidget;
            int i = barrier.f21837x0;
            boolean z2 = barrier.f21838y0;
            int i2 = 0;
            if (i == 0) {
                dependencyNode.f22068e = DependencyNode.Type.f22079d;
                while (i2 < barrier.f22027w0) {
                    ConstraintWidget constraintWidget2 = barrier.f22026v0[i2];
                    if (z2 || constraintWidget2.f21920j0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f21907d.f22107h;
                        dependencyNode2.f22074k.add(dependencyNode);
                        dependencyNode.f22075l.add(dependencyNode2);
                    }
                    i2++;
                }
                m7161m(this.f22101b.f21907d.f22107h);
                m7161m(this.f22101b.f21907d.f22108i);
                return;
            }
            if (i == 1) {
                dependencyNode.f22068e = DependencyNode.Type.f22080f;
                while (i2 < barrier.f22027w0) {
                    ConstraintWidget constraintWidget3 = barrier.f22026v0[i2];
                    if (z2 || constraintWidget3.f21920j0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f21907d.f22108i;
                        dependencyNode3.f22074k.add(dependencyNode);
                        dependencyNode.f22075l.add(dependencyNode3);
                    }
                    i2++;
                }
                m7161m(this.f22101b.f21907d.f22107h);
                m7161m(this.f22101b.f21907d.f22108i);
                return;
            }
            if (i == 2) {
                dependencyNode.f22068e = DependencyNode.Type.f22081g;
                while (i2 < barrier.f22027w0) {
                    ConstraintWidget constraintWidget4 = barrier.f22026v0[i2];
                    if (z2 || constraintWidget4.f21920j0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f21909e.f22107h;
                        dependencyNode4.f22074k.add(dependencyNode);
                        dependencyNode.f22075l.add(dependencyNode4);
                    }
                    i2++;
                }
                m7161m(this.f22101b.f21909e.f22107h);
                m7161m(this.f22101b.f21909e.f22108i);
                return;
            }
            if (i != 3) {
                return;
            }
            dependencyNode.f22068e = DependencyNode.Type.f22082i;
            while (i2 < barrier.f22027w0) {
                ConstraintWidget constraintWidget5 = barrier.f22026v0[i2];
                if (z2 || constraintWidget5.f21920j0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f21909e.f22108i;
                    dependencyNode5.f22074k.add(dependencyNode);
                    dependencyNode.f22075l.add(dependencyNode5);
                }
                i2++;
            }
            m7161m(this.f22101b.f21909e.f22107h);
            m7161m(this.f22101b.f21909e.f22108i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: e */
    public final void mo7133e() {
        ConstraintWidget constraintWidget = this.f22101b;
        if (constraintWidget instanceof Barrier) {
            int i = ((Barrier) constraintWidget).f21837x0;
            DependencyNode dependencyNode = this.f22107h;
            if (i == 0 || i == 1) {
                constraintWidget.f21904b0 = dependencyNode.f22070g;
            } else {
                constraintWidget.f21906c0 = dependencyNode.f22070g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: f */
    public final void mo7134f() {
        this.f22102c = null;
        this.f22107h.m7149c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: k */
    public final boolean mo7136k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m7161m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f22107h;
        dependencyNode2.f22074k.add(dependencyNode);
        dependencyNode.f22075l.add(dependencyNode2);
    }
}
