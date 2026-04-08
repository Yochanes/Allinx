package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/room/TransactionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "room-ktx_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class TransactionElement implements CoroutineContext.Element {

    /* JADX INFO: renamed from: c */
    public static final Key f31992c = new Key();

    /* JADX INFO: renamed from: a */
    public final ContinuationInterceptor f31993a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f31994b = new AtomicInteger(0);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/room/TransactionElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/room/TransactionElement;", "room-ktx_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Key implements CoroutineContext.Key<TransactionElement> {
    }

    public TransactionElement(ContinuationInterceptor continuationInterceptor) {
        this.f31993a = continuationInterceptor;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: L0 */
    public final Object mo2461L0(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: b0 */
    public final CoroutineContext mo2463b0(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.m18552b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: getKey */
    public final CoroutineContext.Key getF51575a() {
        return f31992c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: u */
    public final CoroutineContext.Element mo2464u(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.m18551a(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: z */
    public final CoroutineContext mo2465z(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m18553c(this, coroutineContext);
    }
}
