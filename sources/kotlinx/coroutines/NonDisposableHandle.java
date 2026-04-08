package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/ChildHandle;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NonDisposableHandle implements DisposableHandle, ChildHandle {

    /* JADX INFO: renamed from: a */
    public static final NonDisposableHandle f55357a = new NonDisposableHandle();

    @Override // kotlinx.coroutines.ChildHandle
    /* JADX INFO: renamed from: b */
    public final boolean mo20544b(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public final Job getParent() {
        return null;
    }

    public final String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
    }
}
