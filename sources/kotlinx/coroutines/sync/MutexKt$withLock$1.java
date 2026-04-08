package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.sync.MutexKt", m18559f = "Mutex.kt", m18560l = {121}, m18561m = "withLock")
final class MutexKt$withLock$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56557a;

    /* JADX INFO: renamed from: b */
    public int f56558b;

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        this.f56557a = obj;
        int i = (this.f56558b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f56558b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f56558b = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        throw null;
    }
}
