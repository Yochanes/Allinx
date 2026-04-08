package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import javax.inject.Named;
import javax.inject.Singleton;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Module
public abstract class EventStoreModule {
    @Provides
    @Named
    public static String dbName() {
        return "com.google.android.datatransport.events";
    }

    @Provides
    @Singleton
    @Named
    public static String packageName(Context context) {
        return context.getPackageName();
    }

    @Provides
    @Named
    public static int schemaVersion() {
        return SchemaManager.SCHEMA_VERSION;
    }

    @Provides
    public static EventStoreConfig storeConfig() {
        return EventStoreConfig.DEFAULT;
    }

    @Binds
    public abstract ClientHealthMetricsStore clientHealthMetricsStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract EventStore eventStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract SynchronizationGuard synchronizationGuard(SQLiteEventStore sQLiteEventStore);
}
