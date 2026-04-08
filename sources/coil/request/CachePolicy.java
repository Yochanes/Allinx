package coil.request;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/CachePolicy;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CachePolicy {

    /* JADX INFO: renamed from: c */
    public static final CachePolicy f33801c;

    /* JADX INFO: renamed from: d */
    public static final CachePolicy f33802d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ CachePolicy[] f33803f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f33804g;

    /* JADX INFO: renamed from: a */
    public final boolean f33805a;

    /* JADX INFO: renamed from: b */
    public final boolean f33806b;

    static {
        CachePolicy cachePolicy = new CachePolicy("ENABLED", 0, true, true);
        f33801c = cachePolicy;
        CachePolicy cachePolicy2 = new CachePolicy("READ_ONLY", 1, true, false);
        CachePolicy cachePolicy3 = new CachePolicy("WRITE_ONLY", 2, false, true);
        CachePolicy cachePolicy4 = new CachePolicy("DISABLED", 3, false, false);
        f33802d = cachePolicy4;
        CachePolicy[] cachePolicyArr = {cachePolicy, cachePolicy2, cachePolicy3, cachePolicy4};
        f33803f = cachePolicyArr;
        f33804g = EnumEntriesKt.m18563a(cachePolicyArr);
    }

    public CachePolicy(String str, int i, boolean z2, boolean z3) {
        this.f33805a = z2;
        this.f33806b = z3;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) f33803f.clone();
    }
}
