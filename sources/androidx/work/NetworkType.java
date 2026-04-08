package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/NetworkType;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class NetworkType {

    /* JADX INFO: renamed from: a */
    public static final NetworkType f32586a;

    /* JADX INFO: renamed from: b */
    public static final NetworkType f32587b;

    /* JADX INFO: renamed from: c */
    public static final NetworkType f32588c;

    /* JADX INFO: renamed from: d */
    public static final NetworkType f32589d;

    /* JADX INFO: renamed from: f */
    public static final NetworkType f32590f;

    /* JADX INFO: renamed from: g */
    public static final NetworkType f32591g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ NetworkType[] f32592i;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        f32586a = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        f32587b = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        f32588c = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        f32589d = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        f32590f = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        f32591g = networkType6;
        f32592i = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f32592i.clone();
    }
}
