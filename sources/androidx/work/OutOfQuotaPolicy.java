package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/OutOfQuotaPolicy;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class OutOfQuotaPolicy {

    /* JADX INFO: renamed from: a */
    public static final OutOfQuotaPolicy f32600a;

    /* JADX INFO: renamed from: b */
    public static final OutOfQuotaPolicy f32601b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ OutOfQuotaPolicy[] f32602c;

    static {
        OutOfQuotaPolicy outOfQuotaPolicy = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f32600a = outOfQuotaPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy2 = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
        f32601b = outOfQuotaPolicy2;
        f32602c = new OutOfQuotaPolicy[]{outOfQuotaPolicy, outOfQuotaPolicy2};
    }

    public static OutOfQuotaPolicy valueOf(String str) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, str);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) f32602c.clone();
    }
}
