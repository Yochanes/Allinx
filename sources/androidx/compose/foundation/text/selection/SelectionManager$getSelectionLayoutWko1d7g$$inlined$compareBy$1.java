package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongIntMap;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableLongIntMap f9837a;

    public SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1(MutableLongIntMap mutableLongIntMap) {
        this.f9837a = mutableLongIntMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        MutableLongIntMap mutableLongIntMap = this.f9837a;
        return ComparisonsKt.m18545a(Integer.valueOf(mutableLongIntMap.m1995b(jLongValue)), Integer.valueOf(mutableLongIntMap.m1995b(((Number) obj2).longValue())));
    }
}
