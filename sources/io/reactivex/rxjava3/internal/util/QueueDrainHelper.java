package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class QueueDrainHelper {
    /* JADX INFO: renamed from: a */
    public static boolean m18269a(boolean z2, boolean z3, SerializedObserver serializedObserver, SimplePlainQueue simplePlainQueue, Disposable disposable, QueueDrainObserver queueDrainObserver) {
        if (queueDrainObserver.f49494d) {
            simplePlainQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z2 || !z3) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        serializedObserver.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r7.m17982f(-r1);
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
    public static void m18270b(MpscLinkedQueue mpscLinkedQueue, SerializedObserver serializedObserver, Disposable disposable, QueueDrainObserver queueDrainObserver) {
        int iM17982f = 1;
        while (true) {
            MpscLinkedQueue mpscLinkedQueue2 = mpscLinkedQueue;
            SerializedObserver serializedObserver2 = serializedObserver;
            Disposable disposable2 = disposable;
            QueueDrainObserver queueDrainObserver2 = queueDrainObserver;
            if (m18269a(queueDrainObserver.f49495f, mpscLinkedQueue.isEmpty(), serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                return;
            }
            while (true) {
                boolean z2 = queueDrainObserver2.f49495f;
                Object objPoll = mpscLinkedQueue2.poll();
                boolean z3 = objPoll == null;
                boolean z4 = z3;
                if (m18269a(z2, z3, serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                    return;
                }
                if (z4) {
                    break;
                } else {
                    queueDrainObserver2.mo17979a(serializedObserver2, objPoll);
                }
            }
            serializedObserver = serializedObserver2;
            mpscLinkedQueue = mpscLinkedQueue2;
            disposable = disposable2;
            queueDrainObserver = queueDrainObserver2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r10 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m18271c(MpscLinkedQueue mpscLinkedQueue, SerializedSubscriber serializedSubscriber, Disposable disposable, QueueDrainSubscriber queueDrainSubscriber) {
        int iM18210e = 1;
        while (true) {
            boolean z2 = queueDrainSubscriber.f51189g;
            Object objPoll = mpscLinkedQueue.poll();
            boolean z3 = objPoll == null;
            if (!queueDrainSubscriber.f51188f) {
                if (z2 && z3) {
                    serializedSubscriber.onComplete();
                    break;
                }
                if (z3) {
                    iM18210e = queueDrainSubscriber.m18210e(-iM18210e);
                    if (iM18210e == 0) {
                        return;
                    }
                } else {
                    long jM18212h = queueDrainSubscriber.m18212h();
                    if (jM18212h == 0) {
                        mpscLinkedQueue.clear();
                        if (disposable != null) {
                            disposable.dispose();
                        }
                        serializedSubscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                        return;
                    }
                    if (queueDrainSubscriber.mo17991a(objPoll, serializedSubscriber) && jM18212h != Long.MAX_VALUE) {
                        queueDrainSubscriber.m18211g();
                    }
                }
            } else {
                mpscLinkedQueue.clear();
                break;
            }
        }
    }
}
