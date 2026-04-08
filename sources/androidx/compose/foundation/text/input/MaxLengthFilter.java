package androidx.compose.foundation.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/MaxLengthFilter;", "Landroidx/compose/foundation/text/input/InputTransformation;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final /* data */ class MaxLengthFilter implements InputTransformation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxLengthFilter)) {
            return false;
        }
        ((MaxLengthFilter) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "InputTransformation.maxLength(0)";
    }
}
