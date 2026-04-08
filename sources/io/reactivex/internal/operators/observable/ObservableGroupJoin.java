package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, JoinSupport {

        /* JADX INFO: renamed from: a */
        public final Observer f48716a;

        /* JADX INFO: renamed from: j */
        public int f48723j;

        /* JADX INFO: renamed from: n */
        public int f48724n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f48725o;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f48718c = new CompositeDisposable();

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48717b = new SpscLinkedArrayQueue(Flowable.f47532a);

        /* JADX INFO: renamed from: d */
        public final LinkedHashMap f48719d = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final LinkedHashMap f48720f = new LinkedHashMap();

        /* JADX INFO: renamed from: g */
        public final AtomicReference f48721g = new AtomicReference();

        /* JADX INFO: renamed from: i */
        public final AtomicInteger f48722i = new AtomicInteger(2);

        public GroupJoinDisposable(Observer observer) {
            this.f48716a = observer;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: a */
        public final void mo17796a(Throwable th) {
            if (!ExceptionHelper.m17887a(this.f48721g, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48722i.decrementAndGet();
                m17801g();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: b */
        public final void mo17797b(Throwable th) {
            if (ExceptionHelper.m17887a(this.f48721g, th)) {
                m17801g();
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: c */
        public final void mo17798c(Object obj, boolean z2) {
            synchronized (this) {
                this.f48717b.m17845a(z2 ? 1 : 2, obj);
            }
            m17801g();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48725o;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48725o) {
                return;
            }
            this.f48725o = true;
            this.f48718c.dispose();
            if (getAndIncrement() == 0) {
                this.f48717b.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: e */
        public final void mo17799e(boolean z2, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f48717b.m17845a(z2 ? 3 : 4, leftRightEndObserver);
            }
            m17801g();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* JADX INFO: renamed from: f */
        public final void mo17800f(LeftRightObserver leftRightObserver) {
            this.f48718c.mo17606c(leftRightObserver);
            this.f48722i.decrementAndGet();
            m17801g();
        }

        /* JADX INFO: renamed from: g */
        public final void m17801g() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48717b;
            Observer observer = this.f48716a;
            int iAddAndGet = 1;
            while (!this.f48725o) {
                if (((Throwable) this.f48721g.get()) != null) {
                    spscLinkedArrayQueue.clear();
                    this.f48718c.dispose();
                    m17802h(observer);
                    return;
                }
                boolean z2 = this.f48722i.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z3 = num == null;
                if (z2 && z3) {
                    Iterator it = this.f48719d.values().iterator();
                    while (it.hasNext()) {
                        ((UnicastSubject) it.next()).onComplete();
                    }
                    this.f48719d.clear();
                    this.f48720f.clear();
                    this.f48718c.dispose();
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
                        UnicastSubject unicastSubject = new UnicastSubject(Flowable.f47532a);
                        int i = this.f48723j;
                        this.f48723j = i + 1;
                        this.f48719d.put(Integer.valueOf(i), unicastSubject);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            m17803i(th, observer, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i2 = this.f48724n;
                        this.f48724n = i2 + 1;
                        this.f48720f.put(Integer.valueOf(i2), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            m17803i(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 3) {
                        LeftRightEndObserver leftRightEndObserver = (LeftRightEndObserver) objPoll;
                        LinkedHashMap linkedHashMap = this.f48719d;
                        leftRightEndObserver.getClass();
                        UnicastSubject unicastSubject2 = (UnicastSubject) linkedHashMap.remove(0);
                        this.f48718c.mo17604a(leftRightEndObserver);
                        if (unicastSubject2 != null) {
                            unicastSubject2.onComplete();
                        }
                    } else if (num == 4) {
                        LeftRightEndObserver leftRightEndObserver2 = (LeftRightEndObserver) objPoll;
                        LinkedHashMap linkedHashMap2 = this.f48720f;
                        leftRightEndObserver2.getClass();
                        linkedHashMap2.remove(0);
                        this.f48718c.mo17604a(leftRightEndObserver2);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        /* JADX INFO: renamed from: h */
        public final void m17802h(Observer observer) {
            Throwable thM17888b = ExceptionHelper.m17888b(this.f48721g);
            LinkedHashMap linkedHashMap = this.f48719d;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((UnicastSubject) it.next()).onError(thM17888b);
            }
            linkedHashMap.clear();
            this.f48720f.clear();
            observer.onError(thM17888b);
        }

        /* JADX INFO: renamed from: i */
        public final void m17803i(Throwable th, Observer observer, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            Exceptions.m17612a(th);
            ExceptionHelper.m17887a(this.f48721g, th);
            spscLinkedArrayQueue.clear();
            this.f48718c.dispose();
            m17802h(observer);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface JoinSupport {
        /* JADX INFO: renamed from: a */
        void mo17796a(Throwable th);

        /* JADX INFO: renamed from: b */
        void mo17797b(Throwable th);

        /* JADX INFO: renamed from: c */
        void mo17798c(Object obj, boolean z2);

        /* JADX INFO: renamed from: e */
        void mo17799e(boolean z2, LeftRightEndObserver leftRightEndObserver);

        /* JADX INFO: renamed from: f */
        void mo17800f(LeftRightObserver leftRightObserver);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LeftRightEndObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (DisposableHelper.m17615a(this)) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LeftRightObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f48726a;

        /* JADX INFO: renamed from: b */
        public final boolean f48727b;

        /* JADX WARN: Multi-variable type inference failed */
        public LeftRightObserver(JoinSupport joinSupport, boolean z2) {
            this.f48726a = (AtomicInteger) joinSupport;
            this.f48727b = z2;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport, java.util.concurrent.atomic.AtomicInteger] */
        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48726a.mo17800f(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport, java.util.concurrent.atomic.AtomicInteger] */
        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48726a.mo17796a(th);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport, java.util.concurrent.atomic.AtomicInteger] */
        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48726a.mo17798c(obj, this.f48727b);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        GroupJoinDisposable groupJoinDisposable = new GroupJoinDisposable(observer);
        observer.mo17593c(groupJoinDisposable);
        LeftRightObserver leftRightObserver = new LeftRightObserver(groupJoinDisposable, true);
        CompositeDisposable compositeDisposable = groupJoinDisposable.f48718c;
        compositeDisposable.mo17605b(leftRightObserver);
        compositeDisposable.mo17605b(new LeftRightObserver(groupJoinDisposable, false));
        throw null;
    }
}
