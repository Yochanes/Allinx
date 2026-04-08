package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.time.TimeSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    /* JADX INFO: renamed from: a */
    public static final long f55229a = System.nanoTime();

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f55230b = 0;

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
