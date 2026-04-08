package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final GeneratedAdapter[] f24847a;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.f24847a = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        GeneratedAdapter[] generatedAdapterArr = this.f24847a;
        for (GeneratedAdapter generatedAdapter : generatedAdapterArr) {
            generatedAdapter.mo9119a(lifecycleOwner, event, false, methodCallsLogger);
        }
        for (GeneratedAdapter generatedAdapter2 : generatedAdapterArr) {
            generatedAdapter2.mo9119a(lifecycleOwner, event, true, methodCallsLogger);
        }
    }
}
