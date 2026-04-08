package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextFieldEditUndoBehavior {

    /* JADX INFO: renamed from: a */
    public static final TextFieldEditUndoBehavior f9406a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ TextFieldEditUndoBehavior[] f9407b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f9408c;

    static {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
        f9406a = textFieldEditUndoBehavior;
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = {textFieldEditUndoBehavior, new TextFieldEditUndoBehavior("ClearHistory", 1), new TextFieldEditUndoBehavior("NeverMerge", 2)};
        f9407b = textFieldEditUndoBehaviorArr;
        f9408c = EnumEntriesKt.m18563a(textFieldEditUndoBehaviorArr);
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) f9407b.clone();
    }
}
