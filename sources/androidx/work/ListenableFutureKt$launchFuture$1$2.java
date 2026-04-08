package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.work.ListenableFutureKt$launchFuture$1$2", m18559f = "ListenableFuture.kt", m18560l = {42}, m18561m = "invokeSuspend")
final class ListenableFutureKt$launchFuture$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f32577a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32578b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SuspendLambda f32579c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f32580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$launchFuture$1$2(Function2 function2, CallbackToFutureAdapter.Completer completer, Continuation continuation) {
        super(2, continuation);
        this.f32579c = (SuspendLambda) function2;
        this.f32580d = completer;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.f32579c, this.f32580d, continuation);
        listenableFutureKt$launchFuture$1$2.f32578b = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ListenableFutureKt$launchFuture$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f32577a;
        CallbackToFutureAdapter.Completer completer = this.f32580d;
        try {
            if (i == 0) {
                ResultKt.m18313b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f32578b;
                ?? r1 = this.f32579c;
                this.f32577a = 1;
                obj = r1.invoke(coroutineScope, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
            }
            completer.m6742b(obj);
        } catch (CancellationException unused) {
            completer.m6743c();
        } catch (Throwable th) {
            completer.m6744d(th);
        }
        return Unit.f51459a;
    }
}
