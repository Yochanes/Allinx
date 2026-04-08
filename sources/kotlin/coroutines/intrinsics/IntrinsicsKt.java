package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt", "kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class IntrinsicsKt extends IntrinsicsKt__IntrinsicsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static Continuation m18555a(Continuation continuation, Continuation continuation2, Function2 function2) {
        Intrinsics.m18599g(function2, "<this>");
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(continuation, continuation2);
        }
        CoroutineContext context = continuation2.getF56402a();
        return context == EmptyCoroutineContext.f51581a ? new C5988xa50de662(continuation2, continuation, function2) : new C5989xa50de663(continuation2, context, function2, continuation);
    }

    /* JADX INFO: renamed from: b */
    public static Continuation m18556b(Continuation continuation) {
        Continuation<Object> continuationIntercepted;
        Intrinsics.m18599g(continuation, "<this>");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuationIntercepted = continuationImpl.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    /* JADX INFO: renamed from: c */
    public static Object m18557c(Function2 function2, Object obj, Continuation continuation) {
        Intrinsics.m18599g(function2, "<this>");
        CoroutineContext context = continuation.getF56402a();
        Object c5990xcc43cd03 = context == EmptyCoroutineContext.f51581a ? new C5990xcc43cd03(continuation) : new C5991xcc43cd04(continuation, context);
        TypeIntrinsics.m18629e(2, function2);
        return function2.invoke(obj, c5990xcc43cd03);
    }
}
