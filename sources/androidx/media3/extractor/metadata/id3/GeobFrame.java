package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class GeobFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28501b;

    /* JADX INFO: renamed from: c */
    public final String f28502c;

    /* JADX INFO: renamed from: d */
    public final String f28503d;

    /* JADX INFO: renamed from: e */
    public final byte[] f28504e;

    public GeobFrame(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f28501b = str;
        this.f28502c = str2;
        this.f28503d = str3;
        this.f28504e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (Objects.equals(this.f28501b, geobFrame.f28501b) && Objects.equals(this.f28502c, geobFrame.f28502c) && Objects.equals(this.f28503d, geobFrame.f28503d) && Arrays.equals(this.f28504e, geobFrame.f28504e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28501b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28502c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28503d;
        return Arrays.hashCode(this.f28504e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f28510a + ": mimeType=" + this.f28501b + ", filename=" + this.f28502c + ", description=" + this.f28503d;
    }
}
