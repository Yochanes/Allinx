package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DimensionDependency extends DependencyNode {

    /* JADX INFO: renamed from: m */
    public int f22085m;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.f22068e = DependencyNode.Type.f22077b;
        } else {
            this.f22068e = DependencyNode.Type.f22078c;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    /* JADX INFO: renamed from: d */
    public final void mo7150d(int i) {
        if (this.f22073j) {
            return;
        }
        this.f22073j = true;
        this.f22070g = i;
        for (Dependency dependency : this.f22074k) {
            dependency.mo7131a(dependency);
        }
    }
}
