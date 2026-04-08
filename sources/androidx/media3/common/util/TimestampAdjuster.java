package androidx.media3.common.util;

import java.math.RoundingMode;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TimestampAdjuster {

    /* JADX INFO: renamed from: a */
    public long f25661a;

    /* JADX INFO: renamed from: b */
    public long f25662b;

    /* JADX INFO: renamed from: c */
    public long f25663c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f25664d = new ThreadLocal();

    public TimestampAdjuster(long j) {
        m9590e(j);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m9586a(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f25662b != -9223372036854775807L)) {
                    long jLongValue = this.f25661a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.f25664d.get();
                        l.getClass();
                        jLongValue = l.longValue();
                    }
                    this.f25662b = jLongValue - j;
                    notifyAll();
                }
                this.f25663c = j;
                j2 = j + this.f25662b;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m9587b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f25663c;
            if (j2 != -9223372036854775807L) {
                int i = Util.f25665a;
                long jM9604N = Util.m9604N(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jM9604N) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jM9604N) < Math.abs(j5 - jM9604N) ? j4 : j5;
            }
            long j6 = j;
            int i2 = Util.f25665a;
            return m9586a(Util.m9604N(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m9588c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f25663c;
            if (j2 != -9223372036854775807L) {
                int i = Util.f25665a;
                long jM9604N = Util.m9604N(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jM9604N / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jM9604N ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            int i2 = Util.f25665a;
            return m9586a(Util.m9604N(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m9589d() {
        long j;
        j = this.f25661a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m9590e(long j) {
        this.f25661a = j;
        this.f25662b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f25663c = -9223372036854775807L;
    }
}
