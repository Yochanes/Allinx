package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TsDurationReader {

    /* JADX INFO: renamed from: c */
    public boolean f29716c;

    /* JADX INFO: renamed from: d */
    public boolean f29717d;

    /* JADX INFO: renamed from: e */
    public boolean f29718e;

    /* JADX INFO: renamed from: a */
    public final TimestampAdjuster f29714a = new TimestampAdjuster(0);

    /* JADX INFO: renamed from: f */
    public long f29719f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f29720g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f29721h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f29715b = new ParsableByteArray();

    /* JADX INFO: renamed from: a */
    public final void m11079a(DefaultExtractorInput defaultExtractorInput) {
        byte[] bArr = Util.f25667c;
        ParsableByteArray parsableByteArray = this.f29715b;
        parsableByteArray.getClass();
        parsableByteArray.m9544E(bArr.length, bArr);
        this.f29716c = true;
        defaultExtractorInput.f28184f = 0;
    }
}
