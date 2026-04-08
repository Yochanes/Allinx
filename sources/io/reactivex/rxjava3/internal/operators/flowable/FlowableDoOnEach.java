package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f51170d) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18206a(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f51170d) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18206a(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f51170d) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f51170d = true;
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                    RxJavaPlugins.m18275b(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f51170d) {
                return;
            }
            if (this.f51171f != 0) {
                this.f51167a.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18206a(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            throw null;
         */
        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object poll() {
            CompositeException compositeException;
            try {
                Object objPoll = this.f51169c.poll();
                if (objPoll == null) {
                    if (this.f51171f != 1) {
                        return objPoll;
                    }
                    throw null;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    try {
                        throw null;
                    } finally {
                    }
                }
            } finally {
                Exceptions.m17950a(th);
                try {
                    throw null;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f51175d) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18207a(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f51175d) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f51175d = true;
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                    RxJavaPlugins.m18275b(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f51175d) {
                return;
            }
            if (this.f51176f != 0) {
                this.f51172a.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18207a(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            throw null;
         */
        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object poll() {
            CompositeException compositeException;
            try {
                Object objPoll = this.f51174c.poll();
                if (objPoll == null) {
                    if (this.f51176f != 1) {
                        return objPoll;
                    }
                    throw null;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    try {
                        throw null;
                    } finally {
                    }
                }
            } finally {
                Exceptions.m17950a(th);
                try {
                    throw null;
                } finally {
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            new DoOnEachConditionalSubscriber((ConditionalSubscriber) subscriber);
            throw null;
        }
        new DoOnEachSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
