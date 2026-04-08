package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class OutputSizesCorrector {

    /* JADX INFO: renamed from: a */
    public final ExtraSupportedOutputSizeQuirk f2082a = (ExtraSupportedOutputSizeQuirk) DeviceQuirks.f2048a.m1514b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: b */
    public final ExcludedSupportedSizesContainer f2083b;

    public OutputSizesCorrector(String str) {
        this.f2083b = new ExcludedSupportedSizesContainer(str);
    }
}
