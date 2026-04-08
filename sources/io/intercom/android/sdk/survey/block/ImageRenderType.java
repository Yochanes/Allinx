package io.intercom.android.sdk.survey.block;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/survey/block/ImageRenderType;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "CROPPED", "WITH_MAX_SIZE", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ImageRenderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageRenderType[] $VALUES;
    public static final ImageRenderType FULL = new ImageRenderType("FULL", 0);
    public static final ImageRenderType CROPPED = new ImageRenderType("CROPPED", 1);
    public static final ImageRenderType WITH_MAX_SIZE = new ImageRenderType("WITH_MAX_SIZE", 2);

    private static final /* synthetic */ ImageRenderType[] $values() {
        return new ImageRenderType[]{FULL, CROPPED, WITH_MAX_SIZE};
    }

    static {
        ImageRenderType[] imageRenderTypeArr$values = $values();
        $VALUES = imageRenderTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(imageRenderTypeArr$values);
    }

    private ImageRenderType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ImageRenderType> getEntries() {
        return $ENTRIES;
    }

    public static ImageRenderType valueOf(String str) {
        return (ImageRenderType) Enum.valueOf(ImageRenderType.class, str);
    }

    public static ImageRenderType[] values() {
        return (ImageRenderType[]) $VALUES.clone();
    }
}
