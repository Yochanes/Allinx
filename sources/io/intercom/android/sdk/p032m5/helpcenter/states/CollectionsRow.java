package io.intercom.android.sdk.p032m5.helpcenter.states;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "", "<init>", "()V", "CollectionRow", "FullHelpCenterRow", "BrowseAllHelpTopicsAsListRow", "SendMessageRow", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$BrowseAllHelpTopicsAsListRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$CollectionRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$FullHelpCenterRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$SendMessageRow;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class CollectionsRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$BrowseAllHelpTopicsAsListRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class BrowseAllHelpTopicsAsListRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        public static final BrowseAllHelpTopicsAsListRow INSTANCE = new BrowseAllHelpTopicsAsListRow();

        private BrowseAllHelpTopicsAsListRow() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof BrowseAllHelpTopicsAsListRow);
        }

        public int hashCode() {
            return 164025713;
        }

        @NotNull
        public String toString() {
            return "BrowseAllHelpTopicsAsListRow";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$CollectionRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "rowData", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;", "<init>", "(Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;)V", "getRowData", "()Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class CollectionRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        private final CollectionRowData rowData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionRow(@NotNull CollectionRowData rowData) {
            super(null);
            Intrinsics.m18599g(rowData, "rowData");
            this.rowData = rowData;
        }

        public static /* synthetic */ CollectionRow copy$default(CollectionRow collectionRow, CollectionRowData collectionRowData, int i, Object obj) {
            if ((i & 1) != 0) {
                collectionRowData = collectionRow.rowData;
            }
            return collectionRow.copy(collectionRowData);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CollectionRowData getRowData() {
            return this.rowData;
        }

        @NotNull
        public final CollectionRow copy(@NotNull CollectionRowData rowData) {
            Intrinsics.m18599g(rowData, "rowData");
            return new CollectionRow(rowData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CollectionRow) && Intrinsics.m18594b(this.rowData, ((CollectionRow) other).rowData);
        }

        @NotNull
        public final CollectionRowData getRowData() {
            return this.rowData;
        }

        public int hashCode() {
            return this.rowData.hashCode();
        }

        @NotNull
        public String toString() {
            return "CollectionRow(rowData=" + this.rowData + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$FullHelpCenterRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class FullHelpCenterRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FullHelpCenterRow);
        }

        public int hashCode() {
            return 788964466;
        }

        @NotNull
        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$SendMessageRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class SendMessageRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessageRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ SendMessageRow copy$default(SendMessageRow sendMessageRow, ArticleViewState.TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                teamPresenceState = sendMessageRow.teamPresenceState;
            }
            return sendMessageRow.copy(teamPresenceState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @NotNull
        public final SendMessageRow copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.m18599g(teamPresenceState, "teamPresenceState");
            return new SendMessageRow(teamPresenceState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendMessageRow) && Intrinsics.m18594b(this.teamPresenceState, ((SendMessageRow) other).teamPresenceState);
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
            return "SendMessageRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ CollectionsRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectionsRow() {
    }
}
