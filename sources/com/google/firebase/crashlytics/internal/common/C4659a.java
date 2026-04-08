package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4659a implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42794a;

    public /* synthetic */ C4659a(int i) {
        this.f42794a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f42794a) {
            case 0:
                return CrashlyticsAppQualitySessionsStore.m15174a(file, str);
            default:
                return CrashlyticsController.m15176a(file, str);
        }
    }
}
