package androidx.camera.extensions;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ExtensionsConfig implements CameraConfig {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder implements CameraConfig.Builder<Builder> {
    }

    static {
        Config.Option.m1472a(Integer.TYPE, "camerax.extensions.extensionMode");
    }

    @Override // androidx.camera.core.impl.CameraConfig
    /* JADX INFO: renamed from: M */
    public final Identifier mo1439M() {
        return (Identifier) mo1464a(CameraConfig.f2635b);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* JADX INFO: renamed from: n */
    public final Config mo1029n() {
        return null;
    }
}
