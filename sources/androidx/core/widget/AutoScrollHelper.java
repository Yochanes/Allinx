package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.google.firebase.messaging.ServiceStarter;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {

    /* JADX INFO: renamed from: v */
    public static final int f23553v = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final ClampedScroller f23554a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f23555b;

    /* JADX INFO: renamed from: c */
    public final ListView f23556c;

    /* JADX INFO: renamed from: d */
    public Runnable f23557d;

    /* JADX INFO: renamed from: f */
    public final float[] f23558f;

    /* JADX INFO: renamed from: g */
    public final float[] f23559g;

    /* JADX INFO: renamed from: i */
    public final int f23560i;

    /* JADX INFO: renamed from: j */
    public final int f23561j;

    /* JADX INFO: renamed from: n */
    public final float[] f23562n;

    /* JADX INFO: renamed from: o */
    public final float[] f23563o;

    /* JADX INFO: renamed from: p */
    public final float[] f23564p;

    /* JADX INFO: renamed from: q */
    public boolean f23565q;

    /* JADX INFO: renamed from: r */
    public boolean f23566r;

    /* JADX INFO: renamed from: s */
    public boolean f23567s;

    /* JADX INFO: renamed from: t */
    public boolean f23568t;

    /* JADX INFO: renamed from: u */
    public boolean f23569u;

    /* JADX INFO: compiled from: Proguard */
    public static class ClampedScroller {

        /* JADX INFO: renamed from: a */
        public int f23570a;

        /* JADX INFO: renamed from: b */
        public int f23571b;

        /* JADX INFO: renamed from: c */
        public float f23572c;

        /* JADX INFO: renamed from: d */
        public float f23573d;

        /* JADX INFO: renamed from: e */
        public long f23574e;

        /* JADX INFO: renamed from: f */
        public long f23575f;

        /* JADX INFO: renamed from: g */
        public long f23576g;

        /* JADX INFO: renamed from: h */
        public float f23577h;

        /* JADX INFO: renamed from: i */
        public int f23578i;

        /* JADX INFO: renamed from: a */
        public final float m8164a(long j) {
            if (j < this.f23574e) {
                return 0.0f;
            }
            long j2 = this.f23576g;
            if (j2 < 0 || j < j2) {
                return AutoScrollHelper.m8157c((j - r0) / this.f23570a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f23577h;
            return (AutoScrollHelper.m8157c((j - j2) / this.f23578i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ScrollAnimationRunnable implements Runnable {
        public ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.f23568t) {
                boolean z2 = autoScrollHelper.f23566r;
                ClampedScroller clampedScroller = autoScrollHelper.f23554a;
                if (z2) {
                    autoScrollHelper.f23566r = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    clampedScroller.f23574e = jCurrentAnimationTimeMillis;
                    clampedScroller.f23576g = -1L;
                    clampedScroller.f23575f = jCurrentAnimationTimeMillis;
                    clampedScroller.f23577h = 0.5f;
                }
                if ((clampedScroller.f23576g > 0 && AnimationUtils.currentAnimationTimeMillis() > clampedScroller.f23576g + ((long) clampedScroller.f23578i)) || !autoScrollHelper.m8163g()) {
                    autoScrollHelper.f23568t = false;
                    return;
                }
                boolean z3 = autoScrollHelper.f23567s;
                ListView listView = autoScrollHelper.f23556c;
                if (z3) {
                    autoScrollHelper.f23567s = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    listView.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (clampedScroller.f23575f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fM8164a = clampedScroller.m8164a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - clampedScroller.f23575f;
                clampedScroller.f23575f = jCurrentAnimationTimeMillis2;
                autoScrollHelper.mo8162f((int) (j * ((fM8164a * 4.0f) + ((-4.0f) * fM8164a * fM8164a)) * clampedScroller.f23573d));
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                listView.postOnAnimation(this);
            }
        }
    }

    public AutoScrollHelper(ListView listView) {
        ClampedScroller clampedScroller = new ClampedScroller();
        clampedScroller.f23574e = Long.MIN_VALUE;
        clampedScroller.f23576g = -1L;
        clampedScroller.f23575f = 0L;
        this.f23554a = clampedScroller;
        this.f23555b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f23558f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f23559g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f23562n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f23563o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f23564p = fArr5;
        this.f23556c = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f23560i = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f23561j = f23553v;
        clampedScroller.f23570a = ServiceStarter.ERROR_UNKNOWN;
        clampedScroller.f23571b = ServiceStarter.ERROR_UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public static float m8157c(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo8158a(int i);

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m8159b(float f, float f2, float f3, int i) {
        float fM8157c;
        float interpolation;
        float fM8157c2 = m8157c(this.f23558f[i] * f2, 0.0f, this.f23559g[i]);
        float fM8160d = m8160d(f2 - f, fM8157c2) - m8160d(f, fM8157c2);
        AccelerateInterpolator accelerateInterpolator = this.f23555b;
        if (fM8160d < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM8160d);
        } else {
            if (fM8160d <= 0.0f) {
                fM8157c = 0.0f;
                if (fM8157c != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.f23562n[i];
                float f5 = this.f23563o[i];
                float f6 = this.f23564p[i];
                float f7 = f4 * f3;
                return fM8157c > 0.0f ? m8157c(fM8157c * f7, f5, f6) : -m8157c((-fM8157c) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM8160d);
        }
        fM8157c = m8157c(interpolation, -1.0f, 1.0f);
        if (fM8157c != 0.0f) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m8160d(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f23560i;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f23568t && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m8161e() {
        int i = 0;
        if (this.f23566r) {
            this.f23568t = false;
            return;
        }
        ClampedScroller clampedScroller = this.f23554a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - clampedScroller.f23574e);
        int i3 = clampedScroller.f23571b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        clampedScroller.f23578i = i;
        clampedScroller.f23577h = clampedScroller.m8164a(jCurrentAnimationTimeMillis);
        clampedScroller.f23576g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo8162f(int i);

    /* JADX INFO: renamed from: g */
    public final boolean m8163g() {
        ClampedScroller clampedScroller = this.f23554a;
        float f = clampedScroller.f23573d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(clampedScroller.f23572c);
        return iAbs != 0 && mo8158a(iAbs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f23569u) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m8161e();
                return false;
            }
            this.f23567s = true;
            this.f23565q = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f23556c;
            float fM8159b = m8159b(x, width, listView.getWidth(), 0);
            float fM8159b2 = m8159b(motionEvent.getY(), view.getHeight(), listView.getHeight(), 1);
            ClampedScroller clampedScroller = this.f23554a;
            clampedScroller.f23572c = fM8159b;
            clampedScroller.f23573d = fM8159b2;
            if (!this.f23568t && m8163g()) {
                if (this.f23557d == null) {
                    this.f23557d = new ScrollAnimationRunnable();
                }
                this.f23568t = true;
                this.f23566r = true;
                if (this.f23565q || (i = this.f23561j) <= 0) {
                    ((ScrollAnimationRunnable) this.f23557d).run();
                } else {
                    Runnable runnable = this.f23557d;
                    long j = i;
                    WeakHashMap weakHashMap = ViewCompat.f23405a;
                    listView.postOnAnimationDelayed(runnable, j);
                }
                this.f23565q = true;
            }
        }
        return false;
    }
}
