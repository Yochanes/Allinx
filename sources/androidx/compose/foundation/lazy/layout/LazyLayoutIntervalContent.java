package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0002¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Interval", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Interval {
        default Function1 getKey() {
            return null;
        }

        default Function1 getType() {
            return LazyLayoutIntervalContent$Interval$type$1.f7211a;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m3034h(int i) {
        IntervalList.Interval intervalM3087b = mo2918i().m3087b(i);
        return intervalM3087b.f7188c.getType().invoke(Integer.valueOf(i - intervalM3087b.f7186a));
    }

    /* JADX INFO: renamed from: i */
    public abstract MutableIntervalList mo2918i();

    /* JADX INFO: renamed from: j */
    public final Object m3035j(int i) {
        Object objInvoke;
        IntervalList.Interval intervalM3087b = mo2918i().m3087b(i);
        int i2 = i - intervalM3087b.f7186a;
        Function1 key = intervalM3087b.f7188c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
