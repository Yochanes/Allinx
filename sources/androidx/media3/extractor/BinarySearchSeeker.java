package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BinarySearchSeeker {

    /* JADX INFO: renamed from: a */
    public final BinarySearchSeekMap f28144a;

    /* JADX INFO: renamed from: b */
    public final TimestampSeeker f28145b;

    /* JADX INFO: renamed from: c */
    public SeekOperationParams f28146c;

    /* JADX INFO: renamed from: d */
    public final int f28147d;

    /* JADX INFO: compiled from: Proguard */
    public static class BinarySearchSeekMap implements SeekMap {

        /* JADX INFO: renamed from: a */
        public final SeekTimestampConverter f28148a;

        /* JADX INFO: renamed from: b */
        public final long f28149b;

        /* JADX INFO: renamed from: c */
        public final long f28150c;

        /* JADX INFO: renamed from: d */
        public final long f28151d;

        /* JADX INFO: renamed from: e */
        public final long f28152e;

        /* JADX INFO: renamed from: f */
        public final long f28153f;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j, long j2, long j3, long j4, long j5) {
            this.f28148a = seekTimestampConverter;
            this.f28149b = j;
            this.f28150c = j2;
            this.f28151d = j3;
            this.f28152e = j4;
            this.f28153f = j5;
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: d */
        public final boolean mo10589d() {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: j */
        public final SeekMap.SeekPoints mo10590j(long j) {
            SeekPoint seekPoint = new SeekPoint(j, SeekOperationParams.m10775a(this.f28148a.mo187c(j), 0L, this.f28150c, this.f28151d, this.f28152e, this.f28153f));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: l */
        public final long mo10548l() {
            return this.f28149b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SeekOperationParams {

        /* JADX INFO: renamed from: a */
        public final long f28154a;

        /* JADX INFO: renamed from: b */
        public final long f28155b;

        /* JADX INFO: renamed from: c */
        public final long f28156c;

        /* JADX INFO: renamed from: d */
        public long f28157d = 0;

        /* JADX INFO: renamed from: e */
        public long f28158e;

        /* JADX INFO: renamed from: f */
        public long f28159f;

        /* JADX INFO: renamed from: g */
        public long f28160g;

        /* JADX INFO: renamed from: h */
        public long f28161h;

        public SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6) {
            this.f28154a = j;
            this.f28155b = j2;
            this.f28158e = j3;
            this.f28159f = j4;
            this.f28160g = j5;
            this.f28156c = j6;
            this.f28161h = m10775a(j2, 0L, j3, j4, j5, j6);
        }

        /* JADX INFO: renamed from: a */
        public static long m10775a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return Util.m9619j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SeekTimestampConverter {
        /* JADX INFO: renamed from: c */
        long mo187c(long j);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimestampSearchResult {

        /* JADX INFO: renamed from: d */
        public static final TimestampSearchResult f28162d = new TimestampSearchResult(-9223372036854775807L, -1, -3);

        /* JADX INFO: renamed from: a */
        public final int f28163a;

        /* JADX INFO: renamed from: b */
        public final long f28164b;

        /* JADX INFO: renamed from: c */
        public final long f28165c;

        public TimestampSearchResult(long j, long j2, int i) {
            this.f28163a = i;
            this.f28164b = j;
            this.f28165c = j2;
        }
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j, long j2, long j3, long j4, long j5, int i) {
        this.f28145b = timestampSeeker;
        this.f28147d = i;
        this.f28144a = new BinarySearchSeekMap(seekTimestampConverter, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: b */
    public static int m10772b(DefaultExtractorInput defaultExtractorInput, long j, PositionHolder positionHolder) {
        if (j == defaultExtractorInput.f28182d) {
            return 0;
        }
        positionHolder.f28264a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        return m10772b(r28, r8, r29);
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m10773a(DefaultExtractorInput defaultExtractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        while (true) {
            SeekOperationParams seekOperationParams = this.f28146c;
            Assertions.m9466g(seekOperationParams);
            long j = seekOperationParams.f28159f;
            long j2 = seekOperationParams.f28160g;
            long j3 = seekOperationParams.f28161h;
            long j4 = j2 - j;
            long j5 = this.f28147d;
            TimestampSeeker timestampSeeker = this.f28145b;
            if (j4 <= j5) {
                this.f28146c = null;
                timestampSeeker.mo10777b();
                return m10772b(defaultExtractorInput, j, positionHolder);
            }
            long j6 = j3 - defaultExtractorInput.f28182d;
            if (j6 < 0 || j6 > 262144) {
                break;
            }
            defaultExtractorInput.mo10785h((int) j6);
            defaultExtractorInput.f28184f = 0;
            TimestampSearchResult timestampSearchResultMo10776a = timestampSeeker.mo10776a(defaultExtractorInput, seekOperationParams.f28155b);
            int i = timestampSearchResultMo10776a.f28163a;
            if (i == -3) {
                this.f28146c = null;
                timestampSeeker.mo10777b();
                return m10772b(defaultExtractorInput, j3, positionHolder);
            }
            long j7 = timestampSearchResultMo10776a.f28164b;
            long j8 = timestampSearchResultMo10776a.f28165c;
            if (i == -2) {
                seekOperationParams.f28157d = j7;
                seekOperationParams.f28159f = j8;
                seekOperationParams.f28161h = SeekOperationParams.m10775a(seekOperationParams.f28155b, j7, seekOperationParams.f28158e, j8, seekOperationParams.f28160g, seekOperationParams.f28156c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j9 = j8 - defaultExtractorInput.f28182d;
                    if (j9 >= 0 && j9 <= 262144) {
                        defaultExtractorInput.mo10785h((int) j9);
                    }
                    this.f28146c = null;
                    timestampSeeker.mo10777b();
                    return m10772b(defaultExtractorInput, j8, positionHolder);
                }
                seekOperationParams.f28158e = j7;
                seekOperationParams.f28160g = j8;
                seekOperationParams.f28161h = SeekOperationParams.m10775a(seekOperationParams.f28155b, seekOperationParams.f28157d, j7, seekOperationParams.f28159f, j8, seekOperationParams.f28156c);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10774c(long j) {
        SeekOperationParams seekOperationParams = this.f28146c;
        if (seekOperationParams == null || seekOperationParams.f28154a != j) {
            BinarySearchSeekMap binarySearchSeekMap = this.f28144a;
            this.f28146c = new SeekOperationParams(j, binarySearchSeekMap.f28148a.mo187c(j), binarySearchSeekMap.f28150c, binarySearchSeekMap.f28151d, binarySearchSeekMap.f28152e, binarySearchSeekMap.f28153f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TimestampSeeker {
        /* JADX INFO: renamed from: a */
        TimestampSearchResult mo10776a(DefaultExtractorInput defaultExtractorInput, long j);

        /* JADX INFO: renamed from: b */
        default void mo10777b() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
        /* JADX INFO: renamed from: c */
        public final long mo187c(long j) {
            return j;
        }
    }
}
