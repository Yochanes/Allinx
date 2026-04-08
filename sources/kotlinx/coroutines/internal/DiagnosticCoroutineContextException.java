package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final transient CoroutineContext f56318a;

    public DiagnosticCoroutineContextException(CoroutineContext coroutineContext) {
        this.f56318a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f56318a.toString();
    }
}
