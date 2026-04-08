package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.http.content.WriterContent$writeTo$2", m18559f = "WriterContent.kt", m18560l = {BuildConfig.VERSION_CODE}, m18561m = "invokeSuspend")
final class WriterContent$writeTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation completion) {
        Intrinsics.m18599g(completion, "completion");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((WriterContent$writeTo$2) create((Continuation) obj)).invokeSuspend(Unit.f51459a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        throw null;
    }
}
