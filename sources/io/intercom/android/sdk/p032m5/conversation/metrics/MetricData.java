package io.intercom.android.sdk.p032m5.conversation.metrics;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "", "<init>", "()V", "SpeechRecognitionStarted", "SpeechRecognitionEnded", "MoreMenuClicked", "ConversationsInMoreMenuClicked", "NewConversationInMoreMenuClicked", "TicketsInMoreMenuClicked", "HelpInMoreMenuClicked", "PoweredByClicked", "ComposerInputClicked", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ComposerInputClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ConversationsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$HelpInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$MoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$NewConversationInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$PoweredByClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionEnded;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionStarted;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$TicketsInMoreMenuClicked;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class MetricData {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ComposerInputClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", MetricTracker.Object.INPUT, "", "<init>", "(Ljava/lang/String;)V", "getInput", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ComposerInputClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        private final String input;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposerInputClicked(@NotNull String input) {
            super(null);
            Intrinsics.m18599g(input, "input");
            this.input = input;
        }

        public static /* synthetic */ ComposerInputClicked copy$default(ComposerInputClicked composerInputClicked, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = composerInputClicked.input;
            }
            return composerInputClicked.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        @NotNull
        public final ComposerInputClicked copy(@NotNull String input) {
            Intrinsics.m18599g(input, "input");
            return new ComposerInputClicked(input);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComposerInputClicked) && Intrinsics.m18594b(this.input, ((ComposerInputClicked) other).input);
        }

        @NotNull
        public final String getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("ComposerInputClicked(input="), this.input, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ConversationsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ConversationsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public ConversationsInMoreMenuClicked(boolean z2) {
            super(null);
            this.isMoreMenuContext = z2;
        }

        public static /* synthetic */ ConversationsInMoreMenuClicked copy$default(ConversationsInMoreMenuClicked conversationsInMoreMenuClicked, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = conversationsInMoreMenuClicked.isMoreMenuContext;
            }
            return conversationsInMoreMenuClicked.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public final ConversationsInMoreMenuClicked copy(boolean isMoreMenuContext) {
            return new ConversationsInMoreMenuClicked(isMoreMenuContext);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationsInMoreMenuClicked) && this.isMoreMenuContext == ((ConversationsInMoreMenuClicked) other).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2243r(new StringBuilder("ConversationsInMoreMenuClicked(isMoreMenuContext="), this.isMoreMenuContext, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$HelpInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class HelpInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        public static final HelpInMoreMenuClicked INSTANCE = new HelpInMoreMenuClicked();

        private HelpInMoreMenuClicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$MoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class MoreMenuClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        public static final MoreMenuClicked INSTANCE = new MoreMenuClicked();

        private MoreMenuClicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$NewConversationInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class NewConversationInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public NewConversationInMoreMenuClicked(boolean z2) {
            super(null);
            this.isMoreMenuContext = z2;
        }

        public static /* synthetic */ NewConversationInMoreMenuClicked copy$default(NewConversationInMoreMenuClicked newConversationInMoreMenuClicked, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = newConversationInMoreMenuClicked.isMoreMenuContext;
            }
            return newConversationInMoreMenuClicked.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public final NewConversationInMoreMenuClicked copy(boolean isMoreMenuContext) {
            return new NewConversationInMoreMenuClicked(isMoreMenuContext);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewConversationInMoreMenuClicked) && this.isMoreMenuContext == ((NewConversationInMoreMenuClicked) other).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2243r(new StringBuilder("NewConversationInMoreMenuClicked(isMoreMenuContext="), this.isMoreMenuContext, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$PoweredByClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class PoweredByClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        public static final PoweredByClicked INSTANCE = new PoweredByClicked();

        private PoweredByClicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionEnded;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "duration", "", "<init>", "(J)V", "getDuration", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class SpeechRecognitionEnded extends MetricData {
        public static final int $stable = 0;
        private final long duration;

        public SpeechRecognitionEnded(long j) {
            super(null);
            this.duration = j;
        }

        public static /* synthetic */ SpeechRecognitionEnded copy$default(SpeechRecognitionEnded speechRecognitionEnded, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = speechRecognitionEnded.duration;
            }
            return speechRecognitionEnded.copy(j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @NotNull
        public final SpeechRecognitionEnded copy(long duration) {
            return new SpeechRecognitionEnded(duration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpeechRecognitionEnded) && this.duration == ((SpeechRecognitionEnded) other).duration;
        }

        public final long getDuration() {
            return this.duration;
        }

        public int hashCode() {
            return Long.hashCode(this.duration);
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2240o(new StringBuilder("SpeechRecognitionEnded(duration="), this.duration, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionStarted;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SpeechRecognitionStarted extends MetricData {
        public static final int $stable = 0;

        @NotNull
        public static final SpeechRecognitionStarted INSTANCE = new SpeechRecognitionStarted();

        private SpeechRecognitionStarted() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$TicketsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class TicketsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public TicketsInMoreMenuClicked(boolean z2) {
            super(null);
            this.isMoreMenuContext = z2;
        }

        public static /* synthetic */ TicketsInMoreMenuClicked copy$default(TicketsInMoreMenuClicked ticketsInMoreMenuClicked, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = ticketsInMoreMenuClicked.isMoreMenuContext;
            }
            return ticketsInMoreMenuClicked.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public final TicketsInMoreMenuClicked copy(boolean isMoreMenuContext) {
            return new TicketsInMoreMenuClicked(isMoreMenuContext);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TicketsInMoreMenuClicked) && this.isMoreMenuContext == ((TicketsInMoreMenuClicked) other).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2243r(new StringBuilder("TicketsInMoreMenuClicked(isMoreMenuContext="), this.isMoreMenuContext, ')');
        }
    }

    public /* synthetic */ MetricData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MetricData() {
    }
}
