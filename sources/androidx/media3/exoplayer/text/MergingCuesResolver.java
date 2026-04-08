package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class MergingCuesResolver implements CuesResolver {

    /* JADX INFO: renamed from: b */
    public static final Ordering f27526b = Ordering.natural().onResultOf(new C1901a(0)).compound(Ordering.natural().reverse().onResultOf(new C1901a(1)));

    /* JADX INFO: renamed from: a */
    public final ArrayList f27527a = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    /* JADX INFO: renamed from: a */
    public final long mo10623a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f27527a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((CuesWithTiming) arrayList.get(i)).f28976b;
            long j3 = ((CuesWithTiming) arrayList.get(i)).f28978d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /* JADX INFO: renamed from: b */
    public final ImmutableList mo10624b(long j) {
        ArrayList arrayList = this.f27527a;
        if (!arrayList.isEmpty()) {
            if (j >= ((CuesWithTiming) arrayList.get(0)).f28976b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i);
                    if (j >= cuesWithTiming.f28976b && j < cuesWithTiming.f28978d) {
                        arrayList2.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.f28976b) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(f27526b, arrayList2);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
                    builder.addAll((Iterable) ((CuesWithTiming) immutableListSortedCopyOf.get(i2)).f28975a);
                }
                return builder.build();
            }
        }
        return ImmutableList.m14824of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    /* JADX INFO: renamed from: c */
    public final boolean mo10625c(CuesWithTiming cuesWithTiming, long j) {
        long j2 = cuesWithTiming.f28976b;
        Assertions.m9460a(j2 != -9223372036854775807L);
        Assertions.m9460a(cuesWithTiming.f28977c != -9223372036854775807L);
        boolean z2 = j2 <= j && j < cuesWithTiming.f28978d;
        ArrayList arrayList = this.f27527a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((CuesWithTiming) arrayList.get(size)).f28976b) {
                arrayList.add(size + 1, cuesWithTiming);
                return z2;
            }
        }
        arrayList.add(0, cuesWithTiming);
        return z2;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void clear() {
        this.f27527a.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    /* JADX INFO: renamed from: d */
    public final long mo10626d(long j) {
        ArrayList arrayList = this.f27527a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((CuesWithTiming) arrayList.get(0)).f28976b) {
            return -9223372036854775807L;
        }
        long jMax = ((CuesWithTiming) arrayList.get(0)).f28976b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((CuesWithTiming) arrayList.get(i)).f28976b;
            long j3 = ((CuesWithTiming) arrayList.get(i)).f28978d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    /* JADX INFO: renamed from: e */
    public final void mo10627e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f27527a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((CuesWithTiming) arrayList.get(i)).f28976b;
            if (j > j2 && j > ((CuesWithTiming) arrayList.get(i)).f28978d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
