package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {

    /* JADX INFO: renamed from: i */
    public static final PorterDuff.Mode f23239i = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f23240a;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f23241b;

    /* JADX INFO: renamed from: c */
    public boolean f23242c;

    /* JADX INFO: renamed from: d */
    public WrappedDrawableState f23243d;

    /* JADX INFO: renamed from: f */
    public boolean f23244f;

    /* JADX INFO: renamed from: g */
    public Drawable f23245g;

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    /* JADX INFO: renamed from: a */
    public final void mo7626a(Drawable drawable) {
        Drawable drawable2 = this.f23245g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23245g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.f23243d;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.f23248b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    /* JADX INFO: renamed from: b */
    public final Drawable mo7627b() {
        return this.f23245g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7628c(int[] iArr) {
        if (this instanceof WrappedDrawableApi21) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.f23243d;
        ColorStateList colorStateList = wrappedDrawableState.f23249c;
        PorterDuff.Mode mode = wrappedDrawableState.f23250d;
        if (colorStateList == null || mode == null) {
            this.f23242c = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f23242c && colorForState == this.f23240a && mode == this.f23241b) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f23240a = colorForState;
        this.f23241b = mode;
        this.f23242c = true;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f23245g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.f23243d;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.f23245g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.f23243d;
        if (wrappedDrawableState == null || wrappedDrawableState.f23248b == null) {
            return null;
        }
        wrappedDrawableState.f23247a = getChangingConfigurations();
        return this.f23243d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f23245g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f23245g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f23245g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return this.f23245g.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f23245g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f23245g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f23245g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f23245g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f23245g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f23245g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f23245g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        WrappedDrawableState wrappedDrawableState;
        ColorStateList colorStateList = ((this instanceof WrappedDrawableApi21) || (wrappedDrawableState = this.f23243d) == null) ? null : wrappedDrawableState.f23249c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f23245g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f23245g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f23244f && super.mutate() == this) {
            WrappedDrawableState wrappedDrawableState = this.f23243d;
            WrappedDrawableState wrappedDrawableState2 = new WrappedDrawableState();
            wrappedDrawableState2.f23249c = null;
            wrappedDrawableState2.f23250d = f23239i;
            if (wrappedDrawableState != null) {
                wrappedDrawableState2.f23247a = wrappedDrawableState.f23247a;
                wrappedDrawableState2.f23248b = wrappedDrawableState.f23248b;
                wrappedDrawableState2.f23249c = wrappedDrawableState.f23249c;
                wrappedDrawableState2.f23250d = wrappedDrawableState.f23250d;
            }
            this.f23243d = wrappedDrawableState2;
            Drawable drawable = this.f23245g;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState3 = this.f23243d;
            if (wrappedDrawableState3 != null) {
                Drawable drawable2 = this.f23245g;
                wrappedDrawableState3.f23248b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f23244f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23245g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return this.f23245g.setLayoutDirection(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f23245g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f23245g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f23245g.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f23245g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23245g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f23245g.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f23245g.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m7628c(iArr) || this.f23245g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f23243d.f23249c = colorStateList;
        m7628c(this.f23245g.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f23243d.f23250d = mode;
        m7628c(this.f23245g.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f23245g.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
