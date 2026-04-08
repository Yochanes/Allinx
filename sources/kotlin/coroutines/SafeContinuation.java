package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18302d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "", "result", "Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@PublishedApi
public final class SafeContinuation<T> implements Continuation<T>, CoroutineStackFrame {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f51582b = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");

    /* JADX INFO: renamed from: a */
    public final Continuation f51583a;

    @Nullable
    private volatile Object result;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public SafeContinuation(Continuation continuation, CoroutineSingletons coroutineSingletons) {
        this.f51583a = continuation;
        this.result = coroutineSingletons;
    }

    /* JADX INFO: renamed from: a */
    public final Object m18554a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51585b;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51582b;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f51584a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    obj = this.result;
                }
            }
            return CoroutineSingletons.f51584a;
        }
        if (obj == CoroutineSingletons.f51586c) {
            return CoroutineSingletons.f51584a;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f51432a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f51583a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF56402a() {
        return this.f51583a.getF56402a();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51585b;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51582b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f51584a;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f51582b;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f51586c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                    break;
                }
            }
            this.f51583a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f51583a;
    }
}
