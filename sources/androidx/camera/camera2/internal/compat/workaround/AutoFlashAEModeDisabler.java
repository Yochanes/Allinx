package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class AutoFlashAEModeDisabler {

    /* JADX INFO: renamed from: a */
    public final boolean f2071a;

    /* JADX INFO: renamed from: b */
    public final boolean f2072b;

    public AutoFlashAEModeDisabler(Quirks quirks) {
        this.f2071a = quirks.m1513a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f2072b = DeviceQuirks.f2048a.m1514b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}
