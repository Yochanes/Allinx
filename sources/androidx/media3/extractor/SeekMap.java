package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface SeekMap {

    /* JADX INFO: compiled from: Proguard */
    public static final class SeekPoints {

        /* JADX INFO: renamed from: a */
        public final SeekPoint f28265a;

        /* JADX INFO: renamed from: b */
        public final SeekPoint f28266b;

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.f28265a = seekPoint;
            this.f28266b = seekPoint2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SeekPoints.class == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.f28265a.equals(seekPoints.f28265a) && this.f28266b.equals(seekPoints.f28266b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f28266b.hashCode() + (this.f28265a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            SeekPoint seekPoint = this.f28265a;
            sb.append(seekPoint);
            SeekPoint seekPoint2 = this.f28266b;
            if (seekPoint.equals(seekPoint2)) {
                str = "";
            } else {
                str = ", " + seekPoint2;
            }
            return AbstractC0000a.m19p(sb, str, "]");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Unseekable implements SeekMap {

        /* JADX INFO: renamed from: a */
        public final long f28267a;

        /* JADX INFO: renamed from: b */
        public final SeekPoints f28268b;

        public Unseekable(long j) {
            this(j, 0L);
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: d */
        public final boolean mo10589d() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: j */
        public final SeekPoints mo10590j(long j) {
            return this.f28268b;
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: l */
        public final long mo10548l() {
            return this.f28267a;
        }

        public Unseekable(long j, long j2) {
            this.f28267a = j;
            SeekPoint seekPoint = j2 == 0 ? SeekPoint.f28269c : new SeekPoint(0L, j2);
            this.f28268b = new SeekPoints(seekPoint, seekPoint);
        }
    }

    /* JADX INFO: renamed from: d */
    boolean mo10589d();

    /* JADX INFO: renamed from: j */
    SeekPoints mo10590j(long j);

    /* JADX INFO: renamed from: l */
    long mo10548l();
}
