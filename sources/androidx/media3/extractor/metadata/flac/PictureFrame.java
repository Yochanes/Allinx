package androidx.media3.extractor.metadata.flac;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PictureFrame implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final int f28460a;

    /* JADX INFO: renamed from: b */
    public final String f28461b;

    /* JADX INFO: renamed from: c */
    public final String f28462c;

    /* JADX INFO: renamed from: d */
    public final int f28463d;

    /* JADX INFO: renamed from: e */
    public final int f28464e;

    /* JADX INFO: renamed from: f */
    public final int f28465f;

    /* JADX INFO: renamed from: g */
    public final int f28466g;

    /* JADX INFO: renamed from: h */
    public final byte[] f28467h;

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f28460a = i;
        this.f28461b = str;
        this.f28462c = str2;
        this.f28463d = i2;
        this.f28464e = i3;
        this.f28465f = i4;
        this.f28466g = i5;
        this.f28467h = bArr;
    }

    /* JADX INFO: renamed from: d */
    public static PictureFrame m10846d(ParsableByteArray parsableByteArray) {
        int iM9554g = parsableByteArray.m9554g();
        String strM9342m = MimeTypes.m9342m(parsableByteArray.m9566s(parsableByteArray.m9554g(), StandardCharsets.US_ASCII));
        String strM9566s = parsableByteArray.m9566s(parsableByteArray.m9554g(), StandardCharsets.UTF_8);
        int iM9554g2 = parsableByteArray.m9554g();
        int iM9554g3 = parsableByteArray.m9554g();
        int iM9554g4 = parsableByteArray.m9554g();
        int iM9554g5 = parsableByteArray.m9554g();
        int iM9554g6 = parsableByteArray.m9554g();
        byte[] bArr = new byte[iM9554g6];
        parsableByteArray.m9552e(bArr, 0, iM9554g6);
        return new PictureFrame(iM9554g, strM9342m, strM9566s, iM9554g2, iM9554g3, iM9554g4, iM9554g5, bArr);
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* JADX INFO: renamed from: b */
    public final void mo9328b(MediaMetadata.Builder builder) {
        builder.m9324a(this.f28460a, this.f28467h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.f28460a == pictureFrame.f28460a && this.f28461b.equals(pictureFrame.f28461b) && this.f28462c.equals(pictureFrame.f28462c) && this.f28463d == pictureFrame.f28463d && this.f28464e == pictureFrame.f28464e && this.f28465f == pictureFrame.f28465f && this.f28466g == pictureFrame.f28466g && Arrays.equals(this.f28467h, pictureFrame.f28467h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28467h) + ((((((((AbstractC0000a.m5b(AbstractC0000a.m5b((527 + this.f28460a) * 31, 31, this.f28461b), 31, this.f28462c) + this.f28463d) * 31) + this.f28464e) * 31) + this.f28465f) * 31) + this.f28466g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f28461b + ", description=" + this.f28462c;
    }
}
