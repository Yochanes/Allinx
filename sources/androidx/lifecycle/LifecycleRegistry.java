package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "ObserverWithState", "Companion", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class LifecycleRegistry extends Lifecycle {

    /* JADX INFO: renamed from: b */
    public final boolean f24892b;

    /* JADX INFO: renamed from: c */
    public FastSafeIterableMap f24893c;

    /* JADX INFO: renamed from: d */
    public Lifecycle.State f24894d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f24895e;

    /* JADX INFO: renamed from: f */
    public int f24896f;

    /* JADX INFO: renamed from: g */
    public boolean f24897g;

    /* JADX INFO: renamed from: h */
    public boolean f24898h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f24899i;

    /* JADX INFO: renamed from: j */
    public final MutableStateFlow f24900j;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class ObserverWithState {

        /* JADX INFO: renamed from: a */
        public Lifecycle.State f24901a;

        /* JADX INFO: renamed from: b */
        public LifecycleEventObserver f24902b;

        /* JADX INFO: renamed from: a */
        public final void m9136a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State stateM9126a = event.m9126a();
            Lifecycle.State state1 = this.f24901a;
            Intrinsics.m18599g(state1, "state1");
            if (stateM9126a.compareTo(state1) < 0) {
                state1 = stateM9126a;
            }
            this.f24901a = state1;
            this.f24902b.mo148j(lifecycleOwner, event);
            this.f24901a = stateM9126a;
        }
    }

    public LifecycleRegistry(LifecycleOwner provider) {
        Intrinsics.m18599g(provider, "provider");
        this.f24892b = true;
        this.f24893c = new FastSafeIterableMap();
        Lifecycle.State state = Lifecycle.State.f24881b;
        this.f24894d = state;
        this.f24899i = new ArrayList();
        this.f24895e = new WeakReference(provider);
        this.f24900j = StateFlowKt.m20803a(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: a */
    public final void mo9123a(LifecycleObserver observer) {
        LifecycleEventObserver reflectiveGenericLifecycleObserver;
        LifecycleOwner lifecycleOwner;
        ArrayList arrayList = this.f24899i;
        Intrinsics.m18599g(observer, "observer");
        m9131e("addObserver");
        Lifecycle.State state = this.f24894d;
        Lifecycle.State state2 = Lifecycle.State.f24880a;
        if (state != state2) {
            state2 = Lifecycle.State.f24881b;
        }
        ObserverWithState observerWithState = new ObserverWithState();
        HashMap map = Lifecycling.f24904a;
        boolean z2 = observer instanceof LifecycleEventObserver;
        boolean z3 = observer instanceof DefaultLifecycleObserver;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) observer, (LifecycleEventObserver) observer);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) observer, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (LifecycleEventObserver) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (Lifecycling.m9138b(cls) == 2) {
                Object obj = Lifecycling.f24905b.get(cls);
                Intrinsics.m18596d(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(Lifecycling.m9137a((Constructor) list.get(0), observer));
                } else {
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i = 0; i < size; i++) {
                        generatedAdapterArr[i] = Lifecycling.m9137a((Constructor) list.get(i), observer);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(observer);
            }
        }
        observerWithState.f24902b = reflectiveGenericLifecycleObserver;
        observerWithState.f24901a = state2;
        if (((ObserverWithState) this.f24893c.mo807c(observer, observerWithState)) == null && (lifecycleOwner = (LifecycleOwner) this.f24895e.get()) != null) {
            boolean z4 = this.f24896f != 0 || this.f24897g;
            Lifecycle.State stateM9130d = m9130d(observer);
            this.f24896f++;
            while (observerWithState.f24901a.compareTo(stateM9130d) < 0 && this.f24893c.f1506f.containsKey(observer)) {
                arrayList.add(observerWithState.f24901a);
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                Lifecycle.State state3 = observerWithState.f24901a;
                companion.getClass();
                Intrinsics.m18599g(state3, "state");
                int iOrdinal = state3.ordinal();
                Lifecycle.Event event = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE;
                if (event == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.f24901a);
                }
                observerWithState.m9136a(lifecycleOwner, event);
                arrayList.remove(arrayList.size() - 1);
                stateM9130d = m9130d(observer);
            }
            if (!z4) {
                m9135i();
            }
            this.f24896f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Lifecycle.State getF24894d() {
        return this.f24894d;
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: c */
    public final void mo9125c(LifecycleObserver observer) {
        Intrinsics.m18599g(observer, "observer");
        m9131e("removeObserver");
        this.f24893c.mo808d(observer);
    }

    /* JADX INFO: renamed from: d */
    public final Lifecycle.State m9130d(LifecycleObserver lifecycleObserver) {
        ObserverWithState observerWithState;
        Map.Entry entryM809e = this.f24893c.m809e(lifecycleObserver);
        Lifecycle.State state = (entryM809e == null || (observerWithState = (ObserverWithState) entryM809e.getValue()) == null) ? null : observerWithState.f24901a;
        ArrayList arrayList = this.f24899i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) AbstractC0000a.m8e(1, arrayList);
        Lifecycle.State state1 = this.f24894d;
        Intrinsics.m18599g(state1, "state1");
        if (state == null || state.compareTo(state1) >= 0) {
            state = state1;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    /* JADX INFO: renamed from: e */
    public final void m9131e(String str) {
        if (this.f24892b) {
            ArchTaskExecutor.m803a().f1500a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0000a.m3D("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9132f(Lifecycle.Event event) {
        Intrinsics.m18599g(event, "event");
        m9131e("handleLifecycleEvent");
        m9133g(event.m9126a());
    }

    /* JADX INFO: renamed from: g */
    public final void m9133g(Lifecycle.State next) {
        if (this.f24894d == next) {
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f24895e.get();
        Lifecycle.State current = this.f24894d;
        Intrinsics.m18599g(current, "current");
        Intrinsics.m18599g(next, "next");
        if (current == Lifecycle.State.f24881b && next == Lifecycle.State.f24880a) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.f24882c + "' to be moved to '" + next + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state = Lifecycle.State.f24880a;
        if (current == state && current != next) {
            throw new IllegalStateException(("State is '" + state + "' and cannot be moved to `" + next + "` in component " + lifecycleOwner).toString());
        }
        this.f24894d = next;
        if (this.f24897g || this.f24896f != 0) {
            this.f24898h = true;
            return;
        }
        this.f24897g = true;
        m9135i();
        this.f24897g = false;
        if (this.f24894d == state) {
            this.f24893c = new FastSafeIterableMap();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m9134h(Lifecycle.State state) {
        Intrinsics.m18599g(state, "state");
        m9131e("setCurrentState");
        m9133g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r8.f24898h = false;
        r8.f24900j.setValue(r8.f24894d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9135i() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f24895e.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            FastSafeIterableMap fastSafeIterableMap = this.f24893c;
            if (fastSafeIterableMap.f1510d != 0) {
                SafeIterableMap.Entry entry = fastSafeIterableMap.f1507a;
                Intrinsics.m18596d(entry);
                Lifecycle.State state = ((ObserverWithState) entry.getValue()).f24901a;
                SafeIterableMap.Entry entry2 = this.f24893c.f1508b;
                Intrinsics.m18596d(entry2);
                Lifecycle.State state2 = ((ObserverWithState) entry2.getValue()).f24901a;
                if (state == state2 && this.f24894d == state2) {
                    break;
                }
                this.f24898h = false;
                Lifecycle.State state3 = this.f24894d;
                SafeIterableMap.Entry entry3 = this.f24893c.f1507a;
                Intrinsics.m18596d(entry3);
                if (state3.compareTo(((ObserverWithState) entry3.getValue()).f24901a) < 0) {
                    Iterator itDescendingIterator = this.f24893c.descendingIterator();
                    while (itDescendingIterator.hasNext() && !this.f24898h) {
                        Map.Entry entry4 = (Map.Entry) itDescendingIterator.next();
                        Intrinsics.m18596d(entry4);
                        LifecycleObserver lifecycleObserver = (LifecycleObserver) entry4.getKey();
                        ObserverWithState observerWithState = (ObserverWithState) entry4.getValue();
                        while (observerWithState.f24901a.compareTo(this.f24894d) > 0 && !this.f24898h && this.f24893c.f1506f.containsKey(lifecycleObserver)) {
                            Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                            Lifecycle.State state4 = observerWithState.f24901a;
                            companion.getClass();
                            Lifecycle.Event eventM9127a = Lifecycle.Event.Companion.m9127a(state4);
                            if (eventM9127a == null) {
                                throw new IllegalStateException("no event down from " + observerWithState.f24901a);
                            }
                            this.f24899i.add(eventM9127a.m9126a());
                            observerWithState.m9136a(lifecycleOwner, eventM9127a);
                            ArrayList arrayList = this.f24899i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                SafeIterableMap.Entry entry5 = this.f24893c.f1508b;
                if (!this.f24898h && entry5 != null && this.f24894d.compareTo(((ObserverWithState) entry5.getValue()).f24901a) > 0) {
                    FastSafeIterableMap fastSafeIterableMap2 = this.f24893c;
                    fastSafeIterableMap2.getClass();
                    SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                    fastSafeIterableMap2.f1509c.put(iteratorWithAdditions, Boolean.FALSE);
                    while (iteratorWithAdditions.hasNext() && !this.f24898h) {
                        Map.Entry entry6 = (Map.Entry) iteratorWithAdditions.next();
                        LifecycleObserver lifecycleObserver2 = (LifecycleObserver) entry6.getKey();
                        ObserverWithState observerWithState2 = (ObserverWithState) entry6.getValue();
                        while (observerWithState2.f24901a.compareTo(this.f24894d) < 0 && !this.f24898h && this.f24893c.f1506f.containsKey(lifecycleObserver2)) {
                            this.f24899i.add(observerWithState2.f24901a);
                            Lifecycle.Event.Companion companion2 = Lifecycle.Event.INSTANCE;
                            Lifecycle.State state5 = observerWithState2.f24901a;
                            companion2.getClass();
                            Intrinsics.m18599g(state5, "state");
                            int iOrdinal = state5.ordinal();
                            Lifecycle.Event event = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE;
                            if (event == null) {
                                throw new IllegalStateException("no event up from " + observerWithState2.f24901a);
                            }
                            observerWithState2.m9136a(lifecycleOwner, event);
                            ArrayList arrayList2 = this.f24899i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
