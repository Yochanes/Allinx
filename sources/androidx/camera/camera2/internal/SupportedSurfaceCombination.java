package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p001A.AbstractC0000a;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@OptIn
@RequiresApi
final class SupportedSurfaceCombination {

    /* JADX INFO: renamed from: g */
    public final String f1856g;

    /* JADX INFO: renamed from: h */
    public final Camera2DeviceSurfaceManager.C01631 f1857h;

    /* JADX INFO: renamed from: i */
    public final CameraCharacteristicsCompat f1858i;

    /* JADX INFO: renamed from: j */
    public final ExtraSupportedSurfaceCombinationsContainer f1859j;

    /* JADX INFO: renamed from: k */
    public final int f1860k;

    /* JADX INFO: renamed from: l */
    public final boolean f1861l;

    /* JADX INFO: renamed from: m */
    public final boolean f1862m;

    /* JADX INFO: renamed from: n */
    public final boolean f1863n;

    /* JADX INFO: renamed from: o */
    public final boolean f1864o;

    /* JADX INFO: renamed from: p */
    public final boolean f1865p;

    /* JADX INFO: renamed from: q */
    public SurfaceSizeDefinition f1866q;

    /* JADX INFO: renamed from: s */
    public final DisplayInfoManager f1868s;

    /* JADX INFO: renamed from: v */
    public final DynamicRangeResolver f1871v;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1850a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f1851b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f1852c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f1853d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f1854e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f1855f = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final ArrayList f1867r = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final TargetAspectRatio f1869t = new TargetAspectRatio();

    /* JADX INFO: renamed from: u */
    public final ResolutionCorrector f1870u = new ResolutionCorrector();

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Size[] m1045a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class FeatureSettings {
        /* JADX INFO: renamed from: a */
        public abstract int mo832a();

        /* JADX INFO: renamed from: b */
        public abstract int mo833b();
    }

    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, Camera2DeviceSurfaceManager.C01631 c01631) throws CameraUnavailableException {
        Object objSingletonList;
        long[] jArr;
        this.f1861l = false;
        this.f1862m = false;
        this.f1863n = false;
        this.f1864o = false;
        this.f1865p = false;
        str.getClass();
        this.f1856g = str;
        c01631.getClass();
        this.f1857h = c01631;
        this.f1859j = new ExtraSupportedSurfaceCombinationsContainer();
        this.f1868s = DisplayInfoManager.m1012b(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompatM1095b = cameraManagerCompat.m1095b(str);
            this.f1858i = cameraCharacteristicsCompatM1095b;
            Integer num = (Integer) cameraCharacteristicsCompatM1095b.m1089a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f1860k = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) cameraCharacteristicsCompatM1095b.m1089a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 3) {
                        this.f1861l = true;
                    } else if (i == 6) {
                        this.f1862m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.f1865p = true;
                    }
                }
            }
            DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(this.f1858i);
            this.f1871v = dynamicRangeResolver;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SurfaceCombination surfaceCombination = new SurfaceCombination();
            SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.f2793a;
            SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
            SurfaceCombination surfaceCombinationM6c = AbstractC0000a.m6c(configType, configSize, surfaceCombination, arrayList2, surfaceCombination);
            SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.f2795c;
            SurfaceCombination surfaceCombinationM6c2 = AbstractC0000a.m6c(configType2, configSize, surfaceCombinationM6c, arrayList2, surfaceCombinationM6c);
            SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.f2794b;
            SurfaceCombination surfaceCombinationM6c3 = AbstractC0000a.m6c(configType3, configSize, surfaceCombinationM6c2, arrayList2, surfaceCombinationM6c2);
            SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
            AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM6c3, configType2, configSize);
            SurfaceCombination surfaceCombinationM7d = AbstractC0000a.m7d(arrayList2, surfaceCombinationM6c3);
            AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM7d, configType2, configSize);
            SurfaceCombination surfaceCombinationM7d2 = AbstractC0000a.m7d(arrayList2, surfaceCombinationM7d);
            AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d2, configType, configSize2);
            SurfaceCombination surfaceCombinationM7d3 = AbstractC0000a.m7d(arrayList2, surfaceCombinationM7d2);
            AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d3, configType3, configSize2);
            SurfaceCombination surfaceCombinationM7d4 = AbstractC0000a.m7d(arrayList2, surfaceCombinationM7d3);
            AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d4, configType3, configSize2);
            surfaceCombinationM7d4.m1550a(SurfaceConfig.m1552a(configType2, configSize));
            arrayList2.add(surfaceCombinationM7d4);
            arrayList.addAll(arrayList2);
            int i2 = this.f1860k;
            SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
            if (i2 == 0 || i2 == 1 || i2 == 3) {
                ArrayList arrayList3 = new ArrayList();
                SurfaceCombination surfaceCombination2 = new SurfaceCombination();
                AbstractC0000a.m28y(configType, configSize2, surfaceCombination2, configType, configSize3);
                SurfaceCombination surfaceCombinationM7d5 = AbstractC0000a.m7d(arrayList3, surfaceCombination2);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d5, configType3, configSize3);
                SurfaceCombination surfaceCombinationM7d6 = AbstractC0000a.m7d(arrayList3, surfaceCombinationM7d5);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM7d6, configType3, configSize3);
                SurfaceCombination surfaceCombinationM7d7 = AbstractC0000a.m7d(arrayList3, surfaceCombinationM7d6);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d7, configType, configSize3);
                SurfaceCombination surfaceCombinationM6c4 = AbstractC0000a.m6c(configType2, configSize3, surfaceCombinationM7d7, arrayList3, surfaceCombinationM7d7);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM6c4, configType3, configSize3);
                SurfaceCombination surfaceCombinationM6c5 = AbstractC0000a.m6c(configType2, configSize3, surfaceCombinationM6c4, arrayList3, surfaceCombinationM6c4);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM6c5, configType3, configSize2);
                surfaceCombinationM6c5.m1550a(SurfaceConfig.m1552a(configType2, configSize));
                arrayList3.add(surfaceCombinationM6c5);
                arrayList.addAll(arrayList3);
            }
            SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.VGA;
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList4 = new ArrayList();
                SurfaceCombination surfaceCombination3 = new SurfaceCombination();
                AbstractC0000a.m28y(configType, configSize2, surfaceCombination3, configType, configSize);
                SurfaceCombination surfaceCombinationM7d8 = AbstractC0000a.m7d(arrayList4, surfaceCombination3);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d8, configType3, configSize);
                SurfaceCombination surfaceCombinationM7d9 = AbstractC0000a.m7d(arrayList4, surfaceCombinationM7d8);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM7d9, configType3, configSize);
                SurfaceCombination surfaceCombinationM7d10 = AbstractC0000a.m7d(arrayList4, surfaceCombinationM7d9);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d10, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c6 = AbstractC0000a.m6c(configType2, configSize, surfaceCombinationM7d10, arrayList4, surfaceCombinationM7d10);
                AbstractC0000a.m28y(configType3, configSize4, surfaceCombinationM6c6, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c7 = AbstractC0000a.m6c(configType3, configSize, surfaceCombinationM6c6, arrayList4, surfaceCombinationM6c6);
                AbstractC0000a.m28y(configType3, configSize4, surfaceCombinationM6c7, configType3, configSize2);
                surfaceCombinationM6c7.m1550a(SurfaceConfig.m1552a(configType3, configSize));
                arrayList4.add(surfaceCombinationM6c7);
                arrayList.addAll(arrayList4);
            }
            SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.f2796d;
            if (this.f1861l) {
                ArrayList arrayList5 = new ArrayList();
                SurfaceCombination surfaceCombination4 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationM6c8 = AbstractC0000a.m6c(configType4, configSize, surfaceCombination4, arrayList5, surfaceCombination4);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM6c8, configType4, configSize);
                SurfaceCombination surfaceCombinationM7d11 = AbstractC0000a.m7d(arrayList5, surfaceCombinationM6c8);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM7d11, configType4, configSize);
                SurfaceCombination surfaceCombinationM7d12 = AbstractC0000a.m7d(arrayList5, surfaceCombinationM7d11);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d12, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c9 = AbstractC0000a.m6c(configType4, configSize, surfaceCombinationM7d12, arrayList5, surfaceCombinationM7d12);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM6c9, configType3, configSize2);
                SurfaceCombination surfaceCombinationM6c10 = AbstractC0000a.m6c(configType4, configSize, surfaceCombinationM6c9, arrayList5, surfaceCombinationM6c9);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM6c10, configType3, configSize2);
                SurfaceCombination surfaceCombinationM6c11 = AbstractC0000a.m6c(configType4, configSize, surfaceCombinationM6c10, arrayList5, surfaceCombinationM6c10);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM6c11, configType2, configSize);
                SurfaceCombination surfaceCombinationM6c12 = AbstractC0000a.m6c(configType4, configSize, surfaceCombinationM6c11, arrayList5, surfaceCombinationM6c11);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM6c12, configType2, configSize);
                surfaceCombinationM6c12.m1550a(SurfaceConfig.m1552a(configType4, configSize));
                arrayList5.add(surfaceCombinationM6c12);
                arrayList.addAll(arrayList5);
            }
            if (this.f1862m && i2 == 0) {
                ArrayList arrayList6 = new ArrayList();
                SurfaceCombination surfaceCombination5 = new SurfaceCombination();
                AbstractC0000a.m28y(configType, configSize2, surfaceCombination5, configType, configSize);
                SurfaceCombination surfaceCombinationM7d13 = AbstractC0000a.m7d(arrayList6, surfaceCombination5);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d13, configType3, configSize);
                SurfaceCombination surfaceCombinationM7d14 = AbstractC0000a.m7d(arrayList6, surfaceCombinationM7d13);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM7d14, configType3, configSize);
                arrayList6.add(surfaceCombinationM7d14);
                arrayList.addAll(arrayList6);
            }
            if (i2 == 3) {
                ArrayList arrayList7 = new ArrayList();
                SurfaceCombination surfaceCombination6 = new SurfaceCombination();
                AbstractC0000a.m28y(configType, configSize2, surfaceCombination6, configType, configSize4);
                AbstractC0000a.m28y(configType3, configSize, surfaceCombination6, configType4, configSize);
                SurfaceCombination surfaceCombinationM7d15 = AbstractC0000a.m7d(arrayList7, surfaceCombination6);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d15, configType, configSize4);
                AbstractC0000a.m28y(configType2, configSize, surfaceCombinationM7d15, configType4, configSize);
                arrayList7.add(surfaceCombinationM7d15);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.f1850a;
            arrayList8.addAll(arrayList);
            if (this.f1859j.f2075a == null) {
                objSingletonList = new ArrayList();
            } else {
                SurfaceCombination surfaceCombination7 = ExtraSupportedSurfaceCombinationsQuirk.f2051a;
                String str2 = Build.DEVICE;
                boolean z2 = "heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2);
                SurfaceCombination surfaceCombination8 = ExtraSupportedSurfaceCombinationsQuirk.f2051a;
                if (z2) {
                    ArrayList arrayList9 = new ArrayList();
                    objSingletonList = arrayList9;
                    if (this.f1856g.equals("1")) {
                        arrayList9.add(surfaceCombination8);
                        objSingletonList = arrayList9;
                    }
                } else {
                    String str3 = Build.BRAND;
                    if (!"samsung".equalsIgnoreCase(str3) ? false : ExtraSupportedSurfaceCombinationsQuirk.f2054d.contains(Build.MODEL.toUpperCase(Locale.US))) {
                        ArrayList arrayList10 = new ArrayList();
                        objSingletonList = arrayList10;
                        if (i2 == 0) {
                            arrayList10.add(surfaceCombination8);
                            arrayList10.add(ExtraSupportedSurfaceCombinationsQuirk.f2052b);
                            objSingletonList = arrayList10;
                        }
                    } else {
                        objSingletonList = !"google".equalsIgnoreCase(str3) ? false : ExtraSupportedSurfaceCombinationsQuirk.f2055e.contains(Build.MODEL.toUpperCase(Locale.US)) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f2053c) : Collections.EMPTY_LIST;
                    }
                }
            }
            arrayList8.addAll(objSingletonList);
            if (this.f1865p) {
                ArrayList arrayList11 = new ArrayList();
                SurfaceCombination surfaceCombination9 = new SurfaceCombination();
                SurfaceConfig.ConfigSize configSize5 = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
                AbstractC0000a.m28y(configType3, configSize5, surfaceCombination9, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c13 = AbstractC0000a.m6c(configType, configSize3, surfaceCombination9, arrayList11, surfaceCombination9);
                AbstractC0000a.m28y(configType2, configSize5, surfaceCombinationM6c13, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c14 = AbstractC0000a.m6c(configType, configSize3, surfaceCombinationM6c13, arrayList11, surfaceCombinationM6c13);
                AbstractC0000a.m28y(configType4, configSize5, surfaceCombinationM6c14, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c15 = AbstractC0000a.m6c(configType, configSize3, surfaceCombinationM6c14, arrayList11, surfaceCombinationM6c14);
                AbstractC0000a.m28y(configType3, configSize5, surfaceCombinationM6c15, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c16 = AbstractC0000a.m6c(configType2, configSize, surfaceCombinationM6c15, arrayList11, surfaceCombinationM6c15);
                AbstractC0000a.m28y(configType2, configSize5, surfaceCombinationM6c16, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c17 = AbstractC0000a.m6c(configType2, configSize, surfaceCombinationM6c16, arrayList11, surfaceCombinationM6c16);
                AbstractC0000a.m28y(configType4, configSize5, surfaceCombinationM6c17, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c18 = AbstractC0000a.m6c(configType2, configSize, surfaceCombinationM6c17, arrayList11, surfaceCombinationM6c17);
                AbstractC0000a.m28y(configType3, configSize5, surfaceCombinationM6c18, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c19 = AbstractC0000a.m6c(configType3, configSize, surfaceCombinationM6c18, arrayList11, surfaceCombinationM6c18);
                AbstractC0000a.m28y(configType2, configSize5, surfaceCombinationM6c19, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c20 = AbstractC0000a.m6c(configType3, configSize, surfaceCombinationM6c19, arrayList11, surfaceCombinationM6c19);
                AbstractC0000a.m28y(configType4, configSize5, surfaceCombinationM6c20, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c21 = AbstractC0000a.m6c(configType3, configSize, surfaceCombinationM6c20, arrayList11, surfaceCombinationM6c20);
                AbstractC0000a.m28y(configType3, configSize5, surfaceCombinationM6c21, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c22 = AbstractC0000a.m6c(configType4, configSize, surfaceCombinationM6c21, arrayList11, surfaceCombinationM6c21);
                AbstractC0000a.m28y(configType2, configSize5, surfaceCombinationM6c22, configType, configSize2);
                SurfaceCombination surfaceCombinationM6c23 = AbstractC0000a.m6c(configType4, configSize, surfaceCombinationM6c22, arrayList11, surfaceCombinationM6c22);
                AbstractC0000a.m28y(configType4, configSize5, surfaceCombinationM6c23, configType, configSize2);
                surfaceCombinationM6c23.m1550a(SurfaceConfig.m1552a(configType4, configSize));
                arrayList11.add(surfaceCombinationM6c23);
                this.f1851b.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f1863n = zHasSystemFeature;
            SurfaceConfig.ConfigSize configSize6 = SurfaceConfig.ConfigSize.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = new ArrayList();
                SurfaceCombination surfaceCombination10 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationM6c24 = AbstractC0000a.m6c(configType3, configSize6, surfaceCombination10, arrayList12, surfaceCombination10);
                SurfaceCombination surfaceCombinationM6c25 = AbstractC0000a.m6c(configType, configSize6, surfaceCombinationM6c24, arrayList12, surfaceCombinationM6c24);
                SurfaceCombination surfaceCombinationM6c26 = AbstractC0000a.m6c(configType2, configSize6, surfaceCombinationM6c25, arrayList12, surfaceCombinationM6c25);
                SurfaceConfig.ConfigSize configSize7 = SurfaceConfig.ConfigSize.s720p;
                AbstractC0000a.m28y(configType3, configSize7, surfaceCombinationM6c26, configType2, configSize6);
                SurfaceCombination surfaceCombinationM7d16 = AbstractC0000a.m7d(arrayList12, surfaceCombinationM6c26);
                AbstractC0000a.m28y(configType, configSize7, surfaceCombinationM7d16, configType2, configSize6);
                SurfaceCombination surfaceCombinationM7d17 = AbstractC0000a.m7d(arrayList12, surfaceCombinationM7d16);
                AbstractC0000a.m28y(configType3, configSize7, surfaceCombinationM7d17, configType3, configSize6);
                SurfaceCombination surfaceCombinationM7d18 = AbstractC0000a.m7d(arrayList12, surfaceCombinationM7d17);
                AbstractC0000a.m28y(configType3, configSize7, surfaceCombinationM7d18, configType, configSize6);
                SurfaceCombination surfaceCombinationM7d19 = AbstractC0000a.m7d(arrayList12, surfaceCombinationM7d18);
                AbstractC0000a.m28y(configType, configSize7, surfaceCombinationM7d19, configType3, configSize6);
                SurfaceCombination surfaceCombinationM7d20 = AbstractC0000a.m7d(arrayList12, surfaceCombinationM7d19);
                AbstractC0000a.m28y(configType, configSize7, surfaceCombinationM7d20, configType, configSize6);
                arrayList12.add(surfaceCombinationM7d20);
                this.f1852c.addAll(arrayList12);
            }
            if (dynamicRangeResolver.f1780c) {
                ArrayList arrayList13 = new ArrayList();
                SurfaceCombination surfaceCombination11 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationM6c27 = AbstractC0000a.m6c(configType, configSize, surfaceCombination11, arrayList13, surfaceCombination11);
                SurfaceCombination surfaceCombinationM6c28 = AbstractC0000a.m6c(configType3, configSize, surfaceCombinationM6c27, arrayList13, surfaceCombinationM6c27);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM6c28, configType2, configSize);
                SurfaceCombination surfaceCombinationM7d21 = AbstractC0000a.m7d(arrayList13, surfaceCombinationM6c28);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d21, configType3, configSize);
                SurfaceCombination surfaceCombinationM7d22 = AbstractC0000a.m7d(arrayList13, surfaceCombinationM7d21);
                AbstractC0000a.m28y(configType3, configSize2, surfaceCombinationM7d22, configType3, configSize);
                SurfaceCombination surfaceCombinationM7d23 = AbstractC0000a.m7d(arrayList13, surfaceCombinationM7d22);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d23, configType, configSize3);
                SurfaceCombination surfaceCombinationM7d24 = AbstractC0000a.m7d(arrayList13, surfaceCombinationM7d23);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM7d24, configType, configSize3);
                SurfaceCombination surfaceCombinationM6c29 = AbstractC0000a.m6c(configType3, configSize3, surfaceCombinationM7d24, arrayList13, surfaceCombinationM7d24);
                AbstractC0000a.m28y(configType, configSize2, surfaceCombinationM6c29, configType, configSize3);
                surfaceCombinationM6c29.m1550a(SurfaceConfig.m1552a(configType2, configSize3));
                arrayList13.add(surfaceCombinationM6c29);
                this.f1854e.addAll(arrayList13);
            }
            CameraCharacteristicsCompat cameraCharacteristicsCompat = this.f1858i;
            Config.Option option = StreamUseCaseUtil.f1847a;
            int i3 = Build.VERSION.SDK_INT;
            boolean z3 = (i3 < 33 || (jArr = (long[]) cameraCharacteristicsCompat.m1089a(AbstractC0024a.m83e())) == null || jArr.length == 0) ? false : true;
            this.f1864o = z3;
            if (z3 && i3 >= 33) {
                ArrayList arrayList14 = new ArrayList();
                SurfaceCombination surfaceCombination12 = new SurfaceCombination();
                surfaceCombination12.m1550a(SurfaceConfig.m1553b(configType, configSize6, 4L));
                arrayList14.add(surfaceCombination12);
                SurfaceCombination surfaceCombination13 = new SurfaceCombination();
                surfaceCombination13.m1550a(SurfaceConfig.m1553b(configType3, configSize6, 4L));
                arrayList14.add(surfaceCombination13);
                SurfaceCombination surfaceCombination14 = new SurfaceCombination();
                surfaceCombination14.m1550a(SurfaceConfig.m1553b(configType, configSize3, 3L));
                arrayList14.add(surfaceCombination14);
                SurfaceCombination surfaceCombination15 = new SurfaceCombination();
                surfaceCombination15.m1550a(SurfaceConfig.m1553b(configType3, configSize3, 3L));
                arrayList14.add(surfaceCombination15);
                SurfaceCombination surfaceCombination16 = new SurfaceCombination();
                surfaceCombination16.m1550a(SurfaceConfig.m1553b(configType2, configSize, 2L));
                arrayList14.add(surfaceCombination16);
                SurfaceCombination surfaceCombination17 = new SurfaceCombination();
                surfaceCombination17.m1550a(SurfaceConfig.m1553b(configType3, configSize, 2L));
                arrayList14.add(surfaceCombination17);
                SurfaceCombination surfaceCombination18 = new SurfaceCombination();
                surfaceCombination18.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination18.m1550a(SurfaceConfig.m1553b(configType2, configSize, 2L));
                arrayList14.add(surfaceCombination18);
                SurfaceCombination surfaceCombination19 = new SurfaceCombination();
                surfaceCombination19.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination19.m1550a(SurfaceConfig.m1553b(configType3, configSize, 2L));
                arrayList14.add(surfaceCombination19);
                SurfaceCombination surfaceCombination20 = new SurfaceCombination();
                surfaceCombination20.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination20.m1550a(SurfaceConfig.m1553b(configType, configSize3, 3L));
                arrayList14.add(surfaceCombination20);
                SurfaceCombination surfaceCombination21 = new SurfaceCombination();
                surfaceCombination21.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination21.m1550a(SurfaceConfig.m1553b(configType3, configSize3, 3L));
                arrayList14.add(surfaceCombination21);
                SurfaceCombination surfaceCombination22 = new SurfaceCombination();
                surfaceCombination22.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination22.m1550a(SurfaceConfig.m1553b(configType3, configSize2, 1L));
                arrayList14.add(surfaceCombination22);
                SurfaceCombination surfaceCombination23 = new SurfaceCombination();
                surfaceCombination23.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination23.m1550a(SurfaceConfig.m1553b(configType, configSize3, 3L));
                surfaceCombination23.m1550a(SurfaceConfig.m1553b(configType2, configSize3, 2L));
                arrayList14.add(surfaceCombination23);
                SurfaceCombination surfaceCombination24 = new SurfaceCombination();
                surfaceCombination24.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination24.m1550a(SurfaceConfig.m1553b(configType3, configSize3, 3L));
                surfaceCombination24.m1550a(SurfaceConfig.m1553b(configType2, configSize3, 2L));
                arrayList14.add(surfaceCombination24);
                SurfaceCombination surfaceCombination25 = new SurfaceCombination();
                surfaceCombination25.m1550a(SurfaceConfig.m1553b(configType, configSize2, 1L));
                surfaceCombination25.m1550a(SurfaceConfig.m1553b(configType3, configSize2, 1L));
                surfaceCombination25.m1550a(SurfaceConfig.m1553b(configType2, configSize, 2L));
                arrayList14.add(surfaceCombination25);
                this.f1855f.addAll(arrayList14);
            }
            m1040b();
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Size m1036c(StreamConfigurationMap streamConfigurationMap, int i, boolean z2) {
        Size[] sizeArrM1045a;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
        Size size2 = SizeUtil.f3012a;
        if (z2 && (sizeArrM1045a = Api23Impl.m1045a(streamConfigurationMap, i)) != null && sizeArrM1045a.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrM1045a), compareSizesByArea);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
    }

    /* JADX INFO: renamed from: e */
    public static int m1037e(Range range, Range range2) {
        Preconditions.m7699f((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m1038f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1039a(AutoValue_SupportedSurfaceCombination_FeatureSettings autoValue_SupportedSurfaceCombination_FeatureSettings, List list) {
        List list2;
        HashMap map = this.f1853d;
        if (map.containsKey(autoValue_SupportedSurfaceCombination_FeatureSettings)) {
            list2 = (List) map.get(autoValue_SupportedSurfaceCombination_FeatureSettings);
        } else {
            ArrayList arrayList = new ArrayList();
            int i = autoValue_SupportedSurfaceCombination_FeatureSettings.f1541a;
            int i2 = autoValue_SupportedSurfaceCombination_FeatureSettings.f1542b;
            if (i2 == 8) {
                if (i != 1) {
                    ArrayList arrayList2 = this.f1850a;
                    if (i != 2) {
                        arrayList.addAll(arrayList2);
                    } else {
                        arrayList.addAll(this.f1851b);
                        arrayList.addAll(arrayList2);
                    }
                } else {
                    arrayList = this.f1852c;
                }
            } else if (i2 == 10 && i == 0) {
                arrayList.addAll(this.f1854e);
            }
            map.put(autoValue_SupportedSurfaceCombination_FeatureSettings, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 = ((SurfaceCombination) it.next()).m1551c(list) != null;
            if (z2) {
                break;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1040b() {
        Size size;
        Size size2;
        Size size3;
        int i;
        CamcorderProfile camcorderProfile;
        CamcorderProfile camcorderProfile2;
        Size sizeM1016e = this.f1868s.m1016e();
        try {
            i = Integer.parseInt(this.f1856g);
            this.f1857h.getClass();
            camcorderProfile = null;
            camcorderProfile2 = CamcorderProfile.hasProfile(i, 1) ? CamcorderProfile.get(i, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = this.f1858i.m1090b().m1104b().getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = SizeUtil.f3015d;
            } else {
                Arrays.sort(outputSizes, new CompareSizesByArea(true));
                for (Size size4 : outputSizes) {
                    int width = size4.getWidth();
                    Size size5 = SizeUtil.f3017f;
                    if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                        size2 = size4;
                        break;
                    }
                }
                size = SizeUtil.f3015d;
            }
            size2 = size;
        }
        if (camcorderProfile2 != null) {
            size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
        } else {
            Size size6 = SizeUtil.f3015d;
            if (CamcorderProfile.hasProfile(i, 10)) {
                camcorderProfile = CamcorderProfile.get(i, 10);
            } else if (CamcorderProfile.hasProfile(i, 8)) {
                camcorderProfile = CamcorderProfile.get(i, 8);
            } else if (CamcorderProfile.hasProfile(i, 12)) {
                camcorderProfile = CamcorderProfile.get(i, 12);
            } else if (CamcorderProfile.hasProfile(i, 6)) {
                camcorderProfile = CamcorderProfile.get(i, 6);
            } else if (CamcorderProfile.hasProfile(i, 5)) {
                camcorderProfile = CamcorderProfile.get(i, 5);
            } else if (CamcorderProfile.hasProfile(i, 4)) {
                camcorderProfile = CamcorderProfile.get(i, 4);
            }
            if (camcorderProfile == null) {
                size3 = size6;
                this.f1866q = SurfaceSizeDefinition.m1555a(SizeUtil.f3014c, new HashMap(), sizeM1016e, new HashMap(), size3, new HashMap(), new HashMap());
            }
            size2 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        size3 = size2;
        this.f1866q = SurfaceSizeDefinition.m1555a(SizeUtil.f3014c, new HashMap(), sizeM1016e, new HashMap(), size3, new HashMap(), new HashMap());
    }

    /* JADX INFO: renamed from: d */
    public final List m1041d(AutoValue_SupportedSurfaceCombination_FeatureSettings autoValue_SupportedSurfaceCombination_FeatureSettings, List list) {
        Config.Option option = StreamUseCaseUtil.f1847a;
        if (autoValue_SupportedSurfaceCombination_FeatureSettings.f1541a != 0 || autoValue_SupportedSurfaceCombination_FeatureSettings.f1542b != 8) {
            return null;
        }
        Iterator it = this.f1855f.iterator();
        while (it.hasNext()) {
            List listM1551c = ((SurfaceCombination) it.next()).m1551c(list);
            if (listM1551c != null) {
                return listM1551c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Pair m1042g(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) it.next();
            arrayList4.add(attachedSurfaceInfo.mo1379g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            UseCaseConfig useCaseConfig = (UseCaseConfig) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int iMo1490p = useCaseConfig.mo1490p();
            arrayList4.add(SurfaceConfig.m1554f(i, iMo1490p, size, m1043h(iMo1490p)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), useCaseConfig);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f1858i.m1089a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(useCaseConfig.mo1490p(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i2 = Math.min(i2, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public final SurfaceSizeDefinition m1043h(int i) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.f1867r;
        if (!arrayList.contains(Integer.valueOf(i))) {
            m1044i(this.f1866q.mo1435g(), SizeUtil.f3016e, i);
            m1044i(this.f1866q.mo1434f(), SizeUtil.f3018g, i);
            Map mapMo1431c = this.f1866q.mo1431c();
            CameraCharacteristicsCompat cameraCharacteristicsCompat = this.f1858i;
            Size sizeM1036c = m1036c(cameraCharacteristicsCompat.m1090b().m1104b(), i, true);
            if (sizeM1036c != null) {
                mapMo1431c.put(Integer.valueOf(i), sizeM1036c);
            }
            Map mapMo1436h = this.f1866q.mo1436h();
            if (Build.VERSION.SDK_INT >= 31 && this.f1865p && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.m1089a(AbstractC0157C.m842e())) != null) {
                mapMo1436h.put(Integer.valueOf(i), m1036c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.f1866q;
    }

    /* JADX INFO: renamed from: i */
    public final void m1044i(Map map, Size size, int i) {
        if (this.f1863n) {
            Size sizeM1036c = m1036c(this.f1858i.m1090b().m1104b(), i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeM1036c != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeM1036c), new CompareSizesByArea(false));
            }
            map.put(numValueOf, size);
        }
    }
}
