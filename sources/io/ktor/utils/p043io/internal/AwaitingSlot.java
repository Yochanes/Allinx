package io.ktor.utils.p043io.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/AwaitingSlot;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class AwaitingSlot {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47386a = AtomicReferenceFieldUpdater.newUpdater(AwaitingSlot.class, Object.class, "suspension");
    private volatile /* synthetic */ Object suspension;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17531a(ContinuationImpl continuationImpl) {
        AwaitingSlot$trySuspend$1 awaitingSlot$trySuspend$1;
        int i;
        if (continuationImpl instanceof AwaitingSlot$trySuspend$1) {
            awaitingSlot$trySuspend$1 = (AwaitingSlot$trySuspend$1) continuationImpl;
            int i2 = awaitingSlot$trySuspend$1.f47392b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awaitingSlot$trySuspend$1.f47392b = i2 - Integer.MIN_VALUE;
            } else {
                awaitingSlot$trySuspend$1 = new AwaitingSlot$trySuspend$1(this, continuationImpl);
            }
        }
        Object obj = awaitingSlot$trySuspend$1.f47391a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = awaitingSlot$trySuspend$1.f47392b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            JobImpl jobImplM20598a = JobKt.m20598a();
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47386a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, jobImplM20598a)) {
                    awaitingSlot$trySuspend$1.f47394d = 1;
                    awaitingSlot$trySuspend$1.f47392b = 1;
                    if (jobImplM20598a.mo17049H(awaitingSlot$trySuspend$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i = 1;
                } else if (atomicReferenceFieldUpdater.get(this) != null) {
                    i = 0;
                    break;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = awaitingSlot$trySuspend$1.f47394d;
            ResultKt.m18313b(obj);
        }
        return Boolean.valueOf(i != 0);
    }
}
