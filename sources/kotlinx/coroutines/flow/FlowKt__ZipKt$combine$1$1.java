package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\n"}, m18302d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", ""}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m18559f = "Zip.kt", m18560l = {29, 29}, m18561m = "invokeSuspend")
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f56102a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ FlowCollector f56103b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f56104c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SuspendLambda f56105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(Function3 function3, Continuation continuation) {
        super(3, continuation);
        this.f56105d = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f56105d, (Continuation) obj3);
        flowKt__ZipKt$combine$1$1.f56103b = (FlowCollector) obj;
        flowKt__ZipKt$combine$1$1.f56104c = (Object[]) obj2;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(Unit.f51459a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f56102a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            flowCollector = this.f56103b;
            Object[] objArr = this.f56104c;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f56103b = flowCollector;
            this.f56102a = 1;
            obj = this.f56105d.invoke(obj2, obj3, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return Unit.f51459a;
        }
        flowCollector = this.f56103b;
        ResultKt.m18313b(obj);
        this.f56103b = null;
        this.f56102a = 2;
    }
}
