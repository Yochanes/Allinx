package io.intercom.android.sdk.helpcenter.articles;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "", "<init>", "()V", "Initial", "Content", "TeamPresenceState", "ConversationState", "ReactionState", "WebViewStatus", "Error", "Reaction", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ArticleViewState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020#H×\u0001J\t\u0010$\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "articleUrl", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "webViewStatus", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "reactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getArticleUrl", "()Ljava/lang/String;", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getWebViewStatus", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "getReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Content extends ArticleViewState {
        public static final int $stable = 0;

        @Nullable
        private final ArticleMetadata articleMetadata;

        @NotNull
        private final String articleUrl;

        @NotNull
        private final ReactionState reactionState;

        @NotNull
        private final TeamPresenceState teamPresenceState;

        @NotNull
        private final WebViewStatus webViewStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(@NotNull String articleUrl, @Nullable ArticleMetadata articleMetadata, @NotNull WebViewStatus webViewStatus, @NotNull ReactionState reactionState, @NotNull TeamPresenceState teamPresenceState) {
            super(null);
            Intrinsics.m18599g(articleUrl, "articleUrl");
            Intrinsics.m18599g(webViewStatus, "webViewStatus");
            Intrinsics.m18599g(reactionState, "reactionState");
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            this.articleUrl = articleUrl;
            this.articleMetadata = articleMetadata;
            this.webViewStatus = webViewStatus;
            this.reactionState = reactionState;
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.articleUrl;
            }
            if ((i & 2) != 0) {
                articleMetadata = content.articleMetadata;
            }
            if ((i & 4) != 0) {
                webViewStatus = content.webViewStatus;
            }
            if ((i & 8) != 0) {
                reactionState = content.reactionState;
            }
            if ((i & 16) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            WebViewStatus webViewStatus2 = webViewStatus;
            return content.copy(str, articleMetadata, webViewStatus2, reactionState, teamPresenceState2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getArticleUrl() {
            return this.articleUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @NotNull
        public final Content copy(@NotNull String articleUrl, @Nullable ArticleMetadata articleMetadata, @NotNull WebViewStatus webViewStatus, @NotNull ReactionState reactionState, @NotNull TeamPresenceState teamPresenceState) {
            Intrinsics.m18599g(articleUrl, "articleUrl");
            Intrinsics.m18599g(webViewStatus, "webViewStatus");
            Intrinsics.m18599g(reactionState, "reactionState");
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            return new Content(articleUrl, articleMetadata, webViewStatus, reactionState, teamPresenceState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.m18594b(this.articleUrl, content.articleUrl) && Intrinsics.m18594b(this.articleMetadata, content.articleMetadata) && this.webViewStatus == content.webViewStatus && Intrinsics.m18594b(this.reactionState, content.reactionState) && Intrinsics.m18594b(this.teamPresenceState, content.teamPresenceState);
        }

        @Nullable
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        @NotNull
        public final String getArticleUrl() {
            return this.articleUrl;
        }

        @NotNull
        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        @NotNull
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @NotNull
        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        public int hashCode() {
            int iHashCode = this.articleUrl.hashCode() * 31;
            ArticleMetadata articleMetadata = this.articleMetadata;
            return this.teamPresenceState.hashCode() + ((this.reactionState.hashCode() + ((this.webViewStatus.hashCode() + ((iHashCode + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Content(articleUrl=" + this.articleUrl + ", articleMetadata=" + this.articleMetadata + ", webViewStatus=" + this.webViewStatus + ", reactionState=" + this.reactionState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "message", "", "retryButtonVisibility", "retryButtonPrimaryColor", "<init>", "(III)V", "getMessage", "()I", "getRetryButtonVisibility", "getRetryButtonPrimaryColor", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Error extends ArticleViewState {
        public static final int $stable = 0;
        private final int message;
        private final int retryButtonPrimaryColor;
        private final int retryButtonVisibility;

        public Error(@StringRes int i, int i2, int i3) {
            super(null);
            this.message = i;
            this.retryButtonVisibility = i2;
            this.retryButtonPrimaryColor = i3;
        }

        public static /* synthetic */ Error copy$default(Error error, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = error.message;
            }
            if ((i4 & 2) != 0) {
                i2 = error.retryButtonVisibility;
            }
            if ((i4 & 4) != 0) {
                i3 = error.retryButtonPrimaryColor;
            }
            return error.copy(i, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        @NotNull
        public final Error copy(@StringRes int message, int retryButtonVisibility, int retryButtonPrimaryColor) {
            return new Error(message, retryButtonVisibility, retryButtonPrimaryColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.message == error.message && this.retryButtonVisibility == error.retryButtonVisibility && this.retryButtonPrimaryColor == error.retryButtonPrimaryColor;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        public int hashCode() {
            return Integer.hashCode(this.retryButtonPrimaryColor) + AbstractC0455a.m2228c(this.retryButtonVisibility, Integer.hashCode(this.message) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", retryButtonVisibility=");
            sb.append(this.retryButtonVisibility);
            sb.append(", retryButtonPrimaryColor=");
            return AbstractC0000a.m17n(sb, this.retryButtonPrimaryColor, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Initial extends ArticleViewState {
        public static final int $stable = 0;

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Sad", "Neutral", "Happy", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Reaction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reaction[] $VALUES;
        public static final Reaction None = new Reaction("None", 0);
        public static final Reaction Sad = new Reaction("Sad", 1);
        public static final Reaction Neutral = new Reaction("Neutral", 2);
        public static final Reaction Happy = new Reaction("Happy", 3);

        private static final /* synthetic */ Reaction[] $values() {
            return new Reaction[]{None, Sad, Neutral, Happy};
        }

        static {
            Reaction[] reactionArr$values = $values();
            $VALUES = reactionArr$values;
            $ENTRIES = EnumEntriesKt.m18563a(reactionArr$values);
        }

        private Reaction(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Reaction> getEntries() {
            return $ENTRIES;
        }

        public static Reaction valueOf(String str) {
            return (Reaction) Enum.valueOf(Reaction.class, str);
        }

        public static Reaction[] values() {
            return (Reaction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Idle", "Loading", "Ready", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class WebViewStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WebViewStatus[] $VALUES;
        public static final WebViewStatus Idle = new WebViewStatus("Idle", 0);
        public static final WebViewStatus Loading = new WebViewStatus("Loading", 1);
        public static final WebViewStatus Ready = new WebViewStatus("Ready", 2);

        private static final /* synthetic */ WebViewStatus[] $values() {
            return new WebViewStatus[]{Idle, Loading, Ready};
        }

        static {
            WebViewStatus[] webViewStatusArr$values = $values();
            $VALUES = webViewStatusArr$values;
            $ENTRIES = EnumEntriesKt.m18563a(webViewStatusArr$values);
        }

        private WebViewStatus(String str, int i) {
        }

        @NotNull
        public static EnumEntries<WebViewStatus> getEntries() {
            return $ENTRIES;
        }

        public static WebViewStatus valueOf(String str) {
            return (WebViewStatus) Enum.valueOf(WebViewStatus.class, str);
        }

        public static WebViewStatus[] values() {
            return (WebViewStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ArticleViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ArticleViewState() {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0005H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "", "conversationId", "", "messageButtonText", "", "<init>", "(Ljava/lang/String;I)V", "getConversationId", "()Ljava/lang/String;", "getMessageButtonText", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ConversationState {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;
        private final int messageButtonText;

        public ConversationState(@NotNull String conversationId, @StringRes int i) {
            Intrinsics.m18599g(conversationId, "conversationId");
            this.conversationId = conversationId;
            this.messageButtonText = i;
        }

        public static /* synthetic */ ConversationState copy$default(ConversationState conversationState, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = conversationState.conversationId;
            }
            if ((i2 & 2) != 0) {
                i = conversationState.messageButtonText;
            }
            return conversationState.copy(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        @NotNull
        public final ConversationState copy(@NotNull String conversationId, @StringRes int messageButtonText) {
            Intrinsics.m18599g(conversationId, "conversationId");
            return new ConversationState(conversationId, messageButtonText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationState)) {
                return false;
            }
            ConversationState conversationState = (ConversationState) other;
            return Intrinsics.m18594b(this.conversationId, conversationState.conversationId) && this.messageButtonText == conversationState.messageButtonText;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageButtonText) + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ConversationState(conversationId=");
            sb.append(this.conversationId);
            sb.append(", messageButtonText=");
            return AbstractC0000a.m17n(sb, this.messageButtonText, ')');
        }

        public /* synthetic */ ConversationState(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? C5101R.string.intercom_continue_the_conversation : i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\t\u0010\u001d\u001a\u00020\u001eH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "", "reactionComponentVisibility", "", "transitionState", "selectedReaction", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "teamHelpVisibility", "shouldScrollToBottom", "", "<init>", "(IILio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;IZ)V", "getReactionComponentVisibility", "()I", "getTransitionState", "getSelectedReaction", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "getTeamHelpVisibility", "getShouldScrollToBottom", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ReactionState {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final ReactionState defaultReactionState = new ReactionState(8, C5101R.id.start, null, 8, false, 4, null);
        private final int reactionComponentVisibility;

        @NotNull
        private final Reaction selectedReaction;
        private final boolean shouldScrollToBottom;
        private final int teamHelpVisibility;
        private final int transitionState;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState$Companion;", "", "<init>", "()V", "defaultReactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getDefaultReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ReactionState getDefaultReactionState() {
                return ReactionState.access$getDefaultReactionState$cp();
            }

            private Companion() {
            }
        }

        public ReactionState(int i, @IdRes int i2, @NotNull Reaction selectedReaction, int i3, boolean z2) {
            Intrinsics.m18599g(selectedReaction, "selectedReaction");
            this.reactionComponentVisibility = i;
            this.transitionState = i2;
            this.selectedReaction = selectedReaction;
            this.teamHelpVisibility = i3;
            this.shouldScrollToBottom = z2;
        }

        public static final /* synthetic */ ReactionState access$getDefaultReactionState$cp() {
            return defaultReactionState;
        }

        public static /* synthetic */ ReactionState copy$default(ReactionState reactionState, int i, int i2, Reaction reaction, int i3, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = reactionState.reactionComponentVisibility;
            }
            if ((i4 & 2) != 0) {
                i2 = reactionState.transitionState;
            }
            if ((i4 & 4) != 0) {
                reaction = reactionState.selectedReaction;
            }
            if ((i4 & 8) != 0) {
                i3 = reactionState.teamHelpVisibility;
            }
            if ((i4 & 16) != 0) {
                z2 = reactionState.shouldScrollToBottom;
            }
            boolean z3 = z2;
            Reaction reaction2 = reaction;
            return reactionState.copy(i, i2, reaction2, i3, z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTransitionState() {
            return this.transitionState;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        @NotNull
        public final ReactionState copy(int reactionComponentVisibility, @IdRes int transitionState, @NotNull Reaction selectedReaction, int teamHelpVisibility, boolean shouldScrollToBottom) {
            Intrinsics.m18599g(selectedReaction, "selectedReaction");
            return new ReactionState(reactionComponentVisibility, transitionState, selectedReaction, teamHelpVisibility, shouldScrollToBottom);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionState)) {
                return false;
            }
            ReactionState reactionState = (ReactionState) other;
            return this.reactionComponentVisibility == reactionState.reactionComponentVisibility && this.transitionState == reactionState.transitionState && this.selectedReaction == reactionState.selectedReaction && this.teamHelpVisibility == reactionState.teamHelpVisibility && this.shouldScrollToBottom == reactionState.shouldScrollToBottom;
        }

        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        @NotNull
        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        public final int getTransitionState() {
            return this.transitionState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldScrollToBottom) + AbstractC0455a.m2228c(this.teamHelpVisibility, (this.selectedReaction.hashCode() + AbstractC0455a.m2228c(this.transitionState, Integer.hashCode(this.reactionComponentVisibility) * 31, 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ReactionState(reactionComponentVisibility=");
            sb.append(this.reactionComponentVisibility);
            sb.append(", transitionState=");
            sb.append(this.transitionState);
            sb.append(", selectedReaction=");
            sb.append(this.selectedReaction);
            sb.append(", teamHelpVisibility=");
            sb.append(this.teamHelpVisibility);
            sb.append(", shouldScrollToBottom=");
            return AbstractC0455a.m2243r(sb, this.shouldScrollToBottom, ')');
        }

        public /* synthetic */ ReactionState(int i, int i2, Reaction reaction, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i4 & 4) != 0 ? Reaction.None : reaction, i3, z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÇ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00103\u001a\u00020\u0007H×\u0001J\t\u00104\u001a\u00020\fH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "conversationState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "subtitleText", "", "messageButtonText", "messageButtonIcon", "messageButtonColor", "metricPlace", "", "metricContext", "isFromSearchBrowse", "", "ctaData", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)V", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getConversationState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "getSubtitleText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageButtonText", "()I", "getMessageButtonIcon", "getMessageButtonColor", "getMetricPlace", "()Ljava/lang/String;", "getMetricContext", "()Z", "getCtaData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "equals", "other", "hashCode", "toString", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class TeamPresenceState {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final TeamPresenceState defaultTeamPresenceState = new TeamPresenceState(null, null, Integer.valueOf(C5101R.string.intercom_the_team_can_help_if_needed), C5101R.string.intercom_send_us_a_message, C5101R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, null, 512, null);

        @Nullable
        private final ArticleMetadata articleMetadata;

        @Nullable
        private final ConversationState conversationState;

        @Nullable
        private final OpenMessengerResponse.NewConversationData.Cta ctaData;
        private final boolean isFromSearchBrowse;
        private final int messageButtonColor;
        private final int messageButtonIcon;
        private final int messageButtonText;

        @NotNull
        private final String metricContext;

        @NotNull
        private final String metricPlace;

        @Nullable
        private final Integer subtitleText;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState$Companion;", "", "<init>", "()V", "defaultTeamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getDefaultTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final TeamPresenceState getDefaultTeamPresenceState() {
                return TeamPresenceState.access$getDefaultTeamPresenceState$cp();
            }

            private Companion() {
            }
        }

        public TeamPresenceState(@Nullable ArticleMetadata articleMetadata, @Nullable ConversationState conversationState, @StringRes @Nullable Integer num, @StringRes int i, @DrawableRes int i2, @ColorInt int i3, @NotNull String metricPlace, @NotNull String metricContext, boolean z2, @Nullable OpenMessengerResponse.NewConversationData.Cta cta) {
            Intrinsics.m18599g(metricPlace, "metricPlace");
            Intrinsics.m18599g(metricContext, "metricContext");
            this.articleMetadata = articleMetadata;
            this.conversationState = conversationState;
            this.subtitleText = num;
            this.messageButtonText = i;
            this.messageButtonIcon = i2;
            this.messageButtonColor = i3;
            this.metricPlace = metricPlace;
            this.metricContext = metricContext;
            this.isFromSearchBrowse = z2;
            this.ctaData = cta;
        }

        public static final /* synthetic */ TeamPresenceState access$getDefaultTeamPresenceState$cp() {
            return defaultTeamPresenceState;
        }

        public static /* synthetic */ TeamPresenceState copy$default(TeamPresenceState teamPresenceState, ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z2, OpenMessengerResponse.NewConversationData.Cta cta, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                articleMetadata = teamPresenceState.articleMetadata;
            }
            if ((i4 & 2) != 0) {
                conversationState = teamPresenceState.conversationState;
            }
            if ((i4 & 4) != 0) {
                num = teamPresenceState.subtitleText;
            }
            if ((i4 & 8) != 0) {
                i = teamPresenceState.messageButtonText;
            }
            if ((i4 & 16) != 0) {
                i2 = teamPresenceState.messageButtonIcon;
            }
            if ((i4 & 32) != 0) {
                i3 = teamPresenceState.messageButtonColor;
            }
            if ((i4 & 64) != 0) {
                str = teamPresenceState.metricPlace;
            }
            if ((i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                str2 = teamPresenceState.metricContext;
            }
            if ((i4 & 256) != 0) {
                z2 = teamPresenceState.isFromSearchBrowse;
            }
            if ((i4 & 512) != 0) {
                cta = teamPresenceState.ctaData;
            }
            boolean z3 = z2;
            OpenMessengerResponse.NewConversationData.Cta cta2 = cta;
            String str3 = str;
            String str4 = str2;
            int i5 = i2;
            int i6 = i3;
            return teamPresenceState.copy(articleMetadata, conversationState, num, i, i5, i6, str3, str4, z3, cta2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getMetricContext() {
            return this.metricContext;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public final TeamPresenceState copy(@Nullable ArticleMetadata articleMetadata, @Nullable ConversationState conversationState, @StringRes @Nullable Integer subtitleText, @StringRes int messageButtonText, @DrawableRes int messageButtonIcon, @ColorInt int messageButtonColor, @NotNull String metricPlace, @NotNull String metricContext, boolean isFromSearchBrowse, @Nullable OpenMessengerResponse.NewConversationData.Cta ctaData) {
            Intrinsics.m18599g(metricPlace, "metricPlace");
            Intrinsics.m18599g(metricContext, "metricContext");
            return new TeamPresenceState(articleMetadata, conversationState, subtitleText, messageButtonText, messageButtonIcon, messageButtonColor, metricPlace, metricContext, isFromSearchBrowse, ctaData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TeamPresenceState)) {
                return false;
            }
            TeamPresenceState teamPresenceState = (TeamPresenceState) other;
            return Intrinsics.m18594b(this.articleMetadata, teamPresenceState.articleMetadata) && Intrinsics.m18594b(this.conversationState, teamPresenceState.conversationState) && Intrinsics.m18594b(this.subtitleText, teamPresenceState.subtitleText) && this.messageButtonText == teamPresenceState.messageButtonText && this.messageButtonIcon == teamPresenceState.messageButtonIcon && this.messageButtonColor == teamPresenceState.messageButtonColor && Intrinsics.m18594b(this.metricPlace, teamPresenceState.metricPlace) && Intrinsics.m18594b(this.metricContext, teamPresenceState.metricContext) && this.isFromSearchBrowse == teamPresenceState.isFromSearchBrowse && Intrinsics.m18594b(this.ctaData, teamPresenceState.ctaData);
        }

        @Nullable
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        @Nullable
        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        @Nullable
        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        @NotNull
        public final String getMetricContext() {
            return this.metricContext;
        }

        @NotNull
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Nullable
        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        public int hashCode() {
            ArticleMetadata articleMetadata = this.articleMetadata;
            int iHashCode = (articleMetadata == null ? 0 : articleMetadata.hashCode()) * 31;
            ConversationState conversationState = this.conversationState;
            int iHashCode2 = (iHashCode + (conversationState == null ? 0 : conversationState.hashCode())) * 31;
            Integer num = this.subtitleText;
            int iM2230e = AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2228c(this.messageButtonColor, AbstractC0455a.m2228c(this.messageButtonIcon, AbstractC0455a.m2228c(this.messageButtonText, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31, this.metricPlace), 31, this.metricContext), 31, this.isFromSearchBrowse);
            OpenMessengerResponse.NewConversationData.Cta cta = this.ctaData;
            return iM2230e + (cta != null ? cta.hashCode() : 0);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public String toString() {
            return "TeamPresenceState(articleMetadata=" + this.articleMetadata + ", conversationState=" + this.conversationState + ", subtitleText=" + this.subtitleText + ", messageButtonText=" + this.messageButtonText + ", messageButtonIcon=" + this.messageButtonIcon + ", messageButtonColor=" + this.messageButtonColor + ", metricPlace=" + this.metricPlace + ", metricContext=" + this.metricContext + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", ctaData=" + this.ctaData + ')';
        }

        public /* synthetic */ TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z2, OpenMessengerResponse.NewConversationData.Cta cta, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(articleMetadata, conversationState, num, i, i2, i3, str, str2, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? null : cta);
        }
    }
}
