package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextDeleteType {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ TextDeleteType[] f9399a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f9400b;

    static {
        TextDeleteType[] textDeleteTypeArr = {new TextDeleteType("Start", 0), new TextDeleteType("End", 1), new TextDeleteType("Inner", 2), new TextDeleteType("NotByUser", 3)};
        f9399a = textDeleteTypeArr;
        f9400b = EnumEntriesKt.m18563a(textDeleteTypeArr);
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) f9399a.clone();
    }
}
