package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a */
    public final Object f55011a;

    /* JADX INFO: renamed from: b */
    public final Object f55012b;

    public ApproximationBounds(Object obj, Object obj2) {
        this.f55011a = obj;
        this.f55012b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.m18594b(this.f55011a, approximationBounds.f55011a) && Intrinsics.m18594b(this.f55012b, approximationBounds.f55012b);
    }

    public final int hashCode() {
        Object obj = this.f55011a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f55012b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f55011a + ", upper=" + this.f55012b + ')';
    }
}
