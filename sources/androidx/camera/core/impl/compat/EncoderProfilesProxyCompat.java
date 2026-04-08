package androidx.camera.core.impl.compat;

import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class EncoderProfilesProxyCompat {
    /* JADX INFO: renamed from: a */
    public static EncoderProfilesProxy m1576a(EncoderProfiles encoderProfiles) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return EncoderProfilesProxyCompatApi33Impl.m1578a(encoderProfiles);
        }
        if (i >= 31) {
            return EncoderProfilesProxyCompatApi31Impl.m1577a(encoderProfiles);
        }
        throw new RuntimeException(AbstractC0000a.m10g(i, "Unable to call from(EncoderProfiles) on API ", ". Version 31 or higher required."));
    }
}
