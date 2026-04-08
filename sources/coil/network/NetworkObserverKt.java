package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import coil.util.SystemCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NetworkObserverKt {
    /* JADX INFO: renamed from: a */
    public static final NetworkObserver m12493a(Context context, SystemCallbacks systemCallbacks) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || ContextCompat.m7484a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return new EmptyNetworkObserver();
        }
        try {
            return new RealNetworkObserver(connectivityManager, systemCallbacks);
        } catch (Exception unused) {
            return new EmptyNetworkObserver();
        }
    }
}
