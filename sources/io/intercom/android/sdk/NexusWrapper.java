package io.intercom.android.sdk;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.p032m5.data.IntercomDataLayer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0007J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\nJ\u000f\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0016H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m18302d2 = {"Lio/intercom/android/sdk/NexusWrapper;", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/nexus/NexusListener;", "twig", "Lcom/intercom/twig/Twig;", "okHttpClient", "Lokhttp3/OkHttpClient;", MetricTracker.Place.API, "Lio/intercom/android/sdk/api/Api;", "debouncePeriodMs", "", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lcom/intercom/twig/Twig;Lokhttp3/OkHttpClient;Lio/intercom/android/sdk/api/Api;JLio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "actionFuture", "Ljava/util/concurrent/ScheduledFuture;", "connect", "", "config", "Lio/intercom/android/nexus/NexusConfig;", "shouldSendPresence", "", "connectNow", "disconnect", "disconnectNow", "scheduleDisconnect", "delayMs", "removeCallbacks", "()Ljava/lang/Boolean;", "notifyEvent", "event", "Lio/intercom/android/nexus/NexusEvent;", "logKnownEvent", "fetchUnreadConversationsIfBackgrounded", "onConnect", "onConnectFailed", "onShutdown", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NexusWrapper extends NexusClient implements NexusListener {

    @NotNull
    private static final String CONVERSATION_ID = "conversationId";

    @Nullable
    private ScheduledFuture<?> actionFuture;

    @NotNull
    private final Api api;

    @NotNull
    private final IntercomDataLayer dataLayer;
    private final long debouncePeriodMs;
    private final ScheduledExecutorService executor;

    @NotNull
    private final Twig twig;
    public static final int $stable = 8;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationSeen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NexusEventType.NewContent.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NexusWrapper(@NotNull Twig twig, @NotNull OkHttpClient okHttpClient, @NotNull Api api, long j, @NotNull IntercomDataLayer dataLayer) {
        super(twig, okHttpClient);
        Intrinsics.m18599g(twig, "twig");
        Intrinsics.m18599g(okHttpClient, "okHttpClient");
        Intrinsics.m18599g(api, "api");
        Intrinsics.m18599g(dataLayer, "dataLayer");
        this.twig = twig;
        this.api = api;
        this.debouncePeriodMs = j;
        this.dataLayer = dataLayer;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15464a(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean z2) {
        connect$lambda$0(nexusWrapper, nexusConfig, z2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15465b(NexusWrapper nexusWrapper) {
        scheduleDisconnect$lambda$2(nexusWrapper);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15466c(NexusWrapper nexusWrapper) {
        disconnect$lambda$1(nexusWrapper);
    }

    private static final void connect$lambda$0(NexusWrapper this$0, NexusConfig config, boolean z2) {
        Intrinsics.m18599g(this$0, "this$0");
        Intrinsics.m18599g(config, "$config");
        this$0.connectNow(config, z2);
    }

    private static final void disconnect$lambda$1(NexusWrapper this$0) {
        Intrinsics.m18599g(this$0, "this$0");
        this$0.disconnectNow();
    }

    private final void fetchUnreadConversationsIfBackgrounded() {
        if (((OverlayState) this.dataLayer.getOverlayState().getValue()).getResumedHostActivity() != null || ((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded()) {
            this.api.getUnreadConversations();
        }
    }

    private final void logKnownEvent(NexusEvent event) {
        this.twig.internal("Nexus", "Received " + event.getEventType() + " event");
    }

    private final Boolean removeCallbacks() {
        ScheduledFuture<?> scheduledFuture = this.actionFuture;
        if (scheduledFuture != null) {
            return Boolean.valueOf(scheduledFuture.cancel(false));
        }
        return null;
    }

    private static final void scheduleDisconnect$lambda$2(NexusWrapper this$0) {
        Intrinsics.m18599g(this$0, "this$0");
        this$0.disconnectNow();
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void connect(@NotNull NexusConfig config, boolean shouldSendPresence) {
        Intrinsics.m18599g(config, "config");
        if (config.getEndpoints().isEmpty()) {
            this.twig.m15314w("No realtime endpoints present so we can't connect", new Object[0]);
        } else {
            removeCallbacks();
            this.actionFuture = this.executor.schedule(new RunnableC5203d(this, config, shouldSendPresence), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
        }
    }

    @VisibleForTesting
    public final void connectNow(@NotNull NexusConfig config, boolean shouldSendPresence) {
        Intrinsics.m18599g(config, "config");
        if (isConnected()) {
            return;
        }
        super.connect(config, shouldSendPresence);
        setTopics(CollectionsKt.m18413N(Marker.ANY_MARKER));
        addEventListener(this);
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void disconnect() {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new RunnableC5204e(this, 0), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    @VisibleForTesting
    public final void disconnectNow() {
        removeEventListener(this);
        super.disconnect();
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void notifyEvent(@NotNull NexusEvent event) {
        Intrinsics.m18599g(event, "event");
        String strOptString = event.getEventData().optString(CONVERSATION_ID);
        NexusEventType eventType = event.getEventType();
        int i = eventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            logKnownEvent(event);
            return;
        }
        if (i == 2) {
            logKnownEvent(event);
            fetchUnreadConversationsIfBackgrounded();
            return;
        }
        if (i == 3) {
            logKnownEvent(event);
            return;
        }
        if (i == 4) {
            logKnownEvent(event);
            IntercomDataLayer intercomDataLayer = this.dataLayer;
            Intrinsics.m18596d(strOptString);
            intercomDataLayer.markConversationAsRead(strOptString);
            return;
        }
        if (i != 5) {
            this.twig.internal("Nexus", "Unexpected event: " + event.getEventType());
            return;
        }
        logKnownEvent(event);
        long jOptLong = event.getEventData().optLong("entity_type");
        String strOptString2 = event.getEventData().optString("entity_id");
        if (jOptLong == 44) {
            this.api.fetchCarouselByEntityId(strOptString2);
            return;
        }
        if (jOptLong == 85) {
            this.api.fetchSurveyByEntityId(strOptString2);
            return;
        }
        this.twig.internal("Nexus NewContent", "Unexpected entity type: " + jOptLong);
    }

    public final void scheduleDisconnect(long delayMs) {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new RunnableC5204e(this, 1), delayMs, TimeUnit.MILLISECONDS);
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnect() {
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnectFailed() {
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onShutdown() {
    }
}
