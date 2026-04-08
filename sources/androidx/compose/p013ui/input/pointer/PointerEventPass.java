package androidx.compose.p013ui.input.pointer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PointerEventPass {

    /* JADX INFO: renamed from: a */
    public static final PointerEventPass f18287a;

    /* JADX INFO: renamed from: b */
    public static final PointerEventPass f18288b;

    /* JADX INFO: renamed from: c */
    public static final PointerEventPass f18289c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ PointerEventPass[] f18290d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f18291f;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        f18287a = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        f18288b = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        f18289c = pointerEventPass3;
        PointerEventPass[] pointerEventPassArr = {pointerEventPass, pointerEventPass2, pointerEventPass3};
        f18290d = pointerEventPassArr;
        f18291f = EnumEntriesKt.m18563a(pointerEventPassArr);
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) f18290d.clone();
    }
}
