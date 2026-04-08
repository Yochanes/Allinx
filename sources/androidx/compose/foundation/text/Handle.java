package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/Handle;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Handle {

    /* JADX INFO: renamed from: a */
    public static final Handle f8401a;

    /* JADX INFO: renamed from: b */
    public static final Handle f8402b;

    /* JADX INFO: renamed from: c */
    public static final Handle f8403c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Handle[] f8404d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f8405f;

    static {
        Handle handle = new Handle("Cursor", 0);
        f8401a = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        f8402b = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        f8403c = handle3;
        Handle[] handleArr = {handle, handle2, handle3};
        f8404d = handleArr;
        f8405f = EnumEntriesKt.m18563a(handleArr);
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f8404d.clone();
    }
}
