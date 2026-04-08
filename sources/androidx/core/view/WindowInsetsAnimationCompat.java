package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.exchange.allin.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* JADX INFO: renamed from: a */
    public Impl f23436a;

    /* JADX INFO: compiled from: Proguard */
    public static class Impl {

        /* JADX INFO: renamed from: a */
        public final int f23439a;

        /* JADX INFO: renamed from: b */
        public float f23440b;

        /* JADX INFO: renamed from: c */
        public final Interpolator f23441c;

        /* JADX INFO: renamed from: d */
        public final long f23442d;

        public Impl(int i, Interpolator interpolator, long j) {
            this.f23439a = i;
            this.f23441c = interpolator;
            this.f23442d = j;
        }

        /* JADX INFO: renamed from: a */
        public long mo7880a() {
            return this.f23442d;
        }

        /* JADX INFO: renamed from: b */
        public float mo7881b() {
            return this.f23440b;
        }

        /* JADX INFO: renamed from: c */
        public float mo7882c() {
            Interpolator interpolator = this.f23441c;
            return interpolator != null ? interpolator.getInterpolation(this.f23440b) : this.f23440b;
        }

        /* JADX INFO: renamed from: d */
        public int mo7883d() {
            return this.f23439a;
        }

        /* JADX INFO: renamed from: e */
        public void mo7884e(float f) {
            this.f23440b = f;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl21 extends Impl {

        /* JADX INFO: renamed from: e */
        public static final PathInterpolator f23443e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f */
        public static final FastOutLinearInInterpolator f23444f = new FastOutLinearInInterpolator();

        /* JADX INFO: renamed from: g */
        public static final DecelerateInterpolator f23445g = new DecelerateInterpolator();

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public final Callback f23446a;

            /* JADX INFO: renamed from: b */
            public WindowInsetsCompat f23447b;

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1 */
            /* JADX INFO: compiled from: Proguard */
            class C14591 implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ WindowInsetsAnimationCompat f23448a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ WindowInsetsCompat f23449b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ WindowInsetsCompat f23450c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f23451d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f23452e;

                public C14591(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
                    this.f23448a = windowInsetsAnimationCompat;
                    this.f23449b = windowInsetsCompat;
                    this.f23450c = windowInsetsCompat2;
                    this.f23451d = i;
                    this.f23452e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f23448a;
                    windowInsetsAnimationCompat.f23436a.mo7884e(animatedFraction);
                    float fMo7882c = windowInsetsAnimationCompat.f23436a.mo7882c();
                    PathInterpolator pathInterpolator = Impl21.f23443e;
                    WindowInsetsCompat windowInsetsCompat = this.f23449b;
                    WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
                    int i = 1;
                    while (true) {
                        WindowInsetsCompat.BuilderImpl builderImpl = builder.f23466a;
                        if (i > 256) {
                            Impl21.m7887h(this.f23452e, builderImpl.mo7915b(), Collections.singletonList(windowInsetsAnimationCompat));
                            return;
                        }
                        int i2 = this.f23451d & i;
                        WindowInsetsCompat.Impl impl = windowInsetsCompat.f23465a;
                        if (i2 == 0) {
                            builderImpl.mo7916c(i, impl.mo7929g(i));
                        } else {
                            Insets insetsMo7929g = impl.mo7929g(i);
                            Insets insetsMo7929g2 = this.f23450c.f23465a.mo7929g(i);
                            float f = 1.0f - fMo7882c;
                            builderImpl.mo7916c(i, WindowInsetsCompat.m7892o(insetsMo7929g, (int) (((double) ((insetsMo7929g.f23200a - insetsMo7929g2.f23200a) * f)) + 0.5d), (int) (((double) ((insetsMo7929g.f23201b - insetsMo7929g2.f23201b) * f)) + 0.5d), (int) (((double) ((insetsMo7929g.f23202c - insetsMo7929g2.f23202c) * f)) + 0.5d), (int) (((double) ((insetsMo7929g.f23203d - insetsMo7929g2.f23203d) * f)) + 0.5d)));
                        }
                        i <<= 1;
                    }
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2 */
            /* JADX INFO: compiled from: Proguard */
            class C14602 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ WindowInsetsAnimationCompat f23453a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f23454b;

                public C14602(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                    this.f23453a = windowInsetsAnimationCompat;
                    this.f23454b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f23453a;
                    windowInsetsAnimationCompat.f23436a.mo7884e(1.0f);
                    Impl21.m7885f(this.f23454b, windowInsetsAnimationCompat);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3 */
            /* JADX INFO: compiled from: Proguard */
            class RunnableC14613 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f23455a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ WindowInsetsAnimationCompat f23456b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ BoundsCompat f23457c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ValueAnimator f23458d;

                public RunnableC14613(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat, ValueAnimator valueAnimator) {
                    this.f23455a = view;
                    this.f23456b = windowInsetsAnimationCompat;
                    this.f23457c = boundsCompat;
                    this.f23458d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Impl21.m7888i(this.f23455a, this.f23456b, this.f23457c);
                    this.f23458d.start();
                }
            }

            public Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                this.f23446a = callback;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                WindowInsetsCompat windowInsetsCompatM7834a = ViewCompat.Api23Impl.m7834a(view);
                this.f23447b = windowInsetsCompatM7834a != null ? new WindowInsetsCompat.Builder(windowInsetsCompatM7834a).f23466a.mo7915b() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat.Impl impl;
                if (!view.isLaidOut()) {
                    this.f23447b = WindowInsetsCompat.m7893t(view, windowInsets);
                    return Impl21.m7889j(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompatM7893t = WindowInsetsCompat.m7893t(view, windowInsets);
                if (this.f23447b == null) {
                    WeakHashMap weakHashMap = ViewCompat.f23405a;
                    this.f23447b = ViewCompat.Api23Impl.m7834a(view);
                }
                if (this.f23447b == null) {
                    this.f23447b = windowInsetsCompatM7893t;
                    return Impl21.m7889j(view, windowInsets);
                }
                Callback callbackM7890k = Impl21.m7890k(view);
                if (callbackM7890k != null && Objects.equals(callbackM7890k.mDispachedInsets, windowInsets)) {
                    return Impl21.m7889j(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f23447b;
                int i = 1;
                int i2 = 0;
                while (true) {
                    impl = windowInsetsCompatM7893t.f23465a;
                    if (i > 256) {
                        break;
                    }
                    if (!impl.mo7929g(i).equals(windowInsetsCompat.f23465a.mo7929g(i))) {
                        i2 |= i;
                    }
                    i <<= 1;
                }
                if (i2 == 0) {
                    return Impl21.m7889j(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f23447b;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i2, (i2 & 8) != 0 ? impl.mo7929g(8).f23203d > windowInsetsCompat2.f23465a.mo7929g(8).f23203d ? Impl21.f23443e : Impl21.f23444f : Impl21.f23445g, 160L);
                windowInsetsAnimationCompat.f23436a.mo7884e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.f23436a.mo7880a());
                Insets insetsMo7929g = impl.mo7929g(i2);
                Insets insetsMo7929g2 = windowInsetsCompat2.f23465a.mo7929g(i2);
                int iMin = Math.min(insetsMo7929g.f23200a, insetsMo7929g2.f23200a);
                int i3 = insetsMo7929g.f23201b;
                int i4 = insetsMo7929g2.f23201b;
                int iMin2 = Math.min(i3, i4);
                int i5 = insetsMo7929g.f23202c;
                int i6 = insetsMo7929g2.f23202c;
                int iMin3 = Math.min(i5, i6);
                int i7 = insetsMo7929g.f23203d;
                int i8 = i2;
                int i9 = insetsMo7929g2.f23203d;
                BoundsCompat boundsCompat = new BoundsCompat(Insets.m7562b(iMin, iMin2, iMin3, Math.min(i7, i9)), Insets.m7562b(Math.max(insetsMo7929g.f23200a, insetsMo7929g2.f23200a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                Impl21.m7886g(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new C14591(windowInsetsAnimationCompat, windowInsetsCompatM7893t, windowInsetsCompat2, i8, view));
                duration.addListener(new C14602(view, windowInsetsAnimationCompat));
                OneShotPreDrawListener.m7759a(view, new RunnableC14613(view, windowInsetsAnimationCompat, boundsCompat, duration));
                this.f23447b = windowInsetsCompatM7893t;
                return Impl21.m7889j(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m7885f(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackM7890k = m7890k(view);
            if (callbackM7890k != null) {
                callbackM7890k.onEnd(windowInsetsAnimationCompat);
                if (callbackM7890k.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m7885f(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m7886g(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z2) {
            Callback callbackM7890k = m7890k(view);
            if (callbackM7890k != null) {
                callbackM7890k.mDispachedInsets = windowInsets;
                if (!z2) {
                    callbackM7890k.onPrepare(windowInsetsAnimationCompat);
                    z2 = callbackM7890k.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m7886g(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z2);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static void m7887h(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback callbackM7890k = m7890k(view);
            if (callbackM7890k != null) {
                windowInsetsCompat = callbackM7890k.onProgress(windowInsetsCompat, list);
                if (callbackM7890k.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m7887h(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public static void m7888i(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callbackM7890k = m7890k(view);
            if (callbackM7890k != null) {
                callbackM7890k.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (callbackM7890k.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m7888i(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public static WindowInsets m7889j(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: k */
        public static Callback m7890k(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).f23446a;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl30 extends Impl {

        /* JADX INFO: renamed from: e */
        public final WindowInsetsAnimation f23459e;

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class ProxyCallback extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            public final Callback f23460a;

            /* JADX INFO: renamed from: b */
            public List f23461b;

            /* JADX INFO: renamed from: c */
            public ArrayList f23462c;

            /* JADX INFO: renamed from: d */
            public final HashMap f23463d;

            public ProxyCallback(Callback callback) {
                super(callback.getDispatchMode());
                this.f23463d = new HashMap();
                this.f23460a = callback;
            }

            /* JADX INFO: renamed from: a */
            public final WindowInsetsAnimationCompat m7891a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.f23463d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        windowInsetsAnimationCompat.f23436a = new Impl30(windowInsetsAnimation);
                    }
                    this.f23463d.put(windowInsetsAnimation, windowInsetsAnimationCompat);
                }
                return windowInsetsAnimationCompat;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f23460a.onEnd(m7891a(windowInsetsAnimation));
                this.f23463d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f23460a.onPrepare(m7891a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f23462c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f23462c = arrayList2;
                    this.f23461b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM8091i = AbstractC1473i.m8091i(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatM7891a = m7891a(windowInsetsAnimationM8091i);
                    windowInsetsAnimationCompatM7891a.f23436a.mo7884e(AbstractC0025b.m109a(windowInsetsAnimationM8091i));
                    this.f23462c.add(windowInsetsAnimationCompatM7891a);
                }
                return this.f23460a.onProgress(WindowInsetsCompat.m7893t(null, windowInsets), this.f23461b).m7911s();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                BoundsCompat boundsCompatOnStart = this.f23460a.onStart(m7891a(windowInsetsAnimation), new BoundsCompat(bounds));
                boundsCompatOnStart.getClass();
                AbstractC0025b.m120l();
                return AbstractC1473i.m8089g(boundsCompatOnStart.f23437a.m7564d(), boundsCompatOnStart.f23438b.m7564d());
            }
        }

        public Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f23459e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* JADX INFO: renamed from: a */
        public final long mo7880a() {
            return AbstractC0025b.m112d(this.f23459e);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* JADX INFO: renamed from: b */
        public final float mo7881b() {
            return AbstractC0025b.m109a(this.f23459e);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* JADX INFO: renamed from: c */
        public final float mo7882c() {
            return AbstractC1473i.m8083a(this.f23459e);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* JADX INFO: renamed from: d */
        public final int mo7883d() {
            return AbstractC0025b.m111c(this.f23459e);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* JADX INFO: renamed from: e */
        public final void mo7884e(float f) {
            AbstractC0025b.m124p(this.f23459e, f);
        }
    }

    public WindowInsetsAnimationCompat(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f23436a = new Impl30(AbstractC1473i.m8090h(i, interpolator, j));
        } else {
            this.f23436a = new Impl21(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m7876a() {
        return this.f23436a.mo7880a();
    }

    /* JADX INFO: renamed from: b */
    public final float m7877b() {
        return this.f23436a.mo7881b();
    }

    /* JADX INFO: renamed from: c */
    public final float m7878c() {
        return this.f23436a.mo7882c();
    }

    /* JADX INFO: renamed from: d */
    public final int m7879d() {
        return this.f23436a.mo7883d();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BoundsCompat {

        /* JADX INFO: renamed from: a */
        public final Insets f23437a;

        /* JADX INFO: renamed from: b */
        public final Insets f23438b;

        public BoundsCompat(Insets insets, Insets insets2) {
            this.f23437a = insets;
            this.f23438b = insets2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f23437a + " upper=" + this.f23438b + "}";
        }

        public BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.f23437a = Insets.m7563c(AbstractC1473i.m8102t(bounds));
            this.f23438b = Insets.m7563c(AbstractC1473i.m8087e(bounds));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface DispatchMode {
        }

        public Callback(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list);

        public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        @NonNull
        public BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }
}
