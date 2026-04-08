package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f1281a;

    /* JADX INFO: renamed from: b */
    public final int f1282b;

    /* JADX INFO: renamed from: c */
    public final int f1283c;

    /* JADX INFO: renamed from: d */
    public final View f1284d;

    /* JADX INFO: renamed from: f */
    public Runnable f1285f;

    /* JADX INFO: renamed from: g */
    public Runnable f1286g;

    /* JADX INFO: renamed from: i */
    public boolean f1287i;

    /* JADX INFO: renamed from: j */
    public int f1288j;

    /* JADX INFO: renamed from: n */
    public final int[] f1289n = new int[2];

    /* JADX INFO: compiled from: Proguard */
    public class DisallowIntercept implements Runnable {
        public DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = ForwardingListener.this.f1284d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class TriggerLongPress implements Runnable {
        public TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ForwardingListener forwardingListener = ForwardingListener.this;
            forwardingListener.m656a();
            View view = forwardingListener.f1284d;
            if (view.isEnabled() && !view.isLongClickable() && forwardingListener.mo440c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                forwardingListener.f1287i = true;
            }
        }
    }

    public ForwardingListener(View view) {
        this.f1284d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1281a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1282b = tapTimeout;
        this.f1283c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m656a() {
        Runnable runnable = this.f1286g;
        View view = this.f1284d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1285f;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract ShowableListMenu mo439b();

    /* JADX INFO: renamed from: c */
    public boolean mo440c() {
        ShowableListMenu showableListMenuMo439b = mo439b();
        if (showableListMenuMo439b == null || showableListMenuMo439b.mo448a()) {
            return true;
        }
        showableListMenuMo439b.show();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo517d() {
        ShowableListMenu showableListMenuMo439b = mo439b();
        if (showableListMenuMo439b == null || !showableListMenuMo439b.mo448a()) {
            return true;
        }
        showableListMenuMo439b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        DropDownListView dropDownListView;
        boolean z3 = this.f1287i;
        View view2 = this.f1284d;
        if (z3) {
            ShowableListMenu showableListMenuMo439b = mo439b();
            if (showableListMenuMo439b == null || !showableListMenuMo439b.mo448a() || (dropDownListView = (DropDownListView) showableListMenuMo439b.mo453g()) == null || !dropDownListView.isShown()) {
                z2 = !mo517d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1289n;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                dropDownListView.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM652b = dropDownListView.m652b(motionEventObtainNoHistory, this.f1288j);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM652b || !z4) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f1288j = motionEvent.getPointerId(0);
                if (this.f1285f == null) {
                    this.f1285f = new DisallowIntercept();
                }
                view2.postDelayed(this.f1285f, this.f1282b);
                if (this.f1286g == null) {
                    this.f1286g = new TriggerLongPress();
                }
                view2.postDelayed(this.f1286g, this.f1283c);
            } else if (actionMasked2 == 1) {
                m656a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1288j);
                if (iFindPointerIndex >= 0) {
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float f = this.f1281a;
                    float f2 = -f;
                    if (x < f2 || y2 < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y2 >= (view2.getBottom() - view2.getTop()) + f) {
                        m656a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (mo440c()) {
                            z2 = true;
                        }
                        if (z2) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z2 = false;
            if (z2) {
            }
        } else {
            z2 = false;
            if (z2) {
            }
        }
        this.f1287i = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1287i = false;
        this.f1288j = -1;
        Runnable runnable = this.f1285f;
        if (runnable != null) {
            this.f1284d.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
