package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.core.impl.utils.CompareSizesByArea;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class SupportedRepeatingSurfaceSize {

    /* JADX INFO: renamed from: b */
    public static final Size f2089b = new Size(320, 240);

    /* JADX INFO: renamed from: c */
    public static final CompareSizesByArea f2090c = new CompareSizesByArea(false);

    /* JADX INFO: renamed from: a */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f2091a = (RepeatingStreamConstraintForVideoRecordingQuirk) DeviceQuirks.f2048a.m1514b(RepeatingStreamConstraintForVideoRecordingQuirk.class);
}
