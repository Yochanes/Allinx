package androidx.media3.extractor.metadata.flac;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public class VorbisComment implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final String f28468a;

    /* JADX INFO: renamed from: b */
    public final String f28469b;

    public VorbisComment(String str, String str2) {
        this.f28468a = Ascii.toUpperCase(str);
        this.f28469b = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* JADX INFO: renamed from: b */
    public final void mo9328b(MediaMetadata.Builder builder) {
        String str;
        String str2 = this.f28468a;
        str2.getClass();
        str = this.f28469b;
        switch (str2) {
            case "TOTALTRACKS":
                Integer numTryParse = Ints.tryParse(str);
                if (numTryParse != null) {
                    builder.f25293i = numTryParse;
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numTryParse2 = Ints.tryParse(str);
                if (numTryParse2 != null) {
                    builder.f25306v = numTryParse2;
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numTryParse3 = Ints.tryParse(str);
                if (numTryParse3 != null) {
                    builder.f25292h = numTryParse3;
                    break;
                }
                break;
            case "ALBUM":
                builder.f25287c = str;
                break;
            case "GENRE":
                builder.f25307w = str;
                break;
            case "TITLE":
                builder.f25285a = str;
                break;
            case "DESCRIPTION":
                builder.f25289e = str;
                break;
            case "DISCNUMBER":
                Integer numTryParse4 = Ints.tryParse(str);
                if (numTryParse4 != null) {
                    builder.f25305u = numTryParse4;
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.f25288d = str;
                break;
            case "ARTIST":
                builder.f25286b = str;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f28468a.equals(vorbisComment.f28468a) && this.f28469b.equals(vorbisComment.f28469b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28469b.hashCode() + AbstractC0000a.m5b(527, 31, this.f28468a);
    }

    public final String toString() {
        return "VC: " + this.f28468a + "=" + this.f28469b;
    }
}
