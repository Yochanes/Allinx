package com.yariksoffice.lingver;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/yariksoffice/lingver/LingverApplicationCallbacks;", "Landroid/content/ComponentCallbacks;", "com.yariksoffice.lingver.library"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class LingverApplicationCallbacks implements ComponentCallbacks {

    /* JADX INFO: renamed from: a */
    public final Function1 f43495a;

    public LingverApplicationCallbacks(Function1 function1) {
        this.f43495a = function1;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m18600h(newConfig, "newConfig");
        this.f43495a.invoke(newConfig);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
