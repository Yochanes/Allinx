package com.google.common.p027io;

import com.google.common.p027io.Closer;
import java.io.Closeable;

/* JADX INFO: renamed from: com.google.common.io.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4464a implements Closer.Suppressor {
    @Override // com.google.common.io.Closer.Suppressor
    public final void suppress(Closeable closeable, Throwable th, Throwable th2) {
        Closer.m14995a(closeable, th, th2);
    }
}
