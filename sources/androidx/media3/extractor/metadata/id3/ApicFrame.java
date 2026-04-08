package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ApicFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28482b;

    /* JADX INFO: renamed from: c */
    public final String f28483c;

    /* JADX INFO: renamed from: d */
    public final int f28484d;

    /* JADX INFO: renamed from: e */
    public final byte[] f28485e;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f28482b = str;
        this.f28483c = str2;
        this.f28484d = i;
        this.f28485e = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* JADX INFO: renamed from: b */
    public final void mo9328b(MediaMetadata.Builder builder) {
        builder.m9324a(this.f28484d, this.f28485e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.f28484d == apicFrame.f28484d && Objects.equals(this.f28482b, apicFrame.f28482b) && Objects.equals(this.f28483c, apicFrame.f28483c) && Arrays.equals(this.f28485e, apicFrame.f28485e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f28484d) * 31;
        String str = this.f28482b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28483c;
        return Arrays.hashCode(this.f28485e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f28510a + ": mimeType=" + this.f28482b + ", description=" + this.f28483c;
    }
}
