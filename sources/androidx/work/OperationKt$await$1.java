package androidx.work;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "androidx.work.OperationKt", m18559f = "Operation.kt", m18560l = {36}, m18561m = "await")
final class OperationKt$await$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32598a;

    /* JADX INFO: renamed from: b */
    public int f32599b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32598a = obj;
        int i = (this.f32599b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f32599b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        Intrinsics.m18598f(obj, "result.await()");
        return obj;
    }
}
