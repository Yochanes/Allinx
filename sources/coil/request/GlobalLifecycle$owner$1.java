package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"coil/request/GlobalLifecycle$owner$1", "Landroidx/lifecycle/LifecycleOwner;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GlobalLifecycle$owner$1 implements LifecycleOwner {
    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return GlobalLifecycle.f33832b;
    }
}
