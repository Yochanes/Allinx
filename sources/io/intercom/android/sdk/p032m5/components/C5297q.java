package io.intercom.android.sdk.p032m5.components;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.q */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5297q implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f43745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f43746b;

    public /* synthetic */ C5297q(long j, int i) {
        this.f43745a = j;
        this.f43746b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return LoadingScreenKt.m15618b(this.f43745a, this.f43746b, (Context) obj);
    }
}
