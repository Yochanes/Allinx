package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0082@"}, m18302d2 = {"proceedLoop", "", "TSubject", "TContext", "continuation", "Lkotlin/coroutines/Continuation;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.util.pipeline.DebugPipelineContext", m18559f = "DebugPipelineContext.kt", m18560l = {82}, m18561m = "proceedLoop")
final class DebugPipelineContext$proceedLoop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46618a;

    /* JADX INFO: renamed from: b */
    public int f46619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DebugPipelineContext f46620c;

    /* JADX INFO: renamed from: d */
    public DebugPipelineContext f46621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPipelineContext$proceedLoop$1(DebugPipelineContext debugPipelineContext, Continuation continuation) {
        super(continuation);
        this.f46620c = debugPipelineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46618a = obj;
        this.f46619b |= Integer.MIN_VALUE;
        return this.f46620c.m17211b(this);
    }
}
