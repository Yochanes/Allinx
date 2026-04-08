package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BinaryFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final byte[] f28486b;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f28486b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f28510a.equals(binaryFrame.f28510a) && Arrays.equals(this.f28486b, binaryFrame.f28486b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28486b) + AbstractC0000a.m5b(527, 31, this.f28510a);
    }
}
