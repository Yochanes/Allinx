package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.ThreadConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ImageAnalysisConfig implements UseCaseConfig<ImageAnalysis>, ImageOutputConfig, ThreadConfig {

    /* JADX INFO: renamed from: G */
    public static final Config.Option f2713G = new AutoValue_Config_Option("camerax.core.imageAnalysis.backpressureStrategy", ImageAnalysis.BackpressureStrategy.class, null);

    /* JADX INFO: renamed from: H */
    public static final Config.Option f2714H = new AutoValue_Config_Option("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);

    /* JADX INFO: renamed from: I */
    public static final Config.Option f2715I = new AutoValue_Config_Option("camerax.core.imageAnalysis.imageReaderProxyProvider", ImageReaderProxyProvider.class, null);

    /* JADX INFO: renamed from: J */
    public static final Config.Option f2716J = new AutoValue_Config_Option("camerax.core.imageAnalysis.outputImageFormat", ImageAnalysis.OutputImageFormat.class, null);

    /* JADX INFO: renamed from: K */
    public static final Config.Option f2717K = new AutoValue_Config_Option("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);

    /* JADX INFO: renamed from: L */
    public static final Config.Option f2718L = new AutoValue_Config_Option("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);

    /* JADX INFO: renamed from: F */
    public final OptionsBundle f2719F;

    public ImageAnalysisConfig(OptionsBundle optionsBundle) {
        this.f2719F = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* JADX INFO: renamed from: n */
    public final Config mo1029n() {
        return this.f2719F;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    /* JADX INFO: renamed from: p */
    public final int mo1490p() {
        return 35;
    }
}
