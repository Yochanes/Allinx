package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6340a implements Function3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutexImpl f56577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutexImpl.CancellableContinuationWithOwner f56578b;

    public /* synthetic */ C6340a(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.f56577a = mutexImpl;
        this.f56578b = cancellableContinuationWithOwner;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f56549h;
        this.f56578b.getClass();
        MutexImpl mutexImpl = this.f56577a;
        atomicReferenceFieldUpdater.set(mutexImpl, null);
        mutexImpl.mo20911c(null);
        return Unit.f51459a;
    }
}
