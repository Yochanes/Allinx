package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.DefaultTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.util.Map;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k */
    public static final Object f24906k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f24907a;

    /* JADX INFO: renamed from: b */
    public final SafeIterableMap f24908b;

    /* JADX INFO: renamed from: c */
    public int f24909c;

    /* JADX INFO: renamed from: d */
    public boolean f24910d;

    /* JADX INFO: renamed from: e */
    public volatile Object f24911e;

    /* JADX INFO: renamed from: f */
    public volatile Object f24912f;

    /* JADX INFO: renamed from: g */
    public int f24913g;

    /* JADX INFO: renamed from: h */
    public boolean f24914h;

    /* JADX INFO: renamed from: i */
    public boolean f24915i;

    /* JADX INFO: renamed from: j */
    public final Runnable f24916j;

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC17051 implements Runnable {
        public RunnableC17051() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f24907a) {
                obj = LiveData.this.f24912f;
                LiveData.this.f24912f = LiveData.f24906k;
            }
            LiveData.this.mo9147k(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* JADX INFO: renamed from: e */
        public final boolean mo9148e() {
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {

        /* JADX INFO: renamed from: f */
        public final LifecycleOwner f24918f;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            this.f24918f = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* JADX INFO: renamed from: c */
        public final void mo9149c() {
            this.f24918f.getLifecycle().mo9125c(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* JADX INFO: renamed from: d */
        public final boolean mo9150d(LifecycleOwner lifecycleOwner) {
            return this.f24918f == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* JADX INFO: renamed from: e */
        public final boolean mo9148e() {
            return this.f24918f.getLifecycle().mo9124b().compareTo(Lifecycle.State.f24883d) >= 0;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* JADX INFO: renamed from: j */
        public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            LifecycleOwner lifecycleOwner2 = this.f24918f;
            Lifecycle.State stateMo9124b = lifecycleOwner2.getLifecycle().mo9124b();
            if (stateMo9124b == Lifecycle.State.f24880a) {
                LiveData.this.m9146j(this.f24920a);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateMo9124b) {
                m9151b(mo9148e());
                state = stateMo9124b;
                stateMo9124b = lifecycleOwner2.getLifecycle().mo9124b();
            }
        }
    }

    public LiveData(Object obj) {
        this.f24907a = new Object();
        this.f24908b = new SafeIterableMap();
        this.f24909c = 0;
        this.f24912f = f24906k;
        this.f24916j = new RunnableC17051();
        this.f24911e = obj;
        this.f24913g = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m9139a(String str) {
        ArchTaskExecutor.m803a().f1500a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0000a.m3D("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9140b(ObserverWrapper observerWrapper) {
        if (observerWrapper.f24921b) {
            if (!observerWrapper.mo9148e()) {
                observerWrapper.m9151b(false);
                return;
            }
            int i = observerWrapper.f24922c;
            int i2 = this.f24913g;
            if (i >= i2) {
                return;
            }
            observerWrapper.f24922c = i2;
            observerWrapper.f24920a.mo1166a(this.f24911e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9141c(ObserverWrapper observerWrapper) {
        if (this.f24914h) {
            this.f24915i = true;
            return;
        }
        this.f24914h = true;
        do {
            this.f24915i = false;
            if (observerWrapper != null) {
                m9140b(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap safeIterableMap = this.f24908b;
                safeIterableMap.getClass();
                SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                safeIterableMap.f1509c.put(iteratorWithAdditions, Boolean.FALSE);
                while (iteratorWithAdditions.hasNext()) {
                    m9140b((ObserverWrapper) ((Map.Entry) iteratorWithAdditions.next()).getValue());
                    if (this.f24915i) {
                        break;
                    }
                }
            }
        } while (this.f24915i);
        this.f24914h = false;
    }

    /* JADX INFO: renamed from: d */
    public Object mo960d() {
        Object obj = this.f24911e;
        if (obj != f24906k) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m9142e(LifecycleOwner lifecycleOwner, Observer observer) {
        m9139a("observe");
        if (lifecycleOwner.getLifecycle().mo9124b() == Lifecycle.State.f24880a) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f24908b.mo807c(observer, lifecycleBoundObserver);
        if (observerWrapper != null && !observerWrapper.mo9150d(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        lifecycleOwner.getLifecycle().mo9123a(lifecycleBoundObserver);
    }

    /* JADX INFO: renamed from: f */
    public final void m9143f(Observer observer) {
        m9139a("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f24908b.mo807c(observer, alwaysActiveObserver);
        if (observerWrapper instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        alwaysActiveObserver.m9151b(true);
    }

    /* JADX INFO: renamed from: i */
    public void m9145i(Object obj) {
        boolean z2;
        synchronized (this.f24907a) {
            z2 = this.f24912f == f24906k;
            this.f24912f = obj;
        }
        if (z2) {
            ArchTaskExecutor archTaskExecutorM803a = ArchTaskExecutor.m803a();
            Runnable runnable = this.f24916j;
            DefaultTaskExecutor defaultTaskExecutor = archTaskExecutorM803a.f1500a;
            if (defaultTaskExecutor.f1503c == null) {
                synchronized (defaultTaskExecutor.f1501a) {
                    try {
                        if (defaultTaskExecutor.f1503c == null) {
                            defaultTaskExecutor.f1503c = DefaultTaskExecutor.m804a(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            defaultTaskExecutor.f1503c.post(runnable);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m9146j(Observer observer) {
        m9139a("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f24908b.mo808d(observer);
        if (observerWrapper == null) {
            return;
        }
        observerWrapper.mo9149c();
        observerWrapper.m9151b(false);
    }

    /* JADX INFO: renamed from: k */
    public void mo9147k(Object obj) {
        m9139a("setValue");
        this.f24913g++;
        this.f24911e = obj;
        m9141c(null);
    }

    public LiveData() {
        this.f24907a = new Object();
        this.f24908b = new SafeIterableMap();
        this.f24909c = 0;
        Object obj = f24906k;
        this.f24912f = obj;
        this.f24916j = new RunnableC17051();
        this.f24911e = obj;
        this.f24913g = -1;
    }

    /* JADX INFO: compiled from: Proguard */
    public abstract class ObserverWrapper {

        /* JADX INFO: renamed from: a */
        public final Observer f24920a;

        /* JADX INFO: renamed from: b */
        public boolean f24921b;

        /* JADX INFO: renamed from: c */
        public int f24922c = -1;

        public ObserverWrapper(Observer observer) {
            this.f24920a = observer;
        }

        /* JADX INFO: renamed from: b */
        public final void m9151b(boolean z2) {
            if (z2 == this.f24921b) {
                return;
            }
            this.f24921b = z2;
            int i = z2 ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i2 = liveData.f24909c;
            liveData.f24909c = i + i2;
            if (!liveData.f24910d) {
                liveData.f24910d = true;
                while (true) {
                    try {
                        int i3 = liveData.f24909c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z3 = i2 == 0 && i3 > 0;
                        boolean z4 = i2 > 0 && i3 == 0;
                        if (z3) {
                            liveData.mo9114g();
                        } else if (z4) {
                            liveData.mo9144h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.f24910d = false;
                        throw th;
                    }
                }
                liveData.f24910d = false;
            }
            if (this.f24921b) {
                liveData.m9141c(this);
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean mo9150d(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public abstract boolean mo9148e();

        /* JADX INFO: renamed from: c */
        public void mo9149c() {
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo9114g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo9144h() {
    }
}
