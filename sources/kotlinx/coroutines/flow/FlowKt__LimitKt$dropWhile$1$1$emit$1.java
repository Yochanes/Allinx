package kotlinx.coroutines.flow;

import com.google.zxing.aztec.encoder.Encoder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m18559f = "Limit.kt", m18560l = {Encoder.DEFAULT_EC_PERCENT, 34, 36}, m18561m = "emit")
final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f55898a;

    /* JADX INFO: renamed from: b */
    public Object f55899b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f55900c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1 f55901d;

    /* JADX INFO: renamed from: f */
    public int f55902f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1, Continuation continuation) {
        super(continuation);
        this.f55901d = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55900c = obj;
        this.f55902f |= Integer.MIN_VALUE;
        return this.f55901d.emit(null, this);
    }
}
