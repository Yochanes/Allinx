package androidx.databinding;

import android.view.Choreographer;
import android.view.View;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.ViewBinding;
import com.exchange.allin.R;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {

    /* JADX INFO: renamed from: c */
    public static final boolean f23668c = true;

    /* JADX INFO: renamed from: d */
    public static final ReferenceQueue f23669d = new ReferenceQueue();

    /* JADX INFO: renamed from: f */
    public static final View.OnAttachStateChangeListener f23670f = new ViewOnAttachStateChangeListenerC15056();

    /* JADX INFO: renamed from: a */
    public boolean f23671a;

    /* JADX INFO: renamed from: b */
    public boolean f23672b;

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C15001 implements CreateWeakListener {
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C15012 implements CreateWeakListener {
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C15023 implements CreateWeakListener {
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C15034 implements CreateWeakListener {
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C15045 extends CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> {
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$7 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC15067 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$8 */
    /* JADX INFO: compiled from: Proguard */
    class ChoreographerFrameCallbackC15078 implements Choreographer.FrameCallback {
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class IncludedLayouts {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LiveDataListener implements Observer, ObservableReference<LiveData<?>> {
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a */
        public final void mo1166a(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OnStartListener implements LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class WeakListListener extends ObservableList.OnListChangedCallback implements ObservableReference<ObservableList> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class WeakMapListener extends ObservableMap.OnMapChangedCallback implements ObservableReference<ObservableMap> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class WeakPropertyListener extends Observable.OnPropertyChangedCallback implements ObservableReference<Observable> {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8239a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo8240b();

    /* JADX INFO: renamed from: c */
    public final void m8241c() {
        synchronized (this) {
            try {
                if (this.f23671a) {
                    return;
                }
                this.f23671a = true;
                if (!f23668c) {
                    throw null;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$6 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnAttachStateChangeListenerC15056 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            boolean z2 = ViewDataBinding.f23668c;
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).getClass();
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
