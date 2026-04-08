package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.p032m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.p041ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0001KB«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b:J\u0010\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b<J\u0010\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b>J\u0010\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b@J\u0010\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\bBJ¼\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012HÇ\u0001¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020\f2\b\u0010G\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010H\u001a\u00020\u0005H×\u0001J\t\u0010I\u001a\u00020JH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)¨\u0006L"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "", "title", "Lio/intercom/android/sdk/ui/common/StringProvider;", "navIcon", "", "subTitle", "subTitleLeadingIcon", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "displayActiveIndicator", "", "ticketStatusState", "Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "headerMenuItems", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColorDark", "contentColor", "contentColorDark", "subTitleColor", "subTitleColorDark", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getNavIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubTitle", "getSubTitleLeadingIcon", "getAvatars", "()Ljava/util/List;", "getDisplayActiveIndicator", "()Z", "getTicketStatusState", "()Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "getHeaderMenuItems", "getBackgroundColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getBackgroundColorDark-QN2ZGVo", "getContentColor-QN2ZGVo", "getContentColorDark-QN2ZGVo", "getSubTitleColor-QN2ZGVo", "getSubTitleColorDark-QN2ZGVo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component9-QN2ZGVo", "component10", "component10-QN2ZGVo", "component11", "component11-QN2ZGVo", "component12", "component12-QN2ZGVo", "component13", "component13-QN2ZGVo", "component14", "component14-QN2ZGVo", "copy", "copy-nf2GS8Y", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;)Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "equals", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class TopAppBarUiState {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private static final TopAppBarUiState f59579default;

    @NotNull
    private final List<AvatarWrapper> avatars;

    @Nullable
    private final Color backgroundColor;

    @Nullable
    private final Color backgroundColorDark;

    @Nullable
    private final Color contentColor;

    @Nullable
    private final Color contentColorDark;
    private final boolean displayActiveIndicator;

    @NotNull
    private final List<HeaderMenuItem> headerMenuItems;

    @Nullable
    private final Integer navIcon;

    @Nullable
    private final StringProvider subTitle;

    @Nullable
    private final Color subTitleColor;

    @Nullable
    private final Color subTitleColorDark;

    @Nullable
    private final Integer subTitleLeadingIcon;

    @Nullable
    private final TicketProgressRowState ticketStatusState;

    @NotNull
    private final StringProvider title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState$Companion;", "", "<init>", "()V", "default", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getDefault", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TopAppBarUiState getDefault() {
            return TopAppBarUiState.access$getDefault$cp();
        }

        private Companion() {
        }
    }

    static {
        StringProvider.ActualString actualString = new StringProvider.ActualString("");
        EmptyList emptyList = EmptyList.f51496a;
        f59579default = new TopAppBarUiState(actualString, null, null, null, emptyList, false, null, emptyList, null, null, null, null, null, null, 16130, null);
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z2, TicketProgressRowState ticketProgressRowState, List list2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, num, stringProvider2, num2, list, z2, ticketProgressRowState, list2, color, color2, color3, color4, color5, color6);
    }

    public static final /* synthetic */ TopAppBarUiState access$getDefault$cp() {
        return f59579default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-nf2GS8Y$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarUiState m22176copynf2GS8Y$default(TopAppBarUiState topAppBarUiState, StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z2, TicketProgressRowState ticketProgressRowState, List list2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, int i, Object obj) {
        return topAppBarUiState.m22183copynf2GS8Y((i & 1) != 0 ? topAppBarUiState.title : stringProvider, (i & 2) != 0 ? topAppBarUiState.navIcon : num, (i & 4) != 0 ? topAppBarUiState.subTitle : stringProvider2, (i & 8) != 0 ? topAppBarUiState.subTitleLeadingIcon : num2, (i & 16) != 0 ? topAppBarUiState.avatars : list, (i & 32) != 0 ? topAppBarUiState.displayActiveIndicator : z2, (i & 64) != 0 ? topAppBarUiState.ticketStatusState : ticketProgressRowState, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? topAppBarUiState.headerMenuItems : list2, (i & 256) != 0 ? topAppBarUiState.backgroundColor : color, (i & 512) != 0 ? topAppBarUiState.backgroundColorDark : color2, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? topAppBarUiState.contentColor : color3, (i & 2048) != 0 ? topAppBarUiState.contentColorDark : color4, (i & 4096) != 0 ? topAppBarUiState.subTitleColor : color5, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? topAppBarUiState.subTitleColorDark : color6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StringProvider getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component11-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getContentColor() {
        return this.contentColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component12-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getContentColorDark() {
        return this.contentColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component13-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getSubTitleColor() {
        return this.subTitleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component14-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getSubTitleColorDark() {
        return this.subTitleColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    @NotNull
    public final List<AvatarWrapper> component5() {
        return this.avatars;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    @NotNull
    public final List<HeaderMenuItem> component8() {
        return this.headerMenuItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component9-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-nf2GS8Y, reason: not valid java name */
    public final TopAppBarUiState m22183copynf2GS8Y(@NotNull StringProvider title, @Nullable Integer navIcon, @Nullable StringProvider subTitle, @Nullable Integer subTitleLeadingIcon, @NotNull List<AvatarWrapper> avatars, boolean displayActiveIndicator, @Nullable TicketProgressRowState ticketStatusState, @NotNull List<? extends HeaderMenuItem> headerMenuItems, @Nullable Color backgroundColor, @Nullable Color backgroundColorDark, @Nullable Color contentColor, @Nullable Color contentColorDark, @Nullable Color subTitleColor, @Nullable Color subTitleColorDark) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(avatars, "avatars");
        Intrinsics.m18599g(headerMenuItems, "headerMenuItems");
        return new TopAppBarUiState(title, navIcon, subTitle, subTitleLeadingIcon, avatars, displayActiveIndicator, ticketStatusState, headerMenuItems, backgroundColor, backgroundColorDark, contentColor, contentColorDark, subTitleColor, subTitleColorDark, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarUiState)) {
            return false;
        }
        TopAppBarUiState topAppBarUiState = (TopAppBarUiState) other;
        return Intrinsics.m18594b(this.title, topAppBarUiState.title) && Intrinsics.m18594b(this.navIcon, topAppBarUiState.navIcon) && Intrinsics.m18594b(this.subTitle, topAppBarUiState.subTitle) && Intrinsics.m18594b(this.subTitleLeadingIcon, topAppBarUiState.subTitleLeadingIcon) && Intrinsics.m18594b(this.avatars, topAppBarUiState.avatars) && this.displayActiveIndicator == topAppBarUiState.displayActiveIndicator && Intrinsics.m18594b(this.ticketStatusState, topAppBarUiState.ticketStatusState) && Intrinsics.m18594b(this.headerMenuItems, topAppBarUiState.headerMenuItems) && Intrinsics.m18594b(this.backgroundColor, topAppBarUiState.backgroundColor) && Intrinsics.m18594b(this.backgroundColorDark, topAppBarUiState.backgroundColorDark) && Intrinsics.m18594b(this.contentColor, topAppBarUiState.contentColor) && Intrinsics.m18594b(this.contentColorDark, topAppBarUiState.contentColorDark) && Intrinsics.m18594b(this.subTitleColor, topAppBarUiState.subTitleColor) && Intrinsics.m18594b(this.subTitleColorDark, topAppBarUiState.subTitleColorDark);
    }

    @NotNull
    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    @Nullable
    /* JADX INFO: renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final Color m22184getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getBackgroundColorDark-QN2ZGVo, reason: not valid java name */
    public final Color m22185getBackgroundColorDarkQN2ZGVo() {
        return this.backgroundColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final Color m22186getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getContentColorDark-QN2ZGVo, reason: not valid java name */
    public final Color m22187getContentColorDarkQN2ZGVo() {
        return this.contentColorDark;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    @NotNull
    public final List<HeaderMenuItem> getHeaderMenuItems() {
        return this.headerMenuItems;
    }

    @Nullable
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    @Nullable
    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final Color m22188getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubTitleColorDark-QN2ZGVo, reason: not valid java name */
    public final Color m22189getSubTitleColorDarkQN2ZGVo() {
        return this.subTitleColorDark;
    }

    @Nullable
    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    @Nullable
    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    @NotNull
    public final StringProvider getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.navIcon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StringProvider stringProvider = this.subTitle;
        int iHashCode3 = (iHashCode2 + (stringProvider == null ? 0 : stringProvider.hashCode())) * 31;
        Integer num2 = this.subTitleLeadingIcon;
        int iM2230e = AbstractC0455a.m2230e(AbstractC0455a.m2233h(this.avatars, (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31, this.displayActiveIndicator);
        TicketProgressRowState ticketProgressRowState = this.ticketStatusState;
        int iM2233h = AbstractC0455a.m2233h(this.headerMenuItems, (iM2230e + (ticketProgressRowState == null ? 0 : ticketProgressRowState.hashCode())) * 31, 31);
        Color color = this.backgroundColor;
        int iHashCode4 = (iM2233h + (color == null ? 0 : Long.hashCode(color.f17585a))) * 31;
        Color color2 = this.backgroundColorDark;
        int iHashCode5 = (iHashCode4 + (color2 == null ? 0 : Long.hashCode(color2.f17585a))) * 31;
        Color color3 = this.contentColor;
        int iHashCode6 = (iHashCode5 + (color3 == null ? 0 : Long.hashCode(color3.f17585a))) * 31;
        Color color4 = this.contentColorDark;
        int iHashCode7 = (iHashCode6 + (color4 == null ? 0 : Long.hashCode(color4.f17585a))) * 31;
        Color color5 = this.subTitleColor;
        int iHashCode8 = (iHashCode7 + (color5 == null ? 0 : Long.hashCode(color5.f17585a))) * 31;
        Color color6 = this.subTitleColorDark;
        return iHashCode8 + (color6 != null ? Long.hashCode(color6.f17585a) : 0);
    }

    @NotNull
    public String toString() {
        return "TopAppBarUiState(title=" + this.title + ", navIcon=" + this.navIcon + ", subTitle=" + this.subTitle + ", subTitleLeadingIcon=" + this.subTitleLeadingIcon + ", avatars=" + this.avatars + ", displayActiveIndicator=" + this.displayActiveIndicator + ", ticketStatusState=" + this.ticketStatusState + ", headerMenuItems=" + this.headerMenuItems + ", backgroundColor=" + this.backgroundColor + ", backgroundColorDark=" + this.backgroundColorDark + ", contentColor=" + this.contentColor + ", contentColorDark=" + this.contentColorDark + ", subTitleColor=" + this.subTitleColor + ", subTitleColorDark=" + this.subTitleColorDark + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TopAppBarUiState(StringProvider title, Integer num, StringProvider stringProvider, Integer num2, List<AvatarWrapper> avatars, boolean z2, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> headerMenuItems, Color color, Color color2, Color color3, Color color4, Color color5, Color color6) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(avatars, "avatars");
        Intrinsics.m18599g(headerMenuItems, "headerMenuItems");
        this.title = title;
        this.navIcon = num;
        this.subTitle = stringProvider;
        this.subTitleLeadingIcon = num2;
        this.avatars = avatars;
        this.displayActiveIndicator = z2;
        this.ticketStatusState = ticketProgressRowState;
        this.headerMenuItems = headerMenuItems;
        this.backgroundColor = color;
        this.backgroundColorDark = color2;
        this.contentColor = color3;
        this.contentColorDark = color4;
        this.subTitleColor = color5;
        this.subTitleColorDark = color6;
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z2, TicketProgressRowState ticketProgressRowState, List list2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, (i & 2) != 0 ? null : num, stringProvider2, num2, list, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : ticketProgressRowState, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? EmptyList.f51496a : list2, (i & 256) != 0 ? null : color, (i & 512) != 0 ? null : color2, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : color3, (i & 2048) != 0 ? null : color4, (i & 4096) != 0 ? null : color5, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : color6, null);
    }
}
