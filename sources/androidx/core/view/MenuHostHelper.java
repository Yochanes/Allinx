package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MenuHostHelper {

    /* JADX INFO: renamed from: a */
    public final Runnable f23375a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f23376b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final HashMap f23377c = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    public static class LifecycleContainer {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f23378a;

        /* JADX INFO: renamed from: b */
        public LifecycleEventObserver f23379b;

        public LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f23378a = lifecycle;
            this.f23379b = lifecycleEventObserver;
            lifecycle.mo9123a(lifecycleEventObserver);
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f23375a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m7730a(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.f23376b.add(menuProvider);
        this.f23375a.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f23377c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f23378a.mo9125c(lifecycleContainer.f23379b);
            lifecycleContainer.f23379b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new C1468d(0, this, menuProvider)));
    }

    /* JADX INFO: renamed from: b */
    public final void m7731b(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f23377c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f23378a.mo9125c(lifecycleContainer.f23379b);
            lifecycleContainer.f23379b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new C1467c(this, state, menuProvider)));
    }

    /* JADX INFO: renamed from: c */
    public final void m7732c(MenuProvider menuProvider) {
        this.f23376b.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f23377c.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f23378a.mo9125c(lifecycleContainer.f23379b);
            lifecycleContainer.f23379b = null;
        }
        this.f23375a.run();
    }
}
