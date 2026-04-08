package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/internal/SendingCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SendingCollector<T> implements FlowCollector<T> {

    /* JADX INFO: renamed from: a */
    public final SendChannel f56304a;

    public SendingCollector(SendChannel sendChannel) {
        this.f56304a = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objMo11415w = this.f56304a.mo11415w(obj, continuation);
        return objMo11415w == CoroutineSingletons.f51584a ? objMo11415w : Unit.f51459a;
    }
}
