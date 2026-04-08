package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import androidx.camera.core.Logger;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class StreamConfigurationMapCompat {

    /* JADX INFO: renamed from: a */
    public final StreamConfigurationMapCompatApi23Impl f1975a;

    /* JADX INFO: renamed from: b */
    public final OutputSizesCorrector f1976b;

    /* JADX INFO: renamed from: c */
    public final HashMap f1977c = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    public interface StreamConfigurationMapCompatImpl {
    }

    public StreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        new HashMap();
        new HashMap();
        this.f1975a = new StreamConfigurationMapCompatApi23Impl(streamConfigurationMap);
        this.f1976b = outputSizesCorrector;
    }

    /* JADX INFO: renamed from: a */
    public final Size[] m1103a(int i) {
        List arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashMap map = this.f1977c;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = this.f1975a.f1978a.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            Logger.m1288i("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return outputSizes;
        }
        OutputSizesCorrector outputSizesCorrector = this.f1976b;
        outputSizesCorrector.getClass();
        ArrayList arrayList4 = new ArrayList(Arrays.asList(outputSizes));
        if (outputSizesCorrector.f2082a != null) {
            Size[] sizeArr = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(1280, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList4.addAll(Arrays.asList(sizeArr));
            }
        }
        ExcludedSupportedSizesContainer excludedSupportedSizesContainer = outputSizesCorrector.f2083b;
        excludedSupportedSizesContainer.getClass();
        if (((ExcludedSupportedSizesQuirk) DeviceQuirks.f2048a.m1514b(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList = new ArrayList();
        } else {
            String str = Build.BRAND;
            boolean z2 = "OnePlus".equalsIgnoreCase(str) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
            String str2 = excludedSupportedSizesContainer.f2074a;
            if (z2) {
                arrayList3 = new ArrayList();
                if (str2.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(com.king.logx.logger.Logger.MAX_LOG_LENGTH, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str2.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(com.king.logx.logger.Logger.MAX_LOG_LENGTH, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList2 = new ArrayList();
                    if (str2.equals("0") && (i == 34 || i == 35)) {
                        arrayList2.add(new Size(720, 720));
                        arrayList2.add(new Size(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, CarouselScreenFragment.CAROUSEL_ANIMATION_MS));
                    }
                } else if (ExcludedSupportedSizesQuirk.m1155e()) {
                    arrayList3 = new ArrayList();
                    if (str2.equals("0")) {
                        if (i == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str2.equals("1") && (i == 34 || i == 35)) {
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(2448, 2448));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if (ExcludedSupportedSizesQuirk.m1154d()) {
                    arrayList3 = new ArrayList();
                    if (str2.equals("0")) {
                        if (i == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str2.equals("1") && (i == 34 || i == 35)) {
                        arrayList3.add(new Size(2576, 1932));
                        arrayList3.add(new Size(2560, 1440));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList2 = new ArrayList();
                    if (str2.equals("0") && i == 256) {
                        arrayList2.add(new Size(9280, 6944));
                    }
                } else {
                    Logger.m1288i("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    arrayList = Collections.EMPTY_LIST;
                }
                arrayList = arrayList2;
            }
            arrayList = arrayList3;
        }
        if (!arrayList.isEmpty()) {
            arrayList4.removeAll(arrayList);
        }
        if (arrayList4.isEmpty()) {
            Logger.m1288i("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr2 = (Size[]) arrayList4.toArray(new Size[0]);
        map.put(Integer.valueOf(i), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }

    /* JADX INFO: renamed from: b */
    public final StreamConfigurationMap m1104b() {
        return this.f1975a.f1978a;
    }
}
