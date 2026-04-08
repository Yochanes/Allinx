package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "", "T", "Lkotlin/ranges/ClosedRange;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface ClosedFloatingPointRange<T extends Comparable<? super T>> extends ClosedRange<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: c */
    boolean mo18650c(Comparable comparable, Comparable comparable2);

    boolean contains(Comparable comparable);
}
