package androidx.media3.extractor.mkv;

import androidx.media3.extractor.DefaultExtractorInput;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class DefaultEbmlReader implements EbmlReader {

    /* JADX INFO: renamed from: a */
    public final byte[] f28549a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f28550b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final VarintReader f28551c = new VarintReader();

    /* JADX INFO: renamed from: d */
    public EbmlProcessor f28552d;

    /* JADX INFO: renamed from: e */
    public int f28553e;

    /* JADX INFO: renamed from: f */
    public int f28554f;

    /* JADX INFO: renamed from: g */
    public long f28555g;

    /* JADX INFO: compiled from: Proguard */
    public static final class MasterElement {

        /* JADX INFO: renamed from: a */
        public final int f28556a;

        /* JADX INFO: renamed from: b */
        public final long f28557b;

        public MasterElement(int i, long j) {
            this.f28556a = i;
            this.f28557b = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m10873a(DefaultExtractorInput defaultExtractorInput, int i) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f28549a;
        defaultExtractorInput.mo10780a(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & UnsignedBytes.MAX_VALUE));
        }
        return j;
    }
}
