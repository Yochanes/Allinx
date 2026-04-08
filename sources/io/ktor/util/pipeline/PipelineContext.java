package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ContextDsl
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "TSubject", "TContext", "Lkotlinx/coroutines/CoroutineScope;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface PipelineContext<TSubject, TContext> extends CoroutineScope {
    /* JADX INFO: renamed from: I0 */
    Object mo17208I0(Object obj, Continuation continuation);

    /* JADX INFO: renamed from: S */
    void mo17209S();

    Object getContext();

    /* JADX INFO: renamed from: x */
    Object mo17212x(Continuation continuation);
}
