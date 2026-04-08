package androidx.camera.video.internal.workaround;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class EncoderFinder {

    /* JADX INFO: renamed from: a */
    public final boolean f3487a;

    public EncoderFinder() {
        this.f3487a = ((MediaFormatMustNotUseFrameRateToFindEncoderQuirk) DeviceQuirks.f3417a.m1514b(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class)) != null;
    }

    /* JADX INFO: renamed from: a */
    public static String m1925a(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) throws Throwable {
        Integer numValueOf;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        int iIntValue;
        String string = mediaFormat.getString("mime");
        Integer num = null;
        if (string == null) {
            Logger.m1288i("EncoderFinder", "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (int i = 0; i < length; i++) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    boolean z2 = true;
                    Preconditions.m7695b(capabilitiesForType != null, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (videoCapabilities == null) {
                            z2 = false;
                        }
                        Preconditions.m7695b(z2, "Not video codec");
                        numValueOf = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            iIntValue = ((Integer) videoCapabilities.getBitrateRange().clamp(numValueOf)).intValue();
                            mediaFormat.setInteger("bitrate", iIntValue);
                        } catch (IllegalArgumentException unused) {
                            if (numValueOf != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            num = numValueOf;
                            if (num != null) {
                                mediaFormat.setInteger("bitrate", num.intValue());
                            }
                            throw th;
                        }
                    } else {
                        iIntValue = -1;
                        numValueOf = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    numValueOf = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    Logger.m1288i("EncoderFinder", String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", numValueOf, Integer.valueOf(iIntValue)));
                    String name = mediaCodecInfo.getName();
                    if (numValueOf != null) {
                        mediaFormat.setInteger("bitrate", numValueOf.intValue());
                    }
                    return name;
                }
                if (numValueOf != null) {
                    mediaFormat.setInteger("bitrate", numValueOf.intValue());
                }
            }
        }
        return null;
    }
}
