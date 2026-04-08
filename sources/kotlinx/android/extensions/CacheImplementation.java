package kotlinx.android.extensions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "Companion", "kotlin-android-extensions-runtime"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class CacheImplementation {

    /* JADX INFO: renamed from: a */
    public static final CacheImplementation f55236a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ CacheImplementation[] f55237b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f55238c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "kotlin-android-extensions-runtime"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        CacheImplementation cacheImplementation = new CacheImplementation("SPARSE_ARRAY", 0);
        CacheImplementation cacheImplementation2 = new CacheImplementation("HASH_MAP", 1);
        f55236a = cacheImplementation2;
        CacheImplementation[] cacheImplementationArr = {cacheImplementation, cacheImplementation2, new CacheImplementation("NO_CACHE", 2)};
        f55237b = cacheImplementationArr;
        f55238c = EnumEntriesKt.m18563a(cacheImplementationArr);
    }

    public static CacheImplementation valueOf(String str) {
        return (CacheImplementation) Enum.valueOf(CacheImplementation.class, str);
    }

    public static CacheImplementation[] values() {
        return (CacheImplementation[]) f55237b.clone();
    }
}
