package io.ktor.http.cio;

import io.ktor.utils.p043io.WriterScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$1", m18559f = "ChunkedTransferEncoding.kt", m18560l = {48}, m18561m = "invokeSuspend")
final class ChunkedTransferEncodingKt$decodeChunked$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation completion) {
        Intrinsics.m18599g(completion, "completion");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChunkedTransferEncodingKt$decodeChunked$1 chunkedTransferEncodingKt$decodeChunked$1 = (ChunkedTransferEncodingKt$decodeChunked$1) create(obj, (Continuation) obj2);
        Unit unit = Unit.f51459a;
        chunkedTransferEncodingKt$decodeChunked$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        throw null;
    }
}
