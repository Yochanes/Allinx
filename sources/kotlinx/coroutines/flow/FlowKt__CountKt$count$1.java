package kotlinx.coroutines.flow;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__CountKt", m18559f = "Count.kt", m18560l = {13}, m18561m = MTPushConstants.Geofence.KEY_COUNT)
final class FlowKt__CountKt$count$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref.IntRef f55756a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55757b;

    /* JADX INFO: renamed from: c */
    public int f55758c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55757b = obj;
        int i = (this.f55758c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55758c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f55756a = new Ref.IntRef();
            this.f55758c = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.IntRef intRef = this.f55756a;
        ResultKt.m18313b(obj);
        return new Integer(intRef.f51657a);
    }
}
