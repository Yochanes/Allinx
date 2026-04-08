package androidx.core.location;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class LocationRequestCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class Api19Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Quality {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        ((LocationRequestCompat) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        int i = (int) 0;
        return (i * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[@");
        Object obj = TimeUtils.f23343a;
        synchronized (obj) {
            sb.append(TimeUtils.f23344b, 0, TimeUtils.m7703a(0L));
        }
        sb.append(", duration=");
        synchronized (obj) {
            sb.append(TimeUtils.f23344b, 0, TimeUtils.m7703a(0L));
        }
        sb.append(", maxUpdates=0");
        if (0.0f > 0.0d) {
            sb.append(", minUpdateDistance=0.0");
        }
        sb.append(']');
        return sb.toString();
    }
}
