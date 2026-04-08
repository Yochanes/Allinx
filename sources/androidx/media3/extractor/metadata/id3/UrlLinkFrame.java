package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class UrlLinkFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28524b;

    /* JADX INFO: renamed from: c */
    public final String f28525c;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f28524b = str2;
        this.f28525c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.f28510a.equals(urlLinkFrame.f28510a) && Objects.equals(this.f28524b, urlLinkFrame.f28524b) && Objects.equals(this.f28525c, urlLinkFrame.f28525c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM5b = AbstractC0000a.m5b(527, 31, this.f28510a);
        String str = this.f28524b;
        int iHashCode = (iM5b + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28525c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f28510a + ": url=" + this.f28525c;
    }
}
