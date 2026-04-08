package io.ktor.util.internal;

import io.ktor.util.internal.LockFreeLinkedListNode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/util/internal/LockFreeLinkedListNode$describeRemove$1", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class LockFreeLinkedListNode$describeRemove$1 extends LockFreeLinkedListNode.AbstractAtomicDesc {
    private volatile /* synthetic */ Object _originalNext;

    static {
        AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode$describeRemove$1.class, Object.class, "_originalNext");
    }
}
