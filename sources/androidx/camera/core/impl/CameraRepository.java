package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraRepository {

    /* JADX INFO: renamed from: a */
    public final Object f2653a = new Object();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f2654b = new LinkedHashMap();

    public CameraRepository() {
        new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet m1446a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f2653a) {
            linkedHashSet = new LinkedHashSet(this.f2654b.values());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m1447b(CameraFactory cameraFactory) {
        synchronized (this.f2653a) {
            try {
                for (String str : cameraFactory.mo898a()) {
                    Logger.m1280a("CameraRepository", "Added camera: " + str);
                    this.f2654b.put(str, cameraFactory.mo900c(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
