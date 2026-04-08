package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.google.firebase.messaging.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4751n implements OnSuccessListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f42858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f42859b;

    public /* synthetic */ C4751n(Context context, boolean z2) {
        this.f42858a = context;
        this.f42859b = z2;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ProxyNotificationPreferences.m15250a(this.f42858a, this.f42859b, (Void) obj);
    }
}
