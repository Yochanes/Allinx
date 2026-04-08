package androidx.paging;

import androidx.paging.PageFetcher$flow$1;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.FlowExtKt$simpleScan$1", m18559f = "FlowExt.kt", m18560l = {54, 55}, m18561m = "invokeSuspend")
final class FlowExtKt$simpleScan$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f30678a;

    /* JADX INFO: renamed from: b */
    public int f30679b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30680c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 f30681d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Function3 f30682f;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleScan$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C20521<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f30683a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function3 f30684b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FlowCollector f30685c;

        public C20521(Ref.ObjectRef objectRef, Function3 function3, FlowCollector flowCollector) {
            this.f30683a = objectRef;
            this.f30684b = function3;
            this.f30685c = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        
            if (r6.emit(r7, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            FlowExtKt$simpleScan$1$1$emit$1 flowExtKt$simpleScan$1$1$emit$1;
            Ref.ObjectRef objectRef;
            C20521<T> c20521;
            if (continuation instanceof FlowExtKt$simpleScan$1$1$emit$1) {
                flowExtKt$simpleScan$1$1$emit$1 = (FlowExtKt$simpleScan$1$1$emit$1) continuation;
                int i = flowExtKt$simpleScan$1$1$emit$1.f30690f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowExtKt$simpleScan$1$1$emit$1.f30690f = i - Integer.MIN_VALUE;
                } else {
                    flowExtKt$simpleScan$1$1$emit$1 = new FlowExtKt$simpleScan$1$1$emit$1(this, continuation);
                }
            }
            Object obj2 = flowExtKt$simpleScan$1$1$emit$1.f30688c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = flowExtKt$simpleScan$1$1$emit$1.f30690f;
            if (i2 == 0) {
                ResultKt.m18313b(obj2);
                Ref.ObjectRef objectRef2 = this.f30683a;
                Object obj3 = objectRef2.f51659a;
                flowExtKt$simpleScan$1$1$emit$1.f30686a = this;
                flowExtKt$simpleScan$1$1$emit$1.f30687b = objectRef2;
                flowExtKt$simpleScan$1$1$emit$1.f30690f = 1;
                Object objInvoke = ((PageFetcher$flow$1.C20602) this.f30684b).invoke(obj3, obj, flowExtKt$simpleScan$1$1$emit$1);
                if (objInvoke != coroutineSingletons) {
                    obj2 = objInvoke;
                    objectRef = objectRef2;
                    c20521 = this;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj2);
                return Unit.f51459a;
            }
            objectRef = flowExtKt$simpleScan$1$1$emit$1.f30687b;
            c20521 = (C20521) flowExtKt$simpleScan$1$1$emit$1.f30686a;
            ResultKt.m18313b(obj2);
            objectRef.f51659a = obj2;
            FlowCollector flowCollector = c20521.f30685c;
            Object obj4 = c20521.f30683a.f51659a;
            flowExtKt$simpleScan$1$1$emit$1.f30686a = null;
            flowExtKt$simpleScan$1$1$emit$1.f30687b = null;
            flowExtKt$simpleScan$1$1$emit$1.f30690f = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1(FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.f30681d = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        this.f30682f = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.f30681d, this.f30682f, continuation);
        flowExtKt$simpleScan$1.f30680c = obj;
        return flowExtKt$simpleScan$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleScan$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r6.f30681d.collect(r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f30679b;
        if (i == 0) {
            ResultKt.m18313b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.f30680c;
            objectRef = new Ref.ObjectRef();
            objectRef.f51659a = null;
            this.f30680c = flowCollector2;
            this.f30678a = objectRef;
            this.f30679b = 1;
            if (flowCollector2.emit(null, this) != coroutineSingletons) {
                flowCollector = flowCollector2;
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
        objectRef = this.f30678a;
        flowCollector = (FlowCollector) this.f30680c;
        ResultKt.m18313b(obj);
        C20521 c20521 = new C20521(objectRef, this.f30682f, flowCollector);
        this.f30680c = null;
        this.f30678a = null;
        this.f30679b = 2;
    }
}
