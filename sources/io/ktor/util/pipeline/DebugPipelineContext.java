package io.ktor.util.pipeline;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ContextDsl
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/util/pipeline/DebugPipelineContext;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/util/pipeline/PipelineExecutor;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DebugPipelineContext<TSubject, TContext> implements PipelineContext<TSubject, TContext>, PipelineExecutor<TSubject> {

    /* JADX INFO: renamed from: a */
    public Object f46613a;

    /* JADX INFO: renamed from: b */
    public int f46614b;

    /* JADX INFO: renamed from: c */
    public final Object f46615c;

    /* JADX INFO: renamed from: d */
    public final List f46616d;

    /* JADX INFO: renamed from: f */
    public final CoroutineContext f46617f;

    public DebugPipelineContext(Object context, List interceptors, Object subject, CoroutineContext coroutineContext) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(interceptors, "interceptors");
        Intrinsics.m18599g(subject, "subject");
        this.f46615c = context;
        this.f46616d = interceptors;
        this.f46617f = coroutineContext;
        this.f46613a = subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    /* JADX INFO: renamed from: I0 */
    public final Object mo17208I0(Object obj, Continuation continuation) {
        this.f46613a = obj;
        return mo17212x(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    /* JADX INFO: renamed from: S */
    public final void mo17209S() {
        this.f46614b = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineExecutor
    /* JADX INFO: renamed from: a */
    public final Object mo17210a(Object obj, ContinuationImpl continuationImpl) {
        this.f46614b = 0;
        this.f46613a = obj;
        return mo17212x(continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17211b(Continuation continuation) {
        DebugPipelineContext$proceedLoop$1 debugPipelineContext$proceedLoop$1;
        DebugPipelineContext<TSubject, TContext> debugPipelineContext;
        Function3 function3;
        Object obj;
        if (continuation instanceof DebugPipelineContext$proceedLoop$1) {
            debugPipelineContext$proceedLoop$1 = (DebugPipelineContext$proceedLoop$1) continuation;
            int i = debugPipelineContext$proceedLoop$1.f46619b;
            if ((i & Integer.MIN_VALUE) != 0) {
                debugPipelineContext$proceedLoop$1.f46619b = i - Integer.MIN_VALUE;
            } else {
                debugPipelineContext$proceedLoop$1 = new DebugPipelineContext$proceedLoop$1(this, continuation);
            }
        }
        Object obj2 = debugPipelineContext$proceedLoop$1.f46618a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = debugPipelineContext$proceedLoop$1.f46619b;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            debugPipelineContext = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            debugPipelineContext = debugPipelineContext$proceedLoop$1.f46621d;
            ResultKt.m18313b(obj2);
        }
        do {
            int i3 = debugPipelineContext.f46614b;
            if (i3 != -1) {
                List list = debugPipelineContext.f46616d;
                if (i3 >= list.size()) {
                    debugPipelineContext.f46614b = -1;
                } else {
                    function3 = (Function3) list.get(i3);
                    debugPipelineContext.f46614b = i3 + 1;
                    obj = debugPipelineContext.f46613a;
                    debugPipelineContext$proceedLoop$1.f46621d = debugPipelineContext;
                    debugPipelineContext$proceedLoop$1.f46619b = 1;
                }
            }
            return debugPipelineContext.f46613a;
        } while (function3.invoke(debugPipelineContext, obj, debugPipelineContext$proceedLoop$1) != coroutineSingletons);
        return coroutineSingletons;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final Object getF46615c() {
        return this.f46615c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF46617f() {
        return this.f46617f;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    /* JADX INFO: renamed from: x */
    public final Object mo17212x(Continuation continuation) {
        int i = this.f46614b;
        if (i < 0) {
            return this.f46613a;
        }
        if (i < this.f46616d.size()) {
            return m17211b(continuation);
        }
        this.f46614b = -1;
        return this.f46613a;
    }
}
