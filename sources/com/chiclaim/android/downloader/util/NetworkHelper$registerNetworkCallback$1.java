package com.chiclaim.android.downloader.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/chiclaim/android/downloader/util/NetworkHelper$registerNetworkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class NetworkHelper$registerNetworkCallback$1 extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.m18599g(network, "network");
        super.onAvailable(network);
        String message = Intrinsics.m18604l(Thread.currentThread().getName(), "onAvailable:");
        Intrinsics.m18599g(message, "message");
        Log.e("AndroidUpdater", message);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.m18599g(network, "network");
        super.onLost(network);
        String message = Intrinsics.m18604l(Thread.currentThread().getName(), "onLost:");
        Intrinsics.m18599g(message, "message");
        Log.e("AndroidUpdater", message);
    }
}
