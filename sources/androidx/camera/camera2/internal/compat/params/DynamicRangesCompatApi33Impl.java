package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class DynamicRangesCompatApi33Impl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {

    /* JADX INFO: renamed from: a */
    public final DynamicRangeProfiles f2018a;

    public DynamicRangesCompatApi33Impl(Object obj) {
        this.f2018a = (DynamicRangeProfiles) obj;
    }

    /* JADX INFO: renamed from: d */
    public static Set m1115d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            DynamicRange dynamicRangeM1107b = DynamicRangeConversions.m1107b(jLongValue);
            Preconditions.m7698e(dynamicRangeM1107b, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(dynamicRangeM1107b);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    /* JADX INFO: renamed from: a */
    public final Set mo1112a() {
        return m1115d(this.f2018a.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    /* JADX INFO: renamed from: b */
    public final DynamicRangeProfiles mo1113b() {
        return this.f2018a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    /* JADX INFO: renamed from: c */
    public final Set mo1114c(DynamicRange dynamicRange) {
        Long lM1106a = DynamicRangeConversions.m1106a(dynamicRange, this.f2018a);
        Preconditions.m7695b(lM1106a != null, "DynamicRange is not supported: " + dynamicRange);
        return m1115d(this.f2018a.getProfileCaptureRequestConstraints(lM1106a.longValue()));
    }
}
