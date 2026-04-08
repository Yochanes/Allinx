package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlin.reflect.full.KCallables", m18559f = "KCallables.kt", m18560l = {56}, m18561m = "callSuspend")
final class KCallables$callSuspend$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51740a;

    /* JADX INFO: renamed from: b */
    public int f51741b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f51740a = obj;
        int i = (this.f51741b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f51741b = i;
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
