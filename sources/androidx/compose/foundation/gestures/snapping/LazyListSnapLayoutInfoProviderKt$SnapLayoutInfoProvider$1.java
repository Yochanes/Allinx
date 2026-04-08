package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LazyListState f6146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SnapPosition f6147b;

    public LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(LazyListState lazyListState, SnapPosition snapPosition) {
        this.f6146a = lazyListState;
        this.f6147b = snapPosition;
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    /* JADX INFO: renamed from: a */
    public final float mo2569a(float f, float f2) {
        float fAbs = Math.abs(f2);
        LazyListLayoutInfo lazyListLayoutInfoM2972j = this.f6146a.m2972j();
        int size = 0;
        if (!lazyListLayoutInfoM2972j.mo2935g().isEmpty()) {
            int size2 = lazyListLayoutInfoM2972j.mo2935g().size();
            Iterator it = lazyListLayoutInfoM2972j.mo2935g().iterator();
            while (it.hasNext()) {
                size += ((LazyListItemInfo) it.next()).getSize();
            }
            size /= size2;
        }
        float f3 = fAbs - size;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float mo2570b(float f) {
        LazyListState lazyListState = this.f6146a;
        List listMo2935g = lazyListState.m2972j().mo2935g();
        int size = listMo2935g.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) listMo2935g.get(i);
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = lazyListItemInfo instanceof LazyLayoutMeasuredItem ? (LazyLayoutMeasuredItem) lazyListItemInfo : null;
            if (lazyLayoutMeasuredItem == null || !lazyLayoutMeasuredItem.mo2949g()) {
                LazyListLayoutInfo lazyListLayoutInfoM2972j = lazyListState.m2972j();
                int iMo2929a = (int) (lazyListLayoutInfoM2972j.getF6849p() == Orientation.f5829a ? lazyListLayoutInfoM2972j.mo2929a() & 4294967295L : lazyListLayoutInfoM2972j.mo2929a() >> 32);
                int iMo2932d = lazyListState.m2972j().mo2932d();
                int f6850q = lazyListState.m2972j().getF6850q();
                float fMo2919a = lazyListItemInfo.mo2919a() - this.f6147b.mo2692a(iMo2929a, lazyListItemInfo.getSize(), iMo2932d, f6850q, lazyListItemInfo.getIndex(), lazyListState.m2972j().getF6847n());
                if (fMo2919a <= 0.0f && fMo2919a > f3) {
                    f3 = fMo2919a;
                }
                if (fMo2919a >= 0.0f && fMo2919a < f2) {
                    f2 = fMo2919a;
                }
            }
        }
        char c2 = Math.abs(f) >= ((LazyListMeasureResult) ((SnapshotMutableStateImpl) lazyListState.f6893e).getF20325a()).f6842i.mo2551X0(SnapFlingBehaviorKt.f6175a) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c2 == 0) {
            if (Math.abs(f2) <= Math.abs(f3)) {
                f3 = f2;
            }
        } else if (c2 != 1) {
            if (c2 != 2) {
                f3 = 0.0f;
            }
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }
}
