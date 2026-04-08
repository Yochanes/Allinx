package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class OggPageHeader {

    /* JADX INFO: renamed from: a */
    public int f28939a;

    /* JADX INFO: renamed from: b */
    public long f28940b;

    /* JADX INFO: renamed from: c */
    public int f28941c;

    /* JADX INFO: renamed from: d */
    public int f28942d;

    /* JADX INFO: renamed from: e */
    public int f28943e;

    /* JADX INFO: renamed from: f */
    public final int[] f28944f = new int[255];

    /* JADX INFO: renamed from: g */
    public final ParsableByteArray f28945g = new ParsableByteArray(255);

    /* JADX INFO: renamed from: a */
    public final boolean m10944a(DefaultExtractorInput defaultExtractorInput, boolean z2) throws ParserException, EOFException {
        boolean zMo10781c;
        boolean zMo10781c2;
        this.f28939a = 0;
        this.f28940b = 0L;
        this.f28941c = 0;
        this.f28942d = 0;
        this.f28943e = 0;
        ParsableByteArray parsableByteArray = this.f28945g;
        parsableByteArray.m9543D(27);
        try {
            zMo10781c = defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, 27, z2);
        } catch (EOFException e) {
            if (!z2) {
                throw e;
            }
            zMo10781c = false;
        }
        if (zMo10781c && parsableByteArray.m9570w() == 1332176723) {
            if (parsableByteArray.m9568u() == 0) {
                this.f28939a = parsableByteArray.m9568u();
                this.f28940b = parsableByteArray.m9557j();
                parsableByteArray.m9559l();
                parsableByteArray.m9559l();
                parsableByteArray.m9559l();
                int iM9568u = parsableByteArray.m9568u();
                this.f28941c = iM9568u;
                this.f28942d = iM9568u + 27;
                parsableByteArray.m9543D(iM9568u);
                try {
                    zMo10781c2 = defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, this.f28941c, z2);
                } catch (EOFException e2) {
                    if (!z2) {
                        throw e2;
                    }
                    zMo10781c2 = false;
                }
                if (zMo10781c2) {
                    for (int i = 0; i < this.f28941c; i++) {
                        int iM9568u2 = parsableByteArray.m9568u();
                        this.f28944f[i] = iM9568u2;
                        this.f28943e += iM9568u2;
                    }
                    return true;
                }
            } else if (!z2) {
                throw ParserException.m9345b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r10.f28182d >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10.m10791o(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10945b(DefaultExtractorInput defaultExtractorInput, long j) throws EOFException, InterruptedIOException {
        boolean zMo10781c;
        Assertions.m9460a(defaultExtractorInput.f28182d == defaultExtractorInput.mo10782d());
        ParsableByteArray parsableByteArray = this.f28945g;
        parsableByteArray.m9543D(4);
        while (true) {
            if (j != -1 && defaultExtractorInput.f28182d + 4 >= j) {
                break;
            }
            try {
                zMo10781c = defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, 4, true);
            } catch (EOFException unused) {
                zMo10781c = false;
            }
            if (!zMo10781c) {
                break;
            }
            parsableByteArray.m9546G(0);
            if (parsableByteArray.m9570w() == 1332176723) {
                defaultExtractorInput.f28184f = 0;
                return true;
            }
            defaultExtractorInput.mo10785h(1);
        }
    }
}
