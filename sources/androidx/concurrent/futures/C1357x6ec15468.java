package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m18302d2 = {"<anonymous>", "", "T", "it", "", "invoke", "androidx/concurrent/futures/ListenableFutureKt$await$2$1"}, m18303k = 3, m18304mv = {1, 1, 16})
final class C1357x6ec15468 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenableFuture f20837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357x6ec15468(ListenableFuture listenableFuture) {
        super(1);
        this.f20837a = listenableFuture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f20837a.cancel(false);
        return Unit.f51459a;
    }
}
