package kotlinx.coroutines.flow;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__CountKt", m18559f = "Count.kt", m18560l = {BuildConfig.VERSION_CODE}, m18561m = MTPushConstants.Geofence.KEY_COUNT)
final class FlowKt__CountKt$count$3<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref.IntRef f55759a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55760b;

    /* JADX INFO: renamed from: c */
    public int f55761c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55760b = obj;
        int i = (this.f55761c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55761c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f55759a = new Ref.IntRef();
            this.f55761c = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.IntRef intRef = this.f55759a;
        ResultKt.m18313b(obj);
        return new Integer(intRef.f51657a);
    }
}
