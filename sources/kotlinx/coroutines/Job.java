package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SubclassOptInRequired
public interface Job extends CoroutineContext.Element {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20595a(Job job) {
            job.mo17054i(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/Job$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Key implements CoroutineContext.Key<Job> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Key f55324a = new Key();
    }

    /* JADX INFO: renamed from: C */
    Sequence mo17048C();

    /* JADX INFO: renamed from: H */
    Object mo17049H(Continuation continuation);

    /* JADX INFO: renamed from: L */
    DisposableHandle mo17050L(boolean z2, boolean z3, Function1 function1);

    /* JADX INFO: renamed from: N */
    CancellationException mo17051N();

    /* JADX INFO: renamed from: O0 */
    boolean mo17052O0();

    /* JADX INFO: renamed from: R */
    ChildHandle mo17053R(JobSupport jobSupport);

    /* JADX INFO: renamed from: i */
    void mo17054i(CancellationException cancellationException);

    boolean isActive();

    boolean isCancelled();

    boolean start();

    /* JADX INFO: renamed from: w0 */
    DisposableHandle mo17055w0(Function1 function1);
}
