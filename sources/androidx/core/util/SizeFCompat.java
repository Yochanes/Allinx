package androidx.core.util;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class SizeFCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api21Impl {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        ((SizeFCompat) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "0.0x0.0";
    }
}
