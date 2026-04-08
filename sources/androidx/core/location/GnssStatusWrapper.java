package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
class GnssStatusWrapper extends GnssStatusCompat {

    /* JADX INFO: renamed from: a */
    public final GnssStatus f23251a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
    }

    public GnssStatusWrapper(GnssStatus gnssStatus) {
        gnssStatus.getClass();
        this.f23251a = gnssStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.f23251a.equals(((GnssStatusWrapper) obj).f23251a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23251a.hashCode();
    }
}
