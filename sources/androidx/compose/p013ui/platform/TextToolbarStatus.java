package androidx.compose.p013ui.platform;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextToolbarStatus {

    /* JADX INFO: renamed from: a */
    public static final TextToolbarStatus f19531a;

    /* JADX INFO: renamed from: b */
    public static final TextToolbarStatus f19532b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ TextToolbarStatus[] f19533c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f19534d;

    static {
        TextToolbarStatus textToolbarStatus = new TextToolbarStatus("Shown", 0);
        f19531a = textToolbarStatus;
        TextToolbarStatus textToolbarStatus2 = new TextToolbarStatus("Hidden", 1);
        f19532b = textToolbarStatus2;
        TextToolbarStatus[] textToolbarStatusArr = {textToolbarStatus, textToolbarStatus2};
        f19533c = textToolbarStatusArr;
        f19534d = EnumEntriesKt.m18563a(textToolbarStatusArr);
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) f19533c.clone();
    }
}
