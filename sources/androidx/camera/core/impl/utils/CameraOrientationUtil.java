package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraOrientationUtil {
    /* JADX INFO: renamed from: a */
    public static int m1585a(int i, int i2, boolean z2) {
        int i3 = z2 ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (Logger.m1285f("CameraOrientationUtil")) {
            StringBuilder sbM24u = AbstractC0000a.m24u("getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=", i, i2);
            sbM24u.append(z2);
            sbM24u.append(", result=");
            sbM24u.append(i3);
            Logger.m1280a("CameraOrientationUtil", sbM24u.toString());
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m1586b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Unsupported surface rotation: "));
    }
}
