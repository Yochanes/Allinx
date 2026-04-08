package androidx.camera.video;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class QualityRatioToResolutionsTable {

    /* JADX INFO: renamed from: b */
    public static final HashMap f3311b;

    /* JADX INFO: renamed from: c */
    public static final HashMap f3312c;

    /* JADX INFO: renamed from: a */
    public final HashMap f3313a = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class QualityRatio {
        /* JADX INFO: renamed from: a */
        public abstract int mo1807a();

        /* JADX INFO: renamed from: b */
        public abstract Quality mo1808b();
    }

    static {
        HashMap map = new HashMap();
        f3311b = map;
        map.put(Quality.f3305d, Range.create(2160, 4319));
        map.put(Quality.f3304c, Range.create(1080, 1439));
        map.put(Quality.f3303b, Range.create(720, 1079));
        map.put(Quality.f3302a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f3312c = map2;
        map2.put(0, AspectRatioUtil.f2841a);
        map2.put(1, AspectRatioUtil.f2843c);
    }

    public QualityRatioToResolutionsTable(List list, HashMap map) {
        HashMap map2;
        Integer num;
        Quality quality;
        HashMap map3 = f3311b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = f3312c;
            if (!zHasNext) {
                break;
            }
            Quality quality2 = (Quality) it.next();
            this.f3313a.put(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.f3313a.put(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.f3313a.get(new AutoValue_QualityRatioToResolutionsTable_QualityRatio((Quality) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    quality = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    quality = (Quality) entry2.getKey();
                    break;
                }
            }
            if (quality != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (AspectRatioUtil.m1579a(size, (Rational) entry3.getValue(), SizeUtil.f3013b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f3313a.get(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f3313a.entrySet()) {
            Size size2 = (Size) map.get(((QualityRatio) entry4.getKey()).mo1808b());
            if (size2 != null) {
                Size size3 = SizeUtil.f3012a;
                Collections.sort((List) entry4.getValue(), new C0378a(size2.getHeight() * size2.getWidth()));
            }
        }
    }
}
