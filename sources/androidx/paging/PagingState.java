package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingState;", "", "Key", "Value", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PagingState<Key, Value> {

    /* JADX INFO: renamed from: a */
    public final List f31195a;

    /* JADX INFO: renamed from: b */
    public final Integer f31196b;

    /* JADX INFO: renamed from: c */
    public final PagingConfig f31197c;

    /* JADX INFO: renamed from: d */
    public final int f31198d;

    public PagingState(List list, Integer num, PagingConfig pagingConfig, int i) {
        this.f31195a = list;
        this.f31196b = num;
        this.f31197c = pagingConfig;
        this.f31198d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) obj;
        return Intrinsics.m18594b(this.f31195a, pagingState.f31195a) && Intrinsics.m18594b(this.f31196b, pagingState.f31196b) && Intrinsics.m18594b(this.f31197c, pagingState.f31197c) && this.f31198d == pagingState.f31198d;
    }

    public final int hashCode() {
        int iHashCode = this.f31195a.hashCode();
        Integer num = this.f31196b;
        return Integer.hashCode(this.f31198d) + this.f31197c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.f31195a);
        sb.append(", anchorPosition=");
        sb.append(this.f31196b);
        sb.append(", config=");
        sb.append(this.f31197c);
        sb.append(", leadingPlaceholderCount=");
        return AbstractC0000a.m17n(sb, this.f31198d, ')');
    }
}
