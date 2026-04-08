package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1 extends Lambda implements Function1<LazyStaggeredGridItemInfo, Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(int i) {
        super(1);
        this.f7586a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((LazyStaggeredGridItemInfo) obj).getIndex() - this.f7586a);
    }
}
