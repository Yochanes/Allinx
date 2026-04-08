package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.runtime.ProduceStateScopeImpl", m18559f = "ProduceState.kt", m18560l = {205}, m18561m = "awaitDispose")
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16439a;

    /* JADX INFO: renamed from: b */
    public int f16440b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16439a = obj;
        this.f16440b |= Integer.MIN_VALUE;
        throw null;
    }
}
