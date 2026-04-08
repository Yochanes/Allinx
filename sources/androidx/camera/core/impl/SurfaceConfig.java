package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.internal.utils.SizeUtil;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class SurfaceConfig {

    /* JADX INFO: compiled from: Proguard */
    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);


        /* JADX INFO: renamed from: a */
        public final int f2792a;

        ConfigSize(int i) {
            this.f2792a = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class ConfigType {

        /* JADX INFO: renamed from: a */
        public static final ConfigType f2793a;

        /* JADX INFO: renamed from: b */
        public static final ConfigType f2794b;

        /* JADX INFO: renamed from: c */
        public static final ConfigType f2795c;

        /* JADX INFO: renamed from: d */
        public static final ConfigType f2796d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ ConfigType[] f2797f;

        static {
            ConfigType configType = new ConfigType("PRIV", 0);
            f2793a = configType;
            ConfigType configType2 = new ConfigType("YUV", 1);
            f2794b = configType2;
            ConfigType configType3 = new ConfigType("JPEG", 2);
            f2795c = configType3;
            ConfigType configType4 = new ConfigType("RAW", 3);
            f2796d = configType4;
            f2797f = new ConfigType[]{configType, configType2, configType3, configType4};
        }

        public static ConfigType valueOf(String str) {
            return (ConfigType) Enum.valueOf(ConfigType.class, str);
        }

        public static ConfigType[] values() {
            return (ConfigType[]) f2797f.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    public static SurfaceConfig m1552a(ConfigType configType, ConfigSize configSize) {
        return new AutoValue_SurfaceConfig(configType, configSize, 0L);
    }

    /* JADX INFO: renamed from: b */
    public static SurfaceConfig m1553b(ConfigType configType, ConfigSize configSize, long j) {
        return new AutoValue_SurfaceConfig(configType, configSize, j);
    }

    /* JADX INFO: renamed from: f */
    public static SurfaceConfig m1554f(int i, int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition) {
        ConfigType configType = i2 == 35 ? ConfigType.f2794b : i2 == 256 ? ConfigType.f2795c : i2 == 32 ? ConfigType.f2796d : ConfigType.f2793a;
        ConfigSize configSize = ConfigSize.NOT_SUPPORT;
        int iM1663a = SizeUtil.m1663a(size);
        if (i == 1) {
            if (iM1663a <= SizeUtil.m1663a((Size) ((AutoValue_SurfaceSizeDefinition) surfaceSizeDefinition).f2595b.get(Integer.valueOf(i2)))) {
                configSize = ConfigSize.s720p;
            } else {
                if (iM1663a <= SizeUtil.m1663a((Size) ((AutoValue_SurfaceSizeDefinition) surfaceSizeDefinition).f2597d.get(Integer.valueOf(i2)))) {
                    configSize = ConfigSize.s1440p;
                }
            }
        } else if (iM1663a <= SizeUtil.m1663a(((AutoValue_SurfaceSizeDefinition) surfaceSizeDefinition).f2594a)) {
            configSize = ConfigSize.VGA;
        } else {
            AutoValue_SurfaceSizeDefinition autoValue_SurfaceSizeDefinition = (AutoValue_SurfaceSizeDefinition) surfaceSizeDefinition;
            if (iM1663a <= SizeUtil.m1663a(autoValue_SurfaceSizeDefinition.f2596c)) {
                configSize = ConfigSize.PREVIEW;
            } else if (iM1663a <= SizeUtil.m1663a(autoValue_SurfaceSizeDefinition.f2598e)) {
                configSize = ConfigSize.RECORD;
            } else if (iM1663a <= SizeUtil.m1663a((Size) surfaceSizeDefinition.mo1431c().get(Integer.valueOf(i2)))) {
                configSize = ConfigSize.MAXIMUM;
            } else {
                Size size2 = (Size) autoValue_SurfaceSizeDefinition.f2600g.get(Integer.valueOf(i2));
                if (size2 != null) {
                    if (iM1663a <= size2.getHeight() * size2.getWidth()) {
                        configSize = ConfigSize.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new AutoValue_SurfaceConfig(configType, configSize, 0L);
    }

    /* JADX INFO: renamed from: c */
    public abstract ConfigSize mo1427c();

    /* JADX INFO: renamed from: d */
    public abstract ConfigType mo1428d();

    /* JADX INFO: renamed from: e */
    public abstract long mo1429e();
}
