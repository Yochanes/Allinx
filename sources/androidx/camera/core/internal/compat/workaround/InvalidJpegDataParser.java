package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class InvalidJpegDataParser {

    /* JADX INFO: renamed from: a */
    public final boolean f3003a;

    public InvalidJpegDataParser() {
        this.f3003a = DeviceQuirks.f2999a.m1514b(LargeJpegImageQuirk.class) != null;
    }
}
