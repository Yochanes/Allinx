package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/reactive/Mode;", "", "kotlinx-coroutines-reactive"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class Mode {

    /* JADX INFO: renamed from: b */
    public static final Mode f56408b;

    /* JADX INFO: renamed from: c */
    public static final Mode f56409c;

    /* JADX INFO: renamed from: d */
    public static final Mode f56410d;

    /* JADX INFO: renamed from: f */
    public static final Mode f56411f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ Mode[] f56412g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumEntries f56413i;

    /* JADX INFO: renamed from: a */
    public final String f56414a;

    static {
        Mode mode = new Mode("FIRST", 0, "awaitFirst");
        f56408b = mode;
        Mode mode2 = new Mode("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        f56409c = mode2;
        Mode mode3 = new Mode("LAST", 2, "awaitLast");
        Mode mode4 = new Mode("SINGLE", 3, "awaitSingle");
        f56410d = mode4;
        Mode mode5 = new Mode("SINGLE_OR_DEFAULT", 4, "awaitSingleOrDefault");
        f56411f = mode5;
        Mode[] modeArr = {mode, mode2, mode3, mode4, mode5};
        f56412g = modeArr;
        f56413i = EnumEntriesKt.m18563a(modeArr);
    }

    public Mode(String str, int i, String str2) {
        this.f56414a = str2;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) f56412g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f56414a;
    }
}
