package androidx.constraintlayout.core.motion.utils;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class KeyCache {

    /* JADX INFO: renamed from: a */
    public final HashMap f21426a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final float m6904a(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = this.f21426a;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
