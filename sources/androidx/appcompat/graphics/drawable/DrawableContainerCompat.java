package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f592r = 0;

    /* JADX INFO: renamed from: a */
    public DrawableContainerState f593a;

    /* JADX INFO: renamed from: b */
    public Rect f594b;

    /* JADX INFO: renamed from: c */
    public Drawable f595c;

    /* JADX INFO: renamed from: d */
    public Drawable f596d;

    /* JADX INFO: renamed from: g */
    public boolean f598g;

    /* JADX INFO: renamed from: j */
    public boolean f600j;

    /* JADX INFO: renamed from: n */
    public Runnable f601n;

    /* JADX INFO: renamed from: o */
    public long f602o;

    /* JADX INFO: renamed from: p */
    public long f603p;

    /* JADX INFO: renamed from: q */
    public BlockInvalidateCallback f604q;

    /* JADX INFO: renamed from: f */
    public int f597f = 255;

    /* JADX INFO: renamed from: i */
    public int f599i = -1;

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC00871 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StateListDrawableCompat f605a;

        public RunnableC00871(StateListDrawableCompat stateListDrawableCompat) {
            this.f605a = stateListDrawableCompat;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StateListDrawableCompat stateListDrawableCompat = this.f605a;
            stateListDrawableCompat.m405a(true);
            stateListDrawableCompat.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class DrawableContainerState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A */
        public final int f607A;

        /* JADX INFO: renamed from: B */
        public boolean f608B;

        /* JADX INFO: renamed from: C */
        public ColorFilter f609C;

        /* JADX INFO: renamed from: D */
        public boolean f610D;

        /* JADX INFO: renamed from: E */
        public ColorStateList f611E;

        /* JADX INFO: renamed from: F */
        public PorterDuff.Mode f612F;

        /* JADX INFO: renamed from: G */
        public boolean f613G;

        /* JADX INFO: renamed from: H */
        public boolean f614H;

        /* JADX INFO: renamed from: a */
        public final StateListDrawableCompat f615a;

        /* JADX INFO: renamed from: b */
        public Resources f616b;

        /* JADX INFO: renamed from: c */
        public int f617c;

        /* JADX INFO: renamed from: d */
        public int f618d;

        /* JADX INFO: renamed from: e */
        public int f619e;

        /* JADX INFO: renamed from: f */
        public SparseArray f620f;

        /* JADX INFO: renamed from: g */
        public final Drawable[] f621g;

        /* JADX INFO: renamed from: h */
        public final int f622h;

        /* JADX INFO: renamed from: i */
        public final boolean f623i;

        /* JADX INFO: renamed from: j */
        public boolean f624j;

        /* JADX INFO: renamed from: k */
        public Rect f625k;

        /* JADX INFO: renamed from: l */
        public final boolean f626l;

        /* JADX INFO: renamed from: m */
        public boolean f627m;

        /* JADX INFO: renamed from: n */
        public int f628n;

        /* JADX INFO: renamed from: o */
        public int f629o;

        /* JADX INFO: renamed from: p */
        public int f630p;

        /* JADX INFO: renamed from: q */
        public int f631q;

        /* JADX INFO: renamed from: r */
        public boolean f632r;

        /* JADX INFO: renamed from: s */
        public int f633s;

        /* JADX INFO: renamed from: t */
        public boolean f634t;

        /* JADX INFO: renamed from: u */
        public boolean f635u;

        /* JADX INFO: renamed from: v */
        public boolean f636v;

        /* JADX INFO: renamed from: w */
        public boolean f637w;

        /* JADX INFO: renamed from: x */
        public boolean f638x;

        /* JADX INFO: renamed from: y */
        public int f639y;

        /* JADX INFO: renamed from: z */
        public final int f640z;

        public DrawableContainerState(StateListDrawableCompat.StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            this.f623i = false;
            this.f626l = false;
            this.f638x = true;
            this.f640z = 0;
            this.f607A = 0;
            this.f615a = stateListDrawableCompat;
            this.f616b = resources != null ? resources : stateListState != null ? stateListState.f616b : null;
            int i = stateListState != null ? stateListState.f617c : 0;
            int i2 = DrawableContainerCompat.f592r;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.f617c = i;
            if (stateListState == null) {
                this.f621g = new Drawable[10];
                this.f622h = 0;
                return;
            }
            this.f618d = stateListState.f618d;
            this.f619e = stateListState.f619e;
            this.f636v = true;
            this.f637w = true;
            this.f623i = stateListState.f623i;
            this.f626l = stateListState.f626l;
            this.f638x = stateListState.f638x;
            this.f639y = stateListState.f639y;
            this.f640z = stateListState.f640z;
            this.f607A = stateListState.f607A;
            this.f608B = stateListState.f608B;
            this.f609C = stateListState.f609C;
            this.f610D = stateListState.f610D;
            this.f611E = stateListState.f611E;
            this.f612F = stateListState.f612F;
            this.f613G = stateListState.f613G;
            this.f614H = stateListState.f614H;
            if (stateListState.f617c == i) {
                if (stateListState.f624j) {
                    this.f625k = stateListState.f625k != null ? new Rect(stateListState.f625k) : null;
                    this.f624j = true;
                }
                if (stateListState.f627m) {
                    this.f628n = stateListState.f628n;
                    this.f629o = stateListState.f629o;
                    this.f630p = stateListState.f630p;
                    this.f631q = stateListState.f631q;
                    this.f627m = true;
                }
            }
            if (stateListState.f632r) {
                this.f633s = stateListState.f633s;
                this.f632r = true;
            }
            if (stateListState.f634t) {
                this.f635u = stateListState.f635u;
                this.f634t = true;
            }
            Drawable[] drawableArr = stateListState.f621g;
            this.f621g = new Drawable[drawableArr.length];
            this.f622h = stateListState.f622h;
            SparseArray sparseArray = stateListState.f620f;
            if (sparseArray != null) {
                this.f620f = sparseArray.clone();
            } else {
                this.f620f = new SparseArray(this.f622h);
            }
            int i3 = this.f622h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f620f.put(i4, constantState);
                    } else {
                        this.f621g[i4] = drawableArr[i4];
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m408a() {
            this.f627m = true;
            m409b();
            int i = this.f622h;
            Drawable[] drawableArr = this.f621g;
            this.f629o = -1;
            this.f628n = -1;
            this.f631q = 0;
            this.f630p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f628n) {
                    this.f628n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f629o) {
                    this.f629o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f630p) {
                    this.f630p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f631q) {
                    this.f631q = minimumHeight;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m409b() {
            SparseArray sparseArray = this.f620f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f620f.keyAt(i);
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f620f.valueAt(i);
                    Drawable[] drawableArr = this.f621g;
                    Drawable drawableNewDrawable = constantState.newDrawable(this.f616b);
                    drawableNewDrawable.setLayoutDirection(this.f639y);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f615a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f620f = null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final Drawable m410c(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f621g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f620f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f620f.valueAt(iIndexOfKey)).newDrawable(this.f616b);
            drawableNewDrawable.setLayoutDirection(this.f639y);
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f615a);
            this.f621g[i] = drawableMutate;
            this.f620f.removeAt(iIndexOfKey);
            if (this.f620f.size() == 0) {
                this.f620f = null;
            }
            return drawableMutate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i = this.f622h;
            Drawable[] drawableArr = this.f621g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f620f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void mo401d() {
            int i = this.f622h;
            Drawable[] drawableArr = this.f621g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f618d | this.f619e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m405a(boolean z2) {
        boolean z3;
        Drawable drawable;
        boolean z4 = true;
        this.f598g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f595c;
        if (drawable2 != null) {
            long j = this.f602o;
            if (j != 0) {
                if (j <= jUptimeMillis) {
                    drawable2.setAlpha(this.f597f);
                    this.f602o = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j - jUptimeMillis) * 255)) / this.f593a.f640z)) * this.f597f) / 255);
                    z3 = true;
                }
            }
            drawable = this.f596d;
            if (drawable == null) {
                long j2 = this.f603p;
                if (j2 != 0) {
                    if (j2 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f596d = null;
                        this.f603p = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f593a.f607A) * this.f597f) / 255);
                    }
                }
                if (z2 && z4) {
                    scheduleSelf(this.f601n, jUptimeMillis + 16);
                    return;
                }
                return;
            }
            this.f603p = 0L;
            z4 = z3;
            if (z2) {
                return;
            } else {
                return;
            }
        }
        this.f602o = 0L;
        z3 = false;
        drawable = this.f596d;
        if (drawable == null) {
        }
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        DrawableContainerState drawableContainerState = this.f593a;
        if (theme == null) {
            drawableContainerState.getClass();
            return;
        }
        drawableContainerState.m409b();
        int i = drawableContainerState.f622h;
        Drawable[] drawableArr = drawableContainerState.f621g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                drawableContainerState.f619e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            drawableContainerState.f616b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = drawableContainerState.f617c;
            drawableContainerState.f617c = i3;
            if (i4 != i3) {
                drawableContainerState.f627m = false;
                drawableContainerState.f624j = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public DrawableContainerState mo396b() {
        return this.f593a;
    }

    /* JADX INFO: renamed from: c */
    public final void m406c(Drawable drawable) {
        if (this.f604q == null) {
            this.f604q = new BlockInvalidateCallback();
        }
        BlockInvalidateCallback blockInvalidateCallback = this.f604q;
        blockInvalidateCallback.f606a = drawable.getCallback();
        drawable.setCallback(blockInvalidateCallback);
        try {
            if (this.f593a.f640z <= 0 && this.f598g) {
                drawable.setAlpha(this.f597f);
            }
            DrawableContainerState drawableContainerState = this.f593a;
            if (drawableContainerState.f610D) {
                drawable.setColorFilter(drawableContainerState.f609C);
            } else {
                if (drawableContainerState.f613G) {
                    drawable.setTintList(drawableContainerState.f611E);
                }
                DrawableContainerState drawableContainerState2 = this.f593a;
                if (drawableContainerState2.f614H) {
                    drawable.setTintMode(drawableContainerState2.f612F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f593a.f638x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f593a.f608B);
            Rect rect = this.f594b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            BlockInvalidateCallback blockInvalidateCallback2 = this.f604q;
            Drawable.Callback callback = blockInvalidateCallback2.f606a;
            blockInvalidateCallback2.f606a = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            BlockInvalidateCallback blockInvalidateCallback3 = this.f604q;
            Drawable.Callback callback2 = blockInvalidateCallback3.f606a;
            blockInvalidateCallback3.f606a = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f593a.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m407d(int i) {
        if (i == this.f599i) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f593a.f607A > 0) {
            Drawable drawable = this.f596d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f595c;
            if (drawable2 != null) {
                this.f596d = drawable2;
                this.f603p = ((long) this.f593a.f607A) + jUptimeMillis;
            } else {
                this.f596d = null;
                this.f603p = 0L;
            }
        } else {
            Drawable drawable3 = this.f595c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            DrawableContainerState drawableContainerState = this.f593a;
            if (i < drawableContainerState.f622h) {
                Drawable drawableM410c = drawableContainerState.m410c(i);
                this.f595c = drawableM410c;
                this.f599i = i;
                if (drawableM410c != null) {
                    int i2 = this.f593a.f640z;
                    if (i2 > 0) {
                        this.f602o = jUptimeMillis + ((long) i2);
                    }
                    m406c(drawableM410c);
                }
            } else {
                this.f595c = null;
                this.f599i = -1;
            }
        }
        if (this.f602o != 0 || this.f603p != 0) {
            Runnable runnable = this.f601n;
            if (runnable == null) {
                this.f601n = new RunnableC00871((StateListDrawableCompat) this);
            } else {
                unscheduleSelf(runnable);
            }
            m405a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f595c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f596d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo397e(DrawableContainerState drawableContainerState) {
        this.f593a = drawableContainerState;
        int i = this.f599i;
        if (i >= 0) {
            Drawable drawableM410c = drawableContainerState.m410c(i);
            this.f595c = drawableM410c;
            if (drawableM410c != null) {
                m406c(drawableM410c);
            }
        }
        this.f596d = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f597f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f593a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        DrawableContainerState drawableContainerState = this.f593a;
        if (!drawableContainerState.f636v) {
            drawableContainerState.m409b();
            drawableContainerState.f636v = true;
            int i = drawableContainerState.f622h;
            Drawable[] drawableArr = drawableContainerState.f621g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    drawableContainerState.f637w = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    drawableContainerState.f637w = false;
                    z2 = false;
                    break;
                }
                i2++;
            }
        } else {
            z2 = drawableContainerState.f637w;
        }
        if (!z2) {
            return null;
        }
        this.f593a.f618d = getChangingConfigurations();
        return this.f593a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f595c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f594b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState.f626l) {
            if (!drawableContainerState.f627m) {
                drawableContainerState.m408a();
            }
            return drawableContainerState.f629o;
        }
        Drawable drawable = this.f595c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState.f626l) {
            if (!drawableContainerState.f627m) {
                drawableContainerState.m408a();
            }
            return drawableContainerState.f628n;
        }
        Drawable drawable = this.f595c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState.f626l) {
            if (!drawableContainerState.f627m) {
                drawableContainerState.m408a();
            }
            return drawableContainerState.f631q;
        }
        Drawable drawable = this.f595c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState.f626l) {
            if (!drawableContainerState.f627m) {
                drawableContainerState.m408a();
            }
            return drawableContainerState.f630p;
        }
        Drawable drawable = this.f595c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f595c;
        if (drawable != null && drawable.isVisible()) {
            DrawableContainerState drawableContainerState = this.f593a;
            if (drawableContainerState.f632r) {
                return drawableContainerState.f633s;
            }
            drawableContainerState.m409b();
            int i = drawableContainerState.f622h;
            Drawable[] drawableArr = drawableContainerState.f621g;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            drawableContainerState.f633s = opacity;
            drawableContainerState.f632r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f595c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        DrawableContainerState drawableContainerState = this.f593a;
        boolean padding = false;
        Rect rect2 = null;
        if (!drawableContainerState.f623i) {
            Rect rect3 = drawableContainerState.f625k;
            if (rect3 != null || drawableContainerState.f624j) {
                rect2 = rect3;
            } else {
                drawableContainerState.m409b();
                Rect rect4 = new Rect();
                int i = drawableContainerState.f622h;
                Drawable[] drawableArr = drawableContainerState.f621g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                drawableContainerState.f624j = true;
                drawableContainerState.f625k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f595c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f593a.f608B && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState != null) {
            drawableContainerState.f632r = false;
            drawableContainerState.f634t = false;
        }
        if (drawable != this.f595c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f593a.f608B;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState.f634t) {
            return drawableContainerState.f635u;
        }
        drawableContainerState.m409b();
        int i = drawableContainerState.f622h;
        Drawable[] drawableArr = drawableContainerState.f621g;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (drawableArr[i2].isStateful()) {
                z2 = true;
                break;
            }
            i2++;
        }
        drawableContainerState.f635u = z2;
        drawableContainerState.f634t = true;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f596d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f596d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f595c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f598g) {
                this.f595c.setAlpha(this.f597f);
            }
        }
        if (this.f603p != 0) {
            this.f603p = 0L;
            z2 = true;
        }
        if (this.f602o != 0) {
            this.f602o = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f600j && super.mutate() == this) {
            DrawableContainerState drawableContainerStateMo396b = mo396b();
            drawableContainerStateMo396b.mo401d();
            mo397e(drawableContainerStateMo396b);
            this.f600j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f596d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f595c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        DrawableContainerState drawableContainerState = this.f593a;
        int i2 = this.f599i;
        int i3 = drawableContainerState.f622h;
        Drawable[] drawableArr = drawableContainerState.f621g;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z2 = layoutDirection;
                }
            }
        }
        drawableContainerState.f639y = i;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f596d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f595c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f596d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f595c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f595c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f598g && this.f597f == i) {
            return;
        }
        this.f598g = true;
        this.f597f = i;
        Drawable drawable = this.f595c;
        if (drawable != null) {
            if (this.f602o == 0) {
                drawable.setAlpha(i);
            } else {
                m405a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState.f608B != z2) {
            drawableContainerState.f608B = z2;
            Drawable drawable = this.f595c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.f593a;
        drawableContainerState.f610D = true;
        if (drawableContainerState.f609C != colorFilter) {
            drawableContainerState.f609C = colorFilter;
            Drawable drawable = this.f595c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        DrawableContainerState drawableContainerState = this.f593a;
        if (drawableContainerState.f638x != z2) {
            drawableContainerState.f638x = z2;
            Drawable drawable = this.f595c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f595c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f594b;
        if (rect == null) {
            this.f594b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f595c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.f593a;
        drawableContainerState.f613G = true;
        if (drawableContainerState.f611E != colorStateList) {
            drawableContainerState.f611E = colorStateList;
            DrawableCompat.m7607b(this.f595c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.f593a;
        drawableContainerState.f614H = true;
        if (drawableContainerState.f612F != mode) {
            drawableContainerState.f612F = mode;
            DrawableCompat.m7608c(this.f595c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f596d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f595c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f595c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BlockInvalidateCallback implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        public Drawable.Callback f606a;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f606a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f606a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }
    }
}
