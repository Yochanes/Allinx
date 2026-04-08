package com.exchange.allin.utils.devicelibrary.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class PoolExecutor {

    /* JADX INFO: renamed from: com.exchange.allin.utils.devicelibrary.utils.PoolExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC35611 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "YMGJ #null");
        }
    }

    static {
        Runtime.getRuntime().availableProcessors();
        new AtomicInteger(1);
    }
}
