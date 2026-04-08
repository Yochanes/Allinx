package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.AbstractC0050i;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.p013ui.graphics.layer.AbstractC1226a;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p001A.AbstractC0000a;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {

    /* JADX INFO: renamed from: b */
    public static final WindowInsetsCompat f23464b;

    /* JADX INFO: renamed from: a */
    public final Impl f23465a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class Api21ReflectionHolder {
        static {
            try {
                View.class.getDeclaredField("mAttachInfo").setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                cls.getDeclaredField("mStableInsets").setAccessible(true);
                cls.getDeclaredField("mContentInsets").setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BuilderImpl {

        /* JADX INFO: renamed from: a */
        public final WindowInsetsCompat f23467a;

        /* JADX INFO: renamed from: b */
        public Insets[] f23468b;

        public BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* JADX INFO: renamed from: a */
        public final void m7914a() {
            Insets[] insetsArr = this.f23468b;
            if (insetsArr != null) {
                Insets insetsMo7929g = insetsArr[0];
                Insets insetsMo7929g2 = insetsArr[1];
                WindowInsetsCompat windowInsetsCompat = this.f23467a;
                if (insetsMo7929g2 == null) {
                    insetsMo7929g2 = windowInsetsCompat.f23465a.mo7929g(2);
                }
                if (insetsMo7929g == null) {
                    insetsMo7929g = windowInsetsCompat.f23465a.mo7929g(1);
                }
                mo7920g(Insets.m7561a(insetsMo7929g, insetsMo7929g2));
                Insets insets = this.f23468b[Type.m7950a(16)];
                if (insets != null) {
                    mo7919f(insets);
                }
                Insets insets2 = this.f23468b[Type.m7950a(32)];
                if (insets2 != null) {
                    mo7917d(insets2);
                }
                Insets insets3 = this.f23468b[Type.m7950a(64)];
                if (insets3 != null) {
                    mo7921h(insets3);
                }
            }
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo7915b() {
            m7914a();
            return this.f23467a;
        }

        /* JADX INFO: renamed from: c */
        public void mo7916c(int i, @NonNull Insets insets) {
            if (this.f23468b == null) {
                this.f23468b = new Insets[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f23468b[Type.m7950a(i2)] = insets;
                }
            }
        }

        public BuilderImpl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f23467a = windowInsetsCompat;
        }

        /* JADX INFO: renamed from: d */
        public void mo7917d(@NonNull Insets insets) {
        }

        /* JADX INFO: renamed from: e */
        public void mo7918e(@NonNull Insets insets) {
        }

        /* JADX INFO: renamed from: f */
        public void mo7919f(@NonNull Insets insets) {
        }

        /* JADX INFO: renamed from: g */
        public void mo7920g(@NonNull Insets insets) {
        }

        /* JADX INFO: renamed from: h */
        public void mo7921h(@NonNull Insets insets) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class BuilderImpl30 extends BuilderImpl29 {
        public BuilderImpl30() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: c */
        public void mo7916c(int i, @NonNull Insets insets) {
            AbstractC1473i.m8095m(this.f23475c, TypeImpl30.m7951a(i), insets.m7564d());
        }

        public BuilderImpl30(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl28 extends Impl21 {
        public Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo7923a() {
            return WindowInsetsCompat.m7893t(null, AbstractC0050i.m207l(this.f23483c));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.f23483c, impl28.f23483c) && Objects.equals(this.f23487g, impl28.f23487g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @Nullable
        /* JADX INFO: renamed from: f */
        public DisplayCutoutCompat mo7928f() {
            DisplayCutout displayCutoutM206k = AbstractC0050i.m206k(this.f23483c);
            if (displayCutoutM206k == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutoutM206k);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.f23483c.hashCode();
        }

        public Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl30 extends Impl29 {

        /* JADX INFO: renamed from: q */
        public static final WindowInsetsCompat f23492q = WindowInsetsCompat.m7893t(null, AbstractC1473i.m8088f());

        public Impl30(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: g */
        public Insets mo7929g(int i) {
            return Insets.m7563c(AbstractC1473i.m8101s(this.f23483c, TypeImpl30.m7951a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: h */
        public Insets mo7930h(int i) {
            return Insets.m7563c(AbstractC1473i.m8086d(this.f23483c, TypeImpl30.m7951a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: q */
        public boolean mo7939q(int i) {
            return AbstractC1473i.m8098p(this.f23483c, TypeImpl30.m7951a(i));
        }

        public Impl30(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: d */
        public final void mo7926d(@NonNull View view) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface InsetsType {
        }

        /* JADX INFO: renamed from: a */
        public static int m7950a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class TypeImpl30 {
        /* JADX INFO: renamed from: a */
        public static int m7951a(int i) {
            int iM8084b;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iM8084b = AbstractC1473i.m8084b();
                    } else if (i3 == 2) {
                        iM8084b = AbstractC1473i.m8099q();
                    } else if (i3 == 4) {
                        iM8084b = AbstractC1473i.m8105w();
                    } else if (i3 == 8) {
                        iM8084b = AbstractC0025b.m134z();
                    } else if (i3 == 16) {
                        iM8084b = AbstractC1473i.m8107y();
                    } else if (i3 == 32) {
                        iM8084b = AbstractC1473i.m8079A();
                    } else if (i3 == 64) {
                        iM8084b = AbstractC1473i.m8081C();
                    } else if (i3 == 128) {
                        iM8084b = AbstractC1473i.m8082D();
                    }
                    i2 |= iM8084b;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f23464b = Impl30.f23492q;
        } else {
            f23464b = Impl.f23476b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f23465a = new Impl30(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f23465a = new Impl29(this, windowInsets);
        } else if (i >= 28) {
            this.f23465a = new Impl28(this, windowInsets);
        } else {
            this.f23465a = new Impl21(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: o */
    public static Insets m7892o(Insets insets, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, insets.f23200a - i);
        int iMax2 = Math.max(0, insets.f23201b - i2);
        int iMax3 = Math.max(0, insets.f23202c - i3);
        int iMax4 = Math.max(0, insets.f23203d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? insets : Insets.m7562b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: t */
    public static WindowInsetsCompat m7893t(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            WindowInsetsCompat windowInsetsCompatM7834a = ViewCompat.Api23Impl.m7834a(view);
            Impl impl = windowInsetsCompat.f23465a;
            impl.mo7942t(windowInsetsCompatM7834a);
            impl.mo7926d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: a */
    public final WindowInsetsCompat m7894a() {
        return this.f23465a.mo7923a();
    }

    /* JADX INFO: renamed from: b */
    public final WindowInsetsCompat m7895b() {
        return this.f23465a.mo7924b();
    }

    /* JADX INFO: renamed from: c */
    public final WindowInsetsCompat m7896c() {
        return this.f23465a.mo7925c();
    }

    /* JADX INFO: renamed from: d */
    public final DisplayCutoutCompat m7897d() {
        return this.f23465a.mo7928f();
    }

    /* JADX INFO: renamed from: e */
    public final Insets m7898e(int i) {
        return this.f23465a.mo7929g(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return Objects.equals(this.f23465a, ((WindowInsetsCompat) obj).f23465a);
    }

    /* JADX INFO: renamed from: f */
    public final Insets m7899f(int i) {
        return this.f23465a.mo7930h(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m7900g() {
        this.f23465a.mo7933k();
    }

    /* JADX INFO: renamed from: h */
    public final int m7901h() {
        return this.f23465a.mo7934l().f23203d;
    }

    public final int hashCode() {
        Impl impl = this.f23465a;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m7902i() {
        return this.f23465a.mo7934l().f23200a;
    }

    /* JADX INFO: renamed from: j */
    public final int m7903j() {
        return this.f23465a.mo7934l().f23202c;
    }

    /* JADX INFO: renamed from: k */
    public final int m7904k() {
        return this.f23465a.mo7934l().f23201b;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m7905l() {
        Impl impl = this.f23465a;
        Insets insetsMo7929g = impl.mo7929g(-1);
        Insets insets = Insets.f23199e;
        return (insetsMo7929g.equals(insets) && impl.mo7930h(-9).equals(insets) && impl.mo7928f() == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m7906m() {
        return !this.f23465a.mo7934l().equals(Insets.f23199e);
    }

    /* JADX INFO: renamed from: n */
    public final WindowInsetsCompat m7907n(int i, int i2, int i3, int i4) {
        return this.f23465a.mo7936n(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7908p() {
        return this.f23465a.mo7937o();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7909q(int i) {
        return this.f23465a.mo7939q(i);
    }

    /* JADX INFO: renamed from: r */
    public final WindowInsetsCompat m7910r(int i, int i2, int i3, int i4) {
        Builder builder = new Builder(this);
        Insets insetsM7562b = Insets.m7562b(i, i2, i3, i4);
        BuilderImpl builderImpl = builder.f23466a;
        builderImpl.mo7920g(insetsM7562b);
        return builderImpl.mo7915b();
    }

    /* JADX INFO: renamed from: s */
    public final WindowInsets m7911s() {
        Impl impl = this.f23465a;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).f23483c;
        }
        return null;
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class BuilderImpl20 extends BuilderImpl {

        /* JADX INFO: renamed from: e */
        public static Field f23469e = null;

        /* JADX INFO: renamed from: f */
        public static boolean f23470f = false;

        /* JADX INFO: renamed from: g */
        public static Constructor f23471g = null;

        /* JADX INFO: renamed from: h */
        public static boolean f23472h = false;

        /* JADX INFO: renamed from: c */
        public WindowInsets f23473c;

        /* JADX INFO: renamed from: d */
        public Insets f23474d;

        public BuilderImpl20() {
            this.f23473c = m7922i();
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        private static WindowInsets m7922i() {
            if (!f23470f) {
                try {
                    f23469e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f23470f = true;
            }
            Field field = f23469e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f23472h) {
                try {
                    f23471g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f23472h = true;
            }
            Constructor constructor = f23471g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo7915b() {
            m7914a();
            WindowInsetsCompat windowInsetsCompatM7893t = WindowInsetsCompat.m7893t(null, this.f23473c);
            Insets[] insetsArr = this.f23468b;
            Impl impl = windowInsetsCompatM7893t.f23465a;
            impl.mo7940r(insetsArr);
            impl.mo7943u(this.f23474d);
            return windowInsetsCompatM7893t;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: e */
        public void mo7918e(@Nullable Insets insets) {
            this.f23474d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: g */
        public void mo7920g(@NonNull Insets insets) {
            WindowInsets windowInsets = this.f23473c;
            if (windowInsets != null) {
                this.f23473c = windowInsets.replaceSystemWindowInsets(insets.f23200a, insets.f23201b, insets.f23202c, insets.f23203d);
            }
        }

        public BuilderImpl20(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f23473c = windowInsetsCompat.m7911s();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class BuilderImpl29 extends BuilderImpl {

        /* JADX INFO: renamed from: c */
        public final WindowInsets.Builder f23475c;

        public BuilderImpl29() {
            this.f23475c = AbstractC1226a.m5449e();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo7915b() {
            m7914a();
            WindowInsetsCompat windowInsetsCompatM7893t = WindowInsetsCompat.m7893t(null, AbstractC1226a.m5451g(this.f23475c));
            windowInsetsCompatM7893t.f23465a.mo7940r(this.f23468b);
            return windowInsetsCompatM7893t;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: d */
        public void mo7917d(@NonNull Insets insets) {
            AbstractC1226a.m5443C(this.f23475c, insets.m7564d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: e */
        public void mo7918e(@NonNull Insets insets) {
            AbstractC1226a.m5441A(this.f23475c, insets.m7564d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: f */
        public void mo7919f(@NonNull Insets insets) {
            AbstractC1226a.m5442B(this.f23475c, insets.m7564d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: g */
        public void mo7920g(@NonNull Insets insets) {
            AbstractC1226a.m5467w(this.f23475c, insets.m7564d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* JADX INFO: renamed from: h */
        public void mo7921h(@NonNull Insets insets) {
            AbstractC1226a.m5444D(this.f23475c, insets.m7564d());
        }

        public BuilderImpl29(@NonNull WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderM5449e;
            super(windowInsetsCompat);
            WindowInsets windowInsetsM7911s = windowInsetsCompat.m7911s();
            if (windowInsetsM7911s != null) {
                builderM5449e = AbstractC1226a.m5450f(windowInsetsM7911s);
            } else {
                builderM5449e = AbstractC1226a.m5449e();
            }
            this.f23475c = builderM5449e;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl21 extends Impl20 {

        /* JADX INFO: renamed from: m */
        public Insets f23488m;

        public Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f23488m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo7924b() {
            return WindowInsetsCompat.m7893t(null, this.f23483c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: c */
        public WindowInsetsCompat mo7925c() {
            return WindowInsetsCompat.m7893t(null, this.f23483c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: j */
        public final Insets mo7932j() {
            if (this.f23488m == null) {
                WindowInsets windowInsets = this.f23483c;
                this.f23488m = Insets.m7562b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f23488m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: o */
        public boolean mo7937o() {
            return this.f23483c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: u */
        public void mo7943u(@Nullable Insets insets) {
            this.f23488m = insets;
        }

        public Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.f23488m = null;
            this.f23488m = impl21.f23488m;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl20 extends Impl {

        /* JADX INFO: renamed from: h */
        public static boolean f23478h = false;

        /* JADX INFO: renamed from: i */
        public static Method f23479i;

        /* JADX INFO: renamed from: j */
        public static Class f23480j;

        /* JADX INFO: renamed from: k */
        public static Field f23481k;

        /* JADX INFO: renamed from: l */
        public static Field f23482l;

        /* JADX INFO: renamed from: c */
        public final WindowInsets f23483c;

        /* JADX INFO: renamed from: d */
        public Insets[] f23484d;

        /* JADX INFO: renamed from: e */
        public Insets f23485e;

        /* JADX INFO: renamed from: f */
        public WindowInsetsCompat f23486f;

        /* JADX INFO: renamed from: g */
        public Insets f23487g;

        public Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f23485e = null;
            this.f23483c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: A */
        private static void m7944A() {
            try {
                f23479i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f23480j = cls;
                f23481k = cls.getDeclaredField("mVisibleInsets");
                f23482l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f23481k.setAccessible(true);
                f23482l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f23478h = true;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: v */
        private Insets m7945v(int i, boolean z2) {
            Insets insetsM7561a = Insets.f23199e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insetsM7561a = Insets.m7561a(insetsM7561a, m7948w(i2, z2));
                }
            }
            return insetsM7561a;
        }

        /* JADX INFO: renamed from: x */
        private Insets m7946x() {
            WindowInsetsCompat windowInsetsCompat = this.f23486f;
            return windowInsetsCompat != null ? windowInsetsCompat.f23465a.mo7932j() : Insets.f23199e;
        }

        @Nullable
        /* JADX INFO: renamed from: y */
        private Insets m7947y(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f23478h) {
                m7944A();
            }
            Method method = f23479i;
            if (method != null && f23480j != null && f23481k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f23481k.get(f23482l.get(objInvoke));
                    if (rect != null) {
                        return Insets.m7562b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: d */
        public void mo7926d(@NonNull View view) {
            Insets insetsM7947y = m7947y(view);
            if (insetsM7947y == null) {
                insetsM7947y = Insets.f23199e;
            }
            mo7941s(insetsM7947y);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: e */
        public void mo7927e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.f23465a.mo7942t(this.f23486f);
            windowInsetsCompat.f23465a.mo7941s(this.f23487g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f23487g, ((Impl20) obj).f23487g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: g */
        public Insets mo7929g(int i) {
            return m7945v(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: h */
        public Insets mo7930h(int i) {
            return m7945v(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: l */
        public final Insets mo7934l() {
            if (this.f23485e == null) {
                WindowInsets windowInsets = this.f23483c;
                this.f23485e = Insets.m7562b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f23485e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: n */
        public WindowInsetsCompat mo7936n(int i, int i2, int i3, int i4) {
            Builder builder = new Builder(WindowInsetsCompat.m7893t(null, this.f23483c));
            builder.m7913b(WindowInsetsCompat.m7892o(mo7934l(), i, i2, i3, i4));
            Insets insetsM7892o = WindowInsetsCompat.m7892o(mo7932j(), i, i2, i3, i4);
            BuilderImpl builderImpl = builder.f23466a;
            builderImpl.mo7918e(insetsM7892o);
            return builderImpl.mo7915b();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: p */
        public boolean mo7938p() {
            return this.f23483c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: q */
        public boolean mo7939q(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !m7949z(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: r */
        public void mo7940r(Insets[] insetsArr) {
            this.f23484d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: s */
        public void mo7941s(@NonNull Insets insets) {
            this.f23487g = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: t */
        public void mo7942t(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f23486f = windowInsetsCompat;
        }

        @NonNull
        /* JADX INFO: renamed from: w */
        public Insets m7948w(int i, boolean z2) {
            Insets insetsMo7932j;
            int i2;
            if (i == 1) {
                return z2 ? Insets.m7562b(0, Math.max(m7946x().f23201b, mo7934l().f23201b), 0, 0) : Insets.m7562b(0, mo7934l().f23201b, 0, 0);
            }
            if (i == 2) {
                if (z2) {
                    Insets insetsM7946x = m7946x();
                    Insets insetsMo7932j2 = mo7932j();
                    return Insets.m7562b(Math.max(insetsM7946x.f23200a, insetsMo7932j2.f23200a), 0, Math.max(insetsM7946x.f23202c, insetsMo7932j2.f23202c), Math.max(insetsM7946x.f23203d, insetsMo7932j2.f23203d));
                }
                Insets insetsMo7934l = mo7934l();
                WindowInsetsCompat windowInsetsCompat = this.f23486f;
                insetsMo7932j = windowInsetsCompat != null ? windowInsetsCompat.f23465a.mo7932j() : null;
                int iMin = insetsMo7934l.f23203d;
                if (insetsMo7932j != null) {
                    iMin = Math.min(iMin, insetsMo7932j.f23203d);
                }
                return Insets.m7562b(insetsMo7934l.f23200a, 0, insetsMo7934l.f23202c, iMin);
            }
            Insets insets = Insets.f23199e;
            if (i == 8) {
                Insets[] insetsArr = this.f23484d;
                insetsMo7932j = insetsArr != null ? insetsArr[Type.m7950a(8)] : null;
                if (insetsMo7932j != null) {
                    return insetsMo7932j;
                }
                Insets insetsMo7934l2 = mo7934l();
                Insets insetsM7946x2 = m7946x();
                int i3 = insetsMo7934l2.f23203d;
                if (i3 > insetsM7946x2.f23203d) {
                    return Insets.m7562b(0, 0, 0, i3);
                }
                Insets insets2 = this.f23487g;
                if (insets2 != null && !insets2.equals(insets) && (i2 = this.f23487g.f23203d) > insetsM7946x2.f23203d) {
                    return Insets.m7562b(0, 0, 0, i2);
                }
            } else {
                if (i == 16) {
                    return mo7933k();
                }
                if (i == 32) {
                    return mo7931i();
                }
                if (i == 64) {
                    return mo7935m();
                }
                if (i == 128) {
                    WindowInsetsCompat windowInsetsCompat2 = this.f23486f;
                    DisplayCutoutCompat displayCutoutCompatMo7928f = windowInsetsCompat2 != null ? windowInsetsCompat2.f23465a.mo7928f() : mo7928f();
                    if (displayCutoutCompatMo7928f != null) {
                        int i4 = Build.VERSION.SDK_INT;
                        return Insets.m7562b(i4 >= 28 ? DisplayCutoutCompat.Api28Impl.m7724b(displayCutoutCompatMo7928f.f23370a) : 0, i4 >= 28 ? DisplayCutoutCompat.Api28Impl.m7726d(displayCutoutCompatMo7928f.f23370a) : 0, i4 >= 28 ? DisplayCutoutCompat.Api28Impl.m7725c(displayCutoutCompatMo7928f.f23370a) : 0, i4 >= 28 ? DisplayCutoutCompat.Api28Impl.m7723a(displayCutoutCompatMo7928f.f23370a) : 0);
                    }
                }
            }
            return insets;
        }

        /* JADX INFO: renamed from: z */
        public boolean m7949z(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !m7948w(i, false).equals(Insets.f23199e);
        }

        public Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.f23483c));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl29 extends Impl28 {

        /* JADX INFO: renamed from: n */
        public Insets f23489n;

        /* JADX INFO: renamed from: o */
        public Insets f23490o;

        /* JADX INFO: renamed from: p */
        public Insets f23491p;

        public Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f23489n = null;
            this.f23490o = null;
            this.f23491p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: i */
        public Insets mo7931i() {
            if (this.f23490o == null) {
                this.f23490o = Insets.m7563c(AbstractC1477j.m8131b(this.f23483c));
            }
            return this.f23490o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: k */
        public Insets mo7933k() {
            if (this.f23489n == null) {
                this.f23489n = Insets.m7563c(AbstractC1477j.m8151v(this.f23483c));
            }
            return this.f23489n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: m */
        public Insets mo7935m() {
            if (this.f23491p == null) {
                this.f23491p = Insets.m7563c(AbstractC1226a.m5448d(this.f23483c));
            }
            return this.f23491p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* JADX INFO: renamed from: n */
        public WindowInsetsCompat mo7936n(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.m7893t(null, AbstractC1477j.m8135f(this.f23483c, i, i2, i3, i4));
        }

        public Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.f23489n = null;
            this.f23490o = null;
            this.f23491p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        /* JADX INFO: renamed from: u */
        public void mo7943u(@Nullable Insets insets) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final BuilderImpl f23466a;

        public Builder() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f23466a = new BuilderImpl30();
            } else if (i >= 29) {
                this.f23466a = new BuilderImpl29();
            } else {
                this.f23466a = new BuilderImpl20();
            }
        }

        /* JADX INFO: renamed from: a */
        public final WindowInsetsCompat m7912a() {
            return this.f23466a.mo7915b();
        }

        /* JADX INFO: renamed from: b */
        public final void m7913b(Insets insets) {
            this.f23466a.mo7920g(insets);
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f23466a = new BuilderImpl30(windowInsetsCompat);
            } else if (i >= 29) {
                this.f23466a = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.f23466a = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.f23465a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (impl instanceof Impl30)) {
                this.f23465a = new Impl30(this, (Impl30) impl);
            } else if (i >= 29 && (impl instanceof Impl29)) {
                this.f23465a = new Impl29(this, (Impl29) impl);
            } else if (i >= 28 && (impl instanceof Impl28)) {
                this.f23465a = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.f23465a = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.f23465a = new Impl20(this, (Impl20) impl);
            } else {
                this.f23465a = new Impl(this);
            }
            impl.mo7927e(this);
            return;
        }
        this.f23465a = new Impl(this);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Impl {

        /* JADX INFO: renamed from: b */
        public static final WindowInsetsCompat f23476b = new Builder().f23466a.mo7915b().f23465a.mo7923a().f23465a.mo7924b().f23465a.mo7925c();

        /* JADX INFO: renamed from: a */
        public final WindowInsetsCompat f23477a;

        public Impl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f23477a = windowInsetsCompat;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo7923a() {
            return this.f23477a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo7924b() {
            return this.f23477a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public WindowInsetsCompat mo7925c() {
            return this.f23477a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return mo7938p() == impl.mo7938p() && mo7937o() == impl.mo7937o() && Objects.equals(mo7934l(), impl.mo7934l()) && Objects.equals(mo7932j(), impl.mo7932j()) && Objects.equals(mo7928f(), impl.mo7928f());
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public DisplayCutoutCompat mo7928f() {
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public Insets mo7929g(int i) {
            return Insets.f23199e;
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public Insets mo7930h(int i) {
            if ((i & 8) == 0) {
                return Insets.f23199e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(mo7938p()), Boolean.valueOf(mo7937o()), mo7934l(), mo7932j(), mo7928f());
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public Insets mo7931i() {
            return mo7934l();
        }

        @NonNull
        /* JADX INFO: renamed from: j */
        public Insets mo7932j() {
            return Insets.f23199e;
        }

        @NonNull
        /* JADX INFO: renamed from: k */
        public Insets mo7933k() {
            return mo7934l();
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public Insets mo7934l() {
            return Insets.f23199e;
        }

        @NonNull
        /* JADX INFO: renamed from: m */
        public Insets mo7935m() {
            return mo7934l();
        }

        @NonNull
        /* JADX INFO: renamed from: n */
        public WindowInsetsCompat mo7936n(int i, int i2, int i3, int i4) {
            return f23476b;
        }

        /* JADX INFO: renamed from: o */
        public boolean mo7937o() {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo7938p() {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo7939q(int i) {
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void mo7926d(@NonNull View view) {
        }

        /* JADX INFO: renamed from: e */
        public void mo7927e(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        /* JADX INFO: renamed from: r */
        public void mo7940r(Insets[] insetsArr) {
        }

        /* JADX INFO: renamed from: s */
        public void mo7941s(@NonNull Insets insets) {
        }

        /* JADX INFO: renamed from: t */
        public void mo7942t(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        /* JADX INFO: renamed from: u */
        public void mo7943u(Insets insets) {
        }
    }
}
