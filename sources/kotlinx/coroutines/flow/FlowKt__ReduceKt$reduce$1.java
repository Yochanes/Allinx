package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m18559f = "Reduce.kt", m18560l = {18}, m18561m = "reduce")
final class FlowKt__ReduceKt$reduce$1<S, T extends S> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f55999a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f56000b;

    /* JADX INFO: renamed from: c */
    public int f56001c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56000b = obj;
        int i = (this.f56001c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f56001c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        Symbol symbol = NullSurrogateKt.f56293a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f51659a = symbol;
            this.f55999a = objectRef;
            this.f56001c = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRef2 = this.f55999a;
        ResultKt.m18313b(obj);
        Object obj2 = objectRef2.f51659a;
        if (obj2 != symbol) {
            return obj2;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }
}
