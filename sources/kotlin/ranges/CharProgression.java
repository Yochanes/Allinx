package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/ranges/CharProgression;", "", "", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public class CharProgression implements Iterable<Character>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final char f51676a;

    /* JADX INFO: renamed from: b */
    public final char f51677b;

    /* JADX INFO: renamed from: c */
    public final int f51678c = 1;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public CharProgression(char c2, char c3) {
        this.f51676a = c2;
        this.f51677b = (char) ProgressionUtilKt.m18565a(c2, c3, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharProgression)) {
            return false;
        }
        if (isEmpty() && ((CharProgression) obj).isEmpty()) {
            return true;
        }
        CharProgression charProgression = (CharProgression) obj;
        return this.f51676a == charProgression.f51676a && this.f51677b == charProgression.f51677b && this.f51678c == charProgression.f51678c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f51676a * 31) + this.f51677b) * 31) + this.f51678c;
    }

    public boolean isEmpty() {
        int i = this.f51678c;
        char c2 = this.f51677b;
        char c3 = this.f51676a;
        return i > 0 ? Intrinsics.m18601i(c3, c2) > 0 : Intrinsics.m18601i(c3, c2) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new CharProgressionIterator(this.f51676a, this.f51677b, this.f51678c);
    }

    public String toString() {
        StringBuilder sb;
        char c2 = this.f51677b;
        char c3 = this.f51676a;
        int i = this.f51678c;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(c3);
            sb.append("..");
            sb.append(c2);
            sb.append(" step ");
            sb.append(i);
        } else {
            sb = new StringBuilder();
            sb.append(c3);
            sb.append(" downTo ");
            sb.append(c2);
            sb.append(" step ");
            sb.append(-i);
        }
        return sb.toString();
    }
}
