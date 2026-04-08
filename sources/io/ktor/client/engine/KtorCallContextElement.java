package io.ktor.client.engine;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/engine/KtorCallContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Companion", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class KtorCallContextElement implements CoroutineContext.Element {

    /* JADX INFO: renamed from: b */
    public static final Companion f44960b = new Companion();

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f44961a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/engine/KtorCallContextElement$Companion;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lio/ktor/client/engine/KtorCallContextElement;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion implements CoroutineContext.Key<KtorCallContextElement> {
    }

    public KtorCallContextElement(CoroutineContext coroutineContext) {
        this.f44961a = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: L0 */
    public final Object mo2461L0(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: b0 */
    public final CoroutineContext mo2463b0(CoroutineContext.Key key) {
        Intrinsics.m18599g(key, "key");
        return CoroutineContext.Element.DefaultImpls.m18552b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: getKey */
    public final CoroutineContext.Key getF51575a() {
        return f44960b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: u */
    public final CoroutineContext.Element mo2464u(CoroutineContext.Key key) {
        Intrinsics.m18599g(key, "key");
        return CoroutineContext.Element.DefaultImpls.m18551a(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: z */
    public final CoroutineContext mo2465z(CoroutineContext context) {
        Intrinsics.m18599g(context, "context");
        return CoroutineContext.DefaultImpls.m18550a(this, context);
    }
}
