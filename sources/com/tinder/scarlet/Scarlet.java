package com.tinder.scarlet;

import com.tinder.scarlet.lifecycle.DefaultLifecycle;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/Scarlet;", "", "Builder", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class Scarlet {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/Scarlet$Builder;", "", "Companion", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Builder {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m18302d2 = {"Lcom/tinder/scarlet/Scarlet$Builder$Companion;", "", "Lcom/tinder/scarlet/lifecycle/DefaultLifecycle;", "DEFAULT_LIFECYCLE", "Lcom/tinder/scarlet/lifecycle/DefaultLifecycle;", "Lcom/tinder/scarlet/retry/ExponentialBackoffStrategy;", "DEFAULT_RETRY_STRATEGY", "Lcom/tinder/scarlet/retry/ExponentialBackoffStrategy;", "Lio/reactivex/Scheduler;", "DEFAULT_SCHEDULER", "Lio/reactivex/Scheduler;", "", "RETRY_BASE_DURATION", "J", "RETRY_MAX_DURATION", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Companion {
        }

        static {
            new DefaultLifecycle();
            Intrinsics.m18598f(Schedulers.f51357b, "Schedulers.computation()");
        }
    }
}
