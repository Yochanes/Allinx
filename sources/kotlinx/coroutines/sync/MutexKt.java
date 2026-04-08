package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class MutexKt {

    /* JADX INFO: renamed from: a */
    public static final Symbol f56555a = new Symbol("NO_OWNER");

    /* JADX INFO: renamed from: b */
    public static final Symbol f56556b = new Symbol("ALREADY_LOCKED_BY_OWNER");

    /* JADX INFO: renamed from: a */
    public static MutexImpl m20913a() {
        return new MutexImpl(false);
    }
}
