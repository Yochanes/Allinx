package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class AppCompatDrawableManager {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f1103b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static AppCompatDrawableManager f1104c;

    /* JADX INFO: renamed from: a */
    public ResourceManagerInternal f1105a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatDrawableManager$1 */
    /* JADX INFO: compiled from: Proguard */
    class C01091 implements ResourceManagerInternal.ResourceManagerHooks {

        /* JADX INFO: renamed from: a */
        public final int[] f1106a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b */
        public final int[] f1107b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c */
        public final int[] f1108c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: d */
        public final int[] f1109d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e */
        public final int[] f1110e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f */
        public final int[] f1111f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        /* JADX INFO: renamed from: a */
        public static boolean m545a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m546b(Context context, int i) {
            int iM699c = ThemeUtils.m699c(context, R.attr.colorControlHighlight);
            int iM698b = ThemeUtils.m698b(context, R.attr.colorButtonNormal);
            int[] iArr = ThemeUtils.f1401b;
            int[] iArr2 = ThemeUtils.f1403d;
            int iM7557f = ColorUtils.m7557f(iM699c, i);
            return new ColorStateList(new int[][]{iArr, iArr2, ThemeUtils.f1402c, ThemeUtils.f1405f}, new int[]{iM698b, iM7557f, ColorUtils.m7557f(iM699c, i), i});
        }

        /* JADX INFO: renamed from: c */
        public static LayerDrawable m547c(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableM677d = resourceManagerInternal.m677d(context, R.drawable.abc_star_black_48dp);
            Drawable drawableM677d2 = resourceManagerInternal.m677d(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableM677d instanceof BitmapDrawable) && drawableM677d.getIntrinsicWidth() == dimensionPixelSize && drawableM677d.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM677d;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM677d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM677d.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM677d2 instanceof BitmapDrawable) && drawableM677d2.getIntrinsicWidth() == dimensionPixelSize && drawableM677d2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM677d2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM677d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM677d2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: e */
        public static void m548e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = AppCompatDrawableManager.f1103b;
            }
            drawableMutate.setColorFilter(AppCompatDrawableManager.m541c(i, mode));
        }

        /* JADX INFO: renamed from: d */
        public final ColorStateList m549d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return ContextCompat.m7485b(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return ContextCompat.m7485b(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return m546b(context, ThemeUtils.m699c(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return m546b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return m546b(context, ThemeUtils.m699c(context, R.attr.colorAccent));
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    return ContextCompat.m7485b(context, R.color.abc_tint_spinner);
                }
                if (m545a(i, this.f1107b)) {
                    return ThemeUtils.m700d(context, R.attr.colorControlNormal);
                }
                if (m545a(i, this.f1110e)) {
                    return ContextCompat.m7485b(context, R.color.abc_tint_default);
                }
                if (m545a(i, this.f1111f)) {
                    return ContextCompat.m7485b(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return ContextCompat.m7485b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListM700d = ThemeUtils.m700d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListM700d == null || !colorStateListM700d.isStateful()) {
                iArr[0] = ThemeUtils.f1401b;
                iArr2[0] = ThemeUtils.m698b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = ThemeUtils.f1404e;
                iArr2[1] = ThemeUtils.m699c(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.f1405f;
                iArr2[2] = ThemeUtils.m699c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = ThemeUtils.f1401b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM700d.getColorForState(iArr3, 0);
                iArr[1] = ThemeUtils.f1404e;
                iArr2[1] = ThemeUtils.m699c(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.f1405f;
                iArr2[2] = colorStateListM700d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized AppCompatDrawableManager m540a() {
        try {
            if (f1104c == null) {
                m542d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1104c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m541c(int i, PorterDuff.Mode mode) {
        return ResourceManagerInternal.m674f(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m542d() {
        if (f1104c == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            f1104c = appCompatDrawableManager;
            appCompatDrawableManager.f1105a = ResourceManagerInternal.m673b();
            ResourceManagerInternal resourceManagerInternal = f1104c.f1105a;
            C01091 c01091 = new C01091();
            synchronized (resourceManagerInternal) {
                resourceManagerInternal.f1348e = c01091;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m543e(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f1341f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = tintInfo.f1411d;
        if (!z2 && !tintInfo.f1410c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM674f = null;
        ColorStateList colorStateList = z2 ? tintInfo.f1408a : null;
        PorterDuff.Mode mode2 = tintInfo.f1410c ? tintInfo.f1409b : ResourceManagerInternal.f1341f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM674f = ResourceManagerInternal.m674f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM674f);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m544b(Context context, int i) {
        return this.f1105a.m677d(context, i);
    }
}
