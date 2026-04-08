package androidx.core.util;

import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Pair<F, S> {

    /* JADX INFO: renamed from: a */
    public final Object f23338a;

    /* JADX INFO: renamed from: b */
    public final Object f23339b;

    public Pair(Object obj, Object obj2) {
        this.f23338a = obj;
        this.f23339b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(pair.f23338a, this.f23338a) && Objects.equals(pair.f23339b, this.f23339b);
    }

    public final int hashCode() {
        Object obj = this.f23338a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f23339b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.f23338a);
        sb.append(" ");
        return AbstractC0000a.m18o(sb, this.f23339b, "}");
    }
}
