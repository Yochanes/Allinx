package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ObjectAnimatorUtils {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static <T, V> ObjectAnimator m11974a(T t, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
    }
}
