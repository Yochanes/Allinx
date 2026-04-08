package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Preview;
import androidx.camera.core.internal.ThreadConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class PreviewConfig implements UseCaseConfig<Preview>, ImageOutputConfig, ThreadConfig {

    /* JADX INFO: renamed from: F */
    public final OptionsBundle f2752F;

    public PreviewConfig(OptionsBundle optionsBundle) {
        this.f2752F = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* JADX INFO: renamed from: n */
    public final Config mo1029n() {
        return this.f2752F;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    /* JADX INFO: renamed from: p */
    public final int mo1490p() {
        return ((Integer) mo1464a(ImageInputConfig.f2728e)).intValue();
    }
}
