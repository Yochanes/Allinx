package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.os.SavedStateRegistry;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lifecycle f24876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SavedStateRegistry f24877b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(Lifecycle lifecycle, SavedStateRegistry savedStateRegistry) {
        this.f24876a = lifecycle;
        this.f24877b = savedStateRegistry;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.f24876a.mo9125c(this);
            this.f24877b.m11874d();
        }
    }
}
