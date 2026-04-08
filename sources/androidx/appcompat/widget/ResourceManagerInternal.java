package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SparseArrayCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.exchange.allin.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class ResourceManagerInternal {

    /* JADX INFO: renamed from: g */
    public static ResourceManagerInternal f1342g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f1344a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f1345b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f1346c;

    /* JADX INFO: renamed from: d */
    public boolean f1347d;

    /* JADX INFO: renamed from: e */
    public ResourceManagerHooks f1348e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f1341f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final ColorFilterLruCache f1343h = new ColorFilterLruCache(6);

    /* JADX INFO: compiled from: Proguard */
    public static class AsldcInflateDelegate implements InflateDelegate {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AvdcInflateDelegate implements InflateDelegate {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DrawableDelegate implements InflateDelegate {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface InflateDelegate {
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface ResourceManagerHooks {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class VdcInflateDelegate implements InflateDelegate {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized ResourceManagerInternal m673b() {
        try {
            if (f1342g == null) {
                f1342g = new ResourceManagerInternal();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1342g;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized PorterDuffColorFilter m674f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ColorFilterLruCache colorFilterLruCache = f1343h;
        colorFilterLruCache.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = colorFilterLruCache.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            colorFilterLruCache.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m675a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray longSparseArray = (LongSparseArray) this.f1345b.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray((Object) null);
                    this.f1345b.put(context, longSparseArray);
                }
                longSparseArray.m2005h(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m676c(long j, Context context) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f1345b.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) longSparseArray.m2001c(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.m2006i(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m677d(Context context, int i) {
        return m678e(context, i, false);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m678e(Context context, int i, boolean z2) {
        Drawable drawableM676c;
        try {
            if (!this.f1347d) {
                this.f1347d = true;
                Drawable drawableM677d = m677d(context, R.drawable.abc_vector_test);
                if (drawableM677d == null || (!(drawableM677d instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawableM677d.getClass().getName()))) {
                    this.f1347d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.f1346c == null) {
                this.f1346c = new TypedValue();
            }
            TypedValue typedValue = this.f1346c;
            context.getResources().getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            drawableM676c = m676c(j, context);
            if (drawableM676c == null) {
                LayerDrawable layerDrawableM547c = null;
                if (this.f1348e != null) {
                    if (i == R.drawable.abc_cab_background_top_material) {
                        layerDrawableM547c = new LayerDrawable(new Drawable[]{m677d(context, R.drawable.abc_cab_background_internal_bg), m677d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                    } else if (i == R.drawable.abc_ratingbar_material) {
                        layerDrawableM547c = AppCompatDrawableManager.C01091.m547c(this, context, R.dimen.abc_star_big);
                    } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                        layerDrawableM547c = AppCompatDrawableManager.C01091.m547c(this, context, R.dimen.abc_star_medium);
                    } else if (i == R.drawable.abc_ratingbar_small_material) {
                        layerDrawableM547c = AppCompatDrawableManager.C01091.m547c(this, context, R.dimen.abc_star_small);
                    }
                }
                drawableM676c = layerDrawableM547c;
                if (drawableM676c != null) {
                    drawableM676c.setChangingConfigurations(typedValue.changingConfigurations);
                    m675a(context, j, drawableM676c);
                }
            }
            if (drawableM676c == null) {
                drawableM676c = context.getDrawable(i);
            }
            if (drawableM676c != null) {
                drawableM676c = m680h(context, i, z2, drawableM676c);
            }
            if (drawableM676c != null) {
                DrawableUtils.m647a(drawableM676c);
            }
        } finally {
        }
        return drawableM676c;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized ColorStateList m679g(Context context, int i) {
        ColorStateList colorStateList;
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f1344a;
        ColorStateList colorStateListM549d = null;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) sparseArrayCompat.m2134c(i);
        if (colorStateList == null) {
            ResourceManagerHooks resourceManagerHooks = this.f1348e;
            if (resourceManagerHooks != null) {
                colorStateListM549d = ((AppCompatDrawableManager.C01091) resourceManagerHooks).m549d(context, i);
            }
            if (colorStateListM549d != null) {
                if (this.f1344a == null) {
                    this.f1344a = new WeakHashMap();
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) this.f1344a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat(0);
                    this.f1344a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.m2132a(i, colorStateListM549d);
            }
            colorStateList = colorStateListM549d;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m680h(Context context, int i, boolean z2, Drawable drawable) {
        int iRound;
        ColorStateList colorStateListM679g = m679g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM679g != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM679g);
            if (this.f1348e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        ResourceManagerHooks resourceManagerHooks = this.f1348e;
        int i2 = R.attr.colorControlNormal;
        if (resourceManagerHooks != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM699c = ThemeUtils.m699c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = AppCompatDrawableManager.f1103b;
                AppCompatDrawableManager.C01091.m548e(drawableFindDrawableByLayerId, iM699c, mode2);
                AppCompatDrawableManager.C01091.m548e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.m699c(context, R.attr.colorControlNormal), mode2);
                AppCompatDrawableManager.C01091.m548e(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.m699c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM698b = ThemeUtils.m698b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = AppCompatDrawableManager.f1103b;
                AppCompatDrawableManager.C01091.m548e(drawableFindDrawableByLayerId2, iM698b, mode3);
                AppCompatDrawableManager.C01091.m548e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.m699c(context, R.attr.colorControlActivated), mode3);
                AppCompatDrawableManager.C01091.m548e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.m699c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (resourceManagerHooks != null) {
            AppCompatDrawableManager.C01091 c01091 = (AppCompatDrawableManager.C01091) resourceManagerHooks;
            PorterDuff.Mode mode4 = AppCompatDrawableManager.f1103b;
            boolean z3 = true;
            if (AppCompatDrawableManager.C01091.m545a(i, c01091.f1106a)) {
                iRound = -1;
                if (z3) {
                }
            } else {
                if (AppCompatDrawableManager.C01091.m545a(i, c01091.f1108c)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zM545a = AppCompatDrawableManager.C01091.m545a(i, c01091.f1109d);
                    i2 = android.R.attr.colorBackground;
                    if (zM545a) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        if (z3) {
                            Drawable drawableMutate2 = drawable.mutate();
                            drawableMutate2.setColorFilter(AppCompatDrawableManager.m541c(ThemeUtils.m699c(context, i2), mode4));
                            if (iRound != -1) {
                                drawableMutate2.setAlpha(iRound);
                                return drawable;
                            }
                        } else if (z2) {
                            return null;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z3 = false;
                    }
                }
                iRound = -1;
                if (z3) {
                }
            }
        }
        return drawable;
    }
}
