package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {

    /* JADX INFO: renamed from: a */
    public final Impl20 f23392a;

    /* JADX INFO: compiled from: Proguard */
    public static class Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl20 extends Impl {

        /* JADX INFO: renamed from: a */
        public final View f23393a;

        public Impl20(View view) {
            this.f23393a = view;
        }

        /* JADX INFO: renamed from: a */
        public void mo7762a() {
            View view = this.f23393a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo7763b() {
            View viewFindViewById;
            View view = this.f23393a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new RunnableC1469e(0, viewFindViewById));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl30 extends Impl20 {

        /* JADX INFO: renamed from: b */
        public View f23394b;

        /* JADX INFO: renamed from: c */
        public WindowInsetsController f23395c;

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20
        /* JADX INFO: renamed from: a */
        public final void mo7762a() {
            WindowInsetsController windowInsetsControllerM118j = this.f23395c;
            View view = this.f23394b;
            if (windowInsetsControllerM118j == null) {
                windowInsetsControllerM118j = view != null ? AbstractC0025b.m118j(view) : null;
            }
            if (windowInsetsControllerM118j == null) {
                super.mo7762a();
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsControllerOnControllableInsetsChangedListenerC1470f windowInsetsControllerOnControllableInsetsChangedListenerC1470f = new WindowInsetsControllerOnControllableInsetsChangedListenerC1470f(atomicBoolean);
            AbstractC0025b.m129u(windowInsetsControllerM118j, windowInsetsControllerOnControllableInsetsChangedListenerC1470f);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            AbstractC0025b.m107C(windowInsetsControllerM118j, windowInsetsControllerOnControllableInsetsChangedListenerC1470f);
            AbstractC0025b.m106B(windowInsetsControllerM118j, AbstractC0025b.m134z());
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20
        /* JADX INFO: renamed from: b */
        public final void mo7763b() {
            View view = this.f23394b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsControllerM118j = this.f23395c;
            if (windowInsetsControllerM118j == null) {
                windowInsetsControllerM118j = view != null ? AbstractC0025b.m118j(view) : null;
            }
            if (windowInsetsControllerM118j != null) {
                AbstractC0025b.m127s(windowInsetsControllerM118j, AbstractC0025b.m134z());
            }
            super.mo7763b();
        }
    }

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f23392a = new Impl20(view);
            return;
        }
        Impl30 impl30 = new Impl30(view);
        impl30.f23394b = view;
        this.f23392a = impl30;
    }

    /* JADX INFO: renamed from: a */
    public final void m7760a() {
        this.f23392a.mo7762a();
    }

    /* JADX INFO: renamed from: b */
    public final void m7761b() {
        this.f23392a.mo7763b();
    }

    public SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        Impl30 impl30 = new Impl30(null);
        impl30.f23395c = windowInsetsController;
        this.f23392a = impl30;
    }
}
