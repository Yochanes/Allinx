package androidx.media3.extractor.text.pgs;

import android.graphics.Bitmap;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PgsParser implements SubtitleParser {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f29168a = new ParsableByteArray();

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f29169b = new ParsableByteArray();

    /* JADX INFO: renamed from: c */
    public final CueBuilder f29170c = new CueBuilder();

    /* JADX INFO: renamed from: d */
    public Inflater f29171d;

    /* JADX INFO: compiled from: Proguard */
    public static final class CueBuilder {

        /* JADX INFO: renamed from: a */
        public final ParsableByteArray f29172a = new ParsableByteArray();

        /* JADX INFO: renamed from: b */
        public final int[] f29173b = new int[256];

        /* JADX INFO: renamed from: c */
        public boolean f29174c;

        /* JADX INFO: renamed from: d */
        public int f29175d;

        /* JADX INFO: renamed from: e */
        public int f29176e;

        /* JADX INFO: renamed from: f */
        public int f29177f;

        /* JADX INFO: renamed from: g */
        public int f29178g;

        /* JADX INFO: renamed from: h */
        public int f29179h;

        /* JADX INFO: renamed from: i */
        public int f29180i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    @Override // androidx.media3.extractor.text.SubtitleParser
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10960a(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        ParsableByteArray parsableByteArray;
        char c2;
        ParsableByteArray parsableByteArray2;
        int i3;
        int i4;
        int i5;
        ParsableByteArray parsableByteArray3;
        int i6;
        ParsableByteArray parsableByteArray4;
        int i7;
        int i8;
        int iM9571x;
        int i9 = 4;
        int i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        ParsableByteArray parsableByteArray5 = this.f29168a;
        parsableByteArray5.m9544E(i + i2, bArr);
        parsableByteArray5.m9546G(i);
        if (this.f29171d == null) {
            this.f29171d = new Inflater();
        }
        Inflater inflater = this.f29171d;
        int i11 = Util.f25665a;
        char c3 = 255;
        if (parsableByteArray5.m9548a() > 0 && (parsableByteArray5.f25644a[parsableByteArray5.f25645b] & UnsignedBytes.MAX_VALUE) == 120) {
            ParsableByteArray parsableByteArray6 = this.f29169b;
            if (Util.m9593C(parsableByteArray5, parsableByteArray6, inflater)) {
                parsableByteArray5.m9544E(parsableByteArray6.f25646c, parsableByteArray6.f25644a);
            }
        }
        CueBuilder cueBuilder = this.f29170c;
        int i12 = 0;
        cueBuilder.f29175d = 0;
        cueBuilder.f29176e = 0;
        cueBuilder.f29177f = 0;
        cueBuilder.f29178g = 0;
        cueBuilder.f29179h = 0;
        cueBuilder.f29180i = 0;
        ParsableByteArray parsableByteArray7 = cueBuilder.f29172a;
        parsableByteArray7.m9543D(0);
        cueBuilder.f29174c = false;
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray5.m9548a() >= 3) {
            int i13 = parsableByteArray5.f25646c;
            int iM9568u = parsableByteArray5.m9568u();
            int iM9540A = parsableByteArray5.m9540A();
            int i14 = parsableByteArray5.f25645b + iM9540A;
            Cue cueM9457a = null;
            if (i14 > i13) {
                parsableByteArray5.m9546G(i13);
                i3 = i10;
                parsableByteArray3 = parsableByteArray5;
                parsableByteArray2 = parsableByteArray7;
                i4 = i12;
                c2 = c3;
            } else {
                int[] iArr = cueBuilder.f29173b;
                if (iM9568u != i10) {
                    switch (iM9568u) {
                        case 20:
                            if (iM9540A % 5 == 2) {
                                parsableByteArray5.m9547H(2);
                                Arrays.fill(iArr, i12);
                                int i15 = iM9540A / 5;
                                int i16 = i12;
                                while (i16 < i15) {
                                    int iM9568u2 = parsableByteArray5.m9568u();
                                    int i17 = i10;
                                    double dM9568u = parsableByteArray5.m9568u();
                                    double dM9568u2 = parsableByteArray5.m9568u() - 128;
                                    double dM9568u3 = parsableByteArray5.m9568u() - 128;
                                    iArr[iM9568u2] = Util.m9618i((int) ((dM9568u3 * 1.772d) + dM9568u), 0, 255) | (parsableByteArray5.m9568u() << 24) | (Util.m9618i((int) ((1.402d * dM9568u2) + dM9568u), 0, 255) << 16) | (Util.m9618i((int) ((dM9568u - (0.34414d * dM9568u3)) - (dM9568u2 * 0.71414d)), 0, 255) << 8);
                                    i16++;
                                    parsableByteArray7 = parsableByteArray7;
                                    c3 = 255;
                                    parsableByteArray5 = parsableByteArray5;
                                    i10 = i17;
                                }
                                i6 = i10;
                                parsableByteArray = parsableByteArray5;
                                c2 = c3;
                                parsableByteArray4 = parsableByteArray7;
                                cueBuilder.f29174c = true;
                            } else {
                                i6 = i10;
                                parsableByteArray = parsableByteArray5;
                                c2 = c3;
                                parsableByteArray4 = parsableByteArray7;
                            }
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            if (iM9540A >= i9) {
                                parsableByteArray5.m9547H(3);
                                int i18 = iM9540A - 4;
                                if (((parsableByteArray5.m9568u() & i10) != 0 ? 1 : i12) == 0) {
                                    i7 = parsableByteArray7.f25645b;
                                    i8 = parsableByteArray7.f25646c;
                                    if (i7 < i8 && i18 > 0) {
                                        int iMin = Math.min(i18, i8 - i7);
                                        parsableByteArray5.m9552e(parsableByteArray7.f25644a, i7, iMin);
                                        parsableByteArray7.m9546G(i7 + iMin);
                                    }
                                } else if (i18 >= 7 && (iM9571x = parsableByteArray5.m9571x()) >= i9) {
                                    cueBuilder.f29179h = parsableByteArray5.m9540A();
                                    cueBuilder.f29180i = parsableByteArray5.m9540A();
                                    parsableByteArray7.m9543D(iM9571x - i9);
                                    i18 = iM9540A - 11;
                                    i7 = parsableByteArray7.f25645b;
                                    i8 = parsableByteArray7.f25646c;
                                    if (i7 < i8) {
                                        int iMin2 = Math.min(i18, i8 - i7);
                                        parsableByteArray5.m9552e(parsableByteArray7.f25644a, i7, iMin2);
                                        parsableByteArray7.m9546G(i7 + iMin2);
                                    }
                                }
                            }
                            i6 = i10;
                            parsableByteArray = parsableByteArray5;
                            c2 = c3;
                            parsableByteArray4 = parsableByteArray7;
                            break;
                        case 22:
                            if (iM9540A >= 19) {
                                cueBuilder.f29175d = parsableByteArray5.m9540A();
                                cueBuilder.f29176e = parsableByteArray5.m9540A();
                                parsableByteArray5.m9547H(11);
                                cueBuilder.f29177f = parsableByteArray5.m9540A();
                                cueBuilder.f29178g = parsableByteArray5.m9540A();
                            }
                            i6 = i10;
                            parsableByteArray = parsableByteArray5;
                            c2 = c3;
                            parsableByteArray4 = parsableByteArray7;
                            break;
                    }
                    parsableByteArray2 = parsableByteArray4;
                    i3 = i6;
                    i4 = 0;
                } else {
                    int i19 = i10;
                    parsableByteArray = parsableByteArray5;
                    c2 = c3;
                    ParsableByteArray parsableByteArray8 = parsableByteArray7;
                    if (cueBuilder.f29175d == 0 || cueBuilder.f29176e == 0 || cueBuilder.f29179h == 0 || cueBuilder.f29180i == 0) {
                        parsableByteArray2 = parsableByteArray8;
                    } else {
                        parsableByteArray2 = parsableByteArray8;
                        int i20 = parsableByteArray2.f25646c;
                        if (i20 != 0 && parsableByteArray2.f25645b == i20 && cueBuilder.f29174c) {
                            parsableByteArray2.m9546G(0);
                            int i21 = cueBuilder.f29179h * cueBuilder.f29180i;
                            int[] iArr2 = new int[i21];
                            int i22 = 0;
                            while (i22 < i21) {
                                int iM9568u3 = parsableByteArray2.m9568u();
                                if (iM9568u3 != 0) {
                                    iArr2[i22] = iArr[iM9568u3];
                                    i22++;
                                } else {
                                    int iM9568u4 = parsableByteArray2.m9568u();
                                    if (iM9568u4 != 0) {
                                        i5 = i19;
                                        int iM9568u5 = ((iM9568u4 & 64) == 0 ? iM9568u4 & 63 : ((iM9568u4 & 63) << 8) | parsableByteArray2.m9568u()) + i22;
                                        Arrays.fill(iArr2, i22, iM9568u5, (iM9568u4 & i5) == 0 ? iArr[0] : iArr[parsableByteArray2.m9568u()]);
                                        i22 = iM9568u5;
                                    }
                                    i19 = i5;
                                }
                                i5 = i19;
                                i19 = i5;
                            }
                            i3 = i19;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, cueBuilder.f29179h, cueBuilder.f29180i, Bitmap.Config.ARGB_8888);
                            Cue.Builder builder = new Cue.Builder();
                            builder.f25537b = bitmapCreateBitmap;
                            float f = cueBuilder.f29177f;
                            float f2 = cueBuilder.f29175d;
                            builder.f25543h = f / f2;
                            builder.f25544i = 0;
                            float f3 = cueBuilder.f29178g;
                            float f4 = cueBuilder.f29176e;
                            builder.f25540e = f3 / f4;
                            builder.f25541f = 0;
                            builder.f25542g = 0;
                            builder.f25547l = cueBuilder.f29179h / f2;
                            builder.f25548m = cueBuilder.f29180i / f4;
                            cueM9457a = builder.m9457a();
                        }
                        i4 = 0;
                        cueBuilder.f29175d = 0;
                        cueBuilder.f29176e = 0;
                        cueBuilder.f29177f = 0;
                        cueBuilder.f29178g = 0;
                        cueBuilder.f29179h = 0;
                        cueBuilder.f29180i = 0;
                        parsableByteArray2.m9543D(0);
                        cueBuilder.f29174c = false;
                    }
                    i3 = i19;
                    i4 = 0;
                    cueBuilder.f29175d = 0;
                    cueBuilder.f29176e = 0;
                    cueBuilder.f29177f = 0;
                    cueBuilder.f29178g = 0;
                    cueBuilder.f29179h = 0;
                    cueBuilder.f29180i = 0;
                    parsableByteArray2.m9543D(0);
                    cueBuilder.f29174c = false;
                }
                parsableByteArray3 = parsableByteArray;
                parsableByteArray3.m9546G(i14);
            }
            if (cueM9457a != null) {
                arrayList.add(cueM9457a);
            }
            parsableByteArray7 = parsableByteArray2;
            c3 = c2;
            i12 = i4;
            i9 = 4;
            parsableByteArray5 = parsableByteArray3;
            i10 = i3;
        }
        consumer.accept(new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
