package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ExtraCroppingQuirk implements Quirk {

    /* JADX INFO: renamed from: a */
    public static final HashMap f2049a;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C02001 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2050a;

        static {
            int[] iArr = new int[SurfaceConfig.ConfigType.values().length];
            f2050a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2050a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2050a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f2049a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    /* JADX INFO: renamed from: d */
    public static Size m1156d(SurfaceConfig.ConfigType configType) {
        if (!m1157e()) {
            return null;
        }
        int iOrdinal = configType.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1157e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        HashMap map = f2049a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
