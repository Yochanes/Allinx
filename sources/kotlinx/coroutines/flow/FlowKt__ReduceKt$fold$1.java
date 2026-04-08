package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m18559f = "Reduce.kt", m18560l = {40}, m18561m = "fold")
final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f55987a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55988b;

    /* JADX INFO: renamed from: c */
    public int f55989c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55988b = obj;
        int i = (this.f55989c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55989c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef objectRef = this.f55987a;
            ResultKt.m18313b(obj);
            return objectRef.f51659a;
        }
        ResultKt.m18313b(obj);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.f51659a = null;
        this.f55987a = objectRef2;
        this.f55989c = 1;
        throw null;
    }
}
