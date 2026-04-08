package androidx.compose.p013ui.layout;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/layout/ApproachIntrinsicsMeasureScope$layout$1", "Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ApproachIntrinsicsMeasureScope$layout$1 implements MeasureResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f18428b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18429c;

    public ApproachIntrinsicsMeasureScope$layout$1(Map map, int i, int i2) {
        this.f18427a = i;
        this.f18428b = i2;
        this.f18429c = map;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    /* JADX INFO: renamed from: getHeight, reason: from getter */
    public final int getF18428b() {
        return this.f18428b;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    /* JADX INFO: renamed from: getWidth, reason: from getter */
    public final int getF18427a() {
        return this.f18427a;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Map getF18429c() {
        return this.f18429c;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    /* JADX INFO: renamed from: r */
    public final Function1 mo2943r() {
        return null;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    /* JADX INFO: renamed from: q */
    public final void mo2942q() {
    }
}
