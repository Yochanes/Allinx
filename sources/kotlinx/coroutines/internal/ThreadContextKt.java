package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a */
    public static final Symbol f56359a = new Symbol("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    public static final C6335b f56360b = new C6335b(1);

    /* JADX INFO: renamed from: c */
    public static final C6335b f56361c = new C6335b(2);

    /* JADX INFO: renamed from: d */
    public static final C6335b f56362d = new C6335b(0);

    /* JADX INFO: renamed from: a */
    public static final void m20857a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f56359a) {
            return;
        }
        if (!(obj instanceof ThreadState)) {
            Object objMo2461L0 = coroutineContext.mo2461L0(null, f56361c);
            Intrinsics.m18597e(objMo2461L0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((ThreadContextElement) objMo2461L0).mo4793F0(obj);
            return;
        }
        ThreadState threadState = (ThreadState) obj;
        ThreadContextElement[] threadContextElementArr = threadState.f56367c;
        int length = threadContextElementArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement threadContextElement = threadContextElementArr[length];
            Intrinsics.m18596d(threadContextElement);
            threadContextElement.mo4793F0(threadState.f56366b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m20858b(CoroutineContext coroutineContext) {
        Object objMo2461L0 = coroutineContext.mo2461L0(0, f56360b);
        Intrinsics.m18596d(objMo2461L0);
        return objMo2461L0;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m20859c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m20858b(coroutineContext);
        }
        return obj == 0 ? f56359a : obj instanceof Integer ? coroutineContext.mo2461L0(new ThreadState(((Number) obj).intValue(), coroutineContext), f56362d) : ((ThreadContextElement) obj).mo4794V0(coroutineContext);
    }
}
