package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.AspectRatio;
import androidx.camera.core.impl.Config;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface ImageOutputConfig extends ReadableConfig {

    /* JADX INFO: renamed from: g */
    public static final Config.Option f2730g = new AutoValue_Config_Option("camerax.core.imageOutput.targetAspectRatio", AspectRatio.class, null);

    /* JADX INFO: renamed from: h */
    public static final Config.Option f2731h;

    /* JADX INFO: renamed from: i */
    public static final Config.Option f2732i;

    /* JADX INFO: renamed from: j */
    public static final Config.Option f2733j;

    /* JADX INFO: renamed from: k */
    public static final Config.Option f2734k;

    /* JADX INFO: renamed from: l */
    public static final Config.Option f2735l;

    /* JADX INFO: renamed from: m */
    public static final Config.Option f2736m;

    /* JADX INFO: renamed from: n */
    public static final Config.Option f2737n;

    /* JADX INFO: renamed from: o */
    public static final Config.Option f2738o;

    /* JADX INFO: renamed from: p */
    public static final Config.Option f2739p;

    /* JADX INFO: compiled from: Proguard */
    public interface Builder<B> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OptionalRotationValue {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationDegreesValue {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    static {
        Class cls = Integer.TYPE;
        f2731h = new AutoValue_Config_Option("camerax.core.imageOutput.targetRotation", cls, null);
        f2732i = new AutoValue_Config_Option("camerax.core.imageOutput.appTargetRotation", cls, null);
        f2733j = new AutoValue_Config_Option("camerax.core.imageOutput.mirrorMode", cls, null);
        f2734k = new AutoValue_Config_Option("camerax.core.imageOutput.targetResolution", Size.class, null);
        f2735l = new AutoValue_Config_Option("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f2736m = new AutoValue_Config_Option("camerax.core.imageOutput.maxResolution", Size.class, null);
        f2737n = new AutoValue_Config_Option("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f2738o = new AutoValue_Config_Option("camerax.core.imageOutput.resolutionSelector", ResolutionSelector.class, null);
        f2739p = new AutoValue_Config_Option("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    /* JADX INFO: renamed from: B */
    static void m1493B(ImageOutputConfig imageOutputConfig) {
        boolean zM1496K = imageOutputConfig.m1496K();
        boolean z2 = imageOutputConfig.m1495D() != null;
        if (zM1496K && z2) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (imageOutputConfig.m1501m() != null) {
            if (zM1496K || z2) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* JADX INFO: renamed from: C */
    default int m1494C() {
        return ((Integer) mo1468f(f2731h, 0)).intValue();
    }

    /* JADX INFO: renamed from: D */
    default Size m1495D() {
        return (Size) mo1468f(f2734k, null);
    }

    /* JADX INFO: renamed from: K */
    default boolean m1496K() {
        return mo1465c(f2730g);
    }

    /* JADX INFO: renamed from: L */
    default int m1497L() {
        return ((Integer) mo1464a(f2730g)).intValue();
    }

    /* JADX INFO: renamed from: O */
    default Size m1498O() {
        return (Size) mo1468f(f2736m, null);
    }

    /* JADX INFO: renamed from: R */
    default int m1499R() {
        return ((Integer) mo1468f(f2732i, -1)).intValue();
    }

    /* JADX INFO: renamed from: b */
    default List m1500b() {
        return (List) mo1468f(f2737n, null);
    }

    /* JADX INFO: renamed from: m */
    default ResolutionSelector m1501m() {
        return (ResolutionSelector) mo1468f(f2738o, null);
    }

    /* JADX INFO: renamed from: q */
    default int m1502q() {
        return ((Integer) mo1468f(f2733j, 0)).intValue();
    }

    /* JADX INFO: renamed from: w */
    default ArrayList m1503w() {
        List list = (List) mo1468f(f2739p, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    default ResolutionSelector m1504x() {
        return (ResolutionSelector) mo1464a(f2738o);
    }

    /* JADX INFO: renamed from: z */
    default Size m1505z() {
        return (Size) mo1468f(f2735l, null);
    }
}
