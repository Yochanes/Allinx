package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class SubtitleExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final SubtitleParser f28984a;

    /* JADX INFO: renamed from: f */
    public TrackOutput f28989f;

    /* JADX INFO: renamed from: g */
    public int f28990g;

    /* JADX INFO: renamed from: e */
    public byte[] f28988e = Util.f25667c;

    /* JADX INFO: renamed from: d */
    public final ParsableByteArray f28987d = new ParsableByteArray();

    /* JADX INFO: renamed from: b */
    public final Format f28985b = null;

    /* JADX INFO: renamed from: c */
    public final ArrayList f28986c = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f28991h = 0;

    /* JADX INFO: renamed from: i */
    public long[] f28992i = Util.f25668d;

    /* JADX INFO: renamed from: j */
    public long f28993j = -9223372036854775807L;

    /* JADX INFO: compiled from: Proguard */
    public static class Sample implements Comparable<Sample> {

        /* JADX INFO: renamed from: a */
        public final long f28994a;

        /* JADX INFO: renamed from: b */
        public final byte[] f28995b;

        public Sample(byte[] bArr, long j) {
            this.f28994a = j;
            this.f28995b = bArr;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Sample sample) {
            return Long.compare(this.f28994a, sample.f28994a);
        }
    }

    public SubtitleExtractor(SubtitleParser subtitleParser) {
        this.f28984a = subtitleParser;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: a */
    public final void mo10503a(long j, long j2) {
        int i = this.f28991h;
        Assertions.m9464e((i == 0 || i == 5) ? false : true);
        this.f28993j = j2;
        if (this.f28991h == 2) {
            this.f28991h = 1;
        }
        if (this.f28991h == 4) {
            this.f28991h = 3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10959c(Sample sample) {
        Assertions.m9466g(this.f28989f);
        byte[] bArr = sample.f28995b;
        int length = bArr.length;
        ParsableByteArray parsableByteArray = this.f28987d;
        parsableByteArray.getClass();
        parsableByteArray.m9544E(bArr.length, bArr);
        this.f28989f.mo10800e(length, parsableByteArray);
        this.f28989f.mo9961f(sample.f28994a, 1, length, 0, null);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: f */
    public final boolean mo10504f(ExtractorInput extractorInput) {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: g */
    public final void mo10505g(ExtractorOutput extractorOutput) {
        Assertions.m9464e(this.f28991h == 0);
        TrackOutput trackOutputMo9960j = extractorOutput.mo9960j(0, 3);
        this.f28989f = trackOutputMo9960j;
        Format format = this.f28985b;
        if (format != null) {
            trackOutputMo9960j.mo10562d(format);
            extractorOutput.mo9959h();
            extractorOutput.mo9958a(new IndexSeekMap(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f28991h = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0080 A[EXC_TOP_SPLITTER, PHI: r15
      0x0080: PHI (r15v3 long) = (r15v4 long), (r15v5 long) binds: [B:32:0x007e, B:29:0x007a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo10506i(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        long j;
        int i = this.f28991h;
        Assertions.m9464e((i == 0 || i == 5) ? false : true);
        if (this.f28991h == 1) {
            int iCheckedCast = ((DefaultExtractorInput) extractorInput).f28181c != -1 ? Ints.checkedCast(((DefaultExtractorInput) extractorInput).f28181c) : 1024;
            if (iCheckedCast > this.f28988e.length) {
                this.f28988e = new byte[iCheckedCast];
            }
            this.f28990g = 0;
            this.f28991h = 2;
        }
        int i2 = this.f28991h;
        ArrayList arrayList = this.f28986c;
        if (i2 == 2) {
            byte[] bArr = this.f28988e;
            if (bArr.length == this.f28990g) {
                this.f28988e = Arrays.copyOf(bArr, bArr.length + UserMetadata.MAX_ATTRIBUTE_SIZE);
            }
            byte[] bArr2 = this.f28988e;
            int i3 = this.f28990g;
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            int i4 = defaultExtractorInput.read(bArr2, i3, bArr2.length - i3);
            if (i4 != -1) {
                this.f28990g += i4;
            }
            long j2 = defaultExtractorInput.f28181c;
            if (j2 != -1) {
                j = -1;
                if (this.f28990g == j2) {
                    try {
                        long j3 = this.f28993j;
                        this.f28984a.mo10960a(this.f28988e, 0, this.f28990g, j3 != -9223372036854775807L ? new SubtitleParser.OutputOptions(j3, true) : SubtitleParser.OutputOptions.f29000c, new C1968a(this, 0));
                        Collections.sort(arrayList);
                        this.f28992i = new long[arrayList.size()];
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            this.f28992i[i5] = ((Sample) arrayList.get(i5)).f28994a;
                        }
                        this.f28988e = Util.f25667c;
                        this.f28991h = 4;
                    } catch (RuntimeException e) {
                        throw ParserException.m9344a(e, "SubtitleParser failed.");
                    }
                }
            } else {
                j = -1;
            }
            if (i4 == -1) {
            }
        } else {
            j = -1;
        }
        if (this.f28991h == 3) {
            if (((DefaultExtractorInput) extractorInput).m10791o(((DefaultExtractorInput) extractorInput).f28181c != j ? Ints.checkedCast(((DefaultExtractorInput) extractorInput).f28181c) : UserMetadata.MAX_ATTRIBUTE_SIZE) == -1) {
                long j4 = this.f28993j;
                for (int iM9613d = j4 == -9223372036854775807L ? 0 : Util.m9613d(this.f28992i, j4, true); iM9613d < arrayList.size(); iM9613d++) {
                    m10959c((Sample) arrayList.get(iM9613d));
                }
                this.f28991h = 4;
            }
        }
        return this.f28991h == 4 ? -1 : 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        if (this.f28991h == 5) {
            return;
        }
        this.f28984a.reset();
        this.f28991h = 5;
    }
}
