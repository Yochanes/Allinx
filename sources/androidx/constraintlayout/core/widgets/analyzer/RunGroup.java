package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class RunGroup {

    /* JADX INFO: renamed from: a */
    public WidgetRun f22089a;

    /* JADX INFO: renamed from: b */
    public ArrayList f22090b;

    /* JADX INFO: renamed from: a */
    public static long m7164a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f22067d;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        ArrayList arrayList = dependencyNode.f22074k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) arrayList.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f22067d != widgetRun) {
                    jMin = Math.min(jMin, m7164a(dependencyNode2, ((long) dependencyNode2.f22069f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f22108i) {
            return jMin;
        }
        long jMo7135j = widgetRun.mo7135j();
        DependencyNode dependencyNode3 = widgetRun.f22107h;
        long j2 = j - jMo7135j;
        return Math.min(Math.min(jMin, m7164a(dependencyNode3, j2)), j2 - ((long) dependencyNode3.f22069f));
    }

    /* JADX INFO: renamed from: b */
    public static long m7165b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f22067d;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        ArrayList arrayList = dependencyNode.f22074k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) arrayList.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f22067d != widgetRun) {
                    jMax = Math.max(jMax, m7165b(dependencyNode2, ((long) dependencyNode2.f22069f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f22107h) {
            return jMax;
        }
        long jMo7135j = widgetRun.mo7135j();
        DependencyNode dependencyNode3 = widgetRun.f22108i;
        long j2 = j + jMo7135j;
        return Math.max(Math.max(jMax, m7165b(dependencyNode3, j2)), j2 - ((long) dependencyNode3.f22069f));
    }
}
