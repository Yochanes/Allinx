package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SlowMotionData implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final ArrayList f28531a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Segment {

        /* JADX INFO: renamed from: a */
        public final long f28532a;

        /* JADX INFO: renamed from: b */
        public final long f28533b;

        /* JADX INFO: renamed from: c */
        public final int f28534c;

        public Segment(long j, long j2, int i) {
            Assertions.m9460a(j < j2);
            this.f28532a = j;
            this.f28533b = j2;
            this.f28534c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.f28532a == segment.f28532a && this.f28533b == segment.f28533b && this.f28534c == segment.f28534c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f28532a), Long.valueOf(this.f28533b), Integer.valueOf(this.f28534c));
        }

        public final String toString() {
            int i = Util.f25665a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.f28532a + ", endTimeMs=" + this.f28533b + ", speedDivisor=" + this.f28534c;
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f28531a = arrayList;
        boolean z2 = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f28533b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i)).f28532a < j) {
                    z2 = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i)).f28533b;
                    i++;
                }
            }
        }
        Assertions.m9460a(!z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f28531a.equals(((SlowMotionData) obj).f28531a);
    }

    public final int hashCode() {
        return this.f28531a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f28531a;
    }
}
