package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class CoroutineAdapterKt$asListenableFuture$1$1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f31438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Deferred f31439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer completer, Deferred deferred) {
        super(1);
        this.f31438a = completer;
        this.f31439b = deferred;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        CallbackToFutureAdapter.Completer completer = this.f31438a;
        if (th == null) {
            completer.m6742b(this.f31439b.mo20571n());
        } else if (th instanceof CancellationException) {
            completer.m6743c();
        } else {
            completer.m6744d(th);
        }
        return Unit.f51459a;
    }
}
