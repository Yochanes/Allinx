package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CloseableCoroutineScope implements AutoCloseable, CoroutineScope {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f25048a;

    public CloseableCoroutineScope(CoroutineContext coroutineContext) {
        Intrinsics.m18599g(coroutineContext, "coroutineContext");
        this.f25048a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt.m20599b(this.f25048a, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF16437a() {
        return this.f25048a;
    }
}
