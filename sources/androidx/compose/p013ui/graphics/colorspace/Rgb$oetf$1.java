package androidx.compose.p013ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class Rgb$oetf$1 extends Lambda implements Function1<Double, Double> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Rgb f17751a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.f17751a = rgb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Double.valueOf(RangesKt.m18654a(this.f17751a.f17743k.mo40d(((Number) obj).doubleValue()), r10.f17737e, r10.f17738f));
    }
}
