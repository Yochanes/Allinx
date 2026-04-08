package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalStdlibApi
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.Key<E> {

    /* JADX INFO: renamed from: a */
    public final Function1 f51576a;

    /* JADX INFO: renamed from: b */
    public final CoroutineContext.Key f51577b;

    public AbstractCoroutineContextKey(CoroutineContext.Key baseKey, Function1 function1) {
        Intrinsics.m18599g(baseKey, "baseKey");
        this.f51576a = function1;
        this.f51577b = baseKey instanceof AbstractCoroutineContextKey ? ((AbstractCoroutineContextKey) baseKey).f51577b : baseKey;
    }
}
