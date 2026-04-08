package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class AbstractCoroutineContextElement implements CoroutineContext.Element {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext.Key f51575a;

    public AbstractCoroutineContextElement(CoroutineContext.Key key) {
        Intrinsics.m18599g(key, "key");
        this.f51575a = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: L0 */
    public final Object mo2461L0(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: b0 */
    public CoroutineContext mo2463b0(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.m18552b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final CoroutineContext.Key getF51575a() {
        return this.f51575a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: u */
    public CoroutineContext.Element mo2464u(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.m18551a(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: z */
    public final CoroutineContext mo2465z(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m18553c(this, coroutineContext);
    }
}
