package io.intercom.android.sdk.utilities.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class ConnectivityBroadcastReceiver extends BroadcastReceiver {
    private final ConnectivityUpdateListener connectivityUpdateListener;

    /* JADX INFO: compiled from: Proguard */
    public interface ConnectivityUpdateListener {
        void onUpdate(NetworkState networkState);
    }

    public ConnectivityBroadcastReceiver(ConnectivityUpdateListener connectivityUpdateListener) {
        this.connectivityUpdateListener = connectivityUpdateListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        this.connectivityUpdateListener.onUpdate(intent.getBooleanExtra("noConnectivity", false) ? NetworkState.NOT_CONNECTED : NetworkState.CONNECTED);
    }
}
