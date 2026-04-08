package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirks;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DeviceQuirks {

    /* JADX INFO: renamed from: a */
    public static final Quirks f3596a;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    static {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 33) {
            String str = Build.MANUFACTURER;
            if ("SAMSUNG".equalsIgnoreCase(str)) {
                String str2 = Build.DEVICE;
                if ("F2Q".equalsIgnoreCase(str2) || "Q2Q".equalsIgnoreCase(str2)) {
                    arrayList.add(new SurfaceViewStretchedQuirk());
                } else if (("OPPO".equalsIgnoreCase(str) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) || ("LENOVO".equalsIgnoreCase(str) && "Q706F".equalsIgnoreCase(Build.DEVICE))) {
                }
            }
        }
        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        f3596a = new Quirks(arrayList);
    }
}
