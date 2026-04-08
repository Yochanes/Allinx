package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.p032m5.navigation.CreateTicketDestinationKt;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b3\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0004HIJKB±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010A\u001a\u00020\u0019HÆ\u0003J¸\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÇ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010F\u001a\u00020\u0010H×\u0001J\t\u0010G\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0016\u0010/R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006L"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket;", "", "id", "", "publicId", "title", "description", "iconUrl", "emoji", "currentStatus", "Lio/intercom/android/sdk/models/Ticket$Status;", "statusList", "", "attributes", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "ticketTypeId", "", "assignee", "Lio/intercom/android/sdk/models/Participant$Builder;", "conversationId", "conversationButton", "Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "isRead", "", "latestStatusUpdatedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;ILio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)V", "getId", "()Ljava/lang/String;", "getPublicId", "getTitle", "getDescription", "getIconUrl", "getEmoji", "getCurrentStatus", "()Lio/intercom/android/sdk/models/Ticket$Status;", "getStatusList", "()Ljava/util/List;", "getAttributes", "getTicketTypeId", "()I", "getAssignee", "()Lio/intercom/android/sdk/models/Participant$Builder;", "getConversationId", "getConversationButton", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLatestStatusUpdatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;ILio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)Lio/intercom/android/sdk/models/Ticket;", "equals", "other", "hashCode", "toString", "Status", "TicketAttribute", "ConversationButton", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class Ticket {

    @SerializedName("assignee")
    @NotNull
    private final Participant.Builder assignee;

    @SerializedName("attributes")
    @NotNull
    private final List<TicketAttribute> attributes;

    @SerializedName("conversation_button")
    @Nullable
    private final ConversationButton conversationButton;

    @SerializedName(CreateTicketDestinationKt.CONVERSATION_ID)
    @Nullable
    private final String conversationId;

    @SerializedName("current_status")
    @NotNull
    private final Status currentStatus;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("emoji")
    @NotNull
    private final String emoji;

    @SerializedName("icon_url")
    @NotNull
    private final String iconUrl;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("read")
    @Nullable
    private final Boolean isRead;

    @SerializedName("latest_status_updated_at")
    private final long latestStatusUpdatedAt;

    @SerializedName("public_ticket_id")
    @Nullable
    private final String publicId;

    @SerializedName("status_list")
    @NotNull
    private final List<Status> statusList;

    @SerializedName(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Ticket NULL = new Ticket(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, 32767, null);

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/Ticket;", "getNULL", "()Lio/intercom/android/sdk/models/Ticket;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Ticket getNULL() {
            return Ticket.access$getNULL$cp();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @kotlin.Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "", "icon", "Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", AttributeType.TEXT, "", "<init>", "(Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;Ljava/lang/String;)V", "getIcon", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "IconType", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ConversationButton {
        public static final int $stable = 0;

        @SerializedName("icon")
        @Nullable
        private final IconType icon;

        @SerializedName(AttributeType.TEXT)
        @NotNull
        private final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: Proguard */
        @kotlin.Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "", "<init>", "(Ljava/lang/String;I)V", "SEND", "CONVERSATION", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class IconType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IconType[] $VALUES;

            @SerializedName("send")
            public static final IconType SEND = new IconType("SEND", 0);

            @SerializedName("conversation")
            public static final IconType CONVERSATION = new IconType("CONVERSATION", 1);

            private static final /* synthetic */ IconType[] $values() {
                return new IconType[]{SEND, CONVERSATION};
            }

            static {
                IconType[] iconTypeArr$values = $values();
                $VALUES = iconTypeArr$values;
                $ENTRIES = EnumEntriesKt.m18563a(iconTypeArr$values);
            }

            private IconType(String str, int i) {
            }

            @NotNull
            public static EnumEntries<IconType> getEntries() {
                return $ENTRIES;
            }

            public static IconType valueOf(String str) {
                return (IconType) Enum.valueOf(IconType.class, str);
            }

            public static IconType[] values() {
                return (IconType[]) $VALUES.clone();
            }
        }

        public ConversationButton(@Nullable IconType iconType, @NotNull String text) {
            Intrinsics.m18599g(text, "text");
            this.icon = iconType;
            this.text = text;
        }

        public static /* synthetic */ ConversationButton copy$default(ConversationButton conversationButton, IconType iconType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconType = conversationButton.icon;
            }
            if ((i & 2) != 0) {
                str = conversationButton.text;
            }
            return conversationButton.copy(iconType, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IconType getIcon() {
            return this.icon;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final ConversationButton copy(@Nullable IconType icon, @NotNull String text) {
            Intrinsics.m18599g(text, "text");
            return new ConversationButton(icon, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) other;
            return this.icon == conversationButton.icon && Intrinsics.m18594b(this.text, conversationButton.text);
        }

        @Nullable
        public final IconType getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            IconType iconType = this.icon;
            return this.text.hashCode() + ((iconType == null ? 0 : iconType.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ConversationButton(icon=");
            sb.append(this.icon);
            sb.append(", text=");
            return AbstractC0455a.m2241p(sb, this.text, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @kotlin.Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$Status;", "", "title", "", "type", "statusDetail", "isCurrentStatus", "", "createdDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getTitle", "()Ljava/lang/String;", "getType", "getStatusDetail", "()Z", "getCreatedDate", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;

        @SerializedName("created_date")
        private final long createdDate;

        @SerializedName("is_current_status")
        private final boolean isCurrentStatus;

        @SerializedName("status_detail")
        @NotNull
        private final String statusDetail;

        @SerializedName("title")
        @NotNull
        private final String title;

        @SerializedName("type")
        @NotNull
        private final String type;

        public Status() {
            this(null, null, null, false, 0L, 31, null);
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, boolean z2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.title;
            }
            if ((i & 2) != 0) {
                str2 = status.type;
            }
            if ((i & 4) != 0) {
                str3 = status.statusDetail;
            }
            if ((i & 8) != 0) {
                z2 = status.isCurrentStatus;
            }
            if ((i & 16) != 0) {
                j = status.createdDate;
            }
            long j2 = j;
            return status.copy(str, str2, str3, z2, j2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStatusDetail() {
            return this.statusDetail;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsCurrentStatus() {
            return this.isCurrentStatus;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getCreatedDate() {
            return this.createdDate;
        }

        @NotNull
        public final Status copy(@NotNull String title, @NotNull String type, @NotNull String statusDetail, boolean isCurrentStatus, long createdDate) {
            Intrinsics.m18599g(title, "title");
            Intrinsics.m18599g(type, "type");
            Intrinsics.m18599g(statusDetail, "statusDetail");
            return new Status(title, type, statusDetail, isCurrentStatus, createdDate);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return Intrinsics.m18594b(this.title, status.title) && Intrinsics.m18594b(this.type, status.type) && Intrinsics.m18594b(this.statusDetail, status.statusDetail) && this.isCurrentStatus == status.isCurrentStatus && this.createdDate == status.createdDate;
        }

        public final long getCreatedDate() {
            return this.createdDate;
        }

        @NotNull
        public final String getStatusDetail() {
            return this.statusDetail;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return Long.hashCode(this.createdDate) + AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b(this.title.hashCode() * 31, 31, this.type), 31, this.statusDetail), 31, this.isCurrentStatus);
        }

        public final boolean isCurrentStatus() {
            return this.isCurrentStatus;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Status(title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", statusDetail=");
            sb.append(this.statusDetail);
            sb.append(", isCurrentStatus=");
            sb.append(this.isCurrentStatus);
            sb.append(", createdDate=");
            return AbstractC0455a.m2240o(sb, this.createdDate, ')');
        }

        public Status(@NotNull String title, @NotNull String type, @NotNull String statusDetail, boolean z2, long j) {
            Intrinsics.m18599g(title, "title");
            Intrinsics.m18599g(type, "type");
            Intrinsics.m18599g(statusDetail, "statusDetail");
            this.title = title;
            this.type = type;
            this.statusDetail = statusDetail;
            this.isCurrentStatus = z2;
            this.createdDate = j;
        }

        public /* synthetic */ Status(String str, String str2, String str3, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? 0L : j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @kotlin.Metadata(m18301d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B9\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0007H&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0005\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;)V", "getId", "()Ljava/lang/String;", "getIdentifier", "getName", "getRequired", "()Z", "getType", "()Lio/intercom/android/sdk/models/TicketAttributeType;", "hasValue", "PrimitiveAttribute", "ListAttribute", "DateTimeAttribute", "FilesAttribute", "UnSupported", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static abstract class TicketAttribute {
        public static final int $stable = 0;

        @SerializedName("id")
        @NotNull
        private final String id;

        @SerializedName("identifier")
        @NotNull
        private final String identifier;

        @SerializedName("name")
        @NotNull
        private final String name;

        @SerializedName("required")
        private final boolean required;

        @SerializedName("type")
        @NotNull
        private final TicketAttributeType type;

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class DateTimeAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            @NotNull
            private final String value;

            public DateTimeAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.m20448x(this.value);
            }

            public /* synthetic */ DateTimeAttribute(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? TicketAttributeType.DATETIME : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateTimeAttribute(@NotNull String id, @NotNull String identifier, @NotNull String name, boolean z2, @NotNull TicketAttributeType type, @NotNull String value) {
                super(id, identifier, name, z2, type, null);
                Intrinsics.m18599g(id, "id");
                Intrinsics.m18599g(identifier, "identifier");
                Intrinsics.m18599g(name, "name");
                Intrinsics.m18599g(type, "type");
                Intrinsics.m18599g(value, "value");
                this.value = value;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "hasValue", "File", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class FilesAttribute extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            @NotNull
            private final List<File> value;

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @kotlin.Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "", "id", "", "name", ImagesContract.URL, "fileType", "Lio/intercom/android/sdk/models/FileType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;)V", "getId", "()Ljava/lang/String;", "getName", "getUrl", "getFileType", "()Lio/intercom/android/sdk/models/FileType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final /* data */ class File {
                public static final int $stable = 0;

                @SerializedName("media_type")
                @NotNull
                private final FileType fileType;

                @SerializedName("id")
                @NotNull
                private final String id;

                @SerializedName("name")
                @NotNull
                private final String name;

                @SerializedName(ImagesContract.URL)
                @NotNull
                private final String url;

                public File(@NotNull String id, @NotNull String name, @NotNull String url, @NotNull FileType fileType) {
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(name, "name");
                    Intrinsics.m18599g(url, "url");
                    Intrinsics.m18599g(fileType, "fileType");
                    this.id = id;
                    this.name = name;
                    this.url = url;
                    this.fileType = fileType;
                }

                public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, FileType fileType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = file.id;
                    }
                    if ((i & 2) != 0) {
                        str2 = file.name;
                    }
                    if ((i & 4) != 0) {
                        str3 = file.url;
                    }
                    if ((i & 8) != 0) {
                        fileType = file.fileType;
                    }
                    return file.copy(str, str2, str3, fileType);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @NotNull
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                @NotNull
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @NotNull
                /* JADX INFO: renamed from: component4, reason: from getter */
                public final FileType getFileType() {
                    return this.fileType;
                }

                @NotNull
                public final File copy(@NotNull String id, @NotNull String name, @NotNull String url, @NotNull FileType fileType) {
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(name, "name");
                    Intrinsics.m18599g(url, "url");
                    Intrinsics.m18599g(fileType, "fileType");
                    return new File(id, name, url, fileType);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof File)) {
                        return false;
                    }
                    File file = (File) other;
                    return Intrinsics.m18594b(this.id, file.id) && Intrinsics.m18594b(this.name, file.name) && Intrinsics.m18594b(this.url, file.url) && this.fileType == file.fileType;
                }

                @NotNull
                public final FileType getFileType() {
                    return this.fileType;
                }

                @NotNull
                public final String getId() {
                    return this.id;
                }

                @NotNull
                public final String getName() {
                    return this.name;
                }

                @NotNull
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.fileType.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(this.id.hashCode() * 31, 31, this.name), 31, this.url);
                }

                @NotNull
                public String toString() {
                    return "File(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", fileType=" + this.fileType + ')';
                }
            }

            public /* synthetic */ FilesAttribute(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z2, ticketAttributeType, list);
            }

            @NotNull
            public final List<File> getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !this.value.isEmpty();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilesAttribute(@NotNull String id, @NotNull String identifier, @NotNull String name, boolean z2, @NotNull TicketAttributeType type, @NotNull List<File> value) {
                super(id, identifier, name, z2, type, null);
                Intrinsics.m18599g(id, "id");
                Intrinsics.m18599g(identifier, "identifier");
                Intrinsics.m18599g(name, "name");
                Intrinsics.m18599g(type, "type");
                Intrinsics.m18599g(value, "value");
                this.value = value;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class ListAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            @NotNull
            private final String value;

            public ListAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.m20448x(this.value);
            }

            public /* synthetic */ ListAttribute(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? TicketAttributeType.LIST : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListAttribute(@NotNull String id, @NotNull String identifier, @NotNull String name, boolean z2, @NotNull TicketAttributeType type, @NotNull String value) {
                super(id, identifier, name, z2, type, null);
                Intrinsics.m18599g(id, "id");
                Intrinsics.m18599g(identifier, "identifier");
                Intrinsics.m18599g(name, "name");
                Intrinsics.m18599g(type, "type");
                Intrinsics.m18599g(value, "value");
                this.value = value;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class PrimitiveAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            @NotNull
            private final String value;

            public PrimitiveAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.m20448x(this.value);
            }

            public /* synthetic */ PrimitiveAttribute(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? TicketAttributeType.STRING : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute(@NotNull String id, @NotNull String identifier, @NotNull String name, boolean z2, @NotNull TicketAttributeType type, @NotNull String value) {
                super(id, identifier, name, z2, type, null);
                Intrinsics.m18599g(id, "id");
                Intrinsics.m18599g(identifier, "identifier");
                Intrinsics.m18599g(name, "name");
                Intrinsics.m18599g(type, "type");
                Intrinsics.m18599g(value, "value");
                this.value = value;
            }
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z2, ticketAttributeType);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getIdentifier() {
            return this.identifier;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final boolean getRequired() {
            return this.required;
        }

        @NotNull
        public final TicketAttributeType getType() {
            return this.type;
        }

        public abstract boolean hasValue();

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "hasValue", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class UnSupported extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            @NotNull
            private final Object value;

            public /* synthetic */ UnSupported(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z2, ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            @NotNull
            public final Object getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.m20448x(this.value.toString());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnSupported(@NotNull String id, @NotNull String identifier, @NotNull String name, boolean z2, @NotNull TicketAttributeType type, @NotNull Object value) {
                super(id, identifier, name, z2, type, null);
                Intrinsics.m18599g(id, "id");
                Intrinsics.m18599g(identifier, "identifier");
                Intrinsics.m18599g(name, "name");
                Intrinsics.m18599g(type, "type");
                Intrinsics.m18599g(value, "value");
                this.value = value;
            }
        }

        private TicketAttribute(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType) {
            this.id = str;
            this.identifier = str2;
            this.name = str3;
            this.required = z2;
            this.type = ticketAttributeType;
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z2, TicketAttributeType ticketAttributeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z2, ticketAttributeType, null);
        }
    }

    public Ticket() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0L, 32767, null);
    }

    public static final /* synthetic */ Ticket access$getNULL$cp() {
        return NULL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j, int i2, Object obj) {
        long j2;
        String str8;
        String str9 = (i2 & 1) != 0 ? ticket.id : str;
        String str10 = (i2 & 2) != 0 ? ticket.publicId : str2;
        String str11 = (i2 & 4) != 0 ? ticket.title : str3;
        String str12 = (i2 & 8) != 0 ? ticket.description : str4;
        String str13 = (i2 & 16) != 0 ? ticket.iconUrl : str5;
        String str14 = (i2 & 32) != 0 ? ticket.emoji : str6;
        Status status2 = (i2 & 64) != 0 ? ticket.currentStatus : status;
        List list3 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? ticket.statusList : list;
        List list4 = (i2 & 256) != 0 ? ticket.attributes : list2;
        int i3 = (i2 & 512) != 0 ? ticket.ticketTypeId : i;
        Participant.Builder builder2 = (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? ticket.assignee : builder;
        String str15 = (i2 & 2048) != 0 ? ticket.conversationId : str7;
        ConversationButton conversationButton2 = (i2 & 4096) != 0 ? ticket.conversationButton : conversationButton;
        Boolean bool2 = (i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? ticket.isRead : bool;
        if ((i2 & 16384) != 0) {
            str8 = str9;
            j2 = ticket.latestStatusUpdatedAt;
        } else {
            j2 = j;
            str8 = str9;
        }
        return ticket.copy(str8, str10, str11, str12, str13, str14, status2, list3, list4, i3, builder2, str15, conversationButton2, bool2, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsRead() {
        return this.isRead;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublicId() {
        return this.publicId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    @NotNull
    public final List<Status> component8() {
        return this.statusList;
    }

    @NotNull
    public final List<TicketAttribute> component9() {
        return this.attributes;
    }

    @NotNull
    public final Ticket copy(@NotNull String id, @Nullable String publicId, @NotNull String title, @NotNull String description, @NotNull String iconUrl, @NotNull String emoji, @NotNull Status currentStatus, @NotNull List<Status> statusList, @NotNull List<? extends TicketAttribute> attributes, int ticketTypeId, @NotNull Participant.Builder assignee, @Nullable String conversationId, @Nullable ConversationButton conversationButton, @Nullable Boolean isRead, long latestStatusUpdatedAt) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(description, "description");
        Intrinsics.m18599g(iconUrl, "iconUrl");
        Intrinsics.m18599g(emoji, "emoji");
        Intrinsics.m18599g(currentStatus, "currentStatus");
        Intrinsics.m18599g(statusList, "statusList");
        Intrinsics.m18599g(attributes, "attributes");
        Intrinsics.m18599g(assignee, "assignee");
        return new Ticket(id, publicId, title, description, iconUrl, emoji, currentStatus, statusList, attributes, ticketTypeId, assignee, conversationId, conversationButton, isRead, latestStatusUpdatedAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) other;
        return Intrinsics.m18594b(this.id, ticket.id) && Intrinsics.m18594b(this.publicId, ticket.publicId) && Intrinsics.m18594b(this.title, ticket.title) && Intrinsics.m18594b(this.description, ticket.description) && Intrinsics.m18594b(this.iconUrl, ticket.iconUrl) && Intrinsics.m18594b(this.emoji, ticket.emoji) && Intrinsics.m18594b(this.currentStatus, ticket.currentStatus) && Intrinsics.m18594b(this.statusList, ticket.statusList) && Intrinsics.m18594b(this.attributes, ticket.attributes) && this.ticketTypeId == ticket.ticketTypeId && Intrinsics.m18594b(this.assignee, ticket.assignee) && Intrinsics.m18594b(this.conversationId, ticket.conversationId) && Intrinsics.m18594b(this.conversationButton, ticket.conversationButton) && Intrinsics.m18594b(this.isRead, ticket.isRead) && this.latestStatusUpdatedAt == ticket.latestStatusUpdatedAt;
    }

    @NotNull
    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    @NotNull
    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getEmoji() {
        return this.emoji;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    @Nullable
    public final String getPublicId() {
        return this.publicId;
    }

    @NotNull
    public final List<Status> getStatusList() {
        return this.statusList;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.publicId;
        int iHashCode2 = (this.assignee.hashCode() + AbstractC0455a.m2228c(this.ticketTypeId, AbstractC0455a.m2233h(this.attributes, AbstractC0455a.m2233h(this.statusList, (this.currentStatus.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.description), 31, this.iconUrl), 31, this.emoji)) * 31, 31), 31), 31)) * 31;
        String str2 = this.conversationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConversationButton conversationButton = this.conversationButton;
        int iHashCode4 = (iHashCode3 + (conversationButton == null ? 0 : conversationButton.hashCode())) * 31;
        Boolean bool = this.isRead;
        return Long.hashCode(this.latestStatusUpdatedAt) + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @Nullable
    public final Boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Ticket(id=");
        sb.append(this.id);
        sb.append(", publicId=");
        sb.append(this.publicId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", emoji=");
        sb.append(this.emoji);
        sb.append(", currentStatus=");
        sb.append(this.currentStatus);
        sb.append(", statusList=");
        sb.append(this.statusList);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", ticketTypeId=");
        sb.append(this.ticketTypeId);
        sb.append(", assignee=");
        sb.append(this.assignee);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", conversationButton=");
        sb.append(this.conversationButton);
        sb.append(", isRead=");
        sb.append(this.isRead);
        sb.append(", latestStatusUpdatedAt=");
        return AbstractC0455a.m2240o(sb, this.latestStatusUpdatedAt, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticket(@NotNull String id, @Nullable String str, @NotNull String title, @NotNull String description, @NotNull String iconUrl, @NotNull String emoji, @NotNull Status currentStatus, @NotNull List<Status> statusList, @NotNull List<? extends TicketAttribute> attributes, int i, @NotNull Participant.Builder assignee, @Nullable String str2, @Nullable ConversationButton conversationButton, @Nullable Boolean bool, long j) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(description, "description");
        Intrinsics.m18599g(iconUrl, "iconUrl");
        Intrinsics.m18599g(emoji, "emoji");
        Intrinsics.m18599g(currentStatus, "currentStatus");
        Intrinsics.m18599g(statusList, "statusList");
        Intrinsics.m18599g(attributes, "attributes");
        Intrinsics.m18599g(assignee, "assignee");
        this.id = id;
        this.publicId = str;
        this.title = title;
        this.description = description;
        this.iconUrl = iconUrl;
        this.emoji = emoji;
        this.currentStatus = currentStatus;
        this.statusList = statusList;
        this.attributes = attributes;
        this.ticketTypeId = i;
        this.assignee = assignee;
        this.conversationId = str2;
        this.conversationButton = conversationButton;
        this.isRead = bool;
        this.latestStatusUpdatedAt = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str8 = (i2 & 1) != 0 ? "" : str;
        String str9 = (i2 & 2) != 0 ? null : str2;
        String str10 = (i2 & 4) != 0 ? "" : str3;
        String str11 = (i2 & 8) != 0 ? "" : str4;
        String str12 = (i2 & 16) != 0 ? "" : str5;
        String str13 = (i2 & 32) == 0 ? str6 : "";
        Status status2 = (i2 & 64) != 0 ? new Status(null, null, null, false, 0L, 31, null) : status;
        int i3 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        List list3 = EmptyList.f51496a;
        this(str8, str9, str10, str11, str12, str13, status2, i3 != 0 ? list3 : list, (i2 & 256) == 0 ? list2 : list3, (i2 & 512) != 0 ? 0 : i, (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? new Participant.Builder() : builder, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? null : conversationButton, (i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 ? bool : null, (i2 & 16384) != 0 ? 0L : j);
    }
}
