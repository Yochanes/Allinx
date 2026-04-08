package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.IoConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ImageCaptureConfig implements UseCaseConfig<ImageCapture>, ImageOutputConfig, IoConfig {

    /* JADX INFO: renamed from: G */
    public static final Config.Option f2720G;

    /* JADX INFO: renamed from: H */
    public static final Config.Option f2721H;

    /* JADX INFO: renamed from: I */
    public static final Config.Option f2722I;

    /* JADX INFO: renamed from: J */
    public static final Config.Option f2723J;

    /* JADX INFO: renamed from: K */
    public static final Config.Option f2724K;

    /* JADX INFO: renamed from: L */
    public static final Config.Option f2725L;

    /* JADX INFO: renamed from: M */
    public static final Config.Option f2726M;

    /* JADX INFO: renamed from: F */
    public final OptionsBundle f2727F;

    static {
        Class cls = Integer.TYPE;
        f2720G = new AutoValue_Config_Option("camerax.core.imageCapture.captureMode", cls, null);
        f2721H = new AutoValue_Config_Option("camerax.core.imageCapture.flashMode", cls, null);
        f2722I = new AutoValue_Config_Option("camerax.core.imageCapture.captureBundle", CaptureBundle.class, null);
        f2723J = new AutoValue_Config_Option("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        new AutoValue_Config_Option("camerax.core.imageCapture.maxCaptureStages", Integer.class, null);
        f2724K = new AutoValue_Config_Option("camerax.core.imageCapture.imageReaderProxyProvider", ImageReaderProxyProvider.class, null);
        f2725L = new AutoValue_Config_Option("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        f2726M = new AutoValue_Config_Option("camerax.core.imageCapture.flashType", cls, null);
        new AutoValue_Config_Option("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
    }

    public ImageCaptureConfig(OptionsBundle optionsBundle) {
        this.f2727F = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* JADX INFO: renamed from: n */
    public final Config mo1029n() {
        return this.f2727F;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    /* JADX INFO: renamed from: p */
    public final int mo1490p() {
        return ((Integer) mo1464a(ImageInputConfig.f2728e)).intValue();
    }
}
