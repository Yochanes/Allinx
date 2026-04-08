package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "Mutator", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class MutatorMutex {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f5096a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final MutexImpl f5097b = MutexKt.m20913a();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/MutatorMutex$Mutator;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Mutator {

        /* JADX INFO: renamed from: a */
        public final MutatePriority f5098a;

        /* JADX INFO: renamed from: b */
        public final Job f5099b;

        public Mutator(MutatePriority mutatePriority, Job job) {
            this.f5098a = mutatePriority;
            this.f5099b = job;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m2492a(MutatorMutex mutatorMutex, Mutator mutator) {
        while (true) {
            AtomicReference atomicReference = mutatorMutex.f5096a;
            Mutator mutator2 = (Mutator) atomicReference.get();
            if (mutator2 != null && mutator.f5098a.compareTo(mutator2.f5098a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.f5099b.mo17054i(new MutationInterruptedException("Mutation interrupted"));
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2493b(MutatePriority mutatePriority, Function1 function1, Continuation continuation) {
        return CoroutineScopeKt.m20563d(new MutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }

    /* JADX INFO: renamed from: c */
    public final Object m2494c(Object obj, MutatePriority mutatePriority, Function2 function2, SuspendLambda suspendLambda) {
        return CoroutineScopeKt.m20563d(new MutatorMutex$mutateWith$2(mutatePriority, this, function2, obj, null), suspendLambda);
    }
}
