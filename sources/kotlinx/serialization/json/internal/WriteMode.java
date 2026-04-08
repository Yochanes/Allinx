package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class WriteMode {

    /* JADX INFO: renamed from: c */
    public static final WriteMode f56948c;

    /* JADX INFO: renamed from: d */
    public static final WriteMode f56949d;

    /* JADX INFO: renamed from: f */
    public static final WriteMode f56950f;

    /* JADX INFO: renamed from: g */
    public static final WriteMode f56951g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ WriteMode[] f56952i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumEntries f56953j;

    /* JADX INFO: renamed from: a */
    public final char f56954a;

    /* JADX INFO: renamed from: b */
    public final char f56955b;

    static {
        WriteMode writeMode = new WriteMode("OBJ", 0, '{', '}');
        f56948c = writeMode;
        WriteMode writeMode2 = new WriteMode("LIST", 1, '[', ']');
        f56949d = writeMode2;
        WriteMode writeMode3 = new WriteMode("MAP", 2, '{', '}');
        f56950f = writeMode3;
        WriteMode writeMode4 = new WriteMode("POLY_OBJ", 3, '[', ']');
        f56951g = writeMode4;
        WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        f56952i = writeModeArr;
        f56953j = EnumEntriesKt.m18563a(writeModeArr);
    }

    public WriteMode(String str, int i, char c2, char c3) {
        this.f56954a = c2;
        this.f56955b = c3;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) f56952i.clone();
    }
}
