package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AacUtil {

    /* JADX INFO: renamed from: a */
    public static final int[] f28111a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f28112b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Config {

        /* JADX INFO: renamed from: a */
        public final int f28113a;

        /* JADX INFO: renamed from: b */
        public final int f28114b;

        /* JADX INFO: renamed from: c */
        public final String f28115c;

        public Config(int i, int i2, String str) {
            this.f28113a = i;
            this.f28114b = i2;
            this.f28115c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10762a(ParsableBitArray parsableBitArray) throws ParserException {
        int iM9530g = parsableBitArray.m9530g(4);
        if (iM9530g == 15) {
            if (parsableBitArray.m9525b() >= 24) {
                return parsableBitArray.m9530g(24);
            }
            throw ParserException.m9344a(null, "AAC header insufficient data");
        }
        if (iM9530g < 13) {
            return f28111a[iM9530g];
        }
        throw ParserException.m9344a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX INFO: renamed from: b */
    public static Config m10763b(ParsableBitArray parsableBitArray, boolean z2) throws ParserException {
        int iM9530g = parsableBitArray.m9530g(5);
        if (iM9530g == 31) {
            iM9530g = parsableBitArray.m9530g(6) + 32;
        }
        int iM10762a = m10762a(parsableBitArray);
        int iM9530g2 = parsableBitArray.m9530g(4);
        String strM9f = AbstractC0000a.m9f(iM9530g, "mp4a.40.");
        if (iM9530g == 5 || iM9530g == 29) {
            iM10762a = m10762a(parsableBitArray);
            int iM9530g3 = parsableBitArray.m9530g(5);
            if (iM9530g3 == 31) {
                iM9530g3 = parsableBitArray.m9530g(6) + 32;
            }
            iM9530g = iM9530g3;
            if (iM9530g == 22) {
                iM9530g2 = parsableBitArray.m9530g(4);
            }
        }
        if (z2) {
            if (iM9530g != 1 && iM9530g != 2 && iM9530g != 3 && iM9530g != 4 && iM9530g != 6 && iM9530g != 7 && iM9530g != 17) {
                switch (iM9530g) {
                    case 19:
                    case 20:
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                        break;
                    default:
                        throw ParserException.m9345b("Unsupported audio object type: " + iM9530g);
                }
            }
            if (parsableBitArray.m9529f()) {
                Log.m9511g("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (parsableBitArray.m9529f()) {
                parsableBitArray.m9538o(14);
            }
            boolean zM9529f = parsableBitArray.m9529f();
            if (iM9530g2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM9530g == 6 || iM9530g == 20) {
                parsableBitArray.m9538o(3);
            }
            if (zM9529f) {
                if (iM9530g == 22) {
                    parsableBitArray.m9538o(16);
                }
                if (iM9530g == 17 || iM9530g == 19 || iM9530g == 20 || iM9530g == 23) {
                    parsableBitArray.m9538o(3);
                }
                parsableBitArray.m9538o(1);
            }
            switch (iM9530g) {
                case 17:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                    int iM9530g4 = parsableBitArray.m9530g(2);
                    if (iM9530g4 == 2 || iM9530g4 == 3) {
                        throw ParserException.m9345b("Unsupported epConfig: " + iM9530g4);
                    }
                    break;
            }
        }
        int i = f28112b[iM9530g2];
        if (i != -1) {
            return new Config(iM10762a, i, strM9f);
        }
        throw ParserException.m9344a(null, null);
    }
}
