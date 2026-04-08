package androidx.camera.camera2.internal.compat.quirk;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class CamcorderProfileResolutionQuirk implements ProfileResolutionQuirk {

    /* JADX INFO: renamed from: a */
    public final StreamConfigurationMapCompat f2044a;

    /* JADX INFO: renamed from: b */
    public List f2045b = null;

    public CamcorderProfileResolutionQuirk(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f2044a = cameraCharacteristicsCompat.m1090b();
    }

    @Override // androidx.camera.core.impl.quirk.ProfileResolutionQuirk
    /* JADX INFO: renamed from: b */
    public final ArrayList mo1152b() {
        if (this.f2045b == null) {
            Size[] sizeArrM1103a = this.f2044a.m1103a(34);
            this.f2045b = sizeArrM1103a != null ? Arrays.asList((Size[]) sizeArrM1103a.clone()) : Collections.EMPTY_LIST;
            Logger.m1280a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f2045b);
        }
        return new ArrayList(this.f2045b);
    }
}
