package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ViewUtils {

    /* JADX INFO: renamed from: a */
    public static final ViewUtilsApi23 f32294a;

    /* JADX INFO: renamed from: b */
    public static final Property f32295b;

    /* JADX INFO: renamed from: c */
    public static final Property f32296c;

    /* JADX INFO: renamed from: androidx.transition.ViewUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22301 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(ViewUtils.f32294a.mo12008a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            ViewUtils.f32294a.mo12009b(view, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ViewUtils$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C22312 extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f32294a = new ViewUtilsApi29();
        } else {
            f32294a = new ViewUtilsApi23();
        }
        f32295b = new C22301(Float.class, "translationAlpha");
        f32296c = new C22312(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static void m12006a(View view, int i, int i2, int i3, int i4) {
        f32294a.mo12019g(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static void m12007b(View view, int i) {
        f32294a.mo12010c(view, i);
    }
}
