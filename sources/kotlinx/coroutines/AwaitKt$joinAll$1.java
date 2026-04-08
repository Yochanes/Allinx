package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.AwaitKt", m18559f = "Await.kt", m18560l = {47}, m18561m = "joinAll")
final class AwaitKt$joinAll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object[] f55248a;

    /* JADX INFO: renamed from: b */
    public int f55249b;

    /* JADX INFO: renamed from: c */
    public int f55250c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f55251d;

    /* JADX INFO: renamed from: f */
    public int f55252f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        this.f55251d = obj;
        int i = (this.f55252f | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55252f = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = this.f55250c;
        int i3 = this.f55249b;
        Job[] jobArr = (Job[]) this.f55248a;
        ResultKt.m18313b(obj);
        do {
            i3++;
            if (i3 >= i2) {
                return Unit.f51459a;
            }
            job = jobArr[i3];
            this.f55248a = jobArr;
            this.f55249b = i3;
            this.f55250c = i2;
            this.f55252f = 1;
        } while (job.mo17049H(this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
