package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class OnTimeout$register$$inlined$Runnable$1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SelectInstance f56493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnTimeout f56494b;

    public OnTimeout$register$$inlined$Runnable$1(SelectInstance selectInstance, OnTimeout onTimeout) {
        this.f56493a = selectInstance;
        this.f56494b = onTimeout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56493a.mo20899c(this.f56494b, Unit.f51459a);
    }
}
