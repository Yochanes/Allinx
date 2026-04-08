package androidx.media3.extractor;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MpegAudioUtil {

    /* JADX INFO: renamed from: a */
    public static final String[] f28250a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b */
    public static final int[] f28251b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f28252c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f28253d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f28254e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f28255f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f28256g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: Proguard */
    public static final class Header {

        /* JADX INFO: renamed from: a */
        public int f28257a;

        /* JADX INFO: renamed from: b */
        public String f28258b;

        /* JADX INFO: renamed from: c */
        public int f28259c;

        /* JADX INFO: renamed from: d */
        public int f28260d;

        /* JADX INFO: renamed from: e */
        public int f28261e;

        /* JADX INFO: renamed from: f */
        public int f28262f;

        /* JADX INFO: renamed from: g */
        public int f28263g;

        /* JADX INFO: renamed from: a */
        public final boolean m10816a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f28257a = i2;
            this.f28258b = MpegAudioUtil.f28250a[3 - i3];
            int i6 = MpegAudioUtil.f28251b[i5];
            this.f28260d = i6;
            if (i2 == 2) {
                this.f28260d = i6 / 2;
            } else if (i2 == 0) {
                this.f28260d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            int i8 = 1152;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i8 = 384;
                }
            } else if (i2 != 3) {
                i8 = 576;
            }
            this.f28263g = i8;
            if (i3 == 3) {
                int i9 = i2 == 3 ? MpegAudioUtil.f28252c[i4 - 1] : MpegAudioUtil.f28253d[i4 - 1];
                this.f28262f = i9;
                this.f28259c = (((i9 * 12) / this.f28260d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i10 = i3 == 2 ? MpegAudioUtil.f28254e[i4 - 1] : MpegAudioUtil.f28255f[i4 - 1];
                    this.f28262f = i10;
                    this.f28259c = ((i10 * 144) / this.f28260d) + i7;
                } else {
                    int i11 = MpegAudioUtil.f28256g[i4 - 1];
                    this.f28262f = i11;
                    this.f28259c = (((i3 == 1 ? 72 : 144) * i11) / this.f28260d) + i7;
                }
            }
            this.f28261e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10815a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f28251b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f28252c[i4 - 1] : f28253d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f28254e[i4 - 1] : f28255f[i4 - 1] : f28256g[i4 - 1];
        if (i2 == 3) {
            return AbstractC1610a.m8724b(i8, 144, i6, i7);
        }
        return AbstractC1610a.m8724b(i3 == 1 ? 72 : 144, i8, i6, i7);
    }
}
