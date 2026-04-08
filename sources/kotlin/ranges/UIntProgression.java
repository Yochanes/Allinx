package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final int f51697a;

    /* JADX INFO: renamed from: b */
    public final int f51698b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public UIntProgression() {
        int i = 0;
        if (Integer.compare(Integer.MAX_VALUE, Integer.MIN_VALUE) < 0) {
            long j = ((long) 1) & 4294967295L;
            int i2 = (int) ((((long) 0) & 4294967295L) % j);
            int i3 = (int) ((((long) (-1)) & 4294967295L) % j);
            int iCompare = Integer.compare(i2 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i3);
            int i4 = i2 - i3;
            i = 0 - (iCompare < 0 ? i4 + 1 : i4);
        }
        this.f51697a = i;
        this.f51698b = 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UIntProgression)) {
            return false;
        }
        if (isEmpty() && ((UIntProgression) obj).isEmpty()) {
            return true;
        }
        UIntProgression uIntProgression = (UIntProgression) obj;
        uIntProgression.getClass();
        return this.f51697a == uIntProgression.f51697a && this.f51698b == uIntProgression.f51698b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((-31) + this.f51697a) * 31) + this.f51698b;
    }

    public boolean isEmpty() {
        int i = this.f51698b;
        int i2 = this.f51697a;
        return i > 0 ? Integer.compare(Integer.MAX_VALUE, i2 ^ Integer.MIN_VALUE) > 0 : Integer.compare(Integer.MAX_VALUE, i2 ^ Integer.MIN_VALUE) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.f51697a, this.f51698b);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f51697a;
        int i2 = this.f51698b;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m18315a(-1));
            sb.append("..");
            sb.append((Object) UInt.m18315a(i));
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m18315a(-1));
            sb.append(" downTo ");
            sb.append((Object) UInt.m18315a(i));
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
