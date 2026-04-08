package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ForceCloseCaptureSession {

    /* JADX INFO: renamed from: a */
    public final CaptureSessionOnClosedNotCalledQuirk f2076a;

    /* JADX INFO: compiled from: Proguard */
    @FunctionalInterface
    public interface OnConfigured {
    }

    public ForceCloseCaptureSession(Quirks quirks) {
        this.f2076a = (CaptureSessionOnClosedNotCalledQuirk) quirks.m1514b(CaptureSessionOnClosedNotCalledQuirk.class);
    }
}
