package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.retries.Function;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3689a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CctTransportBackend f42345a;

    public /* synthetic */ C3689a(CctTransportBackend cctTransportBackend) {
        this.f42345a = cctTransportBackend;
    }

    @Override // com.google.android.datatransport.runtime.retries.Function
    public final Object apply(Object obj) {
        return CctTransportBackend.m14409a(this.f42345a, (CctTransportBackend.HttpRequest) obj);
    }
}
