package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ExtendedCameraConfigProviderStore {

    /* JADX INFO: renamed from: a */
    public static final Object f2709a = new Object();

    /* JADX INFO: renamed from: b */
    public static final HashMap f2710b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static CameraConfigProvider m1488a(Identifier identifier) {
        CameraConfigProvider cameraConfigProvider;
        synchronized (f2709a) {
            cameraConfigProvider = (CameraConfigProvider) f2710b.get(identifier);
        }
        return cameraConfigProvider == null ? CameraConfigProvider.f2638a : cameraConfigProvider;
    }
}
