package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.google.common.util.concurrent.o */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4587o implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42735a;

    public /* synthetic */ C4587o(int i) {
        this.f42735a = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f42735a) {
            case 0:
                return new Striped.WeakSafeReadWriteLock();
            case 1:
                return new Striped.PaddedLock();
            case 2:
                return Striped.m15094b();
            default:
                return new ReentrantReadWriteLock();
        }
    }
}
