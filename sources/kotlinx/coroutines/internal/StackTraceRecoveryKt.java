package kotlinx.coroutines.internal;

import _COROUTINE.CoroutineDebuggingKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, m18302d2 = {"Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class StackTraceRecoveryKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f56356a = 0;

    static {
        Object objM18312a;
        Object objM18312a2;
        CoroutineDebuggingKt.m74a("_BOUNDARY", new Exception());
        try {
            objM18312a = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        if (Result.m18311a(objM18312a) != null) {
            objM18312a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM18312a2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            objM18312a2 = ResultKt.m18312a(th2);
        }
        if (Result.m18311a(objM18312a2) != null) {
            objM18312a2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
