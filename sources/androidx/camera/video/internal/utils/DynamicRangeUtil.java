package androidx.camera.video.internal.utils;

import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DynamicRangeUtil {

    /* JADX INFO: renamed from: a */
    public static final HashMap f3484a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f3485b;

    /* JADX INFO: renamed from: c */
    public static final HashMap f3486c;

    static {
        HashMap map = new HashMap();
        f3484a = map;
        HashMap map2 = new HashMap();
        f3485b = map2;
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        f3486c = map4;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(0, 1);
        map3.put(1, 3);
        map3.put(2, 4);
        map3.put(3, 5);
        map3.put(4, 6);
        HashMap map5 = new HashMap();
        DynamicRange dynamicRange = DynamicRange.f2247d;
        map5.put(dynamicRange, 1);
        DynamicRange dynamicRange2 = DynamicRange.f2248e;
        map5.put(dynamicRange2, 2);
        DynamicRange dynamicRange3 = DynamicRange.f2249f;
        map5.put(dynamicRange3, 4096);
        DynamicRange dynamicRange4 = DynamicRange.f2250g;
        Integer numValueOf = Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        map5.put(dynamicRange4, numValueOf);
        HashMap map6 = new HashMap();
        map6.put(dynamicRange, 1);
        map6.put(dynamicRange2, 2);
        map6.put(dynamicRange3, 4096);
        map6.put(dynamicRange4, numValueOf);
        HashMap map7 = new HashMap();
        map7.put(dynamicRange, 1);
        map7.put(dynamicRange2, 4);
        map7.put(dynamicRange3, 4096);
        map7.put(dynamicRange4, 16384);
        HashMap map8 = new HashMap();
        map8.put(DynamicRange.f2251h, 256);
        map8.put(DynamicRange.f2252i, 512);
        map4.put("video/hevc", map5);
        map4.put("video/av01", map6);
        map4.put("video/x-vnd.on2.vp9", map7);
        map4.put("video/dolby-vision", map8);
    }
}
