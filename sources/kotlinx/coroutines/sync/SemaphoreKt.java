package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SemaphoreKt {

    /* JADX INFO: renamed from: a */
    public static final int f56568a = SystemPropsKt.m20856d(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* JADX INFO: renamed from: b */
    public static final Symbol f56569b = new Symbol("PERMIT");

    /* JADX INFO: renamed from: c */
    public static final Symbol f56570c = new Symbol("TAKEN");

    /* JADX INFO: renamed from: d */
    public static final Symbol f56571d = new Symbol("BROKEN");

    /* JADX INFO: renamed from: e */
    public static final Symbol f56572e = new Symbol("CANCELLED");

    /* JADX INFO: renamed from: f */
    public static final int f56573f = SystemPropsKt.m20856d(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    /* JADX INFO: renamed from: a */
    public static Semaphore m20916a(int i) {
        return new SemaphoreImpl(i, 0);
    }
}
