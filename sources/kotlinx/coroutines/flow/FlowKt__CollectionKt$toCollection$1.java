package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m18559f = "Collection.kt", m18560l = {22}, m18561m = "toCollection")
final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55754a;

    /* JADX INFO: renamed from: b */
    public int f55755b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55754a = obj;
        int i = (this.f55755b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55755b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f55755b = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return null;
    }
}
