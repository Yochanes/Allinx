package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", "T", "", "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface IntervalList<T> {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "T", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Interval<T> {

        /* JADX INFO: renamed from: a */
        public final int f7186a;

        /* JADX INFO: renamed from: b */
        public final int f7187b;

        /* JADX INFO: renamed from: c */
        public final LazyLayoutIntervalContent.Interval f7188c;

        public Interval(int i, int i2, LazyLayoutIntervalContent.Interval interval) {
            this.f7186a = i;
            this.f7187b = i2;
            this.f7188c = interval;
            if (i < 0) {
                InlineClassHelperKt.m2705a("startIndex should be >= 0");
            }
            if (i2 > 0) {
                return;
            }
            InlineClassHelperKt.m2705a("size should be > 0");
        }
    }
}
