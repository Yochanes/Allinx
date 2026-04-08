package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.Arrays;
import java.util.HashSet;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ExtraSupportedSurfaceCombinationsQuirk implements Quirk {

    /* JADX INFO: renamed from: a */
    public static final SurfaceCombination f2051a;

    /* JADX INFO: renamed from: b */
    public static final SurfaceCombination f2052b;

    /* JADX INFO: renamed from: c */
    public static final SurfaceCombination f2053c;

    /* JADX INFO: renamed from: d */
    public static final HashSet f2054d;

    /* JADX INFO: renamed from: e */
    public static final HashSet f2055e;

    static {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.f2794b;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.m1550a(SurfaceConfig.m1552a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.f2793a;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.m1550a(SurfaceConfig.m1552a(configType2, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.m1550a(SurfaceConfig.m1552a(configType, configSize3));
        f2051a = surfaceCombination;
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        AbstractC0000a.m28y(configType, configSize, surfaceCombination2, configType, configSize2);
        surfaceCombination2.m1550a(SurfaceConfig.m1552a(configType, configSize3));
        f2052b = surfaceCombination2;
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        AbstractC0000a.m28y(configType2, configSize2, surfaceCombination3, configType2, configSize);
        surfaceCombination3.m1550a(SurfaceConfig.m1552a(configType, configSize3));
        surfaceCombination3.m1550a(SurfaceConfig.m1552a(SurfaceConfig.ConfigType.f2796d, configSize3));
        f2053c = surfaceCombination3;
        f2054d = new HashSet(Arrays.asList("SM-A515F", "SM-A515U", "SM-A515U1", "SM-A515W", "SM-S515DL", "SC-54A", "SCG07", "SM-A5160", "SM-A516B", "SM-A516N", "SM-A516U", "SM-A516U1", "SM-A516V", "SM-A715F", "SM-A715W", "SM-A7160", "SM-A716B", "SM-A716U", "SM-A716U1", "SM-A716V", "SM-A8050", "SM-A805F", "SM-A805N", "SCV44", "SM-F9000", "SM-F900F", "SM-F900U", "SM-F900U1", "SM-F900W", "SM-F907B", "SM-F907N", "SM-N970F", "SM-N9700", "SM-N970U", "SM-N970U1", "SM-N970W", "SM-N971N", "SM-N770F", "SC-01M", "SCV45", "SM-N9750", "SM-N975C", "SM-N975U", "SM-N975U1", "SM-N975W", "SM-N975F", "SM-N976B", "SM-N976N", "SM-N9760", "SM-N976Q", "SM-N976V", "SM-N976U", "SM-N9810", "SM-N981N", "SM-N981U", "SM-N981U1", "SM-N981W", "SM-N981B", "SC-53A", "SCG06", "SM-N9860", "SM-N986N", "SM-N986U", "SM-N986U1", "SM-N986W", "SM-N986B", "SC-03L", "SCV41", "SM-G973F", "SM-G973N", "SM-G9730", "SM-G9738", "SM-G973C", "SM-G973U", "SM-G973U1", "SM-G973W", "SM-G977B", "SM-G977N", "SM-G977P", "SM-G977T", "SM-G977U", "SM-G770F", "SM-G770U1", "SC-04L", "SCV42", "SM-G975F", "SM-G975N", "SM-G9750", "SM-G9758", "SM-G975U", "SM-G975U1", "SM-G975W", "SC-05L", "SM-G970F", "SM-G970N", "SM-G9700", "SM-G9708", "SM-G970U", "SM-G970U1", "SM-G970W", "SC-51A", "SC51Aa", "SCG01", "SM-G9810", "SM-G981N", "SM-G981U", "SM-G981U1", "SM-G981V", "SM-G981W", "SM-G981B", "SCG03", "SM-G9880", "SM-G988N", "SM-G988Q", "SM-G988U", "SM-G988U1", "SM-G988W", "SM-G988B", "SC-52A", "SCG02", "SM-G9860", "SM-G986N", "SM-G986U", "SM-G986U1", "SM-G986W", "SM-G986B", "SCV47", "SM-F7000", "SM-F700F", "SM-F700N", "SM-F700U", "SM-F700U1", "SM-F700W", "SCG04", "SM-F7070", "SM-F707B", "SM-F707N", "SM-F707U", "SM-F707U1", "SM-F707W", "SM-F9160", "SM-F916B", "SM-F916N", "SM-F916Q", "SM-F916U", "SM-F916U1", "SM-F916W"));
        f2055e = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO"));
    }
}
