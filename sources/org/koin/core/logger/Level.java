package org.koin.core.logger;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/logger/Level;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Level {

    /* JADX INFO: renamed from: a */
    public static final Level f58221a;

    /* JADX INFO: renamed from: b */
    public static final Level f58222b;

    /* JADX INFO: renamed from: c */
    public static final Level f58223c;

    /* JADX INFO: renamed from: d */
    public static final Level f58224d;

    /* JADX INFO: renamed from: f */
    public static final Level f58225f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ Level[] f58226g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumEntries f58227i;

    static {
        Level level = new Level("DEBUG", 0);
        f58221a = level;
        Level level2 = new Level("INFO", 1);
        f58222b = level2;
        Level level3 = new Level("WARNING", 2);
        f58223c = level3;
        Level level4 = new Level("ERROR", 3);
        f58224d = level4;
        Level level5 = new Level("NONE", 4);
        f58225f = level5;
        Level[] levelArr = {level, level2, level3, level4, level5};
        f58226g = levelArr;
        f58227i = EnumEntriesKt.m18563a(levelArr);
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) f58226g.clone();
    }
}
