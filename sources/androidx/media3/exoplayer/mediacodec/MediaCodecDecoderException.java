package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a */
    public final int f26952a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.f26953a);
        super(sb.toString(), illegalStateException);
        boolean z2 = illegalStateException instanceof MediaCodec.CodecException;
        this.f26952a = Util.f25665a >= 23 ? z2 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : Util.m9629t(z2 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
