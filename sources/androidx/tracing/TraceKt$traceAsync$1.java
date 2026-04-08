package androidx.tracing;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "androidx.tracing.TraceKt", m18559f = "Trace.kt", m18560l = {76}, m18561m = "traceAsync")
@SourceDebugExtension
final class TraceKt$traceAsync$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32158a;

    /* JADX INFO: renamed from: b */
    public int f32159b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32158a = obj;
        int i = (this.f32159b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f32159b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            Trace.m11948a(0, null);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        Trace.m11949b(0, null);
        throw null;
    }
}
