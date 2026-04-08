package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final DefaultLifecycleObserver f24858a;

    /* JADX INFO: renamed from: b */
    public final LifecycleEventObserver f24859b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24860a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f24860a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        Intrinsics.m18599g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f24858a = defaultLifecycleObserver;
        this.f24859b = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = WhenMappings.f24860a[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.f24858a;
        switch (i) {
            case 1:
                defaultLifecycleObserver.mo9116i(lifecycleOwner);
                break;
            case 2:
                defaultLifecycleObserver.onStart(lifecycleOwner);
                break;
            case 3:
                defaultLifecycleObserver.onResume(lifecycleOwner);
                break;
            case 4:
                defaultLifecycleObserver.onPause(lifecycleOwner);
                break;
            case 5:
                defaultLifecycleObserver.onStop(lifecycleOwner);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(lifecycleOwner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        LifecycleEventObserver lifecycleEventObserver = this.f24859b;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.mo148j(lifecycleOwner, event);
        }
    }
}
