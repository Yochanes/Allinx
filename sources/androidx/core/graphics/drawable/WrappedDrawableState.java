package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WrappedDrawableState extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f23247a;

    /* JADX INFO: renamed from: b */
    public Drawable.ConstantState f23248b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f23249c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f23250d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f23247a;
        Drawable.ConstantState constantState = this.f23248b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        WrappedDrawableApi21 wrappedDrawableApi21 = new WrappedDrawableApi21();
        wrappedDrawableApi21.f23243d = this;
        Drawable.ConstantState constantState = this.f23248b;
        if (constantState != null) {
            wrappedDrawableApi21.mo7626a(constantState.newDrawable(resources));
        }
        if (WrappedDrawableApi21.f23246j == null) {
            try {
                WrappedDrawableApi21.f23246j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
                return wrappedDrawableApi21;
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
        return wrappedDrawableApi21;
    }
}
