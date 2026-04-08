package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/TextFieldType;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextFieldType {

    /* JADX INFO: renamed from: a */
    public static final TextFieldType f11640a;

    /* JADX INFO: renamed from: b */
    public static final TextFieldType f11641b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ TextFieldType[] f11642c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f11643d;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        f11640a = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        f11641b = textFieldType2;
        TextFieldType[] textFieldTypeArr = {textFieldType, textFieldType2};
        f11642c = textFieldTypeArr;
        f11643d = EnumEntriesKt.m18563a(textFieldTypeArr);
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f11642c.clone();
    }
}
