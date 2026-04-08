package coil.network;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"coil/network/RealNetworkObserver$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class RealNetworkObserver$networkCallback$1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RealNetworkObserver f33796a;

    public RealNetworkObserver$networkCallback$1(RealNetworkObserver realNetworkObserver) {
        this.f33796a = realNetworkObserver;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        RealNetworkObserver.m12494b(this.f33796a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        RealNetworkObserver.m12494b(this.f33796a, network, false);
    }
}
