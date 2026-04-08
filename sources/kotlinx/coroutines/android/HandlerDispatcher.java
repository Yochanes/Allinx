package kotlinx.coroutines.android;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    /* JADX INFO: renamed from: S */
    public DisposableHandle mo20567S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return DefaultExecutorKt.f55289a.mo20567S(j, runnable, coroutineContext);
    }
}
