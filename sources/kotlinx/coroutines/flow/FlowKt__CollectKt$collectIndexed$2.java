package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 176)
@SourceDebugExtension
public final class FlowKt__CollectKt$collectIndexed$2 implements FlowCollector<Object> {

    /* JADX INFO: renamed from: a */
    public int f55750a;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.f55750a;
        this.f55750a = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        new Integer(i);
        throw null;
    }
}
