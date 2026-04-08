package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subscribers.SerializedSubscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class QueueDrainHelper {
    /* JADX INFO: renamed from: a */
    public static boolean m17907a(boolean z2, boolean z3, SerializedObserver serializedObserver, SimplePlainQueue simplePlainQueue, Disposable disposable, QueueDrainObserver queueDrainObserver) {
        if (queueDrainObserver.f47586d) {
            simplePlainQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        Throwable th = queueDrainObserver.f47588g;
        if (th != null) {
            simplePlainQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            serializedObserver.onError(th);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        serializedObserver.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r7.m17642g(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m17908b(MpscLinkedQueue mpscLinkedQueue, SerializedObserver serializedObserver, Disposable disposable, QueueDrainObserver queueDrainObserver) {
        int iM17642g = 1;
        while (true) {
            MpscLinkedQueue mpscLinkedQueue2 = mpscLinkedQueue;
            SerializedObserver serializedObserver2 = serializedObserver;
            Disposable disposable2 = disposable;
            QueueDrainObserver queueDrainObserver2 = queueDrainObserver;
            if (m17907a(queueDrainObserver.f47587f, mpscLinkedQueue.isEmpty(), serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                return;
            }
            while (true) {
                boolean z2 = queueDrainObserver2.f47587f;
                Object objPoll = mpscLinkedQueue2.poll();
                boolean z3 = objPoll == null;
                boolean z4 = z3;
                if (m17907a(z2, z3, serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                    return;
                }
                if (z4) {
                    break;
                } else {
                    queueDrainObserver2.mo17638a(serializedObserver2, objPoll);
                }
            }
            serializedObserver = serializedObserver2;
            mpscLinkedQueue = mpscLinkedQueue2;
            disposable = disposable2;
            queueDrainObserver = queueDrainObserver2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m17909c(MpscLinkedQueue mpscLinkedQueue, SerializedSubscriber serializedSubscriber, Disposable disposable, QueueDrainSubscriber queueDrainSubscriber) {
        int iM17857g = 1;
        while (true) {
            boolean z2 = queueDrainSubscriber.f49241g;
            Object objPoll = mpscLinkedQueue.poll();
            boolean z3 = objPoll == null;
            if (queueDrainSubscriber.f49240f) {
                mpscLinkedQueue.clear();
                break;
            }
            if (z2) {
                Throwable th = queueDrainSubscriber.f49242i;
                if (th == null) {
                    if (z3) {
                        serializedSubscriber.onComplete();
                        break;
                    }
                } else {
                    mpscLinkedQueue.clear();
                    serializedSubscriber.onError(th);
                    break;
                }
            }
            if (z3) {
                iM17857g = queueDrainSubscriber.m17857g(-iM17857g);
                if (iM17857g == 0) {
                    return;
                }
            } else {
                long jM17859i = queueDrainSubscriber.m17859i();
                if (jM17859i == 0) {
                    mpscLinkedQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    serializedSubscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrainSubscriber.mo17649a(objPoll, serializedSubscriber) && jM17859i != Long.MAX_VALUE) {
                    queueDrainSubscriber.m17858h();
                }
            }
        }
    }
}
