package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.retries.RetryStrategy;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3690b implements RetryStrategy {
    @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
    public final Object shouldRetry(Object obj, Object obj2) {
        return CctTransportBackend.m14410b((CctTransportBackend.HttpRequest) obj, (CctTransportBackend.HttpResponse) obj2);
    }
}
