package io.intercom.android.sdk.metrics.ops;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class OpsMetricTracker {
    public static final String FINISH = "finish";
    public static final String LOAD_CONVERSATION_TIME_TO_COMPLETE_REQUEST = "time-to-complete-request-load-conversation-ms";
    public static final String LOAD_CONVERSATION_TIME_TO_PROCESS_ACTION = "time-to-process-action-load-conversation-ms";
    public static final String LOAD_CONVERSATION_TIME_TO_RENDER_RESULT = "time-to-render-result-load-conversation-ms";
    public static final String SEND_PART_TIME_TO_COMPLETE_REQUEST = "time-to-complete-request-send-part-ms";
    public static final String SEND_PART_TIME_TO_PROCESS_ACTION = "time-to-process-action-send-part-ms";
    public static final String SEND_PART_TIME_TO_RENDER_RESULT = "time-to-render-result-send-part-ms";
    public static final String START = "start";
    public static final String TIME_TO_COMPLETE_PING = "time-to-complete-ping-ms";
    public static final String TIMING_TYPE = "timing";

    @VisibleForTesting
    final List<OpsEvent> events = new ArrayList();
    private final MetricsStore store;
    private final TimeProvider timeProvider;
    private final UuidStringProvider uuidStringProvider;

    public OpsMetricTracker(MetricsStore metricsStore, TimeProvider timeProvider, UuidStringProvider uuidStringProvider) {
        this.store = metricsStore;
        this.timeProvider = timeProvider;
        this.uuidStringProvider = uuidStringProvider;
    }

    @Nullable
    private OpsEvent findStartEvent(String str) {
        for (int size = this.events.size() - 1; size >= 0; size--) {
            OpsEvent opsEvent = this.events.get(size);
            if (START.equals(opsEvent.getEventType()) && str.equals(opsEvent.getName())) {
                return opsEvent;
            }
        }
        return null;
    }

    private void trackOpsEvent(OpsEvent opsEvent) {
        OpsEvent opsEventFindStartEvent = findStartEvent(opsEvent.getName());
        if (opsEventFindStartEvent == null) {
            return;
        }
        this.events.remove(opsEventFindStartEvent);
        this.store.track(new OpsMetricObject(TIMING_TYPE, opsEventFindStartEvent.getName(), opsEvent.getTimestamp() - opsEventFindStartEvent.getTimestamp(), this.uuidStringProvider.newUuidString()));
    }

    public void clear() {
        this.events.clear();
    }

    public void trackEvent(String str, String str2) {
        OpsEvent opsEvent = new OpsEvent(str, str2, this.timeProvider.currentTimeMillis());
        if (FINISH.equals(str)) {
            trackOpsEvent(opsEvent);
        } else {
            this.events.add(opsEvent);
        }
    }
}
