package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.p032m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.p032m5.conversation.states.NetworkState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "Loading", "Content", "Error", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Content;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface ConversationUiState {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "showCta", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "<init>", "(ZLio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;)V", "getShowCta", "()Z", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Error implements ConversationUiState {
        public static final int $stable = 8;
        private final boolean showCta;

        @NotNull
        private final TopAppBarUiState topAppBarUiState;

        public Error(boolean z2, @NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.m18599g(topAppBarUiState, "topAppBarUiState");
            this.showCta = z2;
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Error copy$default(Error error, boolean z2, TopAppBarUiState topAppBarUiState, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = error.showCta;
            }
            if ((i & 2) != 0) {
                topAppBarUiState = error.topAppBarUiState;
            }
            return error.copy(z2, topAppBarUiState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShowCta() {
            return this.showCta;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        @NotNull
        public final Error copy(boolean showCta, @NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.m18599g(topAppBarUiState, "topAppBarUiState");
            return new Error(showCta, topAppBarUiState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.showCta == error.showCta && Intrinsics.m18594b(this.topAppBarUiState, error.topAppBarUiState);
        }

        public final boolean getShowCta() {
            return this.showCta;
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.ConversationUiState
        @NotNull
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode() + (Boolean.hashCode(this.showCta) * 31);
        }

        @NotNull
        public String toString() {
            return "Error(showCta=" + this.showCta + ", topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;)V", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Loading implements ConversationUiState {
        public static final int $stable = 8;

        @NotNull
        private final TopAppBarUiState topAppBarUiState;

        public Loading(@NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.m18599g(topAppBarUiState, "topAppBarUiState");
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, TopAppBarUiState topAppBarUiState, int i, Object obj) {
            if ((i & 1) != 0) {
                topAppBarUiState = loading.topAppBarUiState;
            }
            return loading.copy(topAppBarUiState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        @NotNull
        public final Loading copy(@NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.m18599g(topAppBarUiState, "topAppBarUiState");
            return new Loading(topAppBarUiState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.m18594b(this.topAppBarUiState, ((Loading) other).topAppBarUiState);
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.ConversationUiState
        @NotNull
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loading(topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    @NotNull
    TopAppBarUiState getTopAppBarUiState();

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003JU\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020.H×\u0001J\t\u0010/\u001a\u000200H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Content;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "contentRows", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "bottomBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "networkState", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "bottomSheetState", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "floatingIndicatorState", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "teamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;Ljava/util/List;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;Lio/intercom/android/sdk/m5/conversation/states/NetworkState;Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;)V", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getContentRows", "()Ljava/util/List;", "getBottomBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "getNetworkState", "()Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "getBottomSheetState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "getFloatingIndicatorState", "()Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "getTeamPresenceState", "()Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Content implements ConversationUiState {
        public static final int $stable = 8;

        @NotNull
        private final BottomBarUiState bottomBarUiState;

        @NotNull
        private final BottomSheetState bottomSheetState;

        @NotNull
        private final List<ContentRow> contentRows;

        @NotNull
        private final FloatingIndicatorState floatingIndicatorState;

        @NotNull
        private final NetworkState networkState;

        @NotNull
        private final TeamPresenceState teamPresenceState;

        @NotNull
        private final TopAppBarUiState topAppBarUiState;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@NotNull TopAppBarUiState topAppBarUiState, @NotNull List<? extends ContentRow> contentRows, @NotNull BottomBarUiState bottomBarUiState, @NotNull NetworkState networkState, @NotNull BottomSheetState bottomSheetState, @NotNull FloatingIndicatorState floatingIndicatorState, @NotNull TeamPresenceState teamPresenceState) {
            Intrinsics.m18599g(topAppBarUiState, "topAppBarUiState");
            Intrinsics.m18599g(contentRows, "contentRows");
            Intrinsics.m18599g(bottomBarUiState, "bottomBarUiState");
            Intrinsics.m18599g(networkState, "networkState");
            Intrinsics.m18599g(bottomSheetState, "bottomSheetState");
            Intrinsics.m18599g(floatingIndicatorState, "floatingIndicatorState");
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            this.topAppBarUiState = topAppBarUiState;
            this.contentRows = contentRows;
            this.bottomBarUiState = bottomBarUiState;
            this.networkState = networkState;
            this.bottomSheetState = bottomSheetState;
            this.floatingIndicatorState = floatingIndicatorState;
            this.teamPresenceState = teamPresenceState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                topAppBarUiState = content.topAppBarUiState;
            }
            if ((i & 2) != 0) {
                list = content.contentRows;
            }
            if ((i & 4) != 0) {
                bottomBarUiState = content.bottomBarUiState;
            }
            if ((i & 8) != 0) {
                networkState = content.networkState;
            }
            if ((i & 16) != 0) {
                bottomSheetState = content.bottomSheetState;
            }
            if ((i & 32) != 0) {
                floatingIndicatorState = content.floatingIndicatorState;
            }
            if ((i & 64) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            FloatingIndicatorState floatingIndicatorState2 = floatingIndicatorState;
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            BottomSheetState bottomSheetState2 = bottomSheetState;
            BottomBarUiState bottomBarUiState2 = bottomBarUiState;
            return content.copy(topAppBarUiState, list, bottomBarUiState2, networkState, bottomSheetState2, floatingIndicatorState2, teamPresenceState2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        @NotNull
        public final List<ContentRow> component2() {
            return this.contentRows;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @NotNull
        public final Content copy(@NotNull TopAppBarUiState topAppBarUiState, @NotNull List<? extends ContentRow> contentRows, @NotNull BottomBarUiState bottomBarUiState, @NotNull NetworkState networkState, @NotNull BottomSheetState bottomSheetState, @NotNull FloatingIndicatorState floatingIndicatorState, @NotNull TeamPresenceState teamPresenceState) {
            Intrinsics.m18599g(topAppBarUiState, "topAppBarUiState");
            Intrinsics.m18599g(contentRows, "contentRows");
            Intrinsics.m18599g(bottomBarUiState, "bottomBarUiState");
            Intrinsics.m18599g(networkState, "networkState");
            Intrinsics.m18599g(bottomSheetState, "bottomSheetState");
            Intrinsics.m18599g(floatingIndicatorState, "floatingIndicatorState");
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            return new Content(topAppBarUiState, contentRows, bottomBarUiState, networkState, bottomSheetState, floatingIndicatorState, teamPresenceState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.m18594b(this.topAppBarUiState, content.topAppBarUiState) && Intrinsics.m18594b(this.contentRows, content.contentRows) && Intrinsics.m18594b(this.bottomBarUiState, content.bottomBarUiState) && Intrinsics.m18594b(this.networkState, content.networkState) && Intrinsics.m18594b(this.bottomSheetState, content.bottomSheetState) && Intrinsics.m18594b(this.floatingIndicatorState, content.floatingIndicatorState) && Intrinsics.m18594b(this.teamPresenceState, content.teamPresenceState);
        }

        @NotNull
        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        @NotNull
        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        @NotNull
        public final List<ContentRow> getContentRows() {
            return this.contentRows;
        }

        @NotNull
        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        @NotNull
        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        @NotNull
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @Override // io.intercom.android.sdk.p032m5.conversation.states.ConversationUiState
        @NotNull
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode() + ((this.floatingIndicatorState.hashCode() + ((this.bottomSheetState.hashCode() + ((this.networkState.hashCode() + ((this.bottomBarUiState.hashCode() + AbstractC0455a.m2233h(this.contentRows, this.topAppBarUiState.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Content(topAppBarUiState=" + this.topAppBarUiState + ", contentRows=" + this.contentRows + ", bottomBarUiState=" + this.bottomBarUiState + ", networkState=" + this.networkState + ", bottomSheetState=" + this.bottomSheetState + ", floatingIndicatorState=" + this.floatingIndicatorState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }

        public /* synthetic */ Content(TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(topAppBarUiState, list, bottomBarUiState, (i & 8) != 0 ? NetworkState.Connected.INSTANCE : networkState, (i & 16) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState, floatingIndicatorState, teamPresenceState);
        }
    }
}
