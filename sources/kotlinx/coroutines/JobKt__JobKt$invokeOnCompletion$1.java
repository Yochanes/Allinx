package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((JobNode) this.receiver).mo20498l((Throwable) obj);
        return Unit.f51459a;
    }
}
