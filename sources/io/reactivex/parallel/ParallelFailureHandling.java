package io.reactivex.parallel;

import io.reactivex.annotations.Experimental;
import io.reactivex.functions.BiFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class ParallelFailureHandling implements BiFunction<Long, Throwable, ParallelFailureHandling> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ParallelFailureHandling[] f49298a = {new ParallelFailureHandling("STOP", 0), new ParallelFailureHandling("ERROR", 1), new ParallelFailureHandling("SKIP", 2), new ParallelFailureHandling("RETRY", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ParallelFailureHandling EF5;

    public static ParallelFailureHandling valueOf(String str) {
        return (ParallelFailureHandling) Enum.valueOf(ParallelFailureHandling.class, str);
    }

    public static ParallelFailureHandling[] values() {
        return (ParallelFailureHandling[]) f49298a.clone();
    }
}
