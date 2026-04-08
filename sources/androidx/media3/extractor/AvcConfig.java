package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AvcConfig {

    /* JADX INFO: renamed from: a */
    public final ArrayList f28132a;

    /* JADX INFO: renamed from: b */
    public final int f28133b;

    /* JADX INFO: renamed from: c */
    public final int f28134c;

    /* JADX INFO: renamed from: d */
    public final int f28135d;

    /* JADX INFO: renamed from: e */
    public final int f28136e;

    /* JADX INFO: renamed from: f */
    public final int f28137f;

    /* JADX INFO: renamed from: g */
    public final int f28138g;

    /* JADX INFO: renamed from: h */
    public final int f28139h;

    /* JADX INFO: renamed from: i */
    public final int f28140i;

    /* JADX INFO: renamed from: j */
    public final int f28141j;

    /* JADX INFO: renamed from: k */
    public final float f28142k;

    /* JADX INFO: renamed from: l */
    public final String f28143l;

    public AvcConfig(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f28132a = arrayList;
        this.f28133b = i;
        this.f28134c = i2;
        this.f28135d = i3;
        this.f28136e = i4;
        this.f28137f = i5;
        this.f28138g = i6;
        this.f28139h = i7;
        this.f28140i = i8;
        this.f28141j = i9;
        this.f28142k = f;
        this.f28143l = str;
    }

    /* JADX INFO: renamed from: a */
    public static AvcConfig m10771a(ParsableByteArray parsableByteArray) throws ParserException {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            parsableByteArray.m9547H(4);
            int iM9568u = (parsableByteArray.m9568u() & 3) + 1;
            if (iM9568u == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM9568u2 = parsableByteArray.m9568u() & 31;
            for (int i9 = 0; i9 < iM9568u2; i9++) {
                int iM9540A = parsableByteArray.m9540A();
                int i10 = parsableByteArray.f25645b;
                parsableByteArray.m9547H(iM9540A);
                byte[] bArr = parsableByteArray.f25644a;
                byte[] bArr2 = CodecSpecificDataUtil.f25580a;
                byte[] bArr3 = new byte[iM9540A + 4];
                System.arraycopy(CodecSpecificDataUtil.f25580a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i10, bArr3, 4, iM9540A);
                arrayList.add(bArr3);
            }
            int iM9568u3 = parsableByteArray.m9568u();
            for (int i11 = 0; i11 < iM9568u3; i11++) {
                int iM9540A2 = parsableByteArray.m9540A();
                int i12 = parsableByteArray.f25645b;
                parsableByteArray.m9547H(iM9540A2);
                byte[] bArr4 = parsableByteArray.f25644a;
                byte[] bArr5 = CodecSpecificDataUtil.f25580a;
                byte[] bArr6 = new byte[iM9540A2 + 4];
                System.arraycopy(CodecSpecificDataUtil.f25580a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i12, bArr6, 4, iM9540A2);
                arrayList.add(bArr6);
            }
            if (iM9568u2 > 0) {
                NalUnitUtil.SpsData spsDataM9652j = NalUnitUtil.m9652j((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = spsDataM9652j.f25751e;
                int i14 = spsDataM9652j.f25752f;
                int i15 = spsDataM9652j.f25754h + 8;
                int i16 = spsDataM9652j.f25755i + 8;
                int i17 = spsDataM9652j.f25762p;
                int i18 = spsDataM9652j.f25763q;
                int i19 = spsDataM9652j.f25764r;
                int i20 = spsDataM9652j.f25765s;
                float f2 = spsDataM9652j.f25753g;
                int i21 = spsDataM9652j.f25747a;
                int i22 = spsDataM9652j.f25748b;
                int i23 = spsDataM9652j.f25749c;
                byte[] bArr7 = CodecSpecificDataUtil.f25580a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new AvcConfig(arrayList, iM9568u, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.m9344a(e, "Error parsing AVC config");
        }
    }
}
