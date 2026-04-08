package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/BackoffPolicy;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BackoffPolicy {

    /* JADX INFO: renamed from: a */
    public static final BackoffPolicy f32525a;

    /* JADX INFO: renamed from: b */
    public static final BackoffPolicy f32526b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ BackoffPolicy[] f32527c;

    static {
        BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
        f32525a = backoffPolicy;
        BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
        f32526b = backoffPolicy2;
        f32527c = new BackoffPolicy[]{backoffPolicy, backoffPolicy2};
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) f32527c.clone();
    }
}
