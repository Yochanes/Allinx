package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$3 implements Function1<DebugProbesImpl.CoroutineOwner<?>, Object> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConcurrentWeakMap concurrentWeakMap = DebugProbesImpl.f55658a;
        ((DebugProbesImpl.CoroutineOwner) obj).getClass();
        throw null;
    }
}
