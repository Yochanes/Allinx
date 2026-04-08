package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.core.view.AbstractC1477j;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider;
import com.google.common.collect.ImmutableList;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MediaCodecInfo {

    /* JADX INFO: renamed from: a */
    public final String f26953a;

    /* JADX INFO: renamed from: b */
    public final String f26954b;

    /* JADX INFO: renamed from: c */
    public final String f26955c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f26956d;

    /* JADX INFO: renamed from: e */
    public final boolean f26957e;

    /* JADX INFO: renamed from: f */
    public final boolean f26958f;

    /* JADX INFO: renamed from: g */
    public final boolean f26959g;

    /* JADX INFO: renamed from: h */
    public final boolean f26960h;

    /* JADX INFO: renamed from: i */
    public final boolean f26961i;

    public MediaCodecInfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.f26953a = str;
        this.f26954b = str2;
        this.f26955c = str3;
        this.f26956d = codecCapabilities;
        this.f26959g = z2;
        this.f26957e = z5;
        this.f26958f = z6;
        this.f26960h = z7;
        this.f26961i = MimeTypes.m9341l(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10374a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Util.m9614e(i, widthAlignment) * widthAlignment, Util.m9614e(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaCodecInfo m10375i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z8;
        boolean z9;
        boolean z10;
        String str6;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z6 = false;
        } else {
            if (Util.f25665a <= 22) {
                String str7 = Build.MODEL;
                if (("ODROID-XU3".equals(str7) || "Nexus 10".equals(str7)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                }
            }
            z6 = true;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z11 = z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Util.f25665a < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z7 = false;
            str4 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z8 = z2;
            z9 = z3;
            z10 = z4;
            str6 = str;
        } else {
            String str8 = Build.MANUFACTURER;
            if (!str8.equals("Xiaomi") && !str8.equals("OPPO")) {
                z7 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z8 = z2;
                z9 = z3;
                z10 = z4;
                str4 = str2;
            }
        }
        return new MediaCodecInfo(str6, str4, str5, codecCapabilities2, z8, z9, z10, z6, z11, z7);
    }

    /* JADX INFO: renamed from: b */
    public final DecoderReuseEvaluation m10376b(Format format, Format format2) {
        Format format3;
        Format format4;
        int i = !Objects.equals(format.f25161n, format2.f25161n) ? 8 : 0;
        if (this.f26961i) {
            if (format.f25171x != format2.f25171x) {
                i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (!this.f26957e && (format.f25168u != format2.f25168u || format.f25169v != format2.f25169v)) {
                i |= 512;
            }
            ColorInfo colorInfo = format.f25135B;
            boolean zM9235e = ColorInfo.m9235e(colorInfo);
            ColorInfo colorInfo2 = format2.f25135B;
            if ((!zM9235e || !ColorInfo.m9235e(colorInfo2)) && !Objects.equals(colorInfo, colorInfo2)) {
                i |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f26953a) && !format.m9249b(format2)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f26953a, format, format2, format.m9249b(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.f25137D != format4.f25137D) {
                i |= 4096;
            }
            if (format3.f25138E != format4.f25138E) {
                i |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if (format3.f25139F != format4.f25139F) {
                i |= 16384;
            }
            String str = this.f26954b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairM10420d = MediaCodecUtil.m10420d(format3);
                Pair pairM10420d2 = MediaCodecUtil.m10420d(format4);
                if (pairM10420d != null && pairM10420d2 != null) {
                    int iIntValue = ((Integer) pairM10420d.first).intValue();
                    int iIntValue2 = ((Integer) pairM10420d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f26953a, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.m9249b(format4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f26953a, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f26953a, format3, format4, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10377c(Format format, boolean z2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String strM9470a;
        int i = 4;
        int i2 = 3;
        Pair pairM10420d = MediaCodecUtil.m10420d(format);
        String str = this.f26955c;
        String str2 = format.f25161n;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM9342m = MimeTypes.m9342m(str);
            if (strM9342m.equals("video/mv-hevc")) {
                return true;
            }
            if (strM9342m.equals("video/hevc")) {
                List list = format.f25164q;
                int i3 = 0;
                loop0: while (true) {
                    if (i3 >= list.size()) {
                        pair = null;
                        strM9470a = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i3);
                    int length = bArr.length;
                    if (length > i2) {
                        boolean[] zArr = new boolean[i2];
                        ImmutableList.Builder builder = ImmutableList.builder();
                        int i4 = 0;
                        while (i4 < bArr.length) {
                            int iM9644b = NalUnitUtil.m9644b(bArr, i4, bArr.length, zArr);
                            if (iM9644b != bArr.length) {
                                builder.add(Integer.valueOf(iM9644b));
                            }
                            i4 = iM9644b + i2;
                        }
                        ImmutableList immutableListBuild = builder.build();
                        for (int i5 = 0; i5 < immutableListBuild.size(); i5++) {
                            if (((Integer) immutableListBuild.get(i5)).intValue() + i2 < length) {
                                ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, ((Integer) immutableListBuild.get(i5)).intValue() + i2, length);
                                NalUnitUtil.H265NalHeader h265NalHeaderM9647e = NalUnitUtil.m9647e(parsableNalUnitBitArray);
                                if (h265NalHeaderM9647e.f25706a == 33 && h265NalHeaderM9647e.f25707b == 0) {
                                    parsableNalUnitBitArray.m9666j(4);
                                    int iM9661e = parsableNalUnitBitArray.m9661e(3);
                                    parsableNalUnitBitArray.m9665i();
                                    pair = null;
                                    NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevelM9648f = NalUnitUtil.m9648f(parsableNalUnitBitArray, true, iM9661e, null);
                                    strM9470a = CodecSpecificDataUtil.m9470a(h265ProfileTierLevelM9648f.f25709a, h265ProfileTierLevelM9648f.f25710b, h265ProfileTierLevelM9648f.f25711c, h265ProfileTierLevelM9648f.f25712d, h265ProfileTierLevelM9648f.f25713e, h265ProfileTierLevelM9648f.f25714f);
                                    break loop0;
                                }
                                i2 = 3;
                            }
                        }
                    }
                    i3++;
                }
                pairM10420d = strM9470a == null ? pair : CodecSpecificDataUtil.m9471b(strM9470a, strM9470a.trim().split("\\.", -1), format.f25135B);
            }
        }
        if (pairM10420d == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM10420d.first).intValue();
        int iIntValue2 = ((Integer) pairM10420d.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str2);
        String str3 = this.f26954b;
        if (zEquals) {
            str3.getClass();
            switch (str3) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.f26961i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26956d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (Util.f25665a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = UserMetadata.MAX_ATTRIBUTE_SIZE;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 >= 3600000) {
                i = 8;
            } else if (iIntValue3 < 1800000) {
                i = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z2)) {
                if (!"video/hevc".equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = Build.DEVICE;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        m10382h("codec.profileLevel, " + format.f25158k + ", " + str);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10378d(Format format) {
        return (Objects.equals(format.f25161n, "audio/flac") && format.f25139F == 22 && Util.f25665a < 34 && this.f26953a.equals("c2.android.flac.decoder")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10379e(Format format) {
        int i;
        String str = format.f25161n;
        String str2 = this.f26954b;
        if (!(str2.equals(str) || str2.equals(MediaCodecUtil.m10418b(format))) || !m10377c(format, true) || !m10378d(format)) {
            return false;
        }
        if (this.f26961i) {
            int i2 = format.f25168u;
            if (i2 > 0 && (i = format.f25169v) > 0) {
                return m10381g(i2, i, format.f25170w);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26956d;
            int i3 = format.f25138E;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    m10382h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m10382h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    m10382h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = format.f25137D;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    m10382h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m10382h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Util.f25665a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    Log.m9511g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f26953a + ", [" + maxInputChannelCount + " to " + i5 + "]");
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    m10382h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10380f(Format format) {
        if (this.f26961i) {
            return this.f26957e;
        }
        Pair pairM10420d = MediaCodecUtil.m10420d(format);
        return pairM10420d != null && ((Integer) pairM10420d.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10381g(int i, int i2, double d) {
        char c2;
        Boolean bool;
        List listM8137h;
        boolean z2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26956d;
        if (codecCapabilities == null) {
            m10382h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m10382h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Util.f25665a;
        if (i3 < 29) {
            if (!m10374a(videoCapabilities, i, i2, d)) {
                if (i < i2) {
                    String str = this.f26953a;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m10374a(videoCapabilities, i2, i, d)) {
                        StringBuilder sbM24u = AbstractC0000a.m24u("sizeAndRate.rotated, ", "x", "@", i, i2);
                        sbM24u.append(d);
                        StringBuilder sbM25v = AbstractC0000a.m25v("AssumedSupport [", sbM24u.toString(), "] [", str, ", ");
                        sbM25v.append(this.f26954b);
                        sbM25v.append("] [");
                        sbM25v.append(Util.f25666b);
                        sbM25v.append("]");
                        Log.m9506b("MediaCodecInfo", sbM25v.toString());
                        return true;
                    }
                }
                StringBuilder sbM24u2 = AbstractC0000a.m24u("sizeAndRate.support, ", "x", "@", i, i2);
                sbM24u2.append(d);
                m10382h(sbM24u2.toString());
                return false;
            }
        } else if (i3 < 29 || (((bool = MediaCodecPerformancePointCoverageProvider.f26962a) != null && bool.booleanValue()) || (listM8137h = AbstractC1477j.m8137h(videoCapabilities)) == null || listM8137h.isEmpty())) {
            c2 = 0;
            if (c2 != 2) {
                if (c2 == 1) {
                    StringBuilder sbM24u3 = AbstractC0000a.m24u("sizeAndRate.cover, ", "x", "@", i, i2);
                    sbM24u3.append(d);
                    m10382h(sbM24u3.toString());
                    return false;
                }
                if (!m10374a(videoCapabilities, i, i2, d)) {
                }
            }
        } else {
            AbstractC1477j.m8138i();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM8133d = AbstractC1477j.m8133d(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                if (i4 >= listM8137h.size()) {
                    c2 = 1;
                    break;
                }
                if (AbstractC1477j.m8148s(AbstractC1477j.m8134e(listM8137h.get(i4)), performancePointM8133d)) {
                    c2 = 2;
                    break;
                }
                i4++;
            }
            if (c2 == 1 && MediaCodecPerformancePointCoverageProvider.f26962a == null) {
                if (i3 >= 35) {
                    z2 = false;
                    MediaCodecPerformancePointCoverageProvider.f26962a = Boolean.valueOf(z2);
                    if (z2) {
                    }
                } else {
                    int iM10383a = MediaCodecPerformancePointCoverageProvider.Api29.m10383a(false);
                    int iM10383a2 = MediaCodecPerformancePointCoverageProvider.Api29.m10383a(true);
                    if (iM10383a == 0 || (iM10383a2 != 0 ? iM10383a != 2 || iM10383a2 != 2 : iM10383a != 2)) {
                        z2 = true;
                    }
                    MediaCodecPerformancePointCoverageProvider.f26962a = Boolean.valueOf(z2);
                    if (z2) {
                    }
                }
            }
            if (c2 != 2) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m10382h(String str) {
        StringBuilder sbM23t = AbstractC0000a.m23t("NoSupport [", str, "] [");
        sbM23t.append(this.f26953a);
        sbM23t.append(", ");
        sbM23t.append(this.f26954b);
        sbM23t.append("] [");
        sbM23t.append(Util.f25666b);
        sbM23t.append("]");
        Log.m9506b("MediaCodecInfo", sbM23t.toString());
    }

    public final String toString() {
        return this.f26953a;
    }
}
