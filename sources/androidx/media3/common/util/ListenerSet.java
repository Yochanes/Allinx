package androidx.media3.common.util;

import android.os.Looper;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ListenerSet<T> {

    /* JADX INFO: renamed from: a */
    public final Clock f25604a;

    /* JADX INFO: renamed from: b */
    public final HandlerWrapper f25605b;

    /* JADX INFO: renamed from: c */
    public final IterationFinishedEvent f25606c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f25607d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f25608e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f25609f;

    /* JADX INFO: renamed from: g */
    public final Object f25610g;

    /* JADX INFO: renamed from: h */
    public boolean f25611h;

    /* JADX INFO: renamed from: i */
    public final boolean f25612i;

    /* JADX INFO: compiled from: Proguard */
    public interface Event<T> {
        void invoke(Object obj);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface IterationFinishedEvent<T> {
        /* JADX INFO: renamed from: e */
        void mo41e(Object obj, FlagSet flagSet);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ListenerHolder<T> {

        /* JADX INFO: renamed from: a */
        public final Object f25613a;

        /* JADX INFO: renamed from: b */
        public FlagSet.Builder f25614b = new FlagSet.Builder();

        /* JADX INFO: renamed from: c */
        public boolean f25615c;

        /* JADX INFO: renamed from: d */
        public boolean f25616d;

        public ListenerHolder(Object obj) {
            this.f25613a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.f25613a.equals(((ListenerHolder) obj).f25613a);
        }

        public final int hashCode() {
            return this.f25613a.hashCode();
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m9498a(Object obj) {
        obj.getClass();
        synchronized (this.f25610g) {
            try {
                if (this.f25611h) {
                    return;
                }
                this.f25607d.add(new ListenerHolder(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9499b() {
        m9504g();
        ArrayDeque arrayDeque = this.f25609f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        HandlerWrapper handlerWrapper = this.f25605b;
        if (!handlerWrapper.mo9485a()) {
            handlerWrapper.mo9488d(handlerWrapper.mo9490f(1));
        }
        ArrayDeque arrayDeque2 = this.f25608e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9500c(int i, Event event) {
        m9504g();
        this.f25609f.add(new RunnableC1748a(new CopyOnWriteArraySet(this.f25607d), i, event));
    }

    /* JADX INFO: renamed from: d */
    public final void m9501d() {
        m9504g();
        synchronized (this.f25610g) {
            this.f25611h = true;
        }
        for (ListenerHolder listenerHolder : this.f25607d) {
            IterationFinishedEvent iterationFinishedEvent = this.f25606c;
            listenerHolder.f25616d = true;
            if (listenerHolder.f25615c) {
                listenerHolder.f25615c = false;
                iterationFinishedEvent.mo41e(listenerHolder.f25613a, listenerHolder.f25614b.m9246b());
            }
        }
        this.f25607d.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m9502e(Player.Listener listener) {
        m9504g();
        CopyOnWriteArraySet<ListenerHolder> copyOnWriteArraySet = this.f25607d;
        for (ListenerHolder listenerHolder : copyOnWriteArraySet) {
            if (listenerHolder.f25613a.equals(listener)) {
                listenerHolder.f25616d = true;
                if (listenerHolder.f25615c) {
                    listenerHolder.f25615c = false;
                    FlagSet flagSetM9246b = listenerHolder.f25614b.m9246b();
                    this.f25606c.mo41e(listenerHolder.f25613a, flagSetM9246b);
                }
                copyOnWriteArraySet.remove(listenerHolder);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9503f(int i, Event event) {
        m9500c(i, event);
        m9499b();
    }

    /* JADX INFO: renamed from: g */
    public final void m9504g() {
        if (this.f25612i) {
            Assertions.m9464e(Thread.currentThread() == this.f25605b.mo9496l().getThread());
        }
    }

    public ListenerSet(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent, boolean z2) {
        this.f25604a = clock;
        this.f25607d = copyOnWriteArraySet;
        this.f25606c = iterationFinishedEvent;
        this.f25610g = new Object();
        this.f25608e = new ArrayDeque();
        this.f25609f = new ArrayDeque();
        this.f25605b = clock.mo9469a(looper, new C1749b(this));
        this.f25612i = z2;
    }
}
