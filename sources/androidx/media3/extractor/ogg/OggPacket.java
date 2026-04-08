package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class OggPacket {

    /* JADX INFO: renamed from: a */
    public final OggPageHeader f28934a = new OggPageHeader();

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f28935b = new ParsableByteArray(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f28936c = -1;

    /* JADX INFO: renamed from: d */
    public int f28937d;

    /* JADX INFO: renamed from: e */
    public boolean f28938e;

    /* JADX INFO: renamed from: a */
    public final int m10942a(int i) {
        int i2;
        int i3 = 0;
        this.f28937d = 0;
        do {
            int i4 = this.f28937d;
            int i5 = i + i4;
            OggPageHeader oggPageHeader = this.f28934a;
            if (i5 >= oggPageHeader.f28941c) {
                break;
            }
            int[] iArr = oggPageHeader.f28944f;
            this.f28937d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10943b(DefaultExtractorInput defaultExtractorInput) throws InterruptedIOException {
        int i;
        Assertions.m9464e(defaultExtractorInput != null);
        boolean z2 = this.f28938e;
        ParsableByteArray parsableByteArray = this.f28935b;
        if (z2) {
            this.f28938e = false;
            parsableByteArray.m9543D(0);
        }
        while (!this.f28938e) {
            int i2 = this.f28936c;
            OggPageHeader oggPageHeader = this.f28934a;
            if (i2 < 0) {
                if (oggPageHeader.m10945b(defaultExtractorInput, -1L) && oggPageHeader.m10944a(defaultExtractorInput, true)) {
                    int iM10942a = oggPageHeader.f28942d;
                    if ((oggPageHeader.f28939a & 1) == 1 && parsableByteArray.f25646c == 0) {
                        iM10942a += m10942a(0);
                        i = this.f28937d;
                    } else {
                        i = 0;
                    }
                    try {
                        defaultExtractorInput.mo10785h(iM10942a);
                        this.f28936c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM10942a2 = m10942a(this.f28936c);
            int i3 = this.f28936c + this.f28937d;
            if (iM10942a2 > 0) {
                parsableByteArray.m9549b(parsableByteArray.f25646c + iM10942a2);
                defaultExtractorInput.mo10780a(parsableByteArray.f25644a, parsableByteArray.f25646c, iM10942a2, false);
                parsableByteArray.m9545F(parsableByteArray.f25646c + iM10942a2);
                this.f28938e = oggPageHeader.f28944f[i3 + (-1)] != 255;
            }
            if (i3 == oggPageHeader.f28941c) {
                i3 = -1;
            }
            this.f28936c = i3;
        }
        return true;
    }
}
