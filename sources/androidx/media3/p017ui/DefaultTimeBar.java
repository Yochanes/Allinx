package androidx.media3.p017ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;
import androidx.media3.p017ui.TimeBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultTimeBar extends View implements TimeBar {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f29822U = 0;

    /* JADX INFO: renamed from: A */
    public final Formatter f29823A;

    /* JADX INFO: renamed from: B */
    public final RunnableC1997a f29824B;

    /* JADX INFO: renamed from: C */
    public final CopyOnWriteArraySet f29825C;

    /* JADX INFO: renamed from: D */
    public final Point f29826D;

    /* JADX INFO: renamed from: E */
    public final float f29827E;

    /* JADX INFO: renamed from: F */
    public int f29828F;

    /* JADX INFO: renamed from: G */
    public long f29829G;

    /* JADX INFO: renamed from: H */
    public int f29830H;

    /* JADX INFO: renamed from: I */
    public Rect f29831I;

    /* JADX INFO: renamed from: J */
    public final ValueAnimator f29832J;

    /* JADX INFO: renamed from: K */
    public float f29833K;

    /* JADX INFO: renamed from: L */
    public boolean f29834L;

    /* JADX INFO: renamed from: M */
    public boolean f29835M;

    /* JADX INFO: renamed from: N */
    public long f29836N;

    /* JADX INFO: renamed from: O */
    public long f29837O;

    /* JADX INFO: renamed from: P */
    public long f29838P;

    /* JADX INFO: renamed from: Q */
    public long f29839Q;

    /* JADX INFO: renamed from: R */
    public int f29840R;

    /* JADX INFO: renamed from: S */
    public long[] f29841S;

    /* JADX INFO: renamed from: T */
    public boolean[] f29842T;

    /* JADX INFO: renamed from: a */
    public final Rect f29843a;

    /* JADX INFO: renamed from: b */
    public final Rect f29844b;

    /* JADX INFO: renamed from: c */
    public final Rect f29845c;

    /* JADX INFO: renamed from: d */
    public final Rect f29846d;

    /* JADX INFO: renamed from: f */
    public final Paint f29847f;

    /* JADX INFO: renamed from: g */
    public final Paint f29848g;

    /* JADX INFO: renamed from: i */
    public final Paint f29849i;

    /* JADX INFO: renamed from: j */
    public final Paint f29850j;

    /* JADX INFO: renamed from: n */
    public final Paint f29851n;

    /* JADX INFO: renamed from: o */
    public final Paint f29852o;

    /* JADX INFO: renamed from: p */
    public final Drawable f29853p;

    /* JADX INFO: renamed from: q */
    public final int f29854q;

    /* JADX INFO: renamed from: r */
    public final int f29855r;

    /* JADX INFO: renamed from: s */
    public final int f29856s;

    /* JADX INFO: renamed from: t */
    public final int f29857t;

    /* JADX INFO: renamed from: u */
    public final int f29858u;

    /* JADX INFO: renamed from: v */
    public final int f29859v;

    /* JADX INFO: renamed from: w */
    public final int f29860w;

    /* JADX INFO: renamed from: x */
    public final int f29861x;

    /* JADX INFO: renamed from: y */
    public final int f29862y;

    /* JADX INFO: renamed from: z */
    public final StringBuilder f29863z;

    public DefaultTimeBar(Context context) {
        super(context, null, 0);
        this.f29843a = new Rect();
        this.f29844b = new Rect();
        this.f29845c = new Rect();
        this.f29846d = new Rect();
        Paint paint = new Paint();
        this.f29847f = paint;
        Paint paint2 = new Paint();
        this.f29848g = paint2;
        Paint paint3 = new Paint();
        this.f29849i = paint3;
        Paint paint4 = new Paint();
        this.f29850j = paint4;
        Paint paint5 = new Paint();
        this.f29851n = paint5;
        Paint paint6 = new Paint();
        this.f29852o = paint6;
        paint6.setAntiAlias(true);
        this.f29825C = new CopyOnWriteArraySet();
        this.f29826D = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f29827E = f;
        this.f29862y = m11096c(f, -50);
        int iM11096c = m11096c(f, 4);
        int iM11096c2 = m11096c(f, 26);
        int iM11096c3 = m11096c(f, 4);
        int iM11096c4 = m11096c(f, 12);
        int iM11096c5 = m11096c(f, 0);
        int iM11096c6 = m11096c(f, 16);
        this.f29854q = iM11096c;
        this.f29855r = iM11096c2;
        this.f29856s = 0;
        this.f29857t = iM11096c3;
        this.f29858u = iM11096c4;
        this.f29859v = iM11096c5;
        this.f29860w = iM11096c6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.f29853p = null;
        StringBuilder sb = new StringBuilder();
        this.f29863z = sb;
        this.f29823A = new Formatter(sb, Locale.getDefault());
        this.f29824B = new RunnableC1997a(0, this);
        this.f29861x = (Math.max(iM11096c5, Math.max(iM11096c4, iM11096c6)) + 1) / 2;
        this.f29833K = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f29832J = valueAnimator;
        valueAnimator.addUpdateListener(new C2002f(this, 4));
        this.f29837O = -9223372036854775807L;
        this.f29829G = -9223372036854775807L;
        this.f29828F = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m11096c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f29829G;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f29837O;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f29828F);
    }

    private String getProgressText() {
        return Util.m9633x(this.f29863z, this.f29823A, this.f29838P);
    }

    private long getScrubberPosition() {
        Rect rect = this.f29844b;
        if (rect.width() <= 0 || this.f29837O == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f29846d.width()) * this.f29837O) / ((long) rect.width());
    }

    @Override // androidx.media3.p017ui.TimeBar
    /* JADX INFO: renamed from: a */
    public final void mo11097a(TimeBar.OnScrubListener onScrubListener) {
        this.f29825C.add(onScrubListener);
    }

    @Override // androidx.media3.p017ui.TimeBar
    /* JADX INFO: renamed from: b */
    public final void mo11098b(long[] jArr, boolean[] zArr, int i) {
        Assertions.m9460a(i == 0 || !(jArr == null || zArr == null));
        this.f29840R = i;
        this.f29841S = jArr;
        this.f29842T = zArr;
        m11102g();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11099d(long j) {
        long j2 = this.f29837O;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f29835M ? this.f29836N : this.f29838P;
        long jM9619j = Util.m9619j(j3 + j, 0L, j2);
        if (jM9619j == j3) {
            return false;
        }
        if (this.f29835M) {
            m11103h(jM9619j);
        } else {
            m11100e(jM9619j);
        }
        m11102g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f29853p;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11100e(long j) {
        this.f29836N = j;
        this.f29835M = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f29825C.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).mo11114L(j);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11101f(boolean z2) {
        removeCallbacks(this.f29824B);
        this.f29835M = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f29825C.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).mo11115M(this.f29836N, z2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11102g() {
        Rect rect = this.f29845c;
        Rect rect2 = this.f29844b;
        rect.set(rect2);
        Rect rect3 = this.f29846d;
        rect3.set(rect2);
        long j = this.f29835M ? this.f29836N : this.f29838P;
        if (this.f29837O > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f29839Q) / this.f29837O)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f29837O)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f29843a);
    }

    @Override // androidx.media3.p017ui.TimeBar
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f29844b.width() / this.f29827E);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f29837O;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    /* JADX INFO: renamed from: h */
    public final void m11103h(long j) {
        if (this.f29836N == j) {
            return;
        }
        this.f29836N = j;
        Iterator it = this.f29825C.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).mo11113K(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f29853p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f29844b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.f29837O;
        Paint paint = this.f29849i;
        Rect rect2 = this.f29846d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.f29845c;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (iMax < i4) {
                canvas.drawRect(iMax, iCenterY, i4, i, paint);
            }
            int iMax2 = Math.max(i2, rect2.right);
            if (i3 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i3, i, this.f29848g);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.f29847f);
            }
            if (this.f29840R != 0) {
                long[] jArr = this.f29841S;
                jArr.getClass();
                boolean[] zArr = this.f29842T;
                zArr.getClass();
                int i5 = this.f29857t;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.f29840R) {
                    int i9 = i8;
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((((long) rect.width()) * Util.m9619j(jArr[i8], 0L, this.f29837O)) / this.f29837O)) - i6)) + rect.left, iCenterY, r3 + i5, i, zArr[i8] ? this.f29851n : this.f29850j);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.f29837O > 0) {
            int iM9618i = Util.m9618i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f29853p;
            if (drawable == null) {
                canvas2.drawCircle(iM9618i, iCenterY2, (int) ((((this.f29835M || isFocused()) ? this.f29860w : isEnabled() ? this.f29858u : this.f29859v) * this.f29833K) / 2.0f), this.f29852o);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f29833K)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f29833K)) / 2;
                drawable.setBounds(iM9618i - intrinsicWidth, iCenterY2 - intrinsicHeight, iM9618i + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (!this.f29835M || z2) {
            return;
        }
        m11101f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f29837O <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        positionIncrement = -positionIncrement;
                        if (m11099d(positionIncrement)) {
                            RunnableC1997a runnableC1997a = this.f29824B;
                            removeCallbacks(runnableC1997a);
                            postDelayed(runnableC1997a, 1000L);
                        }
                        break;
                    case 22:
                        if (m11099d(positionIncrement)) {
                        }
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        if (this.f29835M) {
                            m11101f(false);
                        }
                        break;
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f29834L ? 0 : this.f29861x;
        int i8 = this.f29856s;
        int i9 = this.f29854q;
        int i10 = this.f29855r;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f29843a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f29844b.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Util.f25665a >= 29 && ((rect = this.f29831I) == null || rect.width() != i5 || this.f29831I.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f29831I = rect3;
            AbstractC1895a.m10612r(this, Collections.singletonList(rect3));
        }
        m11102g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f29855r;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f29853p;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f29853p;
        if (drawable == null || Util.f25665a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f29837O > 0) {
            Point point = this.f29826D;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f29846d;
            Rect rect2 = this.f29844b;
            if (action == 0) {
                int i3 = i;
                if (this.f29843a.contains(i3, i2)) {
                    rect.right = Util.m9618i(i3, rect2.left, rect2.right);
                    m11100e(getScrubberPosition());
                    m11102g();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f29835M) {
                    m11101f(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                }
            } else if (this.f29835M) {
                if (i2 < this.f29862y) {
                    int i4 = this.f29830H;
                    rect.right = Util.m9618i(((i - i4) / 3) + i4, rect2.left, rect2.right);
                } else {
                    this.f29830H = i;
                    rect.right = Util.m9618i(i, rect2.left, rect2.right);
                }
                m11103h(getScrubberPosition());
                m11102g();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f29837O <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m11099d(-getPositionIncrement())) {
                m11101f(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m11099d(getPositionIncrement())) {
                m11101f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f29850j.setColor(i);
        invalidate(this.f29843a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f29848g.setColor(i);
        invalidate(this.f29843a);
    }

    @Override // androidx.media3.p017ui.TimeBar
    public void setBufferedPosition(long j) {
        if (this.f29839Q == j) {
            return;
        }
        this.f29839Q = j;
        m11102g();
    }

    @Override // androidx.media3.p017ui.TimeBar
    public void setDuration(long j) {
        if (this.f29837O == j) {
            return;
        }
        this.f29837O = j;
        if (this.f29835M && j == -9223372036854775807L) {
            m11101f(true);
        }
        m11102g();
    }

    @Override // android.view.View, androidx.media3.p017ui.TimeBar
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!this.f29835M || z2) {
            return;
        }
        m11101f(true);
    }

    public void setKeyCountIncrement(int i) {
        Assertions.m9460a(i > 0);
        this.f29828F = i;
        this.f29829G = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        Assertions.m9460a(j > 0);
        this.f29828F = -1;
        this.f29829G = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f29851n.setColor(i);
        invalidate(this.f29843a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f29847f.setColor(i);
        invalidate(this.f29843a);
    }

    @Override // androidx.media3.p017ui.TimeBar
    public void setPosition(long j) {
        if (this.f29838P == j) {
            return;
        }
        this.f29838P = j;
        setContentDescription(getProgressText());
        m11102g();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f29852o.setColor(i);
        invalidate(this.f29843a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f29849i.setColor(i);
        invalidate(this.f29843a);
    }
}
