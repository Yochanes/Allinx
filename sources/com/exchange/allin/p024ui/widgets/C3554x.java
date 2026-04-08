package com.exchange.allin.p024ui.widgets;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.exchange.allin.p024ui.helper.ConfigHelper;
import com.google.accompanist.systemuicontroller.SystemUiController;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.x */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3554x implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SystemUiController f41584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f41585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f41586c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MutableState f41587d;

    public /* synthetic */ C3554x(SystemUiController systemUiController, long j, boolean z2, MutableState mutableState) {
        this.f41584a = systemUiController;
        this.f41585b = j;
        this.f41586c = z2;
        this.f41587d = mutableState;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        SystemUiController systemUiController = this.f41584a;
        if (event == event2) {
            SystemUiController.m22039setStatusBarColorek8zF_U$default(systemUiController, this.f41585b, this.f41586c, null, 4, null);
        } else if (event == Lifecycle.Event.ON_STOP) {
            SystemUiController.m22039setStatusBarColorek8zF_U$default(systemUiController, Color.f17582j, !((ConfigHelper.ViewState) this.f41587d.getF20325a()).f36915a, null, 4, null);
        }
    }
}
