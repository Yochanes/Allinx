package io.intercom.android.sdk.lightcompressor.config;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;", "", "<init>", "(Ljava/lang/String;I)V", "pictures", "downloads", "movies", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SaveLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SaveLocation[] $VALUES;
    public static final SaveLocation pictures = new SaveLocation("pictures", 0);
    public static final SaveLocation downloads = new SaveLocation("downloads", 1);
    public static final SaveLocation movies = new SaveLocation("movies", 2);

    private static final /* synthetic */ SaveLocation[] $values() {
        return new SaveLocation[]{pictures, downloads, movies};
    }

    static {
        SaveLocation[] saveLocationArr$values = $values();
        $VALUES = saveLocationArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(saveLocationArr$values);
    }

    private SaveLocation(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SaveLocation> getEntries() {
        return $ENTRIES;
    }

    public static SaveLocation valueOf(String str) {
        return (SaveLocation) Enum.valueOf(SaveLocation.class, str);
    }

    public static SaveLocation[] values() {
        return (SaveLocation[]) $VALUES.clone();
    }
}
