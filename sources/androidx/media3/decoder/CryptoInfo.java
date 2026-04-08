package androidx.media3.decoder;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CryptoInfo {

    /* JADX INFO: renamed from: a */
    public byte[] f25922a;

    /* JADX INFO: renamed from: b */
    public byte[] f25923b;

    /* JADX INFO: renamed from: c */
    public int f25924c;

    /* JADX INFO: renamed from: d */
    public int[] f25925d;

    /* JADX INFO: renamed from: e */
    public int[] f25926e;

    /* JADX INFO: renamed from: f */
    public int f25927f;

    /* JADX INFO: renamed from: g */
    public int f25928g;

    /* JADX INFO: renamed from: h */
    public int f25929h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f25930i;

    /* JADX INFO: renamed from: j */
    public final PatternHolderV24 f25931j;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class PatternHolderV24 {

        /* JADX INFO: renamed from: a */
        public final MediaCodec.CryptoInfo f25932a;

        /* JADX INFO: renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f25933b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
            this.f25932a = cryptoInfo;
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f25930i = cryptoInfo;
        this.f25931j = Util.f25665a >= 24 ? new PatternHolderV24(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m9736a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f25927f = i;
        this.f25925d = iArr;
        this.f25926e = iArr2;
        this.f25923b = bArr;
        this.f25922a = bArr2;
        this.f25924c = i2;
        this.f25928g = i3;
        this.f25929h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f25930i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Util.f25665a >= 24) {
            PatternHolderV24 patternHolderV24 = this.f25931j;
            patternHolderV24.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = patternHolderV24.f25933b;
            pattern.set(i3, i4);
            patternHolderV24.f25932a.setPattern(pattern);
        }
    }
}
