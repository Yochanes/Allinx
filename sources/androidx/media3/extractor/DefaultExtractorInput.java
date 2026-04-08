package androidx.media3.extractor;

import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultExtractorInput implements ExtractorInput {

    /* JADX INFO: renamed from: b */
    public final DataSource f28180b;

    /* JADX INFO: renamed from: c */
    public final long f28181c;

    /* JADX INFO: renamed from: d */
    public long f28182d;

    /* JADX INFO: renamed from: f */
    public int f28184f;

    /* JADX INFO: renamed from: g */
    public int f28185g;

    /* JADX INFO: renamed from: e */
    public byte[] f28183e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f28179a = new byte[4096];

    static {
        MediaLibraryInfo.m9322a("media3.extractor");
    }

    public DefaultExtractorInput(DataSource dataSource, long j, long j2) {
        this.f28180b = dataSource;
        this.f28182d = j;
        this.f28181c = j2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: a */
    public final boolean mo10780a(byte[] bArr, int i, int i2, boolean z2) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f28185g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f28183e, 0, bArr, i, iMin);
            m10792p(iMin);
        }
        int iM10790n = iMin;
        while (iM10790n < i2 && iM10790n != -1) {
            iM10790n = m10790n(bArr, i, i2, iM10790n, z2);
        }
        if (iM10790n != -1) {
            this.f28182d += (long) iM10790n;
        }
        return iM10790n != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: c */
    public final boolean mo10781c(byte[] bArr, int i, int i2, boolean z2) {
        if (!m10787k(i2, z2)) {
            return false;
        }
        System.arraycopy(this.f28183e, this.f28184f - i2, bArr, i, i2);
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: d */
    public final long mo10782d() {
        return this.f28182d + ((long) this.f28184f);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: e */
    public final void mo10783e(int i) throws EOFException, InterruptedIOException {
        m10787k(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: g */
    public final void mo10784g() {
        this.f28184f = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getLength() {
        return this.f28181c;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getPosition() {
        return this.f28182d;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: h */
    public final void mo10785h(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f28185g, i);
        m10792p(iMin);
        int iM10790n = iMin;
        while (iM10790n < i && iM10790n != -1) {
            byte[] bArr = this.f28179a;
            iM10790n = m10790n(bArr, -iM10790n, Math.min(i, bArr.length + iM10790n), iM10790n, false);
        }
        if (iM10790n != -1) {
            this.f28182d += (long) iM10790n;
        }
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: j */
    public final void mo10786j(byte[] bArr, int i, int i2) {
        mo10781c(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10787k(int i, boolean z2) throws EOFException, InterruptedIOException {
        m10788l(i);
        int iM10790n = this.f28185g - this.f28184f;
        while (iM10790n < i) {
            int i2 = i;
            boolean z3 = z2;
            iM10790n = m10790n(this.f28183e, this.f28184f, i2, iM10790n, z3);
            if (iM10790n == -1) {
                return false;
            }
            this.f28185g = this.f28184f + iM10790n;
            i = i2;
            z2 = z3;
        }
        this.f28184f += i;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m10788l(int i) {
        int i2 = this.f28184f + i;
        byte[] bArr = this.f28183e;
        if (i2 > bArr.length) {
            this.f28183e = Arrays.copyOf(this.f28183e, Util.m9618i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m10789m(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        m10788l(i2);
        int i3 = this.f28185g;
        int i4 = this.f28184f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.m10790n(this.f28183e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.f28185g += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(defaultExtractorInput.f28183e, defaultExtractorInput.f28184f, bArr, i, iMin);
        defaultExtractorInput.f28184f += iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: n */
    public final int m10790n(byte[] bArr, int i, int i2, int i3, boolean z2) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f28180b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: o */
    public final int m10791o(int i) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin = Math.min(this.f28185g, i);
        m10792p(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f28179a;
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.m10790n(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            defaultExtractorInput = this;
        }
        if (iMin != -1) {
            defaultExtractorInput.f28182d += (long) iMin;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: p */
    public final void m10792p(int i) {
        int i2 = this.f28185g - i;
        this.f28185g = i2;
        this.f28184f = 0;
        byte[] bArr = this.f28183e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f28183e = bArr2;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int i3 = this.f28185g;
        int iM10790n = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f28183e, 0, bArr, i, iMin);
            m10792p(iMin);
            iM10790n = iMin;
        }
        if (iM10790n == 0) {
            defaultExtractorInput = this;
            iM10790n = defaultExtractorInput.m10790n(bArr, i, i2, 0, true);
        } else {
            defaultExtractorInput = this;
        }
        if (iM10790n != -1) {
            defaultExtractorInput.f28182d += (long) iM10790n;
        }
        return iM10790n;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo10780a(bArr, i, i2, false);
    }
}
