package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/utils/NetworkRequestCompat;", "", "Companion", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class NetworkRequestCompat {

    /* JADX INFO: renamed from: b */
    public static final String f33072b;

    /* JADX INFO: renamed from: a */
    public final NetworkRequest f33073a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/utils/NetworkRequestCompat$Companion;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        String strM12101g = Logger.m12101g("NetworkRequestCompat");
        Intrinsics.m18598f(strM12101g, "tagWithPrefix(\"NetworkRequestCompat\")");
        f33072b = strM12101g;
    }

    public NetworkRequestCompat(NetworkRequest networkRequest) {
        this.f33073a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkRequestCompat) && Intrinsics.m18594b(this.f33073a, ((NetworkRequestCompat) obj).f33073a);
    }

    public final int hashCode() {
        NetworkRequest networkRequest = this.f33073a;
        if (networkRequest == null) {
            return 0;
        }
        return networkRequest.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f33073a + ')';
    }
}
