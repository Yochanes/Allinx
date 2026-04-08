package androidx.compose.p013ui.graphics.colorspace;

import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1223a implements DoubleFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17761a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Rgb f17762b;

    public /* synthetic */ C1223a(Rgb rgb, int i) {
        this.f17761a = i;
        this.f17762b = rgb;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
    /* JADX INFO: renamed from: d */
    public final double mo40d(double d) {
        switch (this.f17761a) {
            case 0:
                return RangesKt.m18654a(this.f17762b.f17743k.mo40d(d), r10.f17737e, r10.f17738f);
            default:
                return this.f17762b.f17746n.mo40d(RangesKt.m18654a(d, r0.f17737e, r0.f17738f));
        }
    }
}
