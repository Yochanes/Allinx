package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/DeepRecursiveScopeImpl;", "T", "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {

    /* JADX INFO: renamed from: a */
    public Function3 f51408a;

    /* JADX INFO: renamed from: b */
    public Unit f51409b;

    /* JADX INFO: renamed from: c */
    public Continuation f51410c;

    /* JADX INFO: renamed from: d */
    public Object f51411d;

    @Override // kotlin.DeepRecursiveScope
    /* JADX INFO: renamed from: a */
    public final void mo18296a(Continuation continuation) {
        Unit unit = Unit.f51459a;
        this.f51410c = continuation;
        this.f51409b = unit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF56402a() {
        return EmptyCoroutineContext.f51581a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f51410c = null;
        this.f51411d = obj;
    }
}
