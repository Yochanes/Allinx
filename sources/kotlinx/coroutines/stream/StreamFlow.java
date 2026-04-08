package kotlinx.coroutines.stream;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class StreamFlow<T> implements Flow<T> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56543a = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "kotlinx.coroutines.stream.StreamFlow", m18559f = "Stream.kt", m18560l = {22}, m18561m = "collect")
    final class C63391 extends ContinuationImpl {

        /* JADX INFO: renamed from: a */
        public FlowCollector f56544a;

        /* JADX INFO: renamed from: b */
        public Iterator f56545b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f56546c;

        /* JADX INFO: renamed from: f */
        public int f56548f;

        public C63391(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56546c = obj;
            this.f56548f |= Integer.MIN_VALUE;
            StreamFlow.this.collect(null, this);
            return CoroutineSingletons.f51584a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        C63391 c63391;
        StreamFlow<T> streamFlow;
        if (continuation instanceof C63391) {
            c63391 = (C63391) continuation;
            int i = c63391.f56548f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c63391.f56548f = i - Integer.MIN_VALUE;
            } else {
                c63391 = new C63391(continuation);
            }
        }
        Object obj = c63391.f56546c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c63391.f56548f;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            if (!f56543a.compareAndSet(this, 0, 1)) {
                throw new IllegalStateException("Stream.consumeAsFlow can be collected only once");
            }
            try {
                throw null;
            } catch (Throwable unused) {
                streamFlow = this;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it = c63391.f56545b;
            FlowCollector flowCollector2 = c63391.f56544a;
            try {
                ResultKt.m18313b(obj);
                while (it.hasNext()) {
                    Object next = it.next();
                    c63391.f56544a = flowCollector2;
                    c63391.f56545b = it;
                    c63391.f56548f = 1;
                    if (flowCollector2.emit(next, c63391) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                throw null;
            } catch (Throwable unused2) {
                streamFlow = null;
            }
        }
        streamFlow.getClass();
        throw null;
    }
}
