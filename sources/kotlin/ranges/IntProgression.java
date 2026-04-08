package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/ranges/IntProgression;", "", "", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public class IntProgression implements Iterable<Integer>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final int f51685a;

    /* JADX INFO: renamed from: b */
    public final int f51686b;

    /* JADX INFO: renamed from: c */
    public final int f51687c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public IntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f51685a = i;
        this.f51686b = ProgressionUtilKt.m18565a(i, i2, i3);
        this.f51687c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IntProgression)) {
            return false;
        }
        if (isEmpty() && ((IntProgression) obj).isEmpty()) {
            return true;
        }
        IntProgression intProgression = (IntProgression) obj;
        return this.f51685a == intProgression.f51685a && this.f51686b == intProgression.f51686b && this.f51687c == intProgression.f51687c;
    }

    /* JADX INFO: renamed from: g */
    public final IntProgressionIterator m18652g() {
        return new IntProgressionIterator(this.f51685a, this.f51686b, this.f51687c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f51685a * 31) + this.f51686b) * 31) + this.f51687c;
    }

    public boolean isEmpty() {
        int i = this.f51687c;
        int i2 = this.f51686b;
        int i3 = this.f51685a;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Integer> iterator() {
        return m18652g();
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f51686b;
        int i2 = this.f51685a;
        int i3 = this.f51687c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
