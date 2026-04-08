package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker$broadcastReceiver$1", "Landroid/content/BroadcastReceiver;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BroadcastReceiverConstraintTracker$broadcastReceiver$1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BroadcastReceiverConstraintTracker f32948a;

    public BroadcastReceiverConstraintTracker$broadcastReceiver$1(BroadcastReceiverConstraintTracker broadcastReceiverConstraintTracker) {
        this.f32948a = broadcastReceiverConstraintTracker;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(intent, "intent");
        this.f32948a.mo12196f(intent);
    }
}
