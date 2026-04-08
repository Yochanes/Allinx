package autodispose2.androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import autodispose2.androidx.lifecycle.AndroidLifecycleScopeProvider;
import autodispose2.lifecycle.CorrespondingEventsFunction;
import autodispose2.lifecycle.LifecycleEndedException;

/* JADX INFO: renamed from: autodispose2.androidx.lifecycle.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2355a implements CorrespondingEventsFunction {
    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Lifecycle.Event event = (Lifecycle.Event) obj;
        int i = AndroidLifecycleScopeProvider.C23521.f33236a[event.ordinal()];
        if (i == 1) {
            return Lifecycle.Event.ON_DESTROY;
        }
        if (i == 2) {
            return Lifecycle.Event.ON_STOP;
        }
        if (i == 3) {
            return Lifecycle.Event.ON_PAUSE;
        }
        if (i == 4) {
            return Lifecycle.Event.ON_STOP;
        }
        throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
    }
}
