package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Set;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class DynamicRangesCompat {

    /* JADX INFO: renamed from: a */
    public final DynamicRangeProfilesCompatImpl f2017a;

    /* JADX INFO: compiled from: Proguard */
    public interface DynamicRangeProfilesCompatImpl {
        /* JADX INFO: renamed from: a */
        Set mo1112a();

        /* JADX INFO: renamed from: b */
        DynamicRangeProfiles mo1113b();

        /* JADX INFO: renamed from: c */
        Set mo1114c(DynamicRange dynamicRange);
    }

    public DynamicRangesCompat(DynamicRangeProfilesCompatImpl dynamicRangeProfilesCompatImpl) {
        this.f2017a = dynamicRangeProfilesCompatImpl;
    }

    /* JADX INFO: renamed from: a */
    public static DynamicRangesCompat m1108a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        DynamicRangeProfiles dynamicRangeProfilesM84f;
        int i = Build.VERSION.SDK_INT;
        DynamicRangesCompat dynamicRangesCompat = null;
        if (i >= 33 && (dynamicRangeProfilesM84f = AbstractC0024a.m84f(cameraCharacteristicsCompat.m1089a(AbstractC0024a.m77C()))) != null) {
            Preconditions.m7699f(i >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
            dynamicRangesCompat = new DynamicRangesCompat(new DynamicRangesCompatApi33Impl(dynamicRangeProfilesM84f));
        }
        return dynamicRangesCompat == null ? DynamicRangesCompatBaseImpl.f2019a : dynamicRangesCompat;
    }

    /* JADX INFO: renamed from: b */
    public final Set m1109b(DynamicRange dynamicRange) {
        return this.f2017a.mo1114c(dynamicRange);
    }

    /* JADX INFO: renamed from: c */
    public final Set m1110c() {
        return this.f2017a.mo1112a();
    }

    /* JADX INFO: renamed from: d */
    public final DynamicRangeProfiles m1111d() {
        Preconditions.m7699f(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f2017a.mo1113b();
    }
}
