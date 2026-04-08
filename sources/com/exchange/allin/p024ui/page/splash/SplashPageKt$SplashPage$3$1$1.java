package com.exchange.allin.p024ui.page.splash;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.exchange.allin.p024ui.helper.ConfigHelper;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/ui/page/splash/SplashPageKt$SplashPage$3$1$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SplashPageKt$SplashPage$3$1$1 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SystemUiController f40476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f40477b;

    public SplashPageKt$SplashPage$3$1$1(SystemUiController systemUiController, MutableState mutableState) {
        this.f40476a = systemUiController;
        this.f40477b = mutableState;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.m18599g(owner, "owner");
        int i = Color.f17584l;
        SystemUiController.m22039setStatusBarColorek8zF_U$default(this.f40476a, Color.f17582j, false, null, 4, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        SystemUiController.m22039setStatusBarColorek8zF_U$default(this.f40476a, Color.f17582j, !((ConfigHelper.ViewState) this.f40477b.getF20325a()).f36915a, null, 4, null);
    }
}
