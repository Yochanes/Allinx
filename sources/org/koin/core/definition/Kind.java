package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/definition/Kind;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Kind {

    /* JADX INFO: renamed from: a */
    public static final Kind f58207a;

    /* JADX INFO: renamed from: b */
    public static final Kind f58208b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ Kind[] f58209c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f58210d;

    static {
        Kind kind = new Kind("Singleton", 0);
        f58207a = kind;
        Kind kind2 = new Kind("Factory", 1);
        f58208b = kind2;
        Kind[] kindArr = {kind, kind2, new Kind("Scoped", 2)};
        f58209c = kindArr;
        f58210d = EnumEntriesKt.m18563a(kindArr);
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) f58209c.clone();
    }
}
