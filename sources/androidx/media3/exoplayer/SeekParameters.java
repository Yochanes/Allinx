package androidx.media3.exoplayer;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SeekParameters {

    /* JADX INFO: renamed from: c */
    public static final SeekParameters f26349c;

    /* JADX INFO: renamed from: a */
    public final long f26350a;

    /* JADX INFO: renamed from: b */
    public final long f26351b;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        new SeekParameters(Long.MAX_VALUE, 0L);
        new SeekParameters(0L, Long.MAX_VALUE);
        f26349c = seekParameters;
    }

    public SeekParameters(long j, long j2) {
        Assertions.m9460a(j >= 0);
        Assertions.m9460a(j2 >= 0);
        this.f26350a = j;
        this.f26351b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekParameters.class == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.f26350a == seekParameters.f26350a && this.f26351b == seekParameters.f26351b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f26350a) * 31) + ((int) this.f26351b);
    }
}
