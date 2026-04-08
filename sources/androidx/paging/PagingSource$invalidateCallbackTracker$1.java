package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Lkotlin/Function0;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class PagingSource$invalidateCallbackTracker$1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {

    /* JADX INFO: renamed from: a */
    public static final PagingSource$invalidateCallbackTracker$1 f31194a = new PagingSource$invalidateCallbackTracker$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0 it = (Function0) obj;
        Intrinsics.m18599g(it, "it");
        it.invoke();
        return Unit.f51459a;
    }
}
