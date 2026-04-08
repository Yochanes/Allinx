package io.intercom.android.sdk.p032m5.home.data;

import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.C5101R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/data/IconType;", "", "<init>", "(Ljava/lang/String;I)V", "TEAMMATE", "BOT", "FIN", "FACE_PILE", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class IconType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IconType[] $VALUES;

    @SerializedName("teammate")
    public static final IconType TEAMMATE = new TEAMMATE("TEAMMATE", 0);

    @SerializedName("bot")
    public static final IconType BOT = new BOT("BOT", 1);

    @SerializedName("fin")
    public static final IconType FIN = new FIN("FIN", 2);

    @SerializedName("facepile")
    public static final IconType FACE_PILE = new FACE_PILE("FACE_PILE", 3);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"io/intercom/android/sdk/m5/home/data/IconType.BOT", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class BOT extends IconType {
        public BOT(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.home.data.IconType
        @NotNull
        public Integer getIcon() {
            return Integer.valueOf(C5101R.drawable.intercom_conversation_card_question);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"io/intercom/android/sdk/m5/home/data/IconType.FACE_PILE", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class FACE_PILE extends IconType {
        public FACE_PILE(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.home.data.IconType
        @Nullable
        public Integer getIcon() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"io/intercom/android/sdk/m5/home/data/IconType.FIN", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class FIN extends IconType {
        public FIN(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.home.data.IconType
        @NotNull
        public Integer getIcon() {
            return Integer.valueOf(C5101R.drawable.intercom_chevron);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"io/intercom/android/sdk/m5/home/data/IconType.TEAMMATE", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class TEAMMATE extends IconType {
        public TEAMMATE(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.home.data.IconType
        @NotNull
        public Integer getIcon() {
            return Integer.valueOf(C5101R.drawable.intercom_send_message_icon);
        }
    }

    private static final /* synthetic */ IconType[] $values() {
        return new IconType[]{TEAMMATE, BOT, FIN, FACE_PILE};
    }

    static {
        IconType[] iconTypeArr$values = $values();
        $VALUES = iconTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(iconTypeArr$values);
    }

    public /* synthetic */ IconType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
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

    @Nullable
    public abstract Integer getIcon();

    private IconType(String str, int i) {
    }
}
