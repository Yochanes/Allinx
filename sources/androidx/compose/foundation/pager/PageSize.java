package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "Fill", "Fixed", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PageSize {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Fixed implements PageSize {
        @Override // androidx.compose.foundation.pager.PageSize
        /* JADX INFO: renamed from: a */
        public final int mo3144a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, int i2) {
            return lazyLayoutMeasureScope.mo2554k1(0.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fixed)) {
                return false;
            }
            ((Fixed) obj).getClass();
            return C1338Dp.m6641a(0.0f, 0.0f);
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }
    }

    /* JADX INFO: renamed from: a */
    int mo3144a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, int i2);

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Fill implements PageSize {

        /* JADX INFO: renamed from: a */
        public static final Fill f7715a = new Fill();

        @Override // androidx.compose.foundation.pager.PageSize
        /* JADX INFO: renamed from: a */
        public final int mo3144a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, int i2) {
            return i;
        }
    }
}
