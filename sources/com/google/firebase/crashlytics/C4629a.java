package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4629a implements BreadcrumbSource, AnalyticsEventLogger, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnalyticsDeferredProxy f42787a;

    public /* synthetic */ C4629a(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f42787a = analyticsDeferredProxy;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        AnalyticsDeferredProxy.m15149a(this.f42787a, provider);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        AnalyticsDeferredProxy.m15150b(this.f42787a, str, bundle);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy.m15151c(this.f42787a, breadcrumbHandler);
    }
}
