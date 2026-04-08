package androidx.media3.extractor.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.king.logx.logger.Logger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Cea708Decoder extends CeaDecoder {

    /* JADX INFO: renamed from: h */
    public final ParsableByteArray f29059h = new ParsableByteArray();

    /* JADX INFO: renamed from: i */
    public final ParsableBitArray f29060i = new ParsableBitArray();

    /* JADX INFO: renamed from: j */
    public int f29061j = -1;

    /* JADX INFO: renamed from: k */
    public final int f29062k;

    /* JADX INFO: renamed from: l */
    public final CueInfoBuilder[] f29063l;

    /* JADX INFO: renamed from: m */
    public CueInfoBuilder f29064m;

    /* JADX INFO: renamed from: n */
    public List f29065n;

    /* JADX INFO: renamed from: o */
    public List f29066o;

    /* JADX INFO: renamed from: p */
    public DtvCcPacket f29067p;

    /* JADX INFO: renamed from: q */
    public int f29068q;

    /* JADX INFO: compiled from: Proguard */
    public static final class Cea708CueInfo {

        /* JADX INFO: renamed from: c */
        public static final C1971a f29069c = new C1971a();

        /* JADX INFO: renamed from: a */
        public final Cue f29070a;

        /* JADX INFO: renamed from: b */
        public final int f29071b;

        public Cea708CueInfo(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z2, int i3, int i4) {
            Cue.Builder builder = new Cue.Builder();
            builder.f25536a = spannableStringBuilder;
            builder.f25538c = alignment;
            builder.f25540e = f;
            builder.f25541f = 0;
            builder.f25542g = i;
            builder.f25543h = f2;
            builder.f25544i = i2;
            builder.f25547l = -3.4028235E38f;
            if (z2) {
                builder.f25550o = i3;
                builder.f25549n = true;
            }
            this.f29070a = builder.m9457a();
            this.f29071b = i4;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CueInfoBuilder {

        /* JADX INFO: renamed from: A */
        public static final boolean[] f29072A;

        /* JADX INFO: renamed from: B */
        public static final int[] f29073B;

        /* JADX INFO: renamed from: C */
        public static final int[] f29074C;

        /* JADX INFO: renamed from: D */
        public static final int[] f29075D;

        /* JADX INFO: renamed from: E */
        public static final int[] f29076E;

        /* JADX INFO: renamed from: v */
        public static final int f29077v = m10978c(2, 2, 2, 0);

        /* JADX INFO: renamed from: w */
        public static final int f29078w;

        /* JADX INFO: renamed from: x */
        public static final int[] f29079x;

        /* JADX INFO: renamed from: y */
        public static final int[] f29080y;

        /* JADX INFO: renamed from: z */
        public static final int[] f29081z;

        /* JADX INFO: renamed from: a */
        public final ArrayList f29082a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final SpannableStringBuilder f29083b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c */
        public boolean f29084c;

        /* JADX INFO: renamed from: d */
        public boolean f29085d;

        /* JADX INFO: renamed from: e */
        public int f29086e;

        /* JADX INFO: renamed from: f */
        public boolean f29087f;

        /* JADX INFO: renamed from: g */
        public int f29088g;

        /* JADX INFO: renamed from: h */
        public int f29089h;

        /* JADX INFO: renamed from: i */
        public int f29090i;

        /* JADX INFO: renamed from: j */
        public int f29091j;

        /* JADX INFO: renamed from: k */
        public int f29092k;

        /* JADX INFO: renamed from: l */
        public int f29093l;

        /* JADX INFO: renamed from: m */
        public int f29094m;

        /* JADX INFO: renamed from: n */
        public int f29095n;

        /* JADX INFO: renamed from: o */
        public int f29096o;

        /* JADX INFO: renamed from: p */
        public int f29097p;

        /* JADX INFO: renamed from: q */
        public int f29098q;

        /* JADX INFO: renamed from: r */
        public int f29099r;

        /* JADX INFO: renamed from: s */
        public int f29100s;

        /* JADX INFO: renamed from: t */
        public int f29101t;

        /* JADX INFO: renamed from: u */
        public int f29102u;

        static {
            int iM10978c = m10978c(0, 0, 0, 0);
            f29078w = iM10978c;
            int iM10978c2 = m10978c(0, 0, 0, 3);
            f29079x = new int[]{0, 0, 0, 0, 0, 2, 0};
            f29080y = new int[]{0, 0, 0, 0, 0, 0, 2};
            f29081z = new int[]{3, 3, 3, 3, 3, 3, 1};
            f29072A = new boolean[]{false, false, false, true, true, true, false};
            f29073B = new int[]{iM10978c, iM10978c2, iM10978c, iM10978c, iM10978c2, iM10978c, iM10978c};
            f29074C = new int[]{0, 1, 2, 3, 4, 3, 4};
            f29075D = new int[]{0, 0, 0, 0, 0, 3, 3};
            f29076E = new int[]{iM10978c, iM10978c, iM10978c, iM10978c, iM10978c, iM10978c2, iM10978c2};
        }

        public CueInfoBuilder() {
            m10981d();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m10978c(int i, int i2, int i3, int i4) {
            int i5;
            Assertions.m9462c(i, 4);
            Assertions.m9462c(i2, 4);
            Assertions.m9462c(i3, 4);
            Assertions.m9462c(i4, 4);
            if (i4 == 0 || i4 == 1) {
                i5 = 255;
            } else if (i4 == 2) {
                i5 = 127;
            } else if (i4 == 3) {
                i5 = 0;
            }
            return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m10979a(char c2) {
            SpannableStringBuilder spannableStringBuilder = this.f29083b;
            if (c2 != '\n') {
                spannableStringBuilder.append(c2);
                return;
            }
            ArrayList arrayList = this.f29082a;
            arrayList.add(m10980b());
            spannableStringBuilder.clear();
            if (this.f29096o != -1) {
                this.f29096o = 0;
            }
            if (this.f29097p != -1) {
                this.f29097p = 0;
            }
            if (this.f29098q != -1) {
                this.f29098q = 0;
            }
            if (this.f29100s != -1) {
                this.f29100s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f29091j && arrayList.size() < 15) {
                    this.f29102u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        /* JADX INFO: renamed from: b */
        public final SpannableString m10980b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29083b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f29096o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f29096o, length, 33);
                }
                if (this.f29097p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f29097p, length, 33);
                }
                if (this.f29098q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f29099r), this.f29098q, length, 33);
                }
                if (this.f29100s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f29101t), this.f29100s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: d */
        public final void m10981d() {
            this.f29082a.clear();
            this.f29083b.clear();
            this.f29096o = -1;
            this.f29097p = -1;
            this.f29098q = -1;
            this.f29100s = -1;
            this.f29102u = 0;
            this.f29084c = false;
            this.f29085d = false;
            this.f29086e = 4;
            this.f29087f = false;
            this.f29088g = 0;
            this.f29089h = 0;
            this.f29090i = 0;
            this.f29091j = 15;
            this.f29092k = 0;
            this.f29093l = 0;
            this.f29094m = 0;
            int i = f29078w;
            this.f29095n = i;
            this.f29099r = f29077v;
            this.f29101t = i;
        }

        /* JADX INFO: renamed from: e */
        public final void m10982e(boolean z2, boolean z3) {
            int i = this.f29096o;
            SpannableStringBuilder spannableStringBuilder = this.f29083b;
            if (i != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f29096o, spannableStringBuilder.length(), 33);
                    this.f29096o = -1;
                }
            } else if (z2) {
                this.f29096o = spannableStringBuilder.length();
            }
            if (this.f29097p == -1) {
                if (z3) {
                    this.f29097p = spannableStringBuilder.length();
                }
            } else {
                if (z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f29097p, spannableStringBuilder.length(), 33);
                this.f29097p = -1;
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m10983f(int i, int i2) {
            int i3 = this.f29098q;
            SpannableStringBuilder spannableStringBuilder = this.f29083b;
            if (i3 != -1 && this.f29099r != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f29099r), this.f29098q, spannableStringBuilder.length(), 33);
            }
            if (i != f29077v) {
                this.f29098q = spannableStringBuilder.length();
                this.f29099r = i;
            }
            if (this.f29100s != -1 && this.f29101t != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f29101t), this.f29100s, spannableStringBuilder.length(), 33);
            }
            if (i2 != f29078w) {
                this.f29100s = spannableStringBuilder.length();
                this.f29101t = i2;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DtvCcPacket {

        /* JADX INFO: renamed from: a */
        public final int f29103a;

        /* JADX INFO: renamed from: b */
        public final int f29104b;

        /* JADX INFO: renamed from: c */
        public final byte[] f29105c;

        /* JADX INFO: renamed from: d */
        public int f29106d = 0;

        public DtvCcPacket(int i, int i2) {
            this.f29103a = i;
            this.f29104b = i2;
            this.f29105c = new byte[(i2 * 2) - 1];
        }
    }

    public Cea708Decoder(int i, List list) {
        this.f29062k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = CodecSpecificDataUtil.f25580a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b2 = ((byte[]) list.get(0))[0];
            }
        }
        this.f29063l = new CueInfoBuilder[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f29063l[i2] = new CueInfoBuilder();
        }
        this.f29064m = this.f29063l[0];
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    /* JADX INFO: renamed from: d */
    public final void mo10958d(long j) {
        this.f29111e = j;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void flush() {
        super.flush();
        this.f29065n = null;
        this.f29066o = null;
        this.f29068q = 0;
        this.f29064m = this.f29063l[0];
        m10977m();
        this.f29067p = null;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /* JADX INFO: renamed from: g */
    public final Subtitle mo10963g() {
        List list = this.f29065n;
        this.f29066o = list;
        list.getClass();
        return new CeaSubtitle(list);
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /* JADX INFO: renamed from: h */
    public final void mo10964h(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = subtitleInputBuffer.f25936d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.f29059h;
        parsableByteArray.m9544E(iLimit, bArrArray);
        while (parsableByteArray.m9548a() >= 3) {
            int iM9568u = parsableByteArray.m9568u();
            int i = iM9568u & 3;
            boolean z2 = (iM9568u & 4) == 4;
            byte bM9568u = (byte) parsableByteArray.m9568u();
            byte bM9568u2 = (byte) parsableByteArray.m9568u();
            if (i == 2 || i == 3) {
                if (z2) {
                    if (i == 3) {
                        m10975k();
                        int i2 = (bM9568u & 192) >> 6;
                        int i3 = this.f29061j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m10977m();
                            Log.m9511g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f29061j + " current=" + i2);
                        }
                        this.f29061j = i2;
                        int i4 = bM9568u & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i2, i4);
                        this.f29067p = dtvCcPacket;
                        dtvCcPacket.f29106d = 1;
                        dtvCcPacket.f29105c[0] = bM9568u2;
                    } else {
                        Assertions.m9460a(i == 2);
                        DtvCcPacket dtvCcPacket2 = this.f29067p;
                        if (dtvCcPacket2 == null) {
                            Log.m9507c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = dtvCcPacket2.f29105c;
                            int i5 = dtvCcPacket2.f29106d;
                            int i6 = i5 + 1;
                            dtvCcPacket2.f29106d = i6;
                            bArr[i5] = bM9568u;
                            dtvCcPacket2.f29106d = i5 + 2;
                            bArr[i6] = bM9568u2;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.f29067p;
                    if (dtvCcPacket3.f29106d == (dtvCcPacket3.f29104b * 2) - 1) {
                        m10975k();
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /* JADX INFO: renamed from: j */
    public final boolean mo10966j() {
        return this.f29065n != this.f29066o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k */
    public final void m10975k() {
        boolean z2;
        char c2;
        int i;
        boolean z3;
        DtvCcPacket dtvCcPacket = this.f29067p;
        if (dtvCcPacket == null) {
            return;
        }
        int i2 = 2;
        if (dtvCcPacket.f29106d != (dtvCcPacket.f29104b * 2) - 1) {
            Log.m9506b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f29067p.f29104b * 2) - 1) + ", but current index is " + this.f29067p.f29106d + " (sequence number " + this.f29067p.f29103a + ");");
        }
        DtvCcPacket dtvCcPacket2 = this.f29067p;
        byte[] bArr = dtvCcPacket2.f29105c;
        int i3 = dtvCcPacket2.f29106d;
        ParsableBitArray parsableBitArray = this.f29060i;
        parsableBitArray.m9534k(i3, bArr);
        boolean z4 = false;
        while (true) {
            if (parsableBitArray.m9525b() > 0) {
                int i4 = 3;
                int iM9530g = parsableBitArray.m9530g(3);
                int iM9530g2 = parsableBitArray.m9530g(5);
                if (iM9530g == 7) {
                    parsableBitArray.m9538o(i2);
                    iM9530g = parsableBitArray.m9530g(6);
                    if (iM9530g < 7) {
                        AbstractC1610a.m8738p(iM9530g, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (iM9530g2 == 0) {
                    if (iM9530g != 0) {
                        Log.m9511g("Cea708Decoder", "serviceNumber is non-zero (" + iM9530g + ") when blockSize is 0");
                    }
                } else if (iM9530g != this.f29062k) {
                    parsableBitArray.m9539p(iM9530g2);
                } else {
                    int iM9528e = (iM9530g2 * 8) + parsableBitArray.m9528e();
                    while (parsableBitArray.m9528e() < iM9528e) {
                        int iM9530g3 = parsableBitArray.m9530g(8);
                        if (iM9530g3 != 16) {
                            if (iM9530g3 <= 31) {
                                if (iM9530g3 != 0) {
                                    if (iM9530g3 == i4) {
                                        this.f29065n = m10976l();
                                    } else if (iM9530g3 != 8) {
                                        switch (iM9530g3) {
                                            case TYPE_BYTES_VALUE:
                                                m10977m();
                                                break;
                                            case 13:
                                                this.f29064m.m10979a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (iM9530g3 >= 17 && iM9530g3 <= 23) {
                                                    Log.m9511g("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM9530g3);
                                                    parsableBitArray.m9538o(8);
                                                } else if (iM9530g3 < 24 || iM9530g3 > 31) {
                                                    AbstractC1610a.m8738p(iM9530g3, "Invalid C0 command: ", "Cea708Decoder");
                                                } else {
                                                    Log.m9511g("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM9530g3);
                                                    parsableBitArray.m9538o(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f29064m.f29083b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (iM9530g3 <= 127) {
                                if (iM9530g3 == 127) {
                                    this.f29064m.m10979a((char) 9835);
                                } else {
                                    this.f29064m.m10979a((char) (iM9530g3 & 255));
                                }
                                i = i2;
                                z4 = true;
                            } else {
                                if (iM9530g3 <= 159) {
                                    CueInfoBuilder[] cueInfoBuilderArr = this.f29063l;
                                    switch (iM9530g3) {
                                        case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z3 = false;
                                            z2 = true;
                                            int i5 = iM9530g3 - 128;
                                            if (this.f29068q != i5) {
                                                this.f29068q = i5;
                                                this.f29064m = cueInfoBuilderArr[i5];
                                            }
                                            break;
                                        case 136:
                                            z2 = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (parsableBitArray.m9529f()) {
                                                    CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[8 - i6];
                                                    cueInfoBuilder.f29082a.clear();
                                                    cueInfoBuilder.f29083b.clear();
                                                    cueInfoBuilder.f29096o = -1;
                                                    cueInfoBuilder.f29097p = -1;
                                                    cueInfoBuilder.f29098q = -1;
                                                    cueInfoBuilder.f29100s = -1;
                                                    cueInfoBuilder.f29102u = 0;
                                                }
                                            }
                                            z3 = false;
                                            break;
                                        case 137:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (parsableBitArray.m9529f()) {
                                                    cueInfoBuilderArr[8 - i7].f29085d = true;
                                                }
                                            }
                                            z2 = true;
                                            z3 = false;
                                            break;
                                        case 138:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (parsableBitArray.m9529f()) {
                                                    cueInfoBuilderArr[8 - i8].f29085d = false;
                                                }
                                            }
                                            z3 = false;
                                            z2 = true;
                                            break;
                                        case 139:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (parsableBitArray.m9529f()) {
                                                    cueInfoBuilderArr[8 - i9].f29085d = !r3.f29085d;
                                                }
                                            }
                                            z3 = false;
                                            z2 = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (parsableBitArray.m9529f()) {
                                                    cueInfoBuilderArr[8 - i10].m10981d();
                                                }
                                            }
                                            z3 = false;
                                            z2 = true;
                                            break;
                                        case 141:
                                            parsableBitArray.m9538o(8);
                                            z3 = false;
                                            z2 = true;
                                            break;
                                        case 142:
                                            z3 = false;
                                            z2 = true;
                                            break;
                                        case 143:
                                            m10977m();
                                            z3 = false;
                                            z2 = true;
                                            break;
                                        case 144:
                                            if (this.f29064m.f29084c) {
                                                parsableBitArray.m9530g(4);
                                                parsableBitArray.m9530g(2);
                                                parsableBitArray.m9530g(2);
                                                boolean zM9529f = parsableBitArray.m9529f();
                                                boolean zM9529f2 = parsableBitArray.m9529f();
                                                i4 = 3;
                                                parsableBitArray.m9530g(3);
                                                parsableBitArray.m9530g(3);
                                                this.f29064m.m10982e(zM9529f, zM9529f2);
                                                z3 = false;
                                                z2 = true;
                                            } else {
                                                parsableBitArray.m9538o(16);
                                                z3 = false;
                                                i4 = 3;
                                                z2 = true;
                                            }
                                            break;
                                        case 145:
                                            if (this.f29064m.f29084c) {
                                                int iM10978c = CueInfoBuilder.m10978c(parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2));
                                                int iM10978c2 = CueInfoBuilder.m10978c(parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2));
                                                parsableBitArray.m9538o(2);
                                                CueInfoBuilder.m10978c(parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), 0);
                                                this.f29064m.m10983f(iM10978c, iM10978c2);
                                            } else {
                                                parsableBitArray.m9538o(24);
                                            }
                                            z3 = false;
                                            i4 = 3;
                                            z2 = true;
                                            break;
                                        case 146:
                                            if (this.f29064m.f29084c) {
                                                parsableBitArray.m9538o(4);
                                                int iM9530g4 = parsableBitArray.m9530g(4);
                                                parsableBitArray.m9538o(2);
                                                parsableBitArray.m9530g(6);
                                                CueInfoBuilder cueInfoBuilder2 = this.f29064m;
                                                if (cueInfoBuilder2.f29102u != iM9530g4) {
                                                    cueInfoBuilder2.m10979a('\n');
                                                }
                                                cueInfoBuilder2.f29102u = iM9530g4;
                                            } else {
                                                parsableBitArray.m9538o(16);
                                            }
                                            z3 = false;
                                            i4 = 3;
                                            z2 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC1610a.m8738p(iM9530g3, "Invalid C1 command: ", "Cea708Decoder");
                                            z3 = false;
                                            z2 = true;
                                            break;
                                        case 151:
                                            if (this.f29064m.f29084c) {
                                                int iM10978c3 = CueInfoBuilder.m10978c(parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2));
                                                parsableBitArray.m9530g(2);
                                                CueInfoBuilder.m10978c(parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), parsableBitArray.m9530g(2), 0);
                                                parsableBitArray.m9529f();
                                                parsableBitArray.m9529f();
                                                parsableBitArray.m9530g(2);
                                                parsableBitArray.m9530g(2);
                                                int iM9530g5 = parsableBitArray.m9530g(2);
                                                parsableBitArray.m9538o(8);
                                                CueInfoBuilder cueInfoBuilder3 = this.f29064m;
                                                cueInfoBuilder3.f29095n = iM10978c3;
                                                cueInfoBuilder3.f29092k = iM9530g5;
                                            } else {
                                                parsableBitArray.m9538o(32);
                                            }
                                            z3 = false;
                                            i4 = 3;
                                            z2 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i11 = iM9530g3 - 152;
                                            CueInfoBuilder cueInfoBuilder4 = cueInfoBuilderArr[i11];
                                            parsableBitArray.m9538o(i2);
                                            boolean zM9529f3 = parsableBitArray.m9529f();
                                            parsableBitArray.m9538o(i2);
                                            int iM9530g6 = parsableBitArray.m9530g(i4);
                                            boolean zM9529f4 = parsableBitArray.m9529f();
                                            int iM9530g7 = parsableBitArray.m9530g(7);
                                            int iM9530g8 = parsableBitArray.m9530g(8);
                                            int iM9530g9 = parsableBitArray.m9530g(4);
                                            int iM9530g10 = parsableBitArray.m9530g(4);
                                            parsableBitArray.m9538o(i2);
                                            parsableBitArray.m9538o(6);
                                            parsableBitArray.m9538o(i2);
                                            int iM9530g11 = parsableBitArray.m9530g(3);
                                            int iM9530g12 = parsableBitArray.m9530g(3);
                                            cueInfoBuilder4.f29084c = true;
                                            cueInfoBuilder4.f29085d = zM9529f3;
                                            cueInfoBuilder4.f29086e = iM9530g6;
                                            cueInfoBuilder4.f29087f = zM9529f4;
                                            cueInfoBuilder4.f29088g = iM9530g7;
                                            cueInfoBuilder4.f29089h = iM9530g8;
                                            cueInfoBuilder4.f29090i = iM9530g9;
                                            int i12 = iM9530g10 + 1;
                                            if (cueInfoBuilder4.f29091j != i12) {
                                                cueInfoBuilder4.f29091j = i12;
                                                while (true) {
                                                    ArrayList arrayList = cueInfoBuilder4.f29082a;
                                                    if (arrayList.size() >= cueInfoBuilder4.f29091j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iM9530g11 != 0 && cueInfoBuilder4.f29093l != iM9530g11) {
                                                cueInfoBuilder4.f29093l = iM9530g11;
                                                int i13 = iM9530g11 - 1;
                                                int i14 = CueInfoBuilder.f29073B[i13];
                                                boolean z5 = CueInfoBuilder.f29072A[i13];
                                                int i15 = CueInfoBuilder.f29080y[i13];
                                                int i16 = CueInfoBuilder.f29081z[i13];
                                                int i17 = CueInfoBuilder.f29079x[i13];
                                                cueInfoBuilder4.f29095n = i14;
                                                cueInfoBuilder4.f29092k = i17;
                                            }
                                            if (iM9530g12 != 0 && cueInfoBuilder4.f29094m != iM9530g12) {
                                                cueInfoBuilder4.f29094m = iM9530g12;
                                                int i18 = iM9530g12 - 1;
                                                int i19 = CueInfoBuilder.f29075D[i18];
                                                int i20 = CueInfoBuilder.f29074C[i18];
                                                cueInfoBuilder4.m10982e(false, false);
                                                cueInfoBuilder4.m10983f(CueInfoBuilder.f29077v, CueInfoBuilder.f29076E[i18]);
                                            }
                                            if (this.f29068q != i11) {
                                                this.f29068q = i11;
                                                this.f29064m = cueInfoBuilderArr[i11];
                                            }
                                            z3 = false;
                                            i4 = 3;
                                            z2 = true;
                                            break;
                                    }
                                } else {
                                    z3 = false;
                                    z2 = true;
                                    if (iM9530g3 <= 255) {
                                        this.f29064m.m10979a((char) (iM9530g3 & 255));
                                    } else {
                                        AbstractC1610a.m8738p(iM9530g3, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c2 = 7;
                                    }
                                }
                                z4 = z2;
                                i = 2;
                                c2 = 7;
                            }
                            z2 = true;
                            c2 = 7;
                        } else {
                            z2 = true;
                            int iM9530g13 = parsableBitArray.m9530g(8);
                            if (iM9530g13 <= 31) {
                                c2 = 7;
                                if (iM9530g13 > 7) {
                                    if (iM9530g13 <= 15) {
                                        parsableBitArray.m9538o(8);
                                    } else if (iM9530g13 <= 23) {
                                        parsableBitArray.m9538o(16);
                                    } else if (iM9530g13 <= 31) {
                                        parsableBitArray.m9538o(24);
                                    }
                                }
                            } else {
                                c2 = 7;
                                if (iM9530g13 <= 127) {
                                    if (iM9530g13 == 32) {
                                        this.f29064m.m10979a(' ');
                                    } else if (iM9530g13 == 33) {
                                        this.f29064m.m10979a((char) 160);
                                    } else if (iM9530g13 == 37) {
                                        this.f29064m.m10979a((char) 8230);
                                    } else if (iM9530g13 == 42) {
                                        this.f29064m.m10979a((char) 352);
                                    } else if (iM9530g13 == 44) {
                                        this.f29064m.m10979a((char) 338);
                                    } else if (iM9530g13 == 63) {
                                        this.f29064m.m10979a((char) 376);
                                    } else if (iM9530g13 == 57) {
                                        this.f29064m.m10979a((char) 8482);
                                    } else if (iM9530g13 == 58) {
                                        this.f29064m.m10979a((char) 353);
                                    } else if (iM9530g13 == 60) {
                                        this.f29064m.m10979a((char) 339);
                                    } else if (iM9530g13 != 61) {
                                        switch (iM9530g13) {
                                            case 48:
                                                this.f29064m.m10979a((char) 9608);
                                                break;
                                            case 49:
                                                this.f29064m.m10979a((char) 8216);
                                                break;
                                            case 50:
                                                this.f29064m.m10979a((char) 8217);
                                                break;
                                            case 51:
                                                this.f29064m.m10979a((char) 8220);
                                                break;
                                            case 52:
                                                this.f29064m.m10979a((char) 8221);
                                                break;
                                            case 53:
                                                this.f29064m.m10979a((char) 8226);
                                                break;
                                            default:
                                                switch (iM9530g13) {
                                                    case 118:
                                                        this.f29064m.m10979a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f29064m.m10979a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f29064m.m10979a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f29064m.m10979a((char) 8542);
                                                        break;
                                                    case ModuleDescriptor.MODULE_VERSION /* 122 */:
                                                        this.f29064m.m10979a(Logger.HORIZONTAL_LINE);
                                                        break;
                                                    case 123:
                                                        this.f29064m.m10979a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f29064m.m10979a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f29064m.m10979a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f29064m.m10979a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f29064m.m10979a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC1610a.m8738p(iM9530g13, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f29064m.m10979a((char) 8480);
                                    }
                                    z4 = true;
                                } else if (iM9530g13 > 159) {
                                    i = 2;
                                    if (iM9530g13 <= 255) {
                                        if (iM9530g13 == 160) {
                                            this.f29064m.m10979a((char) 13252);
                                        } else {
                                            AbstractC1610a.m8738p(iM9530g13, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f29064m.m10979a('_');
                                        }
                                        z4 = true;
                                    } else {
                                        AbstractC1610a.m8738p(iM9530g13, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (iM9530g13 <= 135) {
                                    parsableBitArray.m9538o(32);
                                } else if (iM9530g13 <= 143) {
                                    parsableBitArray.m9538o(40);
                                } else if (iM9530g13 <= 159) {
                                    i = 2;
                                    parsableBitArray.m9538o(2);
                                    parsableBitArray.m9538o(parsableBitArray.m9530g(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z4) {
            this.f29065n = m10976l();
        }
        this.f29067p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m10976l() {
        Cea708CueInfo cea708CueInfo;
        Layout.Alignment alignment;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 8; i4++) {
            CueInfoBuilder[] cueInfoBuilderArr = this.f29063l;
            CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[i4];
            if (cueInfoBuilder.f29084c && (!cueInfoBuilder.f29082a.isEmpty() || cueInfoBuilder.f29083b.length() != 0)) {
                CueInfoBuilder cueInfoBuilder2 = cueInfoBuilderArr[i4];
                if (!cueInfoBuilder2.f29085d) {
                    continue;
                } else if (cueInfoBuilder2.f29084c) {
                    ArrayList arrayList2 = cueInfoBuilder2.f29082a;
                    if (arrayList2.isEmpty() && cueInfoBuilder2.f29083b.length() == 0) {
                        cea708CueInfo = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i5));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) cueInfoBuilder2.m10980b());
                        int i6 = cueInfoBuilder2.f29092k;
                        if (i6 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            Layout.Alignment alignment2 = alignment;
                            if (cueInfoBuilder2.f29087f) {
                                f = cueInfoBuilder2.f29089h / 209.0f;
                                f2 = cueInfoBuilder2.f29088g / 74.0f;
                            } else {
                                f = cueInfoBuilder2.f29089h / 99.0f;
                                f2 = cueInfoBuilder2.f29088g / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i7 = cueInfoBuilder2.f29090i;
                            i = i7 / 3;
                            if (i != 0) {
                                i2 = i7;
                                i3 = 0;
                            } else if (i == 1) {
                                i2 = i7;
                                i3 = 1;
                            } else {
                                i2 = i7;
                                i3 = 2;
                            }
                            int i8 = i2 % 3;
                            int i9 = i8 != 0 ? 0 : i8 == 1 ? 1 : 2;
                            int i10 = cueInfoBuilder2.f29095n;
                            cea708CueInfo = new Cea708CueInfo(spannableStringBuilder, alignment2, f4, i3, f3, i9, i10 == CueInfoBuilder.f29078w, i10, cueInfoBuilder2.f29086e);
                        } else {
                            if (i6 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i6 != 2) {
                                if (i6 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + cueInfoBuilder2.f29092k);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment22 = alignment;
                            if (cueInfoBuilder2.f29087f) {
                            }
                            float f32 = (f * 0.9f) + 0.05f;
                            float f42 = (f2 * 0.9f) + 0.05f;
                            int i72 = cueInfoBuilder2.f29090i;
                            i = i72 / 3;
                            if (i != 0) {
                            }
                            int i82 = i2 % 3;
                            if (i82 != 0) {
                            }
                            int i102 = cueInfoBuilder2.f29095n;
                            cea708CueInfo = new Cea708CueInfo(spannableStringBuilder, alignment22, f42, i3, f32, i9, i102 == CueInfoBuilder.f29078w, i102, cueInfoBuilder2.f29086e);
                        }
                    }
                    if (cea708CueInfo != null) {
                        arrayList.add(cea708CueInfo);
                    }
                }
            }
        }
        Collections.sort(arrayList, Cea708CueInfo.f29069c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList3.add(((Cea708CueInfo) arrayList.get(i11)).f29070a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: m */
    public final void m10977m() {
        for (int i = 0; i < 8; i++) {
            this.f29063l[i].m10981d();
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final /* bridge */ /* synthetic */ void release() {
    }
}
