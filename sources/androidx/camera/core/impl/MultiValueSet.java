package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class MultiValueSet<C> {

    /* JADX INFO: renamed from: a */
    public HashSet f2748a;

    /* JADX INFO: renamed from: a */
    public abstract CameraEventCallbacks mo818a();

    public /* bridge */ /* synthetic */ Object clone() {
        return mo818a();
    }
}
