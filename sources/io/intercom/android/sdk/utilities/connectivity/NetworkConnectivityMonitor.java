package io.intercom.android.sdk.utilities.connectivity;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.utilities.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class NetworkConnectivityMonitor implements ConnectivityBroadcastReceiver.ConnectivityUpdateListener {

    @Nullable
    private ConnectivityEventListener listener;
    private NetworkState lastState = NetworkState.UNKNOWN;
    private boolean didRegister = false;
    private final ConnectivityBroadcastReceiver receiver = new ConnectivityBroadcastReceiver(this);

    /* JADX INFO: compiled from: Proguard */
    public interface ConnectivityEventListener {
        void onDisconnect();

        void onReconnect();
    }

    @Nullable
    @VisibleForTesting
    public ConnectivityEventListener getListener() {
        return this.listener;
    }

    @Override // io.intercom.android.sdk.utilities.connectivity.ConnectivityBroadcastReceiver.ConnectivityUpdateListener
    public void onUpdate(NetworkState networkState) {
        NetworkState networkState2 = this.lastState;
        if (networkState == networkState2) {
            return;
        }
        ConnectivityEventListener connectivityEventListener = this.listener;
        if (connectivityEventListener != null) {
            NetworkState networkState3 = NetworkState.NOT_CONNECTED;
            if (networkState == networkState3) {
                connectivityEventListener.onDisconnect();
            } else if (networkState == NetworkState.CONNECTED && networkState2 == networkState3) {
                connectivityEventListener.onReconnect();
            }
        }
        this.lastState = networkState;
    }

    public void setListener(@Nullable ConnectivityEventListener connectivityEventListener) {
        this.listener = connectivityEventListener;
    }

    public synchronized void startListening(Context context) {
        if (!this.didRegister) {
            ContextCompat.m7488e(context, this.receiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
            this.didRegister = true;
        }
    }

    public synchronized void stopListening(Context context) {
        if (this.didRegister) {
            context.unregisterReceiver(this.receiver);
            this.didRegister = false;
        }
    }
}
