package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "currentValue", "", "<anonymous parameter 1>", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class PagerStateKt$animateScrollToPage$4 extends Lambda implements Function2<Float, Float, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.FloatRef f7895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PagerScrollScopeKt$LazyLayoutScrollScope$1 f7896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateKt$animateScrollToPage$4(Ref.FloatRef floatRef, PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1) {
        super(2);
        this.f7895a = floatRef;
        this.f7896b = pagerScrollScopeKt$LazyLayoutScrollScope$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        Ref.FloatRef floatRef = this.f7895a;
        floatRef.f51656a += this.f7896b.f7825a.mo2579e(fFloatValue - floatRef.f51656a);
        return Unit.f51459a;
    }
}
