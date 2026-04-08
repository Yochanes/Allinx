package io.intercom.android.sdk.p032m5.home.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "", "<init>", "()V", "NavigateToMessages", "NavigateToNewConversation", "NavigateToConversation", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToMessages;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToNewConversation;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class HomeUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class NavigateToConversation extends HomeUiEffects {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(@NotNull String conversationId) {
            super(null);
            Intrinsics.m18599g(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToConversation.conversationId;
            }
            return navigateToConversation.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final NavigateToConversation copy(@NotNull String conversationId) {
            Intrinsics.m18599g(conversationId, "conversationId");
            return new NavigateToConversation(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToConversation) && Intrinsics.m18594b(this.conversationId, ((NavigateToConversation) other).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("NavigateToConversation(conversationId="), this.conversationId, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToMessages;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class NavigateToMessages extends HomeUiEffects {
        public static final int $stable = 0;

        @NotNull
        public static final NavigateToMessages INSTANCE = new NavigateToMessages();

        private NavigateToMessages() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NavigateToMessages);
        }

        public int hashCode() {
            return 982177798;
        }

        @NotNull
        public String toString() {
            return "NavigateToMessages";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiEffects$NavigateToNewConversation;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class NavigateToNewConversation extends HomeUiEffects {
        public static final int $stable = 0;

        @NotNull
        public static final NavigateToNewConversation INSTANCE = new NavigateToNewConversation();

        private NavigateToNewConversation() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NavigateToNewConversation);
        }

        public int hashCode() {
            return 453078601;
        }

        @NotNull
        public String toString() {
            return "NavigateToNewConversation";
        }
    }

    public /* synthetic */ HomeUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeUiEffects() {
    }
}
