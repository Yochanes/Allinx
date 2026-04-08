package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PrivFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28520b;

    /* JADX INFO: renamed from: c */
    public final byte[] f28521c;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f28520b = str;
        this.f28521c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PrivFrame.class == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (Objects.equals(this.f28520b, privFrame.f28520b) && Arrays.equals(this.f28521c, privFrame.f28521c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28520b;
        return Arrays.hashCode(this.f28521c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f28510a + ": owner=" + this.f28520b;
    }
}
