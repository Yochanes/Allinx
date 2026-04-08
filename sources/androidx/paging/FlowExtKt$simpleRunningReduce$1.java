package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", m18559f = "FlowExt.kt", m18560l = {68}, m18561m = "invokeSuspend")
final class FlowExtKt$simpleRunningReduce$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f30666a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30667b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Flow f30668c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SuspendLambda f30669d;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C20511<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f30670a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SuspendLambda f30671b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FlowCollector f30672c;

        /* JADX WARN: Multi-variable type inference failed */
        public C20511(Ref.ObjectRef objectRef, Function3 function3, FlowCollector flowCollector) {
            this.f30670a = objectRef;
            this.f30671b = (SuspendLambda) function3;
            this.f30672c = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        
            if (r8.emit(r9, r0) != r1) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            FlowExtKt$simpleRunningReduce$1$1$emit$1 flowExtKt$simpleRunningReduce$1$1$emit$1;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            C20511<T> c20511;
            if (continuation instanceof FlowExtKt$simpleRunningReduce$1$1$emit$1) {
                flowExtKt$simpleRunningReduce$1$1$emit$1 = (FlowExtKt$simpleRunningReduce$1$1$emit$1) continuation;
                int i = flowExtKt$simpleRunningReduce$1$1$emit$1.f30677f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowExtKt$simpleRunningReduce$1$1$emit$1.f30677f = i - Integer.MIN_VALUE;
                } else {
                    flowExtKt$simpleRunningReduce$1$1$emit$1 = new FlowExtKt$simpleRunningReduce$1$1$emit$1(this, continuation);
                }
            }
            Object obj2 = flowExtKt$simpleRunningReduce$1$1$emit$1.f30675c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = flowExtKt$simpleRunningReduce$1$1$emit$1.f30677f;
            if (i2 == 0) {
                ResultKt.m18313b(obj2);
                objectRef = this.f30670a;
                Object obj3 = objectRef.f51659a;
                if (obj3 != FlowExtKt.f30647a) {
                    flowExtKt$simpleRunningReduce$1$1$emit$1.f30673a = this;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.f30674b = objectRef;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.f30677f = 1;
                    Object objInvoke = this.f30671b.invoke(obj3, obj, flowExtKt$simpleRunningReduce$1$1$emit$1);
                    if (objInvoke != coroutineSingletons) {
                        obj2 = objInvoke;
                        objectRef2 = objectRef;
                        c20511 = this;
                    }
                    return coroutineSingletons;
                }
                c20511 = this;
                objectRef.f51659a = obj;
                FlowCollector flowCollector = c20511.f30672c;
                Object obj4 = c20511.f30670a.f51659a;
                flowExtKt$simpleRunningReduce$1$1$emit$1.f30673a = null;
                flowExtKt$simpleRunningReduce$1$1$emit$1.f30674b = null;
                flowExtKt$simpleRunningReduce$1$1$emit$1.f30677f = 2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m18313b(obj2);
                    return Unit.f51459a;
                }
                objectRef2 = flowExtKt$simpleRunningReduce$1$1$emit$1.f30674b;
                c20511 = (C20511) flowExtKt$simpleRunningReduce$1$1$emit$1.f30673a;
                ResultKt.m18313b(obj2);
            }
            Object obj5 = obj2;
            objectRef = objectRef2;
            obj = obj5;
            objectRef.f51659a = obj;
            FlowCollector flowCollector2 = c20511.f30672c;
            Object obj42 = c20511.f30670a.f51659a;
            flowExtKt$simpleRunningReduce$1$1$emit$1.f30673a = null;
            flowExtKt$simpleRunningReduce$1$1$emit$1.f30674b = null;
            flowExtKt$simpleRunningReduce$1$1$emit$1.f30677f = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleRunningReduce$1(Flow flow, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.f30668c = flow;
        this.f30669d = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.f30668c, this.f30669d, continuation);
        flowExtKt$simpleRunningReduce$1.f30667b = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleRunningReduce$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f30666a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f30667b;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f51659a = FlowExtKt.f30647a;
            C20511 c20511 = new C20511(objectRef, this.f30669d, flowCollector);
            this.f30666a = 1;
            if (this.f30668c.collect(c20511, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return Unit.f51459a;
    }
}
