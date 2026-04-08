package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6341b implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutexImpl f56579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutexImpl.CancellableContinuationWithOwner f56580b;

    public /* synthetic */ C6341b(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.f56579a = mutexImpl;
        this.f56580b = cancellableContinuationWithOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f56580b.getClass();
        this.f56579a.mo20911c(null);
        return Unit.f51459a;
    }
}
