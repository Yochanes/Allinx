package io.intercom.android.sdk.lightcompressor;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "", "<init>", "(Ljava/lang/String;I)V", "VERY_HIGH", "HIGH", "MEDIUM", "LOW", "VERY_LOW", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class VideoQuality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;
    public static final VideoQuality VERY_HIGH = new VideoQuality("VERY_HIGH", 0);
    public static final VideoQuality HIGH = new VideoQuality("HIGH", 1);
    public static final VideoQuality MEDIUM = new VideoQuality("MEDIUM", 2);
    public static final VideoQuality LOW = new VideoQuality("LOW", 3);
    public static final VideoQuality VERY_LOW = new VideoQuality("VERY_LOW", 4);

    private static final /* synthetic */ VideoQuality[] $values() {
        return new VideoQuality[]{VERY_HIGH, HIGH, MEDIUM, LOW, VERY_LOW};
    }

    static {
        VideoQuality[] videoQualityArr$values = $values();
        $VALUES = videoQualityArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(videoQualityArr$values);
    }

    private VideoQuality(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VideoQuality> getEntries() {
        return $ENTRIES;
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }
}
