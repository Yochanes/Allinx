package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public interface SynchronizationGuard {

    /* JADX INFO: compiled from: Proguard */
    public interface CriticalSection<T> {
        T execute();
    }

    <T> T runCriticalSection(CriticalSection<T> criticalSection);
}
