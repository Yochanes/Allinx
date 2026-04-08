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
final class WeightTypefaceApi21 {
    static {
        try {
            Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2).setAccessible(true);
            Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2).setAccessible(true);
            Typeface.class.getDeclaredConstructor(cls).setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
        }
        new LongSparseArray(3);
    }
}
