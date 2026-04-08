package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
public final class TimeModule_EventClockFactory implements Factory<Clock> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InstanceHolder {
        private static final TimeModule_EventClockFactory INSTANCE = new TimeModule_EventClockFactory();

        private InstanceHolder() {
        }

        public static /* synthetic */ TimeModule_EventClockFactory access$000() {
            return INSTANCE;
        }
    }

    public static TimeModule_EventClockFactory create() {
        return InstanceHolder.access$000();
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.eventClock());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return get();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public Clock get() {
        return eventClock();
    }
}
