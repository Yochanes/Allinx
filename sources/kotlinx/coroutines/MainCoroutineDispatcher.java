package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    /* JADX INFO: renamed from: a1 */
    public abstract MainCoroutineDispatcher mo20642a1();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherMo20642a1;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.f55294a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f56350a;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherMo20642a1 = mainCoroutineDispatcher.mo20642a1();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherMo20642a1 = null;
            }
            str = this == mainCoroutineDispatcherMo20642a1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + DebugStringsKt.m20565a(this);
    }
}
