package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CoroutineExceptionHandlerKt {
    /* JADX INFO: renamed from: a */
    public static final void m20559a(Throwable th, CoroutineContext coroutineContext) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.mo2464u(CoroutineExceptionHandler.Key.f55278a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.mo6519g0(th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.m20819a(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                kotlin.ExceptionsKt.m18297a(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImpl_commonKt.m20819a(th, coroutineContext);
        }
    }
}
