package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMergeWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50696a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50697b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f50698c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50699d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public volatile SpscLinkedArrayQueue f50700f;

        /* JADX INFO: renamed from: g */
        public Object f50701g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f50702i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f50703j;

        /* JADX INFO: renamed from: n */
        public volatile int f50704n;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f50705a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f50705a = mergeWithObserver;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.f50705a;
                mergeWithObserver.f50704n = 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.m18161a();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f50705a;
                if (mergeWithObserver.f50699d.m18231a(th)) {
                    DisposableHelper.m17952a(mergeWithObserver.f50697b);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.m18161a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.f50705a;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.f50696a.onNext(obj);
                    mergeWithObserver.f50704n = 2;
                } else {
                    mergeWithObserver.f50701g = obj;
                    mergeWithObserver.f50704n = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m18161a();
            }
        }

        public MergeWithObserver(Observer observer) {
            this.f50696a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18161a() {
            Observer observer = this.f50696a;
            int iAddAndGet = 1;
            while (!this.f50702i) {
                if (this.f50699d.get() != null) {
                    this.f50701g = null;
                    this.f50700f = null;
                    this.f50699d.m18234d(observer);
                    return;
                }
                int i = this.f50704n;
                if (i == 1) {
                    Object obj = this.f50701g;
                    this.f50701g = null;
                    this.f50704n = 2;
                    observer.onNext(obj);
                    i = 2;
                }
                boolean z2 = this.f50703j;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f50700f;
                Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z3 = objPoll == null;
                if (z2 && z3 && i == 2) {
                    this.f50700f = null;
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
            this.f50701g = null;
            this.f50700f = null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this.f50697b, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b((Disposable) this.f50697b.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50702i = true;
            DisposableHelper.m17952a(this.f50697b);
            DisposableHelper.m17952a(this.f50698c);
            this.f50699d.m18232b();
            if (getAndIncrement() == 0) {
                this.f50700f = null;
                this.f50701g = null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50703j = true;
            if (getAndIncrement() == 0) {
                m18161a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50699d.m18231a(th)) {
                DisposableHelper.m17952a(this.f50698c);
                if (getAndIncrement() == 0) {
                    m18161a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                this.f50696a.onNext(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f50700f;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Flowable.f49359a);
                    this.f50700f = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m18161a();
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
