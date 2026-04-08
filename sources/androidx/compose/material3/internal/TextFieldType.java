package androidx.compose.material3.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TextFieldType {

    /* JADX INFO: renamed from: a */
    public static final TextFieldType f15714a;

    /* JADX INFO: renamed from: b */
    public static final TextFieldType f15715b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ TextFieldType[] f15716c;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        f15714a = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        f15715b = textFieldType2;
        f15716c = new TextFieldType[]{textFieldType, textFieldType2};
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f15716c.clone();
    }
}
