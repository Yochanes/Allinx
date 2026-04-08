package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class LocusIdCompat {

    /* JADX INFO: renamed from: a */
    public final String f23121a;

    /* JADX INFO: renamed from: b */
    public final LocusId f23122b;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static LocusId m7501a(String str) {
            return new LocusId(str);
        }

        /* JADX INFO: renamed from: b */
        public static String m7502b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public LocusIdCompat(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f23121a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f23122b = Api29Impl.m7501a(str);
        } else {
            this.f23122b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LocusIdCompat m7500a(LocusId locusId) {
        Preconditions.m7698e(locusId, "locusId cannot be null");
        String strM7502b = Api29Impl.m7502b(locusId);
        if (TextUtils.isEmpty(strM7502b)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new LocusIdCompat(strM7502b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        String str = ((LocusIdCompat) obj).f23121a;
        String str2 = this.f23121a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f23121a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f23121a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
