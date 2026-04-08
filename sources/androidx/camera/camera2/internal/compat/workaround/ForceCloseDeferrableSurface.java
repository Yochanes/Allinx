package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ForceCloseDeferrableSurface {

    /* JADX INFO: renamed from: a */
    public final boolean f2077a;

    /* JADX INFO: renamed from: b */
    public final boolean f2078b;

    /* JADX INFO: renamed from: c */
    public final boolean f2079c;

    public ForceCloseDeferrableSurface(Quirks quirks, Quirks quirks2) {
        this.f2077a = quirks2.m1513a(TextureViewIsClosedQuirk.class);
        this.f2078b = quirks.m1513a(PreviewOrientationIncorrectQuirk.class);
        this.f2079c = quirks.m1513a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m1159a(ArrayList arrayList) {
        if ((this.f2077a || this.f2078b || this.f2079c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DeferrableSurface) it.next()).m1477a();
            }
            Logger.m1280a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
