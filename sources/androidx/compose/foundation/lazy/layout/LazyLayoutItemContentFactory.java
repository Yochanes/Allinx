package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "CachedItemContent", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyLayoutItemContentFactory {

    /* JADX INFO: renamed from: a */
    public final SaveableStateHolder f7288a;

    /* JADX INFO: renamed from: b */
    public final Function0 f7289b;

    /* JADX INFO: renamed from: c */
    public final MutableScatterMap f7290c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class CachedItemContent {

        /* JADX INFO: renamed from: a */
        public final Object f7291a;

        /* JADX INFO: renamed from: b */
        public final Object f7292b;

        /* JADX INFO: renamed from: c */
        public int f7293c;

        /* JADX INFO: renamed from: d */
        public ComposableLambdaImpl f7294d;

        public CachedItemContent(int i, Object obj, Object obj2) {
            this.f7291a = obj;
            this.f7292b = obj2;
            this.f7293c = i;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, Function0 function0) {
        this.f7288a = saveableStateHolder;
        this.f7289b = function0;
        long[] jArr = ScatterMapKt.f3844a;
        this.f7290c = new MutableScatterMap();
    }

    /* JADX INFO: renamed from: a */
    public final Function2 m3054a(int i, Object obj, Object obj2) {
        MutableScatterMap mutableScatterMap = this.f7290c;
        CachedItemContent cachedItemContent = (CachedItemContent) mutableScatterMap.m2109e(obj);
        if (cachedItemContent != null && cachedItemContent.f7293c == i && Intrinsics.m18594b(cachedItemContent.f7292b, obj2)) {
            ComposableLambdaImpl composableLambdaImpl = cachedItemContent.f7294d;
            if (composableLambdaImpl != null) {
                return composableLambdaImpl;
            }
            ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(1403994769, new C0622xbaaa624f(LazyLayoutItemContentFactory.this, cachedItemContent), true);
            cachedItemContent.f7294d = composableLambdaImpl2;
            return composableLambdaImpl2;
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i, obj, obj2);
        mutableScatterMap.m2081m(obj, cachedItemContent2);
        ComposableLambdaImpl composableLambdaImpl3 = cachedItemContent2.f7294d;
        if (composableLambdaImpl3 != null) {
            return composableLambdaImpl3;
        }
        ComposableLambdaImpl composableLambdaImpl4 = new ComposableLambdaImpl(1403994769, new C0622xbaaa624f(this, cachedItemContent2), true);
        cachedItemContent2.f7294d = composableLambdaImpl4;
        return composableLambdaImpl4;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3055b(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.f7290c.m2109e(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.f7292b;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) this.f7289b).invoke();
        int iMo2923c = lazyLayoutItemProvider.mo2923c(obj);
        if (iMo2923c != -1) {
            return lazyLayoutItemProvider.mo2925e(iMo2923c);
        }
        return null;
    }
}
