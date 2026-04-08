package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.EqualCoordinatorHelper {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f50003a;

        /* JADX INFO: renamed from: b */
        public final FlowableSequenceEqual.EqualSubscriber f50004b = new FlowableSequenceEqual.EqualSubscriber(this);

        /* JADX INFO: renamed from: c */
        public final FlowableSequenceEqual.EqualSubscriber f50005c = new FlowableSequenceEqual.EqualSubscriber(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50006d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public Object f50007f;

        /* JADX INFO: renamed from: g */
        public Object f50008g;

        public EqualCoordinator(SingleObserver singleObserver) {
            this.f50003a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: a */
        public final void mo18082a(Throwable th) {
            if (this.f50006d.m18231a(th)) {
                mo18083b();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: b */
        public final void mo18083b() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue simpleQueue = this.f50004b.f50000b;
                SimpleQueue simpleQueue2 = this.f50005c.f50000b;
                if (simpleQueue == null || simpleQueue2 == null) {
                    if (mo12353d()) {
                        this.f50004b.m18085a();
                        this.f50005c.m18085a();
                        return;
                    } else if (this.f50006d.get() != null) {
                        m18086c();
                        this.f50006d.m18235e(this.f50003a);
                        return;
                    }
                } else {
                    if (mo12353d()) {
                        this.f50004b.m18085a();
                        this.f50005c.m18085a();
                        return;
                    }
                    if (this.f50006d.get() != null) {
                        m18086c();
                        this.f50006d.m18235e(this.f50003a);
                        return;
                    }
                    boolean z2 = this.f50004b.f50001c;
                    Object objPoll = this.f50007f;
                    if (objPoll == null) {
                        try {
                            objPoll = simpleQueue.poll();
                            this.f50007f = objPoll;
                        } catch (Throwable th) {
                            Exceptions.m17950a(th);
                            m18086c();
                            this.f50006d.m18231a(th);
                            this.f50006d.m18235e(this.f50003a);
                            return;
                        }
                    }
                    boolean z3 = objPoll == null;
                    boolean z4 = this.f50005c.f50001c;
                    Object objPoll2 = this.f50008g;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = simpleQueue2.poll();
                            this.f50008g = objPoll2;
                        } catch (Throwable th2) {
                            Exceptions.m17950a(th2);
                            m18086c();
                            this.f50006d.m18231a(th2);
                            this.f50006d.m18235e(this.f50003a);
                            return;
                        }
                    }
                    boolean z5 = objPoll2 == null;
                    if (z2 && z4 && z3 && z5) {
                        this.f50003a.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z2 && z4 && z3 != z5) {
                        m18086c();
                        this.f50003a.onSuccess(Boolean.FALSE);
                        return;
                    } else if (!z3 && !z5) {
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            Exceptions.m17950a(th3);
                            m18086c();
                            this.f50006d.m18231a(th3);
                            this.f50006d.m18235e(this.f50003a);
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public final void m18086c() {
            FlowableSequenceEqual.EqualSubscriber equalSubscriber = this.f50004b;
            equalSubscriber.getClass();
            SubscriptionHelper.m18221a(equalSubscriber);
            equalSubscriber.m18085a();
            FlowableSequenceEqual.EqualSubscriber equalSubscriber2 = this.f50005c;
            equalSubscriber2.getClass();
            SubscriptionHelper.m18221a(equalSubscriber2);
            equalSubscriber2.m18085a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50004b.get() == SubscriptionHelper.f51214a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            FlowableSequenceEqual.EqualSubscriber equalSubscriber = this.f50004b;
            equalSubscriber.getClass();
            SubscriptionHelper.m18221a(equalSubscriber);
            FlowableSequenceEqual.EqualSubscriber equalSubscriber2 = this.f50005c;
            equalSubscriber2.getClass();
            SubscriptionHelper.m18221a(equalSubscriber2);
            this.f50006d.m18232b();
            if (getAndIncrement() == 0) {
                equalSubscriber.m18085a();
                equalSubscriber2.m18085a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new EqualCoordinator(singleObserver));
        throw null;
    }
}
