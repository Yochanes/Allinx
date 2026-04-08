package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RequirementsWatcher {

    /* JADX INFO: compiled from: Proguard */
    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a */
        public boolean f27104a;

        /* JADX INFO: renamed from: b */
        public boolean f27105b;

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            throw null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z2) {
            if (!z2) {
                throw null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f27104a && this.f27105b == zHasCapability) {
                if (zHasCapability) {
                    throw null;
                }
            } else {
                this.f27104a = true;
                this.f27105b = zHasCapability;
                throw null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            throw null;
        }
    }
}
