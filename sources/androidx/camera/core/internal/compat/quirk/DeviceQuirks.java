package androidx.camera.core.internal.compat.quirk;

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

    /* JADX INFO: renamed from: a */
    public static final Quirks f2999a;

    static {
        ArrayList arrayList = new ArrayList();
        String str = Build.BRAND;
        if (("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        } else {
            String str2 = Build.FINGERPRINT;
            if (!str2.startsWith("generic") && !str2.startsWith("unknown")) {
                String str3 = Build.MODEL;
                if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Cuttlefish") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                    Build.HARDWARE.contains("ranchu");
                }
            }
        }
        arrayList.add(new SurfaceOrderQuirk());
        HashSet hashSet = CaptureFailedRetryQuirk.f2998a;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        String str4 = Build.MODEL;
        if (CaptureFailedRetryQuirk.f2998a.contains(Pair.create(upperCase, str4.toUpperCase(locale)))) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (LowMemoryQuirk.f3002a.contains(str4.toUpperCase(locale))) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (LargeJpegImageQuirk.f3001a.contains(str4.toUpperCase(locale))) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        HashSet hashSet2 = IncorrectJpegMetadataQuirk.f3000a;
        if ("Samsung".equalsIgnoreCase(str) && IncorrectJpegMetadataQuirk.f3000a.contains(Build.DEVICE.toUpperCase(locale))) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        f2999a = new Quirks(arrayList);
    }
}
