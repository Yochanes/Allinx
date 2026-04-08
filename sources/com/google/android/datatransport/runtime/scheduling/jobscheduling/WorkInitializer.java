package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.activity.compose.C0044a;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class WorkInitializer {
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler scheduler;
    private final EventStore store;

    @Inject
    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m14433a(WorkInitializer workInitializer) {
        return workInitializer.lambda$ensureContextsScheduled$0();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14434b(WorkInitializer workInitializer) {
        workInitializer.lambda$ensureContextsScheduled$1();
    }

    private /* synthetic */ Object lambda$ensureContextsScheduled$0() {
        Iterator<TransportContext> it = this.store.loadActiveContexts().iterator();
        while (it.hasNext()) {
            this.scheduler.schedule(it.next(), 1);
        }
        return null;
    }

    private /* synthetic */ void lambda$ensureContextsScheduled$1() {
        this.guard.runCriticalSection(new C0044a(this, 17));
    }

    public void ensureContextsScheduled() {
        this.executor.execute(new RunnableC0015a(this, 19));
    }
}
