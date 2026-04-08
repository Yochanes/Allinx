package autodispose2.androidx.lifecycle;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import autodispose2.androidx.lifecycle.LifecycleEventsObservable;
import java.util.HashMap;

/* JADX INFO: renamed from: autodispose2.androidx.lifecycle.LifecycleEventsObservable_AutoDisposeLifecycleObserver_LifecycleAdapter */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2354x78aa5e3b implements GeneratedAdapter {

    /* JADX INFO: renamed from: a */
    public final LifecycleEventsObservable.AutoDisposeLifecycleObserver f33244a;

    public C2354x78aa5e3b(LifecycleEventsObservable.AutoDisposeLifecycleObserver autoDisposeLifecycleObserver) {
        this.f33244a = autoDisposeLifecycleObserver;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    /* JADX INFO: renamed from: a */
    public final void mo9119a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z2, MethodCallsLogger methodCallsLogger) {
        boolean z3 = methodCallsLogger != null;
        if (z2) {
            if (z3) {
                methodCallsLogger.getClass();
                HashMap map = methodCallsLogger.f24931a;
                Integer num = (Integer) map.get("onStateChange");
                int iIntValue = num != null ? num.intValue() : 0;
                boolean z4 = (iIntValue & 4) != 0;
                map.put("onStateChange", Integer.valueOf(iIntValue | 4));
                if (z4) {
                    return;
                }
            }
            this.f33244a.onStateChange(lifecycleOwner, event);
        }
    }
}
