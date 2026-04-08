package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Position implements Serializable {

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        ((Position) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + (Integer.hashCode(-1) * 31);
    }

    public final String toString() {
        return "Position(line=-1, column=-1)";
    }
}
