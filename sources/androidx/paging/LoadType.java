package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/LoadType;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class LoadType {

    /* JADX INFO: renamed from: a */
    public static final LoadType f30752a;

    /* JADX INFO: renamed from: b */
    public static final LoadType f30753b;

    /* JADX INFO: renamed from: c */
    public static final LoadType f30754c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ LoadType[] f30755d;

    static {
        LoadType loadType = new LoadType("REFRESH", 0);
        f30752a = loadType;
        LoadType loadType2 = new LoadType("PREPEND", 1);
        f30753b = loadType2;
        LoadType loadType3 = new LoadType("APPEND", 2);
        f30754c = loadType3;
        f30755d = new LoadType[]{loadType, loadType2, loadType3};
    }

    public static LoadType valueOf(String str) {
        return (LoadType) Enum.valueOf(LoadType.class, str);
    }

    public static LoadType[] values() {
        return (LoadType[]) f30755d.clone();
    }
}
