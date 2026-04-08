package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/comparisons/NaturalOrderComparator;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class NaturalOrderComparator implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: a */
    public static final NaturalOrderComparator f51570a = new NaturalOrderComparator();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a2 = comparable;
        Comparable<? super Object> b2 = comparable2;
        Intrinsics.m18599g(a2, "a");
        Intrinsics.m18599g(b2, "b");
        return a2.compareTo(b2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return ReverseOrderComparator.f51571a;
    }
}
