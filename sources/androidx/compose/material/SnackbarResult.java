package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/SnackbarResult;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SnackbarResult {

    /* JADX INFO: renamed from: a */
    public static final SnackbarResult f11287a;

    /* JADX INFO: renamed from: b */
    public static final SnackbarResult f11288b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ SnackbarResult[] f11289c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f11290d;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        f11287a = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        f11288b = snackbarResult2;
        SnackbarResult[] snackbarResultArr = {snackbarResult, snackbarResult2};
        f11289c = snackbarResultArr;
        f11290d = EnumEntriesKt.m18563a(snackbarResultArr);
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f11289c.clone();
    }
}
