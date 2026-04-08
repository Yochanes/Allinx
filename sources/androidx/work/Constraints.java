package androidx.work;

import android.net.NetworkRequest;
import android.net.Uri;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/Constraints;", "", "Builder", "Companion", "ContentUriTrigger", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Constraints {

    /* JADX INFO: renamed from: j */
    public static final Constraints f32543j = new Constraints();

    /* JADX INFO: renamed from: a */
    public final NetworkType f32544a;

    /* JADX INFO: renamed from: b */
    public final NetworkRequestCompat f32545b;

    /* JADX INFO: renamed from: c */
    public final boolean f32546c;

    /* JADX INFO: renamed from: d */
    public final boolean f32547d;

    /* JADX INFO: renamed from: e */
    public final boolean f32548e;

    /* JADX INFO: renamed from: f */
    public final boolean f32549f;

    /* JADX INFO: renamed from: g */
    public final long f32550g;

    /* JADX INFO: renamed from: h */
    public final long f32551h;

    /* JADX INFO: renamed from: i */
    public final Set f32552i;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/Constraints$Builder;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public NetworkRequestCompat f32553a;

        /* JADX INFO: renamed from: b */
        public NetworkType f32554b;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/Constraints$Companion;", "", "Landroidx/work/Constraints;", "NONE", "Landroidx/work/Constraints;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class ContentUriTrigger {

        /* JADX INFO: renamed from: a */
        public final Uri f32555a;

        /* JADX INFO: renamed from: b */
        public final boolean f32556b;

        public ContentUriTrigger(Uri uri, boolean z2) {
            this.f32555a = uri;
            this.f32556b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ContentUriTrigger.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            return Intrinsics.m18594b(this.f32555a, contentUriTrigger.f32555a) && this.f32556b == contentUriTrigger.f32556b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f32556b) + (this.f32555a.hashCode() * 31);
        }
    }

    public Constraints() {
        NetworkType networkType = NetworkType.f32586a;
        EmptySet emptySet = EmptySet.f51498a;
        this.f32545b = new NetworkRequestCompat(null);
        this.f32544a = networkType;
        this.f32546c = false;
        this.f32547d = false;
        this.f32548e = false;
        this.f32549f = false;
        this.f32550g = -1L;
        this.f32551h = -1L;
        this.f32552i = emptySet;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12089a() {
        return !this.f32552i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Constraints.class.equals(obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.f32546c == constraints.f32546c && this.f32547d == constraints.f32547d && this.f32548e == constraints.f32548e && this.f32549f == constraints.f32549f && this.f32550g == constraints.f32550g && this.f32551h == constraints.f32551h && Intrinsics.m18594b(this.f32545b.f33073a, constraints.f32545b.f33073a) && this.f32544a == constraints.f32544a) {
            return Intrinsics.m18594b(this.f32552i, constraints.f32552i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f32544a.hashCode() * 31) + (this.f32546c ? 1 : 0)) * 31) + (this.f32547d ? 1 : 0)) * 31) + (this.f32548e ? 1 : 0)) * 31) + (this.f32549f ? 1 : 0)) * 31;
        long j = this.f32550g;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f32551h;
        int iHashCode2 = (this.f32552i.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequest = this.f32545b.f33073a;
        return iHashCode2 + (networkRequest != null ? networkRequest.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f32544a + ", requiresCharging=" + this.f32546c + ", requiresDeviceIdle=" + this.f32547d + ", requiresBatteryNotLow=" + this.f32548e + ", requiresStorageNotLow=" + this.f32549f + ", contentTriggerUpdateDelayMillis=" + this.f32550g + ", contentTriggerMaxDelayMillis=" + this.f32551h + ", contentUriTriggers=" + this.f32552i + ", }";
    }

    public Constraints(NetworkRequestCompat requiredNetworkRequestCompat, NetworkType requiredNetworkType, boolean z2, boolean z3, boolean z4, boolean z5, long j, long j2, Set contentUriTriggers) {
        Intrinsics.m18599g(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.m18599g(requiredNetworkType, "requiredNetworkType");
        Intrinsics.m18599g(contentUriTriggers, "contentUriTriggers");
        this.f32545b = requiredNetworkRequestCompat;
        this.f32544a = requiredNetworkType;
        this.f32546c = z2;
        this.f32547d = z3;
        this.f32548e = z4;
        this.f32549f = z5;
        this.f32550g = j;
        this.f32551h = j2;
        this.f32552i = contentUriTriggers;
    }

    public Constraints(Constraints other) {
        Intrinsics.m18599g(other, "other");
        this.f32546c = other.f32546c;
        this.f32547d = other.f32547d;
        this.f32545b = other.f32545b;
        this.f32544a = other.f32544a;
        this.f32548e = other.f32548e;
        this.f32549f = other.f32549f;
        this.f32552i = other.f32552i;
        this.f32550g = other.f32550g;
        this.f32551h = other.f32551h;
    }
}
