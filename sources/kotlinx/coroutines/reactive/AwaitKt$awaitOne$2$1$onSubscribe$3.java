package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class AwaitKt$awaitOne$2$1$onSubscribe$3 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Subscription f56387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Mode f56388b;

    public AwaitKt$awaitOne$2$1$onSubscribe$3(Subscription subscription, Mode mode) {
        this.f56387a = subscription;
        this.f56388b = mode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Mode mode = Mode.f56408b;
        Mode mode2 = this.f56388b;
        this.f56387a.request((mode2 == mode || mode2 == Mode.f56409c) ? 1L : Long.MAX_VALUE);
        return Unit.f51459a;
    }
}
