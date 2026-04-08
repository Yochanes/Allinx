package io.intercom.android.sdk.p032m5.inbox.states;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "", "<init>", "()V", "NavigateToConversation", "RefreshInbox", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$RefreshInbox;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class InboxUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "<init>", "(Lio/intercom/android/sdk/models/Conversation;)V", "getConversation", "()Lio/intercom/android/sdk/models/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class NavigateToConversation extends InboxUiEffects {
        public static final int $stable = 8;

        @NotNull
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(@NotNull Conversation conversation) {
            super(null);
            Intrinsics.m18599g(conversation, "conversation");
            this.conversation = conversation;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversation = navigateToConversation.conversation;
            }
            return navigateToConversation.copy(conversation);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final NavigateToConversation copy(@NotNull Conversation conversation) {
            Intrinsics.m18599g(conversation, "conversation");
            return new NavigateToConversation(conversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToConversation) && Intrinsics.m18594b(this.conversation, ((NavigateToConversation) other).conversation);
        }

        @NotNull
        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        @NotNull
        public String toString() {
            return "NavigateToConversation(conversation=" + this.conversation + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$RefreshInbox;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class RefreshInbox extends InboxUiEffects {
        public static final int $stable = 0;

        @NotNull
        public static final RefreshInbox INSTANCE = new RefreshInbox();

        private RefreshInbox() {
            super(null);
        }
    }

    public /* synthetic */ InboxUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InboxUiEffects() {
    }
}
