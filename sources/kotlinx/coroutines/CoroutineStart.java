package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CoroutineStart {

    /* JADX INFO: renamed from: a */
    public static final CoroutineStart f55281a;

    /* JADX INFO: renamed from: b */
    public static final CoroutineStart f55282b;

    /* JADX INFO: renamed from: c */
    public static final CoroutineStart f55283c;

    /* JADX INFO: renamed from: d */
    public static final CoroutineStart f55284d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ CoroutineStart[] f55285f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f55286g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CoroutineStart coroutineStart = CoroutineStart.f55281a;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CoroutineStart coroutineStart2 = CoroutineStart.f55281a;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CoroutineStart coroutineStart3 = CoroutineStart.f55281a;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        CoroutineStart coroutineStart = new CoroutineStart("DEFAULT", 0);
        f55281a = coroutineStart;
        CoroutineStart coroutineStart2 = new CoroutineStart("LAZY", 1);
        f55282b = coroutineStart2;
        CoroutineStart coroutineStart3 = new CoroutineStart("ATOMIC", 2);
        f55283c = coroutineStart3;
        CoroutineStart coroutineStart4 = new CoroutineStart("UNDISPATCHED", 3);
        f55284d = coroutineStart4;
        CoroutineStart[] coroutineStartArr = {coroutineStart, coroutineStart2, coroutineStart3, coroutineStart4};
        f55285f = coroutineStartArr;
        f55286g = EnumEntriesKt.m18563a(coroutineStartArr);
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) f55285f.clone();
    }
}
