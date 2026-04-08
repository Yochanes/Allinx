package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre24;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class NetworkStateTrackerPre24 extends BroadcastReceiverConstraintTracker<NetworkState> {
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public final Object mo12194a() {
        NetworkStateTrackerKt.m12200a(null);
        throw null;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo12195e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: f */
    public final void mo12196f(Intent intent) {
        if (Intrinsics.m18594b(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            Logger.m12100e().mo12102a(NetworkStateTrackerKt.f32959a, "Network broadcast received");
            NetworkStateTrackerKt.m12200a(null);
            throw null;
        }
    }
}
