package com.king.camera.scan.config;

import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AdaptiveCameraConfig extends CameraConfig {

    /* JADX INFO: renamed from: a */
    public AspectRatioStrategy f42992a;

    /* JADX INFO: renamed from: b */
    public int f42993b;

    /* JADX INFO: renamed from: c */
    public int f42994c;

    /* JADX INFO: renamed from: d */
    public Size f42995d;

    /* JADX INFO: renamed from: e */
    public Size f42996e;

    @Override // com.king.camera.scan.config.CameraConfig
    /* JADX INFO: renamed from: a */
    public CameraSelector mo15336a(CameraSelector.Builder builder) {
        throw null;
    }

    @Override // com.king.camera.scan.config.CameraConfig
    /* JADX INFO: renamed from: b */
    public final ImageAnalysis mo15337b(ImageAnalysis.Builder builder) {
        ResolutionSelector.Builder builder2 = new ResolutionSelector.Builder();
        builder2.f3181a = this.f42992a;
        builder2.f3182b = new ResolutionStrategy(this.f42996e);
        builder2.f3183c = new C4976a(this, 0);
        ResolutionSelector resolutionSelectorM1733a = builder2.m1733a();
        builder.f2273a.mo1506u(ImageOutputConfig.f2738o, resolutionSelectorM1733a);
        return builder.m1249c();
    }

    @Override // com.king.camera.scan.config.CameraConfig
    /* JADX INFO: renamed from: c */
    public final Preview mo15338c(Preview.Builder builder) {
        ResolutionSelector.Builder builder2 = new ResolutionSelector.Builder();
        builder2.f3181a = this.f42992a;
        builder2.f3182b = new ResolutionStrategy(this.f42995d);
        builder2.f3183c = new C4976a(this, 1);
        ResolutionSelector resolutionSelectorM1733a = builder2.m1733a();
        builder.f2347a.mo1506u(ImageOutputConfig.f2738o, resolutionSelectorM1733a);
        return builder.m1299c();
    }
}
