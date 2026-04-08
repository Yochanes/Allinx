package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/trackers/BatteryChargingTracker;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class BatteryChargingTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public final Object mo12194a() {
        Intent intentRegisterReceiver = this.f32951b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            Logger.m12100e().mo12104c(BatteryChargingTrackerKt.f32945a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo12195e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: f */
    public final void mo12196f(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        Logger.m12100e().mo12102a(BatteryChargingTrackerKt.f32945a, "Received ".concat(action));
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    m12199b(Boolean.FALSE);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    m12199b(Boolean.FALSE);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    m12199b(Boolean.TRUE);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    m12199b(Boolean.TRUE);
                    break;
                }
                break;
        }
    }
}
