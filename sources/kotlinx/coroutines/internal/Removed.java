package kotlinx.coroutines.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/internal/Removed;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class Removed {

    /* JADX INFO: renamed from: a */
    public final LockFreeLinkedListNode f56352a;

    public Removed(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f56352a = lockFreeLinkedListNode;
    }

    public final String toString() {
        return "Removed[" + this.f56352a + ']';
    }
}
