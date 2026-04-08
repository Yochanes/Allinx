package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SchedulerPoolFactory {

    /* JADX INFO: renamed from: a */
    public static final boolean f49189a;

    /* JADX INFO: renamed from: b */
    public static final int f49190b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f49191c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f49192d = new ConcurrentHashMap();

    /* JADX INFO: compiled from: Proguard */
    public static final class PurgeProperties {

        /* JADX INFO: renamed from: a */
        public boolean f49193a;

        /* JADX INFO: renamed from: b */
        public int f49194b;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ScheduledTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(SchedulerPoolFactory.f49192d.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.f49192d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        Properties properties = System.getProperties();
        PurgeProperties purgeProperties = new PurgeProperties();
        if (properties.containsKey("rx2.purge-enabled")) {
            purgeProperties.f49193a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            purgeProperties.f49193a = true;
        }
        if (purgeProperties.f49193a && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                purgeProperties.f49194b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                purgeProperties.f49194b = 1;
            }
        } else {
            purgeProperties.f49194b = 1;
        }
        boolean z2 = purgeProperties.f49193a;
        f49189a = z2;
        f49190b = purgeProperties.f49194b;
        if (!z2) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f49191c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                if (atomicReference.get() != scheduledExecutorService) {
                    break;
                }
            }
            ScheduledTask scheduledTask = new ScheduledTask();
            long j = f49190b;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(scheduledTask, j, j, TimeUnit.SECONDS);
            return;
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
