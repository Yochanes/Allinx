package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class DynamicRangeResolver {

    /* JADX INFO: renamed from: a */
    public final CameraCharacteristicsCompat f1778a;

    /* JADX INFO: renamed from: b */
    public final DynamicRangesCompat f1779b;

    /* JADX INFO: renamed from: c */
    public final boolean f1780c;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api33Impl {
        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static DynamicRange m1021a(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
            Long l = (Long) cameraCharacteristicsCompat.m1089a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l != null) {
                return DynamicRangeConversions.m1107b(l.longValue());
            }
            return null;
        }
    }

    public DynamicRangeResolver(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f1778a = cameraCharacteristicsCompat;
        this.f1779b = DynamicRangesCompat.m1108a(cameraCharacteristicsCompat);
        int[] iArr = (int[]) cameraCharacteristicsCompat.m1089a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z2 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        this.f1780c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1017a(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.m7699f(dynamicRange2.m1231b(), "Fully specified range is not actually fully specified.");
        int i = dynamicRange.f2253a;
        int i2 = dynamicRange2.f2253a;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = dynamicRange.f2254b;
        return i3 == 0 || i3 == dynamicRange2.f2254b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1018b(DynamicRange dynamicRange, DynamicRange dynamicRange2, HashSet hashSet) {
        if (hashSet.contains(dynamicRange2)) {
            return m1017a(dynamicRange, dynamicRange2);
        }
        Logger.m1280a("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + dynamicRange + "\nCandidate dynamic range:\n  " + dynamicRange2);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static DynamicRange m1019c(DynamicRange dynamicRange, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (dynamicRange.f2253a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            Preconditions.m7698e(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            Preconditions.m7699f(dynamicRange2.m1231b(), "Fully specified DynamicRange must have fully defined encoding.");
            if (dynamicRange2.f2253a != 1 && m1018b(dynamicRange, dynamicRange2, hashSet)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m1020d(HashSet hashSet, DynamicRange dynamicRange, DynamicRangesCompat dynamicRangesCompat) {
        Preconditions.m7699f(!hashSet.isEmpty(), "Cannot update already-empty constraints.");
        Set setM1109b = dynamicRangesCompat.m1109b(dynamicRange);
        if (setM1109b.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setM1109b);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + dynamicRange + "\nConstraints:\n  " + TextUtils.join("\n  ", setM1109b) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }
}
