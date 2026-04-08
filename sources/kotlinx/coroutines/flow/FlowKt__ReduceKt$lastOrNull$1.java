package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m18559f = "Reduce.kt", m18560l = {163}, m18561m = "lastOrNull")
final class FlowKt__ReduceKt$lastOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f55996a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55997b;

    /* JADX INFO: renamed from: c */
    public int f55998c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55997b = obj;
        int i = (this.f55998c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55998c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f55996a = new Ref.ObjectRef();
            this.f55998c = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRef = this.f55996a;
        ResultKt.m18313b(obj);
        return objectRef.f51659a;
    }
}
