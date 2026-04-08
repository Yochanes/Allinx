package com.tinder.scarlet.lifecycle.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tinder.scarlet.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/android/ConnectivityOnLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "ConnectivityChangeBroadcastReceiver", "scarlet-lifecycle-android_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class ConnectivityOnLifecycle implements Lifecycle {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/android/ConnectivityOnLifecycle$ConnectivityChangeBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "scarlet-lifecycle-android_release"}, m18303k = 1, m18304mv = {1, 4, 0})
    public final class ConnectivityChangeBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Intrinsics.m18600h(context, "context");
            Intrinsics.m18600h(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            extras.getBoolean("noConnectivity");
            throw null;
        }
    }

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        throw null;
    }
}
