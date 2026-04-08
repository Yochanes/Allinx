package androidx.media3.common;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Util;
import com.engagelab.privates.common.observer.MTObservable;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class MimeTypes {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f25313a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f25314b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: compiled from: Proguard */
    public static final class CustomMimeType {
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static final class Mp4aObjectType {

        /* JADX INFO: renamed from: a */
        public final int f25315a;

        /* JADX INFO: renamed from: b */
        public final int f25316b;

        public Mp4aObjectType(int i, int i2) {
            this.f25315a = i;
            this.f25316b = i2;
        }

        /* JADX INFO: renamed from: a */
        public final int m9343a() {
            int i = this.f25316b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i != 42) {
                return i != 22 ? i != 23 ? 0 : 15 : Ints.MAX_POWER_OF_TWO;
            }
            return 16;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9330a(String str, String str2) {
        Mp4aObjectType mp4aObjectTypeM9335f;
        int iM9343a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (mp4aObjectTypeM9335f = m9335f(str2)) != null && (iM9343a = mp4aObjectTypeM9335f.m9343a()) != 0 && iM9343a != 16) {
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9331b(String str, String str2) {
        String string = null;
        if (str != null) {
            String[] strArrM9607Q = Util.m9607Q(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM9607Q) {
                if (str2.equals(m9333d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                string = sb.toString();
            }
        }
        return string != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static int m9332c(String str, String str2) {
        Mp4aObjectType mp4aObjectTypeM9335f;
        str.getClass();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b2 = 0;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    b2 = 1;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    b2 = 2;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b2 = 3;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b2 = 4;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    b2 = 5;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    b2 = 6;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b2 = 7;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b2 = 8;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b2 = 9;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b2 = 10;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b2 = Ascii.f42547VT;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (mp4aObjectTypeM9335f = m9335f(str2)) == null) {
                    return 0;
                }
                return mp4aObjectTypeM9335f.m9343a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m9333d(String str) {
        Mp4aObjectType mp4aObjectTypeM9335f;
        String strM9334e = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (mp4aObjectTypeM9335f = m9335f(lowerCase)) != null) {
                strM9334e = m9334e(mp4aObjectTypeM9335f.f25315a);
            }
            return strM9334e == null ? "audio/mp4a-latm" : strM9334e;
        }
        if (lowerCase.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (lowerCase.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (lowerCase.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (lowerCase.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (lowerCase.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (lowerCase.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (lowerCase.startsWith("opus")) {
            return "audio/opus";
        }
        if (lowerCase.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (lowerCase.startsWith("flac")) {
            return "audio/flac";
        }
        if (lowerCase.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (lowerCase.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (lowerCase.contains("cea708")) {
            return "application/cea-708";
        }
        if (lowerCase.contains("eia608") || lowerCase.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f25313a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CustomMimeType) arrayList.get(i)).getClass();
            if (lowerCase.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m9334e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
            case MTObservable.WHAT_OBSERVER /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Mp4aObjectType m9335f(String str) {
        Matcher matcher = f25314b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new Mp4aObjectType(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m9336g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: h */
    public static int m9337h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m9338i(str)) {
            return 1;
        }
        if (m9341l(str)) {
            return 2;
        }
        if (m9340k(str)) {
            return 3;
        }
        if (m9339j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f25313a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CustomMimeType) arrayList.get(i)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9338i(String str) {
        return "audio".equals(m9336g(str));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m9339j(String str) {
        return AppearanceType.IMAGE.equals(m9336g(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9340k(String str) {
        return AttributeType.TEXT.equals(m9336g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9341l(String str) {
        return "video".equals(m9336g(str));
    }

    /* JADX INFO: renamed from: m */
    public static String m9342m(String str) {
        String lowerCase;
        if (str == null) {
            return null;
        }
        lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return lowerCase;
        }
    }
}
