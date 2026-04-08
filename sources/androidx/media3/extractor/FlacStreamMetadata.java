package androidx.media3.extractor;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.UnsignedBytes;
import java.util.Collections;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FlacStreamMetadata {

    /* JADX INFO: renamed from: a */
    public final int f28214a;

    /* JADX INFO: renamed from: b */
    public final int f28215b;

    /* JADX INFO: renamed from: c */
    public final int f28216c;

    /* JADX INFO: renamed from: d */
    public final int f28217d;

    /* JADX INFO: renamed from: e */
    public final int f28218e;

    /* JADX INFO: renamed from: f */
    public final int f28219f;

    /* JADX INFO: renamed from: g */
    public final int f28220g;

    /* JADX INFO: renamed from: h */
    public final int f28221h;

    /* JADX INFO: renamed from: i */
    public final int f28222i;

    /* JADX INFO: renamed from: j */
    public final long f28223j;

    /* JADX INFO: renamed from: k */
    public final SeekTable f28224k;

    /* JADX INFO: renamed from: l */
    public final Metadata f28225l;

    /* JADX INFO: compiled from: Proguard */
    public static class SeekTable {

        /* JADX INFO: renamed from: a */
        public final long[] f28226a;

        /* JADX INFO: renamed from: b */
        public final long[] f28227b;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.f28226a = jArr;
            this.f28227b = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, bArr.length);
        parsableBitArray.m9536m(i * 8);
        this.f28214a = parsableBitArray.m9530g(16);
        this.f28215b = parsableBitArray.m9530g(16);
        this.f28216c = parsableBitArray.m9530g(24);
        this.f28217d = parsableBitArray.m9530g(24);
        int iM9530g = parsableBitArray.m9530g(20);
        this.f28218e = iM9530g;
        this.f28219f = m10808d(iM9530g);
        this.f28220g = parsableBitArray.m9530g(3) + 1;
        int iM9530g2 = parsableBitArray.m9530g(5) + 1;
        this.f28221h = iM9530g2;
        this.f28222i = m10807a(iM9530g2);
        this.f28223j = parsableBitArray.m9532i(36);
        this.f28224k = null;
        this.f28225l = null;
    }

    /* JADX INFO: renamed from: a */
    public static int m10807a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: d */
    public static int m10808d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m10809b() {
        long j = this.f28223j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f28218e);
    }

    /* JADX INFO: renamed from: c */
    public final Format m10810c(byte[] bArr, Metadata metadata) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i = this.f28217d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.f28225l;
        if (metadata2 != null) {
            metadata = metadata2.m9326b(metadata);
        }
        Format.Builder builder = new Format.Builder();
        builder.f25198m = MimeTypes.m9342m("audio/flac");
        builder.f25199n = i;
        builder.f25176C = this.f28220g;
        builder.f25177D = this.f28218e;
        builder.f25178E = Util.m9632w(this.f28221h);
        builder.f25201p = Collections.singletonList(bArr);
        builder.f25196k = metadata;
        return new Format(builder);
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, SeekTable seekTable, Metadata metadata) {
        this.f28214a = i;
        this.f28215b = i2;
        this.f28216c = i3;
        this.f28217d = i4;
        this.f28218e = i5;
        this.f28219f = m10808d(i5);
        this.f28220g = i6;
        this.f28221h = i7;
        this.f28222i = m10807a(i7);
        this.f28223j = j;
        this.f28224k = seekTable;
        this.f28225l = metadata;
    }
}
