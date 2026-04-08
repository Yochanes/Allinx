package androidx.compose.animation;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float fMo2206b;
        LayerRenderer layerRenderer = (LayerRenderer) obj;
        float fMo2206b2 = -1.0f;
        if (layerRenderer.mo2206b() == 0.0f && (layerRenderer instanceof SharedElementInternalState)) {
            fMo2206b = -1.0f;
        } else {
            fMo2206b = layerRenderer.mo2206b();
        }
        Float fValueOf = Float.valueOf(fMo2206b);
        LayerRenderer layerRenderer2 = (LayerRenderer) obj2;
        if (layerRenderer2.mo2206b() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState)) {
        } else {
            fMo2206b2 = layerRenderer2.mo2206b();
        }
        return ComparisonsKt.m18545a(fValueOf, Float.valueOf(fMo2206b2));
    }
}
