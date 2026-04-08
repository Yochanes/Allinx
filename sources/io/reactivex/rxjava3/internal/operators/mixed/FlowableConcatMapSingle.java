package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapSingleSubscriber<T, R> extends ConcatMapXMainSubscriber<T> implements Subscription {

        /* JADX INFO: renamed from: i */
        public final FlowableSubscriber f50310i;

        /* JADX INFO: renamed from: j */
        public final AtomicLong f50311j = new AtomicLong();

        /* JADX INFO: renamed from: n */
        public final ConcatMapSingleObserver f50312n = new ConcatMapSingleObserver(this);

        /* JADX INFO: renamed from: o */
        public long f50313o;

        /* JADX INFO: renamed from: p */
        public int f50314p;

        /* JADX INFO: renamed from: q */
        public Object f50315q;

        /* JADX INFO: renamed from: r */
        public volatile int f50316r;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapSingleSubscriber f50317a;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber concatMapSingleSubscriber) {
                this.f50317a = concatMapSingleSubscriber;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.f50317a;
                if (concatMapSingleSubscriber.f50291a.m18231a(th)) {
                    concatMapSingleSubscriber.f50293c.cancel();
                    concatMapSingleSubscriber.f50316r = 0;
                    concatMapSingleSubscriber.mo18117c();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.f50317a;
                concatMapSingleSubscriber.f50315q = obj;
                concatMapSingleSubscriber.f50316r = 2;
                concatMapSingleSubscriber.mo18117c();
            }
        }

        public ConcatMapSingleSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50310i = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo18115a() {
            this.f50315q = null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo18116b() {
            ConcatMapSingleObserver concatMapSingleObserver = this.f50312n;
            concatMapSingleObserver.getClass();
            DisposableHelper.m17952a(concatMapSingleObserver);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        
            if (r4 != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        
            r3 = r14.f50314p + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        
            if (r3 != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        
            r14.f50314p = 0;
            r14.f50293c.request(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        
            r14.f50314p = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        
            io.reactivex.rxjava3.exceptions.Exceptions.m17950a(r3);
            r14.f50293c.cancel();
            r1.clear();
            r2.m18231a(r3);
            r2.m18236f(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        
            return;
         */
        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18117c() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f50310i;
            SimpleQueue simpleQueue = this.f50292b;
            AtomicThrowable atomicThrowable = this.f50291a;
            AtomicLong atomicLong = this.f50311j;
            boolean z2 = this.f50296g;
            int iAddAndGet = 1;
            while (true) {
                if (this.f50295f) {
                    simpleQueue.clear();
                    this.f50315q = null;
                } else {
                    int i = this.f50316r;
                    atomicThrowable.get();
                    if (i == 0) {
                        boolean z3 = this.f50294d;
                        try {
                            boolean z4 = simpleQueue.poll() == null;
                            if (!z3 || !z4) {
                                if (!z4) {
                                    break;
                                }
                            } else {
                                atomicThrowable.m18236f(flowableSubscriber);
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.m17950a(th);
                            this.f50293c.cancel();
                            atomicThrowable.m18231a(th);
                            atomicThrowable.m18236f(flowableSubscriber);
                            return;
                        }
                    } else if (i == 2) {
                        long j = this.f50313o;
                        if (j != atomicLong.get()) {
                            Object obj = this.f50315q;
                            this.f50315q = null;
                            flowableSubscriber.onNext(obj);
                            this.f50313o = j + 1;
                            this.f50316r = 0;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo18118e() {
            this.f50310i.mo12367j(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m18237a(this.f50311j, j);
            mo18117c();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new ConcatMapSingleSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
