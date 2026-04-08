package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DeviceQuirks {
    static {
        boolean zContains;
        ArrayList arrayList = new ArrayList();
        String str = Build.BRAND;
        if (("google".equalsIgnoreCase(str) && "redfin".equalsIgnoreCase(Build.DEVICE)) || "motorola".equalsIgnoreCase(str)) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (str.equalsIgnoreCase("SAMSUNG")) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (str.equalsIgnoreCase("SAMSUNG")) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        HashSet hashSet = ImageAnalysisUnavailableQuirk.f3228a;
        Locale locale = Locale.US;
        if (hashSet.contains(Pair.create(str.toLowerCase(locale), Build.DEVICE.toLowerCase(locale)))) {
            arrayList.add(new ImageAnalysisUnavailableQuirk());
        }
        HashSet hashSet2 = ExtraSupportedSurfaceCombinationsQuirk.f3227a;
        if ("samsung".equalsIgnoreCase(str)) {
            zContains = ExtraSupportedSurfaceCombinationsQuirk.f3227a.contains(Build.MODEL.toUpperCase(locale));
        } else {
            zContains = false;
        }
        if (zContains) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        new Quirks(arrayList);
    }
}
