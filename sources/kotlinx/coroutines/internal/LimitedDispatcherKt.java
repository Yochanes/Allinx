package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LimitedDispatcherKt {
    /* JADX INFO: renamed from: a */
    public static final void m20826a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Expected positive parallelism level, but got ").toString());
        }
    }
}
