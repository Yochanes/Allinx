package androidx.media3.exoplayer;

import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodInfo {

    /* JADX INFO: renamed from: a */
    public final MediaSource.MediaPeriodId f26247a;

    /* JADX INFO: renamed from: b */
    public final long f26248b;

    /* JADX INFO: renamed from: c */
    public final long f26249c;

    /* JADX INFO: renamed from: d */
    public final long f26250d;

    /* JADX INFO: renamed from: e */
    public final long f26251e;

    /* JADX INFO: renamed from: f */
    public final boolean f26252f;

    /* JADX INFO: renamed from: g */
    public final boolean f26253g;

    /* JADX INFO: renamed from: h */
    public final boolean f26254h;

    /* JADX INFO: renamed from: i */
    public final boolean f26255i;

    /* JADX INFO: renamed from: j */
    public final boolean f26256j;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7 = true;
        Assertions.m9460a(!z6 || z4);
        Assertions.m9460a(!z5 || z4);
        if (z3 && (z4 || z5 || z6)) {
            z7 = false;
        }
        Assertions.m9460a(z7);
        this.f26247a = mediaPeriodId;
        this.f26248b = j;
        this.f26249c = j2;
        this.f26250d = j3;
        this.f26251e = j4;
        this.f26252f = z2;
        this.f26253g = z3;
        this.f26254h = z4;
        this.f26255i = z5;
        this.f26256j = z6;
    }

    /* JADX INFO: renamed from: a */
    public final MediaPeriodInfo m9975a(long j) {
        if (j == this.f26249c) {
            return this;
        }
        return new MediaPeriodInfo(this.f26247a, this.f26248b, j, this.f26250d, this.f26251e, this.f26252f, this.f26253g, this.f26254h, this.f26255i, this.f26256j);
    }

    /* JADX INFO: renamed from: b */
    public final MediaPeriodInfo m9976b(long j) {
        if (j == this.f26248b) {
            return this;
        }
        return new MediaPeriodInfo(this.f26247a, j, this.f26249c, this.f26250d, this.f26251e, this.f26252f, this.f26253g, this.f26254h, this.f26255i, this.f26256j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.f26248b == mediaPeriodInfo.f26248b && this.f26249c == mediaPeriodInfo.f26249c && this.f26250d == mediaPeriodInfo.f26250d && this.f26251e == mediaPeriodInfo.f26251e && this.f26252f == mediaPeriodInfo.f26252f && this.f26253g == mediaPeriodInfo.f26253g && this.f26254h == mediaPeriodInfo.f26254h && this.f26255i == mediaPeriodInfo.f26255i && this.f26256j == mediaPeriodInfo.f26256j && Objects.equals(this.f26247a, mediaPeriodInfo.f26247a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f26247a.hashCode() + 527) * 31) + ((int) this.f26248b)) * 31) + ((int) this.f26249c)) * 31) + ((int) this.f26250d)) * 31) + ((int) this.f26251e)) * 31) + (this.f26252f ? 1 : 0)) * 31) + (this.f26253g ? 1 : 0)) * 31) + (this.f26254h ? 1 : 0)) * 31) + (this.f26255i ? 1 : 0)) * 31) + (this.f26256j ? 1 : 0);
    }
}
