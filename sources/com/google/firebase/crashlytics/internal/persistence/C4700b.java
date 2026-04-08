package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.persistence.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4700b implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f42807a;

    public /* synthetic */ C4700b(String str) {
        this.f42807a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return FileStore.m15200a(this.f42807a, file, str);
    }
}
