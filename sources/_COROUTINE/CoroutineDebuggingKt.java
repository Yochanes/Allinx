package _COROUTINE;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CoroutineDebuggingKt {
    /* JADX INFO: renamed from: a */
    public static final StackTraceElement m74a(String str, Exception exc) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
