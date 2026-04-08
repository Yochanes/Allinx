package androidx.media3.exoplayer.video;

import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class FixedFrameRateEstimator {

    /* JADX INFO: renamed from: a */
    public Matcher f27800a;

    /* JADX INFO: renamed from: b */
    public Matcher f27801b;

    /* JADX INFO: renamed from: c */
    public boolean f27802c;

    /* JADX INFO: renamed from: d */
    public long f27803d;

    /* JADX INFO: renamed from: e */
    public int f27804e;

    /* JADX INFO: compiled from: Proguard */
    public static final class Matcher {

        /* JADX INFO: renamed from: a */
        public long f27805a;

        /* JADX INFO: renamed from: b */
        public long f27806b;

        /* JADX INFO: renamed from: c */
        public long f27807c;

        /* JADX INFO: renamed from: d */
        public long f27808d;

        /* JADX INFO: renamed from: e */
        public long f27809e;

        /* JADX INFO: renamed from: f */
        public long f27810f;

        /* JADX INFO: renamed from: g */
        public final boolean[] f27811g = new boolean[15];

        /* JADX INFO: renamed from: h */
        public int f27812h;

        /* JADX INFO: renamed from: a */
        public final boolean m10697a() {
            return this.f27808d > 15 && this.f27812h == 0;
        }

        /* JADX INFO: renamed from: b */
        public final void m10698b(long j) {
            long j2 = this.f27808d;
            if (j2 == 0) {
                this.f27805a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f27805a;
                this.f27806b = j3;
                this.f27810f = j3;
                this.f27809e = 1L;
            } else {
                long j4 = j - this.f27807c;
                int i = (int) (j2 % 15);
                long jAbs = Math.abs(j4 - this.f27806b);
                boolean[] zArr = this.f27811g;
                if (jAbs <= 1000000) {
                    this.f27809e++;
                    this.f27810f += j4;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f27812h--;
                    }
                } else if (!zArr[i]) {
                    zArr[i] = true;
                    this.f27812h++;
                }
            }
            this.f27808d++;
            this.f27807c = j;
        }

        /* JADX INFO: renamed from: c */
        public final void m10699c() {
            this.f27808d = 0L;
            this.f27809e = 0L;
            this.f27810f = 0L;
            this.f27812h = 0;
            Arrays.fill(this.f27811g, false);
        }
    }
}
