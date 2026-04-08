package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class DefaultOggSeeker implements OggSeeker {

    /* JADX INFO: renamed from: a */
    public final OggPageHeader f28912a;

    /* JADX INFO: renamed from: b */
    public final long f28913b;

    /* JADX INFO: renamed from: c */
    public final long f28914c;

    /* JADX INFO: renamed from: d */
    public final StreamReader f28915d;

    /* JADX INFO: renamed from: e */
    public int f28916e;

    /* JADX INFO: renamed from: f */
    public long f28917f;

    /* JADX INFO: renamed from: g */
    public long f28918g;

    /* JADX INFO: renamed from: h */
    public long f28919h;

    /* JADX INFO: renamed from: i */
    public long f28920i;

    /* JADX INFO: renamed from: j */
    public long f28921j;

    /* JADX INFO: renamed from: k */
    public long f28922k;

    /* JADX INFO: renamed from: l */
    public long f28923l;

    /* JADX INFO: compiled from: Proguard */
    public final class OggSeekMap implements SeekMap {
        public OggSeekMap() {
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: d */
        public final boolean mo10589d() {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: j */
        public final SeekMap.SeekPoints mo10590j(long j) {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) defaultOggSeeker.f28915d.f28957i) * j) / 1000000);
            long j2 = defaultOggSeeker.f28914c;
            long j3 = defaultOggSeeker.f28913b;
            SeekPoint seekPoint = new SeekPoint(j, Util.m9619j((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(defaultOggSeeker.f28917f)).longValue() + j3) - 30000, defaultOggSeeker.f28913b, j2 - 1));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: l */
        public final long mo10548l() {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            return (defaultOggSeeker.f28917f * 1000000) / ((long) defaultOggSeeker.f28915d.f28957i);
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j, long j2, long j3, long j4, boolean z2) {
        Assertions.m9460a(j >= 0 && j2 > j);
        this.f28915d = streamReader;
        this.f28913b = j;
        this.f28914c = j2;
        if (j3 == j2 - j || z2) {
            this.f28917f = j4;
            this.f28916e = 4;
        } else {
            this.f28916e = 0;
        }
        this.f28912a = new OggPageHeader();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // androidx.media3.extractor.ogg.OggSeeker
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo10935a(DefaultExtractorInput defaultExtractorInput) throws IOException {
        OggPageHeader oggPageHeader;
        long j;
        ?? r4;
        long j2;
        long j3;
        OggPageHeader oggPageHeader2;
        long jM9619j;
        int i = this.f28916e;
        long j4 = this.f28914c;
        OggPageHeader oggPageHeader3 = this.f28912a;
        if (i == 0) {
            oggPageHeader = oggPageHeader3;
            j = 0;
            long j5 = defaultExtractorInput.f28182d;
            this.f28918g = j5;
            this.f28916e = 1;
            long j6 = j4 - 65307;
            if (j6 > j5) {
                return j6;
            }
            r4 = 0;
        } else if (i != 1) {
            if (i == 2) {
                j2 = 2;
                long j7 = this.f28920i;
                long j8 = this.f28921j;
                if (j7 == j8) {
                    jM9619j = -1;
                    j3 = -1;
                    oggPageHeader2 = oggPageHeader3;
                    if (jM9619j == j3) {
                        return jM9619j;
                    }
                    this.f28916e = 3;
                } else {
                    long j9 = defaultExtractorInput.f28182d;
                    if (oggPageHeader3.m10945b(defaultExtractorInput, j8)) {
                        oggPageHeader3.m10944a(defaultExtractorInput, false);
                        defaultExtractorInput.f28184f = 0;
                        long j10 = this.f28919h;
                        long j11 = oggPageHeader3.f28940b;
                        long j12 = j10 - j11;
                        int i2 = oggPageHeader3.f28942d + oggPageHeader3.f28943e;
                        if (0 > j12 || j12 >= 72000) {
                            if (j12 < 0) {
                                this.f28921j = j9;
                                this.f28923l = j11;
                            } else {
                                this.f28920i = defaultExtractorInput.f28182d + ((long) i2);
                                this.f28922k = j11;
                            }
                            long j13 = this.f28921j;
                            long j14 = this.f28920i;
                            if (j13 - j14 < 100000) {
                                this.f28921j = j14;
                                j3 = -1;
                                oggPageHeader2 = oggPageHeader3;
                                jM9619j = j14;
                            } else {
                                j3 = -1;
                                oggPageHeader2 = oggPageHeader3;
                                jM9619j = Util.m9619j((((j13 - j14) * j12) / (this.f28923l - this.f28922k)) + (defaultExtractorInput.f28182d - (((long) i2) * (j12 <= 0 ? 2L : 1L))), j14, j13 - 1);
                            }
                            if (jM9619j == j3) {
                            }
                        }
                        jM9619j = -1;
                        j3 = -1;
                        oggPageHeader2 = oggPageHeader3;
                        if (jM9619j == j3) {
                        }
                    } else {
                        jM9619j = this.f28920i;
                        if (jM9619j == j9) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j3 = -1;
                        oggPageHeader2 = oggPageHeader3;
                        if (jM9619j == j3) {
                        }
                    }
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j3 = -1;
                oggPageHeader2 = oggPageHeader3;
                j2 = 2;
            }
            long j15 = j3;
            while (true) {
                oggPageHeader2.m10945b(defaultExtractorInput, j15);
                oggPageHeader2.m10944a(defaultExtractorInput, false);
                if (oggPageHeader2.f28940b > this.f28919h) {
                    defaultExtractorInput.f28184f = 0;
                    this.f28916e = 4;
                    return -(this.f28922k + j2);
                }
                defaultExtractorInput.mo10785h(oggPageHeader2.f28942d + oggPageHeader2.f28943e);
                this.f28920i = defaultExtractorInput.f28182d;
                this.f28922k = oggPageHeader2.f28940b;
                j15 = -1;
            }
        } else {
            oggPageHeader = oggPageHeader3;
            j = 0;
            r4 = 0;
        }
        oggPageHeader.f28939a = r4;
        oggPageHeader.f28940b = j;
        oggPageHeader.f28941c = r4;
        oggPageHeader.f28942d = r4;
        oggPageHeader.f28943e = r4;
        if (!oggPageHeader.m10945b(defaultExtractorInput, -1L)) {
            throw new EOFException();
        }
        oggPageHeader.m10944a(defaultExtractorInput, r4);
        defaultExtractorInput.mo10785h(oggPageHeader.f28942d + oggPageHeader.f28943e);
        long j16 = oggPageHeader.f28940b;
        while ((oggPageHeader.f28939a & 4) != 4 && oggPageHeader.m10945b(defaultExtractorInput, -1L) && defaultExtractorInput.f28182d < j4 && oggPageHeader.m10944a(defaultExtractorInput, true)) {
            try {
                defaultExtractorInput.mo10785h(oggPageHeader.f28942d + oggPageHeader.f28943e);
                j16 = oggPageHeader.f28940b;
            } catch (EOFException unused) {
            }
        }
        this.f28917f = j16;
        this.f28916e = 4;
        return this.f28918g;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    /* JADX INFO: renamed from: b */
    public final SeekMap mo10936b() {
        if (this.f28917f != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    /* JADX INFO: renamed from: c */
    public final void mo10937c(long j) {
        this.f28919h = Util.m9619j(j, 0L, this.f28917f - 1);
        this.f28916e = 2;
        this.f28920i = this.f28913b;
        this.f28921j = this.f28914c;
        this.f28922k = 0L;
        this.f28923l = this.f28917f;
    }
}
