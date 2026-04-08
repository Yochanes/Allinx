package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.ColorInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
@UnstableApi
public final class CodecSpecificDataUtil {

    /* JADX INFO: renamed from: a */
    public static final byte[] f25580a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f25581b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final Pattern f25582c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: a */
    public static String m9470a(int i, boolean z2, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {f25581b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z2 ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = Util.f25665a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m9471b(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        Integer numValueOf;
        byte b2 = 3;
        if (strArr.length < 4) {
            AbstractC1610a.m8741s("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f25582c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC1610a.m8741s("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (colorInfo == null || colorInfo.f25107c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                AbstractC1610a.m8741s("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    b2 = !str2.equals("H30") ? (byte) -1 : (byte) 0;
                    break;
                case 70914:
                    b2 = !str2.equals("H60") ? (byte) -1 : (byte) 1;
                    break;
                case 70917:
                    b2 = !str2.equals("H63") ? (byte) -1 : (byte) 2;
                    break;
                case 71007:
                    if (!str2.equals("H90")) {
                        b2 = -1;
                    }
                    break;
                case 71010:
                    b2 = !str2.equals("H93") ? (byte) -1 : (byte) 4;
                    break;
                case 74665:
                    b2 = !str2.equals("L30") ? (byte) -1 : (byte) 5;
                    break;
                case 74758:
                    b2 = !str2.equals("L60") ? (byte) -1 : (byte) 6;
                    break;
                case 74761:
                    b2 = !str2.equals("L63") ? (byte) -1 : (byte) 7;
                    break;
                case 74851:
                    b2 = !str2.equals("L90") ? (byte) -1 : (byte) 8;
                    break;
                case 74854:
                    b2 = !str2.equals("L93") ? (byte) -1 : (byte) 9;
                    break;
                case 2193639:
                    b2 = !str2.equals("H120") ? (byte) -1 : (byte) 10;
                    break;
                case 2193642:
                    b2 = !str2.equals("H123") ? (byte) -1 : Ascii.f42547VT;
                    break;
                case 2193732:
                    b2 = !str2.equals("H150") ? (byte) -1 : Ascii.f42536FF;
                    break;
                case 2193735:
                    b2 = !str2.equals("H153") ? (byte) -1 : Ascii.f42534CR;
                    break;
                case 2193738:
                    b2 = !str2.equals("H156") ? (byte) -1 : Ascii.f42544SO;
                    break;
                case 2193825:
                    b2 = !str2.equals("H180") ? (byte) -1 : Ascii.f42543SI;
                    break;
                case 2193828:
                    b2 = !str2.equals("H183") ? (byte) -1 : (byte) 16;
                    break;
                case 2193831:
                    b2 = !str2.equals("H186") ? (byte) -1 : (byte) 17;
                    break;
                case 2312803:
                    b2 = !str2.equals("L120") ? (byte) -1 : Ascii.DC2;
                    break;
                case 2312806:
                    b2 = !str2.equals("L123") ? (byte) -1 : (byte) 19;
                    break;
                case 2312896:
                    b2 = !str2.equals("L150") ? (byte) -1 : Ascii.DC4;
                    break;
                case 2312899:
                    b2 = !str2.equals("L153") ? (byte) -1 : Ascii.NAK;
                    break;
                case 2312902:
                    b2 = !str2.equals("L156") ? (byte) -1 : Ascii.SYN;
                    break;
                case 2312989:
                    b2 = !str2.equals("L180") ? (byte) -1 : Ascii.ETB;
                    break;
                case 2312992:
                    b2 = !str2.equals("L183") ? (byte) -1 : Ascii.CAN;
                    break;
                case 2312995:
                    b2 = !str2.equals("L186") ? (byte) -1 : Ascii.f42535EM;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    numValueOf = 2;
                    break;
                case 1:
                    numValueOf = 8;
                    break;
                case 2:
                    numValueOf = 32;
                    break;
                case 3:
                    numValueOf = Integer.valueOf(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    break;
                case 4:
                    numValueOf = 512;
                    break;
                case 5:
                    numValueOf = 1;
                    break;
                case 6:
                    numValueOf = 4;
                    break;
                case 7:
                    numValueOf = 16;
                    break;
                case 8:
                    numValueOf = 64;
                    break;
                case 9:
                    numValueOf = 256;
                    break;
                case 10:
                    numValueOf = 2048;
                    break;
                case 11:
                    numValueOf = Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    break;
                case TYPE_BYTES_VALUE:
                    numValueOf = 32768;
                    break;
                case 13:
                    numValueOf = 131072;
                    break;
                case 14:
                    numValueOf = 524288;
                    break;
                case 15:
                    numValueOf = 2097152;
                    break;
                case 16:
                    numValueOf = 8388608;
                    break;
                case 17:
                    numValueOf = 33554432;
                    break;
                case 18:
                    numValueOf = Integer.valueOf(UserMetadata.MAX_ATTRIBUTE_SIZE);
                    break;
                case 19:
                    numValueOf = 4096;
                    break;
                case 20:
                    numValueOf = 16384;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    numValueOf = 65536;
                    break;
                case 22:
                    numValueOf = 262144;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    numValueOf = 1048576;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    numValueOf = 4194304;
                    break;
                case BuildConfig.VERSION_CODE /* 25 */:
                    numValueOf = 16777216;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i), numValueOf);
        }
        AbstractC1610a.m8741s("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}
