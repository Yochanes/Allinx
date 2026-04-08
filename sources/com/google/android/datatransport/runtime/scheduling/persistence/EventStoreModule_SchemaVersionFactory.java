package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InstanceHolder {
        private static final EventStoreModule_SchemaVersionFactory INSTANCE = new EventStoreModule_SchemaVersionFactory();

        private InstanceHolder() {
        }

        public static /* synthetic */ EventStoreModule_SchemaVersionFactory access$000() {
            return INSTANCE;
        }
    }

    public static EventStoreModule_SchemaVersionFactory create() {
        return InstanceHolder.access$000();
    }

    public static int schemaVersion() {
        return EventStoreModule.schemaVersion();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return get();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
