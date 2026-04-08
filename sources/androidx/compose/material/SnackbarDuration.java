package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/SnackbarDuration;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SnackbarDuration {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ SnackbarDuration[] f11197a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f11198b;

    static {
        SnackbarDuration[] snackbarDurationArr = {new SnackbarDuration("Short", 0), new SnackbarDuration("Long", 1), new SnackbarDuration("Indefinite", 2)};
        f11197a = snackbarDurationArr;
        f11198b = EnumEntriesKt.m18563a(snackbarDurationArr);
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) f11197a.clone();
    }
}
