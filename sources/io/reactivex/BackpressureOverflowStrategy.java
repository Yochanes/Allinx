package io.reactivex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BackpressureOverflowStrategy {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ BackpressureOverflowStrategy[] f47530a = {new BackpressureOverflowStrategy("ERROR", 0), new BackpressureOverflowStrategy("DROP_OLDEST", 1), new BackpressureOverflowStrategy("DROP_LATEST", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureOverflowStrategy EF5;

    public static BackpressureOverflowStrategy valueOf(String str) {
        return (BackpressureOverflowStrategy) Enum.valueOf(BackpressureOverflowStrategy.class, str);
    }

    public static BackpressureOverflowStrategy[] values() {
        return (BackpressureOverflowStrategy[]) f47530a.clone();
    }
}
