package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class FloatPropertyCompat<T> {
    final String mPropertyName;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.FloatPropertyCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16321 extends FloatPropertyCompat<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FloatProperty f24260a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16321(String str, FloatProperty floatProperty) {
            super(str);
            this.f24260a = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((Float) this.f24260a.get(obj)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            this.f24260a.setValue(obj, f);
        }
    }

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }

    @RequiresApi
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new C16321(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f);
}
