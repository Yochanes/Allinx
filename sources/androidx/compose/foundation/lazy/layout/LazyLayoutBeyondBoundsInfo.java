package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "Interval", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyLayoutBeyondBoundsInfo {

    /* JADX INFO: renamed from: a */
    public final MutableVector f7195a = new MutableVector(new Interval[16], 0);

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Interval {

        /* JADX INFO: renamed from: a */
        public final int f7196a;

        /* JADX INFO: renamed from: b */
        public final int f7197b;

        public Interval(int i, int i2) {
            this.f7196a = i;
            this.f7197b = i2;
            if (!(i >= 0)) {
                InlineClassHelperKt.m2705a("negative start index");
            }
            if (i2 >= i) {
                return;
            }
            InlineClassHelperKt.m2705a("end index greater than start");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.f7196a == interval.f7196a && this.f7197b == interval.f7197b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7197b) + (Integer.hashCode(this.f7196a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.f7196a);
            sb.append(", end=");
            return AbstractC0000a.m17n(sb, this.f7197b, ')');
        }
    }
}
