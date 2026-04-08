package androidx.work.impl.constraints.trackers;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"work-runtime_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class NetworkStateTrackerKt {

    /* JADX INFO: renamed from: a */
    public static final String f32959a;

    static {
        String strM12101g = Logger.m12101g("NetworkStateTracker");
        Intrinsics.m18598f(strM12101g, "tagWithPrefix(\"NetworkStateTracker\")");
        f32959a = strM12101g;
    }

    /* JADX INFO: renamed from: a */
    public static final NetworkState m12200a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.m18599g(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            Logger.m12100e().mo12105d(f32959a, "Unable to validate active network", e);
        }
        boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
        return new NetworkState(z2, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
