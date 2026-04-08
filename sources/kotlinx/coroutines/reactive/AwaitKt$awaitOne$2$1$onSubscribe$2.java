package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class AwaitKt$awaitOne$2$1$onSubscribe$2 implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AwaitKt$awaitOne$2$1 f56384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Subscription f56385b;

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    final class C63361 implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Subscription f56386a;

        public C63361(Subscription subscription) {
            this.f56386a = subscription;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.f56386a.cancel();
            return Unit.f51459a;
        }
    }

    public AwaitKt$awaitOne$2$1$onSubscribe$2(AwaitKt$awaitOne$2$1 awaitKt$awaitOne$2$1, Subscription subscription) {
        this.f56384a = awaitKt$awaitOne$2$1;
        this.f56385b = subscription;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f56384a.m20867a(new C63361(this.f56385b));
        return Unit.f51459a;
    }
}
