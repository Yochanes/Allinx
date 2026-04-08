package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/models/TicketAttributeType;", "", "<init>", "(Ljava/lang/String;I)V", "STRING", "INTEGER", "FLOAT", "BOOLEAN", "DATETIME", "LIST", "FILES", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TicketAttributeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TicketAttributeType[] $VALUES;

    @SerializedName("string")
    public static final TicketAttributeType STRING = new TicketAttributeType("STRING", 0);

    @SerializedName(AttributeType.INTEGER)
    public static final TicketAttributeType INTEGER = new TicketAttributeType("INTEGER", 1);

    @SerializedName(AttributeType.FLOAT)
    public static final TicketAttributeType FLOAT = new TicketAttributeType("FLOAT", 2);

    @SerializedName(AttributeType.BOOLEAN)
    public static final TicketAttributeType BOOLEAN = new TicketAttributeType("BOOLEAN", 3);

    @SerializedName("datetime")
    public static final TicketAttributeType DATETIME = new TicketAttributeType("DATETIME", 4);

    @SerializedName(AttributeType.LIST)
    public static final TicketAttributeType LIST = new TicketAttributeType("LIST", 5);

    @SerializedName("files")
    public static final TicketAttributeType FILES = new TicketAttributeType("FILES", 6);

    private static final /* synthetic */ TicketAttributeType[] $values() {
        return new TicketAttributeType[]{STRING, INTEGER, FLOAT, BOOLEAN, DATETIME, LIST, FILES};
    }

    static {
        TicketAttributeType[] ticketAttributeTypeArr$values = $values();
        $VALUES = ticketAttributeTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(ticketAttributeTypeArr$values);
    }

    private TicketAttributeType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TicketAttributeType> getEntries() {
        return $ENTRIES;
    }

    public static TicketAttributeType valueOf(String str) {
        return (TicketAttributeType) Enum.valueOf(TicketAttributeType.class, str);
    }

    public static TicketAttributeType[] values() {
        return (TicketAttributeType[]) $VALUES.clone();
    }
}
