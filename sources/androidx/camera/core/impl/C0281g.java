package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.camera.core.impl.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0281g implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2840a;

    public /* synthetic */ C0281g(int i) {
        this.f2840a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2840a) {
            case 0:
                C0281g c0281g = OptionsBundle.f2749G;
                return ((Config.Option) obj).mo1384c().compareTo(((Config.Option) obj2).mo1384c());
            case 1:
                return Intrinsics.m18601i(((LazyLayoutMeasuredItem) obj).getF7058a(), ((LazyLayoutMeasuredItem) obj2).getF7058a());
            case 2:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.f18705X;
                float f = layoutNode.f18722N.f18792p.f18873K;
                float f2 = layoutNode2.f18722N.f18792p.f18873K;
                return f == f2 ? Intrinsics.m18601i(layoutNode.m5794M(), layoutNode2.m5794M()) : Float.compare(f, f2);
            case 3:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f51427b).intValue() - ((Number) pair.f51426a).intValue()) - (((Number) pair2.f51427b).intValue() - ((Number) pair2.f51426a).intValue());
            case 4:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 5:
                return ((Double) obj).compareTo((Double) obj2);
            case 6:
                return CrashlyticsReportPersistence.m15199d((File) obj, (File) obj2);
            case 7:
                return CrashlyticsReportPersistence.m15198c((File) obj, (File) obj2);
            default:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
        }
    }
}
