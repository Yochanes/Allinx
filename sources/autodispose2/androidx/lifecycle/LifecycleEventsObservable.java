package autodispose2.androidx.lifecycle;

import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import autodispose2.android.internal.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class LifecycleEventsObservable extends Observable<Lifecycle.Event> {

    /* JADX INFO: renamed from: a */
    public final Lifecycle f33238a;

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f33239b = new BehaviorSubject();

    /* JADX INFO: renamed from: autodispose2.androidx.lifecycle.LifecycleEventsObservable$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C23531 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33240a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f33240a = iArr;
            try {
                Lifecycle.State state = Lifecycle.State.f24880a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f33240a;
                Lifecycle.State state2 = Lifecycle.State.f24880a;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f33240a;
                Lifecycle.State state3 = Lifecycle.State.f24880a;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f33240a;
                Lifecycle.State state4 = Lifecycle.State.f24880a;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f33240a;
                Lifecycle.State state5 = Lifecycle.State.f24880a;
                iArr5[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class AutoDisposeLifecycleObserver extends MainThreadDisposable implements LifecycleObserver {

        /* JADX INFO: renamed from: b */
        public final Lifecycle f33241b;

        /* JADX INFO: renamed from: c */
        public final Observer f33242c;

        /* JADX INFO: renamed from: d */
        public final BehaviorSubject f33243d;

        public AutoDisposeLifecycleObserver(Lifecycle lifecycle, Observer observer, BehaviorSubject behaviorSubject) {
            this.f33241b = lifecycle;
            this.f33242c = observer;
            this.f33243d = behaviorSubject;
        }

        @Override // autodispose2.android.internal.MainThreadDisposable
        /* JADX INFO: renamed from: b */
        public final void mo12370b() {
            this.f33241b.mo9125c(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onStateChange(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (this.f33232a.get()) {
                return;
            }
            Lifecycle.Event event2 = Lifecycle.Event.ON_CREATE;
            BehaviorSubject behaviorSubject = this.f33243d;
            if (event == event2) {
                Object obj = behaviorSubject.f51306a.get();
                if (NotificationLite.m18264h(obj) || NotificationLite.m18265i(obj)) {
                    obj = null;
                }
                if (obj != event) {
                    behaviorSubject.onNext(event);
                }
            }
            this.f33242c.onNext(event);
        }
    }

    public LifecycleEventsObservable(Lifecycle lifecycle) {
        this.f33238a = lifecycle;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        Lifecycle lifecycle = this.f33238a;
        AutoDisposeLifecycleObserver autoDisposeLifecycleObserver = new AutoDisposeLifecycleObserver(lifecycle, observer, this.f33239b);
        observer.mo12365c(autoDisposeLifecycleObserver);
        try {
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                observer.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
                return;
            }
            lifecycle.mo9123a(autoDisposeLifecycleObserver);
            if (autoDisposeLifecycleObserver.f33232a.get()) {
                lifecycle.mo9125c(autoDisposeLifecycleObserver);
            }
        } catch (Throwable th) {
            throw ExceptionHelper.m18251f(th);
        }
    }
}
