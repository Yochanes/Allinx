package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/CombineSource;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class CombineSource {

    /* JADX INFO: renamed from: a */
    public static final CombineSource f30588a;

    /* JADX INFO: renamed from: b */
    public static final CombineSource f30589b;

    /* JADX INFO: renamed from: c */
    public static final CombineSource f30590c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ CombineSource[] f30591d;

    static {
        CombineSource combineSource = new CombineSource("INITIAL", 0);
        f30588a = combineSource;
        CombineSource combineSource2 = new CombineSource("RECEIVER", 1);
        f30589b = combineSource2;
        CombineSource combineSource3 = new CombineSource("OTHER", 2);
        f30590c = combineSource3;
        f30591d = new CombineSource[]{combineSource, combineSource2, combineSource3};
    }

    public static CombineSource valueOf(String str) {
        return (CombineSource) Enum.valueOf(CombineSource.class, str);
    }

    public static CombineSource[] values() {
        return (CombineSource[]) f30591d.clone();
    }
}
