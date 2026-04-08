package autodispose2.androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import autodispose2.lifecycle.CorrespondingEventsFunction;
import autodispose2.lifecycle.LifecycleScopeProvider;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidLifecycleScopeProvider implements LifecycleScopeProvider<Lifecycle.Event> {

    /* JADX INFO: renamed from: c */
    public static final C2355a f33233c = new C2355a();

    /* JADX INFO: renamed from: a */
    public final CorrespondingEventsFunction f33234a;

    /* JADX INFO: renamed from: b */
    public final LifecycleEventsObservable f33235b;

    /* JADX INFO: renamed from: autodispose2.androidx.lifecycle.AndroidLifecycleScopeProvider$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C23521 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33236a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f33236a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33236a[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33236a[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33236a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33236a[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33236a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class UntilEventFunction implements CorrespondingEventsFunction<Lifecycle.Event> {

        /* JADX INFO: renamed from: a */
        public final Lifecycle.Event f33237a;

        public UntilEventFunction(Lifecycle.Event event) {
            this.f33237a = event;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return this.f33237a;
        }
    }

    public AndroidLifecycleScopeProvider(Lifecycle lifecycle, CorrespondingEventsFunction correspondingEventsFunction) {
        this.f33235b = new LifecycleEventsObservable(lifecycle);
        this.f33234a = correspondingEventsFunction;
    }

    /* JADX INFO: renamed from: d */
    public static AndroidLifecycleScopeProvider m12371d(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        return new AndroidLifecycleScopeProvider(lifecycleOwner.getLifecycle(), new UntilEventFunction(event));
    }

    @Override // autodispose2.lifecycle.LifecycleScopeProvider
    /* JADX INFO: renamed from: a */
    public final Object mo12372a() {
        LifecycleEventsObservable lifecycleEventsObservable = this.f33235b;
        int iOrdinal = lifecycleEventsObservable.f33238a.getF24894d().ordinal();
        Lifecycle.Event event = iOrdinal != 1 ? iOrdinal != 2 ? (iOrdinal == 3 || iOrdinal == 4) ? Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_DESTROY : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE;
        BehaviorSubject behaviorSubject = lifecycleEventsObservable.f33239b;
        behaviorSubject.onNext(event);
        Object obj = behaviorSubject.f51306a.get();
        if (NotificationLite.m18264h(obj) || NotificationLite.m18265i(obj)) {
            obj = null;
        }
        return (Lifecycle.Event) obj;
    }

    @Override // autodispose2.lifecycle.LifecycleScopeProvider
    /* JADX INFO: renamed from: b */
    public final Observable mo12373b() {
        return this.f33235b;
    }

    @Override // autodispose2.lifecycle.LifecycleScopeProvider
    /* JADX INFO: renamed from: c */
    public final CorrespondingEventsFunction mo12374c() {
        return this.f33234a;
    }
}
