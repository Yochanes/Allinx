package io.ktor.utils.p043io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m18302d2 = {"Lio/ktor/utils/io/Condition;", "", "Lkotlin/coroutines/Continuation;", "", "cond", "Lkotlin/coroutines/Continuation;", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class Condition {
    private volatile Continuation<? super Unit> cond;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/Condition$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        if (AtomicReferenceFieldUpdater.newUpdater(Condition.class, Continuation.class, "cond") == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.utils.io.Condition, kotlin.coroutines.Continuation<kotlin.Unit>?>");
        }
    }

    public final String toString() {
        return "Condition(cond=" + this.cond + ')';
    }
}
