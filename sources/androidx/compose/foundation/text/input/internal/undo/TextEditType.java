package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextEditType {

    /* JADX INFO: renamed from: a */
    public static final TextEditType f9401a;

    /* JADX INFO: renamed from: b */
    public static final TextEditType f9402b;

    /* JADX INFO: renamed from: c */
    public static final TextEditType f9403c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ TextEditType[] f9404d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f9405f;

    static {
        TextEditType textEditType = new TextEditType("Insert", 0);
        f9401a = textEditType;
        TextEditType textEditType2 = new TextEditType("Delete", 1);
        f9402b = textEditType2;
        TextEditType textEditType3 = new TextEditType("Replace", 2);
        f9403c = textEditType3;
        TextEditType[] textEditTypeArr = {textEditType, textEditType2, textEditType3};
        f9404d = textEditTypeArr;
        f9405f = EnumEntriesKt.m18563a(textEditTypeArr);
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) f9404d.clone();
    }
}
