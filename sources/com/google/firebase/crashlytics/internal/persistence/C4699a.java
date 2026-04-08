package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.persistence.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4699a implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42806a;

    public /* synthetic */ C4699a(int i) {
        this.f42806a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f42806a) {
            case 0:
                return CrashlyticsReportPersistence.m15196a(file, str);
            default:
                return CrashlyticsReportPersistence.m15197b(file, str);
        }
    }
}
