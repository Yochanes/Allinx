package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SurfaceCombination;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DeviceQuirks {

    /* JADX INFO: renamed from: a */
    public static final Quirks f2048a;

    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b  */
    static {
        ArrayList arrayList = new ArrayList();
        List list = ImageCapturePixelHDRPlusQuirk.f2061a;
        String str = Build.MODEL;
        if (list.contains(str) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (ExtraCroppingQuirk.m1157e()) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        List list2 = Nexus4AndroidLTargetAspectRatioQuirk.f2066a;
        String str2 = Build.BRAND;
        "GOOGLE".equalsIgnoreCase(str2);
        if (("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) || (("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) || (("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) || ExcludedSupportedSizesQuirk.m1155e() || ExcludedSupportedSizesQuirk.m1154d() || ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE))))) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        List list3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f2047a;
        Locale locale = Locale.US;
        if (CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f2047a.contains(str.toUpperCase(locale))) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        List list4 = PreviewPixelHDRnetQuirk.f2067a;
        String str3 = Build.MANUFACTURER;
        if ("Google".equals(str3)) {
            if (PreviewPixelHDRnetQuirk.f2067a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
                arrayList.add(new PreviewPixelHDRnetQuirk());
            }
        }
        if ("SAMSUNG".equals(str3.toUpperCase(locale)) && str.toUpperCase(locale).startsWith("SM-A716")) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        SurfaceCombination surfaceCombination = ExtraSupportedSurfaceCombinationsQuirk.f2051a;
        String str4 = Build.DEVICE;
        boolean z2 = false;
        if ("heroqltevzw".equalsIgnoreCase(str4) || "heroqltetmo".equalsIgnoreCase(str4)) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        } else {
            if (!(!"samsung".equalsIgnoreCase(str2) ? false : ExtraSupportedSurfaceCombinationsQuirk.f2054d.contains(str.toUpperCase(locale)))) {
                if (!"google".equalsIgnoreCase(str2) ? false : ExtraSupportedSurfaceCombinationsQuirk.f2055e.contains(str.toUpperCase(locale))) {
                }
            }
        }
        if (FlashAvailabilityBufferUnderflowQuirk.f2056a.contains(new Pair(str3.toLowerCase(locale), str.toLowerCase(locale)))) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if ("Huawei".equalsIgnoreCase(str2) && "mha-l29".equalsIgnoreCase(str)) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        List list5 = TorchIsClosedAfterImageCapturingQuirk.f2069a;
        if (TorchIsClosedAfterImageCapturingQuirk.f2069a.contains(str.toLowerCase(locale))) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (("samsung".equalsIgnoreCase(str2) && str.toUpperCase(locale).startsWith("SM-F936")) || (MTPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(str2) && str.toUpperCase(locale).startsWith("MI 8"))) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if ("motorola".equalsIgnoreCase(str2) && "moto e5 play".equalsIgnoreCase(str)) {
            z2 = true;
        }
        if (z2) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        List list6 = InvalidVideoProfilesQuirk.f2064a;
        if (!"samsung".equalsIgnoreCase(str2) || !Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a")) {
            Locale locale2 = Locale.ROOT;
            if (InvalidVideoProfilesQuirk.f2064a.contains(str.toLowerCase(locale2))) {
                String str5 = Build.ID;
                if (str5.toLowerCase(locale2).startsWith("tp1a") || str5.toLowerCase(locale2).startsWith("td1a")) {
                    arrayList.add(new InvalidVideoProfilesQuirk());
                }
            }
        }
        if (SmallDisplaySizeQuirk.f2068a.containsKey(str.toUpperCase(locale))) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        f2048a = new Quirks(arrayList);
    }
}
