package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/SnackbarDuration;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SnackbarDuration {

    /* JADX INFO: renamed from: a */
    public static final SnackbarDuration f14590a;

    /* JADX INFO: renamed from: b */
    public static final SnackbarDuration f14591b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ SnackbarDuration[] f14592c;

    /* JADX INFO: Fake field, exist only in values array */
    SnackbarDuration EF0;

    static {
        SnackbarDuration snackbarDuration = new SnackbarDuration("Short", 0);
        SnackbarDuration snackbarDuration2 = new SnackbarDuration("Long", 1);
        f14590a = snackbarDuration2;
        SnackbarDuration snackbarDuration3 = new SnackbarDuration("Indefinite", 2);
        f14591b = snackbarDuration3;
        f14592c = new SnackbarDuration[]{snackbarDuration, snackbarDuration2, snackbarDuration3};
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) f14592c.clone();
    }
}
