package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.zxing.aztec.encoder.Encoder;
import io.intercom.android.sdk.models.carousel.Carousel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"material3_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ColorSchemeKt {

    /* JADX INFO: renamed from: a */
    public static final StaticProvidableCompositionLocal f12599a = new StaticProvidableCompositionLocal(ColorSchemeKt$LocalColorScheme$1.f12601a);

    /* JADX INFO: renamed from: b */
    public static final StaticProvidableCompositionLocal f12600b = new StaticProvidableCompositionLocal(ColorSchemeKt$LocalTonalElevationEnabled$1.f12602a);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[13] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[14] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[17] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[18] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[42] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[19] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[20] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[23] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[24] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[25] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[26] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[29] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[30] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[31] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[34] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[43] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[35] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[36] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[37] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[38] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[39] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[40] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[41] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[44] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[45] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final long m3903a(ColorScheme colorScheme, long j) {
        if (Color.m5181c(j, colorScheme.f12573a)) {
            return colorScheme.f12574b;
        }
        if (Color.m5181c(j, colorScheme.f12578f)) {
            return colorScheme.f12579g;
        }
        if (Color.m5181c(j, colorScheme.f12582j)) {
            return colorScheme.f12583k;
        }
        if (Color.m5181c(j, colorScheme.f12586n)) {
            return colorScheme.f12587o;
        }
        if (Color.m5181c(j, colorScheme.f12595w)) {
            return colorScheme.f12596x;
        }
        if (Color.m5181c(j, colorScheme.f12575c)) {
            return colorScheme.f12576d;
        }
        if (Color.m5181c(j, colorScheme.f12580h)) {
            return colorScheme.f12581i;
        }
        if (Color.m5181c(j, colorScheme.f12584l)) {
            return colorScheme.f12585m;
        }
        if (Color.m5181c(j, colorScheme.f12597y)) {
            return colorScheme.f12598z;
        }
        if (Color.m5181c(j, colorScheme.f12593u)) {
            return colorScheme.f12594v;
        }
        boolean zM5181c = Color.m5181c(j, colorScheme.f12588p);
        long j2 = colorScheme.f12589q;
        if (zM5181c) {
            return j2;
        }
        if (Color.m5181c(j, colorScheme.f12590r)) {
            return colorScheme.f12591s;
        }
        if (Color.m5181c(j, colorScheme.f12554D) || Color.m5181c(j, colorScheme.f12556F) || Color.m5181c(j, colorScheme.f12557G) || Color.m5181c(j, colorScheme.f12558H) || Color.m5181c(j, colorScheme.f12559I) || Color.m5181c(j, colorScheme.f12560J)) {
            return j2;
        }
        int i = Color.f17584l;
        return Color.f17583k;
    }

    /* JADX INFO: renamed from: b */
    public static final long m3904b(long j, Composer composer) {
        composer.mo4221N(-1680936624);
        long jM3903a = m3903a(MaterialTheme.m3971a(composer), j);
        if (jM3903a == 16) {
            jM3903a = ((Color) composer.mo4247y(ContentColorKt.f12679a)).f17585a;
        }
        composer.mo4213F();
        return jM3903a;
    }

    /* JADX INFO: renamed from: c */
    public static final long m3905c(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return colorScheme.f12586n;
            case 1:
                return colorScheme.f12595w;
            case 2:
                return colorScheme.f12597y;
            case 3:
                return colorScheme.f12594v;
            case 4:
                return colorScheme.f12577e;
            case 5:
                return colorScheme.f12593u;
            case 6:
                return colorScheme.f12587o;
            case 7:
                return colorScheme.f12596x;
            case 8:
                return colorScheme.f12598z;
            case 9:
                return colorScheme.f12574b;
            case 10:
                return colorScheme.f12576d;
            case 11:
            case TYPE_BYTES_VALUE:
            case 15:
            case 16:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case 27:
            case 28:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            default:
                int i = Color.f17584l;
                return Color.f17583k;
            case 13:
                return colorScheme.f12579g;
            case 14:
                return colorScheme.f12581i;
            case 17:
                return colorScheme.f12589q;
            case 18:
                return colorScheme.f12591s;
            case 19:
                return colorScheme.f12583k;
            case 20:
                return colorScheme.f12585m;
            case ConnectionResult.API_DISABLED /* 23 */:
                return colorScheme.f12551A;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return colorScheme.f12552B;
            case BuildConfig.VERSION_CODE /* 25 */:
                return colorScheme.f12573a;
            case 26:
                return colorScheme.f12575c;
            case 29:
                return colorScheme.f12553C;
            case 30:
                return colorScheme.f12578f;
            case 31:
                return colorScheme.f12580h;
            case 34:
                return colorScheme.f12588p;
            case 35:
                return colorScheme.f12554D;
            case 36:
                return colorScheme.f12556F;
            case 37:
                return colorScheme.f12557G;
            case 38:
                return colorScheme.f12558H;
            case 39:
                return colorScheme.f12559I;
            case 40:
                return colorScheme.f12560J;
            case me.jessyan.autosize.BuildConfig.VERSION_CODE /* 41 */:
                return colorScheme.f12555E;
            case 42:
                return colorScheme.f12592t;
            case 43:
                return colorScheme.f12590r;
            case Carousel.ENTITY_TYPE /* 44 */:
                return colorScheme.f12582j;
            case 45:
                return colorScheme.f12584l;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m3906d(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer) {
        return m3905c(MaterialTheme.m3971a(composer), colorSchemeKeyTokens);
    }

    /* JADX INFO: renamed from: e */
    public static ColorScheme m3907e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i) {
        long j14 = (i & 1) != 0 ? ColorLightTokens.f15823t : j;
        return new ColorScheme(j14, (i & 2) != 0 ? ColorLightTokens.f15813j : j2, ColorLightTokens.f15824u, (i & 8) != 0 ? ColorLightTokens.f15814k : j3, ColorLightTokens.f15808e, ColorLightTokens.f15826w, ColorLightTokens.f15815l, ColorLightTokens.f15827x, (i & 256) != 0 ? ColorLightTokens.f15816m : j4, ColorLightTokens.f15802H, ColorLightTokens.f15819p, ColorLightTokens.f15803I, (i & 4096) != 0 ? ColorLightTokens.f15820q : j5, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? ColorLightTokens.f15804a : j6, (i & 16384) != 0 ? ColorLightTokens.f15810g : j7, (32768 & i) != 0 ? ColorLightTokens.f15828y : j8, (65536 & i) != 0 ? ColorLightTokens.f15817n : j9, (131072 & i) != 0 ? ColorLightTokens.f15801G : j10, (262144 & i) != 0 ? ColorLightTokens.f15818o : j11, (524288 & i) != 0 ? j14 : j12, ColorLightTokens.f15809f, ColorLightTokens.f15807d, (i & 4194304) != 0 ? ColorLightTokens.f15805b : j13, ColorLightTokens.f15811h, ColorLightTokens.f15806c, ColorLightTokens.f15812i, ColorLightTokens.f15821r, ColorLightTokens.f15822s, ColorLightTokens.f15825v, ColorLightTokens.f15829z, ColorLightTokens.f15800F, ColorLightTokens.f15795A, ColorLightTokens.f15796B, ColorLightTokens.f15797C, ColorLightTokens.f15798D, ColorLightTokens.f15799E);
    }
}
