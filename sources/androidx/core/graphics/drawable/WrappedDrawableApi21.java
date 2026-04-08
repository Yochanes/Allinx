package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class WrappedDrawableApi21 extends WrappedDrawableApi14 {

    /* JADX INFO: renamed from: j */
    public static Method f23246j;

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f23245g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f23245g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f23245g;
        if (drawable != null && (method = f23246j) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f23245g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f23245g.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f23245g.setTint(i);
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f23245g.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f23245g.setTintMode(mode);
    }
}
