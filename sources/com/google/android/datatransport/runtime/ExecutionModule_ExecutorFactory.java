package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InstanceHolder {
        private static final ExecutionModule_ExecutorFactory INSTANCE = new ExecutionModule_ExecutorFactory();

        private InstanceHolder() {
        }

        public static /* synthetic */ ExecutionModule_ExecutorFactory access$000() {
            return INSTANCE;
        }
    }

    public static ExecutionModule_ExecutorFactory create() {
        return InstanceHolder.access$000();
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNullFromProvides(ExecutionModule.executor());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return get();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public Executor get() {
        return executor();
    }
}
