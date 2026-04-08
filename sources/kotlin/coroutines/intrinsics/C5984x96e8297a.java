package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;

/* JADX INFO: renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class C5984x96e8297a extends RestrictedContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f51589a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.f51589a;
        if (i == 0) {
            this.f51589a = 1;
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f51589a = 2;
        ResultKt.m18313b(obj);
        return obj;
    }
}
