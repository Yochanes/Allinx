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
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/reflect/KVariance;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class KVariance {

    /* JADX INFO: renamed from: a */
    public static final KVariance f51719a;

    /* JADX INFO: renamed from: b */
    public static final KVariance f51720b;

    /* JADX INFO: renamed from: c */
    public static final KVariance f51721c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KVariance[] f51722d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f51723f;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        f51719a = kVariance;
        KVariance kVariance2 = new KVariance("IN", 1);
        f51720b = kVariance2;
        KVariance kVariance3 = new KVariance("OUT", 2);
        f51721c = kVariance3;
        KVariance[] kVarianceArr = {kVariance, kVariance2, kVariance3};
        f51722d = kVarianceArr;
        f51723f = EnumEntriesKt.m18563a(kVarianceArr);
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) f51722d.clone();
    }
}
