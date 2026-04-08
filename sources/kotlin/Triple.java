package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class Triple<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f51439a;

    /* JADX INFO: renamed from: b */
    public final Object f51440b;

    /* JADX INFO: renamed from: c */
    public final Object f51441c;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.f51439a = obj;
        this.f51440b = obj2;
        this.f51441c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.m18594b(this.f51439a, triple.f51439a) && Intrinsics.m18594b(this.f51440b, triple.f51440b) && Intrinsics.m18594b(this.f51441c, triple.f51441c);
    }

    public final int hashCode() {
        Object obj = this.f51439a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f51440b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f51441c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f51439a + ", " + this.f51440b + ", " + this.f51441c + ')';
    }
}
