package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.common.util.concurrent.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4576d {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m15097a(Unsafe unsafe, AbstractFuture abstractFuture, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j, obj, obj2)) {
            if (unsafe.getObject(abstractFuture, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
