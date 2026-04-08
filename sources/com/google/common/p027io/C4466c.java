package com.google.common.p027io;

import com.google.common.p027io.TempFileCreator;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: com.google.common.io.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4466c implements TempFileCreator.JavaNioCreator.PermissionSupplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42694a;

    public /* synthetic */ C4466c(int i) {
        this.f42694a = i;
    }

    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
    public final FileAttribute get() {
        switch (this.f42694a) {
            case 0:
                return TempFileCreator.JavaNioCreator.m14997b();
            case 1:
                return TempFileCreator.JavaNioCreator.m14996a();
            default:
                return TempFileCreator.JavaNioCreator.m14999d();
        }
    }
}
