package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/intercom/android/sdk/models/OpenForm;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class OpenForm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OpenForm[] $VALUES;

    @SerializedName("default")
    public static final OpenForm DEFAULT = new OpenForm("DEFAULT", 0);

    private static final /* synthetic */ OpenForm[] $values() {
        return new OpenForm[]{DEFAULT};
    }

    static {
        OpenForm[] openFormArr$values = $values();
        $VALUES = openFormArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(openFormArr$values);
    }

    private OpenForm(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OpenForm> getEntries() {
        return $ENTRIES;
    }

    public static OpenForm valueOf(String str) {
        return (OpenForm) Enum.valueOf(OpenForm.class, str);
    }

    public static OpenForm[] values() {
        return (OpenForm[]) $VALUES.clone();
    }
}
