package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class AwaitKt$awaitOne$2$1$onNext$2 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Subscription f56382a;

    public AwaitKt$awaitOne$2$1$onNext$2(Subscription subscription) {
        this.f56382a = subscription;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f56382a.cancel();
        return Unit.f51459a;
    }
}
