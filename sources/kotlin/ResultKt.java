package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ResultKt {
    /* JADX INFO: renamed from: a */
    public static final Result.Failure m18312a(Throwable exception) {
        Intrinsics.m18599g(exception, "exception");
        return new Result.Failure(exception);
    }

    /* JADX INFO: renamed from: b */
    public static final void m18313b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f51432a;
        }
    }
}
