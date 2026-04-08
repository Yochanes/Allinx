package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    public final Runnable f93a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f94b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public OnBackPressedCallback f95c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f96d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f97e;

    /* JADX INFO: renamed from: f */
    public boolean f98f;

    /* JADX INFO: renamed from: g */
    public boolean f99g;

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "backEvent", "Landroidx/activity/BackEventCompat;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C00291 extends Lambda implements Function1<BackEventCompat, Unit> {
        public C00291() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object objPrevious;
            BackEventCompat backEvent = (BackEventCompat) obj;
            Intrinsics.m18599g(backEvent, "backEvent");
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            ArrayDeque arrayDeque = onBackPressedDispatcher.f94b;
            ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getF51486c());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((OnBackPressedCallback) objPrevious).f90a) {
                    break;
                }
            }
            OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
            if (onBackPressedDispatcher.f95c != null) {
                onBackPressedDispatcher.m166b();
            }
            onBackPressedDispatcher.f95c = onBackPressedCallback;
            if (onBackPressedCallback != null) {
                onBackPressedCallback.mo163d(backEvent);
            }
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "backEvent", "Landroidx/activity/BackEventCompat;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C00302 extends Lambda implements Function1<BackEventCompat, Unit> {
        public C00302() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object objPrevious;
            BackEventCompat backEvent = (BackEventCompat) obj;
            Intrinsics.m18599g(backEvent, "backEvent");
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            OnBackPressedCallback onBackPressedCallback = onBackPressedDispatcher.f95c;
            if (onBackPressedCallback == null) {
                ArrayDeque arrayDeque = onBackPressedDispatcher.f94b;
                ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getF51486c());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) objPrevious).f90a) {
                        break;
                    }
                }
                onBackPressedCallback = (OnBackPressedCallback) objPrevious;
            }
            if (onBackPressedCallback != null) {
                onBackPressedCallback.mo162c(backEvent);
            }
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$3 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C00313 extends Lambda implements Function0<Unit> {
        public C00313() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OnBackPressedDispatcher.this.m167c();
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$4 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C00324 extends Lambda implements Function0<Unit> {
        public C00324() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OnBackPressedDispatcher.this.m166b();
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$5 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C00335 extends Lambda implements Function0<Unit> {
        public C00335() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OnBackPressedDispatcher.this.m167c();
            return Unit.f51459a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Api33Impl {
        /* JADX INFO: renamed from: a */
        public static void m170a(Object dispatcher, Object callback) {
            Intrinsics.m18599g(dispatcher, "dispatcher");
            Intrinsics.m18599g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
        }

        /* JADX INFO: renamed from: b */
        public static void m171b(Object dispatcher, Object callback) {
            Intrinsics.m18599g(dispatcher, "dispatcher");
            Intrinsics.m18599g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Api34Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f109a;

        /* JADX INFO: renamed from: b */
        public final OnBackPressedCallback f110b;

        /* JADX INFO: renamed from: c */
        public Cancellable f111c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OnBackPressedDispatcher f112d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.m18599g(onBackPressedCallback, "onBackPressedCallback");
            this.f112d = onBackPressedDispatcher;
            this.f109a = lifecycle;
            this.f110b = onBackPressedCallback;
            lifecycle.mo9123a(this);
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            this.f109a.mo9125c(this);
            this.f110b.f91b.remove(this);
            Cancellable cancellable = this.f111c;
            if (cancellable != null) {
                ((OnBackPressedCancellable) cancellable).cancel();
            }
            this.f111c = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* JADX INFO: renamed from: j */
        public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_START) {
                if (event != Lifecycle.Event.ON_STOP) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    Cancellable cancellable = this.f111c;
                    if (cancellable != null) {
                        ((OnBackPressedCancellable) cancellable).cancel();
                        return;
                    }
                    return;
                }
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.f112d;
            OnBackPressedCallback onBackPressedCallback = this.f110b;
            onBackPressedDispatcher.getClass();
            Intrinsics.m18599g(onBackPressedCallback, "onBackPressedCallback");
            onBackPressedDispatcher.f94b.addLast(onBackPressedCallback);
            OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(onBackPressedDispatcher, onBackPressedCallback);
            onBackPressedCallback.f91b.add(onBackPressedCancellable);
            onBackPressedDispatcher.m169e();
            onBackPressedCallback.f92c = new OnBackPressedDispatcher$addCancellableCallback$1(0, onBackPressedDispatcher, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            this.f111c = onBackPressedCancellable;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public final class OnBackPressedCancellable implements Cancellable {

        /* JADX INFO: renamed from: a */
        public final OnBackPressedCallback f113a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnBackPressedDispatcher f114b;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.m18599g(onBackPressedCallback, "onBackPressedCallback");
            this.f114b = onBackPressedDispatcher;
            this.f113a = onBackPressedCallback;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
        @Override // androidx.activity.Cancellable
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f114b;
            ArrayDeque arrayDeque = onBackPressedDispatcher.f94b;
            OnBackPressedCallback onBackPressedCallback = this.f113a;
            arrayDeque.remove(onBackPressedCallback);
            if (Intrinsics.m18594b(onBackPressedDispatcher.f95c, onBackPressedCallback)) {
                onBackPressedCallback.mo160a();
                onBackPressedDispatcher.f95c = null;
            }
            onBackPressedCallback.f91b.remove(this);
            ?? r0 = onBackPressedCallback.f92c;
            if (r0 != 0) {
                r0.invoke();
            }
            onBackPressedCallback.f92c = null;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f93a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f96d = i >= 34 ? new C0034x8ac2f76a(new C00291(), new C00302(), new C00313(), new C00324()) : new C0051j(new C00335());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m165a(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.m18599g(owner, "owner");
        Intrinsics.m18599g(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getF24894d() == Lifecycle.State.f24880a) {
            return;
        }
        onBackPressedCallback.f91b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        m169e();
        onBackPressedCallback.f92c = new OnBackPressedDispatcher$addCallback$1(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m166b() {
        Object objPrevious;
        OnBackPressedCallback onBackPressedCallback = this.f95c;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.f94b;
            ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) objPrevious).f90a) {
                        break;
                    }
                }
            }
            onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        }
        this.f95c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.mo160a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m167c() {
        Object objPrevious;
        OnBackPressedCallback onBackPressedCallback = this.f95c;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.f94b;
            ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getF51486c());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) objPrevious).f90a) {
                        break;
                    }
                }
            }
            onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        }
        this.f95c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.mo161b();
        } else {
            this.f93a.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m168d(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f97e;
        OnBackInvokedCallback onBackInvokedCallback = this.f96d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z2 && !this.f98f) {
            Api33Impl.m170a(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f98f = true;
        } else {
            if (z2 || !this.f98f) {
                return;
            }
            Api33Impl.m171b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f98f = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m169e() {
        boolean z2 = this.f99g;
        boolean z3 = false;
        ArrayDeque arrayDeque = this.f94b;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((OnBackPressedCallback) it.next()).f90a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f99g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m168d(z3);
    }
}
