package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/reflect/KVisibility;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class KVisibility {

    /* JADX INFO: renamed from: a */
    public static final KVisibility f51724a;

    /* JADX INFO: renamed from: b */
    public static final KVisibility f51725b;

    /* JADX INFO: renamed from: c */
    public static final KVisibility f51726c;

    /* JADX INFO: renamed from: d */
    public static final KVisibility f51727d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KVisibility[] f51728f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f51729g;

    static {
        KVisibility kVisibility = new KVisibility("PUBLIC", 0);
        f51724a = kVisibility;
        KVisibility kVisibility2 = new KVisibility("PROTECTED", 1);
        f51725b = kVisibility2;
        KVisibility kVisibility3 = new KVisibility("INTERNAL", 2);
        f51726c = kVisibility3;
        KVisibility kVisibility4 = new KVisibility("PRIVATE", 3);
        f51727d = kVisibility4;
        KVisibility[] kVisibilityArr = {kVisibility, kVisibility2, kVisibility3, kVisibility4};
        f51728f = kVisibilityArr;
        f51729g = EnumEntriesKt.m18563a(kVisibilityArr);
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f51728f.clone();
    }
}
