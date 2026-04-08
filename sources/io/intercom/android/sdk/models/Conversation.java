package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020D0CJ\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0007J\f\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u0007J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020FJ\u0006\u0010K\u001a\u00020FJ\u0006\u0010L\u001a\u00020DJ\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010R\u001a\u00020\rHÆ\u0003J\t\u0010S\u001a\u00020\u000fHÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010Z\u001a\u00020\u0018HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jñ\u0001\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010b\u001a\u00020\u00052\b\u0010c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010d\u001a\u00020eH×\u0001J\t\u0010f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010'R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&¨\u0006g"}, m18302d2 = {"Lio/intercom/android/sdk/models/Conversation;", "", "id", "", "isRead", "", "participantBuilderList", "", "Lio/intercom/android/sdk/models/Participant$Builder;", "partBuilderList", "Lio/intercom/android/sdk/models/Part$Builder;", "groupConversationParticipantIds", "lastParticipatingAdminBuilder", "Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "composerState", "Lio/intercom/android/sdk/models/ComposerState;", "preventEndUserReplies", "inboundConversationsDisabled", "notificationStatus", "state", "isInbound", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "uiFlags", "Lio/intercom/android/sdk/models/ConversationUiFlags;", "header", "Lio/intercom/android/sdk/models/Header;", "conversationEndedButton", "Lio/intercom/android/sdk/models/ConversationEndedButton;", "footerNotice", "Lio/intercom/android/sdk/models/FooterNotice;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "teamIntro", "specialNotice", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;Lio/intercom/android/sdk/models/ComposerState;ZZLjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/Ticket;Lio/intercom/android/sdk/models/ConversationUiFlags;Lio/intercom/android/sdk/models/Header;Lio/intercom/android/sdk/models/ConversationEndedButton;Lio/intercom/android/sdk/models/FooterNotice;Lio/intercom/android/sdk/models/PoweredBy;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getParticipantBuilderList", "()Ljava/util/List;", "getPartBuilderList", "getGroupConversationParticipantIds", "getLastParticipatingAdminBuilder", "()Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "getComposerState", "()Lio/intercom/android/sdk/models/ComposerState;", "getPreventEndUserReplies", "getInboundConversationsDisabled", "getNotificationStatus", "getState", "getTicket", "()Lio/intercom/android/sdk/models/Ticket;", "getUiFlags", "()Lio/intercom/android/sdk/models/ConversationUiFlags;", "getHeader", "()Lio/intercom/android/sdk/models/Header;", "getConversationEndedButton", "()Lio/intercom/android/sdk/models/ConversationEndedButton;", "getFooterNotice", "()Lio/intercom/android/sdk/models/FooterNotice;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getTeamIntro", "getSpecialNotice", "getParticipants", "", "Lio/intercom/android/sdk/models/Participant;", "parts", "Lio/intercom/android/sdk/models/Part;", "groupConversationParticipants", "lastParticipatingAdmin", "Lio/intercom/android/sdk/models/LastParticipatingAdmin;", "lastPart", "getLastAdminPart", "lastAdmin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class Conversation {
    public static final int $stable = 8;

    @SerializedName("composer_state")
    @NotNull
    private final ComposerState composerState;

    @SerializedName("conversation_ended_button")
    @Nullable
    private final ConversationEndedButton conversationEndedButton;

    @SerializedName("footer_notice")
    @Nullable
    private final FooterNotice footerNotice;

    @SerializedName("group_conversation_participant_ids")
    @NotNull
    private final List<String> groupConversationParticipantIds;

    @Nullable
    private final Header header;

    @NotNull
    private final String id;

    @SerializedName("inbound_conversations_disabled")
    private final boolean inboundConversationsDisabled;

    @SerializedName("is_inbound")
    private final boolean isInbound;

    @SerializedName("read")
    private final boolean isRead;

    @SerializedName("last_participating_admin")
    @NotNull
    private final LastParticipatingAdmin.Builder lastParticipatingAdminBuilder;

    @SerializedName("notification_status")
    @NotNull
    private final String notificationStatus;

    @SerializedName("conversation_parts")
    @NotNull
    private final List<Part.Builder> partBuilderList;

    @SerializedName("participants")
    @NotNull
    private final List<Participant.Builder> participantBuilderList;

    @SerializedName("powered_by")
    @Nullable
    private final PoweredBy poweredBy;

    @SerializedName("prevent_end_user_replies")
    private final boolean preventEndUserReplies;

    @SerializedName("special_notice")
    @Nullable
    private final String specialNotice;

    @NotNull
    private final String state;

    @SerializedName("team_intro")
    @Nullable
    private final String teamIntro;

    @Nullable
    private final Ticket ticket;

    @SerializedName("ui_flags")
    @NotNull
    private final ConversationUiFlags uiFlags;

    public Conversation() {
        this(null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048575, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, boolean z2, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z3, boolean z4, String str2, String str3, boolean z5, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        String str8 = (i & 1) != 0 ? conversation.id : str;
        boolean z6 = (i & 2) != 0 ? conversation.isRead : z2;
        List list4 = (i & 4) != 0 ? conversation.participantBuilderList : list;
        List list5 = (i & 8) != 0 ? conversation.partBuilderList : list2;
        List list6 = (i & 16) != 0 ? conversation.groupConversationParticipantIds : list3;
        LastParticipatingAdmin.Builder builder2 = (i & 32) != 0 ? conversation.lastParticipatingAdminBuilder : builder;
        ComposerState composerState2 = (i & 64) != 0 ? conversation.composerState : composerState;
        boolean z7 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? conversation.preventEndUserReplies : z3;
        boolean z8 = (i & 256) != 0 ? conversation.inboundConversationsDisabled : z4;
        String str9 = (i & 512) != 0 ? conversation.notificationStatus : str2;
        String str10 = (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? conversation.state : str3;
        boolean z9 = (i & 2048) != 0 ? conversation.isInbound : z5;
        Ticket ticket2 = (i & 4096) != 0 ? conversation.ticket : ticket;
        ConversationUiFlags conversationUiFlags2 = (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? conversation.uiFlags : conversationUiFlags;
        String str11 = str8;
        Header header2 = (i & 16384) != 0 ? conversation.header : header;
        ConversationEndedButton conversationEndedButton2 = (i & 32768) != 0 ? conversation.conversationEndedButton : conversationEndedButton;
        FooterNotice footerNotice2 = (i & 65536) != 0 ? conversation.footerNotice : footerNotice;
        PoweredBy poweredBy2 = (i & 131072) != 0 ? conversation.poweredBy : poweredBy;
        String str12 = (i & 262144) != 0 ? conversation.teamIntro : str4;
        if ((i & 524288) != 0) {
            str7 = str12;
            str6 = conversation.specialNotice;
        } else {
            str6 = str5;
            str7 = str12;
        }
        return conversation.copy(str11, z6, list4, list5, list6, builder2, composerState2, z7, z8, str9, str10, z9, ticket2, conversationUiFlags2, header2, conversationEndedButton2, footerNotice2, poweredBy2, str7, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsInbound() {
        return this.isInbound;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Ticket getTicket() {
        return this.ticket;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTeamIntro() {
        return this.teamIntro;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    @NotNull
    public final List<Participant.Builder> component3() {
        return this.participantBuilderList;
    }

    @NotNull
    public final List<Part.Builder> component4() {
        return this.partBuilderList;
    }

    @NotNull
    public final List<String> component5() {
        return this.groupConversationParticipantIds;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    @NotNull
    public final Conversation copy(@NotNull String id, boolean isRead, @NotNull List<Participant.Builder> participantBuilderList, @NotNull List<Part.Builder> partBuilderList, @NotNull List<String> groupConversationParticipantIds, @NotNull LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, @NotNull ComposerState composerState, boolean preventEndUserReplies, boolean inboundConversationsDisabled, @NotNull String notificationStatus, @NotNull String state, boolean isInbound, @Nullable Ticket ticket, @NotNull ConversationUiFlags uiFlags, @Nullable Header header, @Nullable ConversationEndedButton conversationEndedButton, @Nullable FooterNotice footerNotice, @Nullable PoweredBy poweredBy, @Nullable String teamIntro, @Nullable String specialNotice) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(participantBuilderList, "participantBuilderList");
        Intrinsics.m18599g(partBuilderList, "partBuilderList");
        Intrinsics.m18599g(groupConversationParticipantIds, "groupConversationParticipantIds");
        Intrinsics.m18599g(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        Intrinsics.m18599g(composerState, "composerState");
        Intrinsics.m18599g(notificationStatus, "notificationStatus");
        Intrinsics.m18599g(state, "state");
        Intrinsics.m18599g(uiFlags, "uiFlags");
        return new Conversation(id, isRead, participantBuilderList, partBuilderList, groupConversationParticipantIds, lastParticipatingAdminBuilder, composerState, preventEndUserReplies, inboundConversationsDisabled, notificationStatus, state, isInbound, ticket, uiFlags, header, conversationEndedButton, footerNotice, poweredBy, teamIntro, specialNotice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) other;
        return Intrinsics.m18594b(this.id, conversation.id) && this.isRead == conversation.isRead && Intrinsics.m18594b(this.participantBuilderList, conversation.participantBuilderList) && Intrinsics.m18594b(this.partBuilderList, conversation.partBuilderList) && Intrinsics.m18594b(this.groupConversationParticipantIds, conversation.groupConversationParticipantIds) && Intrinsics.m18594b(this.lastParticipatingAdminBuilder, conversation.lastParticipatingAdminBuilder) && Intrinsics.m18594b(this.composerState, conversation.composerState) && this.preventEndUserReplies == conversation.preventEndUserReplies && this.inboundConversationsDisabled == conversation.inboundConversationsDisabled && Intrinsics.m18594b(this.notificationStatus, conversation.notificationStatus) && Intrinsics.m18594b(this.state, conversation.state) && this.isInbound == conversation.isInbound && Intrinsics.m18594b(this.ticket, conversation.ticket) && Intrinsics.m18594b(this.uiFlags, conversation.uiFlags) && Intrinsics.m18594b(this.header, conversation.header) && Intrinsics.m18594b(this.conversationEndedButton, conversation.conversationEndedButton) && Intrinsics.m18594b(this.footerNotice, conversation.footerNotice) && Intrinsics.m18594b(this.poweredBy, conversation.poweredBy) && Intrinsics.m18594b(this.teamIntro, conversation.teamIntro) && Intrinsics.m18594b(this.specialNotice, conversation.specialNotice);
    }

    @NotNull
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    @Nullable
    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    @Nullable
    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    @NotNull
    public final List<String> getGroupConversationParticipantIds() {
        return this.groupConversationParticipantIds;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    @NotNull
    public final Part getLastAdminPart() {
        Part partPrevious;
        List<Part> listParts = parts();
        ListIterator<Part> listIterator = listParts.listIterator(listParts.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                partPrevious = null;
                break;
            }
            partPrevious = listIterator.previous();
            if (partPrevious.isAdmin()) {
                break;
            }
        }
        Part part = partPrevious;
        if (part != null) {
            return part;
        }
        Part NULL = Part.NULL;
        Intrinsics.m18598f(NULL, "NULL");
        return NULL;
    }

    @NotNull
    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    @NotNull
    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    @NotNull
    public final List<Part.Builder> getPartBuilderList() {
        return this.partBuilderList;
    }

    @NotNull
    public final List<Participant.Builder> getParticipantBuilderList() {
        return this.participantBuilderList;
    }

    @NotNull
    public final Map<String, Participant> getParticipants() {
        List<Participant.Builder> list = this.participantBuilderList;
        int iM18484g = MapsKt.m18484g(CollectionsKt.m18452r(list, 10));
        if (iM18484g < 16) {
            iM18484g = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g);
        for (Participant.Builder builder : list) {
            linkedHashMap.put(builder.build().getId(), builder.build());
        }
        return linkedHashMap;
    }

    @Nullable
    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    @Nullable
    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getTeamIntro() {
        return this.teamIntro;
    }

    @Nullable
    public final Ticket getTicket() {
        return this.ticket;
    }

    @NotNull
    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    @NotNull
    public final List<Participant> groupConversationParticipants() {
        List<String> list = this.groupConversationParticipantIds;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Participant participant = getParticipants().get((String) it.next());
            if (participant != null) {
                arrayList.add(participant);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int iM2230e = AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2230e(AbstractC0455a.m2230e((this.composerState.hashCode() + ((this.lastParticipatingAdminBuilder.hashCode() + AbstractC0455a.m2233h(this.groupConversationParticipantIds, AbstractC0455a.m2233h(this.partBuilderList, AbstractC0455a.m2233h(this.participantBuilderList, AbstractC0455a.m2230e(this.id.hashCode() * 31, 31, this.isRead), 31), 31), 31)) * 31)) * 31, 31, this.preventEndUserReplies), 31, this.inboundConversationsDisabled), 31, this.notificationStatus), 31, this.state), 31, this.isInbound);
        Ticket ticket = this.ticket;
        int iHashCode = (this.uiFlags.hashCode() + ((iM2230e + (ticket == null ? 0 : ticket.hashCode())) * 31)) * 31;
        Header header = this.header;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        ConversationEndedButton conversationEndedButton = this.conversationEndedButton;
        int iHashCode3 = (iHashCode2 + (conversationEndedButton == null ? 0 : conversationEndedButton.hashCode())) * 31;
        FooterNotice footerNotice = this.footerNotice;
        int iHashCode4 = (iHashCode3 + (footerNotice == null ? 0 : footerNotice.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int iHashCode5 = (iHashCode4 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31;
        String str = this.teamIntro;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.specialNotice;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isInbound() {
        return this.isInbound;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public final Participant lastAdmin() {
        Object obj = null;
        for (Object obj2 : getParticipants().values()) {
            if (((Participant) obj2).isAdmin()) {
                obj = obj2;
            }
        }
        Participant participant = (Participant) obj;
        if (participant != null) {
            return participant;
        }
        Participant NULL = Participant.NULL;
        Intrinsics.m18598f(NULL, "NULL");
        return NULL;
    }

    @NotNull
    public final Part lastPart() {
        Part part = (Part) CollectionsKt.m18412M(parts());
        if (part != null) {
            return part;
        }
        Part NULL = Part.NULL;
        Intrinsics.m18598f(NULL, "NULL");
        return NULL;
    }

    @NotNull
    public final LastParticipatingAdmin lastParticipatingAdmin() {
        LastParticipatingAdmin lastParticipatingAdminBuild = this.lastParticipatingAdminBuilder.build();
        Intrinsics.m18598f(lastParticipatingAdminBuild, "build(...)");
        return lastParticipatingAdminBuild;
    }

    @NotNull
    public final List<Part> parts() {
        List<Part.Builder> list = this.partBuilderList;
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Part partBuild = ((Part.Builder) it.next()).build();
            Participant participant = getParticipants().get(partBuild.getParticipantId());
            if (participant != null) {
                partBuild.setParticipant(participant);
            }
            arrayList.add(partBuild);
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Conversation(id=");
        sb.append(this.id);
        sb.append(", isRead=");
        sb.append(this.isRead);
        sb.append(", participantBuilderList=");
        sb.append(this.participantBuilderList);
        sb.append(", partBuilderList=");
        sb.append(this.partBuilderList);
        sb.append(", groupConversationParticipantIds=");
        sb.append(this.groupConversationParticipantIds);
        sb.append(", lastParticipatingAdminBuilder=");
        sb.append(this.lastParticipatingAdminBuilder);
        sb.append(", composerState=");
        sb.append(this.composerState);
        sb.append(", preventEndUserReplies=");
        sb.append(this.preventEndUserReplies);
        sb.append(", inboundConversationsDisabled=");
        sb.append(this.inboundConversationsDisabled);
        sb.append(", notificationStatus=");
        sb.append(this.notificationStatus);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", isInbound=");
        sb.append(this.isInbound);
        sb.append(", ticket=");
        sb.append(this.ticket);
        sb.append(", uiFlags=");
        sb.append(this.uiFlags);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", conversationEndedButton=");
        sb.append(this.conversationEndedButton);
        sb.append(", footerNotice=");
        sb.append(this.footerNotice);
        sb.append(", poweredBy=");
        sb.append(this.poweredBy);
        sb.append(", teamIntro=");
        sb.append(this.teamIntro);
        sb.append(", specialNotice=");
        return AbstractC0455a.m2241p(sb, this.specialNotice, ')');
    }

    public Conversation(@NotNull String id, boolean z2, @NotNull List<Participant.Builder> participantBuilderList, @NotNull List<Part.Builder> partBuilderList, @NotNull List<String> groupConversationParticipantIds, @NotNull LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, @NotNull ComposerState composerState, boolean z3, boolean z4, @NotNull String notificationStatus, @NotNull String state, boolean z5, @Nullable Ticket ticket, @NotNull ConversationUiFlags uiFlags, @Nullable Header header, @Nullable ConversationEndedButton conversationEndedButton, @Nullable FooterNotice footerNotice, @Nullable PoweredBy poweredBy, @Nullable String str, @Nullable String str2) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(participantBuilderList, "participantBuilderList");
        Intrinsics.m18599g(partBuilderList, "partBuilderList");
        Intrinsics.m18599g(groupConversationParticipantIds, "groupConversationParticipantIds");
        Intrinsics.m18599g(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        Intrinsics.m18599g(composerState, "composerState");
        Intrinsics.m18599g(notificationStatus, "notificationStatus");
        Intrinsics.m18599g(state, "state");
        Intrinsics.m18599g(uiFlags, "uiFlags");
        this.id = id;
        this.isRead = z2;
        this.participantBuilderList = participantBuilderList;
        this.partBuilderList = partBuilderList;
        this.groupConversationParticipantIds = groupConversationParticipantIds;
        this.lastParticipatingAdminBuilder = lastParticipatingAdminBuilder;
        this.composerState = composerState;
        this.preventEndUserReplies = z3;
        this.inboundConversationsDisabled = z4;
        this.notificationStatus = notificationStatus;
        this.state = state;
        this.isInbound = z5;
        this.ticket = ticket;
        this.uiFlags = uiFlags;
        this.header = header;
        this.conversationEndedButton = conversationEndedButton;
        this.footerNotice = footerNotice;
        this.poweredBy = poweredBy;
        this.teamIntro = str;
        this.specialNotice = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Conversation(String str, boolean z2, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z3, boolean z4, String str2, String str3, boolean z5, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i & 1) != 0 ? "" : str;
        boolean z6 = (i & 2) != 0 ? false : z2;
        int i2 = i & 4;
        List list4 = EmptyList.f51496a;
        this(str6, z6, i2 != 0 ? list4 : list, (i & 8) != 0 ? list4 : list2, (i & 16) == 0 ? list3 : list4, (i & 32) != 0 ? new LastParticipatingAdmin.Builder() : builder, (i & 64) != 0 ? ComposerState.INSTANCE.getNULL() : composerState, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? "" : str2, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 ? str3 : "", (i & 2048) == 0 ? z5 : false, (i & 4096) != 0 ? null : ticket, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? ConversationUiFlags.INSTANCE.getDEFAULT() : conversationUiFlags, (i & 16384) != 0 ? null : header, (i & 32768) != 0 ? null : conversationEndedButton, (i & 65536) != 0 ? null : footerNotice, (i & 131072) != 0 ? null : poweredBy, (i & 262144) != 0 ? null : str4, (i & 524288) != 0 ? null : str5);
    }
}
