package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class DynamicRangeConversions {

    /* JADX INFO: renamed from: a */
    public static final HashMap f2015a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f2016b;

    static {
        DynamicRange dynamicRange;
        HashMap map = new HashMap();
        f2015a = map;
        HashMap map2 = new HashMap();
        f2016b = map2;
        DynamicRange dynamicRange2 = DynamicRange.f2247d;
        map.put(1L, dynamicRange2);
        map2.put(dynamicRange2, Collections.singletonList(1L));
        map.put(2L, DynamicRange.f2248e);
        map2.put((DynamicRange) map.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange3 = DynamicRange.f2249f;
        map.put(4L, dynamicRange3);
        map2.put(dynamicRange3, Collections.singletonList(4L));
        DynamicRange dynamicRange4 = DynamicRange.f2250g;
        map.put(8L, dynamicRange4);
        map2.put(dynamicRange4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dynamicRange = DynamicRange.f2251h;
            if (!zHasNext) {
                break;
            }
            f2015a.put((Long) it.next(), dynamicRange);
        }
        f2016b.put(dynamicRange, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            DynamicRange dynamicRange5 = DynamicRange.f2252i;
            if (!zHasNext2) {
                f2016b.put(dynamicRange5, listAsList2);
                return;
            } else {
                f2015a.put((Long) it2.next(), dynamicRange5);
            }
        }
    }

    @Nullable
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static Long m1106a(@NonNull DynamicRange dynamicRange, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f2016b.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set setM97s = AbstractC0024a.m97s(dynamicRangeProfiles);
        for (Long l : list) {
            if (setM97s.contains(l)) {
                return l;
            }
        }
        return null;
    }

    @Nullable
    @DoNotInline
    /* JADX INFO: renamed from: b */
    public static DynamicRange m1107b(long j) {
        return (DynamicRange) f2015a.get(Long.valueOf(j));
    }
}
