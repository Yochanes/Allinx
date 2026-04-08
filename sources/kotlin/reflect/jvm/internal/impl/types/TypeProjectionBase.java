package kotlin.reflect.jvm.internal.impl.types;

import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeProjectionBase implements TypeProjection {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        return mo20160c() == typeProjection.mo20160c() && mo20158a() == typeProjection.mo20158a() && getType().equals(typeProjection.getType());
    }

    public final int hashCode() {
        int iHashCode = mo20158a().hashCode();
        if (TypeUtils.m20211m(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo20160c() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (mo20160c()) {
            return Marker.ANY_MARKER;
        }
        if (mo20158a() == Variance.f54896c) {
            return getType().toString();
        }
        return mo20158a() + " " + getType();
    }
}
