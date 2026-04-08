package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TrackEncryptionBox {

    /* JADX INFO: renamed from: a */
    public final boolean f28880a;

    /* JADX INFO: renamed from: b */
    public final String f28881b;

    /* JADX INFO: renamed from: c */
    public final TrackOutput.CryptoData f28882c;

    /* JADX INFO: renamed from: d */
    public final int f28883d;

    /* JADX INFO: renamed from: e */
    public final byte[] f28884e;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrackEncryptionBox(boolean z2, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 2;
        byte b2 = 0;
        Assertions.m9460a((i == 0) ^ (bArr2 == null));
        this.f28880a = z2;
        this.f28881b = str;
        this.f28883d = i;
        this.f28884e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b2 = -1;
                    }
                    break;
                case 3046671:
                    b2 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b2 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b2 = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                    break;
                default:
                    Log.m9511g("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    break;
            }
        } else {
            i4 = 1;
        }
        this.f28882c = new TrackOutput.CryptoData(i4, bArr, i2, i3);
    }
}
