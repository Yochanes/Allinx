package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/BaseRequestDelegate;", "Lcoil/request/RequestDelegate;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class BaseRequestDelegate implements RequestDelegate {

    /* JADX INFO: renamed from: a */
    public final Lifecycle f33799a;

    /* JADX INFO: renamed from: b */
    public final Job f33800b;

    public BaseRequestDelegate(Lifecycle lifecycle, Job job) {
        this.f33799a = lifecycle;
        this.f33800b = job;
    }

    @Override // coil.request.RequestDelegate
    /* JADX INFO: renamed from: a */
    public final void mo12495a() {
        this.f33799a.mo9125c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f33800b.mo17054i(null);
    }

    @Override // coil.request.RequestDelegate
    public final void start() {
        this.f33799a.mo9123a(this);
    }
}
