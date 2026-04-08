package coil.network;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.RealImageLoader;
import coil.util.SystemCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/network/RealNetworkObserver;", "Lcoil/network/NetworkObserver;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SuppressLint({"MissingPermission"})
@SourceDebugExtension
final class RealNetworkObserver implements NetworkObserver {

    /* JADX INFO: renamed from: a */
    public final ConnectivityManager f33793a;

    /* JADX INFO: renamed from: b */
    public final SystemCallbacks f33794b;

    /* JADX INFO: renamed from: c */
    public final RealNetworkObserver$networkCallback$1 f33795c;

    public RealNetworkObserver(ConnectivityManager connectivityManager, SystemCallbacks systemCallbacks) {
        this.f33793a = connectivityManager;
        this.f33794b = systemCallbacks;
        RealNetworkObserver$networkCallback$1 realNetworkObserver$networkCallback$1 = new RealNetworkObserver$networkCallback$1(this);
        this.f33795c = realNetworkObserver$networkCallback$1;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), realNetworkObserver$networkCallback$1);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12494b(RealNetworkObserver realNetworkObserver, Network network, boolean z2) {
        boolean z3;
        Network[] allNetworks = realNetworkObserver.f33793a.getAllNetworks();
        int length = allNetworks.length;
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.m18594b(network2, network)) {
                z3 = z2;
            } else {
                NetworkCapabilities networkCapabilities = realNetworkObserver.f33793a.getNetworkCapabilities(network2);
                z3 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z3) {
                z4 = true;
                break;
            }
            i++;
        }
        SystemCallbacks systemCallbacks = realNetworkObserver.f33794b;
        synchronized (systemCallbacks) {
            try {
                if (((RealImageLoader) systemCallbacks.f34015a.get()) != null) {
                    systemCallbacks.f34019f = z4;
                } else {
                    systemCallbacks.m12543b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // coil.network.NetworkObserver
    /* JADX INFO: renamed from: a */
    public final boolean mo12492a() {
        ConnectivityManager connectivityManager = this.f33793a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.network.NetworkObserver
    public final void shutdown() {
        this.f33793a.unregisterNetworkCallback(this.f33795c);
    }
}
