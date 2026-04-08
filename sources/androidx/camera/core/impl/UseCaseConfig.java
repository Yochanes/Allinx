package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.UseCaseEventConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, UseCaseEventConfig, ImageInputConfig {

    /* JADX INFO: renamed from: q */
    public static final Config.Option f2809q = new AutoValue_Config_Option("camerax.core.useCase.defaultSessionConfig", SessionConfig.class, null);

    /* JADX INFO: renamed from: r */
    public static final Config.Option f2810r = new AutoValue_Config_Option("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class, null);

    /* JADX INFO: renamed from: s */
    public static final Config.Option f2811s = new AutoValue_Config_Option("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.OptionUnpacker.class, null);

    /* JADX INFO: renamed from: t */
    public static final Config.Option f2812t = new AutoValue_Config_Option("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.OptionUnpacker.class, null);

    /* JADX INFO: renamed from: u */
    public static final Config.Option f2813u = new AutoValue_Config_Option("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE, null);

    /* JADX INFO: renamed from: v */
    public static final Config.Option f2814v = new AutoValue_Config_Option("camerax.core.useCase.cameraSelector", CameraSelector.class, null);

    /* JADX INFO: renamed from: w */
    public static final Config.Option f2815w = new AutoValue_Config_Option("camerax.core.useCase.targetFrameRate", Range.class, null);

    /* JADX INFO: renamed from: x */
    public static final Config.Option f2816x;

    /* JADX INFO: renamed from: y */
    public static final Config.Option f2817y;

    /* JADX INFO: renamed from: z */
    public static final Config.Option f2818z;

    /* JADX INFO: compiled from: Proguard */
    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, ExtendableBuilder<T>, UseCaseEventConfig.Builder<B> {
        /* JADX INFO: renamed from: b */
        UseCaseConfig mo1248b();
    }

    static {
        Class cls = Boolean.TYPE;
        f2816x = new AutoValue_Config_Option("camerax.core.useCase.zslDisabled", cls, null);
        f2817y = new AutoValue_Config_Option("camerax.core.useCase.highResolutionDisabled", cls, null);
        f2818z = new AutoValue_Config_Option("camerax.core.useCase.captureType", UseCaseConfigFactory.CaptureType.class, null);
    }

    /* JADX INFO: renamed from: E */
    default UseCaseConfigFactory.CaptureType mo1028E() {
        return (UseCaseConfigFactory.CaptureType) mo1464a(f2818z);
    }

    /* JADX INFO: renamed from: G */
    default CameraSelector m1567G() {
        return (CameraSelector) mo1468f(f2814v, null);
    }

    /* JADX INFO: renamed from: H */
    default boolean m1568H() {
        return ((Boolean) mo1468f(f2817y, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: N */
    default int m1569N() {
        return ((Integer) mo1464a(f2813u)).intValue();
    }

    /* JADX INFO: renamed from: P */
    default boolean m1570P() {
        return ((Boolean) mo1468f(f2816x, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    default Range m1571o() {
        return (Range) mo1468f(f2815w, null);
    }

    /* JADX INFO: renamed from: s */
    default SessionConfig m1572s() {
        return (SessionConfig) mo1468f(f2809q, null);
    }

    /* JADX INFO: renamed from: t */
    default int m1573t() {
        return ((Integer) mo1468f(f2813u, 0)).intValue();
    }

    /* JADX INFO: renamed from: v */
    default SessionConfig.OptionUnpacker m1574v() {
        return (SessionConfig.OptionUnpacker) mo1468f(f2811s, null);
    }
}
