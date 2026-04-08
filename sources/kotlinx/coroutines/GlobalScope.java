package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/GlobalScope;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@DelicateCoroutinesApi
public final class GlobalScope implements CoroutineScope {

    /* JADX INFO: renamed from: a */
    public static final GlobalScope f55316a = new GlobalScope();

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF25048a() {
        return EmptyCoroutineContext.f51581a;
    }
}
