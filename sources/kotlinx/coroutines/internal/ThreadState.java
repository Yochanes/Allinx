package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class ThreadState {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f56365a;

    /* JADX INFO: renamed from: b */
    public final Object[] f56366b;

    /* JADX INFO: renamed from: c */
    public final ThreadContextElement[] f56367c;

    /* JADX INFO: renamed from: d */
    public int f56368d;

    public ThreadState(int i, CoroutineContext coroutineContext) {
        this.f56365a = coroutineContext;
        this.f56366b = new Object[i];
        this.f56367c = new ThreadContextElement[i];
    }
}
