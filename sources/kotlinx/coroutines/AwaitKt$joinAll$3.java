package kotlinx.coroutines;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.AwaitKt", m18559f = "Await.kt", m18560l = {58}, m18561m = "joinAll")
final class AwaitKt$joinAll$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Iterator f55253a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55254b;

    /* JADX INFO: renamed from: c */
    public int f55255c;

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Iterator it;
        this.f55254b = obj;
        this.f55255c |= Integer.MIN_VALUE;
        Iterable iterable = null;
        if (this instanceof AwaitKt$joinAll$3) {
            int i = this.f55255c;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.f55255c = i - Integer.MIN_VALUE;
                awaitKt$joinAll$3 = this;
            } else {
                awaitKt$joinAll$3 = new AwaitKt$joinAll$3(this);
            }
        }
        Object obj2 = awaitKt$joinAll$3.f55254b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = awaitKt$joinAll$3.f55255c;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            it = iterable.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = awaitKt$joinAll$3.f55253a;
            ResultKt.m18313b(obj2);
        }
        while (it.hasNext()) {
            Job job = (Job) it.next();
            awaitKt$joinAll$3.f55253a = it;
            awaitKt$joinAll$3.f55255c = 1;
            if (job.mo17049H(awaitKt$joinAll$3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f51459a;
    }
}
