package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final Provider<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(Provider<Clock> provider) {
        this.clockProvider = provider;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNullFromProvides(SchedulingConfigModule.config(clock));
    }

    public static SchedulingConfigModule_ConfigFactory create(Provider<Clock> provider) {
        return new SchedulingConfigModule_ConfigFactory(provider);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return get();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public SchedulerConfig get() {
        return config((Clock) this.clockProvider.get());
    }
}
