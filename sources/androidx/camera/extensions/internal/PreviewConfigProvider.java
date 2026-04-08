package androidx.camera.extensions.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.PreviewConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class PreviewConfigProvider implements ConfigProvider<PreviewConfig> {
    static {
        Config.Option.m1472a(Integer.class, "camerax.extensions.previewConfigProvider.mode");
    }
}
