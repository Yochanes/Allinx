package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.AbstractC0157C;
import androidx.camera.core.impl.Quirks;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DeviceQuirks {

    /* JADX INFO: renamed from: a */
    public static final Quirks f3417a;

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    static {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        List list = MediaCodecInfoReportIncorrectInfoQuirk.f3419a;
        String str3 = Build.BRAND;
        if ((!"Nokia".equalsIgnoreCase(str3) || !"Nokia 1".equalsIgnoreCase(Build.MODEL)) && ((!"motorola".equalsIgnoreCase(str3) || !"moto c".equalsIgnoreCase(Build.MODEL)) && ((!"infinix".equalsIgnoreCase(str3) || !"infinix x650".equalsIgnoreCase(Build.MODEL)) && ((!"LGE".equalsIgnoreCase(str3) || !"LG-X230".equalsIgnoreCase(Build.MODEL)) && ((!"Huawei".equalsIgnoreCase(str3) || !"mha-l29".equalsIgnoreCase(Build.MODEL)) && ((!"Redmi".equalsIgnoreCase(str3) || !"Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) && (!"positivo".equalsIgnoreCase(str3) || !"twist 2 pro".equalsIgnoreCase(Build.MODEL)))))))) {
            if (MediaCodecInfoReportIncorrectInfoQuirk.f3419a.contains(Build.MODEL.toLowerCase(Locale.US))) {
                arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            if (CameraUseInconsistentTimebaseQuirk.f3415b.contains(AbstractC0157C.m856s().toLowerCase())) {
                arrayList.add(new CameraUseInconsistentTimebaseQuirk());
            }
            if (!ReportedVideoQualityNotSupportedQuirk.m1876d() || ReportedVideoQualityNotSupportedQuirk.m1877e() || (("Vivo".equalsIgnoreCase(str3) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ReportedVideoQualityNotSupportedQuirk.m1878f())) {
                arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
            }
            List list2 = EncoderNotUsePersistentInputSurfaceQuirk.f3418a;
            str = Build.MODEL;
            if (EncoderNotUsePersistentInputSurfaceQuirk.f3418a.contains(str.toUpperCase())) {
                arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
            }
            if ("positivo".equalsIgnoreCase(str3) && "twist 2 pro".equalsIgnoreCase(str)) {
                arrayList.add(new VideoEncoderCrashQuirk());
            }
            if (("Samsung".equalsIgnoreCase(str3) && "SM-J400G".equalsIgnoreCase(str)) || ExcludeStretchedVideoQualityQuirk.m1874e() || ExcludeStretchedVideoQualityQuirk.m1873d()) {
                arrayList.add(new ExcludeStretchedVideoQualityQuirk());
            }
            if (("positivo".equalsIgnoreCase(str3) && "twist 2 pro".equalsIgnoreCase(str)) || ("itel".equalsIgnoreCase(str3) && "itel w6004".equalsIgnoreCase(str))) {
                arrayList.add(new MediaStoreVideoCannotWrite());
            }
            if ("Sony".equalsIgnoreCase(str3) && "G3125".equalsIgnoreCase(str)) {
                arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
            }
            if ("Samsung".equalsIgnoreCase(str3) && i < 29) {
                arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
            }
            if (i < 34) {
                arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
            }
            str2 = Build.MANUFACTURER;
            if (("HUAWEI".equalsIgnoreCase(str2) && "HUAWEI ALE-L04".equalsIgnoreCase(str)) || (("Samsung".equalsIgnoreCase(str2) && "sm-j320f".equalsIgnoreCase(str)) || (("Samsung".equalsIgnoreCase(str2) && "sm-j700f".equalsIgnoreCase(str)) || (("Samsung".equalsIgnoreCase(str2) && "sm-j111f".equalsIgnoreCase(str)) || (("OPPO".equalsIgnoreCase(str2) && "A37F".equalsIgnoreCase(str)) || ("Samsung".equalsIgnoreCase(str2) && "sm-j510fn".equalsIgnoreCase(str))))))) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            HashSet hashSet = PreviewDelayWhenVideoCaptureIsBoundQuirk.f3420a;
            if ("Huawei".equalsIgnoreCase(str2)) {
                HashSet hashSet2 = PreviewDelayWhenVideoCaptureIsBoundQuirk.f3420a;
                String str4 = Build.DEVICE;
                Locale locale = Locale.US;
                if (hashSet2.contains(str4.toUpperCase(locale)) || PreviewDelayWhenVideoCaptureIsBoundQuirk.f3421b.contains(str.toUpperCase(locale))) {
                    arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
                }
            }
            if ("Xiaomi".equalsIgnoreCase(str3) && "Redmi 6A".equalsIgnoreCase(str)) {
                arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
            }
            if (("blu".equalsIgnoreCase(str3) && "studio x10".equalsIgnoreCase(str)) || (("itel".equalsIgnoreCase(str3) && "itel w6004".equalsIgnoreCase(str)) || ((MTPushConstants.Manufacturer.VIVO.equalsIgnoreCase(str3) && "vivo 1805".equalsIgnoreCase(str)) || ("positivo".equalsIgnoreCase(str3) && "twist 2 pro".equalsIgnoreCase(str))))) {
                arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
            }
            if ("motorola".equalsIgnoreCase(str3) && "moto e5 play".equalsIgnoreCase(str)) {
                arrayList.add(new ExtraSupportedResolutionQuirk());
            }
            f3417a = new Quirks(arrayList);
        }
        HashSet hashSet3 = CameraUseInconsistentTimebaseQuirk.f3414a;
        if (("SAMSUNG".equalsIgnoreCase(str3) && CameraUseInconsistentTimebaseQuirk.f3414a.contains(Build.HARDWARE.toLowerCase())) || CameraUseInconsistentTimebaseQuirk.f3416c.contains(Build.MODEL.toLowerCase())) {
        }
        if (!ReportedVideoQualityNotSupportedQuirk.m1876d()) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        List list22 = EncoderNotUsePersistentInputSurfaceQuirk.f3418a;
        str = Build.MODEL;
        if (EncoderNotUsePersistentInputSurfaceQuirk.f3418a.contains(str.toUpperCase())) {
        }
        if ("positivo".equalsIgnoreCase(str3)) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if ("Samsung".equalsIgnoreCase(str3)) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        } else {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if ("positivo".equalsIgnoreCase(str3)) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        } else {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if ("Sony".equalsIgnoreCase(str3)) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if ("Samsung".equalsIgnoreCase(str3)) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (i < 34) {
        }
        str2 = Build.MANUFACTURER;
        if ("HUAWEI".equalsIgnoreCase(str2)) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        } else {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        HashSet hashSet4 = PreviewDelayWhenVideoCaptureIsBoundQuirk.f3420a;
        if ("Huawei".equalsIgnoreCase(str2)) {
        }
        if ("Xiaomi".equalsIgnoreCase(str3)) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if ("blu".equalsIgnoreCase(str3)) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        } else {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if ("motorola".equalsIgnoreCase(str3)) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        f3417a = new Quirks(arrayList);
    }
}
