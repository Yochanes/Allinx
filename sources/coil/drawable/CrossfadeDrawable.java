package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import com.google.android.material.snackbar.AbstractC3999a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lcoil/drawable/CrossfadeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable2Compat {

    /* JADX INFO: renamed from: a */
    public final Scale f33583a;

    /* JADX INFO: renamed from: b */
    public final int f33584b;

    /* JADX INFO: renamed from: c */
    public final boolean f33585c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f33586d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final int f33587f;

    /* JADX INFO: renamed from: g */
    public final int f33588g;

    /* JADX INFO: renamed from: i */
    public long f33589i;

    /* JADX INFO: renamed from: j */
    public int f33590j;

    /* JADX INFO: renamed from: n */
    public int f33591n;

    /* JADX INFO: renamed from: o */
    public Drawable f33592o;

    /* JADX INFO: renamed from: p */
    public final Drawable f33593p;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m18302d2 = {"Lcoil/drawable/CrossfadeDrawable$Companion;", "", "", "STATE_START", "I", "STATE_RUNNING", "STATE_DONE", "DEFAULT_DURATION", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale, int i, boolean z2) {
        this.f33583a = scale;
        this.f33584b = i;
        this.f33585c = z2;
        this.f33587f = m12452a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f33588g = m12452a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f33590j = 255;
        this.f33592o = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f33593p = drawableMutate;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.f33592o;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m12452a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    /* JADX INFO: renamed from: b */
    public final void m12453b() {
        this.f33591n = 2;
        this.f33592o = null;
        ArrayList arrayList = this.f33586d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationEnd(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12454c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM12416a = DecodeUtils.m12416a(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f33583a);
        double d = 2;
        int iM18639a = MathKt.m18639a((((double) iWidth) - (((double) intrinsicWidth) * dM12416a)) / d);
        int iM18639a2 = MathKt.m18639a((((double) iHeight) - (dM12416a * ((double) intrinsicHeight))) / d);
        drawable.setBounds(rect.left + iM18639a, rect.top + iM18639a2, rect.right - iM18639a, rect.bottom - iM18639a2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i = this.f33591n;
        if (i == 0) {
            Drawable drawable2 = this.f33592o;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f33590j);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f33593p;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f33590j);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f33589i) / ((double) this.f33584b);
        double dM18654a = RangesKt.m18654a(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.f33590j;
        int i3 = (int) (dM18654a * ((double) i2));
        if (this.f33585c) {
            i2 -= i3;
        }
        boolean z2 = dUptimeMillis >= 1.0d;
        if (!z2 && (drawable = this.f33592o) != null) {
            drawable.setAlpha(i2);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i3);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z2) {
            m12453b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f33590j;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.f33591n;
        if (i == 0) {
            Drawable drawable = this.f33592o;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f33593p;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f33592o;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f33588g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f33587f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f33592o;
        int i = this.f33591n;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f33593p;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f33591n == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33592o;
        if (drawable != null) {
            m12454c(drawable, rect);
        }
        Drawable drawable2 = this.f33593p;
        if (drawable2 != null) {
            m12454c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f33592o;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f33593p;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f33592o;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f33593p;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid alpha: ").toString());
        }
        this.f33590j = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33592o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f33593p;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f33592o;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f33593p;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f33592o;
        if (drawable != null) {
            AbstractC3999a.m14728h(drawable, blendMode);
        }
        Drawable drawable2 = this.f33593p;
        if (drawable2 != null) {
            AbstractC3999a.m14728h(drawable2, blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f33592o;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f33593p;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f33592o;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f33593p;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f33592o;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f33593p;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f33591n != 0) {
            return;
        }
        this.f33591n = 1;
        this.f33589i = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f33586d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f33592o;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f33593p;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f33591n != 2) {
            m12453b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
