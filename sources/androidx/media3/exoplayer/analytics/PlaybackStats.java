package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PlaybackStats {

    /* JADX INFO: renamed from: a */
    public final List f26439a;

    /* JADX INFO: renamed from: b */
    public final List f26440b;

    /* JADX INFO: renamed from: c */
    public final List f26441c;

    /* JADX INFO: renamed from: d */
    public final List f26442d;

    /* JADX INFO: renamed from: e */
    public final List f26443e;

    /* JADX INFO: renamed from: f */
    public final List f26444f;

    /* JADX INFO: compiled from: Proguard */
    public static final class EventTimeAndException {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EventTimeAndFormat {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndFormat.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EventTimeAndPlaybackState {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        new PlaybackStats(0, new long[16], list, list, -9223372036854775807L, 0, 0, 0, 0, -9223372036854775807L, 0, 0, 0, 0, 0, -9223372036854775807L, 0, list, list, 0L, 0L, 0L, 0L, 0L, 0L, 0, 0, -1, -1L, 0, -1L, 0L, 0L, 0L, 0L, 0, 0, 0, list, list);
    }

    public PlaybackStats(int i, long[] jArr, List list, List list2, long j, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, List list3, List list4, long j4, long j5, long j6, long j7, long j8, long j9, int i12, int i13, int i14, long j10, int i15, long j11, long j12, long j13, long j14, long j15, int i16, int i17, int i18, List list5, List list6) {
        this.f26439a = Collections.unmodifiableList(list);
        this.f26440b = Collections.unmodifiableList(list2);
        this.f26441c = Collections.unmodifiableList(list3);
        this.f26442d = Collections.unmodifiableList(list4);
        this.f26443e = Collections.unmodifiableList(list5);
        this.f26444f = Collections.unmodifiableList(list6);
    }
}
