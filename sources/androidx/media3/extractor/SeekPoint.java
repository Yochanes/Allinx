package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SeekPoint {

    /* JADX INFO: renamed from: c */
    public static final SeekPoint f28269c = new SeekPoint(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f28270a;

    /* JADX INFO: renamed from: b */
    public final long f28271b;

    public SeekPoint(long j, long j2) {
        this.f28270a = j;
        this.f28271b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.f28270a == seekPoint.f28270a && this.f28271b == seekPoint.f28271b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f28270a) * 31) + ((int) this.f28271b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f28270a);
        sb.append(", position=");
        return AbstractC0000a.m12i(this.f28271b, "]", sb);
    }
}
