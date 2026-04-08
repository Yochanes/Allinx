package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMergeWithSingle<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50706a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50707b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f50708c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50709d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public volatile SpscLinkedArrayQueue f50710f;

        /* JADX INFO: renamed from: g */
        public Object f50711g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f50712i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f50713j;

        /* JADX INFO: renamed from: n */
        public volatile int f50714n;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f50715a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f50715a = mergeWithObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f50715a;
                if (mergeWithObserver.f50709d.m18231a(th)) {
                    DisposableHelper.m17952a(mergeWithObserver.f50707b);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.m18162a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.f50715a;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.f50706a.onNext(obj);
                    mergeWithObserver.f50714n = 2;
                } else {
                    mergeWithObserver.f50711g = obj;
                    mergeWithObserver.f50714n = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m18162a();
            }
        }

        public MergeWithObserver(Observer observer) {
            this.f50706a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18162a() {
            Observer observer = this.f50706a;
            int iAddAndGet = 1;
            while (!this.f50712i) {
                if (this.f50709d.get() != null) {
                    this.f50711g = null;
                    this.f50710f = null;
                    this.f50709d.m18234d(observer);
                    return;
                }
                int i = this.f50714n;
                if (i == 1) {
                    Object obj = this.f50711g;
                    this.f50711g = null;
                    this.f50714n = 2;
                    observer.onNext(obj);
                    i = 2;
                }
                boolean z2 = this.f50713j;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f50710f;
                Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z3 = objPoll == null;
                if (z2 && z3 && i == 2) {
                    this.f50710f = null;
                    observer.onComplete();
                    return;
                } else if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            this.f50711g = null;
            this.f50710f = null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this.f50707b, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b((Disposable) this.f50707b.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50712i = true;
            DisposableHelper.m17952a(this.f50707b);
            DisposableHelper.m17952a(this.f50708c);
            this.f50709d.m18232b();
            if (getAndIncrement() == 0) {
                this.f50710f = null;
                this.f50711g = null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50713j = true;
            if (getAndIncrement() == 0) {
                m18162a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50709d.m18231a(th)) {
                DisposableHelper.m17952a(this.f50708c);
                if (getAndIncrement() == 0) {
                    m18162a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                this.f50706a.onNext(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f50710f;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Flowable.f49359a);
                    this.f50710f = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m18162a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.mo12365c(mergeWithObserver);
        this.f50392a.mo17931a(mergeWithObserver);
        throw null;
    }
}
