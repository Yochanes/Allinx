package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final SavedStateHandlesProvider f24978a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f24978a = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.getLifecycle().mo9125c(this);
            this.f24978a.m9168b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
