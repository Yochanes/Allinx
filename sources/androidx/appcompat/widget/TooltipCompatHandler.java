package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.exchange.allin.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: p */
    public static TooltipCompatHandler f1465p;

    /* JADX INFO: renamed from: q */
    public static TooltipCompatHandler f1466q;

    /* JADX INFO: renamed from: a */
    public final View f1467a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f1468b;

    /* JADX INFO: renamed from: c */
    public final int f1469c;

    /* JADX INFO: renamed from: g */
    public int f1472g;

    /* JADX INFO: renamed from: i */
    public int f1473i;

    /* JADX INFO: renamed from: j */
    public TooltipPopup f1474j;

    /* JADX INFO: renamed from: n */
    public boolean f1475n;

    /* JADX INFO: renamed from: d */
    public final RunnableC0152e f1470d = new RunnableC0152e(this, 0);

    /* JADX INFO: renamed from: f */
    public final RunnableC0152e f1471f = new RunnableC0152e(this, 1);

    /* JADX INFO: renamed from: o */
    public boolean f1476o = true;

    public TooltipCompatHandler(View view, CharSequence charSequence) {
        this.f1467a = view;
        this.f1468b = charSequence;
        this.f1469c = ViewConfigurationCompat.m7857c(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: b */
    public static void m735b(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = f1465p;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.f1467a.removeCallbacks(tooltipCompatHandler2.f1470d);
        }
        f1465p = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.f1467a.postDelayed(tooltipCompatHandler.f1470d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m736a() {
        TooltipCompatHandler tooltipCompatHandler = f1466q;
        View view = this.f1467a;
        if (tooltipCompatHandler == this) {
            f1466q = null;
            TooltipPopup tooltipPopup = this.f1474j;
            if (tooltipPopup != null) {
                View view2 = tooltipPopup.f1478b;
                if (view2.getParent() != null) {
                    ((WindowManager) tooltipPopup.f1477a.getSystemService("window")).removeView(view2);
                }
                this.f1474j = null;
                this.f1476o = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1465p == this) {
            m735b(null);
        }
        view.removeCallbacks(this.f1471f);
    }

    /* JADX INFO: renamed from: c */
    public final void m737c(boolean z2) {
        int height;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f1467a;
        if (view.isAttachedToWindow()) {
            m735b(null);
            TooltipCompatHandler tooltipCompatHandler = f1466q;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.m736a();
            }
            f1466q = this;
            this.f1475n = z2;
            TooltipPopup tooltipPopup = new TooltipPopup(view.getContext());
            this.f1474j = tooltipPopup;
            int width = this.f1472g;
            int i6 = this.f1473i;
            boolean z3 = this.f1475n;
            View view2 = tooltipPopup.f1478b;
            ViewParent parent = view2.getParent();
            Context context = tooltipPopup.f1477a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            tooltipPopup.f1479c.setText(this.f1468b);
            WindowManager.LayoutParams layoutParams = tooltipPopup.f1480d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i5 = 1;
            } else {
                Rect rect = tooltipPopup.f1481e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = width;
                    i3 = i;
                    i4 = 0;
                    i5 = 1;
                } else {
                    Resources resources = context.getResources();
                    i5 = 1;
                    i2 = width;
                    i3 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i4 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = tooltipPopup.f1483g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = tooltipPopup.f1482f;
                view.getLocationOnScreen(iArr2);
                int i7 = iArr2[i4] - iArr[i4];
                iArr2[i4] = i7;
                iArr2[i5] = iArr2[i5] - iArr[i5];
                layoutParams.x = (i7 + i2) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i8 = iArr2[i5];
                int i9 = ((i8 + i3) - dimensionPixelOffset3) - measuredHeight;
                int i10 = i8 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i9 >= 0) {
                        layoutParams.y = i9;
                    } else {
                        layoutParams.y = i10;
                    }
                } else if (measuredHeight + i10 <= rect.height()) {
                    layoutParams.y = i10;
                } else {
                    layoutParams.y = i9;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f1475n) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                if ((view.getWindowSystemUiVisibility() & 1) == i5) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC0152e runnableC0152e = this.f1471f;
            view.removeCallbacks(runnableC0152e);
            view.postDelayed(runnableC0152e, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1474j == null || !this.f1475n) {
            View view2 = this.f1467a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f1476o = true;
                        m736a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f1474j == null) {
                    int x = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (!this.f1476o) {
                        int iAbs = Math.abs(x - this.f1472g);
                        int i = this.f1469c;
                        if (iAbs > i || Math.abs(y2 - this.f1473i) > i) {
                            this.f1472g = x;
                            this.f1473i = y2;
                            this.f1476o = false;
                            m735b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1472g = view.getWidth() / 2;
        this.f1473i = view.getHeight() / 2;
        m737c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m736a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
