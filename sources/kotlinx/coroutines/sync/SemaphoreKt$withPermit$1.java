package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.sync.SemaphoreKt", m18559f = "Semaphore.kt", m18560l = {81}, m18561m = "withPermit")
final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56574a;

    /* JADX INFO: renamed from: b */
    public int f56575b;

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        this.f56574a = obj;
        int i = this.f56575b | Integer.MIN_VALUE;
        this.f56575b = i;
        int i2 = SemaphoreKt.f56568a;
        int i3 = i - Integer.MIN_VALUE;
        this.f56575b = i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            this.f56575b = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        throw null;
    }
}
