package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyGridSpanLayoutProvider {

    /* JADX INFO: renamed from: a */
    public final LazyGridIntervalContent f7108a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f7109b;

    /* JADX INFO: renamed from: c */
    public int f7110c;

    /* JADX INFO: renamed from: d */
    public int f7111d;

    /* JADX INFO: renamed from: e */
    public int f7112e;

    /* JADX INFO: renamed from: f */
    public int f7113f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7114g;

    /* JADX INFO: renamed from: h */
    public Object f7115h;

    /* JADX INFO: renamed from: i */
    public int f7116i;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Bucket {

        /* JADX INFO: renamed from: a */
        public final int f7117a;

        /* JADX INFO: renamed from: b */
        public final int f7118b;

        public Bucket(int i, int i2) {
            this.f7117a = i;
            this.f7118b = i2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        /* JADX INFO: renamed from: a */
        public static final LazyGridItemSpanScopeImpl f7119a = new LazyGridItemSpanScopeImpl();

        /* JADX INFO: renamed from: b */
        public static int f7120b;

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        /* JADX INFO: renamed from: a */
        public final int mo2988a() {
            return f7120b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class LineConfiguration {

        /* JADX INFO: renamed from: a */
        public final int f7121a;

        /* JADX INFO: renamed from: b */
        public final Object f7122b;

        public LineConfiguration(int i, List list) {
            this.f7121a = i;
            this.f7122b = list;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.f7108a = lazyGridIntervalContent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Bucket(0, 0));
        this.f7109b = arrayList;
        this.f7113f = -1;
        this.f7114g = new ArrayList();
        this.f7115h = EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: a */
    public final int m3011a() {
        return ((int) Math.sqrt((((double) m3014d()) * 1.0d) / ((double) this.f7116i))) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final LineConfiguration m3012b(int i) {
        ?? r0;
        this.f7108a.getClass();
        int i2 = this.f7116i;
        int i3 = i * i2;
        int iM3014d = m3014d() - i3;
        if (i2 > iM3014d) {
            i2 = iM3014d;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.f7115h.size()) {
            r0 = this.f7115h;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new GridItemSpan(LazyGridSpanKt.m3010a(1)));
            }
            this.f7115h = arrayList;
            r0 = arrayList;
        }
        return new LineConfiguration(i3, r0);
    }

    /* JADX INFO: renamed from: c */
    public final int m3013c(int i) {
        if (m3014d() <= 0) {
            return 0;
        }
        if (i >= m3014d()) {
            InlineClassHelperKt.m2705a("ItemIndex > total count");
        }
        this.f7108a.getClass();
        return i / this.f7116i;
    }

    /* JADX INFO: renamed from: d */
    public final int m3014d() {
        return this.f7108a.f6978b.f7432b;
    }

    /* JADX INFO: renamed from: e */
    public final int m3015e(int i) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.f7119a;
        LazyGridItemSpanScopeImpl.f7120b = this.f7116i;
        IntervalList.Interval intervalM3087b = this.f7108a.f6978b.m3087b(i);
        return (int) ((GridItemSpan) ((LazyGridInterval) intervalM3087b.f7188c).f6973a.invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i - intervalM3087b.f7186a))).f6945a;
    }
}
