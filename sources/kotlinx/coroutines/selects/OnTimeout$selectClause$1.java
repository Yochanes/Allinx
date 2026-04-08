package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements Function3<OnTimeout, SelectInstance<?>, Object, Unit> {

    /* JADX INFO: renamed from: a */
    public static final OnTimeout$selectClause$1 f56495a = new OnTimeout$selectClause$1(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OnTimeout onTimeout = (OnTimeout) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        long j = onTimeout.f56492a;
        Unit unit = Unit.f51459a;
        if (j <= 0) {
            selectInstance.mo20900e(unit);
            return unit;
        }
        OnTimeout$register$$inlined$Runnable$1 onTimeout$register$$inlined$Runnable$1 = new OnTimeout$register$$inlined$Runnable$1(selectInstance, onTimeout);
        Intrinsics.m18597e(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
        CoroutineContext coroutineContext = selectImplementation.f56506a;
        selectImplementation.f56508c = DelayKt.m20575c(coroutineContext).mo20567S(j, onTimeout$register$$inlined$Runnable$1, coroutineContext);
        return unit;
    }
}
