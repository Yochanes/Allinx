package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class StarRating extends Rating {
    static {
        Util.m9594D(1);
        Util.m9594D(2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        ((StarRating) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Objects.hash(0, Float.valueOf(0.0f));
    }
}
