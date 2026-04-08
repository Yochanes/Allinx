package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class EncoderInfoImpl implements EncoderInfo {

    /* JADX INFO: renamed from: a */
    public final MediaCodecInfo.CodecCapabilities f3473a;

    public EncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f3473a = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(AbstractC0000a.m13j("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
