package io.reactivex.rxjava3.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BackpressureKind {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ BackpressureKind[] f49356a = {new BackpressureKind("PASS_THROUGH", 0), new BackpressureKind("FULL", 1), new BackpressureKind("SPECIAL", 2), new BackpressureKind("UNBOUNDED_IN", 3), new BackpressureKind("ERROR", 4), new BackpressureKind("NONE", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureKind EF5;

    public static BackpressureKind valueOf(String str) {
        return (BackpressureKind) Enum.valueOf(BackpressureKind.class, str);
    }

    public static BackpressureKind[] values() {
        return (BackpressureKind[]) f49356a.clone();
    }
}
