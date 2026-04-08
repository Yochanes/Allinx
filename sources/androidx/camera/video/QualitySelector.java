package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class QualitySelector {

    /* JADX INFO: renamed from: a */
    public final List f3314a;

    /* JADX INFO: renamed from: b */
    public final FallbackStrategy f3315b;

    public QualitySelector(List list, FallbackStrategy fallbackStrategy) {
        Preconditions.m7695b((list.isEmpty() && fallbackStrategy == FallbackStrategy.f3301a) ? false : true, "No preferred quality and fallback strategy.");
        this.f3314a = Collections.unmodifiableList(new ArrayList(list));
        this.f3315b = fallbackStrategy;
    }

    /* JADX INFO: renamed from: a */
    public static QualitySelector m1822a(List list, FallbackStrategy fallbackStrategy) {
        Preconditions.m7698e(list, "qualities cannot be null");
        Preconditions.m7695b(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Quality quality = (Quality) it.next();
            Preconditions.m7695b(Quality.f3309h.contains(quality), "qualities contain invalid quality: " + quality);
        }
        return new QualitySelector(list, fallbackStrategy);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f3314a + ", fallbackStrategy=" + this.f3315b + "}";
    }
}
