package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00028\u0000¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/StableValue;", "T", "", "value", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
final class StableValue<T> {
    public final boolean equals(Object obj) {
        if (!(obj instanceof StableValue)) {
            return false;
        }
        ((StableValue) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "StableValue(value=null)";
    }
}
