package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo
final class WeightTypefaceApi26 {
    static {
        try {
            Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE).setAccessible(true);
            Typeface.class.getDeclaredConstructor(cls).setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
        }
        new LongSparseArray(3);
    }
}
