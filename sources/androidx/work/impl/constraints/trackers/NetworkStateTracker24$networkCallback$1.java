package androidx.work.impl.constraints.trackers;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class NetworkStateTracker24$networkCallback$1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NetworkStateTracker24 f32958a;

    public NetworkStateTracker24$networkCallback$1(NetworkStateTracker24 networkStateTracker24) {
        this.f32958a = networkStateTracker24;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        Intrinsics.m18599g(network, "network");
        Intrinsics.m18599g(capabilities, "capabilities");
        Logger.m12100e().mo12102a(NetworkStateTrackerKt.f32959a, "Network capabilities changed: " + capabilities);
        int i = Build.VERSION.SDK_INT;
        NetworkStateTracker24 networkStateTracker24 = this.f32958a;
        networkStateTracker24.m12199b(i >= 28 ? new NetworkState(capabilities.hasCapability(12), capabilities.hasCapability(16), !capabilities.hasCapability(11), capabilities.hasCapability(18)) : NetworkStateTrackerKt.m12200a(networkStateTracker24.f32956f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.m18599g(network, "network");
        Logger.m12100e().mo12102a(NetworkStateTrackerKt.f32959a, "Network connection lost");
        NetworkStateTracker24 networkStateTracker24 = this.f32958a;
        networkStateTracker24.m12199b(NetworkStateTrackerKt.m12200a(networkStateTracker24.f32956f));
    }
}
