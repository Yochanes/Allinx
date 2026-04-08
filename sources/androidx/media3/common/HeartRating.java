package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class HeartRating extends Rating {
    static {
        Util.m9594D(1);
        Util.m9594D(2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        ((HeartRating) obj).getClass();
        return true;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(bool, bool);
    }
}
