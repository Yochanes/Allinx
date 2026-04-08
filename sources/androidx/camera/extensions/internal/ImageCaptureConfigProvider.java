package androidx.camera.extensions.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageCaptureConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ImageCaptureConfigProvider implements ConfigProvider<ImageCaptureConfig> {
    static {
        Config.Option.m1472a(Integer.class, "camerax.extensions.imageCaptureConfigProvider.mode");
    }
}
