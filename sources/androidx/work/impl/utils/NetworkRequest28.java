package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/utils/NetworkRequest28;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NetworkRequest28 {
    /* JADX INFO: renamed from: a */
    public static NetworkRequestCompat m12281a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                Logger loggerM12100e = Logger.m12100e();
                String str = NetworkRequestCompat.f33072b;
                loggerM12100e.mo12108i(NetworkRequestCompat.f33072b, "Ignoring adding capability '" + i + '\'', e);
            }
        }
        for (int i2 : iArr2) {
            builder.addTransportType(i2);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.m18598f(networkRequestBuild, "networkRequest.build()");
        return new NetworkRequestCompat(networkRequestBuild);
    }
}
