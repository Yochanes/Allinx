package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/SnackbarResult;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SnackbarResult {

    /* JADX INFO: renamed from: a */
    public static final SnackbarResult f14708a;

    /* JADX INFO: renamed from: b */
    public static final SnackbarResult f14709b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ SnackbarResult[] f14710c;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        f14708a = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        f14709b = snackbarResult2;
        f14710c = new SnackbarResult[]{snackbarResult, snackbarResult2};
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f14710c.clone();
    }
}
