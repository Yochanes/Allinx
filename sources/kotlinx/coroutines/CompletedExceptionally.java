package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class CompletedExceptionally {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55275b = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f55276a;

    public CompletedExceptionally(boolean z2, Throwable th) {
        this.f55276a = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f55276a + ']';
    }
}
