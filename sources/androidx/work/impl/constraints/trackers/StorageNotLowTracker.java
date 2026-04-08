package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/trackers/StorageNotLowTracker;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class StorageNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public final Object mo12194a() {
        Intent intentRegisterReceiver = this.f32951b.registerReceiver(null, mo12195e());
        boolean z2 = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z2 = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo12195e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: f */
    public final void mo12196f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        Logger.m12100e().mo12102a(StorageNotLowTrackerKt.f32960a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    m12199b(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                m12199b(Boolean.TRUE);
            }
        }
    }
}
