package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/FloatFloatPair;", "", "packedValue", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class FloatFloatPair {
    public final boolean equals(Object obj) {
        if (!(obj instanceof FloatFloatPair)) {
            return false;
        }
        ((FloatFloatPair) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "(" + Float.intBitsToFloat((int) 0) + ", " + Float.intBitsToFloat((int) 0) + ')';
    }
}
