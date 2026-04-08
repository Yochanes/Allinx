package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/models/FileType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "VIDEO", "ATTACHMENT", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class FileType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileType[] $VALUES;

    @SerializedName(AppearanceType.IMAGE)
    public static final FileType IMAGE = new FileType("IMAGE", 0);

    @SerializedName("video")
    public static final FileType VIDEO = new FileType("VIDEO", 1);

    @SerializedName("attachment")
    public static final FileType ATTACHMENT = new FileType("ATTACHMENT", 2);

    private static final /* synthetic */ FileType[] $values() {
        return new FileType[]{IMAGE, VIDEO, ATTACHMENT};
    }

    static {
        FileType[] fileTypeArr$values = $values();
        $VALUES = fileTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(fileTypeArr$values);
    }

    private FileType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FileType> getEntries() {
        return $ENTRIES;
    }

    public static FileType valueOf(String str) {
        return (FileType) Enum.valueOf(FileType.class, str);
    }

    public static FileType[] values() {
        return (FileType[]) $VALUES.clone();
    }
}
