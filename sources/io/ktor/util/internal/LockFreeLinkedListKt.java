package io.ktor.util.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\u001c\u0010\u0004\u001a\u0004\b\u0000\u0010\u0002\"\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0003*\f\b\u0002\u0010\u0006\"\u00020\u00052\u00020\u0005*\u001c\u0010\b\u001a\u0004\b\u0000\u0010\u0002\"\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0012\u0004\u0012\u00028\u00000\u0007¨\u0006\t"}, m18302d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "AbstractAtomicDesc", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "AddLastDesc", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Node", "Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "RemoveFirstDesc", "ktor-utils"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class LockFreeLinkedListKt {

    /* JADX INFO: renamed from: a */
    public static final Object f46605a = null;

    /* JADX INFO: renamed from: b */
    public static final Object f46606b = null;

    /* JADX INFO: renamed from: c */
    public static final Object f46607c;

    static {
        new Symbol("CONDITION_FALSE");
        new Symbol("REMOVE_PREPARED");
        f46607c = new Symbol("NO_DECISION");
    }

    /* JADX INFO: renamed from: a */
    public static final LockFreeLinkedListNode m17205a(Object unwrap) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Intrinsics.m18599g(unwrap, "$this$unwrap");
        Removed removed = (Removed) (!(unwrap instanceof Removed) ? null : unwrap);
        return (removed == null || (lockFreeLinkedListNode = removed.f46611a) == null) ? (LockFreeLinkedListNode) unwrap : lockFreeLinkedListNode;
    }
}
