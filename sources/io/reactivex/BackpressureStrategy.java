package io.reactivex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BackpressureStrategy {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ BackpressureStrategy[] f47531a = {new BackpressureStrategy("MISSING", 0), new BackpressureStrategy("ERROR", 1), new BackpressureStrategy("BUFFER", 2), new BackpressureStrategy("DROP", 3), new BackpressureStrategy("LATEST", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureStrategy EF5;

    public static BackpressureStrategy valueOf(String str) {
        return (BackpressureStrategy) Enum.valueOf(BackpressureStrategy.class, str);
    }

    public static BackpressureStrategy[] values() {
        return (BackpressureStrategy[]) f47531a.clone();
    }
}
