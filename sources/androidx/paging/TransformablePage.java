package androidx.paging;

import androidx.compose.animation.AbstractC0455a;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/TransformablePage;", "", "T", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class TransformablePage<T> {

    /* JADX INFO: renamed from: e */
    public static final TransformablePage f31352e = new TransformablePage(0, EmptyList.f51496a);

    /* JADX INFO: renamed from: a */
    public final int[] f31353a;

    /* JADX INFO: renamed from: b */
    public final List f31354b;

    /* JADX INFO: renamed from: c */
    public final int f31355c;

    /* JADX INFO: renamed from: d */
    public final List f31356d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/TransformablePage$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TransformablePage(int[] originalPageOffsets, List data, int i, List list) {
        Intrinsics.m18599g(originalPageOffsets, "originalPageOffsets");
        Intrinsics.m18599g(data, "data");
        this.f31353a = originalPageOffsets;
        this.f31354b = data;
        this.f31355c = i;
        this.f31356d = list;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder("If originalIndices (size = ");
        Intrinsics.m18596d(list);
        sb.append(list.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(data.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformablePage.class != obj.getClass()) {
            return false;
        }
        TransformablePage transformablePage = (TransformablePage) obj;
        return Arrays.equals(this.f31353a, transformablePage.f31353a) && Intrinsics.m18594b(this.f31354b, transformablePage.f31354b) && this.f31355c == transformablePage.f31355c && Intrinsics.m18594b(this.f31356d, transformablePage.f31356d);
    }

    public final int hashCode() {
        int iM2233h = (AbstractC0455a.m2233h(this.f31354b, Arrays.hashCode(this.f31353a) * 31, 31) + this.f31355c) * 31;
        List list = this.f31356d;
        return iM2233h + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.f31353a));
        sb.append(", data=");
        sb.append(this.f31354b);
        sb.append(", hintOriginalPageOffset=");
        sb.append(this.f31355c);
        sb.append(", hintOriginalIndices=");
        return AbstractC0455a.m2242q(sb, this.f31356d, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i, List data) {
        this(new int[]{i}, data, i, null);
        Intrinsics.m18599g(data, "data");
    }
}
