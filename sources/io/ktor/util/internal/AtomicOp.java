package io.ktor.util.internal;

import io.ktor.util.InternalAPI;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/internal/AtomicOp;", "T", "Lio/ktor/util/internal/OpDescriptor;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class AtomicOp<T> extends OpDescriptor {
    private volatile /* synthetic */ Object _consensus;

    static {
        AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    }

    @Override // io.ktor.util.internal.OpDescriptor
    /* JADX INFO: renamed from: a */
    public final Object mo17201a(LockFreeLinkedListNode lockFreeLinkedListNode) {
        Object obj = this._consensus;
        if (obj != LockFreeLinkedListKt.f46607c) {
            mo17202b(lockFreeLinkedListNode);
            return obj;
        }
        mo17203c(lockFreeLinkedListNode);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo17202b(LockFreeLinkedListNode lockFreeLinkedListNode);

    /* JADX INFO: renamed from: c */
    public abstract Object mo17203c(LockFreeLinkedListNode lockFreeLinkedListNode);
}
