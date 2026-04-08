package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.DefaultExtractorInput;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class PsBinarySearchSeeker extends BinarySearchSeeker {

    /* JADX INFO: compiled from: Proguard */
    public static final class PsScrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a */
        public final TimestampAdjuster f29674a;

        /* JADX INFO: renamed from: b */
        public final ParsableByteArray f29675b = new ParsableByteArray();

        public PsScrSeeker(TimestampAdjuster timestampAdjuster) {
            this.f29674a = timestampAdjuster;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0114 A[EDGE_INSN: B:68:0x0114->B:52:0x0114 BREAK  A[LOOP:1: B:38:0x00db->B:51:0x0103], SYNTHETIC] */
        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BinarySearchSeeker.TimestampSearchResult mo10776a(DefaultExtractorInput defaultExtractorInput, long j) {
            long j2 = defaultExtractorInput.f28182d;
            int iMin = (int) Math.min(20000L, defaultExtractorInput.f28181c - j2);
            ParsableByteArray parsableByteArray = this.f29675b;
            parsableByteArray.m9543D(iMin);
            defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, iMin, false);
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (parsableByteArray.m9548a() >= 4) {
                if (PsBinarySearchSeeker.m11074d(parsableByteArray.f25645b, parsableByteArray.f25644a) != 442) {
                    parsableByteArray.m9547H(1);
                } else {
                    parsableByteArray.m9547H(4);
                    long jM11076c = PsDurationReader.m11076c(parsableByteArray);
                    if (jM11076c != -9223372036854775807L) {
                        long jM9587b = this.f29674a.m9587b(jM11076c);
                        if (jM9587b > j) {
                            return j3 == -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(jM9587b, j2, -1) : new BinarySearchSeeker.TimestampSearchResult(-9223372036854775807L, j2 + ((long) i2), 0);
                        }
                        if (jM9587b + 100000 > j) {
                            return new BinarySearchSeeker.TimestampSearchResult(-9223372036854775807L, j2 + ((long) parsableByteArray.f25645b), 0);
                        }
                        j3 = jM9587b;
                        i2 = parsableByteArray.f25645b;
                    }
                    int i3 = parsableByteArray.f25646c;
                    if (parsableByteArray.m9548a() < 10) {
                        parsableByteArray.m9546G(i3);
                    } else {
                        parsableByteArray.m9547H(9);
                        int iM9568u = parsableByteArray.m9568u() & 7;
                        if (parsableByteArray.m9548a() < iM9568u) {
                            parsableByteArray.m9546G(i3);
                        } else {
                            parsableByteArray.m9547H(iM9568u);
                            if (parsableByteArray.m9548a() < 4) {
                                parsableByteArray.m9546G(i3);
                            } else {
                                if (PsBinarySearchSeeker.m11074d(parsableByteArray.f25645b, parsableByteArray.f25644a) == 443) {
                                    parsableByteArray.m9547H(4);
                                    int iM9540A = parsableByteArray.m9540A();
                                    if (parsableByteArray.m9548a() >= iM9540A) {
                                        parsableByteArray.m9547H(iM9540A);
                                        while (true) {
                                            if (parsableByteArray.m9548a() >= 4) {
                                                break;
                                            }
                                            int iM11074d = PsBinarySearchSeeker.m11074d(parsableByteArray.f25645b, parsableByteArray.f25644a);
                                            if (iM11074d == 442 || iM11074d == 441 || (iM11074d >>> 8) != 1) {
                                                break;
                                            }
                                            parsableByteArray.m9547H(4);
                                            if (parsableByteArray.m9548a() < 2) {
                                                parsableByteArray.m9546G(i3);
                                                break;
                                            }
                                            parsableByteArray.m9546G(Math.min(parsableByteArray.f25646c, parsableByteArray.f25645b + parsableByteArray.m9540A()));
                                        }
                                    } else {
                                        parsableByteArray.m9546G(i3);
                                    }
                                } else {
                                    while (true) {
                                        if (parsableByteArray.m9548a() >= 4) {
                                        }
                                        parsableByteArray.m9546G(Math.min(parsableByteArray.f25646c, parsableByteArray.f25645b + parsableByteArray.m9540A()));
                                    }
                                }
                            }
                        }
                    }
                    i = parsableByteArray.f25645b;
                }
            }
            return j3 != -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(j3, j2 + ((long) i), -2) : BinarySearchSeeker.TimestampSearchResult.f28162d;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        /* JADX INFO: renamed from: b */
        public final void mo10777b() {
            byte[] bArr = Util.f25667c;
            ParsableByteArray parsableByteArray = this.f29675b;
            parsableByteArray.getClass();
            parsableByteArray.m9544E(bArr.length, bArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m11074d(int i, byte[] bArr) {
        return (bArr[i + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }
}
