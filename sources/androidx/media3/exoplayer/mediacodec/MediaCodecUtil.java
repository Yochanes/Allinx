package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.AbstractC1477j;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import me.jessyan.autosize.BuildConfig;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
@UnstableApi
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a */
    public static final HashMap f27037a = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    public static final class CodecKey {

        /* JADX INFO: renamed from: a */
        public final String f27038a;

        /* JADX INFO: renamed from: b */
        public final boolean f27039b;

        /* JADX INFO: renamed from: c */
        public final boolean f27040c;

        public CodecKey(String str, boolean z2, boolean z3) {
            this.f27038a = str;
            this.f27039b = z2;
            this.f27040c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.f27038a, codecKey.f27038a) && this.f27039b == codecKey.f27039b && this.f27040c == codecKey.f27040c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((AbstractC0000a.m5b(31, 31, this.f27038a) + (this.f27039b ? 1231 : 1237)) * 31) + (this.f27040c ? 1231 : 1237);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DecoderQueryException extends Exception {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MediaCodecListCompat {
        /* JADX INFO: renamed from: a */
        android.media.MediaCodecInfo mo10426a(int i);

        /* JADX INFO: renamed from: b */
        boolean mo10427b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: c */
        boolean mo10428c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: d */
        int mo10429d();

        /* JADX INFO: renamed from: e */
        boolean mo10430e();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: a */
        public final android.media.MediaCodecInfo mo10426a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: b */
        public final boolean mo10427b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: c */
        public final boolean mo10428c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: d */
        public final int mo10429d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: e */
        public final boolean mo10430e() {
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {

        /* JADX INFO: renamed from: a */
        public final int f27041a;

        /* JADX INFO: renamed from: b */
        public android.media.MediaCodecInfo[] f27042b;

        public MediaCodecListCompatV21(boolean z2, boolean z3, boolean z4) {
            this.f27041a = (z2 || z3 || z4) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: a */
        public final android.media.MediaCodecInfo mo10426a(int i) {
            if (this.f27042b == null) {
                this.f27042b = new MediaCodecList(this.f27041a).getCodecInfos();
            }
            return this.f27042b[i];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: b */
        public final boolean mo10427b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: c */
        public final boolean mo10428c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: d */
        public final int mo10429d() {
            if (this.f27042b == null) {
                this.f27042b = new MediaCodecList(this.f27041a).getCodecInfos();
            }
            return this.f27042b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* JADX INFO: renamed from: e */
        public final boolean mo10430e() {
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ScoreProvider<T> {
        /* JADX INFO: renamed from: a */
        int mo10431a(Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m10417a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Util.f25665a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((MediaCodecInfo) arrayList.get(0)).f26953a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(MediaCodecInfo.m10375i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C1848f(new C1846d()));
        }
        if (Util.f25665a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((MediaCodecInfo) arrayList.get(0)).f26953a)) {
            return;
        }
        arrayList.add((MediaCodecInfo) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m10418b(Format format) {
        Pair pairM10420d;
        if ("audio/eac3-joc".equals(format.f25161n)) {
            return "audio/eac3";
        }
        String str = format.f25161n;
        if ("video/dolby-vision".equals(str) && (pairM10420d = m10420d(format)) != null) {
            int iIntValue = ((Integer) pairM10420d.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m10419c(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m10420d(Format format) {
        ColorInfo colorInfo;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Integer numValueOf;
        byte b2;
        byte b3;
        Integer numValueOf2;
        byte[] bArr = CodecSpecificDataUtil.f25580a;
        String str = format.f25158k;
        if (str != null) {
            String[] strArrSplit = str.split("\\.");
            boolean zEquals = "video/dolby-vision".equals(format.f25161n);
            String str2 = format.f25158k;
            if (zEquals) {
                if (strArrSplit.length < 3) {
                    AbstractC1610a.m8741s("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                Matcher matcher = CodecSpecificDataUtil.f25582c.matcher(strArrSplit[1]);
                if (!matcher.matches()) {
                    AbstractC1610a.m8741s("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                String strGroup = matcher.group(1);
                if (strGroup != null) {
                    switch (strGroup) {
                        case "00":
                            numValueOf = 1;
                            break;
                        case "01":
                            numValueOf = 2;
                            break;
                        case "02":
                            numValueOf = 4;
                            break;
                        case "03":
                            numValueOf = 8;
                            break;
                        case "04":
                            numValueOf = 16;
                            break;
                        case "05":
                            numValueOf = 32;
                            break;
                        case "06":
                            numValueOf = 64;
                            break;
                        case "07":
                            numValueOf = Integer.valueOf(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            break;
                        case "08":
                            numValueOf = 256;
                            break;
                        case "09":
                            numValueOf = 512;
                            break;
                        case "10":
                            numValueOf = Integer.valueOf(UserMetadata.MAX_ATTRIBUTE_SIZE);
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    AbstractC1610a.m8741s("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                    return null;
                }
                String str3 = strArrSplit[2];
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case 1537:
                            b2 = !str3.equals("01") ? (byte) -1 : (byte) 0;
                            break;
                        case 1538:
                            if (str3.equals("02")) {
                                b2 = 1;
                                break;
                            }
                            break;
                        case 1539:
                            if (str3.equals("03")) {
                                b2 = 2;
                                break;
                            }
                            break;
                        case 1540:
                            if (str3.equals("04")) {
                                b2 = 3;
                                break;
                            }
                            break;
                        case 1541:
                            if (str3.equals("05")) {
                                b2 = 4;
                                break;
                            }
                            break;
                        case 1542:
                            if (str3.equals("06")) {
                                b2 = 5;
                                break;
                            }
                            break;
                        case 1543:
                            if (str3.equals("07")) {
                                b2 = 6;
                                break;
                            }
                            break;
                        case 1544:
                            if (str3.equals("08")) {
                                b2 = 7;
                                break;
                            }
                            break;
                        case 1545:
                            if (str3.equals("09")) {
                                b2 = 8;
                                break;
                            }
                            break;
                        case 1567:
                            if (str3.equals("10")) {
                                b2 = 9;
                                break;
                            }
                            break;
                        case 1568:
                            if (str3.equals("11")) {
                                b2 = 10;
                                break;
                            }
                            break;
                        case 1569:
                            if (str3.equals("12")) {
                                b3 = Ascii.f42547VT;
                                b2 = b3;
                            }
                            break;
                        case 1570:
                            if (str3.equals("13")) {
                                b3 = Ascii.f42536FF;
                                b2 = b3;
                            }
                            break;
                    }
                    switch (b2) {
                        case 0:
                            numValueOf2 = 1;
                            break;
                        case 1:
                            numValueOf2 = 2;
                            break;
                        case 2:
                            numValueOf2 = 4;
                            break;
                        case 3:
                            numValueOf2 = 8;
                            break;
                        case 4:
                            numValueOf2 = 16;
                            break;
                        case 5:
                            numValueOf2 = 32;
                            break;
                        case 6:
                            numValueOf2 = 64;
                            break;
                        case 7:
                            numValueOf2 = Integer.valueOf(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            break;
                        case 8:
                            numValueOf2 = 256;
                            break;
                        case 9:
                            numValueOf2 = 512;
                            break;
                        case 10:
                            numValueOf2 = Integer.valueOf(UserMetadata.MAX_ATTRIBUTE_SIZE);
                            break;
                        case 11:
                            numValueOf2 = 2048;
                            break;
                        case TYPE_BYTES_VALUE:
                            numValueOf2 = 4096;
                            break;
                    }
                } else {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    return new Pair(numValueOf, numValueOf2);
                }
                AbstractC1610a.m8741s("Unknown Dolby Vision level string: ", str3, "CodecSpecificDataUtil");
                return null;
            }
            String str4 = strArrSplit[0];
            str4.getClass();
            colorInfo = format.f25135B;
            switch (str4) {
                case "av01":
                    if (strArrSplit.length >= 4) {
                        try {
                            int i12 = Integer.parseInt(strArrSplit[1]);
                            int i13 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                            int i14 = Integer.parseInt(strArrSplit[3]);
                            if (i12 != 0) {
                                AbstractC1610a.m8738p(i12, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                            } else if (i14 == 8 || i14 == 10) {
                                int i15 = i14 == 8 ? 1 : (colorInfo == null || !(colorInfo.f25108d != null || (i = colorInfo.f25107c) == 7 || i == 6)) ? 2 : 4096;
                                switch (i13) {
                                    case 0:
                                        i2 = 1;
                                        i3 = -1;
                                        break;
                                    case 1:
                                        i2 = 2;
                                        i3 = -1;
                                        break;
                                    case 2:
                                        i2 = 4;
                                        i3 = -1;
                                        break;
                                    case 3:
                                        i2 = 8;
                                        i3 = -1;
                                        break;
                                    case 4:
                                        i2 = 16;
                                        i3 = -1;
                                        break;
                                    case 5:
                                        i2 = 32;
                                        i3 = -1;
                                        break;
                                    case 6:
                                        i2 = 64;
                                        i3 = -1;
                                        break;
                                    case 7:
                                        i2 = 128;
                                        i3 = -1;
                                        break;
                                    case 8:
                                        i2 = 256;
                                        i3 = -1;
                                        break;
                                    case 9:
                                        i2 = 512;
                                        i3 = -1;
                                        break;
                                    case 10:
                                        i2 = 1024;
                                        i3 = -1;
                                        break;
                                    case 11:
                                        i2 = 2048;
                                        i3 = -1;
                                        break;
                                    case TYPE_BYTES_VALUE:
                                        i2 = 4096;
                                        i3 = -1;
                                        break;
                                    case 13:
                                        i2 = 8192;
                                        i3 = -1;
                                        break;
                                    case 14:
                                        i2 = 16384;
                                        i3 = -1;
                                        break;
                                    case 15:
                                        i2 = 32768;
                                        i3 = -1;
                                        break;
                                    case 16:
                                        i2 = 65536;
                                        i3 = -1;
                                        break;
                                    case 17:
                                        i2 = 131072;
                                        i3 = -1;
                                        break;
                                    case 18:
                                        i2 = 262144;
                                        i3 = -1;
                                        break;
                                    case 19:
                                        i2 = 524288;
                                        i3 = -1;
                                        break;
                                    case 20:
                                        i2 = 1048576;
                                        i3 = -1;
                                        break;
                                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        i2 = 2097152;
                                        i3 = -1;
                                        break;
                                    case 22:
                                        i2 = 4194304;
                                        i3 = -1;
                                        break;
                                    case ConnectionResult.API_DISABLED /* 23 */:
                                        i2 = 8388608;
                                        i3 = -1;
                                        break;
                                    default:
                                        i3 = -1;
                                        i2 = -1;
                                        break;
                                }
                                if (i2 == i3) {
                                    AbstractC1610a.m8738p(i13, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                }
                            } else {
                                AbstractC1610a.m8738p(i14, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                            }
                        } catch (NumberFormatException unused) {
                            AbstractC1610a.m8741s("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                        break;
                    } else {
                        AbstractC1610a.m8741s("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case "avc1":
                case "avc2":
                    if (strArrSplit.length >= 2) {
                        try {
                            if (strArrSplit[1].length() != 6) {
                                i4 = 16;
                                if (strArrSplit.length < 3) {
                                    Log.m9511g("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                } else {
                                    i5 = Integer.parseInt(strArrSplit[1]);
                                    i6 = Integer.parseInt(strArrSplit[2]);
                                }
                            } else {
                                i4 = 16;
                                i5 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                i6 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                            }
                            int i16 = i5 != 66 ? i5 != 77 ? i5 != 88 ? i5 != 100 ? i5 != 110 ? i5 != 122 ? i5 != 244 ? -1 : 64 : 32 : i4 : 8 : 4 : 2 : 1;
                            if (i16 != -1) {
                                switch (i6) {
                                    case 10:
                                        i7 = -1;
                                        i8 = 1;
                                        break;
                                    case 11:
                                        i7 = -1;
                                        i8 = 4;
                                        break;
                                    case TYPE_BYTES_VALUE:
                                        i8 = 8;
                                        i7 = -1;
                                        break;
                                    case 13:
                                        i8 = i4;
                                        i7 = -1;
                                        break;
                                    default:
                                        switch (i6) {
                                            case 20:
                                                i8 = 32;
                                                i7 = -1;
                                                break;
                                            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                                i8 = 64;
                                                i7 = -1;
                                                break;
                                            case 22:
                                                i8 = 128;
                                                i7 = -1;
                                                break;
                                            default:
                                                switch (i6) {
                                                    case 30:
                                                        i8 = 256;
                                                        i7 = -1;
                                                        break;
                                                    case 31:
                                                        i8 = 512;
                                                        i7 = -1;
                                                        break;
                                                    case 32:
                                                        i8 = 1024;
                                                        i7 = -1;
                                                        break;
                                                    default:
                                                        switch (i6) {
                                                            case 40:
                                                                i8 = 2048;
                                                                i7 = -1;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 41 */:
                                                                i8 = 4096;
                                                                i7 = -1;
                                                                break;
                                                            case 42:
                                                                i8 = 8192;
                                                                i7 = -1;
                                                                break;
                                                            default:
                                                                switch (i6) {
                                                                    case 50:
                                                                        i8 = 16384;
                                                                        i7 = -1;
                                                                        break;
                                                                    case 51:
                                                                        i8 = 32768;
                                                                        i7 = -1;
                                                                        break;
                                                                    case 52:
                                                                        i8 = 65536;
                                                                        i7 = -1;
                                                                        break;
                                                                    default:
                                                                        i7 = -1;
                                                                        i8 = -1;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                if (i8 == i7) {
                                    AbstractC1610a.m8738p(i6, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                }
                            } else {
                                AbstractC1610a.m8738p(i5, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                            }
                        } catch (NumberFormatException unused2) {
                            AbstractC1610a.m8741s("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                        break;
                    } else {
                        AbstractC1610a.m8741s("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case "mp4a":
                    if (strArrSplit.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(MimeTypes.m9334e(Integer.parseInt(strArrSplit[1], 16)))) {
                                int i17 = Integer.parseInt(strArrSplit[2]);
                                int i18 = 17;
                                if (i17 == 17) {
                                    i9 = -1;
                                } else {
                                    if (i17 != 20) {
                                        i18 = 23;
                                        if (i17 != 23) {
                                            i18 = 29;
                                            if (i17 != 29) {
                                                i18 = 39;
                                                if (i17 != 39) {
                                                    i18 = 42;
                                                    if (i17 != 42) {
                                                        switch (i17) {
                                                            case 1:
                                                                i9 = -1;
                                                                i18 = 1;
                                                                break;
                                                            case 2:
                                                                i9 = -1;
                                                                i18 = 2;
                                                                break;
                                                            case 3:
                                                                i9 = -1;
                                                                i18 = 3;
                                                                break;
                                                            case 4:
                                                                i18 = 4;
                                                                break;
                                                            case 5:
                                                                i18 = 5;
                                                                break;
                                                            case 6:
                                                                i9 = -1;
                                                                i18 = 6;
                                                                break;
                                                            default:
                                                                i9 = -1;
                                                                i18 = -1;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i18 = 20;
                                    }
                                    i9 = -1;
                                }
                                if (i18 != i9) {
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            AbstractC1610a.m8741s("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                        break;
                    } else {
                        AbstractC1610a.m8741s("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case "s263":
                    Pair pair = new Pair(1, 1);
                    if (strArrSplit.length >= 3) {
                        try {
                        } catch (NumberFormatException unused4) {
                            AbstractC1610a.m8741s("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                            return pair;
                        }
                        break;
                    } else {
                        AbstractC1610a.m8741s("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case "vp09":
                    if (strArrSplit.length >= 3) {
                        try {
                            int i19 = Integer.parseInt(strArrSplit[1]);
                            int i20 = Integer.parseInt(strArrSplit[2]);
                            int i21 = i19 != 0 ? i19 != 1 ? i19 != 2 ? i19 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i21 != -1) {
                                if (i20 == 10) {
                                    i10 = -1;
                                    i11 = 1;
                                } else if (i20 != 11) {
                                    if (i20 == 20) {
                                        i11 = 4;
                                    } else if (i20 == 21) {
                                        i11 = 8;
                                    } else if (i20 == 30) {
                                        i11 = 16;
                                    } else if (i20 == 31) {
                                        i11 = 32;
                                    } else if (i20 == 40) {
                                        i11 = 64;
                                    } else if (i20 == 41) {
                                        i11 = 128;
                                    } else if (i20 == 50) {
                                        i11 = 256;
                                    } else if (i20 != 51) {
                                        switch (i20) {
                                            case 60:
                                                i11 = 2048;
                                                break;
                                            case 61:
                                                i11 = 4096;
                                                break;
                                            case 62:
                                                i11 = 8192;
                                                break;
                                            default:
                                                i10 = -1;
                                                i11 = -1;
                                                break;
                                        }
                                    } else {
                                        i11 = 512;
                                    }
                                    i10 = -1;
                                } else {
                                    i10 = -1;
                                    i11 = 2;
                                }
                                if (i11 == i10) {
                                    AbstractC1610a.m8738p(i20, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                }
                            } else {
                                AbstractC1610a.m8738p(i19, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                            }
                        } catch (NumberFormatException unused5) {
                            AbstractC1610a.m8741s("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                        break;
                    } else {
                        AbstractC1610a.m8741s("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List m10421e(String str, boolean z2, boolean z3) {
        try {
            CodecKey codecKey = new CodecKey(str, z2, z3);
            HashMap map = f27037a;
            List list = (List) map.get(codecKey);
            if (list != null) {
                return list;
            }
            ArrayList arrayListM10422f = m10422f(codecKey, new MediaCodecListCompatV21(z2, z3, str.equals("video/mv-hevc")));
            if (z2 && arrayListM10422f.isEmpty() && Util.f25665a <= 23) {
                arrayListM10422f = m10422f(codecKey, new MediaCodecListCompatV16());
                if (!arrayListM10422f.isEmpty()) {
                    Log.m9511g("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((MediaCodecInfo) arrayListM10422f.get(0)).f26953a);
                }
            }
            m10417a(str, arrayListM10422f);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListM10422f);
            map.put(codecKey, immutableListCopyOf);
            return immutableListCopyOf;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m10422f(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) throws DecoderQueryException {
        String strM10419c;
        String str;
        int i;
        String str2;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean zM8127B;
        CodecKey codecKey2 = codecKey;
        MediaCodecListCompat mediaCodecListCompat2 = mediaCodecListCompat;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = codecKey2.f27038a;
            int iMo10429d = mediaCodecListCompat2.mo10429d();
            boolean zMo10430e = mediaCodecListCompat2.mo10430e();
            int i2 = 0;
            while (i2 < iMo10429d) {
                android.media.MediaCodecInfo mediaCodecInfoMo10426a = mediaCodecListCompat2.mo10426a(i2);
                int i3 = Util.f25665a;
                if (i3 < 29 || !AbstractC1477j.m8129D(mediaCodecInfoMo10426a)) {
                    int i4 = i2;
                    String name = mediaCodecInfoMo10426a.getName();
                    if (m10424h(mediaCodecInfoMo10426a, name, zMo10430e, str3) && (strM10419c = m10419c(mediaCodecInfoMo10426a, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo10426a.getCapabilitiesForType(strM10419c);
                            boolean zMo10427b = mediaCodecListCompat2.mo10427b("tunneled-playback", strM10419c, capabilitiesForType);
                            boolean zMo10428c = mediaCodecListCompat2.mo10428c("tunneled-playback", capabilitiesForType);
                            boolean z2 = codecKey2.f27040c;
                            if ((z2 || !zMo10428c) && (!z2 || zMo10427b)) {
                                boolean zMo10427b2 = mediaCodecListCompat2.mo10427b("secure-playback", strM10419c, capabilitiesForType);
                                boolean zMo10428c2 = mediaCodecListCompat2.mo10428c("secure-playback", capabilitiesForType);
                                boolean z3 = codecKey2.f27039b;
                                if ((z3 || !zMo10428c2) && (!z3 || zMo10427b2)) {
                                    boolean zM8154y = i3 >= 29 ? AbstractC1477j.m8154y(mediaCodecInfoMo10426a) : !m10425i(mediaCodecInfoMo10426a, str3);
                                    try {
                                        boolean zM10425i = m10425i(mediaCodecInfoMo10426a, str3);
                                        if (i3 >= 29) {
                                            zM8127B = AbstractC1477j.m8127B(mediaCodecInfoMo10426a);
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            String lowerCase = Ascii.toLowerCase(mediaCodecInfoMo10426a.getName());
                                            if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
                                                codecCapabilities = capabilitiesForType;
                                                zM8127B = false;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                zM8127B = true;
                                            }
                                        }
                                        if (!(zMo10430e && z3 == zMo10427b2) && (zMo10430e || z3)) {
                                            i = i4;
                                            boolean z4 = zM8154y;
                                            str2 = strM10419c;
                                            if (!zMo10430e && zMo10427b2) {
                                                str = name;
                                                try {
                                                    arrayList.add(MediaCodecInfo.m10375i(name + ".secure", str3, str2, codecCapabilities, z4, zM10425i, zM8127B, true));
                                                    break;
                                                } catch (Exception e) {
                                                    e = e;
                                                    if (Util.f25665a <= 23 || arrayList.isEmpty()) {
                                                        Log.m9507c("MediaCodecUtil", "Failed to query codec " + str + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                    Log.m9507c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i2 = i + 1;
                                                    codecKey2 = codecKey;
                                                    mediaCodecListCompat2 = mediaCodecListCompat;
                                                }
                                            }
                                        } else {
                                            i = i4;
                                            str2 = strM10419c;
                                            try {
                                                arrayList.add(MediaCodecInfo.m10375i(name, str3, str2, codecCapabilities, zM8154y, zM10425i, zM8127B, false));
                                            } catch (Exception e2) {
                                                e = e2;
                                                str = name;
                                                if (Util.f25665a <= 23) {
                                                }
                                                Log.m9507c("MediaCodecUtil", "Failed to query codec " + str + " (" + str2 + ")");
                                                throw e;
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = name;
                                        i = i4;
                                        str2 = strM10419c;
                                    }
                                } else {
                                    i = i4;
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str = name;
                            i = i4;
                            str2 = strM10419c;
                        }
                    }
                } else {
                    i = i2;
                }
                i2 = i + 1;
                codecKey2 = codecKey;
                mediaCodecListCompat2 = mediaCodecListCompat;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new DecoderQueryException("Failed to query underlying media codecs", e5);
        }
    }

    /* JADX INFO: renamed from: g */
    public static ImmutableList m10423g(C1846d c1846d, Format format, boolean z2, boolean z3) {
        String str = format.f25161n;
        c1846d.getClass();
        List listM10421e = m10421e(str, z2, z3);
        String strM10418b = m10418b(format);
        return ImmutableList.builder().addAll((Iterable) listM10421e).addAll((Iterable) (strM10418b == null ? ImmutableList.m14824of() : m10421e(strM10418b, z2, z3))).build();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m10424h(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z2 && str.endsWith(".secure")) {
            return false;
        }
        int i = Util.f25665a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m10425i(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.f25665a >= 29) {
            return AbstractC1477j.m8149t(mediaCodecInfo);
        }
        if (MimeTypes.m9338i(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }
}
