package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1846d implements MediaCodecUtil.ScoreProvider, LoudnessCodecController.LoudnessParameterUpdateListener, MediaCodecSelector {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    /* JADX INFO: renamed from: a */
    public int mo10431a(Object obj) {
        HashMap map = MediaCodecUtil.f27037a;
        String str = ((MediaCodecInfo) obj).f26953a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.f25665a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
