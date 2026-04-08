package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4660b implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42795a;

    public /* synthetic */ C4660b(int i) {
        this.f42795a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f42795a) {
            case 0:
                return CrashlyticsAppQualitySessionsStore.m15175b((File) obj, (File) obj2);
            default:
                return SessionReportingCoordinator.m15177a((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
        }
    }
}
