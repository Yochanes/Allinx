package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsControllerCompat {

    /* JADX INFO: renamed from: a */
    public final Impl f23493a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl20 extends Impl {

        /* JADX INFO: renamed from: a */
        public final Window f23494a;

        /* JADX INFO: renamed from: b */
        public final SoftwareKeyboardControllerCompat f23495b;

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f23494a = window;
            this.f23495b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: a */
        public final int mo7960a() {
            Object tag = this.f23494a.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: b */
        public final void mo7961b(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        m7968i(4);
                    } else if (i2 == 2) {
                        m7968i(2);
                    } else if (i2 == 8) {
                        this.f23495b.m7760a();
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: g */
        public final void mo7966g(int i) {
            this.f23494a.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                m7969j(6144);
                return;
            }
            if (i == 1) {
                m7969j(4096);
                m7968i(2048);
            } else {
                if (i != 2) {
                    return;
                }
                m7969j(2048);
                m7968i(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: h */
        public final void mo7967h(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        m7969j(4);
                        this.f23494a.clearFlags(UserMetadata.MAX_ATTRIBUTE_SIZE);
                    } else if (i2 == 2) {
                        m7969j(2);
                    } else if (i2 == 8) {
                        this.f23495b.m7761b();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m7968i(int i) {
            View decorView = this.f23494a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: j */
        public final void m7969j(int i) {
            View decorView = this.f23494a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl23 extends Impl20 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: d */
        public final boolean mo7963d() {
            return (this.f23494a.getDecorView().getSystemUiVisibility() & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: f */
        public final void mo7965f(boolean z2) {
            if (!z2) {
                m7969j(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                return;
            }
            Window window = this.f23494a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            m7968i(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl26 extends Impl23 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: c */
        public final boolean mo7962c() {
            return (this.f23494a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: e */
        public final void mo7964e(boolean z2) {
            if (!z2) {
                m7969j(16);
                return;
            }
            Window window = this.f23494a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            m7968i(16);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl31 extends Impl30 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: a */
        public final int mo7960a() {
            return AbstractC1473i.m8100r(this.f23496a);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: g */
        public final void mo7966g(int i) {
            AbstractC1473i.m8097o(this.f23496a, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl35 extends Impl31 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: c */
        public final boolean mo7962c() {
            return (AbstractC1473i.m8085c(this.f23496a) & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: d */
        public final boolean mo7963d() {
            return (AbstractC1473i.m8085c(this.f23496a) & 8) != 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnControllableInsetsChangedListener {
    }

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f23493a = new Impl35(windowInsetsController, new SoftwareKeyboardControllerCompat(windowInsetsController));
        } else {
            this.f23493a = new Impl30(windowInsetsController, new SoftwareKeyboardControllerCompat(windowInsetsController));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7952a() {
        return this.f23493a.mo7960a();
    }

    /* JADX INFO: renamed from: b */
    public final void m7953b(int i) {
        this.f23493a.mo7961b(i);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7954c() {
        return this.f23493a.mo7962c();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7955d() {
        return this.f23493a.mo7963d();
    }

    /* JADX INFO: renamed from: e */
    public final void m7956e(boolean z2) {
        this.f23493a.mo7964e(z2);
    }

    /* JADX INFO: renamed from: f */
    public final void m7957f(boolean z2) {
        this.f23493a.mo7965f(z2);
    }

    /* JADX INFO: renamed from: g */
    public final void m7958g(int i) {
        this.f23493a.mo7966g(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m7959h(int i) {
        this.f23493a.mo7967h(i);
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl30 extends Impl {

        /* JADX INFO: renamed from: a */
        public final WindowInsetsController f23496a;

        /* JADX INFO: renamed from: b */
        public final SoftwareKeyboardControllerCompat f23497b;

        /* JADX INFO: renamed from: c */
        public final Window f23498c;

        /* JADX INFO: renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1 */
        /* JADX INFO: compiled from: Proguard */
        class WindowInsetsAnimationControlListenerC14621 implements WindowInsetsAnimationControlListener {
            public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                throw null;
            }
        }

        public Impl30(WindowInsetsController windowInsetsController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            new SimpleArrayMap(0);
            this.f23496a = windowInsetsController;
            this.f23497b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: a */
        public int mo7960a() {
            Window window = this.f23498c;
            if (window == null) {
                return AbstractC1473i.m8100r(this.f23496a);
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: b */
        public final void mo7961b(int i) {
            if ((i & 8) != 0) {
                this.f23497b.m7760a();
            }
            AbstractC0025b.m106B(this.f23496a, i & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: c */
        public boolean mo7962c() {
            AbstractC1473i.m8096n(this.f23496a);
            return (AbstractC1473i.m8085c(this.f23496a) & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: d */
        public boolean mo7963d() {
            AbstractC1473i.m8096n(this.f23496a);
            return (AbstractC1473i.m8085c(this.f23496a) & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: e */
        public final void mo7964e(boolean z2) {
            Window window = this.f23498c;
            if (z2) {
                if (window != null) {
                    m7970i(16);
                }
                AbstractC1473i.m8108z(this.f23496a);
            } else {
                if (window != null) {
                    m7971j(16);
                }
                AbstractC1473i.m8080B(this.f23496a);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: f */
        public final void mo7965f(boolean z2) {
            Window window = this.f23498c;
            if (z2) {
                if (window != null) {
                    m7970i(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                }
                AbstractC1473i.m8104v(this.f23496a);
            } else {
                if (window != null) {
                    m7971j(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                }
                AbstractC1473i.m8106x(this.f23496a);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: g */
        public void mo7966g(int i) {
            Window window = this.f23498c;
            if (window == null) {
                AbstractC1473i.m8097o(this.f23496a, i);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                m7971j(6144);
                return;
            }
            if (i == 1) {
                m7971j(4096);
                m7970i(2048);
            } else {
                if (i != 2) {
                    return;
                }
                m7971j(2048);
                m7970i(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* JADX INFO: renamed from: h */
        public final void mo7967h(int i) {
            if ((i & 8) != 0) {
                this.f23497b.m7761b();
            }
            AbstractC0025b.m127s(this.f23496a, i & (-9));
        }

        /* JADX INFO: renamed from: i */
        public final void m7970i(int i) {
            View decorView = this.f23498c.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: j */
        public final void m7971j(int i) {
            View decorView = this.f23498c.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public Impl30(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(AbstractC1473i.m8092j(window), softwareKeyboardControllerCompat);
            this.f23498c = window;
        }
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f23493a = new Impl35(window, softwareKeyboardControllerCompat);
            return;
        }
        if (i >= 30) {
            this.f23493a = new Impl30(window, softwareKeyboardControllerCompat);
        } else if (i >= 26) {
            this.f23493a = new Impl26(window, softwareKeyboardControllerCompat);
        } else {
            this.f23493a = new Impl23(window, softwareKeyboardControllerCompat);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Impl {
        /* JADX INFO: renamed from: a */
        public int mo7960a() {
            return 1;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo7962c() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public boolean mo7963d() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void mo7961b(int i) {
        }

        /* JADX INFO: renamed from: e */
        public void mo7964e(boolean z2) {
        }

        /* JADX INFO: renamed from: f */
        public void mo7965f(boolean z2) {
        }

        /* JADX INFO: renamed from: g */
        public void mo7966g(int i) {
        }

        /* JADX INFO: renamed from: h */
        public void mo7967h(int i) {
        }
    }
}
