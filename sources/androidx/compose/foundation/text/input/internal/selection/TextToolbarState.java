package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextToolbarState {

    /* JADX INFO: renamed from: a */
    public static final TextToolbarState f9394a;

    /* JADX INFO: renamed from: b */
    public static final TextToolbarState f9395b;

    /* JADX INFO: renamed from: c */
    public static final TextToolbarState f9396c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ TextToolbarState[] f9397d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f9398f;

    static {
        TextToolbarState textToolbarState = new TextToolbarState("None", 0);
        f9394a = textToolbarState;
        TextToolbarState textToolbarState2 = new TextToolbarState("Cursor", 1);
        f9395b = textToolbarState2;
        TextToolbarState textToolbarState3 = new TextToolbarState("Selection", 2);
        f9396c = textToolbarState3;
        TextToolbarState[] textToolbarStateArr = {textToolbarState, textToolbarState2, textToolbarState3};
        f9397d = textToolbarStateArr;
        f9398f = EnumEntriesKt.m18563a(textToolbarStateArr);
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) f9397d.clone();
    }
}
