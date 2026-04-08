package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ViewDragHelper {

    /* JADX INFO: renamed from: v */
    public static final Interpolator f23631v = new InterpolatorC14861();

    /* JADX INFO: renamed from: a */
    public int f23632a;

    /* JADX INFO: renamed from: b */
    public int f23633b;

    /* JADX INFO: renamed from: d */
    public float[] f23635d;

    /* JADX INFO: renamed from: e */
    public float[] f23636e;

    /* JADX INFO: renamed from: f */
    public float[] f23637f;

    /* JADX INFO: renamed from: g */
    public float[] f23638g;

    /* JADX INFO: renamed from: h */
    public int[] f23639h;

    /* JADX INFO: renamed from: i */
    public int[] f23640i;

    /* JADX INFO: renamed from: j */
    public int[] f23641j;

    /* JADX INFO: renamed from: k */
    public int f23642k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f23643l;

    /* JADX INFO: renamed from: m */
    public final float f23644m;

    /* JADX INFO: renamed from: n */
    public final float f23645n;

    /* JADX INFO: renamed from: o */
    public final int f23646o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f23647p;

    /* JADX INFO: renamed from: q */
    public final Callback f23648q;

    /* JADX INFO: renamed from: r */
    public View f23649r;

    /* JADX INFO: renamed from: s */
    public boolean f23650s;

    /* JADX INFO: renamed from: t */
    public final ViewGroup f23651t;

    /* JADX INFO: renamed from: c */
    public int f23634c = -1;

    /* JADX INFO: renamed from: u */
    public final Runnable f23652u = new RunnableC14872();

    /* JADX INFO: renamed from: androidx.customview.widget.ViewDragHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    public class InterpolatorC14861 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.ViewDragHelper$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC14872 implements Runnable {
        public RunnableC14872() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper.this.m8233n(0);
        }
    }

    public ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f23651t = viewGroup;
        this.f23648q = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f23646o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f23633b = viewConfiguration.getScaledTouchSlop();
        this.f23644m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23645n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23647p = new OverScroller(context, f23631v);
    }

    /* JADX INFO: renamed from: a */
    public final void m8220a() {
        this.f23634c = -1;
        float[] fArr = this.f23635d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f23636e, 0.0f);
            Arrays.fill(this.f23637f, 0.0f);
            Arrays.fill(this.f23638g, 0.0f);
            Arrays.fill(this.f23639h, 0);
            Arrays.fill(this.f23640i, 0);
            Arrays.fill(this.f23641j, 0);
            this.f23642k = 0;
        }
        VelocityTracker velocityTracker = this.f23643l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23643l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8221b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f23651t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f23649r = view;
        this.f23634c = i;
        this.f23648q.onViewCaptured(view, i);
        m8233n(1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8222c(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        Callback callback = this.f23648q;
        boolean z2 = callback.getViewHorizontalDragRange(view) > 0;
        boolean z3 = callback.getViewVerticalDragRange(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f) > ((float) this.f23633b) : z3 && Math.abs(f2) > ((float) this.f23633b);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f23633b;
        return f3 > ((float) (i * i));
    }

    /* JADX INFO: renamed from: d */
    public final void m8223d(int i) {
        float[] fArr = this.f23635d;
        if (fArr != null) {
            int i2 = this.f23642k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f23636e[i] = 0.0f;
                this.f23637f[i] = 0.0f;
                this.f23638g[i] = 0.0f;
                this.f23639h[i] = 0;
                this.f23640i[i] = 0;
                this.f23641j[i] = 0;
                this.f23642k = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m8224e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f23651t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8225f() {
        if (this.f23632a == 2) {
            OverScroller overScroller = this.f23647p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f23649r.getLeft();
            int top = currY - this.f23649r.getTop();
            if (left != 0) {
                View view = this.f23649r;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f23649r;
                WeakHashMap weakHashMap2 = ViewCompat.f23405a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f23648q.onViewPositionChanged(this.f23649r, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f23651t.post(this.f23652u);
            }
        }
        return this.f23632a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m8226g(int i, int i2) {
        ViewGroup viewGroup = this.f23651t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f23648q.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8227h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f23649r.getLeft();
        int top = this.f23649r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f23647p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m8233n(0);
            return false;
        }
        View view = this.f23649r;
        int i7 = (int) this.f23645n;
        int i8 = (int) this.f23644m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        Callback callback = this.f23648q;
        overScroller.startScroll(left, top, i5, i6, (int) ((m8224e(i6, i4, callback.getViewVerticalDragRange(view)) * f6) + (m8224e(i5, i3, callback.getViewHorizontalDragRange(view)) * f5)));
        m8233n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8228i(int i) {
        if ((this.f23642k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m8229j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m8220a();
        }
        if (this.f23643l == null) {
            this.f23643l = VelocityTracker.obtain();
        }
        this.f23643l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM8226g = m8226g((int) x, (int) y2);
            m8231l(x, y2, pointerId);
            m8236q(pointerId, viewM8226g);
            int i3 = this.f23639h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f23632a == 1) {
                m8230k();
            }
            m8220a();
            return;
        }
        Callback callback = this.f23648q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f23632a == 1) {
                    this.f23650s = true;
                    callback.onViewReleased(this.f23649r, 0.0f, 0.0f);
                    this.f23650s = false;
                    if (this.f23632a == 1) {
                        m8233n(0);
                    }
                }
                m8220a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m8231l(x2, y3, pointerId2);
                if (this.f23632a == 0) {
                    m8236q(pointerId2, m8226g((int) x2, (int) y3));
                    int i4 = this.f23639h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y3;
                View view = this.f23649r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    m8236q(pointerId2, this.f23649r);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f23632a == 1 && pointerId3 == this.f23634c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f23634c) {
                        View viewM8226g2 = m8226g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f23649r;
                        if (viewM8226g2 == view2 && m8236q(pointerId4, view2)) {
                            i = this.f23634c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m8230k();
                }
            }
            m8223d(pointerId3);
            return;
        }
        if (this.f23632a == 1) {
            if (m8228i(this.f23634c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f23634c);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f23637f;
                int i7 = this.f23634c;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y4 - this.f23638g[i7]);
                int left = this.f23649r.getLeft() + i8;
                int top = this.f23649r.getTop() + i9;
                int left2 = this.f23649r.getLeft();
                int top2 = this.f23649r.getTop();
                if (i8 != 0) {
                    left = callback.clampViewPositionHorizontal(this.f23649r, left, i8);
                    WeakHashMap weakHashMap = ViewCompat.f23405a;
                    this.f23649r.offsetLeftAndRight(left - left2);
                }
                int i10 = left;
                if (i9 != 0) {
                    top = callback.clampViewPositionVertical(this.f23649r, top, i9);
                    WeakHashMap weakHashMap2 = ViewCompat.f23405a;
                    this.f23649r.offsetTopAndBottom(top - top2);
                }
                int i11 = top;
                if (i8 != 0 || i9 != 0) {
                    this.f23648q.onViewPositionChanged(this.f23649r, i10, i11, i10 - left2, i11 - top2);
                }
                m8232m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m8228i(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y5 = motionEvent.getY(i2);
                float f = x4 - this.f23635d[pointerId5];
                float f2 = y5 - this.f23636e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f23639h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f23639h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i14 = this.f23639h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i15 = this.f23639h[pointerId5];
                if (this.f23632a != 1) {
                    View viewM8226g3 = m8226g((int) x4, (int) y5);
                    if (m8222c(f, f2, viewM8226g3) && m8236q(pointerId5, viewM8226g3)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m8232m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m8230k() {
        VelocityTracker velocityTracker = this.f23643l;
        float f = this.f23644m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f23643l.getXVelocity(this.f23634c);
        float f2 = this.f23645n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f23643l.getYVelocity(this.f23634c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f23650s = true;
        this.f23648q.onViewReleased(this.f23649r, xVelocity, f);
        this.f23650s = false;
        if (this.f23632a == 1) {
            m8233n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8231l(float f, float f2, int i) {
        float[] fArr = this.f23635d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f23636e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f23637f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f23638g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f23639h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f23640i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f23641j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f23635d = fArr2;
            this.f23636e = fArr3;
            this.f23637f = fArr4;
            this.f23638g = fArr5;
            this.f23639h = iArr;
            this.f23640i = iArr2;
            this.f23641j = iArr3;
        }
        float[] fArr9 = this.f23635d;
        this.f23637f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f23636e;
        this.f23638g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f23639h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f23651t;
        int i5 = i3 < viewGroup.getLeft() + this.f23646o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f23646o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f23646o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f23646o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f23642k |= 1 << i;
    }

    /* JADX INFO: renamed from: m */
    public final void m8232m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m8228i(pointerId)) {
                float x = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f23637f[pointerId] = x;
                this.f23638g[pointerId] = y2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8233n(int i) {
        this.f23651t.removeCallbacks(this.f23652u);
        if (this.f23632a != i) {
            this.f23632a = i;
            this.f23648q.onViewDragStateChanged(i);
            if (this.f23632a == 0) {
                this.f23649r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8234o(int i, int i2) {
        if (this.f23650s) {
            return m8227h(i, i2, (int) this.f23643l.getXVelocity(this.f23634c), (int) this.f23643l.getYVelocity(this.f23634c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8235p(MotionEvent motionEvent) {
        View viewM8226g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m8220a();
        }
        if (this.f23643l == null) {
            this.f23643l = VelocityTracker.obtain();
        }
        this.f23643l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m8231l(x, y2, pointerId);
            View viewM8226g2 = m8226g((int) x, (int) y2);
            if (viewM8226g2 == this.f23649r && this.f23632a == 2) {
                m8236q(pointerId, viewM8226g2);
            }
            int i = this.f23639h[pointerId];
        } else if (actionMasked == 1) {
            m8220a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    m8231l(x2, y3, pointerId2);
                    int i2 = this.f23632a;
                    if (i2 == 0) {
                        int i3 = this.f23639h[pointerId2];
                    } else if (i2 == 2 && (viewM8226g = m8226g((int) x2, (int) y3)) == this.f23649r) {
                        m8236q(pointerId2, viewM8226g);
                    }
                } else if (actionMasked == 6) {
                    m8223d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f23635d != null && this.f23636e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (m8228i(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y4 = motionEvent.getY(i4);
                    float f = x3 - this.f23635d[pointerId3];
                    float f2 = y4 - this.f23636e[pointerId3];
                    View viewM8226g3 = m8226g((int) x3, (int) y4);
                    boolean z2 = viewM8226g3 != null && m8222c(f, f2, viewM8226g3);
                    if (z2) {
                        int left = viewM8226g3.getLeft();
                        int i5 = (int) f;
                        Callback callback = this.f23648q;
                        int iClampViewPositionHorizontal = callback.clampViewPositionHorizontal(viewM8226g3, left + i5, i5);
                        int top = viewM8226g3.getTop();
                        int i6 = (int) f2;
                        int iClampViewPositionVertical = callback.clampViewPositionVertical(viewM8226g3, top + i6, i6);
                        int viewHorizontalDragRange = callback.getViewHorizontalDragRange(viewM8226g3);
                        int viewVerticalDragRange = callback.getViewVerticalDragRange(viewM8226g3);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f23639h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f23639h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i9 = this.f23639h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i10 = this.f23639h[pointerId3];
                        if (this.f23632a == 1 || (z2 && m8236q(pointerId3, viewM8226g3))) {
                            break;
                        }
                    }
                }
            }
            m8232m(motionEvent);
        }
        return this.f23632a == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8236q(int i, View view) {
        if (view == this.f23649r && this.f23634c == i) {
            return true;
        }
        if (view == null || !this.f23648q.tryCaptureView(view, i)) {
            return false;
        }
        this.f23634c = i;
        m8221b(i, view);
        return true;
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Callback {
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public abstract boolean tryCaptureView(View view, int i);

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@NonNull View view, int i) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }
    }
}
