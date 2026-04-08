package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class MatchGroup {

    /* JADX INFO: renamed from: a */
    public final String f55194a;

    /* JADX INFO: renamed from: b */
    public final IntRange f55195b;

    public MatchGroup(String str, IntRange intRange) {
        this.f55194a = str;
        this.f55195b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.m18594b(this.f55194a, matchGroup.f55194a) && Intrinsics.m18594b(this.f55195b, matchGroup.f55195b);
    }

    public final int hashCode() {
        return this.f55195b.hashCode() + (this.f55194a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f55194a + ", range=" + this.f55195b + ')';
    }
}
