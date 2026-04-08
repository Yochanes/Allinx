package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class BlendModeColorFilterCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static ColorFilter m7550a(Object obj) {
            return new BlendModeColorFilter(0, (BlendMode) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorFilter m7549a() {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objM7551a = BlendModeUtils.Api29Impl.m7551a();
            if (objM7551a != null) {
                return Api29Impl.m7550a(objM7551a);
            }
            return null;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        if (mode != null) {
            return new PorterDuffColorFilter(0, mode);
        }
        return null;
    }
}
