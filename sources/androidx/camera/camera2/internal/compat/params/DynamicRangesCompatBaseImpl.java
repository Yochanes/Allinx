package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class DynamicRangesCompatBaseImpl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {

    /* JADX INFO: renamed from: a */
    public static final DynamicRangesCompat f2019a = new DynamicRangesCompat(new DynamicRangesCompatBaseImpl());

    /* JADX INFO: renamed from: b */
    public static final Set f2020b = Collections.singleton(DynamicRange.f2247d);

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    /* JADX INFO: renamed from: a */
    public final Set mo1112a() {
        return f2020b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    /* JADX INFO: renamed from: b */
    public final DynamicRangeProfiles mo1113b() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    /* JADX INFO: renamed from: c */
    public final Set mo1114c(DynamicRange dynamicRange) {
        Preconditions.m7695b(DynamicRange.f2247d.equals(dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return f2020b;
    }
}
