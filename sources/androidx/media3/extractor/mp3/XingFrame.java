package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class XingFrame {

    /* JADX INFO: renamed from: a */
    public final MpegAudioUtil.Header f28714a;

    /* JADX INFO: renamed from: b */
    public final long f28715b;

    public XingFrame(MpegAudioUtil.Header header, long j, long j2, long[] jArr, int i, int i2) {
        MpegAudioUtil.Header header2 = new MpegAudioUtil.Header();
        header2.f28257a = header.f28257a;
        header2.f28258b = header.f28258b;
        header2.f28259c = header.f28259c;
        header2.f28260d = header.f28260d;
        header2.f28261e = header.f28261e;
        header2.f28262f = header.f28262f;
        header2.f28263g = header.f28263g;
        this.f28714a = header2;
        this.f28715b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m10898a() {
        long j = this.f28715b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        MpegAudioUtil.Header header = this.f28714a;
        return Util.m9602L(header.f28260d, (j * ((long) header.f28263g)) - 1);
    }
}
