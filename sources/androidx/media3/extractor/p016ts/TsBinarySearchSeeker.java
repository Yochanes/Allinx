package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.DefaultExtractorInput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TsBinarySearchSeeker extends BinarySearchSeeker {

    /* JADX INFO: compiled from: Proguard */
    public static final class TsPcrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a */
        public final TimestampAdjuster f29711a;

        /* JADX INFO: renamed from: b */
        public final ParsableByteArray f29712b = new ParsableByteArray();

        /* JADX INFO: renamed from: c */
        public final int f29713c;

        public TsPcrSeeker(int i, TimestampAdjuster timestampAdjuster) {
            this.f29713c = i;
            this.f29711a = timestampAdjuster;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        
            if (r13 == r16) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
        
            return new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(r13, r4 + r6, -2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
        
            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.f28162d;
         */
        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BinarySearchSeeker.TimestampSearchResult mo10776a(DefaultExtractorInput defaultExtractorInput, long j) {
            long j2;
            long j3 = defaultExtractorInput.f28182d;
            int iMin = (int) Math.min(112800, defaultExtractorInput.f28181c - j3);
            ParsableByteArray parsableByteArray = this.f29712b;
            parsableByteArray.m9543D(iMin);
            defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, iMin, false);
            int i = parsableByteArray.f25646c;
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (true) {
                if (parsableByteArray.m9548a() < 188) {
                    j2 = -9223372036854775807L;
                    break;
                }
                byte[] bArr = parsableByteArray.f25644a;
                int i2 = parsableByteArray.f25645b;
                while (true) {
                    if (i2 >= i) {
                        j2 = -9223372036854775807L;
                        break;
                    }
                    j2 = -9223372036854775807L;
                    if (bArr[i2] == 71) {
                        break;
                    }
                    i2++;
                }
                int i3 = i2 + 188;
                if (i3 > i) {
                    break;
                }
                long jM11083a = TsUtil.m11083a(parsableByteArray, i2, this.f29713c);
                if (jM11083a != j2) {
                    long jM9587b = this.f29711a.m9587b(jM11083a);
                    if (jM9587b > j) {
                        return j6 == j2 ? new BinarySearchSeeker.TimestampSearchResult(jM9587b, j3, -1) : new BinarySearchSeeker.TimestampSearchResult(-9223372036854775807L, j3 + j5, 0);
                    }
                    j6 = jM9587b;
                    if (100000 + j6 > j) {
                        return new BinarySearchSeeker.TimestampSearchResult(-9223372036854775807L, j3 + ((long) i2), 0);
                    }
                    j5 = i2;
                }
                parsableByteArray.m9546G(i3);
                j4 = i3;
            }
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        /* JADX INFO: renamed from: b */
        public final void mo10777b() {
            byte[] bArr = Util.f25667c;
            ParsableByteArray parsableByteArray = this.f29712b;
            parsableByteArray.getClass();
            parsableByteArray.m9544E(bArr.length, bArr);
        }
    }
}
