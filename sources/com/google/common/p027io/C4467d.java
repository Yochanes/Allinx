package com.google.common.p027io;

import com.google.common.p027io.TempFileCreator;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: com.google.common.io.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4467d implements TempFileCreator.JavaNioCreator.PermissionSupplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42696b;

    public /* synthetic */ C4467d(Object obj, int i) {
        this.f42695a = i;
        this.f42696b = obj;
    }

    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
    public final FileAttribute get() {
        switch (this.f42695a) {
            case 0:
                return TempFileCreator.JavaNioCreator.m14998c((FileAttribute) this.f42696b);
            default:
                return TempFileCreator.JavaNioCreator.m15000e((IOException) this.f42696b);
        }
    }
}
