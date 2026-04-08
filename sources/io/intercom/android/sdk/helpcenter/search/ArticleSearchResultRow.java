package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "", "<init>", "()V", "ArticleResultRow", "TeammateHelpRow", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ArticleSearchResultRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class TeammateHelpRow extends ArticleSearchResultRow {
        public static final int $stable = 0;

        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeammateHelpRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ TeammateHelpRow copy$default(TeammateHelpRow teammateHelpRow, ArticleViewState.TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                teamPresenceState = teammateHelpRow.teamPresenceState;
            }
            return teammateHelpRow.copy(teamPresenceState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @NotNull
        public final TeammateHelpRow copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            return new TeammateHelpRow(teamPresenceState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TeammateHelpRow) && Intrinsics.m18594b(this.teamPresenceState, ((TeammateHelpRow) other).teamPresenceState);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        @NotNull
        public String toString() {
            return "TeammateHelpRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ ArticleSearchResultRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0007H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "id", "", "titleText", "summaryText", "summaryVisibility", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getTitleText", "getSummaryText", "getSummaryVisibility", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ArticleResultRow extends ArticleSearchResultRow {
        public static final int $stable = 0;

        @NotNull
        private final String id;

        @NotNull
        private final String summaryText;
        private final int summaryVisibility;

        @NotNull
        private final String titleText;

        public /* synthetic */ ArticleResultRow(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 8 : i);
        }

        public static /* synthetic */ ArticleResultRow copy$default(ArticleResultRow articleResultRow, String str, String str2, String str3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = articleResultRow.id;
            }
            if ((i2 & 2) != 0) {
                str2 = articleResultRow.titleText;
            }
            if ((i2 & 4) != 0) {
                str3 = articleResultRow.summaryText;
            }
            if ((i2 & 8) != 0) {
                i = articleResultRow.summaryVisibility;
            }
            return articleResultRow.copy(str, str2, str3, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSummaryText() {
            return this.summaryText;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getSummaryVisibility() {
            return this.summaryVisibility;
        }

        @NotNull
        public final ArticleResultRow copy(@NotNull String id, @NotNull String titleText, @NotNull String summaryText, int summaryVisibility) {
            Intrinsics.m18599g(id, "id");
            Intrinsics.m18599g(titleText, "titleText");
            Intrinsics.m18599g(summaryText, "summaryText");
            return new ArticleResultRow(id, titleText, summaryText, summaryVisibility);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArticleResultRow)) {
                return false;
            }
            ArticleResultRow articleResultRow = (ArticleResultRow) other;
            return Intrinsics.m18594b(this.id, articleResultRow.id) && Intrinsics.m18594b(this.titleText, articleResultRow.titleText) && Intrinsics.m18594b(this.summaryText, articleResultRow.summaryText) && this.summaryVisibility == articleResultRow.summaryVisibility;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getSummaryText() {
            return this.summaryText;
        }

        public final int getSummaryVisibility() {
            return this.summaryVisibility;
        }

        @NotNull
        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return Integer.hashCode(this.summaryVisibility) + AbstractC0000a.m5b(AbstractC0000a.m5b(this.id.hashCode() * 31, 31, this.titleText), 31, this.summaryText);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ArticleResultRow(id=");
            sb.append(this.id);
            sb.append(", titleText=");
            sb.append(this.titleText);
            sb.append(", summaryText=");
            sb.append(this.summaryText);
            sb.append(", summaryVisibility=");
            return AbstractC0000a.m17n(sb, this.summaryVisibility, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleResultRow(@NotNull String id, @NotNull String titleText, @NotNull String summaryText, int i) {
            super(null);
            Intrinsics.m18599g(id, "id");
            Intrinsics.m18599g(titleText, "titleText");
            Intrinsics.m18599g(summaryText, "summaryText");
            this.id = id;
            this.titleText = titleText;
            this.summaryText = summaryText;
            this.summaryVisibility = i;
        }
    }

    private ArticleSearchResultRow() {
    }
}
