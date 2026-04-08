package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.activity.compose.C0044a;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.C0708a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class Uploader {
    private static final String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final ClientHealthMetricsStore clientHealthMetricsStore;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final Clock uptimeClock;
    private final WorkScheduler workScheduler;

    @Inject
    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
        this.uptimeClock = clock2;
        this.clientHealthMetricsStore = clientHealthMetricsStore;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Iterable m14424a(Uploader uploader, TransportContext transportContext) {
        return uploader.lambda$logAndUpdateState$3(transportContext);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m14425b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        return uploader.lambda$logAndUpdateState$4(iterable, transportContext, j);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m14426c(Uploader uploader) {
        return uploader.lambda$logAndUpdateState$6();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m14427d(Uploader uploader, TransportContext transportContext) {
        return uploader.lambda$logAndUpdateState$2(transportContext);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m14428e(Uploader uploader, Iterable iterable) {
        return uploader.lambda$logAndUpdateState$5(iterable);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m14429f(Uploader uploader, TransportContext transportContext, int i) {
        return uploader.lambda$upload$0(transportContext, i);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m14430g(Uploader uploader, TransportContext transportContext, long j) {
        return uploader.lambda$logAndUpdateState$8(transportContext, j);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m14431h(Uploader uploader, HashMap map) {
        return uploader.lambda$logAndUpdateState$7(map);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m14432i(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        uploader.lambda$upload$1(transportContext, i, runnable);
    }

    private /* synthetic */ Boolean lambda$logAndUpdateState$2(TransportContext transportContext) {
        return Boolean.valueOf(this.eventStore.hasPendingEventsFor(transportContext));
    }

    private /* synthetic */ Iterable lambda$logAndUpdateState$3(TransportContext transportContext) {
        return this.eventStore.loadBatch(transportContext);
    }

    private /* synthetic */ Object lambda$logAndUpdateState$4(Iterable iterable, TransportContext transportContext, long j) {
        this.eventStore.recordFailure(iterable);
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j);
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$5(Iterable iterable) {
        this.eventStore.recordSuccess(iterable);
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$6() {
        this.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$7(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.clientHealthMetricsStore.recordLogEventDropped(((Integer) r0.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$8(TransportContext transportContext, long j) {
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j);
        return null;
    }

    private /* synthetic */ Object lambda$upload$0(TransportContext transportContext, int i) {
        this.workScheduler.schedule(transportContext, i + 1);
        return null;
    }

    private /* synthetic */ void lambda$upload$1(TransportContext transportContext, int i, Runnable runnable) {
        try {
            try {
                SynchronizationGuard synchronizationGuard = this.guard;
                EventStore eventStore = this.eventStore;
                Objects.requireNonNull(eventStore);
                synchronizationGuard.runCriticalSection(new C0044a(eventStore, 14));
                if (isNetworkAvailable()) {
                    logAndUpdateState(transportContext, i);
                } else {
                    this.guard.runCriticalSection(new C3709b(this, transportContext, i));
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                this.workScheduler.schedule(transportContext, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.guard;
        ClientHealthMetricsStore clientHealthMetricsStore = this.clientHealthMetricsStore;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.clock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE).setEncodedPayload(new EncodedPayload(Encoding.m14408of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new C0044a(clientHealthMetricsStore, 15))).toByteArray())).build());
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @CanIgnoreReturnValue
    @RestrictTo
    public BackendResponse logAndUpdateState(TransportContext transportContext, int i) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        BackendResponse backendResponseM14412ok = BackendResponse.m14412ok(0L);
        long j = 0;
        while (((Boolean) this.guard.runCriticalSection(new C3711d(this, transportContext, 0))).booleanValue()) {
            Iterable iterable = (Iterable) this.guard.runCriticalSection(new C3711d(this, transportContext, 1));
            if (!iterable.iterator().hasNext()) {
                return backendResponseM14412ok;
            }
            if (transportBackend == null) {
                Logging.m14414d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseSend = BackendResponse.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).getEvent());
                }
                if (transportContext.shouldUploadClientHealthMetrics()) {
                    arrayList.add(createMetricsEvent(transportBackend));
                }
                backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            backendResponseM14412ok = backendResponseSend;
            if (backendResponseM14412ok.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                TransportContext transportContext2 = transportContext;
                this.guard.runCriticalSection(new C3712e(this, iterable, transportContext2, j));
                this.workScheduler.schedule(transportContext2, i + 1, true);
                return backendResponseM14412ok;
            }
            TransportContext transportContext3 = transportContext;
            this.guard.runCriticalSection(new C0708a(14, this, iterable));
            if (backendResponseM14412ok.getStatus() == BackendResponse.Status.OK) {
                long jMax = Math.max(j, backendResponseM14412ok.getNextRequestWaitMillis());
                if (transportContext3.shouldUploadClientHealthMetrics()) {
                    this.guard.runCriticalSection(new C0044a(this, 16));
                }
                j = jMax;
            } else if (backendResponseM14412ok.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String transportName = ((PersistedEvent) it2.next()).getEvent().getTransportName();
                    if (map.containsKey(transportName)) {
                        map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    } else {
                        map.put(transportName, 1);
                    }
                }
                this.guard.runCriticalSection(new C0708a(15, this, map));
            }
            transportContext = transportContext3;
        }
        this.guard.runCriticalSection(new C3708a(this, transportContext, j));
        return backendResponseM14412ok;
    }

    public void upload(TransportContext transportContext, int i, Runnable runnable) {
        this.executor.execute(new RunnableC3710c(i, 0, this, transportContext, runnable));
    }
}
