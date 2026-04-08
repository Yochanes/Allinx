package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4661c implements BreadcrumbHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CrashlyticsCore f42796a;

    public /* synthetic */ C4661c(CrashlyticsCore crashlyticsCore) {
        this.f42796a = crashlyticsCore;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
    public final void handleBreadcrumb(String str) {
        this.f42796a.log(str);
    }
}
