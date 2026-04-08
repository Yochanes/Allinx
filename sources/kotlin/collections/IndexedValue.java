package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class IndexedValue<T> {

    /* JADX INFO: renamed from: a */
    public final int f51499a;

    /* JADX INFO: renamed from: b */
    public final Object f51500b;

    public IndexedValue(int i, Object obj) {
        this.f51499a = i;
        this.f51500b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f51499a == indexedValue.f51499a && Intrinsics.m18594b(this.f51500b, indexedValue.f51500b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f51499a) * 31;
        Object obj = this.f51500b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f51499a + ", value=" + this.f51500b + ')';
    }
}
