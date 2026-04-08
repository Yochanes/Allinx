package androidx.media3.extractor;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Ac4Util {

    /* JADX INFO: renamed from: a */
    public static final int[] f28122a = {MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, 2000, 1920, 1601, 1600, MTCommonConstants.MainWhat.ON_SERVICE_CONNECTED, 1000, 960, 800, 800, 480, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 2048};

    /* JADX INFO: compiled from: Proguard */
    public static final class Ac4Presentation {

        /* JADX INFO: renamed from: a */
        public boolean f28123a;

        /* JADX INFO: renamed from: b */
        public int f28124b;

        /* JADX INFO: renamed from: c */
        public int f28125c;

        /* JADX INFO: renamed from: d */
        public boolean f28126d;

        /* JADX INFO: renamed from: e */
        public int f28127e;

        /* JADX INFO: renamed from: f */
        public int f28128f;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SyncFrameInfo {

        /* JADX INFO: renamed from: a */
        public final int f28129a;

        /* JADX INFO: renamed from: b */
        public final int f28130b;

        /* JADX INFO: renamed from: c */
        public final int f28131c;

        public SyncFrameInfo(int i, int i2, int i3) {
            this.f28129a = i;
            this.f28130b = i2;
            this.f28131c = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10765a(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.m9543D(7);
        byte[] bArr = parsableByteArray.f25644a;
        bArr[0] = -84;
        bArr[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031e  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Format m10766b(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) throws ParserException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zM9529f;
        int i7;
        int iM9530g;
        int iM9530g2;
        int iM9530g3;
        int i8;
        boolean z2;
        int i9;
        boolean zM9529f2;
        boolean z3;
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.m9535l(parsableByteArray);
        int iM9525b = parsableBitArray.m9525b();
        int iM9530g4 = parsableBitArray.m9530g(3);
        if (iM9530g4 > 1) {
            throw ParserException.m9345b("Unsupported AC-4 DSI version: " + iM9530g4);
        }
        int iM9530g5 = parsableBitArray.m9530g(7);
        int i10 = parsableBitArray.m9529f() ? 48000 : 44100;
        parsableBitArray.m9538o(4);
        int iM9530g6 = parsableBitArray.m9530g(9);
        if (iM9530g5 > 1) {
            if (iM9530g4 == 0) {
                throw ParserException.m9345b("Invalid AC-4 DSI version: " + iM9530g4);
            }
            if (parsableBitArray.m9529f()) {
                parsableBitArray.m9538o(16);
                if (parsableBitArray.m9529f()) {
                    parsableBitArray.m9538o(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                }
            }
        }
        if (iM9530g4 == 1) {
            if (parsableBitArray.m9525b() < 66) {
                throw ParserException.m9345b("Invalid AC-4 DSI bitrate.");
            }
            parsableBitArray.m9538o(66);
            parsableBitArray.m9526c();
        }
        Ac4Presentation ac4Presentation = new Ac4Presentation();
        ac4Presentation.f28123a = true;
        ac4Presentation.f28124b = -1;
        ac4Presentation.f28125c = -1;
        ac4Presentation.f28126d = true;
        ac4Presentation.f28127e = 2;
        ac4Presentation.f28128f = 0;
        for (int i11 = 0; i11 < iM9530g6; i11++) {
            if (iM9530g4 == 0) {
                zM9529f = parsableBitArray.m9529f();
                i7 = 8;
                iM9530g = parsableBitArray.m9530g(5);
                iM9530g2 = parsableBitArray.m9530g(5);
                iM9530g3 = 0;
                i8 = 0;
                z2 = false;
            } else {
                int iM9530g7 = parsableBitArray.m9530g(8);
                iM9530g3 = parsableBitArray.m9530g(8);
                i7 = 8;
                if (iM9530g3 == 255) {
                    iM9530g3 += parsableBitArray.m9530g(16);
                }
                if (iM9530g7 > 2) {
                    parsableBitArray.m9538o(iM9530g3 * 8);
                } else {
                    int iM9525b2 = (iM9525b - parsableBitArray.m9525b()) / 8;
                    iM9530g = parsableBitArray.m9530g(5);
                    z2 = iM9530g == 31;
                    iM9530g2 = iM9530g7;
                    i8 = iM9525b2;
                    zM9529f = false;
                }
            }
            if (zM9529f || z2 || iM9530g != 6) {
                ac4Presentation.f28128f = parsableBitArray.m9530g(3);
                if (parsableBitArray.m9529f()) {
                    parsableBitArray.m9538o(5);
                }
                parsableBitArray.m9538o(2);
                int i12 = 1;
                i9 = iM9530g2;
                if (iM9530g4 == 1 && (i9 == 1 || i9 == 2)) {
                    parsableBitArray.m9538o(2);
                }
                parsableBitArray.m9538o(5);
                parsableBitArray.m9538o(10);
                if (iM9530g4 == 1) {
                    if (i9 > 0) {
                        ac4Presentation.f28123a = parsableBitArray.m9529f();
                    }
                    if (ac4Presentation.f28123a) {
                        if (i9 == 1 || i9 == 2) {
                            int iM9530g8 = parsableBitArray.m9530g(5);
                            if (iM9530g8 >= 0 && iM9530g8 <= 15) {
                                ac4Presentation.f28124b = iM9530g8;
                            }
                            if (iM9530g8 >= 11 && iM9530g8 <= 14) {
                                ac4Presentation.f28126d = parsableBitArray.m9529f();
                                ac4Presentation.f28127e = parsableBitArray.m9530g(2);
                            }
                        }
                        parsableBitArray.m9538o(24);
                        i12 = 1;
                    }
                    if (i9 == i12 || i9 == 2) {
                        if (parsableBitArray.m9529f() && parsableBitArray.m9529f()) {
                            parsableBitArray.m9538o(2);
                        }
                        if (parsableBitArray.m9529f()) {
                            parsableBitArray.m9537n();
                            int i13 = i7;
                            int iM9530g9 = parsableBitArray.m9530g(i13);
                            int i14 = 0;
                            while (i14 < iM9530g9) {
                                parsableBitArray.m9538o(i13);
                                i14++;
                                i13 = 8;
                            }
                        }
                    }
                }
                if (!zM9529f && !z2) {
                    parsableBitArray.m9537n();
                    if (iM9530g == 0 || iM9530g == 1 || iM9530g == 2) {
                        if (i9 == 0) {
                            for (int i15 = 0; i15 < 2; i15++) {
                                m10768d(parsableBitArray, ac4Presentation);
                            }
                        } else {
                            for (int i16 = 0; i16 < 2; i16++) {
                                m10769e(parsableBitArray, ac4Presentation);
                            }
                        }
                    } else if (iM9530g == 3 || iM9530g == 4) {
                        if (i9 == 0) {
                            for (int i17 = 0; i17 < 3; i17++) {
                                m10768d(parsableBitArray, ac4Presentation);
                            }
                        } else {
                            for (int i18 = 0; i18 < 3; i18++) {
                                m10769e(parsableBitArray, ac4Presentation);
                            }
                        }
                    } else if (iM9530g != 5) {
                        int iM9530g10 = parsableBitArray.m9530g(7);
                        for (int i19 = 0; i19 < iM9530g10; i19++) {
                            parsableBitArray.m9538o(8);
                        }
                    } else if (i9 == 0) {
                        m10768d(parsableBitArray, ac4Presentation);
                    } else {
                        int iM9530g11 = parsableBitArray.m9530g(3);
                        for (int i20 = 0; i20 < iM9530g11 + 2; i20++) {
                            m10769e(parsableBitArray, ac4Presentation);
                        }
                    }
                } else if (i9 == 0) {
                    m10768d(parsableBitArray, ac4Presentation);
                } else {
                    m10769e(parsableBitArray, ac4Presentation);
                }
                parsableBitArray.m9537n();
                zM9529f2 = parsableBitArray.m9529f();
            } else {
                i9 = iM9530g2;
                zM9529f2 = true;
            }
            if (zM9529f2) {
                i5 = 7;
                int iM9530g12 = parsableBitArray.m9530g(7);
                for (int i21 = 0; i21 < iM9530g12; i21++) {
                    parsableBitArray.m9538o(15);
                }
            } else {
                i5 = 7;
            }
            if (i9 <= 0) {
                i2 = 5;
                i = 3;
                i3 = 8;
                parsableBitArray.m9526c();
                if (iM9530g4 == 1) {
                    int iM9525b3 = ((iM9525b - parsableBitArray.m9525b()) / 8) - i8;
                    if (iM9530g3 < iM9525b3) {
                        throw ParserException.m9345b("pres_bytes is smaller than presentation bytes read.");
                    }
                    parsableBitArray.m9539p(iM9530g3 - iM9525b3);
                }
                if (ac4Presentation.f28123a) {
                    i4 = -1;
                } else {
                    i4 = -1;
                    if (ac4Presentation.f28124b == -1) {
                        throw ParserException.m9345b("Can't determine channel mode of presentation " + i11);
                    }
                }
            } else {
                if (parsableBitArray.m9529f()) {
                    if (parsableBitArray.m9525b() < 66) {
                        z3 = false;
                    } else {
                        parsableBitArray.m9538o(66);
                        z3 = true;
                    }
                    if (!z3) {
                        throw ParserException.m9345b("Can't parse bitrate DSI.");
                    }
                }
                if (parsableBitArray.m9529f()) {
                    parsableBitArray.m9526c();
                    parsableBitArray.m9539p(parsableBitArray.m9530g(16));
                    i2 = 5;
                    int iM9530g13 = parsableBitArray.m9530g(5);
                    int i22 = 0;
                    while (true) {
                        i = 3;
                        if (i22 >= iM9530g13) {
                            break;
                        }
                        parsableBitArray.m9538o(3);
                        parsableBitArray.m9538o(8);
                        i22++;
                    }
                }
                i3 = 8;
                parsableBitArray.m9526c();
                if (iM9530g4 == 1) {
                }
                if (ac4Presentation.f28123a) {
                }
            }
            if (ac4Presentation.f28123a) {
                i2 = ac4Presentation.f28125c + 1;
                if (ac4Presentation.f28128f == 4 && i2 == 17) {
                    i2 = 21;
                }
            } else {
                int i23 = ac4Presentation.f28124b;
                boolean z4 = ac4Presentation.f28126d;
                int i24 = ac4Presentation.f28127e;
                switch (i23) {
                    case 0:
                        i6 = 11;
                        i2 = 1;
                        break;
                    case 1:
                        i2 = 2;
                        i6 = 11;
                        break;
                    case 2:
                        i2 = i;
                        i6 = 11;
                        break;
                    case 3:
                        i6 = 11;
                        break;
                    case 4:
                        i6 = 11;
                        i2 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i2 = i5;
                        i6 = 11;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i2 = i3;
                        i6 = 11;
                        break;
                    case 11:
                        i6 = 11;
                        i2 = 11;
                        break;
                    case TYPE_BYTES_VALUE:
                        i2 = 12;
                        i6 = 11;
                        break;
                    case 13:
                        i2 = 13;
                        i6 = 11;
                        break;
                    case 14:
                        i6 = 11;
                        i2 = 14;
                        break;
                    case 15:
                        i6 = 11;
                        i2 = 24;
                        break;
                    default:
                        i2 = i4;
                        i6 = 11;
                        break;
                }
                if (i23 == i6 || i23 == 12 || i23 == 13 || i23 == 14) {
                    if (!z4) {
                        i2 -= 2;
                    }
                    if (i24 == 0) {
                        i2 -= 4;
                    } else if (i24 == 1) {
                        i2 -= 2;
                    }
                }
            }
            if (i2 > 0) {
                throw ParserException.m9345b("Can't determine channel count of presentation.");
            }
            Format.Builder builder = new Format.Builder();
            builder.f25186a = str;
            builder.f25198m = MimeTypes.m9342m("audio/ac4");
            builder.f25176C = i2;
            builder.f25177D = i10;
            builder.f25202q = drmInitData;
            builder.f25189d = str2;
            return new Format(builder);
        }
        i = 3;
        i2 = 5;
        i3 = 8;
        i4 = -1;
        i5 = 7;
        if (ac4Presentation.f28123a) {
        }
        if (i2 > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SyncFrameInfo m10767c(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int iM9530g = parsableBitArray.m9530g(16);
        int iM9530g2 = parsableBitArray.m9530g(16);
        if (iM9530g2 == 65535) {
            iM9530g2 = parsableBitArray.m9530g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM9530g2 + i;
        if (iM9530g == 44097) {
            i3 += 2;
        }
        if (parsableBitArray.m9530g(2) == 3) {
            do {
                parsableBitArray.m9530g(2);
            } while (parsableBitArray.m9529f());
        }
        int iM9530g3 = parsableBitArray.m9530g(10);
        if (parsableBitArray.m9529f() && parsableBitArray.m9530g(3) > 0) {
            parsableBitArray.m9538o(2);
        }
        int i4 = parsableBitArray.m9529f() ? 48000 : 44100;
        int iM9530g4 = parsableBitArray.m9530g(4);
        int[] iArr = f28122a;
        if (i4 == 44100 && iM9530g4 == 13) {
            i2 = iArr[iM9530g4];
        } else if (i4 != 48000 || iM9530g4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iM9530g4];
            int i6 = iM9530g3 % 5;
            if (i6 == 1) {
                i2 = (iM9530g4 == 3 || iM9530g4 == 8) ? i5 + 1 : i5;
            } else if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4 && (iM9530g4 == 3 || iM9530g4 == 8 || iM9530g4 == 11)) {
                    }
                }
            } else if (iM9530g4 == 8 || iM9530g4 == 11) {
            }
        }
        return new SyncFrameInfo(i4, i3, i2);
    }

    /* JADX INFO: renamed from: d */
    public static void m10768d(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        int iM9530g = parsableBitArray.m9530g(5);
        parsableBitArray.m9538o(2);
        if (parsableBitArray.m9529f()) {
            parsableBitArray.m9538o(5);
        }
        if (iM9530g >= 7 && iM9530g <= 10) {
            parsableBitArray.m9537n();
        }
        if (parsableBitArray.m9529f()) {
            int iM9530g2 = parsableBitArray.m9530g(3);
            if (ac4Presentation.f28124b == -1 && iM9530g >= 0 && iM9530g <= 15 && (iM9530g2 == 0 || iM9530g2 == 1)) {
                ac4Presentation.f28124b = iM9530g;
            }
            if (parsableBitArray.m9529f()) {
                m10770f(parsableBitArray);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m10769e(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        parsableBitArray.m9538o(2);
        boolean zM9529f = parsableBitArray.m9529f();
        int iM9530g = parsableBitArray.m9530g(8);
        for (int i = 0; i < iM9530g; i++) {
            parsableBitArray.m9538o(2);
            if (parsableBitArray.m9529f()) {
                parsableBitArray.m9538o(5);
            }
            if (zM9529f) {
                parsableBitArray.m9538o(24);
            } else {
                if (parsableBitArray.m9529f()) {
                    if (!parsableBitArray.m9529f()) {
                        parsableBitArray.m9538o(4);
                    }
                    ac4Presentation.f28125c = parsableBitArray.m9530g(6) + 1;
                }
                parsableBitArray.m9538o(4);
            }
        }
        if (parsableBitArray.m9529f()) {
            parsableBitArray.m9538o(3);
            if (parsableBitArray.m9529f()) {
                m10770f(parsableBitArray);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m10770f(ParsableBitArray parsableBitArray) throws ParserException {
        int iM9530g = parsableBitArray.m9530g(6);
        if (iM9530g < 2 || iM9530g > 42) {
            throw ParserException.m9345b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM9530g)));
        }
        parsableBitArray.m9538o(iM9530g * 8);
    }
}
