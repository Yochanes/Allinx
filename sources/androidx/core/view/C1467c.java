package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1467c implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MenuHostHelper f23532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lifecycle.State f23533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuProvider f23534c;

    public /* synthetic */ C1467c(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider) {
        this.f23532a = menuHostHelper;
        this.f23533b = state;
        this.f23534c = menuProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MenuHostHelper menuHostHelper = this.f23532a;
        menuHostHelper.getClass();
        Lifecycle.Event.INSTANCE.getClass();
        Lifecycle.State state = this.f23533b;
        Lifecycle.Event eventM9128b = Lifecycle.Event.Companion.m9128b(state);
        Runnable runnable = menuHostHelper.f23375a;
        CopyOnWriteArrayList copyOnWriteArrayList = menuHostHelper.f23376b;
        MenuProvider menuProvider = this.f23534c;
        if (event == eventM9128b) {
            copyOnWriteArrayList.add(menuProvider);
            runnable.run();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            menuHostHelper.m7732c(menuProvider);
        } else if (event == Lifecycle.Event.Companion.m9127a(state)) {
            copyOnWriteArrayList.remove(menuProvider);
            runnable.run();
        }
    }
}
