package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/decode/DataSource;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DataSource {

    /* JADX INFO: renamed from: a */
    public static final DataSource f33468a;

    /* JADX INFO: renamed from: b */
    public static final DataSource f33469b;

    /* JADX INFO: renamed from: c */
    public static final DataSource f33470c;

    /* JADX INFO: renamed from: d */
    public static final DataSource f33471d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ DataSource[] f33472f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f33473g;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        f33468a = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        f33469b = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        f33470c = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        f33471d = dataSource4;
        DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4};
        f33472f = dataSourceArr;
        f33473g = EnumEntriesKt.m18563a(dataSourceArr);
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f33472f.clone();
    }
}
