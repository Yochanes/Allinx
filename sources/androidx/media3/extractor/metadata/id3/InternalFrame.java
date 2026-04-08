package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class InternalFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28512b;

    /* JADX INFO: renamed from: c */
    public final String f28513c;

    /* JADX INFO: renamed from: d */
    public final String f28514d;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f28512b = str;
        this.f28513c = str2;
        this.f28514d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && InternalFrame.class == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (Objects.equals(this.f28513c, internalFrame.f28513c) && Objects.equals(this.f28512b, internalFrame.f28512b) && Objects.equals(this.f28514d, internalFrame.f28514d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28512b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28513c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28514d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f28510a + ": domain=" + this.f28512b + ", description=" + this.f28513c;
    }
}
