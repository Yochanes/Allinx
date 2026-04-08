package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0083\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/CaretType;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class CaretType {

    /* JADX INFO: renamed from: a */
    public static final CaretType f12390a;

    /* JADX INFO: renamed from: b */
    public static final CaretType f12391b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ CaretType[] f12392c;

    static {
        CaretType caretType = new CaretType("Plain", 0);
        f12390a = caretType;
        CaretType caretType2 = new CaretType("Rich", 1);
        f12391b = caretType2;
        f12392c = new CaretType[]{caretType, caretType2};
    }

    public static CaretType valueOf(String str) {
        return (CaretType) Enum.valueOf(CaretType.class, str);
    }

    public static CaretType[] values() {
        return (CaretType[]) f12392c.clone();
    }
}
