package com.yariksoffice.lingver;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/yariksoffice/lingver/LingverActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "com.yariksoffice.lingver.library"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class LingverActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Function1 f43494a;

    public LingverActivityLifecycleCallbacks(Function1 function1) {
        this.f43494a = function1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.m18600h(activity, "activity");
        this.f43494a.invoke(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.m18600h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.m18600h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.m18600h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.m18600h(activity, "activity");
        Intrinsics.m18600h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.m18600h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.m18600h(activity, "activity");
    }
}
