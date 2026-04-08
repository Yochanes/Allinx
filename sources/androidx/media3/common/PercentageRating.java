package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class PercentageRating extends Rating {
    static {
        Util.m9594D(1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PercentageRating)) {
            return false;
        }
        ((PercentageRating) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(0.0f));
    }
}
