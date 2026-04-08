package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTracker24;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class NetworkStateTracker24 extends ConstraintTracker<NetworkState> {

    /* JADX INFO: renamed from: f */
    public final ConnectivityManager f32956f;

    /* JADX INFO: renamed from: g */
    public final NetworkStateTracker24$networkCallback$1 f32957g;

    public NetworkStateTracker24(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        super(context, workManagerTaskExecutor);
        Object systemService = this.f32951b.getSystemService("connectivity");
        Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f32956f = (ConnectivityManager) systemService;
        this.f32957g = new NetworkStateTracker24$networkCallback$1(this);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public final Object mo12194a() {
        return NetworkStateTrackerKt.m12200a(this.f32956f);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: c */
    public final void mo12197c() {
        try {
            Logger.m12100e().mo12102a(NetworkStateTrackerKt.f32959a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f32956f;
            NetworkStateTracker24$networkCallback$1 networkCallback = this.f32957g;
            Intrinsics.m18599g(connectivityManager, "<this>");
            Intrinsics.m18599g(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e) {
            Logger.m12100e().mo12105d(NetworkStateTrackerKt.f32959a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            Logger.m12100e().mo12105d(NetworkStateTrackerKt.f32959a, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: d */
    public final void mo12198d() {
        try {
            Logger.m12100e().mo12102a(NetworkStateTrackerKt.f32959a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.f32956f;
            NetworkStateTracker24$networkCallback$1 networkCallback = this.f32957g;
            Intrinsics.m18599g(connectivityManager, "<this>");
            Intrinsics.m18599g(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e) {
            Logger.m12100e().mo12105d(NetworkStateTrackerKt.f32959a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            Logger.m12100e().mo12105d(NetworkStateTrackerKt.f32959a, "Received exception while unregistering network callback", e2);
        }
    }
}
