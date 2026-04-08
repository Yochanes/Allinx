package androidx.compose.material3.internal;

import androidx.compose.p013ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import androidx.os.internal.SavedStateRegistryImpl;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.material3.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1168a implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15721b;

    public /* synthetic */ C1168a(Object obj, int i) {
        this.f15720a = i;
        this.f15721b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f15720a) {
            case 0:
                ((Function1) this.f15721b).invoke(event);
                break;
            case 1:
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ((AbstractComposeView) this.f15721b).disposeComposition();
                }
                break;
            case 2:
                Lifecycle.State stateM9126a = event.m9126a();
                NavControllerImpl navControllerImpl = (NavControllerImpl) this.f15721b;
                navControllerImpl.f30469r = stateM9126a;
                if (navControllerImpl.f30454c != null) {
                    for (NavBackStackEntry navBackStackEntry : CollectionsKt.m18469z0(navControllerImpl.f30457f)) {
                        navBackStackEntry.getClass();
                        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.f30182j;
                        navBackStackEntryImpl.getClass();
                        navBackStackEntryImpl.f30434d = event.m9126a();
                        navBackStackEntryImpl.m11270c();
                    }
                }
                break;
            default:
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                SavedStateRegistryImpl savedStateRegistryImpl = (SavedStateRegistryImpl) this.f15721b;
                if (event == event2) {
                    savedStateRegistryImpl.f32039h = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    savedStateRegistryImpl.f32039h = false;
                }
                break;
        }
    }
}
