package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f51426a;

    /* JADX INFO: renamed from: b */
    public final Object f51427b;

    public Pair(Object obj, Object obj2) {
        this.f51426a = obj;
        this.f51427b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static Pair m18308a(Pair pair, Integer num, Object obj, int i) {
        Object obj2 = num;
        if ((i & 1) != 0) {
            obj2 = pair.f51426a;
        }
        if ((i & 2) != 0) {
            obj = pair.f51427b;
        }
        pair.getClass();
        return new Pair(obj2, obj);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getF51426a() {
        return this.f51426a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getF51427b() {
        return this.f51427b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.m18594b(this.f51426a, pair.f51426a) && Intrinsics.m18594b(this.f51427b, pair.f51427b);
    }

    public final int hashCode() {
        Object obj = this.f51426a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f51427b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f51426a + ", " + this.f51427b + ')';
    }
}
