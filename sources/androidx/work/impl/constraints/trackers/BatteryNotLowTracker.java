package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class BatteryNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public final Object mo12194a() {
        Intent intentRegisterReceiver = this.f32951b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            Logger.m12100e().mo12104c(BatteryNotLowTrackerKt.f32946a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z2 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo12195e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: f */
    public final void mo12196f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        Logger.m12100e().mo12102a(BatteryNotLowTrackerKt.f32946a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    m12199b(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                m12199b(Boolean.FALSE);
            }
        }
    }
}
