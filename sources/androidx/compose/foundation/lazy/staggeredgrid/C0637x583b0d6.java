package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"<anonymous>", "", "T", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C0637x583b0d6 extends Lambda implements Function1<LazyStaggeredGridLaneInfo.SpannedItem, Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Integer f7521a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0637x583b0d6(Integer num) {
        super(1);
        this.f7521a = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(ComparisonsKt.m18545a(Integer.valueOf(((LazyStaggeredGridLaneInfo.SpannedItem) obj).f7518a), this.f7521a));
    }
}
