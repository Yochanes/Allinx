package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqual;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.EqualCoordinatorHelper {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f48102a;

        /* JADX INFO: renamed from: b */
        public final FlowableSequenceEqual.EqualSubscriber f48103b = new FlowableSequenceEqual.EqualSubscriber(this);

        /* JADX INFO: renamed from: c */
        public final FlowableSequenceEqual.EqualSubscriber f48104c = new FlowableSequenceEqual.EqualSubscriber(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48105d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public Object f48106f;

        /* JADX INFO: renamed from: g */
        public Object f48107g;

        public EqualCoordinator(SingleObserver singleObserver) {
            this.f48102a = singleObserver;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: a */
        public final void mo17738a(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48105d;
            atomicThrowable.getClass();
            if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                mo17739b();
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: b */
        public final void mo17739b() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue simpleQueue = this.f48103b.f48099b;
                SimpleQueue simpleQueue2 = this.f48104c.f48099b;
                if (simpleQueue == null || simpleQueue2 == null) {
                    if (mo17596d()) {
                        this.f48103b.m17741a();
                        this.f48104c.m17741a();
                        return;
                    } else if (this.f48105d.get() != null) {
                        m17742c();
                        SingleObserver singleObserver = this.f48102a;
                        AtomicThrowable atomicThrowable = this.f48105d;
                        atomicThrowable.getClass();
                        singleObserver.onError(ExceptionHelper.m17888b(atomicThrowable));
                        return;
                    }
                } else {
                    if (mo17596d()) {
                        this.f48103b.m17741a();
                        this.f48104c.m17741a();
                        return;
                    }
                    if (this.f48105d.get() != null) {
                        m17742c();
                        SingleObserver singleObserver2 = this.f48102a;
                        AtomicThrowable atomicThrowable2 = this.f48105d;
                        atomicThrowable2.getClass();
                        singleObserver2.onError(ExceptionHelper.m17888b(atomicThrowable2));
                        return;
                    }
                    boolean z2 = this.f48103b.f48100c;
                    Object objPoll = this.f48106f;
                    if (objPoll == null) {
                        try {
                            objPoll = simpleQueue.poll();
                            this.f48106f = objPoll;
                        } catch (Throwable th) {
                            Exceptions.m17612a(th);
                            m17742c();
                            AtomicThrowable atomicThrowable3 = this.f48105d;
                            atomicThrowable3.getClass();
                            ExceptionHelper.m17887a(atomicThrowable3, th);
                            SingleObserver singleObserver3 = this.f48102a;
                            AtomicThrowable atomicThrowable4 = this.f48105d;
                            atomicThrowable4.getClass();
                            singleObserver3.onError(ExceptionHelper.m17888b(atomicThrowable4));
                            return;
                        }
                    }
                    boolean z3 = objPoll == null;
                    boolean z4 = this.f48104c.f48100c;
                    Object objPoll2 = this.f48107g;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = simpleQueue2.poll();
                            this.f48107g = objPoll2;
                        } catch (Throwable th2) {
                            Exceptions.m17612a(th2);
                            m17742c();
                            AtomicThrowable atomicThrowable5 = this.f48105d;
                            atomicThrowable5.getClass();
                            ExceptionHelper.m17887a(atomicThrowable5, th2);
                            SingleObserver singleObserver4 = this.f48102a;
                            AtomicThrowable atomicThrowable6 = this.f48105d;
                            atomicThrowable6.getClass();
                            singleObserver4.onError(ExceptionHelper.m17888b(atomicThrowable6));
                            return;
                        }
                    }
                    boolean z5 = objPoll2 == null;
                    if (z2 && z4 && z3 && z5) {
                        this.f48102a.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z2 && z4 && z3 != z5) {
                        m17742c();
                        this.f48102a.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if (!z3 && !z5) {
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            Exceptions.m17612a(th3);
                            m17742c();
                            AtomicThrowable atomicThrowable7 = this.f48105d;
                            atomicThrowable7.getClass();
                            ExceptionHelper.m17887a(atomicThrowable7, th3);
                            SingleObserver singleObserver5 = this.f48102a;
                            AtomicThrowable atomicThrowable8 = this.f48105d;
                            atomicThrowable8.getClass();
                            singleObserver5.onError(ExceptionHelper.m17888b(atomicThrowable8));
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public final void m17742c() {
            FlowableSequenceEqual.EqualSubscriber equalSubscriber = this.f48103b;
            equalSubscriber.getClass();
            SubscriptionHelper.m17867a(equalSubscriber);
            equalSubscriber.m17741a();
            FlowableSequenceEqual.EqualSubscriber equalSubscriber2 = this.f48104c;
            equalSubscriber2.getClass();
            SubscriptionHelper.m17867a(equalSubscriber2);
            equalSubscriber2.m17741a();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return SubscriptionHelper.m17870d(this.f48103b.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            FlowableSequenceEqual.EqualSubscriber equalSubscriber = this.f48103b;
            equalSubscriber.getClass();
            SubscriptionHelper.m17867a(equalSubscriber);
            FlowableSequenceEqual.EqualSubscriber equalSubscriber2 = this.f48104c;
            equalSubscriber2.getClass();
            SubscriptionHelper.m17867a(equalSubscriber2);
            if (getAndIncrement() == 0) {
                equalSubscriber.m17741a();
                equalSubscriber2.m17741a();
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new EqualCoordinator(singleObserver));
        throw null;
    }
}
