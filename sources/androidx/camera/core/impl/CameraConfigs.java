package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class CameraConfigs {

    /* JADX INFO: renamed from: a */
    public static final CameraConfig f2639a = new EmptyCameraConfig();

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyCameraConfig implements CameraConfig {

        /* JADX INFO: renamed from: F */
        public final Identifier f2640F = new AutoValue_Identifier(new Object());

        @Override // androidx.camera.core.impl.CameraConfig
        /* JADX INFO: renamed from: M */
        public final Identifier mo1439M() {
            return this.f2640F;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        /* JADX INFO: renamed from: n */
        public final Config mo1029n() {
            return OptionsBundle.f2750H;
        }
    }
}
