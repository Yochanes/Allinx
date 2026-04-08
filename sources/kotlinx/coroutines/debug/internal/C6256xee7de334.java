package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C6256xee7de334 implements Function1<DebugProbesImpl.CoroutineOwner<?>, DebuggerInfo> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConcurrentWeakMap concurrentWeakMap = DebugProbesImpl.f55658a;
        ((DebugProbesImpl.CoroutineOwner) obj).getClass();
        throw null;
    }
}
