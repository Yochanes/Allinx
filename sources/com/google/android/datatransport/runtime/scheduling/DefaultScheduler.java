package com.google.android.datatransport.runtime.scheduling;

import androidx.camera.core.processing.C0322f;
import androidx.camera.core.processing.RunnableC0323g;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultScheduler implements Scheduler {
    private static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    @Inject
    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m14420a(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        return defaultScheduler.lambda$schedule$0(transportContext, eventInternal);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14421b(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        defaultScheduler.lambda$schedule$1(transportContext, transportScheduleCallback, eventInternal);
    }

    private /* synthetic */ Object lambda$schedule$0(TransportContext transportContext, EventInternal eventInternal) {
        this.eventStore.persist(transportContext, eventInternal);
        this.workScheduler.schedule(transportContext, 1);
        return null;
    }

    private /* synthetic */ void lambda$schedule$1(TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend != null) {
                this.guard.runCriticalSection(new C0322f(this, transportContext, transportBackend.decorate(eventInternal)));
                transportScheduleCallback.onSchedule(null);
                return;
            }
            String str = "Transport backend '" + transportContext.getBackendName() + "' is not registered";
            LOGGER.warning(str);
            transportScheduleCallback.onSchedule(new IllegalArgumentException(str));
        } catch (Exception e) {
            LOGGER.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.onSchedule(e);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.executor.execute(new RunnableC0323g(this, transportContext, transportScheduleCallback, eventInternal, 4));
    }
}
