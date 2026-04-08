package io.ktor.util;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import me.jessyan.autosize.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.util.CryptoKt__CryptoJvmKt$sha1$1", m18559f = "CryptoJvm.kt", m18560l = {BuildConfig.VERSION_CODE}, m18561m = "invokeSuspend")
final class CryptoKt__CryptoJvmKt$sha1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation completion) {
        Intrinsics.m18599g(completion, "completion");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((CryptoKt__CryptoJvmKt$sha1$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        Intrinsics.m18598f(MessageDigest.getInstance("SHA1"), "MessageDigest.getInstance(name)");
        throw null;
    }
}
