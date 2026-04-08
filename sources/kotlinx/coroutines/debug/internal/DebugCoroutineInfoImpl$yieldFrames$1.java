package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", m18559f = "DebugCoroutineInfoImpl.kt", m18560l = {169}, m18561m = "yieldFrames")
final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55656a;

    /* JADX INFO: renamed from: b */
    public int f55657b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55656a = obj;
        this.f55657b |= Integer.MIN_VALUE;
        throw null;
    }
}
