package com.exchange.allin.utils;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.onAdaptListener;
import me.jessyan.autosize.utils.ScreenUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/utils/AutoSizer$fixInvalidOnSplit$1", "Lme/jessyan/autosize/onAdaptListener;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AutoSizer$fixInvalidOnSplit$1 implements onAdaptListener {
    @Override // me.jessyan.autosize.onAdaptListener
    public final void onAdaptAfter(Object target, Activity activity) {
        Intrinsics.m18599g(target, "target");
        Intrinsics.m18599g(activity, "activity");
    }

    @Override // me.jessyan.autosize.onAdaptListener
    public final void onAdaptBefore(Object target, Activity activity) {
        Intrinsics.m18599g(target, "target");
        Intrinsics.m18599g(activity, "activity");
        AutoSizeConfig.getInstance().setScreenWidth(ScreenUtils.getScreenSize(activity)[0]);
        AutoSizeConfig.getInstance().setScreenHeight(ScreenUtils.getScreenSize(activity)[1]);
    }
}
