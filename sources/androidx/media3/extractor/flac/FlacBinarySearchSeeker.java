package androidx.media3.extractor.flac;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacStreamMetadata;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a */
        public final FlacStreamMetadata f28374a;

        /* JADX INFO: renamed from: b */
        public final int f28375b;

        /* JADX INFO: renamed from: c */
        public final FlacFrameReader.SampleNumberHolder f28376c = new FlacFrameReader.SampleNumberHolder();

        public FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i) {
            this.f28374a = flacStreamMetadata;
            this.f28375b = i;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        /* JADX INFO: renamed from: a */
        public final BinarySearchSeeker.TimestampSearchResult mo10776a(DefaultExtractorInput defaultExtractorInput, long j) throws EOFException, InterruptedIOException {
            long j2 = defaultExtractorInput.f28182d;
            long jM10836c = m10836c(defaultExtractorInput);
            long jMo10782d = defaultExtractorInput.mo10782d();
            defaultExtractorInput.m10787k(Math.max(6, this.f28374a.f28216c), false);
            long jM10836c2 = m10836c(defaultExtractorInput);
            return (jM10836c > j || jM10836c2 <= j) ? jM10836c2 <= j ? new BinarySearchSeeker.TimestampSearchResult(jM10836c2, defaultExtractorInput.mo10782d(), -2) : new BinarySearchSeeker.TimestampSearchResult(jM10836c, j2, -1) : new BinarySearchSeeker.TimestampSearchResult(-9223372036854775807L, jMo10782d, 0);
        }

        /* JADX INFO: renamed from: c */
        public final long m10836c(DefaultExtractorInput defaultExtractorInput) throws EOFException, InterruptedIOException {
            long j;
            FlacFrameReader.SampleNumberHolder sampleNumberHolder;
            FlacStreamMetadata flacStreamMetadata;
            long j2;
            boolean zM10804a;
            int iM10789m;
            while (true) {
                long jMo10782d = defaultExtractorInput.mo10782d();
                j = defaultExtractorInput.f28181c;
                long j3 = j - 6;
                sampleNumberHolder = this.f28376c;
                flacStreamMetadata = this.f28374a;
                if (jMo10782d >= j3) {
                    j2 = 6;
                    break;
                }
                long jMo10782d2 = defaultExtractorInput.mo10782d();
                byte[] bArr = new byte[2];
                defaultExtractorInput.mo10781c(bArr, 0, 2, false);
                int i = ((bArr[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE);
                int i2 = this.f28375b;
                if (i != i2) {
                    defaultExtractorInput.f28184f = 0;
                    defaultExtractorInput.m10787k((int) (jMo10782d2 - defaultExtractorInput.f28182d), false);
                    j2 = 6;
                    zM10804a = false;
                } else {
                    j2 = 6;
                    ParsableByteArray parsableByteArray = new ParsableByteArray(16);
                    System.arraycopy(bArr, 0, parsableByteArray.f25644a, 0, 2);
                    byte[] bArr2 = parsableByteArray.f25644a;
                    int i3 = 0;
                    for (int i4 = 2; i3 < 14 && (iM10789m = defaultExtractorInput.m10789m(bArr2, i4 + i3, 14 - i3)) != -1; i4 = 2) {
                        i3 += iM10789m;
                    }
                    parsableByteArray.m9545F(i3);
                    defaultExtractorInput.f28184f = 0;
                    defaultExtractorInput.m10787k((int) (jMo10782d2 - defaultExtractorInput.f28182d), false);
                    zM10804a = FlacFrameReader.m10804a(parsableByteArray, flacStreamMetadata, i2, sampleNumberHolder);
                }
                if (zM10804a) {
                    break;
                }
                defaultExtractorInput.m10787k(1, false);
            }
            if (defaultExtractorInput.mo10782d() < j - j2) {
                return sampleNumberHolder.f28210a;
            }
            defaultExtractorInput.m10787k((int) (j - defaultExtractorInput.mo10782d()), false);
            return flacStreamMetadata.f28223j;
        }
    }
}
