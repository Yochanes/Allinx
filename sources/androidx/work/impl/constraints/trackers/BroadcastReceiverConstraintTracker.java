package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "T", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {

    /* JADX INFO: renamed from: f */
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f32947f;

    public BroadcastReceiverConstraintTracker(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        super(context, workManagerTaskExecutor);
        this.f32947f = new BroadcastReceiverConstraintTracker$broadcastReceiver$1(this);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: c */
    public final void mo12197c() {
        Logger.m12100e().mo12102a(BroadcastReceiverConstraintTrackerKt.f32949a, getClass().getSimpleName().concat(": registering receiver"));
        this.f32951b.registerReceiver(this.f32947f, mo12195e());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: d */
    public final void mo12198d() {
        Logger.m12100e().mo12102a(BroadcastReceiverConstraintTrackerKt.f32949a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f32951b.unregisterReceiver(this.f32947f);
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo12195e();

    /* JADX INFO: renamed from: f */
    public abstract void mo12196f(Intent intent);
}
