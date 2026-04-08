package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "", "packedValue", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class GridItemSpan {

    /* JADX INFO: renamed from: a */
    public final long f6945a;

    public /* synthetic */ GridItemSpan(long j) {
        this.f6945a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GridItemSpan) {
            return this.f6945a == ((GridItemSpan) obj).f6945a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6945a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f6945a + ')';
    }
}
