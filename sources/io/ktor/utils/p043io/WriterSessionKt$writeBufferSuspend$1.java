package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0082@"}, m18302d2 = {"writeBufferSuspend", "", "session", "Lio/ktor/utils/io/WriterSuspendSession;", "desiredSpace", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/core/Buffer;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.WriterSessionKt", m18559f = "WriterSession.kt", m18560l = {91}, m18561m = "writeBufferSuspend")
final class WriterSessionKt$writeBufferSuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47318a;

    /* JADX INFO: renamed from: b */
    public int f47319b;

    /* JADX INFO: renamed from: c */
    public WriterSuspendSession f47320c;

    /* JADX INFO: renamed from: d */
    public int f47321d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47318a = obj;
        this.f47319b |= Integer.MIN_VALUE;
        return WriterSessionKt.m17403d(null, 0, this);
    }
}
