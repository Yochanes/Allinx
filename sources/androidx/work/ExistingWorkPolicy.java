package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/ExistingWorkPolicy;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ExistingWorkPolicy {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ExistingWorkPolicy[] f32572a = {new ExistingWorkPolicy("REPLACE", 0), new ExistingWorkPolicy("KEEP", 1), new ExistingWorkPolicy("APPEND", 2), new ExistingWorkPolicy("APPEND_OR_REPLACE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ExistingWorkPolicy EF5;

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) f32572a.clone();
    }
}
