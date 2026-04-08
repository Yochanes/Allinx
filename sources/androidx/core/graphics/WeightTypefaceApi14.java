package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
final class WeightTypefaceApi14 {
    static {
        try {
            Typeface.class.getDeclaredField("native_instance").setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
        }
        new LongSparseArray(3);
    }
}
