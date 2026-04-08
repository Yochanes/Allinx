package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CompletionStateKt {
    /* JADX INFO: renamed from: a */
    public static final Object m20552a(Object obj) {
        return obj instanceof CompletedExceptionally ? ResultKt.m18312a(((CompletedExceptionally) obj).f55276a) : obj;
    }
}
