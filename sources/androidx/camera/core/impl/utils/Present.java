package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class Present<T> extends Optional<T> {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Present)) {
            return false;
        }
        ((Present) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Optional.of(null)";
    }
}
