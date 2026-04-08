package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, ObservableGroupJoin.JoinSupport {

        /* JADX INFO: renamed from: a */
        public final Observer f48736a;

        /* JADX INFO: renamed from: j */
        public int f48743j;

        /* JADX INFO: renamed from: n */
        public int f48744n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f48745o;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f48738c = new CompositeDisposable();

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48737b = new SpscLinkedArrayQueue(Flowable.f47532a);

        /* JADX INFO: renamed from: d */
        public final LinkedHashMap f48739d = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final LinkedHashMap f48740f = new LinkedHashMap();

        /* JADX INFO: renamed from: g */
        public final AtomicReference f48741g = new AtomicReference();

        /* JADX INFO: renamed from: i */
        public final AtomicInteger f48742i = new AtomicInteger(2);

        public JoinDisposable(Observer observer) {
            this.f48736a = observer;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: a */
        public final void mo17796a(Throwable th) {
            if (!ExceptionHelper.m17887a(this.f48741g, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48742i.decrementAndGet();
                m17804g();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: b */
        public final void mo17797b(Throwable th) {
            if (ExceptionHelper.m17887a(this.f48741g, th)) {
                m17804g();
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: c */
        public final void mo17798c(Object obj, boolean z2) {
            synchronized (this) {
                this.f48737b.m17845a(z2 ? 1 : 2, obj);
            }
            m17804g();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48745o;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48745o) {
                return;
            }
            this.f48745o = true;
            this.f48738c.dispose();
            if (getAndIncrement() == 0) {
                this.f48737b.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: e */
        public final void mo17799e(boolean z2, ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f48737b.m17845a(z2 ? 3 : 4, leftRightEndObserver);
            }
            m17804g();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: f */
        public final void mo17800f(ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.f48738c.mo17606c(leftRightObserver);
            this.f48742i.decrementAndGet();
            m17804g();
        }

        /* JADX INFO: renamed from: g */
        public final void m17804g() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48737b;
            Observer observer = this.f48736a;
            int iAddAndGet = 1;
            while (!this.f48745o) {
                if (((Throwable) this.f48741g.get()) != null) {
                    spscLinkedArrayQueue.clear();
                    this.f48738c.dispose();
                    m17805h(observer);
                    return;
                }
                boolean z2 = this.f48742i.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z3 = num == null;
                if (z2 && z3) {
                    this.f48739d.clear();
                    this.f48740f.clear();
                    this.f48738c.dispose();
                    observer.onComplete();
                    return;
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == 1) {
                        int i = this.f48743j;
                        this.f48743j = i + 1;
                        this.f48739d.put(Integer.valueOf(i), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            m17806i(th, observer, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i2 = this.f48744n;
                        this.f48744n = i2 + 1;
                        this.f48740f.put(Integer.valueOf(i2), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            m17806i(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 3) {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        LinkedHashMap linkedHashMap = this.f48739d;
                        leftRightEndObserver.getClass();
                        linkedHashMap.remove(0);
                        this.f48738c.mo17604a(leftRightEndObserver);
                    } else {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        LinkedHashMap linkedHashMap2 = this.f48740f;
                        leftRightEndObserver2.getClass();
                        linkedHashMap2.remove(0);
                        this.f48738c.mo17604a(leftRightEndObserver2);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        /* JADX INFO: renamed from: h */
        public final void m17805h(Observer observer) {
            Throwable thM17888b = ExceptionHelper.m17888b(this.f48741g);
            this.f48739d.clear();
            this.f48740f.clear();
            observer.onError(thM17888b);
        }

        /* JADX INFO: renamed from: i */
        public final void m17806i(Throwable th, Observer observer, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            Exceptions.m17612a(th);
            ExceptionHelper.m17887a(this.f48741g, th);
            spscLinkedArrayQueue.clear();
            this.f48738c.dispose();
            m17805h(observer);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        JoinDisposable joinDisposable = new JoinDisposable(observer);
        observer.mo17593c(joinDisposable);
        ObservableGroupJoin.LeftRightObserver leftRightObserver = new ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        CompositeDisposable compositeDisposable = joinDisposable.f48738c;
        compositeDisposable.mo17605b(leftRightObserver);
        compositeDisposable.mo17605b(new ObservableGroupJoin.LeftRightObserver(joinDisposable, false));
        throw null;
    }
}
