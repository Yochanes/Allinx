package com.exchange.allin.p024ui.page.account.identity.confirm;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.identity.confirm.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2867f implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ManagedActivityResultLauncher f37313b;

    public /* synthetic */ C2867f(ManagedActivityResultLauncher managedActivityResultLauncher, int i) {
        this.f37312a = i;
        this.f37313b = managedActivityResultLauncher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intent it = (Intent) obj;
        switch (this.f37312a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                this.f37313b.mo180a(it);
                break;
            default:
                Intrinsics.m18599g(it, "it");
                this.f37313b.mo180a(it);
                break;
        }
        return Unit.f51459a;
    }
}
