package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class SurfaceSorter {

    /* JADX INFO: renamed from: a */
    public final boolean f3005a;

    public SurfaceSorter() {
        this.f3005a = DeviceQuirks.f2999a.m1514b(SurfaceOrderQuirk.class) != null;
    }
}
