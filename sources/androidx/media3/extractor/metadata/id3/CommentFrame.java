package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CommentFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28498b;

    /* JADX INFO: renamed from: c */
    public final String f28499c;

    /* JADX INFO: renamed from: d */
    public final String f28500d;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f28498b = str;
        this.f28499c = str2;
        this.f28500d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (Objects.equals(this.f28499c, commentFrame.f28499c) && Objects.equals(this.f28498b, commentFrame.f28498b) && Objects.equals(this.f28500d, commentFrame.f28500d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28498b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28499c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28500d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f28510a + ": language=" + this.f28498b + ", description=" + this.f28499c + ", text=" + this.f28500d;
    }
}
