package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/ObjectLongMap;", "K", "", "Landroidx/collection/MutableObjectLongMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ObjectLongMap<K> {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectLongMap)) {
            return false;
        }
        ((ObjectLongMap) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "{}";
    }
}
