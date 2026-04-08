package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DefaultExecutorKt {

    /* JADX INFO: renamed from: a */
    public static final Delay f55289a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Delay delay;
        String strM20855c = SystemPropsKt.m20855c("kotlinx.coroutines.main.delay");
        if (strM20855c != null ? Boolean.parseBoolean(strM20855c) : false) {
            DefaultScheduler defaultScheduler = Dispatchers.f55294a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f56350a;
            delay = (MainDispatchersKt.m20842a(mainCoroutineDispatcher) || !(mainCoroutineDispatcher instanceof Delay)) ? DefaultExecutor.f55287o : (Delay) mainCoroutineDispatcher;
        } else {
            delay = DefaultExecutor.f55287o;
        }
        f55289a = delay;
    }
}
