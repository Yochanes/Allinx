package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class OverrideAeModeForStillCapture {

    /* JADX INFO: renamed from: a */
    public final boolean f2084a;

    /* JADX INFO: renamed from: b */
    public boolean f2085b = false;

    public OverrideAeModeForStillCapture(Quirks quirks) {
        this.f2084a = quirks.m1514b(AutoFlashUnderExposedQuirk.class) != null;
    }
}
