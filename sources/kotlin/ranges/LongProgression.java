package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/ranges/LongProgression;", "", "", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public class LongProgression implements Iterable<Long>, KMappedMarker {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LongProgression)) {
            return false;
        }
        if (isEmpty() && ((LongProgression) obj).isEmpty()) {
            return true;
        }
        ((LongProgression) obj).getClass();
        return 0 == 0 && 0 == 0 && 0 == 0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        return (int) (((((0 ^ (0 >>> 32)) * j) + (0 ^ (0 >>> 32))) * j) + (0 ^ (0 >>> 32)));
    }

    public boolean isEmpty() {
        return 0 > 0 ? 0 > 0 : 0 < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new LongProgressionIterator(0L, 0L, 0L);
    }

    public String toString() {
        StringBuilder sb;
        if (0 > 0) {
            sb = new StringBuilder();
            sb.append(0L);
            sb.append("..");
            sb.append(0L);
            sb.append(" step ");
            sb.append(0L);
        } else {
            sb = new StringBuilder();
            sb.append(0L);
            sb.append(" downTo ");
            sb.append(0L);
            sb.append(" step ");
            sb.append(-0L);
        }
        return sb.toString();
    }
}
