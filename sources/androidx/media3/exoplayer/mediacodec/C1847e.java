package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1847e implements MediaCodecUtil.ScoreProvider {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Format f27051c;

    public /* synthetic */ C1847e(Format format) {
        this.f27051c = format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    /* JADX INFO: renamed from: a */
    public final int mo10431a(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        HashMap map = MediaCodecUtil.f27037a;
        mediaCodecInfo.getClass();
        Format format = this.f27051c;
        String str = format.f25161n;
        String str2 = mediaCodecInfo.f26954b;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.m10418b(format))) && mediaCodecInfo.m10377c(format, false) && mediaCodecInfo.m10378d(format)) ? 1 : 0;
    }
}
