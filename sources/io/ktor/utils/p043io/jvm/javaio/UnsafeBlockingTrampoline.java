package io.ktor.utils.p043io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/jvm/javaio/UnsafeBlockingTrampoline;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
final class UnsafeBlockingTrampoline extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c */
    public static final UnsafeBlockingTrampoline f47496c = new UnsafeBlockingTrampoline();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: I0 */
    public final boolean mo9154I0(CoroutineContext context) {
        Intrinsics.m18599g(context, "context");
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext context, Runnable block) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(block, "block");
        block.run();
    }
}
