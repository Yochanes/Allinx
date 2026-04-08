package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.DelayKt", m18559f = "Delay.kt", m18560l = {160}, m18561m = "awaitCancellation")
final class DelayKt$awaitCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55290a;

    /* JADX INFO: renamed from: b */
    public int f55291b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55290a = obj;
        this.f55291b |= Integer.MIN_VALUE;
        DelayKt.m20573a(this);
        return CoroutineSingletons.f51584a;
    }
}
