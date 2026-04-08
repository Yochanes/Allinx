package org.jetbrains.anko;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/jetbrains/anko/BackgroundExecutor;", "", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class BackgroundExecutor {

    /* JADX INFO: renamed from: a */
    public static final ScheduledExecutorService f58163a;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        Intrinsics.m18595c(scheduledExecutorServiceNewScheduledThreadPool, "Executors.newScheduledTh…().availableProcessors())");
        f58163a = scheduledExecutorServiceNewScheduledThreadPool;
    }
}
