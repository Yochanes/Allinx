package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InstanceHolder {
        private static final EventStoreModule_DbNameFactory INSTANCE = new EventStoreModule_DbNameFactory();

        private InstanceHolder() {
        }

        public static /* synthetic */ EventStoreModule_DbNameFactory access$000() {
            return INSTANCE;
        }
    }

    public static EventStoreModule_DbNameFactory create() {
        return InstanceHolder.access$000();
    }

    public static String dbName() {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.dbName());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return get();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public String get() {
        return dbName();
    }
}
