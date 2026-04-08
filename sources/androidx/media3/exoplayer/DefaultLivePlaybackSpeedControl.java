package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {

    /* JADX INFO: renamed from: a */
    public final long f26011a;

    /* JADX INFO: renamed from: b */
    public final long f26012b;

    /* JADX INFO: renamed from: c */
    public final float f26013c;

    /* JADX INFO: renamed from: d */
    public long f26014d = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public long f26015e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f26017g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f26018h = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public float f26021k = 0.97f;

    /* JADX INFO: renamed from: j */
    public float f26020j = 1.03f;

    /* JADX INFO: renamed from: l */
    public float f26022l = 1.0f;

    /* JADX INFO: renamed from: m */
    public long f26023m = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public long f26016f = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f26019i = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public long f26024n = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public long f26025o = -9223372036854775807L;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    public DefaultLivePlaybackSpeedControl(float f, long j, long j2) {
        this.f26011a = j;
        this.f26012b = j2;
        this.f26013c = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m9797a() {
        long j;
        long j2 = this.f26014d;
        if (j2 != -9223372036854775807L) {
            j = this.f26015e;
            if (j == -9223372036854775807L) {
                long j3 = this.f26017g;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f26018h;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f26016f == j) {
            return;
        }
        this.f26016f = j;
        this.f26019i = j;
        this.f26024n = -9223372036854775807L;
        this.f26025o = -9223372036854775807L;
        this.f26023m = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final void m9798b(long j) {
        this.f26015e = j;
        m9797a();
    }
}
