package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import io.intercom.android.sdk.p041ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", Constants.ScionAnalytics.PARAM_LABEL, "Lio/intercom/android/sdk/ui/common/StringProvider;", "getLabel", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "TotalCountIndicator", "Messages", "StartNewConversation", "Tickets", "Help", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$Help;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$Messages;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$StartNewConversation;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$Tickets;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class HeaderMenuItem {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$Help;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "enabled", "", Constants.ScionAnalytics.PARAM_LABEL, "Lio/intercom/android/sdk/ui/common/StringProvider;", "<init>", "(ZLio/intercom/android/sdk/ui/common/StringProvider;)V", "getEnabled", "()Z", "getLabel", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Help extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;

        @NotNull
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Help(boolean z2, @NotNull StringProvider label) {
            super(null);
            Intrinsics.m18599g(label, "label");
            this.enabled = z2;
            this.label = label;
        }

        public static /* synthetic */ Help copy$default(Help help, boolean z2, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = help.enabled;
            }
            if ((i & 2) != 0) {
                stringProvider = help.label;
            }
            return help.copy(z2, stringProvider);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final StringProvider getLabel() {
            return this.label;
        }

        @NotNull
        public final Help copy(boolean enabled, @NotNull StringProvider label) {
            Intrinsics.m18599g(label, "label");
            return new Help(enabled, label);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Help)) {
                return false;
            }
            Help help = (Help) other;
            return this.enabled == help.enabled && Intrinsics.m18594b(this.label, help.label);
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        @NotNull
        public String toString() {
            return "Help(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$Messages;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "totalCountIndicator", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator;", "unreadMessagesCount", "", "enabled", "", Constants.ScionAnalytics.PARAM_LABEL, "Lio/intercom/android/sdk/ui/common/StringProvider;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator;Ljava/lang/String;ZLio/intercom/android/sdk/ui/common/StringProvider;)V", "getTotalCountIndicator", "()Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator;", "getUnreadMessagesCount", "()Ljava/lang/String;", "getEnabled", "()Z", "getLabel", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Messages extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;

        @NotNull
        private final StringProvider label;

        @NotNull
        private final TotalCountIndicator totalCountIndicator;

        @NotNull
        private final String unreadMessagesCount;

        public /* synthetic */ Messages(TotalCountIndicator totalCountIndicator, String str, boolean z2, StringProvider stringProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(totalCountIndicator, str, (i & 4) != 0 ? true : z2, stringProvider);
        }

        public static /* synthetic */ Messages copy$default(Messages messages, TotalCountIndicator totalCountIndicator, String str, boolean z2, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                totalCountIndicator = messages.totalCountIndicator;
            }
            if ((i & 2) != 0) {
                str = messages.unreadMessagesCount;
            }
            if ((i & 4) != 0) {
                z2 = messages.enabled;
            }
            if ((i & 8) != 0) {
                stringProvider = messages.label;
            }
            return messages.copy(totalCountIndicator, str, z2, stringProvider);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TotalCountIndicator getTotalCountIndicator() {
            return this.totalCountIndicator;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUnreadMessagesCount() {
            return this.unreadMessagesCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringProvider getLabel() {
            return this.label;
        }

        @NotNull
        public final Messages copy(@NotNull TotalCountIndicator totalCountIndicator, @NotNull String unreadMessagesCount, boolean enabled, @NotNull StringProvider label) {
            Intrinsics.m18599g(totalCountIndicator, "totalCountIndicator");
            Intrinsics.m18599g(unreadMessagesCount, "unreadMessagesCount");
            Intrinsics.m18599g(label, "label");
            return new Messages(totalCountIndicator, unreadMessagesCount, enabled, label);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Messages)) {
                return false;
            }
            Messages messages = (Messages) other;
            return Intrinsics.m18594b(this.totalCountIndicator, messages.totalCountIndicator) && Intrinsics.m18594b(this.unreadMessagesCount, messages.unreadMessagesCount) && this.enabled == messages.enabled && Intrinsics.m18594b(this.label, messages.label);
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        @NotNull
        public final TotalCountIndicator getTotalCountIndicator() {
            return this.totalCountIndicator;
        }

        @NotNull
        public final String getUnreadMessagesCount() {
            return this.unreadMessagesCount;
        }

        public int hashCode() {
            return this.label.hashCode() + AbstractC0455a.m2230e(AbstractC0000a.m5b(this.totalCountIndicator.hashCode() * 31, 31, this.unreadMessagesCount), 31, this.enabled);
        }

        @NotNull
        public String toString() {
            return "Messages(totalCountIndicator=" + this.totalCountIndicator + ", unreadMessagesCount=" + this.unreadMessagesCount + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Messages(@NotNull TotalCountIndicator totalCountIndicator, @NotNull String unreadMessagesCount, boolean z2, @NotNull StringProvider label) {
            super(null);
            Intrinsics.m18599g(totalCountIndicator, "totalCountIndicator");
            Intrinsics.m18599g(unreadMessagesCount, "unreadMessagesCount");
            Intrinsics.m18599g(label, "label");
            this.totalCountIndicator = totalCountIndicator;
            this.unreadMessagesCount = unreadMessagesCount;
            this.enabled = z2;
            this.label = label;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$StartNewConversation;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "enabled", "", Constants.ScionAnalytics.PARAM_LABEL, "Lio/intercom/android/sdk/ui/common/StringProvider;", "<init>", "(ZLio/intercom/android/sdk/ui/common/StringProvider;)V", "getEnabled", "()Z", "getLabel", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class StartNewConversation extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;

        @NotNull
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartNewConversation(boolean z2, @NotNull StringProvider label) {
            super(null);
            Intrinsics.m18599g(label, "label");
            this.enabled = z2;
            this.label = label;
        }

        public static /* synthetic */ StartNewConversation copy$default(StartNewConversation startNewConversation, boolean z2, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = startNewConversation.enabled;
            }
            if ((i & 2) != 0) {
                stringProvider = startNewConversation.label;
            }
            return startNewConversation.copy(z2, stringProvider);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final StringProvider getLabel() {
            return this.label;
        }

        @NotNull
        public final StartNewConversation copy(boolean enabled, @NotNull StringProvider label) {
            Intrinsics.m18599g(label, "label");
            return new StartNewConversation(enabled, label);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartNewConversation)) {
                return false;
            }
            StartNewConversation startNewConversation = (StartNewConversation) other;
            return this.enabled == startNewConversation.enabled && Intrinsics.m18594b(this.label, startNewConversation.label);
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        @NotNull
        public String toString() {
            return "StartNewConversation(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$Tickets;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "hasUnreadTickets", "", "enabled", Constants.ScionAnalytics.PARAM_LABEL, "Lio/intercom/android/sdk/ui/common/StringProvider;", "<init>", "(ZZLio/intercom/android/sdk/ui/common/StringProvider;)V", "getHasUnreadTickets", "()Z", "getEnabled", "getLabel", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Tickets extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final boolean hasUnreadTickets;

        @NotNull
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tickets(boolean z2, boolean z3, @NotNull StringProvider label) {
            super(null);
            Intrinsics.m18599g(label, "label");
            this.hasUnreadTickets = z2;
            this.enabled = z3;
            this.label = label;
        }

        public static /* synthetic */ Tickets copy$default(Tickets tickets, boolean z2, boolean z3, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = tickets.hasUnreadTickets;
            }
            if ((i & 2) != 0) {
                z3 = tickets.enabled;
            }
            if ((i & 4) != 0) {
                stringProvider = tickets.label;
            }
            return tickets.copy(z2, z3, stringProvider);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getHasUnreadTickets() {
            return this.hasUnreadTickets;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final StringProvider getLabel() {
            return this.label;
        }

        @NotNull
        public final Tickets copy(boolean hasUnreadTickets, boolean enabled, @NotNull StringProvider label) {
            Intrinsics.m18599g(label, "label");
            return new Tickets(hasUnreadTickets, enabled, label);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tickets)) {
                return false;
            }
            Tickets tickets = (Tickets) other;
            return this.hasUnreadTickets == tickets.hasUnreadTickets && this.enabled == tickets.enabled && Intrinsics.m18594b(this.label, tickets.label);
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getHasUnreadTickets() {
            return this.hasUnreadTickets;
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + AbstractC0455a.m2230e(Boolean.hashCode(this.hasUnreadTickets) * 31, 31, this.enabled);
        }

        @NotNull
        public String toString() {
            return "Tickets(hasUnreadTickets=" + this.hasUnreadTickets + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator;", "", "UnreadCountIndicator", "UnreadDotIndicator", "NoIndicator", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator$NoIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator$UnreadCountIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator$UnreadDotIndicator;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface TotalCountIndicator {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator$NoIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final /* data */ class NoIndicator implements TotalCountIndicator {
            public static final int $stable = 0;

            @NotNull
            public static final NoIndicator INSTANCE = new NoIndicator();

            private NoIndicator() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof NoIndicator);
            }

            public int hashCode() {
                return -94121592;
            }

            @NotNull
            public String toString() {
                return "NoIndicator";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator$UnreadCountIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator;", "unreadMessagesCount", "", "<init>", "(Ljava/lang/String;)V", "getUnreadMessagesCount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final /* data */ class UnreadCountIndicator implements TotalCountIndicator {
            public static final int $stable = 0;

            @NotNull
            private final String unreadMessagesCount;

            public UnreadCountIndicator(@NotNull String unreadMessagesCount) {
                Intrinsics.m18599g(unreadMessagesCount, "unreadMessagesCount");
                this.unreadMessagesCount = unreadMessagesCount;
            }

            public static /* synthetic */ UnreadCountIndicator copy$default(UnreadCountIndicator unreadCountIndicator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unreadCountIndicator.unreadMessagesCount;
                }
                return unreadCountIndicator.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUnreadMessagesCount() {
                return this.unreadMessagesCount;
            }

            @NotNull
            public final UnreadCountIndicator copy(@NotNull String unreadMessagesCount) {
                Intrinsics.m18599g(unreadMessagesCount, "unreadMessagesCount");
                return new UnreadCountIndicator(unreadMessagesCount);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnreadCountIndicator) && Intrinsics.m18594b(this.unreadMessagesCount, ((UnreadCountIndicator) other).unreadMessagesCount);
            }

            @NotNull
            public final String getUnreadMessagesCount() {
                return this.unreadMessagesCount;
            }

            public int hashCode() {
                return this.unreadMessagesCount.hashCode();
            }

            @NotNull
            public String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("UnreadCountIndicator(unreadMessagesCount="), this.unreadMessagesCount, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator$UnreadDotIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem$TotalCountIndicator;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final /* data */ class UnreadDotIndicator implements TotalCountIndicator {
            public static final int $stable = 0;

            @NotNull
            public static final UnreadDotIndicator INSTANCE = new UnreadDotIndicator();

            private UnreadDotIndicator() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof UnreadDotIndicator);
            }

            public int hashCode() {
                return -715258213;
            }

            @NotNull
            public String toString() {
                return "UnreadDotIndicator";
            }
        }
    }

    public /* synthetic */ HeaderMenuItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getEnabled();

    @NotNull
    public abstract StringProvider getLabel();

    private HeaderMenuItem() {
    }
}
