package androidx.activity;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "androidx.activity.FullyDrawnReporterKt", m18559f = "FullyDrawnReporter.kt", m18560l = {173}, m18561m = "reportWhenComplete")
final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85a;

    /* JADX INFO: renamed from: b */
    public int f86b;

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        this.f85a = obj;
        int i = (this.f86b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f86b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        throw null;
    }
}
