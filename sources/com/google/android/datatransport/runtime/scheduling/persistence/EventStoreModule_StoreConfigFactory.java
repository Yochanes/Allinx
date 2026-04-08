package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InstanceHolder {
        private static final EventStoreModule_StoreConfigFactory INSTANCE = new EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }

        public static /* synthetic */ EventStoreModule_StoreConfigFactory access$000() {
            return INSTANCE;
        }
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return InstanceHolder.access$000();
    }

    public static EventStoreConfig storeConfig() {
        return (EventStoreConfig) Preconditions.checkNotNullFromProvides(EventStoreModule.storeConfig());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return get();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public EventStoreConfig get() {
        return storeConfig();
    }
}
