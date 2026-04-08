package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FlowCollector f56083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.IntRef f56084b;

    public FlowKt__TransformKt$withIndex$1$1(Ref.IntRef intRef, FlowCollector flowCollector) {
        this.f56083a = flowCollector;
        this.f56084b = intRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        if (continuation instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) continuation;
            int i = flowKt__TransformKt$withIndex$1$1$emit$1.f56087c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.f56087c = i - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__TransformKt$withIndex$1$1$emit$1.f56085a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__TransformKt$withIndex$1$1$emit$1.f56087c;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            Ref.IntRef intRef = this.f56084b;
            int i3 = intRef.f51657a;
            intRef.f51657a = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            IndexedValue indexedValue = new IndexedValue(i3, obj);
            flowKt__TransformKt$withIndex$1$1$emit$1.f56087c = 1;
            if (this.f56083a.emit(indexedValue, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj2);
        }
        return Unit.f51459a;
    }
}
