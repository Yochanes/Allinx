package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, Disposable {

    /* JADX INFO: compiled from: Proguard */
    public interface BufferSupplier<T> {
        ReplayBuffer call();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DisposeConsumer<R> implements Consumer<Disposable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerDisposable<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final ReplayObserver f48819a;

        /* JADX INFO: renamed from: b */
        public final Observer f48820b;

        /* JADX INFO: renamed from: c */
        public Serializable f48821c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48822d;

        public InnerDisposable(ReplayObserver replayObserver, Observer observer) {
            this.f48819a = replayObserver;
            this.f48820b = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48822d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            InnerDisposable[] innerDisposableArr;
            if (this.f48822d) {
                return;
            }
            this.f48822d = true;
            ReplayObserver replayObserver = this.f48819a;
            while (true) {
                AtomicReference atomicReference = replayObserver.f48828c;
                InnerDisposable[] innerDisposableArr2 = (InnerDisposable[]) atomicReference.get();
                int length = innerDisposableArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerDisposableArr2[i].equals(this)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr = ReplayObserver.f48824d;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr2, 0, innerDisposableArr3, 0, i);
                    System.arraycopy(innerDisposableArr2, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr = innerDisposableArr3;
                }
                while (!atomicReference.compareAndSet(innerDisposableArr2, innerDisposableArr)) {
                    if (atomicReference.get() != innerDisposableArr2) {
                        break;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MulticastReplay<R, U> extends Observable<R> {
        @Override // io.reactivex.Observable
        /* JADX INFO: renamed from: b */
        public final void mo17592b(Observer observer) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                EmptyDisposable.m17624f(th, observer);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Node extends AtomicReference<Node> {

        /* JADX INFO: renamed from: a */
        public final Object f48823a;

        public Node(Object obj) {
            this.f48823a = obj;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Replay<T> extends ConnectableObservable<T> {
        @Override // io.reactivex.Observable
        /* JADX INFO: renamed from: b */
        public final void mo17592b(Observer observer) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ReplayBuffer<T> {
        /* JADX INFO: renamed from: a */
        void mo17812a();

        /* JADX INFO: renamed from: c */
        void mo17814c(Object obj);

        /* JADX INFO: renamed from: d */
        void mo17815d(Throwable th);

        /* JADX INFO: renamed from: e */
        void mo17816e(InnerDisposable innerDisposable);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplayBufferSupplier<T> implements BufferSupplier<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: d */
        public static final InnerDisposable[] f48824d = new InnerDisposable[0];

        /* JADX INFO: renamed from: f */
        public static final InnerDisposable[] f48825f = new InnerDisposable[0];

        /* JADX INFO: renamed from: a */
        public final ReplayBuffer f48826a;

        /* JADX INFO: renamed from: b */
        public boolean f48827b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48828c = new AtomicReference(f48824d);

        public ReplayObserver(ReplayBuffer replayBuffer) {
            this.f48826a = replayBuffer;
            new AtomicBoolean();
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f48828c.get()) {
                    this.f48826a.mo17816e(innerDisposable);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48828c.get() == f48825f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48828c.set(f48825f);
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48827b) {
                return;
            }
            this.f48827b = true;
            ReplayBuffer replayBuffer = this.f48826a;
            replayBuffer.mo17812a();
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f48828c.getAndSet(f48825f)) {
                replayBuffer.mo17816e(innerDisposable);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48827b) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f48827b = true;
            ReplayBuffer replayBuffer = this.f48826a;
            replayBuffer.mo17815d(th);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f48828c.getAndSet(f48825f)) {
                replayBuffer.mo17816e(innerDisposable);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48827b) {
                return;
            }
            ReplayBuffer replayBuffer = this.f48826a;
            replayBuffer.mo17814c(obj);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f48828c.get()) {
                replayBuffer.mo17816e(innerDisposable);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplaySource<T> implements ObservableSource<T> {
        @Override // io.reactivex.ObservableSource
        /* JADX INFO: renamed from: a */
        public final void mo17591a(Observer observer) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ScheduledReplaySupplier<T> implements BufferSupplier<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* JADX INFO: renamed from: b */
        public final Object mo17813b(Object obj) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* JADX INFO: renamed from: f */
        public final Node mo17817f() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* JADX INFO: renamed from: g */
        public final Object mo17818g(Object obj) {
            ((Timed) obj).getClass();
            return null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* JADX INFO: renamed from: h */
        public final void mo17819h() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* JADX INFO: renamed from: i */
        public final void mo17820i() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* JADX INFO: renamed from: h */
        public final void mo17819h() {
            if (this.f48818b > 0) {
                this.f48818b--;
                set(get().get());
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnBoundedFactory implements BufferSupplier<Object> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {

        /* JADX INFO: renamed from: a */
        public volatile int f48829a;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: a */
        public final void mo17812a() {
            add(NotificationLite.f49279a);
            this.f48829a++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: c */
        public final void mo17814c(Object obj) {
            add(obj);
            this.f48829a++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: d */
        public final void mo17815d(Throwable th) {
            add(NotificationLite.m17900e(th));
            this.f48829a++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: e */
        public final void mo17816e(InnerDisposable innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer observer = innerDisposable.f48820b;
            int iAddAndGet = 1;
            while (!innerDisposable.f48822d) {
                int i = this.f48829a;
                Integer num = (Integer) innerDisposable.f48821c;
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (NotificationLite.m17896a(get(iIntValue), observer) || innerDisposable.f48822d) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                innerDisposable.f48821c = Integer.valueOf(iIntValue);
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {

        /* JADX INFO: renamed from: a */
        public Node f48817a;

        /* JADX INFO: renamed from: b */
        public int f48818b;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: a */
        public final void mo17812a() {
            Node node = new Node(mo17813b(NotificationLite.f49279a));
            this.f48817a.set(node);
            this.f48817a = node;
            this.f48818b++;
            mo17820i();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: c */
        public final void mo17814c(Object obj) {
            Node node = new Node(mo17813b(obj));
            this.f48817a.set(node);
            this.f48817a = node;
            this.f48818b++;
            mo17819h();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: d */
        public final void mo17815d(Throwable th) {
            Node node = new Node(mo17813b(NotificationLite.m17900e(th)));
            this.f48817a.set(node);
            this.f48817a = node;
            this.f48818b++;
            mo17820i();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* JADX INFO: renamed from: e */
        public final void mo17816e(InnerDisposable innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                Node nodeMo17817f = (Node) innerDisposable.f48821c;
                if (nodeMo17817f == null) {
                    nodeMo17817f = mo17817f();
                    innerDisposable.f48821c = nodeMo17817f;
                }
                while (!innerDisposable.f48822d) {
                    Node node = nodeMo17817f.get();
                    if (node == null) {
                        innerDisposable.f48821c = nodeMo17817f;
                        iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                    } else {
                        if (NotificationLite.m17896a(mo17818g(node.f48823a), innerDisposable.f48820b)) {
                            innerDisposable.f48821c = null;
                            return;
                        }
                        nodeMo17817f = node;
                    }
                }
                return;
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: f */
        public Node mo17817f() {
            return get();
        }

        /* JADX INFO: renamed from: h */
        public abstract void mo17819h();

        /* JADX INFO: renamed from: i */
        public void mo17820i() {
            Node node = get();
            if (node.f48823a != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        /* JADX INFO: renamed from: b */
        public Object mo17813b(Object obj) {
            return obj;
        }

        /* JADX INFO: renamed from: g */
        public Object mo17818g(Object obj) {
            return obj;
        }
    }
}
