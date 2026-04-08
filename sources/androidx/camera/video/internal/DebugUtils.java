package androidx.camera.video.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.compat.Api28Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class DebugUtils {
    /* JADX INFO: renamed from: a */
    public static String m1846a(String str, MediaCodec mediaCodec, MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            Preconditions.m7694a(capabilitiesForType != null);
            m1847b(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            sb.append("[" + mediaCodec.getName() + "] does not support mime " + str);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m1847b(StringBuilder sb, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z2;
        try {
            sb.append("[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
            sb.append("\n");
        } catch (ClassCastException unused) {
            sb.append("[CodecCaps] isFormatSupported=false");
            sb.append("\n");
        }
        sb.append("[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        sb.append("\n");
        int i = 0;
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
            int length = codecProfileLevelArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i2];
                arrayList.add(codecProfileLevel == null ? "null" : String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile)));
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            sb.append("[CodecCaps] profileLevels = " + ((Object) sb2));
            sb.append("\n");
        }
        if (codecCapabilities.colorFormats != null) {
            sb.append("[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
            sb.append("\n");
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            sb.append("[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
            sb.append("\n");
            sb.append("[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
            sb.append("\n");
            sb.append("[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
            sb.append("\n");
            boolean z3 = true;
            try {
                integer = mediaFormat.getInteger("width");
                integer2 = mediaFormat.getInteger("height");
                Preconditions.m7694a(integer > 0 && integer2 > 0);
                z2 = true;
            } catch (IllegalArgumentException | NullPointerException unused2) {
                sb.append("[VideoCaps] mediaFormat does not contain valid width and height");
                sb.append("\n");
                integer = 0;
                integer2 = 0;
                z2 = false;
            }
            if (z2) {
                try {
                    sb.append("[VideoCaps] getSupportedHeightsFor " + integer + " = " + videoCapabilities.getSupportedHeightsFor(integer));
                    sb.append("\n");
                } catch (IllegalArgumentException unused3) {
                    sb.append("[VideoCaps] could not getSupportedHeightsFor " + integer);
                    sb.append("\n");
                }
                try {
                    sb.append("[VideoCaps] getSupportedWidthsFor " + integer2 + " = " + videoCapabilities.getSupportedWidthsFor(integer2));
                    sb.append("\n");
                } catch (IllegalArgumentException unused4) {
                    sb.append("[VideoCaps] could not getSupportedWidthsFor " + integer2);
                    sb.append("\n");
                }
                StringBuilder sbM24u = AbstractC0000a.m24u("[VideoCaps] isSizeSupported for ", "x", " = ", integer, integer2);
                sbM24u.append(videoCapabilities.isSizeSupported(integer, integer2));
                sb.append(sbM24u.toString());
                sb.append("\n");
            }
            sb.append("[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
            sb.append("\n");
            try {
                int integer3 = mediaFormat.getInteger("frame-rate");
                if (integer3 <= 0) {
                    z3 = false;
                }
                Preconditions.m7694a(z3);
                i = integer3;
            } catch (IllegalArgumentException | NullPointerException unused5) {
                sb.append("[VideoCaps] mediaFormat does not contain frame rate");
                sb.append("\n");
            }
            if (z2) {
                StringBuilder sbM24u2 = AbstractC0000a.m24u("[VideoCaps] getSupportedFrameRatesFor ", "x", " = ", integer, integer2);
                sbM24u2.append(videoCapabilities.getSupportedFrameRatesFor(integer, integer2));
                sb.append(sbM24u2.toString());
                sb.append("\n");
            }
            if (z2 && i > 0) {
                StringBuilder sbM24u3 = AbstractC0000a.m24u("[VideoCaps] areSizeAndRateSupported for ", "x", ", ", integer, integer2);
                sbM24u3.append(i);
                sbM24u3.append(" = ");
                sbM24u3.append(videoCapabilities.areSizeAndRateSupported(integer, integer2, i));
                sb.append(sbM24u3.toString());
                sb.append("\n");
            }
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            sb.append("[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
            sb.append("\n");
            sb.append("[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
            sb.append("\n");
            if (Build.VERSION.SDK_INT >= 31) {
                sb.append("[AudioCaps] getMinInputChannelCount = " + Api31Impl.m1871b(audioCapabilities));
                sb.append("\n");
                sb.append("[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(Api31Impl.m1870a(audioCapabilities)));
                sb.append("\n");
            }
            sb.append("[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
            sb.append("\n");
            sb.append("[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
            sb.append("\n");
            try {
                int integer4 = mediaFormat.getInteger("sample-rate");
                sb.append("[AudioCaps] isSampleRateSupported for " + integer4 + " = " + audioCapabilities.isSampleRateSupported(integer4));
                sb.append("\n");
            } catch (IllegalArgumentException | NullPointerException unused6) {
                sb.append("[AudioCaps] mediaFormat does not contain sample rate");
                sb.append("\n");
            }
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            sb.append("[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
            sb.append("\n");
            if (Build.VERSION.SDK_INT >= 28) {
                sb.append("[EncoderCaps] getQualityRange = " + Api28Impl.m1865a(encoderCapabilities));
                sb.append("\n");
            }
            try {
                sb.append("[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(mediaFormat.getInteger("bitrate-mode")));
                sb.append("\n");
            } catch (IllegalArgumentException | NullPointerException unused7) {
                sb.append("[EncoderCaps] mediaFormat does not contain bitrate mode");
                sb.append("\n");
            }
        }
    }
}
